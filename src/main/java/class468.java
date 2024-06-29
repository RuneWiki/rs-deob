import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class468 extends class431 {

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lkd;")
    public class188 field6765;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lhn;")
    public static class509 field6762 = new class509(47, 5);

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[Lkr;")
    public static class528[] field6770 = new class528[30];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
    public boolean field6759;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I", line = 3)
    public final int method2824(byte arg0) {
        field6768++;
        if (arg0 < 120) {
            this.field6765 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIBII)V", line = 16)
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6761++;
        int var8 = class385.method2403(class433.field6414, class404.field5987, arg1, true);
        int var9 = class385.method2403(class433.field6414, class404.field5987, arg7, true);
        if (arg5 < 74) {
            field6767 = 87;
        }
        int var10 = class385.method2403(class184.field2777, class327.field4931, arg6, true);
        int var11 = class385.method2403(class184.field2777, class327.field4931, arg0, true);
        int var12 = class385.method2403(class433.field6414, class404.field5987, arg1 + arg4, true);
        int var13 = class385.method2403(class433.field6414, class404.field5987, arg7 - arg4, true);
        for (int var14 = var8; var14 < var12; var14++) {
            class359.method2255((byte) -118, class416.field6200[var14], var11, var10, arg3);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class359.method2255((byte) -106, class416.field6200[var15], var11, var10, arg3);
        }
        int var16 = class385.method2403(class184.field2777, class327.field4931, arg6 + arg4, true);
        int var17 = class385.method2403(class184.field2777, class327.field4931, arg0 - arg4, true);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class416.field6200[var18];
            class359.method2255((byte) -66, var19, var16, var10, arg3);
            class359.method2255((byte) -82, var19, var17, var16, arg2);
            class359.method2255((byte) -91, var19, var11, var17, arg3);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z", line = 70)
    public final boolean method2826(byte arg0) {
        field6766++;
        return arg0 < 82;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lkd;)V", line = 98)
    public class468(class188 arg0) {
        this.field6765 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V", line = 107)
    public static void method2827(int arg0) {
        field6762 = null;
        if (arg0 != 5) {
            method2827(-14);
        }
        field6770 = null;
    }

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)Z", line = 118)
    public final boolean method2828(int arg0) {
        field6763++;
        if (arg0 != 47) {
            this.field6759 = false;
        }
        return this.field6759;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)I", line = 133)
    public int method655(boolean arg0) {
        field6764++;
        return arg0 ? 0 : 32;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public abstract void method648(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
    public abstract boolean method656(boolean arg0);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public abstract void method654(int arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lfo;IILfo;)V")
    public abstract void method653(class361 arg0, int arg1, int arg2, class361 arg3);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public abstract void method649(int arg0);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)Z")
    public abstract boolean method652(int arg0);
}
