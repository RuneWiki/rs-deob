import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class417 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
    public static int[] field5485 = new int[128];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lga;")
    public static class332 field5481;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5484;

    static {
        for (int var0 = 0; var0 < field5485.length; var0++) {
            field5485[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field5485[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field5485[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field5485[var3] = var3 + 52 - 48;
        }
        field5485[42] = field5485[43] = 62;
        field5485[45] = field5485[47] = 63;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2361(byte arg0) {
        field5483++;
        if (class388.field5180.toLowerCase().indexOf("microsoft") == -1) {
            class111.field1422[92] = 74;
            class111.field1422[61] = 27;
            class111.field1422[93] = 43;
            class111.field1422[59] = 57;
            class111.field1422[47] = 73;
            class111.field1422[91] = 42;
            if (class388.field5197 == null) {
                class111.field1422[222] = 59;
                class111.field1422[192] = 58;
            } else {
                class111.field1422[192] = 28;
                class111.field1422[222] = 58;
                class111.field1422[520] = 59;
            }
            class111.field1422[46] = 72;
            class111.field1422[45] = 26;
            class111.field1422[44] = 71;
        } else {
            class111.field1422[189] = 26;
            class111.field1422[221] = 43;
            class111.field1422[187] = 27;
            class111.field1422[191] = 73;
            class111.field1422[222] = 59;
            class111.field1422[219] = 42;
            class111.field1422[223] = 28;
            class111.field1422[220] = 74;
            class111.field1422[188] = 71;
            class111.field1422[186] = 57;
            class111.field1422[192] = 58;
            class111.field1422[190] = 72;
        }
        if (arg0 != 31) {
            method2361((byte) -98);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 57)
    public static void method2362(int arg0) {
        if (arg0 != -676) {
            method2362(67);
        }
        field5485 = null;
        field5484 = null;
        field5481 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 73)
    public static final void method2363(boolean arg0) {
        field5480++;
        if (!arg0) {
            method2362(58);
        }
        if (class414.field5426 == null) {
            return;
        }
        if (class414.field5426.field9420 == 1) {
            class414.field5426 = null;
            return;
        }
        if (class414.field5426.field9420 == 2) {
            class608.method3375(class613.field8503, 2, class592.field8167, 24573);
            class414.field5426 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lqi;Z[Lmn;)Lhr;", line = 107)
    public static final class604 method2364(class510 arg0, boolean arg1, class61[] arg2) {
        field5482++;
        if (arg1) {
            method2362(43);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field757 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field757);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class369.field4848, 0);
        if (class369.field4848[0] == 0) {
            if (class369.field4848[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class369.field4848, 1);
            if (class369.field4848[1] > 1) {
                byte[] var7 = new byte[class369.field4848[1]];
                OpenGL.glGetInfoLogARB(var4, class369.field4848[1], class369.field4848, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class369.field4848[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field757);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class604(arg0, var4, arg2);
    }
}
