import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class441 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field6260 = -1;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field6268 = -1;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public static int[] field6263 = new int[2048];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "[Ljs;")
    public static class178[] field6266 = new class178[29];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
    public static int[] field6265 = new int[2048];

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    public static int[] field6270 = new int[14];

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
    public int[] field6269;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkk;BI)V")
    private final void method2680(class161 arg0, byte arg1, int arg2) {
        if (arg1 > -81) {
            field6265 = null;
        }
        field6262++;
        if (arg2 == 1) {
            this.field6260 = arg0.method1134(-16848);
        } else if (arg2 == 2) {
            this.field6269 = new int[arg0.method1172((byte) 25)];
            for (int var4 = 0; var4 < this.field6269.length; var4++) {
                this.field6269[var4] = arg0.method1134(-16848);
            }
        } else if (arg2 == 3) {
            this.field6268 = arg0.method1172((byte) 101);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)C")
    public static final char method2681(int arg0, byte arg1) {
        if (arg0 != 16) {
            method2682(3, (class454) null, (byte[][]) null);
        }
        field6261++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class130.field1784[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILpg;[[B)V")
    public static final void method2682(int arg0, class454 arg1, byte[][] arg2) {
        field6264++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg0 != 8) {
            method2681(30, (byte) 6);
        }
        for (int var4 = 0; var4 < arg1.field4474; var4++) {
            class208.method1423((byte) -117);
            for (int var5 = 0; var5 < (class36.field388 >> 3); var5++) {
                for (int var6 = 0; var6 < class68.field998 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class4.field32[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1.field4478 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFFCE9) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class486.field6887.length; var14++) {
                                if (class486.field6887[var14] == var13 && arg2[var14] != null) {
                                    class161 var15 = new class161(arg2[var14]);
                                    arg1.method2014(class300.field4249, var5 * 8, var10, var6 * 8, var4, var9, var11, (byte) 44, var12, var15);
                                    var7 = true;
                                    arg1.method2737(var11, var6 * 8, class374.field5152, var15, var5 * 8, var4, var10, var9, var12, arg0 - 9, var3[0] == -1 ? var3 : null);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg1.method2011(8, -78, var6 * 8, 8, var5 * 8, var4);
                    }
                }
            }
        }
        if (var3[0] == -1) {
            class323.field4519 = null;
        } else {
            class323.field4519 = class97.field1377.method702(var3[3], var3[1], var3[0], var3[2], 0, class39.field534);
            class96.field1355 = var3[4];
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method2683(int arg0) {
        field6263 = null;
        field6265 = null;
        field6270 = null;
        if (arg0 == 0) {
            field6266 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkk;Z)V")
    public final void method2684(class161 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1172((byte) -14);
            if (var3 == 0) {
                if (arg1) {
                    method2681(123, (byte) 99);
                }
                field6267++;
                return;
            }
            this.method2680(arg0, (byte) -102, var3);
        }
    }
}
