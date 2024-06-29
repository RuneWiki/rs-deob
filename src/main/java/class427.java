import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class427 extends class35 implements class21 {

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "Z")
    private boolean field6015;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "S")
    private short field6000;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "B")
    private byte field5995;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "Z")
    private boolean field6010;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "B")
    private byte field6014;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "Z")
    private boolean field6020;

    @OriginalMember(owner = "client!nu", name = "V", descriptor = "Z")
    private boolean field6025;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "Le;")
    private class377 field6001;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "Li;")
    private class31 field6013;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "Leh;")
    public static class246 field6017 = new class246(48, 3);

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "Ljava/lang/String;")
    public static String field6018 = "";

    @OriginalMember(owner = "client!nu", name = "U", descriptor = "Z")
    public static boolean field6024 = false;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "[I")
    public static int[] field6022 = new int[2];

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "Leh;")
    public static class246 field6023 = new class246(12, -1);

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!nu", name = "W", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "[I")
    public static int[] field6009;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLza;IZ)Lqr;", line = 3)
    private final class48 method2527(boolean arg0, class290 arg1, int arg2, boolean arg3) {
        ++field6005;
        class270 var5 = class377.field5338.method1901(50, 65535 & this.field6000);
        if (!arg0) {
            return null;
        } else {
            class38 var6;
            class38 var7;
            if (this.field6010) {
                var6 = class60.field743[this.field5995];
                var7 = class68.field858[0];
            } else {
                if (this.field5995 < 3) {
                    var7 = class68.field858[this.field5995 + 1];
                } else {
                    var7 = null;
                }
                var6 = class68.field858[this.field5995];
            }
            return var5.method1697(arg1, 22, arg2, this.field6014, super.field389, super.field387, (byte) 122, arg3, var6, super.field390, var7);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lza;I)V", line = 36)
    public final void method130(class290 arg0, int arg1) {
        if (arg1 != 0) {
            this.field6000 = 77;
        }
        ++field6007;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lza;Lfu;IIIIZIZ)V", line = 55)
    public class427(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3962, arg1.field4000, arg1.field3953);
        this.field6015 = arg8;
        this.field6000 = (short) arg1.field3952;
        this.field5995 = (byte) arg2;
        this.field6010 = arg6;
        super.field389 = arg5;
        this.field6014 = (byte) arg7;
        super.field387 = arg3;
        this.field6020 = ~arg1.field3957 != -1 && !arg6;
        this.field6025 = arg0.method339() && arg1.field3975 && !this.field6010 && ~class4.field81.method726(class405.field5737, 122) != -1;
        int var10 = 2048;
        if (this.field6015) {
            var10 |= 65536;
        }
        class48 var11 = this.method2527(true, arg0, var10, this.field6025);
        if (var11 != null) {
            this.field6001 = var11.field555;
            this.field6013 = var11.field556;
            if (this.field6015) {
                this.field6001 = this.field6001.method1590((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(Lza;B)Lkf;", line = 92)
    public final class170 method126(class290 arg0, byte arg1) {
        if (arg1 > -86) {
            this.field6025 = true;
        }
        ++field6002;
        if (this.field6001 == null) {
            return null;
        } else {
            class125 var3 = arg0.method368();
            var3.method825(super.field387, super.field390, super.field389);
            class170 var4 = null;
            if (this.field6020) {
                var4 = class423.method2509(0, 1);
            }
            this.field6001.method1566(var3, var4 == null ? null : var4.field2475[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V", line = 122)
    public final void method115(int arg0) {
        if (this.field6001 != null) {
            this.field6001.method1587();
        }
        if (arg0 != 16372) {
            this.field5995 = 34;
        }
        ++field6006;
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V", line = 136)
    public static final void method2528(int arg0) {
        class497.method2888(-15530);
        if (arg0 != 63) {
            method2529(4);
        }
        ++field5996;
    }

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "(I)V", line = 149)
    public static void method2529(int arg0) {
        field6017 = null;
        field6009 = null;
        if (arg0 <= 101) {
            method2530(125, -123, 22, -98);
        }
        field6022 = null;
        field6018 = null;
        field6023 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILza;I)Z", line = 163)
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field6008;
        if (arg0 != 3) {
            this.field6025 = false;
        }
        class377 var5 = this.method2531(0, arg2, 131072);
        if (var5 != null) {
            class125 var6 = arg2.method368();
            var6.method825(super.field387, super.field390, super.field389);
            return var5.method1586(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V", line = 185)
    public final void method120(int arg0) {
        this.field6015 = false;
        ++field6021;
        if (arg0 != 0) {
            field6018 = null;
        }
        if (this.field6001 != null) {
            this.field6001.method1606(-65537 & this.field6001.method1605());
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILza;I)Le;", line = 199)
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            this.field6025 = false;
        }
        ++field6003;
        return this.method2531(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)Z", line = 210)
    public final boolean method118(byte arg0) {
        ++field5997;
        if (arg0 != 102) {
            this.field6020 = true;
        }
        return this.field6015;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I", line = 222)
    public final int method112(int arg0) {
        ++field6004;
        int var2 = -18 % ((arg0 - -5) / 55);
        return 22;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILza;)V", line = 234)
    public final void method111(int arg0, class290 arg1) {
        ++field6016;
        Object var3 = null;
        if (arg0 != -38) {
            this.field6020 = false;
        }
        class31 var5;
        if (this.field6013 == null && this.field6025) {
            class48 var4 = this.method2527(true, arg1, 262144, true);
            var5 = var4 == null ? null : var4.field556;
        } else {
            var5 = this.field6013;
            this.field6013 = null;
        }
        if (var5 != null) {
            class264.method1680(var5, this.field5995, super.field387, super.field389, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIII)V", line = 264)
    public static final void method2530(int arg0, int arg1, int arg2, int arg3) {
        ++field5994;
        String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (63 & arg1) + "," + (arg0 & arg2);
        System.out.println(var4);
        class521.method3081(true, (byte) -16, var4, false);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILza;I)Le;", line = 275)
    private final class377 method2531(int arg0, class290 arg1, int arg2) {
        ++field6019;
        if (this.field6001 != null && arg1.method324(this.field6001.method1605(), arg2) == 0) {
            return this.field6001;
        } else {
            if (arg0 != 0) {
                this.field6014 = -116;
            }
            class48 var4 = this.method2527(true, arg1, arg2, false);
            return var4 != null ? var4.field555 : null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I", line = 295)
    public final int method110(byte arg0) {
        ++field6012;
        if (arg0 < 100) {
            this.field6025 = false;
        }
        return 65535 & this.field6000;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Z", line = 309)
    public final boolean method113(int arg0) {
        if (arg0 != 31692) {
            this.method114(121);
        }
        ++field6026;
        return this.field6025;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILza;ILge;IZI)V", line = 321)
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 instanceof class427) {
            class427 var8 = (class427) arg3;
            if (this.field6001 != null && var8.field6001 != null) {
                this.field6001.method1562(var8.field6001, arg4, arg2, arg6, arg5);
            }
        }
        if (arg0 > -71) {
            this.field6020 = false;
        }
        ++field5998;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lza;B)V", line = 358)
    public final void method117(class290 arg0, byte arg1) {
        ++field5999;
        Object var3 = null;
        if (arg1 != -38) {
            this.method117((class290) null, (byte) -47);
        }
        class31 var5;
        if (this.field6013 == null && this.field6025) {
            class48 var4 = this.method2527(true, arg0, 262144, true);
            var5 = var4 != null ? var4.field556 : null;
        } else {
            var5 = this.field6013;
            this.field6013 = null;
        }
        if (var5 != null) {
            class265.method1681(var5, this.field5995, super.field387, super.field389, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)I", line = 388)
    public final int method114(int arg0) {
        if (arg0 != -9772) {
            field6024 = false;
        }
        ++field6011;
        return this.field6014;
    }
}
