import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 extends class178 {

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Z")
    public static boolean field365 = true;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Loc;")
    public static class151 field374 = class137.method873(2, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "Loc;")
    public static class151 field375 = class137.method873(2, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "[I")
    public static int[] field381 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Loc;")
    public static class151 field367 = class137.method873(2, "<img=1>");

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "Ljd;")
    public static class101 field362 = new class101();

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "Loc;")
    public static class151 field390 = class137.method873(2, "<col=ffb000>");

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "[Loc;")
    public static class151[] field391 = new class151[100];

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Lnd;")
    public static class142 field363;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "Loc;")
    public class151 field384;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lsd;")
    public static class192 field389;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "Lwd;")
    public static class232 field388;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lhj;")
    public static class86 field368;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "[I")
    public int[] field379;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "[I")
    public int[] field386;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "[Loc;")
    public class151[] field385;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "[Lwh;")
    public class236[] field377;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILsd;)V")
    public static final void method130(int arg0, class192 arg1) {
        class25.field540 = arg1;
        field383++;
        if (arg0 != 0) {
            field389 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method131(int arg0) {
        if (class137.field2498 != null) {
            class137.field2498.method1058(1024);
        }
        field370++;
        if (class64.field1251 != null) {
            class64.field1251.method1058(1024);
        }
        if (arg0 != -11903) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Loc;ILwa;)I")
    public static final int method132(class151 arg0, int arg1, class229 arg2) {
        field378++;
        int var3 = arg2.field4101;
        arg2.method1439(20697, arg0.field2690);
        int var4 = 114 / ((arg1 + 52) / 59);
        arg2.field4101 += class74.field1428.method1050(arg0.field2690, arg0.field2736, arg2.field4087, arg2.field4101, 0, 2101620963);
        return arg2.field4101 - var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILwd;)Z")
    public static final boolean method133(int arg0, class232 arg1) {
        if (arg0 != 11804) {
            method130(81, null);
        }
        field382++;
        if (class8.field124) {
            if (class174.method1110(true, arg1) != 0) {
                return false;
            }
            if (arg1.field4173 == 0) {
                return false;
            }
        }
        return arg1.field4235;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method134(int arg0) {
        field388 = null;
        if (arg0 < 78) {
            return;
        }
        field391 = null;
        field389 = null;
        field381 = null;
        field362 = null;
        field363 = null;
        field375 = null;
        field390 = null;
        field367 = null;
        field374 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLw;)V")
    public static final void method135(byte arg0, class228 arg1) {
        arg1.field4003 = 0;
        field373++;
        int var2 = arg1.field4015 - class200.field3541;
        int var3 = arg1.field3994 * 128 + arg1.field4007 * 64;
        if (arg1.field3997 == 0) {
            arg1.field4017 = 1024;
        }
        if (arg0 != 8) {
            method131(116);
        }
        if (arg1.field3997 == 1) {
            arg1.field4017 = 1536;
        }
        if (arg1.field3997 == 2) {
            arg1.field4017 = 0;
        }
        int var4 = arg1.field4007 * 64 + arg1.field4006 * 128;
        arg1.field4029 += (var3 - arg1.field4029) / var2;
        if (arg1.field3997 == 3) {
            arg1.field4017 = 512;
        }
        arg1.field3976 += (var4 - arg1.field3976) / var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLsd;I)[Lhh;")
    public static final class84[] method136(int arg0, byte arg1, class192 arg2, int arg3) {
        field372++;
        if (class204.method1291(0, arg0, arg2, arg3)) {
            if (arg1 > -121) {
                field368 = null;
            }
            return class196.method1231(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static final void method137(int arg0) {
        if (arg0 != 3) {
            field368 = null;
        }
        field371++;
        if (class131.field2415 > 0) {
            class158.method1035(5298);
        } else {
            class137.method871(40, (byte) 121);
            class44.field917 = class142.field2588;
            class142.field2588 = null;
        }
    }
}
