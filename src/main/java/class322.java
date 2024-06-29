import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class322 extends class172 {

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "B")
    private byte field4550;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "B")
    private byte field4551;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "B")
    private byte field4552;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "B")
    private byte field4553;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "Z")
    private boolean field4559;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 != 71) {
            return;
        }
        arg1.field542 = this.field4552;
        arg1.field555 = this.field4559;
        field4555++;
        arg1.field535 = this.field4550;
        arg1.field559 = this.field4553;
        arg1.field571 = this.field4551;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    public static final void method2042(int arg0, int arg1) {
        class113 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class418 var4 = class95.field1115[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class704.field9799; var5++) {
                    for (int var6 = 0; var6 < class414.field5796; var6++) {
                        var2 = var4.method1367(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class732.field10110;
                            int var8 = var5 << class732.field10110;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class418 var10 = class95.field1115[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2525(var6, var5, (byte) 114) - var10.method2525(var6, var5, (byte) 114);
                                    int var12 = var4.method2525(var6 + 1, var5, (byte) 114) - var10.method2525(var6 + 1, var5, (byte) 114);
                                    int var13 = var4.method2525(var6 + 1, var5 + 1, (byte) 114) - var10.method2525(var6 + 1, var5 + 1, (byte) 114);
                                    int var14 = var4.method2525(var6, var5 + 1, (byte) 114) - var10.method2525(var6, var5 + 1, (byte) 114);
                                    var10.method1370(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        field4557++;
        this.field4559 = arg1.method3013(61) == 1;
        this.field4553 = arg1.method3030(-25984);
        if (arg0 == 2048) {
            this.field4551 = arg1.method3030(arg0 - 28032);
            this.field4552 = arg1.method3030(-25984);
            this.field4550 = arg1.method3030(arg0 ^ 0xFFFF9280);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
    public static final void method2043(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (class533.field7338.length > var1) {
            for (int var2 = 0; var2 < class533.field7338[0].length; var2++) {
                for (int var3 = 0; var3 < class533.field7338[0][0].length; var3++) {
                    class533.field7338[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field4556++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2044(int arg0, int arg1, int arg2, int arg3) {
        field4558++;
        if (!class623.field8736 || !class19.field125) {
            return false;
        } else if (class380.field5448 < 100) {
            return false;
        } else {
            int var4 = class665.field9352[arg2][arg0][arg1];
            if (-class433.field6016 == var4) {
                return false;
            } else if (class433.field6016 == var4) {
                return true;
            } else if (class661.field9303 == class594.field8355) {
                return false;
            } else {
                int var5 = arg0 << class732.field10110;
                int var6 = arg1 << class732.field10110;
                if (class351.method2215(var6 + 1, -62, var5 + 1, var5 + 1, class661.field9303[arg2].method2525(arg0, arg1, (byte) 114), class179.field2263 + var5 - 1, class661.field9303[arg2].method2525(arg0 + 1, arg1 - -1, (byte) 114), class661.field9303[arg2].method2525(arg0, arg1 + arg3, (byte) 114), class179.field2263 + var6 - 1, var6 - -class179.field2263 + -1) && class351.method2215(var6 + 1, arg3 + 98, var5 + 1, var5 - 1 + class179.field2263, class661.field9303[arg2].method2525(arg0, arg1, (byte) 114), class179.field2263 + var5 - 1, class661.field9303[arg2].method2525(arg0 + 1, arg1, (byte) 114), class661.field9303[arg2].method2525(arg0 + 1, arg1 + 1, (byte) 114), class179.field2263 + var6 - 1, var6 + 1)) {
                    class109.field1316++;
                    class665.field9352[arg2][arg0][arg1] = class433.field6016;
                    return true;
                } else {
                    class665.field9352[arg2][arg0][arg1] = -class433.field6016;
                    return false;
                }
            }
        }
    }
}
