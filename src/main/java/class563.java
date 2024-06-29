import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class563 {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    private int field7821;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "J")
    private long field7820;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "Lgb;")
    public static class162 field7825 = new class162();

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "Lae;")
    public static class40 field7826 = new class40();

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "Lpl;")
    public static class612 field7827;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljv;I)V")
    private final void method3086(class638 arg0, int arg1) {
        field7822++;
        int var3 = -106 / ((29 - arg1) / 36);
        this.field7820 |= (arg0.field8944 << class638.field8952 * this.field7821++);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static void method3087(int arg0) {
        field7825 = null;
        if (arg0 <= 104) {
            method3089((byte) -57);
        }
        field7827 = null;
        field7826 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)I")
    private final int method3088(int arg0, int arg1) {
        field7823++;
        if (arg1 != 15) {
            this.method3088(68, 89);
        }
        return (int) (this.field7820 >> class638.field8952 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Lkg;")
    public static final class57 method3089(byte arg0) {
        if (arg0 <= 28) {
            method3089((byte) -34);
        }
        field7818++;
        try {
            return (class57) Class.forName("gq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)Ljv;")
    public final class638 method3090(int arg0, byte arg1) {
        if (arg1 != 96) {
            this.field7820 = 33L;
        }
        field7819++;
        return class638.method3572(this.method3088(arg0, 15), 31974);
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Ljv;)V")
    public class563(class638 arg0) {
        this.field7821 = 1;
        this.field7820 = arg0.field8944;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)I")
    public final int method3091(int arg0) {
        field7824++;
        int var2 = 42 % ((arg0 + 27) / 52);
        return this.field7821;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "([Ljv;)V")
    public class563(class638[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3086(arg0[var2], 66);
        }
    }
}
