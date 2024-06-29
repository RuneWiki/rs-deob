import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class113 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lhb;")
    private static class44 field2781 = class102.method810("Connecting to update server", -28606);

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lhb;")
    public static class44 field2778 = class102.method810("Versteckt", -28606);

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lhb;")
    public static class44 field2784 = class102.method810("auf der Hautpseite)3", -28606);

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lhb;")
    public static class44 field2782 = field2781;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
    public static int[] field2787 = new int[4000];

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[J")
    public static long[] field2785 = new long[32];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[Lhc;")
    public static class45[] field2786;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[[Lm;")
    public static class72[][] field2777;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 12)
    public static void method863(int arg0) {
        field2785 = null;
        field2786 = null;
        field2784 = null;
        int var1 = 41 % ((-arg0 - 73) / 50);
        field2781 = null;
        field2782 = null;
        field2777 = null;
        field2778 = null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method864(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        class57 var3 = class130.method965(arg2, arg1 ^ 0xFFFF8C30);
        field2780++;
        if (arg1 != 29622) {
            method863(-112);
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method542(arg0, -109);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 86)
    public static final void method865(boolean arg0) {
        class63.field1607 = null;
        class41.field941 = null;
        class63.field1602 = null;
        class117.field2861 = null;
        class84.field2147 = null;
        field2779++;
        if (arg0) {
            field2783 = 0;
        }
        class84.field2133 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
    public abstract void method45(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public abstract void method51(int arg0);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public abstract void method48(int arg0);

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public abstract void method47(int arg0);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
    public abstract void method49(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZBI[B)V")
    public abstract void method46(boolean arg0, byte arg1, int arg2, byte[] arg3);
}
