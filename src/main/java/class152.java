import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class152 extends class262 {

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "Z")
    private boolean field2589 = true;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field2586 = 4096;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "Lok;")
    public static class146 field2582 = class235.method1724(-12908, ")2");

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "Lok;")
    public static class146 field2584 = class235.method1724(-12908, "::mm");

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field2585 = -1;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I", line = 13)
    public final int[][] method87(int arg0, int arg1) {
        field2580++;
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (arg0 != 7) {
            this.method40((class47) null, 106, 7);
        }
        if (this.field4347.field1202) {
            int[] var4 = this.method1895(arg0, 0, arg1 - 1 & class259.field4297);
            int[] var5 = this.method1895(7, 0, arg1);
            int[] var6 = this.method1895(7, 0, class259.field4297 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class98.field1598; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2586;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (var5[var10 + 1 & class218.field3595] - var5[var10 - 1 & class218.field3595]) * this.field2586;
                int var15 = var14 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var13 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var14 / var17;
                }
                if (this.field2589) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V", line = 97)
    public static final void method1201(int arg0) {
        while (true) {
            if (client.field4080.method1650(4, class46.field781) >= 11) {
                int var1 = client.field4080.method1659(11, false);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class75.field1215[var1] == null) {
                        class75.field1215[var1] = new class234();
                        if (class140.field2339[var1] != null) {
                            class75.field1215[var1].method1716(class140.field2339[var1], -10605);
                        }
                        var2 = true;
                    }
                    class112.field1791[class158.field2670++] = var1;
                    class234 var3 = class75.field1215[var1];
                    var3.field5440 = class203.field3385;
                    int var4 = client.field4080.method1659(5, false);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = client.field4080.method1659(1, false);
                    int var6 = class303.field5197[client.field4080.method1659(3, false)];
                    if (var2) {
                        var3.field5421 = var3.field5406 = var6;
                    }
                    int var7 = client.field4080.method1659(1, false);
                    if (var7 == 1) {
                        class228.field3809[class182.field3045++] = var1;
                    }
                    int var8 = client.field4080.method1659(5, false);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1718(class102.field1639.field5419[0] + var8, 100, class102.field1639.field5432[0] + var4, var5 == 1);
                    continue;
                }
            }
            client.field4080.method1655(false);
            if (arg0 != -14850) {
                method1204((class15) null, false);
            }
            field2590++;
            return;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(III)V", line = 162)
    public static final void method1202(int arg0, int arg1, int arg2) {
        if (class27.field479 != 0 && arg1 != -1) {
            class212.method1588(class144.field2406, 0, class27.field479, true, false, arg1);
            class85.field1357 = true;
        }
        if (arg0 != 10429) {
            method1204((class15) null, false);
        }
        field2587++;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 186)
    public class152() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V", line = 207)
    public static void method1203(int arg0) {
        field2582 = null;
        if (arg0 != 32) {
            field2584 = (class146) null;
        }
        field2584 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lwe;II)V", line = 223)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            this.method87(-94, -91);
        }
        field2588++;
        if (arg2 == 0) {
            this.field2586 = arg0.method379(arg1 ^ 0xFFFFF7FE);
        } else if (arg2 == 1) {
            this.field2589 = arg0.method368(113) == 1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Loh;Z)Z", line = 261)
    public static final boolean method1204(class15 arg0, boolean arg1) {
        field2581++;
        if (!arg1) {
            method1204((class15) null, true);
        }
        return arg0.method117(-32236, class211.field3486);
    }
}
