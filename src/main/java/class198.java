import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class198 extends class73 {

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
    public int[] field3638 = new int[5];

    @OriginalMember(owner = "client!k", name = "O", descriptor = "[Lb;")
    public class49[] field3646 = new class49[5];

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public int field3647 = 0;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Z")
    public static boolean field3622 = false;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lli;")
    public static class185 field3624 = class245.method1649("T", 123);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lgf;")
    public static class7 field3619 = new class7(100);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lk;")
    public class198 field3634;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lfd;")
    public class206 field3640;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Lid;")
    public class219 field3633;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lte;")
    public class251 field3631;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Lpi;")
    public class267 field3648;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lm;")
    public class38 field3636;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Lph;")
    public class64 field3639;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Z")
    public boolean field3632;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Z")
    public boolean field3635;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Z")
    public boolean field3645;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjd;)Lcb;")
    public static final class241 method1421(byte arg0, class118 arg1) {
        if (arg0 != 98) {
            field3620 = -108;
        }
        field3621++;
        return new class241(arg1.method876(65280), arg1.method876(65280), arg1.method876(arg0 + 65182), arg1.method876(65280), arg1.method873((byte) -123), arg1.method873((byte) -120), arg1.method867(false));
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method1422(int arg0) {
        if (arg0 == -4) {
            field3624 = null;
            field3619 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrg;B)V")
    public static final void method1423(class79 arg0, byte arg1) {
        field3625++;
        if (arg1 >= -90) {
            return;
        }
        int var2 = -1;
        long var3 = 0L;
        if (arg0.field1386 == 0) {
            var3 = class255.method1724(arg0.field1375, arg0.field1368, arg0.field1369);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1386 == 1) {
            var3 = class2.method27(arg0.field1375, arg0.field1368, arg0.field1369);
        }
        if (arg0.field1386 == 2) {
            var3 = class228.method1579(arg0.field1375, arg0.field1368, arg0.field1369);
        }
        if (arg0.field1386 == 3) {
            var3 = class32.method201(arg0.field1375, arg0.field1368, arg0.field1369);
        }
        if (var3 != 0L) {
            var5 = ((int) var3 & 0x7CB18) >> 14;
            var6 = ((int) var3 & 0x3134F4) >> 20;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field1379 = var5;
        arg0.field1384 = var2;
        arg0.field1378 = var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)V")
    public static final void method1424(byte arg0, int arg1, int arg2) {
        field3623++;
        if (arg0 <= 14) {
            method1424((byte) -22, 39, -111);
        }
        class174 var3 = class249.method1671(12, arg1, (byte) -97);
        var3.method1233(0);
        var3.field3186 = arg2;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(III)V")
    public class198(int arg0, int arg1, int arg2) {
        this.field3644 = this.field3642 = arg0;
        this.field3629 = arg1;
        this.field3630 = arg2;
    }
}
