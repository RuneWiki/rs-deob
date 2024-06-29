import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class406 extends class311 {

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "J")
    public static long field5622 = 0L;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
    public static boolean field5625 = false;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lhc;")
    public static class368 field5617 = new class368("cyan:", "", "", "");

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field5614;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lve;")
    public static class309 field5619;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "[I")
    public int[] field5623;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
    public int[] field5624;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "[I")
    public int[] field5626;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[Lbc;")
    public class285[] field5618;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[Lbc;")
    public class285[] field5629;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "[Lwn;")
    public static class77[] field5627;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[[[B")
    public byte[][][] field5616;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 12)
    public static void method2506(byte arg0) {
        field5627 = null;
        int var1 = 69 / ((arg0 + 25) / 60);
        field5617 = null;
        field5619 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V", line = 33)
    public static final void method2507(int arg0, byte arg1, int arg2) {
        field5621++;
        class109 var3 = new class109(16);
        if (arg1 < 54) {
            method2507(-92, (byte) -95, 110);
        }
        for (class119 var4 = (class119) class417.field5771.method842((byte) -25); var4 != null; var4 = (class119) class417.field5771.method836(96)) {
            var4.method1884(false);
            int var5 = (int) (var4.field4226 >> 28);
            int var6 = (int) (var4.field4226 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field4226 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && class11.field107 > var7 && var6 < class264.field3620) {
                var3.method835(4, var4, (long) (var5 << 28 | var6 << 14 | var7));
            }
        }
        class417.field5771 = var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)V", line = 67)
    public static final void method2508(byte arg0, int arg1) {
        if (arg0 >= -66) {
            method2508((byte) 6, 34);
        }
        class343.field4628.method2531(arg1, 112);
        field5628++;
    }
}
