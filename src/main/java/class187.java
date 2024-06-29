import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class187 extends class51 {

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field3141 = -1;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "Z")
    public static boolean field3153 = false;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "[I")
    public static int[] field3152 = new int[256];

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "Lhc;")
    public static class56 field3154;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "Loe;")
    private class79 field3148;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)I", line = 29)
    public final int method1287(int arg0, int arg1, int arg2) {
        field3140++;
        if (this.field3148 == null) {
            return arg2;
        }
        class259 var4 = (class259) this.field3148.method507((long) arg0, 602425312);
        if (arg1 != 18311) {
            field3153 = false;
        }
        return var4 == null ? arg2 : var4.field4431;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLbc;)V", line = 49)
    public final void method1288(boolean arg0, class153 arg1) {
        field3146++;
        while (true) {
            int var3 = arg1.method1082(-89);
            if (var3 == 0) {
                if (!arg0) {
                    this.method1287(-62, 85, -64);
                }
                return;
            }
            this.method1292(var3, -105, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)Lib;", line = 71)
    public static final class64 method1289(int arg0, byte arg1) {
        field3150++;
        class64 var2 = (class64) class166.field2899.method2175((long) arg0, 3008);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class217.field3774.method1577(class192.method1338((byte) -91, arg0), class294.method2022(arg0, 255), -29569);
        int var4 = 59 % ((arg1 - 1) / 45);
        class64 var5 = new class64();
        var5.field1001 = arg0;
        if (var3 != null) {
            var5.method408(15991, new class153(var3));
        }
        class166.field2899.method2169(var5, (long) arg0, (byte) 94);
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIILrm;JZ)V", line = 97)
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, class175 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class123 var8 = new class123();
        var8.field2150 = arg4;
        var8.field2158 = arg1 * 128 + 64;
        var8.field2148 = arg2 * 128 + 64;
        var8.field2151 = arg3;
        var8.field2153 = arg5;
        var8.field2142 = arg6;
        if (class15.field120[arg0][arg1][arg2] == null) {
            class15.field120[arg0][arg1][arg2] = new class16(arg0, arg1, arg2);
        }
        class15.field120[arg0][arg1][arg2].field161 = var8;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lme;BIIZ)V", line = 119)
    public static final void method1291(class75 arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        int var5 = arg0.field1216;
        if (arg1 != -7) {
            method1295(105);
        }
        if (arg0.field1173 == 0) {
            arg0.field1216 = arg0.field1298;
        } else if (arg0.field1173 == 1) {
            arg0.field1216 = arg3 - arg0.field1298;
        } else if (arg0.field1173 == 2) {
            arg0.field1216 = arg0.field1298 * arg3 >> 14;
        } else if (arg0.field1173 == 3) {
            if (arg0.field1184 == 2) {
                arg0.field1216 = arg0.field1298 * 32 + ((arg0.field1298 - 1) * arg0.field1174);
            } else if (arg0.field1184 == 7) {
                arg0.field1216 = (arg0.field1298 - 1) * arg0.field1174 + arg0.field1298 * 115;
            }
        }
        int var6 = arg0.field1205;
        field3144++;
        if (arg0.field1143 == 0) {
            arg0.field1205 = arg0.field1297;
        } else if (arg0.field1143 == 1) {
            arg0.field1205 = arg2 - arg0.field1297;
        } else if (arg0.field1143 == 2) {
            arg0.field1205 = arg0.field1297 * arg2 >> 14;
        } else if (arg0.field1143 == 3) {
            if (arg0.field1184 == 2) {
                arg0.field1205 = (arg0.field1297 - 1) * arg0.field1158 + arg0.field1297 * 32;
            } else if (arg0.field1184 == 7) {
                arg0.field1205 = arg0.field1297 * 12 + ((arg0.field1297 - 1) * arg0.field1158);
            }
        }
        if (arg0.field1173 == 4) {
            arg0.field1216 = arg0.field1205 * arg0.field1153 / arg0.field1263;
        }
        if (arg0.field1143 == 4) {
            arg0.field1205 = arg0.field1263 * arg0.field1216 / arg0.field1153;
        }
        if (class182.field3114 && (client.method871(arg0) != 0 || arg0.field1184 == 0)) {
            if (arg0.field1205 < 5 && arg0.field1216 < 5) {
                arg0.field1216 = 5;
                arg0.field1205 = 5;
            } else {
                if (arg0.field1216 <= 0) {
                    arg0.field1216 = 5;
                }
                if (arg0.field1205 <= 0) {
                    arg0.field1205 = 5;
                }
            }
        }
        if (arg0.field1210 == 1337) {
            class81.field1382 = arg0;
        }
        if (arg4 && arg0.field1302 != null && (arg0.field1216 != var5 || arg0.field1205 != var6)) {
            class331 var7 = new class331();
            var7.field5649 = arg0;
            var7.field5635 = arg0.field1302;
            class197.field3366.method1940((byte) 22, var7);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILbc;)V", line = 225)
    private final void method1292(int arg0, int arg1, class153 arg2) {
        field3151++;
        if (arg0 == 249) {
            int var4 = arg2.method1082(-27);
            if (this.field3148 == null) {
                int var5 = class135.method922(21793, var4);
                this.field3148 = new class79(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1082(-71) == 1;
                int var8 = arg2.method1107((byte) 82);
                class141 var9;
                if (var7) {
                    var9 = new class255(arg2.method1092((byte) 118));
                } else {
                    var9 = new class259(arg2.method1097((byte) -77));
                }
                this.field3148.method503((long) var8, -120, var9);
            }
        }
        if (arg1 > -103) {
            field3152 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lhi;II)Lhi;", line = 277)
    public final class82 method1293(class82 arg0, int arg1, int arg2) {
        field3147++;
        if (this.field3148 == null) {
            return arg0;
        }
        class255 var4 = (class255) this.field3148.method507((long) arg2, 602425312);
        if (arg1 < 77) {
            return (class82) null;
        } else if (var4 == null) {
            return arg0;
        } else {
            return var4.field4395;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 298)
    public static void method1294(byte arg0) {
        field3152 = null;
        int var1 = 4 / ((30 - arg0) / 50);
        field3154 = null;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V", line = 308)
    public static final void method1295(int arg0) {
        field3145++;
        class42 var1 = (class42) class60.field947.method1936(16173);
        if (arg0 < 41) {
            field3141 = 77;
        }
        while (var1 != null) {
            class168 var2 = var1.field731;
            if (class297.field5058 != var2.field2916 || var2.field2935) {
                var1.method961((byte) 63);
            } else if (var2.field2920 <= class212.field3708) {
                var2.method1203(-49, class243.field4229);
                if (var2.field2935) {
                    var1.method961((byte) 74);
                } else {
                    class321.method2224(var2.field2916, var2.field2940, var2.field2928, var2.field2922, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class42) class60.field947.method1926((byte) 90);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IB)V", line = 348)
    public static final void method1296(int arg0, byte arg1) {
        field3149++;
        class227 var2 = class215.method1531(-1, 7, arg0);
        if (arg1 > -93) {
            method1295(-122);
        }
        var2.method1624((byte) -101);
    }
}
