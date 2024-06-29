import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class12 extends class89 {

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "I")
    private int field188 = -1;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "Lda;")
    public static class275 field174 = class255.method1672(96, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "Lda;")
    public static class275 field175 = class255.method1672(117, ":");

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "Lda;")
    public static class275 field184 = class255.method1672(102, ")1");

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "Lda;")
    public static class275 field190 = class255.method1672(105, ":");

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "Lda;")
    private static class275 field187 = class255.method1672(98, "Started 3d Library");

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lda;")
    public static class275 field179 = field187;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "[I")
    public int[] field189;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)[[I")
    public int[][] method21(boolean arg0, int arg1) {
        ++field171;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (!arg0) {
            field175 = null;
        }
        if (super.field1512.field2007 && this.method53(1852089508)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = this.field182 * (~class16.field242 == ~this.field181 ? arg1 : this.field181 * arg1 / class16.field242);
            int[] var7 = var3[2];
            if (~class65.field1070 != ~this.field182) {
                for (int var8 = 0; class65.field1070 > var8; ++var8) {
                    int var9 = this.field182 * var8 / class65.field1070;
                    int var10 = this.field189[var6 + var9];
                    var7[var8] = class19.method98(var10, 255) << 4;
                    var5[var8] = class19.method98(65280, var10) >> 4;
                    var4[var8] = class19.method98(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class65.field1070 > var11; ++var11) {
                    int var12 = this.field189[var6++];
                    var7[var11] = class19.method98(var12, 255) << 4;
                    var5[var11] = class19.method98(var12 >> 4, 4080);
                    var4[var11] = class19.method98(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field176;
        if (arg0 == -20503) {
            if (~arg2 == -1) {
                this.field188 = arg1.method608(74);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static final void method50(boolean arg0) {
        class252.field4474.method987((byte) 21);
        if (!arg0) {
            field190 = null;
        }
        ++field170;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class12() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method51(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field172;
        if (arg0) {
            int var8 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg7);
            int var9 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg1);
            int var10 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4);
            int var11 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg2);
            int var12 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg5 + arg7);
            int var13 = class93.method673(class149.field2603, (byte) 45, class141.field2493, -arg5 + arg1);
            for (int var14 = var8; ~var12 < ~var14; ++var14) {
                class36.method216(class19.field280[var14], var10, arg6, -113, var11);
            }
            for (int var15 = var9; ~var15 < ~var13; --var15) {
                class36.method216(class19.field280[var15], var10, arg6, -128, var11);
            }
            int var16 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 - -arg5);
            int var17 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -arg5 + arg2);
            for (int var18 = var12; var13 >= var18; ++var18) {
                int[] var19 = class19.field280[var18];
                class36.method216(var19, var10, arg6, -122, var16);
                class36.method216(var19, var16, arg3, -124, var17);
                class36.method216(var19, var17, arg6, -126, var11);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method52(byte arg0) {
        field187 = null;
        field190 = null;
        field175 = null;
        field174 = null;
        if (arg0 == 23) {
            field184 = null;
            field179 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        ++field173;
        if (arg0 != 1852089508) {
            field179 = null;
        }
        if (this.field189 != null) {
            return true;
        } else if (this.field188 >= 0) {
            class259 var2 = class13.method64(arg0 + -1852094370, this.field188, class153.field2676);
            var2.method1693();
            this.field181 = var2.field3085;
            this.field189 = var2.field4527;
            this.field182 = var2.field3084;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIIILk;)V")
    public static final void method54(int arg0, boolean arg1, int arg2, int arg3, int arg4, class215 arg5) {
        ++field180;
        if (class17.field247 < 50) {
            if (arg5.field3680 != null && ~arg5.field3680.length < ~arg4 && arg5.field3680[arg4] != null) {
                if (arg0 == -1797326908) {
                    int var6 = arg5.field3680[arg4][0];
                    int var7 = var6 >> 8;
                    int var8 = var6 & 15;
                    int var9 = (var6 & 124) >> 4;
                    if (~arg5.field3680[arg4].length < -2) {
                        int var10 = (int) (Math.random() * (double) arg5.field3680[arg4].length);
                        if (~var10 < -1) {
                            var7 = arg5.field3680[arg4][var10];
                        }
                    }
                    if (~var8 == -1) {
                        if (arg1) {
                            class153.method1080(0, var9, var7, (byte) -124);
                        }
                    } else if (class173.field3006 != 0) {
                        class270.field4701[class17.field247] = var7;
                        class70.field1146[class17.field247] = var9;
                        class191.field3280[class17.field247] = 0;
                        int var11 = (arg3 + -64) / 128;
                        class25.field414[class17.field247] = null;
                        int var12 = (arg2 + -64) / 128;
                        class196.field3350[class17.field247] = (var11 << 16) + (var12 << 8) + var8;
                        ++class17.field247;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field185;
        super.method55(arg0);
        this.field189 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field183;
        int var7 = arg0 + arg4;
        int var8 = -arg0 + arg6;
        if (arg5 == -64) {
            int var9 = -arg0 + arg3;
            for (int var10 = arg4; var7 > var10; ++var10) {
                class36.method216(class19.field280[var10], arg1, arg2, arg5 ^ 78, arg3);
            }
            for (int var11 = arg6; var8 < var11; --var11) {
                class36.method216(class19.field280[var11], arg1, arg2, arg5 + -54, arg3);
            }
            int var12 = arg0 + arg1;
            for (int var13 = var7; ~var13 >= ~var8; ++var13) {
                int[] var14 = class19.field280[var13];
                class36.method216(var14, arg1, arg2, arg5 + -55, var12);
                class36.method216(var14, var9, arg2, -126, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)I")
    public final int method57(int arg0) {
        if (arg0 < 36) {
            this.field189 = null;
        }
        ++field177;
        return this.field188;
    }
}
