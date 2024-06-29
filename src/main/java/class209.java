import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class209 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "D")
    public static double field3772 = -1.0D;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lke;")
    public static class256 field3777 = class316.method2202("Impossible de trouver ", 27626);

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lvm;")
    public static class297 field3775 = new class297(64);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lke;")
    public static class256 field3779 = class316.method2202(" s(West connect-B)3", 27626);

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lke;")
    private static class256 field3778 = class316.method2202("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 27626);

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lke;")
    public static class256 field3781 = class316.method2202("blinken2:", 27626);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lke;")
    public static class256 field3783 = field3778;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field3782 = 1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3771;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lra;B[B)V", line = 4)
    public final void method1475(class41 arg0, byte arg1, byte[] arg2) {
        field3770++;
        if (arg0.field772[arg0.field738] != 31 || arg0.field772[arg0.field738 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3771 == null) {
            this.field3771 = new Inflater(true);
        }
        try {
            this.field3771.setInput(arg0.field772, arg0.field738 + 10, -arg0.field738 + -10 - (8 - arg0.field772.length));
            this.field3771.inflate(arg2);
        } catch (Exception var5) {
            this.field3771.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 >= -35) {
            method1477(107, 86);
        }
        this.field3771.reset();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 56)
    public static void method1476(byte arg0) {
        field3775 = null;
        if (arg0 < 20) {
            return;
        }
        field3779 = null;
        field3778 = null;
        field3783 = null;
        field3777 = null;
        field3781 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lli;", line = 84)
    public static final class179 method1477(int arg0, int arg1) {
        if (arg0 < 13) {
            return (class179) null;
        }
        field3773++;
        if (arg1 == 0) {
            return new class233();
        } else if (arg1 == 1) {
            return new class40();
        } else if (arg1 == 2) {
            return new class152();
        } else if (arg1 == 3) {
            return new class66();
        } else if (arg1 == 4) {
            return new class64();
        } else if (arg1 == 5) {
            return new class193();
        } else if (arg1 == 6) {
            return new class44();
        } else if (arg1 == 7) {
            return new class244();
        } else if (arg1 == 8) {
            return new class246();
        } else if (arg1 == 9) {
            return new class73();
        } else if (arg1 == 10) {
            return new class281();
        } else if (arg1 == 11) {
            return new class154();
        } else if (arg1 == 12) {
            return new class156();
        } else if (arg1 == 13) {
            return new class5();
        } else if (arg1 == 14) {
            return new class236();
        } else if (arg1 == 15) {
            return new class52();
        } else if (arg1 == 16) {
            return new class142();
        } else if (arg1 == 17) {
            return new class251();
        } else if (arg1 == 18) {
            return new class102();
        } else if (arg1 == 19) {
            return new class247();
        } else if (arg1 == 20) {
            return new class28();
        } else if (arg1 == 21) {
            return new class50();
        } else if (arg1 == 22) {
            return new class8();
        } else if (arg1 == 23) {
            return new class15();
        } else if (arg1 == 24) {
            return new class194();
        } else if (arg1 == 25) {
            return new class207();
        } else if (arg1 == 26) {
            return new class225();
        } else if (arg1 == 27) {
            return new class204();
        } else if (arg1 == 28) {
            return new class305();
        } else if (arg1 == 29) {
            return new class162();
        } else if (arg1 == 30) {
            return new class239();
        } else if (arg1 == 31) {
            return new class164();
        } else if (arg1 == 32) {
            return new class104();
        } else if (arg1 == 33) {
            return new class161();
        } else if (arg1 == 34) {
            return new class168();
        } else if (arg1 == 35) {
            return new class115();
        } else if (arg1 == 36) {
            return new class98();
        } else if (arg1 == 37) {
            return new class105();
        } else if (arg1 == 38) {
            return new class148();
        } else if (arg1 == 39) {
            return new class282();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 403)
    public class209() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIJI)Lke;", line = 407)
    public static final class256 method1478(int[] arg0, int arg1, long arg2, int arg3) {
        field3776++;
        if (class30.field440 != null) {
            class256 var5 = class30.field440.method382(-68, arg1, arg2, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 != -10) {
            field3778 = (class256) null;
        }
        return arg1 == 5 ? class290.method2018(7130, arg2).method1761(95) : class41.method348(arg2, true);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(III)V", line = 442)
    private class209(int arg0, int arg1, int arg2) {
    }
}
