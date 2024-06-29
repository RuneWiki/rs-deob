import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class135 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lsc;")
    public static class181 field2195 = class149.method967(255, "overlay2");

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lsc;")
    public static class181 field2196 = class149.method967(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lsc;")
    private static class181 field2202 = class149.method967(255, "Allocated memory");

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    public static int[] field2198 = new int[256];

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lsc;")
    public static class181 field2197 = field2202;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[I")
    public static int[] field2207 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Lsc;")
    public static class181 field2209 = class149.method967(255, "document)3cookie=(R");

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lsc;")
    public static class181 field2205 = class149.method967(255, "details");

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljb;")
    public static class11 field2206;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[B")
    public byte[] field2200;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[B")
    public byte[] field2210;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Ltg;")
    public static class107[] field2203;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method868(boolean arg0) {
        field2207 = null;
        field2197 = null;
        field2202 = null;
        if (arg0) {
            return;
        }
        field2198 = null;
        field2209 = null;
        field2196 = null;
        field2205 = null;
        field2206 = null;
        field2195 = null;
        field2203 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljb;ILjb;)I")
    public static final int method869(class11 arg0, int arg1, class11 arg2) {
        field2211++;
        int var3 = 0;
        if (arg2.method94(class228.field3918, (byte) 81)) {
            var3++;
        }
        if (arg1 < 101) {
            return 78;
        }
        if (arg2.method94(class128.field2124, (byte) 88)) {
            var3++;
        }
        if (arg2.method94(class123.field2021, (byte) 123)) {
            var3++;
        }
        if (arg0.method94(class228.field3918, (byte) 124)) {
            var3++;
        }
        if (arg0.method94(class128.field2124, (byte) 115)) {
            var3++;
        }
        if (arg0.method94(class123.field2021, (byte) 89)) {
            var3++;
        }
        return var3;
    }
}
