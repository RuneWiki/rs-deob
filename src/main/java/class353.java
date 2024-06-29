import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class353 extends class424 {

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Lji;")
    public class622 field4538;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field4536 = -1;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "F")
    public static float field4537;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    public boolean field4535;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "[Ld;")
    public static class88[] field4540;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method2024(int arg0) {
        if (arg0 != 0) {
            this.method2028(false);
        }
        field4541++;
        return this.field4535;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z", line = 16)
    public final boolean method2025(boolean arg0) {
        field4533++;
        if (!arg0) {
            this.field4538 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 27)
    public static void method2026(int arg0) {
        field4540 = null;
        if (arg0 <= 38) {
            field4537 = -0.8993477F;
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I", line = 43)
    public int method981(int arg0) {
        if (arg0 <= 44) {
            field4537 = -0.2020059F;
        }
        field4534++;
        return 0;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lji;)V", line = 61)
    public class353(class622 arg0) {
        this.field4538 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)Z", line = 72)
    public static final boolean method2027(int arg0, int arg1, byte arg2) {
        field4532++;
        if (arg2 == 88) {
            return (arg0 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)I", line = 83)
    public final int method2028(boolean arg0) {
        field4539++;
        if (arg0) {
            field4537 = 0.12660475F;
        }
        return 1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public abstract void method978(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public abstract void method979(int arg0, int arg1);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public abstract void method972(int arg0);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lvga;Lvga;II)V")
    public abstract void method980(class239 arg0, class239 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!om", name = "i", descriptor = "(I)Z")
    public abstract boolean method971(int arg0);

    @OriginalMember(owner = "client!om", name = "j", descriptor = "(I)Z")
    public abstract boolean method974(int arg0);
}
