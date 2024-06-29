import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class class164 extends class665 {

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Lok;")
    public class228 field2358;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "Z")
    public static boolean field2359 = true;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Ldg;")
    public static class376 field2352 = new class376(26, -1);

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "Lnea;")
    public static class664 field2360 = new class664(113, -1);

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "Lnea;")
    public static class664 field2361;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "Z")
    public boolean field2353;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
    public abstract boolean method1126(byte arg0);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
    public abstract void method1127(int arg0, int arg1);

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(Z)I")
    public int method1128(boolean arg0) {
        field2351++;
        if (arg0) {
            this.method1131((byte) -65, 79, 127);
        }
        return 0;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V")
    public abstract void method1129(byte arg0);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILwn;ILwn;)V")
    public abstract void method1130(int arg0, class673 arg1, int arg2, class673 arg3);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BII)V")
    public abstract void method1131(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Z")
    public abstract boolean method1132(int arg0);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lr;I)V")
    public static final void method1133(class166 arg0, int arg1) {
        if (class566.field7979) {
            class167.method1157(1, arg0);
        } else {
            class418.method2520(arg0, arg1 - 2456);
        }
        field2355++;
        if (arg1 != -321) {
            method1135(true);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)Z")
    public final boolean method1134(int arg0) {
        if (arg0 != -5544) {
            this.method1131((byte) -20, -56, 83);
        }
        field2356++;
        return false;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lok;)V")
    public class164(class228 arg0) {
        this.field2358 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(Z)V")
    public static void method1135(boolean arg0) {
        if (!arg0) {
            field2360 = null;
        }
        field2360 = null;
        field2352 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)Z")
    public final boolean method1136(int arg0) {
        field2357++;
        return arg0 == -8857 ? this.field2353 : true;
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)I")
    public final int method1137(int arg0) {
        if (arg0 == -5255) {
            field2354++;
            return 1;
        } else {
            return -22;
        }
    }
}
