import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class class368 extends class329 {

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field4672 = 0;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
    public static int[] field4673 = new int[1];

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "[[I")
    public static int[][] field4676 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
    public abstract int method437(int arg0);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)I")
    public abstract int method439(boolean arg0);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
    public static final boolean method2014(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field4673 = null;
        }
        field4674++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public static void method2015(int arg0) {
        field4673 = null;
        field4676 = null;
        if (arg0 < 32) {
            method2015(60);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Z)I")
    public abstract int method438(boolean arg0);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(FFIF)F")
    public static final float method2016(float arg0, float arg1, int arg2, float arg3) {
        field4675++;
        if (arg2 > -60) {
            field4672 = -28;
        }
        return (arg3 - arg1) * arg0 + arg1;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I")
    public abstract int method435(int arg0);

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "(I)J")
    public abstract long method436(int arg0);
}
