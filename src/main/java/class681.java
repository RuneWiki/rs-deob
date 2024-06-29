import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class681 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lnv;")
    public class382 field9721;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljca;")
    public static class637 field9723;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public void method745(byte arg0) {
        if (arg0 <= 103) {
            this.field9721 = null;
        }
        field9726++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public void method748(int arg0) {
        if (arg0 != 20060) {
            this.field9721 = null;
        }
        field9725++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILrga;I)V")
    public abstract void method744(int arg0, class218 arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method3861(int arg0) {
        field9723 = null;
        if (arg0 != 7) {
            field9723 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public abstract void method739(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLsea;)V")
    public static final void method3862(byte arg0, class648 arg1) {
        int var2 = -125 % ((-arg0 - 31) / 47);
        field9722++;
        class578.field8167 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public void method749(int arg0) {
        if (arg0 <= 77) {
            this.method750((byte) 24);
        }
        field9727++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
    public abstract void method742(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public void method750(byte arg0) {
        if (arg0 != -8) {
            field9723 = null;
        }
        field9724++;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public abstract void method740(int arg0);

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public void method747(int arg0) {
        if (arg0 != 3914) {
            field9723 = null;
        }
        field9719++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZI)V")
    public abstract void method741(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Z")
    public abstract boolean method751(boolean arg0);

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lnv;)V")
    public class681(class382 arg0) {
        this.field9721 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public void method743(int arg0) {
        if (arg0 == 556) {
            field9728++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIII)I")
    public static final int method3863(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 94) {
            method3862((byte) 49, null);
        }
        field9720++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }
}
