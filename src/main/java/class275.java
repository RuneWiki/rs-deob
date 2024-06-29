import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class275 extends class557 {

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
    public static int[] field3988 = new int[14];

    @OriginalMember(owner = "client!oba", name = "w", descriptor = "Z")
    public static boolean field3992 = false;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "Ljb;")
    public static class519 field3983 = new class519(65, 6);

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!oba", name = "v", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILofa;)V", line = 10)
    public static final void method1808(int arg0, int arg1, int arg2, class347 arg3) {
        if (arg2 <= 118) {
            field3983 = null;
        }
        class639.field8612 = arg0;
        class214.field2817 = arg1;
        field3986++;
        class40.field417 = arg3;
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V", line = 23)
    public static void method1809(byte arg0) {
        field3988 = null;
        int var1 = -92 % ((arg0 - 5) / 52);
        field3983 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILnf;IB)J", line = 33)
    public static final long method1810(int arg0, class602 arg1, int arg2, byte arg3) {
        field3984++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        if (arg3 < 116) {
            method1809((byte) -2);
        }
        class412 var8 = class210.field2705.method1362(0, arg1.method1748(5875));
        long var9 = (long) (arg1.method1750(29244) << 14 | arg0 | arg2 << 7 | arg1.method1744(21215) << 20 | 0x40000000);
        if (var8.field5905 == 0) {
            var9 |= var6;
        }
        if (var8.field5856 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method1748(5875) << 32;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLdt;)V", line = 71)
    public final void method30(byte arg0, class254 arg1) {
        if (arg0 != 110) {
            field3988 = null;
        }
        this.field3985 = arg1.method1672(-16516);
        field3989++;
        this.field3990 = arg1.method1672(-16516);
        this.field3987 = arg1.method1731((byte) 64);
        this.field3991 = arg1.method1731((byte) 64);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ltn;I)V", line = 87)
    public final void method32(class95 arg0, int arg1) {
        if (arg1 != -29265) {
            method1809((byte) -8);
        }
        arg0.method734(119, this.field3985, this.field3987, this.field3991, this.field3990);
        field3982++;
    }
}
