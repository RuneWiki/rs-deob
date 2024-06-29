import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class199 extends class166 {

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "[B")
    public byte[] field3128;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lai;")
    public static class88 field3126 = new class88(new byte[5000]);

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lwk;")
    public static class279 field3129;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[Lpl;")
    public static class293[] field3125;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)I")
    public static final int method1350(int arg0, int arg1) {
        field3130++;
        int var2 = arg0 >>> 1;
        if (arg1 >= -3) {
            return -34;
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        field3125 = null;
        field3126 = null;
        field3129 = null;
        if (arg0 != 1) {
            method1351((byte) 101);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        this.field3128 = arg0;
    }
}
