import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class538 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lhp;")
    private class277 field7741 = new class277(64);

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lkea;")
    private class203 field7746;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lkp;")
    public static class421 field7742 = new class421(4);

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Z")
    public static boolean field7748 = false;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lkba;")
    public static class89 field7749 = new class89();

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[Lcf;")
    public static class525[] field7747;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3134(int arg0) {
        class517.field7523.method1810(false);
        field7745++;
        if (arg0 != 64) {
            method3134(4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 16)
    public static void method3135(byte arg0) {
        if (arg0 <= 6) {
            method3137(57, null);
        }
        field7742 = null;
        field7749 = null;
        field7747 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Lm;", line = 28)
    public final class165 method3136(int arg0, byte arg1) {
        field7750++;
        class277 var3 = this.field7741;
        class165 var4;
        synchronized (this.field7741) {
            var4 = (class165) this.field7741.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field7746;
        byte[] var6;
        synchronized (this.field7746) {
            var6 = this.field7746.method1286(arg0, 35, (byte) -49);
        }
        if (arg1 != -70) {
            field7742 = null;
        }
        class165 var7 = new class165();
        if (var6 != null) {
            var7.method954(new class194(var6), (byte) 54);
        }
        var7.method956(arg1 + 70);
        class277 var8 = this.field7741;
        synchronized (this.field7741) {
            this.field7741.method1808((long) arg0, var7, (byte) -86);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 63)
    public static final String[] method3137(int arg0, String[] arg1) {
        field7744++;
        String[] var2 = new String[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 90)
    public final void method3138(int arg0, int arg1) {
        if (arg1 != -29831) {
            field7747 = null;
        }
        class277 var3 = this.field7741;
        synchronized (this.field7741) {
            this.field7741.method1811((byte) 112, arg0);
        }
        field7738++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 105)
    public final void method3139(int arg0) {
        field7743++;
        class277 var2 = this.field7741;
        synchronized (this.field7741) {
            this.field7741.method1810(false);
            if (arg0 != 5) {
                this.method3136(81, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 118)
    public final void method3140(int arg0) {
        field7740++;
        if (arg0 != 0) {
            this.method3139(9);
        }
        class277 var2 = this.field7741;
        synchronized (this.field7741) {
            this.field7741.method1805(59);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 143)
    public class538(class149 arg0, int arg1, class203 arg2) {
        this.field7746 = arg2;
        if (this.field7746 != null) {
            this.field7746.method1309(1675886592, 35);
        }
    }
}
