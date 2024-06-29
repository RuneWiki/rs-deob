import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class class129 {

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "Lkd;")
    public class296 field1509;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1521 = new String[] { method1127(method1126("Y|45~\u001e")), method1127(method1126("Y|45w\u001e")), method1127(method1126("Y|45|\u001e")), method1127(method1126("Y|45c\u001e")), method1127(method1126("Y|45a\u001e")), method1127(method1126("Y|45\u007f\u001e")), method1127(method1126("Y|45p\u001e")), method1127(method1126("Y|45y\u001e")), method1127(method1126("Y|45`\u001e")), method1127(method1126("Xm9w")), method1127(method1126("M6{5O")), method1127(method1126("Y|45\u000e_v<o\f\u001e")) };

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "Z")
    public static boolean field1515 = false;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "Ldv;")
    public static class685 field1512 = new class685(8, 0, 4, 1);

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "Lel;")
    public static class573 field1520 = new class573(39, 3);

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V", line = 3)
    public void method785(int arg0) {
        try {
            field1513++;
            if (arg0 >= -2) {
                this.method1124((byte) 29);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(B)V", line = 18)
    public static void method1122(byte arg0) {
        try {
            if (arg0 != -74) {
                method1122((byte) -16);
            }
            field1512 = null;
            field1520 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1521[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lkd;)V", line = 28)
    public class129(class296 arg0) {
        try {
            this.field1509 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[11] + (arg0 == null ? field1521[9] : field1521[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public static final void method1123(String arg0, int arg1) {
        try {
            field1517++;
            if (arg0 != null) {
                if (arg0.startsWith("*")) {
                    arg0 = arg0.substring(1);
                }
                String var2 = class727.method5306((byte) -70, arg0);
                if (var2 != null && arg1 == 8) {
                    for (int var3 = 0; var3 < class588.field8654; var3++) {
                        String var4 = class754.field10971[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class727.method5306((byte) -40, var4);
                        if (var5 != null && var5.equals(var2)) {
                            class588.field8654--;
                            for (int var6 = var3; var6 < class588.field8654; var6++) {
                                class754.field10971[var6] = class754.field10971[var6 + 1];
                                class311.field4935[var6] = class311.field4935[var6 + 1];
                                class722.field10461[var6] = class722.field10461[var6 + 1];
                                class341.field5301[var6] = class341.field5301[var6 + 1];
                                class339.field5287[var6] = class339.field5287[var6 + 1];
                                class751.field10932[var6] = class751.field10932[var6 + 1];
                            }
                            class117.field1392 = class28.field349;
                            class464.field6772++;
                            class280 var7 = class610.method4508(class217.field3325, class279.field4190, (byte) -82);
                            var7.field4197.method1428((byte) -24, class554.method4169(23827, arg0));
                            var7.field4197.method1464(arg0, 255);
                            class106.method934((byte) 53, var7);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1521[8] + (arg0 == null ? field1521[9] : field1521[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(B)V", line = 103)
    public void method791(byte arg0) {
        try {
            if (arg0 == -127) {
                field1514++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)V", line = 117)
    public void method782(int arg0) {
        try {
            field1510++;
            if (arg0 != 1) {
                field1515 = true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 129)
    public void method789(byte arg0) {
        try {
            if (arg0 >= 22) {
                field1511++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V", line = 142)
    public void method1124(byte arg0) {
        try {
            if (arg0 != -44) {
                this.field1509 = null;
            }
            field1516++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 154)
    public static final void method1125(int arg0) {
        try {
            field1508++;
            class167.method1487((long) class375.field5711, class610.field8913, arg0 - 7629);
            if (class742.field10801 != -1) {
                class594.method4421((byte) 108, class742.field10801);
            }
            for (int var1 = 0; var1 < class669.field9721; var1++) {
                if (class26.field321[var1]) {
                    class214.field3265[var1] = true;
                }
                class419.field6166[var1] = class26.field321[var1];
                class26.field321[var1] = false;
            }
            class254.field3940 = class375.field5711;
            if (class742.field10801 != -1) {
                class669.field9721 = 0;
                class486.method3695(0);
            }
            class610.field8913.method553();
            class531.method4019(class610.field8913, (byte) 53);
            int var2 = class114.method1007((byte) 110);
            if (var2 == -1) {
                var2 = class311.field4926;
            }
            if (arg0 != 7629) {
                method1122((byte) 37);
            }
            if (var2 == -1) {
                var2 = class474.field6882;
            }
            class85.method721(var2, (byte) 39);
            class327.field5158 = 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1521[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V", line = 206)
    public void method787(int arg0) {
        try {
            field1518++;
            if (arg0 != 1) {
                this.method784(true, (byte) -97);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1521[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public abstract void method783(int arg0);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZB)V")
    public abstract void method784(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIB)V")
    public abstract void method786(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)Z")
    public abstract boolean method790(boolean arg0);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)V")
    public abstract void method781(boolean arg0, int arg1);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILrca;)V")
    public abstract void method788(int arg0, int arg1, class479 arg2);

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1126(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1127(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
