import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class305 extends class352 {

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "S")
    public short field4547;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "S")
    public short field4552;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Z")
    public boolean field4551;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "B")
    public byte field4537;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "B")
    public byte field4545;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "S")
    public short field4541;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "S")
    public short field4542;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "[I")
    public static int[] field4553 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lct;")
    public static class285 field4546 = new class285(19, 0);

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)I")
    public abstract int method899(int arg0);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static void method1902(int arg0) {
        if (arg0 <= 11) {
            method1904(121, (class349) null, -16, -38);
        }
        field4553 = null;
        field4546 = null;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public void method1469(int arg0) {
        field4539++;
        if (arg0 != -7360) {
            method1903(86, true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)Lpm;")
    public static final class96 method1903(int arg0, boolean arg1) {
        field4540++;
        if (!arg1) {
            field4550 = 6;
        }
        class96 var2 = (class96) class428.field6111.method1896((long) arg0, (byte) -111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class251.field3616.method2691(arg0 & 0x7FFF, 1, 0);
        } else {
            var3 = class257.field3827.method2691(arg0, 1, 0);
        }
        class96 var4 = new class96();
        if (var3 != null) {
            var4.method748(new class446(var3), 21322);
        }
        if (arg0 >= 32768) {
            var4.method750(-1);
        }
        class428.field6111.method1898((long) arg0, var4, (byte) 6);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILh;II)V")
    public static final void method1904(int arg0, class349 arg1, int arg2, int arg3) {
        int var4 = -18 / ((-arg2 - 42) / 53);
        field4544++;
        if (arg1.field4612 == arg0 && arg0 != -1) {
            class356 var5 = class170.field2423.method1586(arg0, (byte) 36);
            int var6 = var5.field5415;
            if (var6 == 1) {
                arg1.field4601 = arg3;
                arg1.field4642 = 0;
                arg1.field4600 = 0;
                arg1.field4636 = 0;
                arg1.field4603 = 1;
                class210.method1416(arg1.field4600, arg1.field4543, false, arg1.field4545, var5, 15806, arg1.field4538);
            }
            if (var6 == 2) {
                arg1.field4642 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field4612 == -1 || class170.field2423.method1586(arg0, (byte) 36).field5419 >= class170.field2423.method1586(arg1.field4612, (byte) 36).field5419) {
            arg1.field4601 = arg3;
            arg1.field4600 = 0;
            arg1.field4636 = 0;
            arg1.field4673 = arg1.field4678;
            arg1.field4642 = 0;
            arg1.field4612 = arg0;
            arg1.field4603 = 1;
            if (arg1.field4612 != -1) {
                class210.method1416(arg1.field4600, arg1.field4543, false, arg1.field4545, class170.field2423.method1586(arg1.field4612, (byte) 36), 15806, arg1.field4538);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4538 = (short) arg3;
        this.field4547 = (short) arg6;
        this.field4552 = (short) arg7;
        this.field4554 = (short) arg2;
        this.field4551 = arg8;
        this.field4537 = arg9;
        this.field4545 = (byte) arg0;
        this.field4543 = (short) arg1;
        this.field4541 = (short) arg5;
        this.field4542 = (short) arg4;
    }
}
