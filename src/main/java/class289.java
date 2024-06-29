import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class289 {

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lmh;")
    public static class128 field4937 = class22.method156(124, "Wordpack geladen)3");

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "S")
    public static short field4947 = 320;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lmh;")
    public static class128 field4945 = class22.method156(127, "headicons_pk");

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Z")
    public static boolean field4949 = false;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    public static boolean field4940 = false;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lq;")
    public static class90 field4933 = new class90(5000);

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Ltb;")
    public static class210 field4952 = new class210(64);

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[Lmh;")
    public static class128[] field4953 = new class128[100];

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Lmh;")
    public static class128 field4957 = class22.method156(123, "lila:");

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lmh;")
    private static class128 field4956 = class22.method156(125, "flash3:");

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lmh;")
    public static class128 field4955 = field4956;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lmh;")
    public static class128 field4959 = class22.method156(126, "cross");

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Lmh;")
    public static class128 field4958 = class22.method156(126, "(U1");

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Lmh;")
    public static class128 field4954 = field4956;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "J")
    public long field4939;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Ljm;")
    public class226 field4931;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Ljm;")
    public class226 field4935;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Ljm;")
    public class226 field4950;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[[[I")
    public static int[][][] field4943;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 5)
    public static void method1991(int arg0) {
        field4954 = null;
        field4937 = null;
        field4959 = null;
        field4956 = null;
        field4957 = null;
        field4953 = null;
        if (arg0 != 1932219) {
            return;
        }
        field4952 = null;
        field4955 = null;
        field4958 = null;
        field4943 = (int[][][]) null;
        field4945 = null;
        field4933 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 27)
    public static final int method1992(int arg0, int arg1) {
        if (arg0 != -22853) {
            field4958 = (class128) null;
        }
        field4932++;
        return (arg1 & 0x1D7BBB) >> 18;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLbg;)Lnc;", line = 49)
    public static final class137 method1993(byte arg0, class194 arg1) {
        if (arg0 != 47) {
            field4933 = (class90) null;
        }
        field4936++;
        return new class137(arg1.method1354(2), arg1.method1354(2), arg1.method1354(2), arg1.method1354(2), arg1.method1349((byte) 91), arg1.method1325(7627));
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V", line = 68)
    public static final void method1994(int arg0, int arg1, byte arg2) {
        int var3 = -15 / ((-arg2 - 40) / 52);
        class34.field732[arg0] = arg1;
        class215 var4 = (class215) class301.field5114.method728(false, (long) arg0);
        field4942++;
        if (var4 == null) {
            class215 var5 = new class215(4611686018427387905L);
            class301.field5114.method730(var5, (long) arg0, (byte) -38);
        } else if (var4.field3789 != 4611686018427387905L) {
            var4.field3789 = class71.method470(true) + 500L | 0x4000000000000000L;
        }
    }
}
