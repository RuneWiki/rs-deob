import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class161 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lqk;")
    private class209 field2857;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Li;")
    private class56 field2854;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lwd;")
    private class22 field2852;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ltg;")
    public static class182 field2860;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lik;")
    private class261 field2859;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[Lgj;")
    private class236[] field2858;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Z")
    public final boolean method1089(int arg0) {
        if (arg0 != -24696) {
            this.method1089(-112);
        }
        field2853++;
        if (this.field2859 != null) {
            return true;
        }
        if (this.field2852 == null) {
            if (this.field2857.method1404(-127)) {
                return false;
            }
            this.field2852 = this.field2857.method1407(255, true, arg0 + 24675, (byte) 0, 255);
        }
        if (this.field2852.field1766) {
            return false;
        } else {
            this.field2859 = new class261(this.field2852.method136(100));
            this.field2858 = new class236[(this.field2859.field4619.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lic;Lic;IB)Lgj;")
    public final class236 method1090(class141 arg0, class141 arg1, int arg2, byte arg3) {
        field2850++;
        if (arg3 != 0) {
            this.field2857 = null;
        }
        return this.method1091(arg2, true, arg0, arg1, 255);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZLic;Lic;I)Lgj;")
    private final class236 method1091(int arg0, boolean arg1, class141 arg2, class141 arg3, int arg4) {
        field2851++;
        if (this.field2859 == null) {
            throw new RuntimeException();
        }
        this.field2859.field4587 = arg0 * 8 + 5;
        if (this.field2859.field4619.length <= this.field2859.field4587) {
            throw new RuntimeException();
        } else if (this.field2858[arg0] == null) {
            int var6 = this.field2859.method1712(-4);
            int var7 = this.field2859.method1712(-4);
            class236 var8 = new class236(arg0, arg3, arg2, this.field2857, this.field2854, var6, var7, arg1);
            if (arg4 == 255) {
                this.field2858[arg0] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field2858[arg0];
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2860 = null;
        int var1 = 58 % ((arg0 + 20) / 54);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lqk;Li;)V")
    public class161(class209 arg0, class56 arg1) {
        this.field2857 = arg0;
        this.field2854 = arg1;
        if (!this.field2857.method1404(-122)) {
            this.field2852 = this.field2857.method1407(255, true, -21, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public final void method1093(byte arg0) {
        field2855++;
        if (this.field2858 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2858.length; var2++) {
            if (this.field2858[var2] != null) {
                this.field2858[var2].method1542(17864);
            }
        }
        for (int var3 = 0; var3 < this.field2858.length; var3++) {
            if (this.field2858[var3] != null) {
                this.field2858[var3].method1540((byte) 109);
            }
        }
        if (arg0 != -102) {
            this.field2859 = null;
        }
    }
}
