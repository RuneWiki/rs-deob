import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class514 {

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lig;")
    public class687 field7555 = new class687();

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7562 = new String[] { method3942(method3941("\u001e>$6E")), method3942(method3941("\u001e>$0E")), method3942(method3941("\u001d z\u001a\u001bK")), method3942(method3941("\u001e>$<E")), method3942(method3941("\u001e>$3E")), method3942(method3941("\u001e>$=E")), method3942(method3941("\u001e>$?E")), method3942(method3941("\u0001`$[\u0010")), method3942(method3941("\u001e>$7E")), method3942(method3941("\u0014;f\u0019")), method3942(method3941("\u001e>$I\u0004\u0014'~KE")), method3942(method3941("\u001e>$4E")), method3942(method3941("\u001e>$1E")), method3942(method3941("\u001e>$2E")) };

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Loba;")
    public static class739 field7551 = new class739();

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Lmv;")
    public static class125 field7558 = new class125(83, -1);

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
    public static boolean field7561 = true;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Z")
    public static boolean field7560 = false;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lig;")
    private class687 field7559;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method3931(int arg0) {
        try {
            field7553++;
            class476 var1 = class60.field916.field11099;
            var1.method3678(-1);
            int var2 = var1.method3677(-71, 8);
            if (var2 < class438.field6458) {
                for (int var3 = var2; var3 < class438.field6458; var3++) {
                    class438.field6457[class723.field10293++] = class343.field4987[var3];
                }
            }
            if (class438.field6458 < var2) {
                throw new RuntimeException(field7562[2]);
            }
            class438.field6458 = 0;
            if (arg0 != 17364) {
                method3933(41);
            }
            for (int var4 = 0; var4 < var2; var4++) {
                int var5 = class343.field4987[var4];
                class717 var6 = ((class527) class479.field7063.method3693(false, (long) var5)).field7672;
                int var7 = var1.method3677(-111, 1);
                if (var7 == 0) {
                    class343.field4987[class438.field6458++] = var5;
                    var6.field2232 = class118.field1504;
                } else {
                    int var8 = var1.method3677(-110, 2);
                    if (var8 == 0) {
                        class343.field4987[class438.field6458++] = var5;
                        var6.field2232 = class118.field1504;
                        class90.field1258[class225.field3274++] = var5;
                    } else if (var8 == 1) {
                        class343.field4987[class438.field6458++] = var5;
                        var6.field2232 = class118.field1504;
                        int var9 = var1.method3677(-124, 3);
                        var6.method5199(var9, -6, 1);
                        int var10 = var1.method3677(-61, 1);
                        if (var10 == 1) {
                            class90.field1258[class225.field3274++] = var5;
                        }
                    } else if (var8 == 2) {
                        class343.field4987[class438.field6458++] = var5;
                        var6.field2232 = class118.field1504;
                        if (var1.method3677(arg0 - 17426, 1) == 1) {
                            int var11 = var1.method3677(arg0 ^ 0xFFFFBC17, 3);
                            var6.method5199(var11, -6, 2);
                            int var12 = var1.method3677(-123, 3);
                            var6.method5199(var12, -6, 2);
                        } else {
                            int var13 = var1.method3677(arg0 - 17433, 3);
                            var6.method5199(var13, -6, 0);
                        }
                        int var14 = var1.method3677(-99, 1);
                        if (var14 == 1) {
                            class90.field1258[class225.field3274++] = var5;
                        }
                    } else if (var8 == 3) {
                        class438.field6457[class723.field10293++] = var5;
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field7562[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Lig;")
    public final class687 method3932(byte arg0) {
        try {
            field7552++;
            class687 var2 = this.field7555.field9626;
            if (this.field7555 == var2) {
                this.field7559 = null;
                return null;
            } else {
                this.field7559 = var2.field9626;
                return arg0 > -10 ? null : var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7562[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public static void method3933(int arg0) {
        try {
            if (arg0 > -99) {
                field7558 = null;
            }
            field7558 = null;
            field7551 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7562[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
    public static final boolean method3934(byte arg0) {
        try {
            field7547++;
            if (arg0 < 14) {
                return false;
            } else {
                return class385.field5631 != 0;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7562[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
    public final int method3935(int arg0) {
        try {
            field7550++;
            int var2 = 0;
            for (class687 var3 = this.field7555.field9626; var3 != this.field7555; var3 = var3.field9626) {
                var2++;
            }
            if (arg0 != 3003) {
                this.field7555 = null;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7562[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)V")
    public final void method3936(byte arg0) {
        try {
            field7557++;
            int var2 = 60 % ((-arg0 - 5) / 62);
            while (true) {
                class687 var3 = this.field7555.field9626;
                if (this.field7555 == var3) {
                    this.field7559 = null;
                    return;
                }
                var3.method4911(122);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7562[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLig;)V")
    public final void method3937(boolean arg0, class687 arg1) {
        try {
            field7556++;
            if (arg1.field9627 != null) {
                arg1.method4911(126);
            }
            arg1.field9626 = this.field7555;
            arg1.field9627 = this.field7555.field9627;
            arg1.field9627.field9626 = arg1;
            arg1.field9626.field9627 = arg1;
            if (!arg0) {
                this.field7559 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7562[8] + arg0 + ',' + (arg1 == null ? field7562[9] : field7562[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)Lig;")
    public final class687 method3938(byte arg0) {
        try {
            int var2 = 31 / ((arg0 - 74) / 33);
            field7554++;
            class687 var3 = this.field7555.field9626;
            if (this.field7555 == var3) {
                return null;
            } else {
                var3.method4911(126);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7562[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(B)Lig;")
    public final class687 method3939(byte arg0) {
        try {
            field7548++;
            class687 var2 = this.field7559;
            if (this.field7555 == var2) {
                this.field7559 = null;
                return null;
            }
            this.field7559 = var2.field9626;
            if (arg0 != -75) {
                field7551 = null;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7562[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(B)Z")
    public static final boolean method3940(byte arg0) {
        try {
            field7549++;
            if (arg0 != 2) {
                field7558 = null;
            }
            return class561.field8167 != 0;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7562[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    public class514() {
        try {
            this.field7555.field9627 = this.field7555;
            this.field7555.field9626 = this.field7555;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7562[10] + ')');
        }
    }

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3941(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3942(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
