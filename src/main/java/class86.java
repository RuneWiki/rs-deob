import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class86 extends class522 {

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1222 = new String[] { method864(method863("\u001dfKQ+")), method864(method863("\u001dfKV+")) };

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
    public static boolean field1217 = false;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method861(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field1221++;
            if (!class721.field10272 || !class793.field11533) {
                return false;
            } else if (class459.field6696 < 100) {
                return false;
            } else if (class499.method3829(-1, arg0, arg2, arg4)) {
                int var5 = -108 / ((arg3 + 28) / 54);
                int var6 = arg4 << class179.field2328;
                int var7 = arg2 << class179.field2328;
                if (class60.method652(class768.field10975, arg1, class107.field1413[arg0].method5442(arg4, arg2, 31844), class768.field10975, var6, 115, var7)) {
                    class15.field200++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1222[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Z")
    public static final boolean method862(int arg0) {
        try {
            if (arg0 != 356) {
                return false;
            }
            field1219++;
            try {
                if (class385.field5631 == 2) {
                    if (class700.field9796 == null) {
                        class700.field9796 = class178.method1488(class430.field6242, class443.field6543, class11.field150);
                        if (class700.field9796 == null) {
                            return false;
                        }
                    }
                    if (class381.field5554 == null) {
                        class381.field5554 = new class204(class521.field7602, class74.field1065);
                    }
                    class429 var1 = class786.field11354;
                    if (class238.field3445 != null) {
                        var1 = class238.field3445;
                    }
                    if (var1.method3328(class700.field9796, class285.field4006, 22050, -1, class381.field5554)) {
                        class786.field11354 = var1;
                        class786.field11354.method3308((byte) -123);
                        if (class511.field7507 <= 0) {
                            class385.field5631 = 0;
                            class786.field11354.method3313(class760.field10848, (byte) 119);
                            for (int var2 = 0; var2 < class604.field8671.length; var2++) {
                                class786.field11354.method3312(class604.field8671[var2], var2, (byte) -114);
                                class604.field8671[var2] = 255;
                            }
                        } else {
                            class385.field5631 = 3;
                            class786.field11354.method3313(class760.field10848 >= class511.field7507 ? class511.field7507 : class760.field10848, (byte) 122);
                            for (int var3 = 0; var3 < class604.field8671.length; var3++) {
                                class786.field11354.method3312(class604.field8671[var3], var3, (byte) -57);
                                class604.field8671[var3] = 255;
                            }
                        }
                        if (class238.field3445 == null) {
                            if (class329.field4492 > 0L) {
                                class786.field11354.method3316(class189.field2517, class329.field4492, class700.field9796, (byte) 61, true);
                            } else {
                                class786.field11354.method3332(true, class189.field2517, class700.field9796);
                            }
                        }
                        if (class177.field2315 != null) {
                            class177.field2315.method3425(class786.field11354, -75);
                        }
                        class430.field6242 = null;
                        class329.field4492 = 0L;
                        class381.field5554 = null;
                        class700.field9796 = null;
                        class238.field3445 = null;
                        return true;
                    }
                }
            } catch (Exception var6) {
                var6.printStackTrace();
                class786.field11354.method3344(18);
                class430.field6242 = null;
                class700.field9796 = null;
                class381.field5554 = null;
                class385.field5631 = 0;
                class238.field3445 = null;
            }
            return false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1222[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method863(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method864(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
