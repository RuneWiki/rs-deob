import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class514 extends class260 {

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Lfba;")
    public static class27 field7275 = new class27(3, 4);

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field7278 = 0;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "[F")
    public static float[] field7279 = new float[2];

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "Lwv;")
    public static class37 field7276 = new class37(12, 5);

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 4)
    public final void method126(int arg0) {
        ++field7268;
        super.field3828 = this.method123(4377);
        if (arg0 <= 102) {
            this.method123(27);
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(ILgn;)V", line = 17)
    public class514(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/io/File;II[B)V", line = 25)
    public static final void method3098(File arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        ++field7270;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        if (arg1 != 9077) {
            method3101(29);
        }
        try {
            var4.readFully(arg3, 0, arg2);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ltd;ZLjava/lang/String;Ljava/lang/String;I)Lhu;", line = 42)
    public static final class141 method3099(class477 arg0, boolean arg1, String arg2, String arg3, int arg4) {
        if (!arg1) {
            return null;
        } else {
            ++field7277;
            if (~arg4 == -1) {
                return arg0.method2837(arg3, 65535);
            } else if (~arg4 == -2) {
                try {
                    Object var5 = class323.method2082((byte) 115, arg2, class319.field4527, new Object[] { (new URL(class319.field4527.getCodeBase(), arg3)).toString() });
                    if (var5 == null) {
                        throw new RuntimeException();
                    } else {
                        class141 var6 = new class141();
                        var6.field2089 = 1;
                        return var6;
                    }
                } catch (Throwable var12) {
                    class141 var7 = new class141();
                    var7.field2089 = 2;
                    return var7;
                }
            } else if (arg4 == 2) {
                try {
                    class319.field4527.getAppletContext().showDocument(new URL(class319.field4527.getCodeBase(), arg3), "_blank");
                    class141 var8 = new class141();
                    var8.field2089 = 1;
                    return var8;
                } catch (Exception var13) {
                    class141 var9 = new class141();
                    var9.field2089 = 2;
                    return var9;
                }
            } else if (~arg4 == -4) {
                try {
                    class323.method2083(-10217, "loggedout", class319.field4527);
                } catch (Throwable var15) {
                }
                try {
                    class319.field4527.getAppletContext().showDocument(new URL(class319.field4527.getCodeBase(), arg3), "_top");
                    class141 var10 = new class141();
                    var10.field2089 = 1;
                    return var10;
                } catch (Exception var14) {
                    class141 var11 = new class141();
                    var11.field2089 = 2;
                    return var11;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lgn;)V", line = 121)
    public class514(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(II)I", line = 124)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            field7275 = null;
        }
        ++field7273;
        return 3;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)I", line = 136)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            field7278 = -108;
        }
        ++field7274;
        return !super.field3829.method4076(arg0 ^ -1242) ? 0 : 1;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V", line = 153)
    public static void method3100(byte arg0) {
        field7275 = null;
        if (arg0 >= 72) {
            field7279 = null;
            field7276 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V", line = 165)
    public static final void method3101(int arg0) {
        ++field7269;
        int var1 = 30 / ((arg0 - 64) / 46);
        class65.field792 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[F)[F", line = 180)
    public static final float[] method3102(int arg0, int arg1, float[] arg2) {
        ++field7267;
        if (arg0 != -6582) {
            field7276 = null;
        }
        float[] var3 = new float[arg1];
        class595.method3468(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V", line = 195)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field7271;
        if (arg1 != 122) {
            this.method3103(-71);
        }
    }

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "(I)I", line = 206)
    public final int method3103(int arg0) {
        ++field7272;
        return arg0 > -14 ? -77 : super.field3828;
    }
}
