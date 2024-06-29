import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class class341 {

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4975 = new String[] { method2745(method2744("\u0017gT\u0006\u0005T")), method2745(method2744("\u0017gT\u0006\u0007T")), method2745(method2744("\u0017gT\u0006\u000bT")), method2745(method2744("\u0017gT\u0006\u0004T")), method2745(method2744("\u0017gT\u0006\u0006T")), method2745(method2744("\u0017gT\u0006\bT")), method2745(method2744("\u0017gT\u0006\tT")), method2745(method2744("\u0012vYD")), method2745(method2744("\u0007-\u001b\u0006<")) };

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field4968 = 0;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "Lob;")
    public static class779 field4966;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "[Ltb;")
    public static class392[] field4962;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(Z)V")
    public static void method2737(boolean arg0) {
        try {
            if (!arg0) {
                field4966 = null;
                field4962 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4975[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)Z")
    public final boolean method2738(byte arg0) {
        try {
            if (arg0 >= -17) {
                this.method2741((byte) 74);
            }
            field4970++;
            return (this.field4965 & 0x8) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4975[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)Z")
    public final boolean method2739(boolean arg0) {
        try {
            if (arg0) {
                this.field4974 = -59;
            }
            field4971++;
            return (this.field4965 & 0x2) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4975[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLhh;)I")
    public static final int method2740(byte arg0, class250 arg1) {
        try {
            field4963++;
            int var2 = 36 % ((-arg0 - 7) / 56);
            if (class210.field3057 == arg1) {
                return 6407;
            } else if (class385.field5635 == arg1) {
                return 6408;
            } else if (class18.field235 == arg1) {
                return 6406;
            } else if (class101.field1356 == arg1) {
                return 6409;
            } else if (class518.field7566 == arg1) {
                return 6410;
            } else if (class167.field2133 == arg1) {
                return 6145;
            } else {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4975[6] + arg0 + ',' + (arg1 == null ? field4975[7] : field4975[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
    public final boolean method2741(byte arg0) {
        try {
            if (arg0 > -12) {
                return false;
            } else {
                field4967++;
                return (this.field4965 & 0x1) != 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4975[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(Z)J")
    public static final long method2742(boolean arg0) {
        try {
            field4972++;
            if (!arg0) {
                field4966 = null;
            }
            return class476.field7025.method1404(arg0);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4975[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
    public final boolean method2743(int arg0) {
        try {
            field4973++;
            if (arg0 != 513) {
                field4968 = 71;
            }
            return (this.field4965 & 0x4) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4975[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2744(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2745(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
