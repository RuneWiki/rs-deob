import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class218 extends class115 {

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    private int field2984 = 4096;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    private int field2980 = 4096;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    private int field2985 = 4096;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2981 = "shake:";

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field2989 = 2;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Len;")
    public static class174 field2991;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field2993;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1431(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILen;BLnl;I)V", line = 4)
    public static final void method1427(int arg0, int arg1, class174 arg2, byte arg3, class327 arg4, int arg5) {
        if (arg3 <= 89) {
            field2987 = 104;
        }
        ++field2983;
        class97 var6 = class334.method2153(100, arg4.field4620);
        if (~var6.field1082 != 0) {
            int var7;
            if (!arg4.field4614) {
                var7 = 0;
            } else {
                int var8 = arg4.field4616 + arg1;
                var7 = var8 & 3;
            }
            class11 var9 = var6.method520(var7, (byte) -119, arg4.field4653, arg2);
            if (var9 != null) {
                int var10 = arg4.field4615;
                int var11 = arg4.field4680;
                if (~(var7 & 1) == -2) {
                    var10 = arg4.field4680;
                    var11 = arg4.field4615;
                }
                int var12 = var9.method52();
                int var13 = var9.method47();
                if (var6.field1089) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (~var6.field1085 == -1) {
                    var9.method93(arg0, arg5 - (var11 * 4 + -4), var12, var13);
                } else {
                    var9.method46(arg0, -(var11 * 4) - (-4 - arg5), var12, var13, 1, -16777216 | var6.field1085, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)Ldh;", line = 68)
    public static final class175 method1428(int arg0) {
        if (arg0 > -123) {
            return null;
        } else {
            ++field2986;
            return class113.field1303 < class426.field6192.length ? class426.field6192[class113.field1303++] : null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V", line = 86)
    public static final void method1429(int arg0) {
        ++field2982;
        if (arg0 != 1) {
            method1430(2);
        }
        while (true) {
            class418 var1;
            class433 var3;
            do {
                do {
                    var1 = (class418) class364.field5292.method1112(-1);
                    if (var1 == null) {
                        return;
                    }
                } while (class19.field202 == null);
                if (~var1.field6001 > -1) {
                    int var2 = -var1.field6001 - 1;
                    if (~class188.field2547 == ~var2) {
                        var3 = class390.field5715;
                    } else {
                        var3 = class375.field5473[var2];
                    }
                } else {
                    int var4 = var1.field6001 + -1;
                    var3 = class81.field917[var4];
                }
            } while (var3 == null);
            class327 var5 = class157.method1036(0, var1.field6003);
            int var6;
            int var7;
            if (~var1.field5998 != -2 && ~var1.field5998 != -4) {
                var6 = var5.field4680;
                var7 = var5.field4615;
            } else {
                var7 = var5.field4680;
                var6 = var5.field4615;
            }
            int var8 = var1.field5997 - -(var7 >> 1);
            int var9 = (var7 + 1 >> 1) + var1.field5997;
            int var10 = var1.field5999 - -(var6 >> 1);
            int var11 = var1.field5999 - -(var6 + 1 >> 1);
            class319 var12 = class132.field1814[var3.field1308];
            int var13 = var12.method1990(var8, var10) - (-var12.method1990(var9, var10) + -var12.method1990(var8, var11) + -var12.method1990(var9, var11)) >> 2;
            class265 var14 = null;
            int var15 = class98.field1108[var1.field6005];
            if (~var15 != -1) {
                if (var15 == 1) {
                    var14 = (class265) class338.method2176(var3.field1308, var1.field5997, var1.field5999);
                } else if (var15 == 2) {
                    var14 = (class265) class310.method1944(var3.field1308, var1.field5997, var1.field5999, field2993 != null ? field2993 : (field2993 = method1431("sl")));
                } else if (var15 == 3) {
                    var14 = (class265) class122.method689(var3.field1308, var1.field5997, var1.field5999);
                }
            } else {
                var14 = (class265) class204.method1300(var3.field1308, var1.field5997, var1.field5999);
            }
            if (var14 != null) {
                class448.method2778(var1.field5997, var3.field1308, -1, false, 0, var1.field5999, var15, var1.field6000 - -1, var1.field6012, 0);
                var3.field6346 = class221.field3033 + var1.field6012;
                var3.field6341 = class221.field3033 + var1.field6000;
                var3.field6357 = var1.field5997 * 128 + var7 * 64;
                var3.field6354 = var13;
                var3.field6343 = var14;
                var3.field6356 = var1.field5999 * 128 - -(var6 * 64);
                int var16 = var1.field5996;
                int var17 = var1.field6002;
                int var18 = var1.field6007;
                int var19 = var1.field6004;
                if (~var16 < ~var17) {
                    int var20 = var16;
                    var16 = var17;
                    var17 = var20;
                }
                var3.field6355 = var1.field5997 + var17;
                var3.field6347 = var1.field5997 + var16;
                if (~var19 > ~var18) {
                    int var21 = var18;
                    var18 = var19;
                    var19 = var21;
                }
                var3.field6338 = var1.field5999 + var18;
                var3.field6342 = var1.field5999 - -var19;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 216)
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "(I)V", line = 228)
    public static void method1430(int arg0) {
        field2991 = null;
        field2981 = null;
        if (arg0 != -1) {
            method1427(-28, -103, (class174) null, (byte) -128, (class327) null, -72);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[[I", line = 240)
    public final int[][] method144(int arg0, int arg1) {
        ++field2992;
        int var3 = -120 % ((-80 - arg1) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 96);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < field2979; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (var13 == var14 && var14 == var15) {
                    var9[var12] = this.field2980 * var13 >> 12;
                    var10[var12] = this.field2984 * var14 >> 12;
                    var11[var12] = this.field2985 * var15 >> 12;
                } else {
                    var9[var12] = this.field2980;
                    var10[var12] = this.field2984;
                    var11[var12] = this.field2985;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLbk;I)V", line = 317)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 < 83) {
            this.method144(87, -44);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2985 = arg1.method1355(32136);
                }
            } else {
                this.field2984 = arg1.method1355(32136);
            }
        } else {
            this.field2980 = arg1.method1355(32136);
        }
        ++field2988;
    }
}
