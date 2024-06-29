import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class519 {

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lri;")
    private class461 field7162 = new class461();

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lri;")
    private class461 field7164;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)Lri;", line = 9)
    public final class461 method3098(int arg0) {
        if (arg0 != 0) {
            this.field7164 = null;
        }
        field7156++;
        class461 var2 = this.field7162.field6448;
        if (this.field7162 == var2) {
            return null;
        } else {
            var2.method2773(13);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)I", line = 30)
    public final int method3099(int arg0) {
        field7157++;
        int var2 = arg0;
        for (class461 var3 = this.field7162.field6448; var3 != this.field7162; var3 = var3.field6448) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lri;Z)V", line = 48)
    public final void method3100(class461 arg0, boolean arg1) {
        field7159++;
        if (arg0.field6446 != null) {
            arg0.method2773(18);
        }
        arg0.field6448 = this.field7162;
        arg0.field6446 = this.field7162.field6446;
        arg0.field6446.field6448 = arg0;
        arg0.field6448.field6446 = arg0;
        if (!arg1) {
            this.field7162 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lri;", line = 65)
    public final class461 method3101(byte arg0) {
        field7163++;
        if (arg0 <= 39) {
            return null;
        }
        class461 var2 = this.field7162.field6446;
        if (this.field7162 == var2) {
            this.field7164 = null;
            return null;
        } else {
            this.field7164 = var2.field6446;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Z", line = 86)
    public final boolean method3102(byte arg0) {
        field7161++;
        int var2 = -100 % ((arg0 - 22) / 39);
        return this.field7162.field6448 == this.field7162;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)Lri;", line = 100)
    public final class461 method3103(byte arg0) {
        if (arg0 != 72) {
            return null;
        }
        field7160++;
        class461 var2 = this.field7162.field6448;
        if (this.field7162 == var2) {
            this.field7164 = null;
            return null;
        } else {
            this.field7164 = var2.field6448;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)Lri;", line = 126)
    public final class461 method3104(int arg0) {
        field7158++;
        class461 var2 = this.field7164;
        if (this.field7162 == var2) {
            this.field7164 = null;
            return null;
        }
        this.field7164 = var2.field6448;
        if (arg0 != -10964) {
            this.method3099(-124);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 171)
    public class519() {
        this.field7162.field6448 = this.field7162;
        this.field7162.field6446 = this.field7162;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)V", line = 150)
    public final void method3105(int arg0) {
        field7165++;
        int var2 = 110 % ((64 - arg0) / 62);
        while (true) {
            class461 var3 = this.field7162.field6448;
            if (this.field7162 == var3) {
                this.field7164 = null;
                return;
            }
            var3.method2773(115);
        }
    }
}
