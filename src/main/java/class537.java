import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class537 extends class472 {

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public int field7869 = 0;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public int field7867 = 0;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public int field7877 = -1;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public int field7871 = 12800;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public int field7876 = 12800;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    public int field7883 = -1;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "Z")
    public boolean field7868 = true;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "Ljava/lang/String;")
    public String field7870;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public int field7879;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public int field7866;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "Ljava/lang/String;")
    public String field7878;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "Lnv;")
    public class44 field7872;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field7886;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "J")
    public static long field7887;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public static int field7885;

    static {
        new class179("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field7886 = new String[100];
        field7882 = 0;
        field7887 = -1L;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Z", line = 3)
    public final boolean method3156(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return false;
        }
        field7880++;
        for (class394 var4 = (class394) this.field7872.method295((byte) 108); var4 != null; var4 = (class394) this.field7872.method296(true)) {
            if (var4.method2480(arg0 + 32257, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[IIB)Z", line = 28)
    public final boolean method3157(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        if (arg4 != -67) {
            this.method3159(false);
        }
        field7875++;
        for (class394 var6 = (class394) this.field7872.method295((byte) 121); var6 != null; var6 = (class394) this.field7872.method296(true)) {
            if (var6.method2481(arg3, arg1, arg0, (byte) -102)) {
                var6.method2478(0, arg2, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIZ)Z", line = 60)
    public final boolean method3158(int arg0, int[] arg1, int arg2, boolean arg3) {
        field7865++;
        if (!arg3) {
            this.method3161(126, null, -72, 106);
        }
        for (class394 var5 = (class394) this.field7872.method295((byte) 121); var5 != null; var5 = (class394) this.field7872.method296(true)) {
            if (var5.method2483(false, arg0, arg2)) {
                var5.method2482(arg2, arg1, arg0, 5072);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 218)
    public class537(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field7870 = arg1;
        this.field7877 = arg6;
        this.field7883 = arg4;
        this.field7879 = arg0;
        this.field7866 = arg3;
        this.field7878 = arg2;
        this.field7868 = arg5;
        if (this.field7877 == 255) {
            this.field7877 = 0;
        }
        this.field7872 = new class44();
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V", line = 91)
    public final void method3159(boolean arg0) {
        this.field7869 = 0;
        this.field7871 = 12800;
        this.field7876 = 12800;
        field7874++;
        this.field7867 = 0;
        for (class394 var2 = (class394) this.field7872.method295((byte) 120); var2 != null; var2 = (class394) this.field7872.method296(arg0)) {
            if (var2.field5737 < this.field7876) {
                this.field7876 = var2.field5737;
            }
            if (var2.field5739 > this.field7869) {
                this.field7869 = var2.field5739;
            }
            if (this.field7867 < var2.field5752) {
                this.field7867 = var2.field5752;
            }
            if (var2.field5753 < this.field7871) {
                this.field7871 = var2.field5753;
            }
        }
        if (!arg0) {
            this.method3156(-58, 82, -35);
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V", line = 136)
    public static void method3160(byte arg0) {
        int var1 = 121 % ((57 - arg0) / 43);
        field7886 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[III)Z", line = 167)
    public final boolean method3161(int arg0, int[] arg1, int arg2, int arg3) {
        field7873++;
        for (class394 var5 = (class394) this.field7872.method295((byte) 11); var5 != null; var5 = (class394) this.field7872.method296(true)) {
            if (var5.method2480(32257, arg2, arg3)) {
                var5.method2478(0, arg1, arg3, arg2);
                return true;
            }
        }
        int var6 = 12 / ((arg0 + 11) / 61);
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)V", line = 202)
    public static final void method3162(byte arg0) {
        class110.method857(4095, class442.field6586);
        class386.field5683++;
        if (arg0 > -34) {
            return;
        }
        field7881++;
        class312.field4752.method1381(class159.method1145((byte) 121), (byte) 127);
        class312.field4752.method1364(class169.field2570, true);
        class312.field4752.method1364(class360.field5313, true);
        class312.field4752.method1381(class40.field667.field4212, (byte) 112);
    }
}
