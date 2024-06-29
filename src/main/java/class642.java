import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class642 {

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lui;")
    private class251 field9149 = new class251(16);

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Llga;")
    private class47 field9146;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9154 = new String[] { method4695(method4694("/;{b\u000e")), method4695(method4694(" g{\b[")), method4695(method4694("/;{\u001aO5 !\u0018\u000e")), method4695(method4694("5<9J")), method4695(method4694("/;{d\u000e")), method4695(method4694("/;{g\u000e")), method4695(method4694("/;{e\u000e")) };

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field9151 = 0;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field9153 = 0;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)Lgv;")
    public final class690 method4690(int arg0, int arg1) {
        try {
            field9152++;
            class251 var3 = this.field9149;
            class690 var4;
            synchronized (this.field9149) {
                var4 = (class690) this.field9149.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field9146;
            byte[] var6;
            synchronized (this.field9146) {
                var6 = this.field9146.method512(arg1, 30, (byte) -38);
                if (arg0 >= -69) {
                    this.method4691((byte) 10);
                }
            }
            class690 var7 = new class690();
            if (var6 != null) {
                var7.method4926((byte) -69, new class711(var6));
            }
            class251 var8 = this.field9149;
            synchronized (this.field9149) {
                this.field9149.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field9154[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method4691(byte arg0) {
        try {
            field9145++;
            if (arg0 >= 49) {
                class251 var2 = this.field9149;
                synchronized (this.field9149) {
                    this.field9149.method2047(11914);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9154[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method4692(int arg0, int arg1) {
        try {
            class251 var3 = this.field9149;
            synchronized (this.field9149) {
                this.field9149.method2038(0, arg1);
            }
            if (arg0 <= 109) {
                this.method4691((byte) 111);
            }
            field9150++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9154[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method4693(int arg0) {
        try {
            if (arg0 == 0) {
                class251 var2 = this.field9149;
                synchronized (this.field9149) {
                    this.field9149.method2043(false);
                }
                field9147++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9154[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class642(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field9146 = arg2;
            this.field9146.method509(true, 30);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9154[2] + (arg0 == null ? field9154[3] : field9154[1]) + ',' + arg1 + ',' + (arg2 == null ? field9154[3] : field9154[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4694(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4695(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
