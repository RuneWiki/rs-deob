import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class73 extends class182 {

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "D")
    public static double field1330 = -1.0D;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
    public static int[] field1327 = new int[500];

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1333 = "glow1:";

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1339 = 0;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1331 = "Loading...";

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1341 = "Members object";

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1332 = "Loaded defaults";

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CI)Z", line = 7)
    public static final boolean method552(char arg0, int arg1) {
        if (arg1 != 32) {
            field1339 = 80;
        }
        field1337++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_';
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)[I", line = 21)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            field1332 = (String) null;
        }
        field1338++;
        int[] var3 = this.field3166.method775(arg1, arg0 + 123);
        if (this.field3166.field1903) {
            for (int var4 = 0; var4 < class26.field672; var4++) {
                this.method554(69, var4, arg1);
                int[] var5 = this.method1292(class300.field4887, 0, -74);
                var3[var4] = var5[class56.field1107];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZB)V", line = 53)
    public static final void method553(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1335++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (class241.field4016) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class209.field3498 - class1.field45) * var6 / 100 + class1.field45;
            if (var7 < class311.field5062) {
                var7 = class311.field5062;
            } else if (var7 > class142.field2399) {
                var7 = class142.field2399;
            }
            int var8 = arg1 * 512 * var7 / (arg0 * 334);
            if (var8 < class338.field5357) {
                short var9 = class338.field5357;
                var7 = arg0 * var9 * 334 / (arg1 * 512);
                if (class142.field2399 < var7) {
                    var7 = class142.field2399;
                    int var10 = var7 * 512 * arg1 / (var9 * 334);
                    int var11 = (arg0 - var10) / 2;
                    if (arg4) {
                        class337.method2374();
                        class337.method2378(arg3, arg2, var11, arg1, 0);
                        class337.method2378(arg3 + arg0 - var11, arg2, var11, arg1, 0);
                    }
                    arg3 += var11;
                    arg0 -= var11 * 2;
                }
            } else if (class363.field5746 < var8) {
                short var12 = class363.field5746;
                var7 = var12 * 334 * arg0 / (arg1 * 512);
                if (var7 < class311.field5062) {
                    var7 = class311.field5062;
                    int var13 = var12 * 334 * arg0 / (var7 * 512);
                    int var14 = (arg1 - var13) / 2;
                    if (arg4) {
                        class337.method2374();
                        class337.method2378(arg3, arg2, arg0, var14, 0);
                        class337.method2378(arg3, arg1 + arg2 - var14, arg0, var14, 0);
                    }
                    arg2 += var14;
                    arg1 -= var14 * 2;
                }
            }
            class177.field2929 = arg1 * var7 / 334;
        }
        class319.field5194 = (short) arg0;
        if (arg5 == -67) {
            class140.field2376 = arg2;
            class204.field3396 = arg3;
            class269.field4376 = (short) arg1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 162)
    private final void method554(int arg0, int arg1, int arg2) {
        int var4 = class21.field539[arg1];
        int var5 = 68 / ((-arg0 - 13) / 47);
        field1340++;
        int var6 = class248.field4066[arg2];
        float var7 = (float) Math.atan2((double) (var4 - 2048), (double) (var6 - 2048));
        if ((double) var7 >= -3.141592653589793D && -2.356194490192345D >= (double) var7) {
            class300.field4887 = arg2;
            class56.field1107 = arg1;
        } else if (-1.5707963267948966D >= (double) var7 && -2.356194490192345D <= (double) var7) {
            class300.field4887 = arg1;
            class56.field1107 = arg2;
        } else if (-0.7853981633974483D >= (double) var7 && (double) var7 >= -1.5707963267948966D) {
            class56.field1107 = class26.field672 - arg2;
            class300.field4887 = arg1;
        } else if (var7 <= 0.0F && -0.7853981633974483D <= (double) var7) {
            class300.field4887 = class334.field5323 - arg2;
            class56.field1107 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class56.field1107 = class26.field672 - arg1;
            class300.field4887 = class334.field5323 - arg2;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class56.field1107 = class26.field672 - arg2;
            class300.field4887 = class334.field5323 - arg1;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class56.field1107 = arg2;
            class300.field4887 = class334.field5323 - arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class56.field1107 = class26.field672 - arg1;
            class300.field4887 = arg2;
        }
        class300.field4887 &= class194.field3266;
        class56.field1107 &= class53.field1056;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Loe;IB)V", line = 238)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        field1328++;
        if (arg2 != 60) {
            this.method125(37, -20);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V", line = 259)
    public static final void method555(byte arg0) {
        for (class355 var1 = (class355) class34.field758.method2345((byte) 71); var1 != null; var1 = (class355) class34.field758.method2336(-92)) {
            int var2 = var1.field5657;
            if (class267.method1874(var2, (byte) 12)) {
                boolean var3 = true;
                class181[] var4 = class178.field2938[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3058;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1291;
                    class181 var7 = class224.method1564(-108, var6);
                    if (var7 != null) {
                        class52.method459(128, var7);
                    }
                }
            }
        }
        if (arg0 > -103) {
            method553(19, -102, -5, 112, true, (byte) -122);
        }
        field1334++;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 313)
    public static void method556(int arg0) {
        field1327 = null;
        field1331 = null;
        if (arg0 == 8099) {
            field1333 = null;
            field1332 = null;
            field1341 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[[I", line = 330)
    public final int[][] method122(int arg0, int arg1) {
        if (arg1 != 4944) {
            this.method554(21, 46, 79);
        }
        int[][] var3 = this.field3152.method1953(arg0, arg1 ^ 0x1332);
        if (this.field3152.field4493) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class26.field672; var7++) {
                this.method554(arg1 - 5036, var7, arg0);
                int[][] var8 = this.method1291(class300.field4887, (byte) 41, 0);
                var4[var7] = var8[0][class56.field1107];
                var5[var7] = var8[1][class56.field1107];
                var6[var7] = var8[2][class56.field1107];
            }
        }
        field1336++;
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 371)
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CBILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 379)
    public static final StringBuffer method557(char arg0, byte arg1, int arg2, StringBuffer arg3) {
        field1342++;
        int var4 = arg3.length();
        arg3.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg3.setCharAt(var5, arg0);
        }
        return arg1 == -4 ? arg3 : (StringBuffer) null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIILml;IJIIII)Z", line = 398)
    public static final boolean method558(int arg0, int arg1, int arg2, int arg3, class152 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class251.method1769(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
