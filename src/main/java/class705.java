import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rka")
public class class705 extends class28 {

    @OriginalMember(owner = "client!rka", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field9851;

    @OriginalMember(owner = "client!rka", name = "k", descriptor = "Lhl;")
    private class508 field9856;

    @OriginalMember(owner = "client!rka", name = "h", descriptor = "Ljs;")
    private class5 field9854;

    @OriginalMember(owner = "client!rka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9863 = new String[] { method5061(method5060("OK\u0002,^\u0015")), method5061(method5060("OK\u0002,R\u0015")), method5061(method5060("OK\u0002,_\u0015")), method5061(method5060("SU\u000fn")), method5061(method5060("F\u000eM,k")), method5061(method5060("OK\u0002,Q\u0015")), method5061(method5060("OK\u0002,T\u0015")), method5061(method5060("OK\u0002,pTN\u0002n\u007fGEK")), method5061(method5060("OK\u0002,*TN\nv(\u0015")), method5061(method5060("OK\u0002,W\u0015")), method5061(method5060("OK\u0002,U\u0015")) };

    @OriginalMember(owner = "client!rka", name = "l", descriptor = "[F")
    public static float[] field9848 = new float[16384];

    @OriginalMember(owner = "client!rka", name = "m", descriptor = "[F")
    public static float[] field9857 = new float[16384];

    @OriginalMember(owner = "client!rka", name = "o", descriptor = "[S")
    private static short[] field9860;

    @OriginalMember(owner = "client!rka", name = "g", descriptor = "[S")
    private static short[] field9859;

    @OriginalMember(owner = "client!rka", name = "p", descriptor = "[S")
    private static short[] field9862;

    @OriginalMember(owner = "client!rka", name = "f", descriptor = "[[S")
    public static short[][] field9861;

    @OriginalMember(owner = "client!rka", name = "i", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!rka", name = "r", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!rka", name = "d", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!rka", name = "n", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!rka", name = "q", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!rka", name = "j", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!rka", name = "s", descriptor = "I")
    public static int field9858;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9848[var2] = (float) Math.sin((double) var2 * var0);
            field9857[var2] = (float) Math.cos((double) var2 * var0);
        }
        field9860 = new short[] { -1, -1, -1, -1, -1 };
        field9859 = new short[] { -10304, 9104, 25485, 4620, 4540 };
        field9862 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field9861 = new short[][] { field9862, field9859, field9860 };
    }

    @OriginalMember(owner = "client!rka", name = "a", descriptor = "(III[B)I", line = 6)
    public final int method313(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            if (arg1 != -28221) {
                this.finalize();
            }
            field9849++;
            return this.field9856.method3882(-10, arg0, arg3, arg2);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9863[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9863[3] : field9863[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "a", descriptor = "(IZIIB)V", line = 17)
    public static final void method5058(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        try {
            field9852++;
            if (arg4 != -85) {
                method5058(112, false, 7, -52, (byte) -85);
            }
            if (class314.method2496(arg3, (byte) -31)) {
                class110.method1038(arg0, -1, arg1, 0, arg2, class9.field117[arg3]);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9863[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "c", descriptor = "(I)V", line = 32)
    public static void method5059(int arg0) {
        try {
            field9857 = null;
            field9859 = null;
            if (arg0 != 25238) {
                method5059(-45);
            }
            field9848 = null;
            field9861 = null;
            field9862 = null;
            field9860 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9863[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "b", descriptor = "(I)V", line = 48)
    public final void method314(int arg0) {
        try {
            field9853++;
            this.field9856.method3887((byte) 70);
            if (arg0 != 6090) {
                this.method314(64);
            }
            this.field9854.method36(arg0 - 6215);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9863[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "a", descriptor = "([BIII)V", line = 60)
    public final void method312(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            int var5 = 82 / ((arg1 + 51) / 40);
            this.field9854.method32(arg0, arg3, arg2, true);
            field9847++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9863[9] + (arg0 == null ? field9863[3] : field9863[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "a", descriptor = "(B)V", line = 71)
    public final void method318(byte arg0) {
        try {
            field9850++;
            try {
                if (arg0 != -104) {
                    return;
                }
                this.field9851.close();
            } catch (IOException var3) {
            }
            this.field9856.method3885(arg0 + 106);
            this.field9854.method31(-1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9863[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "finalize", descriptor = "()V", line = 98)
    protected final void finalize() {
        try {
            field9855++;
            this.method318((byte) -104);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9863[7] + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "a", descriptor = "(II)Z", line = 106)
    public final boolean method316(int arg0, int arg1) throws IOException {
        try {
            field9858++;
            if (arg0 > -101) {
                this.method314(121);
            }
            return this.field9856.method3886((byte) -128, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9863[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 143)
    public class705(Socket arg0, int arg1) throws IOException {
        try {
            this.field9851 = arg0;
            this.field9851.setSoTimeout(30000);
            this.field9851.setTcpNoDelay(true);
            this.field9856 = new class508(this.field9851.getInputStream(), arg1);
            this.field9854 = new class5(this.field9851.getOutputStream(), arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9863[8] + (arg0 == null ? field9863[3] : field9863[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5060(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5061(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
