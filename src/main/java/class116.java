import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class116 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "S")
    public static short field2074 = 205;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2072 = 5063219;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "F")
    public static float field2077;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lvh;")
    public static class108 field2076;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method808(boolean arg0) {
        field2076 = null;
        if (!arg0) {
            method808(false);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public abstract void method426(byte arg0);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)J")
    public abstract long method425(byte arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)I")
    public static final int method809(byte arg0, int arg1) {
        field2073++;
        if (arg0 <= 105) {
            method809((byte) 29, 97);
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)I")
    public abstract int method427(int arg0, byte arg1, int arg2);
}
