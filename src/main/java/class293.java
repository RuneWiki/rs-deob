import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class293 {

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Lef;")
    private class513 field4322;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4331 = new String[] { method2403(method2402(":C\u000fBu")), method2403(method2402(",\u0000\u000f/ ")), method2403(method2402("/\u0018M\u0000")), method2403(method2402(",\u0000\u000f( ")), method2403(method2402(",\u0000\u000fPa/\u0004UR ")), method2403(method2402(",\u0000\u000f. ")), method2403(method2402(",\u0000\u000f) ")), method2403(method2402(",\u0000\u000f- ")) };

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lme;")
    private class206 field4326;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lme;", line = 7)
    public final class206 method2397(int arg0) {
        try {
            field4327++;
            class206 var2 = this.field4322.field7374.field3180;
            if (arg0 > -122) {
                return null;
            } else if (this.field4322.field7374 == var2) {
                this.field4326 = null;
                return null;
            } else {
                this.field4326 = var2.field3180;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4331[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 27)
    public static final void method2398(int arg0) {
        try {
            if (class580.field8601.field388 && class242.field3663.field243 != -1) {
                class197.method1696(10186, class242.field3663.field243, class242.field3663.field250);
            }
            field4325++;
            int var1 = 90 / ((8 - arg0) / 35);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4331[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLef;)V", line = 46)
    public final void method2399(byte arg0, class513 arg1) {
        try {
            if (arg0 >= -65) {
                field4329 = -118;
            }
            field4330++;
            this.field4322 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4331[5] + arg0 + ',' + (arg1 == null ? field4331[2] : field4331[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lme;", line = 59)
    public final class206 method2400(byte arg0) {
        try {
            if (arg0 <= 14) {
                return null;
            }
            field4323++;
            class206 var2 = this.field4326;
            if (this.field4322.field7374 == var2) {
                this.field4326 = null;
                return null;
            } else {
                this.field4326 = var2.field3180;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4331[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZLiu;BLiu;)I", line = 82)
    public static final int method2401(int arg0, boolean arg1, class604 arg2, byte arg3, class604 arg4) {
        try {
            field4328++;
            if (arg0 == 1) {
                int var5 = arg2.field2526;
                int var6 = arg4.field2526;
                if (!arg1) {
                    if (var6 == -1) {
                        var6 = 2001;
                    }
                    if (var5 == -1) {
                        var5 = 2001;
                    }
                }
                return var5 - var6;
            } else if (arg0 == 2) {
                return class214.method1873((byte) 106, arg2.method4477(-7).field510, class167.field2300, arg4.method4477(-36).field510);
            } else if (arg0 == 3) {
                if (arg2.field8855.equals("-")) {
                    if (arg4.field8855.equals("-")) {
                        return 0;
                    } else if (arg1) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg4.field8855.equals("-")) {
                    return arg1 ? 1 : -1;
                } else {
                    return class214.method1873((byte) 65, arg2.field8855, class167.field2300, arg4.field8855);
                }
            } else if (arg0 == 4) {
                if (arg2.method1600(0)) {
                    return arg4.method1600(0) ? 0 : 1;
                } else if (arg4.method1600(0)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 5) {
                if (arg2.method1598(43)) {
                    return arg4.method1598(111) ? 0 : 1;
                } else if (arg4.method1598(28)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 6) {
                if (arg2.method1601(123)) {
                    return arg4.method1601(123) ? 0 : 1;
                } else if (arg4.method1601(34)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 7) {
                if (arg2.method1597((byte) 85)) {
                    return arg4.method1597((byte) 90) ? 0 : 1;
                } else if (arg4.method1597((byte) 89)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg2.field8856;
                int var8 = arg4.field8856;
                if (arg1) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else if (arg3 <= 23) {
                return -21;
            } else {
                return arg2.field8860 - arg4.field8860;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4331[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4331[2] : field4331[0]) + ',' + arg3 + ',' + (arg4 == null ? field4331[2] : field4331[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 183)
    public class293() {
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lef;)V", line = 185)
    public class293(class513 arg0) {
        try {
            this.field4322 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4331[4] + (arg0 == null ? field4331[2] : field4331[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2402(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2403(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
