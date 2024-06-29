import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class138 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "J")
    public long field2275 = 0L;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field2286 = new int[64];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2279 = 0;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2278 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    public static int[] field2290 = new int[128];

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field2293 = new String[100];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lli;")
    public class197 field2291;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILeb;)Leb;")
    public static final class103 method951(int arg0, class103 arg1) {
        if (arg0 != 128) {
            field2290 = null;
        }
        field2282++;
        class103 var2 = client.method1505(arg1);
        if (var2 == null) {
            var2 = arg1.field1567;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public static final int method952(int arg0) {
        if (arg0 != -30419) {
            method952(-71);
        }
        field2281++;
        return 2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method953(int arg0, int arg1) {
        int var2 = -18 % ((arg0 + 84) / 32);
        field2273++;
        class247.field3968 = (class125) class102.field1538.method457((long) arg1, (byte) -115);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method954(byte arg0) {
        field2278 = null;
        if (arg0 == 87) {
            field2290 = null;
            field2286 = null;
            field2293 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
    public static final void method955(byte arg0, int arg1) {
        field2276++;
        if (arg0 != -127) {
            field2278 = null;
        }
        if (class280.method1870(123, arg1)) {
            class222.method1474(-1, false, class133.field2204[arg1]);
        }
    }
}
