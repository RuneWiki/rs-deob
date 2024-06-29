import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class98 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lww;")
    public class287 field1417 = new class287();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[C")
    private static char[] field1415 = new char[64];

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "[I")
    public static int[] field1426;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
    public static int[] field1427;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Lww;")
    private class287 field1424;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Ltl;")
    public static class755 field1425;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field1415[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field1415[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field1415[var2] = (char) (var2 - 4);
        }
        field1415[62] = '*';
        field1415[63] = '-';
        field1426 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
        field1427 = new int[3];
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I", line = 3)
    public final int method660(byte arg0) {
        field1420++;
        if (arg0 != 77) {
            this.field1424 = null;
        }
        int var2 = 0;
        class287 var3 = this.field1417.field3781;
        while (this.field1417 != var3) {
            var3 = var3.field3781;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 31)
    public final void method661(boolean arg0) {
        field1418++;
        while (true) {
            class287 var2 = this.field1417.field3781;
            if (this.field1417 == var2) {
                this.field1424 = null;
                if (arg0) {
                    field1426 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1706((byte) 79);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lww;", line = 59)
    public final class287 method662(byte arg0) {
        field1421++;
        class287 var2 = this.field1424;
        if (this.field1417 == var2) {
            this.field1424 = null;
            return null;
        } else {
            this.field1424 = var2.field3781;
            int var3 = -84 / ((92 - arg0) / 34);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 79)
    public static void method663(int arg0) {
        field1425 = null;
        field1426 = null;
        if (arg0 > -20) {
            field1425 = null;
        }
        field1427 = null;
        field1415 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Lrt;", line = 94)
    public static final class486 method664(int arg0) {
        field1416++;
        int var1 = -126 / ((-arg0 - 4) / 61);
        try {
            return (class486) Class.forName("ft").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Lww;", line = 114)
    public final class287 method665(byte arg0) {
        field1423++;
        class287 var2 = this.field1417.field3781;
        if (this.field1417 == var2) {
            return null;
        } else {
            var2.method1706((byte) 79);
            return arg0 == -55 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILww;)V", line = 132)
    public final void method666(int arg0, class287 arg1) {
        field1419++;
        if (arg1.field3775 != null) {
            arg1.method1706((byte) 79);
        }
        arg1.field3775 = this.field1417.field3775;
        arg1.field3781 = this.field1417;
        arg1.field3775.field3781 = arg1;
        arg1.field3781.field3775 = arg1;
        if (arg0 != 8192) {
            method663(-91);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 202)
    public class98() {
        this.field1417.field3781 = this.field1417;
        this.field1417.field3775 = this.field1417;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)Lww;", line = 154)
    public final class287 method667(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field1422++;
        class287 var2 = this.field1417.field3781;
        if (this.field1417 == var2) {
            this.field1424 = null;
            return null;
        } else {
            this.field1424 = var2.field3781;
            return var2;
        }
    }
}
