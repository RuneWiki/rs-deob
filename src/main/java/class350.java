import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class350 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lui;")
    private class251 field5068 = new class251(64);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Llga;")
    private class47 field5070;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Loc;")
    public class760 field5074;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5077 = new String[] { method2798(method2797("<XnA")), method2798(method2797(")\u0003,\u00039")), method2798(method2797("%E,\u0011-<Dv\u0013l")), method2798(method2797("%E,ll")), method2798(method2797("%E,ol")), method2798(method2797("%E,nl")), method2798(method2797("%E,il")), method2798(method2797("%E,hl")) };

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field5073 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field5075 = 0;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ltd;")
    public static class457 field5072 = new class457();

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lwo;", line = 6)
    public final class765 method2792(int arg0, byte arg1) {
        try {
            field5067++;
            class251 var3 = this.field5068;
            class765 var4;
            synchronized (this.field5068) {
                var4 = (class765) this.field5068.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field5070;
            byte[] var6;
            synchronized (this.field5070) {
                var6 = this.field5070.method512(arg0, 32, (byte) -67);
            }
            class765 var7 = new class765();
            var7.field10883 = this;
            if (var6 != null) {
                var7.method5529(new class711(var6), 22429);
            }
            if (arg1 != 18) {
                return null;
            }
            class251 var8 = this.field5068;
            synchronized (this.field5068) {
                this.field5068.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field5077[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 42)
    public final void method2793(int arg0) {
        try {
            if (arg0 != 0) {
                field5072 = null;
            }
            class251 var2 = this.field5068;
            synchronized (this.field5068) {
                this.field5068.method2043(false);
            }
            field5069++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5077[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 55)
    public final void method2794(byte arg0) {
        try {
            if (arg0 == 75) {
                class251 var2 = this.field5068;
                synchronized (this.field5068) {
                    this.field5068.method2047(arg0 + 11839);
                }
                field5071++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5077[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lfs;ILlga;Loc;)V", line = 99)
    public class350(class796 arg0, int arg1, class47 arg2, class760 arg3) {
        try {
            this.field5070 = arg2;
            this.field5070.method509(true, 32);
            this.field5074 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5077[2] + (arg0 == null ? field5077[0] : field5077[1]) + ',' + arg1 + ',' + (arg2 == null ? field5077[0] : field5077[1]) + ',' + (arg3 == null ? field5077[0] : field5077[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 74)
    public static void method2795(byte arg0) {
        try {
            if (arg0 == -30) {
                field5072 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5077[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 89)
    public final void method2796(int arg0, int arg1) {
        try {
            class251 var3 = this.field5068;
            synchronized (this.field5068) {
                this.field5068.method2038(arg0 ^ arg0, arg1);
            }
            field5076++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5077[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2797(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2798(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
