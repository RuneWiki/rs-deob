import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class109 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    private int[] field1605;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1610 = null;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
    public static int[] field1608 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[B")
    public static byte[] field1609 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1606 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lqj;")
    public static class296 field1612;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field1614;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)I")
    public final int method732(int arg0, boolean arg1) {
        if (arg1) {
            field1609 = null;
        }
        field1604++;
        int var3 = (this.field1605.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field1605[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1605[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([I)V")
    public class109(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1605 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1605[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1605[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1605[var5 + var5] = arg0[var4];
            this.field1605[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method733(int arg0) {
        int var1 = 112 % ((arg0 - 13) / 36);
        field1610 = null;
        field1609 = null;
        field1606 = null;
        field1612 = null;
        field1608 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static final void method734(byte arg0) {
        while (true) {
            class182 var1 = (class182) class66.field1035.method1314((byte) -119);
            if (var1 == null) {
                if (arg0 <= 58) {
                    field1608 = null;
                }
                field1611++;
                return;
            }
            if (class5.field79 != null) {
                class61 var3;
                if (var1.field2561 < 0) {
                    int var2 = -var1.field2561 - 1;
                    if (class414.field6012 == var2) {
                        var3 = class307.field4211;
                    } else {
                        var3 = class12.field153[var2];
                    }
                } else {
                    int var4 = var1.field2561 - 1;
                    var3 = class445.field6422[var4];
                }
                if (var3 != null) {
                    class369 var5 = class310.method1961(var1.field2549, (byte) 35);
                    int var6;
                    int var7;
                    if (var1.field2560 == 1 || var1.field2560 == 3) {
                        var6 = var5.field5215;
                        var7 = var5.field5200;
                    } else {
                        var6 = var5.field5200;
                        var7 = var5.field5215;
                    }
                    int var8 = (var7 >> 1) + var1.field2556;
                    int var9 = (var7 + 1 >> 1) + var1.field2556;
                    int var10 = (var6 >> 1) + var1.field2542;
                    int var11 = var1.field2542 + (var6 + 1 >> 1);
                    class156 var12 = class249.field3456[var3.field6198];
                    int var13 = var12.method275(var8, var10) + var12.method275(var9, var10) + (var12.method275(var8, var11) - -var12.method275(var9, var11)) >> 2;
                    class161 var14 = null;
                    int var15 = class135.field1925[var1.field2550];
                    if (var15 == 0) {
                        var14 = (class161) class57.method381(var3.field6198, var1.field2556, var1.field2542);
                    } else if (var15 == 1) {
                        var14 = (class161) class3.method13(var3.field6198, var1.field2556, var1.field2542);
                    } else if (var15 == 2) {
                        var14 = (class161) class32.method245(var3.field6198, var1.field2556, var1.field2542, field1614 == null ? (field1614 = method735("tr")) : field1614);
                    } else if (var15 == 3) {
                        var14 = (class161) class207.method1350(var3.field6198, var1.field2556, var1.field2542);
                    }
                    if (var14 != null) {
                        class439.method2756(false, -1, 0, var1.field2542, var15, var1.field2556, var3.field6198, var1.field2552, var1.field2559 + 1, 0);
                        var3.field951 = var1.field2542 * 128 + (var6 * 64);
                        var3.field950 = var1.field2556 * 128 + (var7 * 64);
                        var3.field953 = var14;
                        var3.field945 = class35.field541 + var1.field2552;
                        var3.field957 = var13;
                        var3.field943 = class35.field541 + var1.field2559;
                        int var16 = var1.field2553;
                        int var17 = var1.field2544;
                        int var18 = var1.field2554;
                        if (var17 < var16) {
                            int var19 = var16;
                            var16 = var17;
                            var17 = var19;
                        }
                        int var20 = var1.field2545;
                        if (var20 < var18) {
                            int var21 = var18;
                            var18 = var20;
                            var20 = var21;
                        }
                        var3.field954 = var1.field2556 + var17;
                        var3.field949 = var1.field2556 + var16;
                        var3.field958 = var1.field2542 + var18;
                        var3.field952 = var1.field2542 + var20;
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method735(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
