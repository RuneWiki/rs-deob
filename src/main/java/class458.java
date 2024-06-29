import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class458 {

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lug;")
    private class393 field6726;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lbr;")
    private class269 field6718;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lfg;")
    private class84 field6721;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lsi;")
    private class391 field6725;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lht;")
    public static class410 field6717;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[Lgi;")
    private class477[] field6722;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lva;ILva;ZI)Lgi;", line = 3)
    private final class477 method2684(class343 arg0, int arg1, class343 arg2, boolean arg3, int arg4) {
        field6719++;
        if (this.field6725 == null) {
            throw new RuntimeException();
        }
        this.field6725.field5719 = arg1 * arg4 + 5;
        if (this.field6725.field5719 >= this.field6725.field5678.length) {
            throw new RuntimeException();
        } else if (this.field6722[arg4] == null) {
            int var6 = this.field6725.method2361((byte) -56);
            int var7 = this.field6725.method2361((byte) -56);
            class477 var8 = new class477(arg4, arg2, arg0, this.field6726, this.field6718, var6, var7, arg3);
            this.field6722[arg4] = var8;
            return var8;
        } else {
            return this.field6722[arg4];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lva;IILva;)Lgi;", line = 43)
    public final class477 method2685(class343 arg0, int arg1, int arg2, class343 arg3) {
        field6715++;
        if (arg2 != 0) {
            method2686(-111);
        }
        return this.method2684(arg0, 8, arg3, true, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 56)
    public static final void method2686(int arg0) {
        class267.field3694.method1490(true);
        field6716++;
        if (arg0 != 255) {
            method2686(-89);
        }
        class445.field6560.method2135(-121);
        class518.field7648.method2135(-126);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 70)
    public final void method2687(int arg0) {
        field6724++;
        if (this.field6722 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field6722.length; var2++) {
            if (this.field6722[var2] != null) {
                this.field6722[var2].method2798(-55);
            }
        }
        for (int var3 = 0; var3 < this.field6722.length; var3++) {
            if (this.field6722[var3] != null) {
                this.field6722[var3].method2796(19072);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z", line = 110)
    public final boolean method2688(byte arg0) {
        field6720++;
        if (this.field6725 != null) {
            return true;
        }
        if (this.field6721 == null) {
            if (this.field6726.method2374(true)) {
                return false;
            }
            this.field6721 = this.field6726.method2381(255, -1, true, (byte) 0, 255);
        }
        if (this.field6721.field2597) {
            return false;
        } else {
            int var2 = -92 / ((arg0 + 38) / 59);
            this.field6725 = new class391(this.field6721.method656(1));
            this.field6722 = new class477[(this.field6725.field5678.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V", line = 141)
    public static void method2689(byte arg0) {
        field6717 = null;
        int var1 = -122 % ((12 - arg0) / 57);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lug;Lbr;)V", line = 151)
    public class458(class393 arg0, class269 arg1) {
        this.field6726 = arg0;
        this.field6718 = arg1;
        if (!this.field6726.method2374(true)) {
            this.field6721 = this.field6726.method2381(255, -1, true, (byte) 0, 255);
        }
    }
}
