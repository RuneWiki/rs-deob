import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class178 extends class288 {

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Lrc;")
    public static class9 field2531 = new class9(32);

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[S")
    public static short[] field2534 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Z")
    public static boolean field2535 = false;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[[[B")
    public static byte[][][] field2533;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)Z")
    public final boolean method1149(byte arg0) {
        field2526++;
        int var2 = 49 % ((arg0 - 14) / 46);
        return (this.field2525 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Z")
    public final boolean method1150(int arg0) {
        if (arg0 != 0) {
            field2539 = -114;
        }
        field2519++;
        return (this.field2525 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public static final void method1151(int arg0, int arg1) {
        class66 var2 = class6.method34(3, true, arg1);
        field2521++;
        if (arg0 == -1) {
            var2.method410(124);
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
    public final boolean method1152(int arg0) {
        field2524++;
        if (arg0 == 28406) {
            return (this.field2525 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Z")
    public final boolean method1153(boolean arg0) {
        if (arg0) {
            field2523++;
            return (this.field2525 & 0x199A1B52) >> 28 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z")
    public final boolean method1154(int arg0) {
        field2529++;
        if (arg0 != 1) {
            this.method1153(true);
        }
        return (this.field2525 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
    public final int method1155(int arg0) {
        field2537++;
        return arg0 == 0 ? this.field2525 >> 18 & 0x7 : 93;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lkf;")
    public static final class118 method1156(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class118 var4 = var3.field1927;
            var3.field1927 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Z")
    public final boolean method1157(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field2530++;
            return (this.field2525 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)Z")
    public final boolean method1158(byte arg0) {
        if (arg0 != -112) {
            field2534 = null;
        }
        field2522++;
        return (this.field2525 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I")
    public final int method1159(boolean arg0) {
        field2528++;
        return arg0 ? 6 : class164.method1078(true, this.field2525);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(II)V")
    public class178(int arg0, int arg1) {
        this.field2527 = arg1;
        this.field2525 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2531 = null;
        field2533 = null;
        field2534 = null;
        if (arg0 != 11983) {
            field2538 = 98;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1161(long arg0, byte arg1) {
        class34.field396.setTime(new Date(arg0));
        field2520++;
        int var3 = class34.field396.get(7);
        int var4 = class34.field396.get(5);
        int var5 = class34.field396.get(2);
        int var6 = class34.field396.get(1);
        int var7 = class34.field396.get(11);
        if (arg1 != 24) {
            method1151(-103, -56);
        }
        int var8 = class34.field396.get(12);
        int var9 = class34.field396.get(13);
        return class274.field4093[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class274.field4101[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)Z")
    public final boolean method1162(byte arg0) {
        if (arg0 <= 36) {
            return true;
        } else {
            field2536++;
            return (this.field2525 & 0x3CA2B4) >> 21 != 0;
        }
    }
}
