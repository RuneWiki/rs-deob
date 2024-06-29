import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class140 extends class568 {

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "I")
    public volatile int field1960 = -1;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field1954;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1961 = new String[] { method1300(method1299("I\u0002\u0000hR\u0004")), method1300(method1299("I\u0002\u0000h,E\t\b2.\u0004")), method1300(method1299("WIOhm")), method1300(method1299("B\u0012\r*")), method1300(method1299("I\u0002\u0000hS\u0004")), method1300(method1299("I\u0002\u0000hQ\u0004")) };

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "Lat;")
    public static class398 field1953 = new class398();

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1959 = new String[100];

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        try {
            if (arg0 == -19) {
                field1953 = null;
                field1959 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1961[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
    public static final void method1297(boolean arg0) {
        try {
            class748.field11039 = "";
            class222.field3490 = -1;
            class748.field11043 = 0L;
            field1955++;
            if (arg0) {
                field1957 = 124;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1961[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZILmj;I)V")
    public static final void method1298(int arg0, boolean arg1, int arg2, class683 arg3, int arg4) {
        try {
            field1958++;
            int var5 = arg3.field9797;
            int var6 = arg3.field9777;
            if (arg3.field9832 == 0) {
                arg3.field9797 = arg3.field9788;
            } else if (arg3.field9832 == 1) {
                arg3.field9797 = arg2 - arg3.field9788;
            } else if (arg3.field9832 == 2) {
                arg3.field9797 = arg3.field9788 * arg2 >> 14;
            }
            if (arg3.field9792 == 0) {
                arg3.field9777 = arg3.field9891;
            } else if (arg3.field9792 == 1) {
                arg3.field9777 = arg0 - arg3.field9891;
            } else if (arg3.field9792 == 2) {
                arg3.field9777 = arg3.field9891 * arg0 >> 14;
            }
            if (arg3.field9832 == 4) {
                arg3.field9797 = arg3.field9777 * arg3.field9762 / arg3.field9745;
            }
            if (arg4 == -1821370130) {
                if (arg3.field9792 == 4) {
                    arg3.field9777 = arg3.field9797 * arg3.field9745 / arg3.field9762;
                }
                if (class531.field7804 && (client.method2695(arg3).field6926 != 0 || arg3.field9782 == 0)) {
                    if (arg3.field9777 < 5 && arg3.field9797 < 5) {
                        arg3.field9777 = 5;
                        arg3.field9797 = 5;
                    } else {
                        if (arg3.field9797 <= 0) {
                            arg3.field9797 = 5;
                        }
                        if (arg3.field9777 <= 0) {
                            arg3.field9777 = 5;
                        }
                    }
                }
                if (class621.field8967 == arg3.field9763) {
                    class513.field7591 = arg3;
                }
                if (arg1 && arg3.field9838 != null && arg3.field9797 != var5 || arg3.field9777 != var6) {
                    class730 var7 = new class730();
                    var7.field10693 = arg3;
                    var7.field10692 = arg3.field9838;
                    class461.field7104.method3220(var7, arg4 + 1821370130);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1961[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1961[3] : field1961[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class140(String arg0) {
        try {
            this.field1954 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1961[1] + (arg0 == null ? field1961[3] : field1961[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1299(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1300(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
