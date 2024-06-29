import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class686 extends class96 {

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9620 = new String[] { method4910(method4909("\tNB\\5")), method4910(method4909("\tNBZ5")), method4910(method4909("\u0016\u0002B5`")), method4910(method4909("\tNBS5")), method4910(method4909("\u0003Y\u0000w")), method4910(method4909("\tNB^5")), method4910(method4909("\tNB_5")), method4910(method4909("\tNBX5")), method4910(method4909("\tNBY5")), method4910(method4909("\tNB]5")) };

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[F")
    public static float[] field9610 = new float[4];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field9619 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Liea;")
    public static class421 field9617 = new class421();

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[[B")
    public static byte[][] field9614;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method683(boolean arg0, byte arg1) {
        try {
            ++field9613;
            if (arg1 != -54) {
                this.method683(true, (byte) 16);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9620[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 15)
    public static void method4907(int arg0) {
        try {
            field9617 = null;
            field9610 = null;
            field9614 = null;
            if (arg0 != 4) {
                method4908((byte) 99, (class311) null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9620[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lml;)V", line = 28)
    public class686(class194 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLsba;)Z", line = 31)
    public static final boolean method4908(byte arg0, class311 arg1) {
        try {
            if (arg0 <= 126) {
                method4908((byte) 92, (class311) null);
            }
            ++field9616;
            return arg1 == null ? false : class60.method652(-arg1.field4284 + arg1.field4275, -arg1.field4276 + arg1.field4283, arg1.field4276, -arg1.field4273 + arg1.field4282, arg1.field4284, 80, arg1.field4273);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9620[9] + arg0 + ',' + (arg1 != null ? field9620[2] : field9620[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 49)
    public final void method675(int arg0) {
        try {
            ++field9609;
            super.field1301.method1633(262144, false);
            if (arg0 != -16265) {
                this.method683(false, (byte) 32);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9620[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V", line = 63)
    public final void method673(boolean arg0, int arg1) {
        try {
            int var3 = -103 / ((arg1 - 36) / 55);
            super.field1301.method1633(262144, true);
            ++field9611;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9620[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZII)V", line = 73)
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            ++field9618;
            if (arg0) {
                this.method673(true, -81);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9620[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLica;)V", line = 89)
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            if (!arg1) {
                super.field1301.method1618((byte) 124, arg2);
                ++field9612;
                super.field1301.method1631(arg0, 7681);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9620[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9620[2] : field9620[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Z", line = 104)
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                method4907(-74);
            }
            ++field9615;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9620[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4909(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4910(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
