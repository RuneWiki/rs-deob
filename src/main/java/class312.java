import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class312 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field4838 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public static boolean field4839 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lgi;")
    public static class310 field4842;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2135(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field4840++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 != 984942384) {
            method2137(50, 11L);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 26)
    public static void method2136(byte arg0) {
        field4838 = null;
        if (arg0 != 35) {
            field4842 = (class310) null;
        }
        field4842 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJ)V", line = 38)
    public static final void method2137(int arg0, long arg1) {
        int var3 = 73 % ((arg0 - 79) / 46);
        field4841++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var5) {
        }
    }
}
