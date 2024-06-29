import java.awt.Graphics;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Laf;")
    public static class7 field1025 = class48.method406(40, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Laf;")
    public static class7 field1038 = class48.method406(40, "::fpson");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Laf;")
    private static class7 field1036 = class48.method406(40, "Please wait)3)3)3");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Laf;")
    public static class7 field1034 = class48.method406(40, "0(U");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    public static int[] field1026 = new int[2000];

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[B")
    public static byte[] field1027 = new byte[520];

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
    public static int[] field1035 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Laf;")
    public static class7 field1041 = class48.method406(40, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Laf;")
    public static class7 field1029 = field1036;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lwa;")
    public static class151 field1033;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1030;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method379(boolean arg0) {
        field1027 = null;
        field1036 = null;
        field1026 = null;
        field1041 = null;
        field1035 = null;
        field1033 = null;
        field1034 = null;
        field1029 = null;
        field1025 = null;
        if (!arg0) {
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class43() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[BLrd;)V")
    public final void method380(int arg0, byte[] arg1, class122 arg2) {
        field1032++;
        if (arg2.field2895[arg2.field2903] != 31 || arg2.field2895[arg2.field2903 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1030 == null) {
            this.field1030 = new Inflater(true);
        }
        try {
            this.field1030.setInput(arg2.field2895, arg2.field2903 + 10, arg2.field2895.length + -arg2.field2903 + arg0 + -8);
            this.field1030.inflate(arg1);
        } catch (Exception var4) {
            this.field1030.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1030.reset();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lbe;")
    public static final class13 method381(byte arg0) {
        if (arg0 <= 121) {
            field1023 = 84;
        }
        field1024++;
        try {
            return (class13) Class.forName("w").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class148();
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(III)V")
    private class43(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILaf;Z)V")
    public static final void method382(int arg0, class7 arg1, boolean arg2) {
        field1037++;
        int var3 = 54 % ((46 - arg0) / 54);
        byte var4 = 6;
        short var5 = 200;
        byte var6 = 6;
        byte var7 = 30;
        class33.method304(var4, var6, var5, var7, 0);
        class33.method299(var4, var6, var5, var7, 16777215);
        class147.field3448.method30(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class113.method892(var4, 125, var6, var5, var7);
        if (!arg2) {
            class153.method1204((byte) 68, var5, var7, var4, var6);
            return;
        }
        try {
            Graphics var8 = class13.field324.getGraphics();
            class102.field2425.method647(var8, 0, 0, (byte) 46);
        } catch (Exception var9) {
            class13.field324.repaint();
        }
    }
}
