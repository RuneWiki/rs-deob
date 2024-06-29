import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class724 {

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lui;")
    private class251 field10303 = new class251(64);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Llga;")
    private class47 field10305;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10307 = new String[] { method5246(method5245("?~\u001aMU")), method5246(method5245("?~\u001aJU")), method5246(method5245("?~\u001aOU")), method5246(method5245("\"xXb")), method5246(method5245("7#\u001a \u0000")), method5246(method5245("?~\u001a2\u0014\"d@0U")), method5246(method5245("?~\u001aLU")), method5246(method5245("?~\u001aKU")) };

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 3)
    public final void method5240(int arg0) {
        try {
            field10306++;
            class251 var2 = this.field10303;
            synchronized (this.field10303) {
                this.field10303.method2043(false);
            }
            if (arg0 != 1) {
                this.method5242(63, true);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10307[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lji;", line = 28)
    public final class609 method5241(int arg0, int arg1) {
        try {
            field10304++;
            if (arg1 != 64) {
                this.method5244((byte) 52);
            }
            class251 var3 = this.field10303;
            class609 var4;
            synchronized (this.field10303) {
                var4 = (class609) this.field10303.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field10305;
            byte[] var6;
            synchronized (this.field10305) {
                var6 = this.field10305.method512(class18.method188(-10251, arg0), class602.method4452(arg0, true), (byte) -55);
            }
            class609 var7 = new class609();
            if (var6 != null) {
                var7.method4494(0, new class711(var6));
            }
            class251 var8 = this.field10303;
            synchronized (this.field10303) {
                this.field10303.method2051((long) arg0, var7, arg1 + 29);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10307[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)V", line = 59)
    public final void method5242(int arg0, boolean arg1) {
        try {
            field10300++;
            class251 var3 = this.field10303;
            synchronized (this.field10303) {
                this.field10303.method2043(arg1);
                this.field10303 = new class251(arg0);
                if (arg1) {
                    this.method5240(-81);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10307[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V", line = 73)
    public final void method5243(int arg0, int arg1) {
        try {
            if (arg1 == 64) {
                class251 var3 = this.field10303;
                synchronized (this.field10303) {
                    this.field10303.method2038(0, arg0);
                }
                field10301++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10307[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 86)
    public final void method5244(byte arg0) {
        try {
            class251 var2 = this.field10303;
            synchronized (this.field10303) {
                this.field10303.method2047(11914);
            }
            field10302++;
            if (arg0 != -12) {
                this.method5243(83, 58);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10307[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 102)
    public class724(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field10305 = arg2;
            if (this.field10305 != null) {
                int var4 = this.field10305.method535((byte) -110) - 1;
                this.field10305.method509(true, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10307[5] + (arg0 == null ? field10307[3] : field10307[4]) + ',' + arg1 + ',' + (arg2 == null ? field10307[3] : field10307[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5245(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5246(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
