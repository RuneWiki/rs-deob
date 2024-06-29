import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class422 implements class410 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lla;")
    private class476 field6219;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lpm;")
    private class610 field6220;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6224 = new String[] { method3263(method3262("e\u0013\u0017\u0015\u001e")), method3263(method3262("y\\\u0017zK")), method3263(method3262("pHUW")), method3263(method3262("y\\\u0017yK")), method3263(method3262("y\\\u0017\u007fK")), method3263(method3262("y\\\u0017xK")), method3263(method3262("y\\\u0017\u0007\npTM\u0005K")), method3263(method3262("y\\\u0017qK")), method3263(method3262("y\\\u0017~K")) };

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "J")
    public static long field6215 = 0L;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lfs;")
    private class581 field6222;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6223;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method3259(int arg0) {
        try {
            field6218++;
            try {
                if (arg0 == 3829) {
                    if (class84.field940 == 1) {
                        int var1 = class396.field5927.method4588((byte) -87);
                        if (var1 > 0 && class396.field5927.method4555(121)) {
                            int var2 = var1 - class515.field7438;
                            if (var2 < 0) {
                                var2 = 0;
                            }
                            class396.field5927.method4563((byte) 97, var2);
                            return;
                        }
                        class396.field5927.method4568(-486);
                        class396.field5927.method4584((byte) -109);
                        if (class166.field2289 == null) {
                            class84.field940 = 0;
                        } else {
                            class84.field940 = 2;
                        }
                        class226.field3467 = null;
                        class38.field447 = null;
                    }
                    if (class84.field940 == 3) {
                        int var3 = class396.field5927.method4588((byte) -87);
                        if (class550.field8199 > var3 && class396.field5927.method4555(arg0 - 3756)) {
                            int var4 = class726.field10492 + var3;
                            if (class550.field8199 < var4) {
                                var4 = class550.field8199;
                            }
                            class396.field5927.method4563((byte) 114, var4);
                        } else {
                            class726.field10492 = 0;
                            class84.field940 = 0;
                        }
                    }
                }
            } catch (Exception var7) {
                var7.printStackTrace();
                class396.field5927.method4568(arg0 ^ 0xFFFFF0EF);
                class494.field7093 = null;
                class166.field2289 = null;
                class38.field447 = null;
                class84.field940 = 0;
                class226.field3467 = null;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6224[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        try {
            field6221++;
            return arg0 == -17976 ? this.field6219.method3618(this.field6220.field8912, 45) : true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6224[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method370(byte arg0) {
        try {
            field6216++;
            this.field6222 = class670.method4933(-60, this.field6219, this.field6220.field8912);
            if (arg0 > -98) {
                this.field6222 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6224[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method3260(boolean arg0) {
        try {
            if (!arg0) {
                field6215 = 72L;
            }
            field6223 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6224[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        try {
            if (arg0) {
                int var3 = class179.field2489 <= class604.field8861 ? class604.field8861 : class179.field2489;
                int var4 = class524.field7654 < class94.field1062 ? class94.field1062 : class524.field7654;
                int var5 = this.field6222.method988();
                int var6 = this.field6222.method997();
                int var7 = 0;
                int var8 = var3;
                int var9 = var3 * var6 / var5;
                int var10 = (var4 - var9) / 2;
                if (var4 < var9) {
                    var9 = var4;
                    var10 = 0;
                    var8 = var4 * var5 / var6;
                    var7 = (var3 - var8) / 2;
                }
                this.field6222.method4344(var7, var10, var8, var9);
            }
            field6214++;
            int var11 = -40 / ((38 - arg1) / 37);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6224[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
    public static final void method3261(String[] arg0, int arg1, short[] arg2) {
        try {
            class322.method2724(arg0, 0, true, arg2, arg0.length + arg1);
            field6217++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6224[1] + (arg0 == null ? field6224[2] : field6224[0]) + ',' + arg1 + ',' + (arg2 == null ? field6224[2] : field6224[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lla;Lpm;)V")
    public class422(class476 arg0, class610 arg1) {
        try {
            this.field6219 = arg0;
            this.field6220 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6224[6] + (arg0 == null ? field6224[2] : field6224[0]) + ',' + (arg1 == null ? field6224[2] : field6224[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3262(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3263(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
