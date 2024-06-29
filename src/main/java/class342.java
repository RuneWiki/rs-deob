import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class342 extends class115 {

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    private int field5028 = 4096;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Z")
    private boolean field5031 = true;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field5027 = -1;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2191(String arg0, int arg1) {
        ++field5036;
        if (arg1 < 61) {
            method2191((String) null, -42);
        }
        String var2 = class362.method2305(0, class190.method1215(-1, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field5031 = ~arg1.method1342((byte) -126) == -2;
            }
        } else {
            this.field5028 = arg1.method1355(32136);
        }
        if (arg0 >= 83) {
            ++field5035;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLra;Lra;Z)V")
    public static final void method2192(boolean arg0, class57 arg1, class57 arg2, boolean arg3) {
        class303.field4332 = arg2;
        class87.field976 = arg1;
        ++field5034;
        class150.field2111 = arg3;
        if (arg0) {
            method2195(-30);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[[I")
    public final int[][] method144(int arg0, int arg1) {
        ++field5032;
        int var3 = -12 / ((-80 - arg1) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 93);
        if (super.field1342.field5819) {
            int[] var5 = this.method631(true, 0, class315.field4488 & arg0 - 1);
            int[] var6 = this.method631(true, 0, arg0);
            int[] var7 = this.method631(true, 0, arg0 + 1 & class315.field4488);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class218.field2979; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field5028;
                int var13 = (var6[class92.field1013 & var11 + 1] + -var6[var11 + -1 & class92.field1013]) * this.field5028;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 + 4096 + var16) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var13 / var18;
                    var21 = var12 / var18;
                } else {
                    var21 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field5031) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                }
                var8[var11] = var20;
                var9[var11] = var21;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILdh;ZILdh;)I")
    public static final int method2193(int arg0, class175 arg1, boolean arg2, int arg3, class175 arg4) {
        ++field5026;
        if (~arg0 == -2) {
            int var5 = arg4.field775;
            int var6 = arg1.field775;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg0 == -3) {
            return class179.method1173(125, class297.field4234, arg4.method1156(-1).field1973, arg1.method1156(-1).field1973);
        } else if (~arg0 == -4) {
            if (!arg4.field2433.equals("-")) {
                if (arg1.field2433.equals("-")) {
                    return arg2 ? 1 : -1;
                } else {
                    return class179.method1173(-72, class297.field4234, arg4.field2433, arg1.field2433);
                }
            } else if (arg1.field2433.equals("-")) {
                return 0;
            } else {
                return arg2 ? -1 : 1;
            }
        } else if (~arg0 == -5) {
            if (!arg4.method401(-1)) {
                return arg1.method401(-1) ? -1 : 0;
            } else {
                return !arg1.method401(-1) ? 1 : 0;
            }
        } else if (~arg0 == -6) {
            if (arg4.method404(-1)) {
                return arg1.method404(-1) ? 0 : 1;
            } else {
                return arg1.method404(-1) ? -1 : 0;
            }
        } else if (~arg0 == -7) {
            if (arg4.method405((byte) -128)) {
                return arg1.method405((byte) -128) ? 0 : 1;
            } else {
                return arg1.method405((byte) -128) ? -1 : 0;
            }
        } else if (~arg0 == -8) {
            if (!arg4.method402(0)) {
                return arg1.method402(0) ? -1 : 0;
            } else {
                return !arg1.method402(0) ? 1 : 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg4.field2439;
            int var8 = arg1.field2439;
            if (arg2) {
                if (~var8 == -1001) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (~var7 == 0) {
                    var7 = 1000;
                }
            }
            return -var8 + var7;
        } else {
            if (arg3 != 7976) {
                field5027 = 114;
            }
            return -arg1.field2431 + arg4.field2431;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Loo;")
    public static final class373 method2194(int arg0, byte arg1) {
        ++field5030;
        class373 var2 = (class373) class388.field5690.method2049(-123, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class420.field6039.method361(31, 120, arg0);
            int var4 = -40 / ((arg1 - 63) / 58);
            class373 var5 = new class373();
            if (var3 != null) {
                var5.method2340(60, new class211(var3), arg0);
            }
            class388.field5690.method2046((long) arg0, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class342() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "(I)V")
    public static final void method2195(int arg0) {
        ++field5029;
        if (arg0 == 0) {
            class26.field254.method2043(arg0 + -53);
        }
    }
}
