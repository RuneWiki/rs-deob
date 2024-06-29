import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class321 extends class112 {

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field5591 = 1;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "I")
    private int field5608 = 0;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "I")
    private int field5609 = 0;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "[I")
    public static int[] field5592 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!al", name = "K", descriptor = "Lwm;")
    public static class152 field5590 = class157.method1048("Examiner", 126);

    @OriginalMember(owner = "client!al", name = "S", descriptor = "Lwm;")
    public static class152 field5598 = class157.method1048("Sprites geladen)3", 114);

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Lwm;")
    private static class152 field5593 = class157.method1048("slide:", 120);

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    public static int field5602 = 0;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Lwm;")
    public static class152 field5595 = field5593;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Lwm;")
    public static class152 field5596 = field5593;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "Lwm;")
    public static class152 field5604 = class157.method1048(" ", 96);

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field5600 = 0;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    public static int field5607 = -1;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "J")
    public static long field5605;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V", line = 7)
    public static final void method2259(int arg0, int arg1, int arg2) {
        if (arg1 <= -26) {
            field5594++;
            class303 var3 = class90.method589(false, arg0, 7);
            var3.method2117((byte) 55);
            var3.field5219 = arg2;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 26)
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILhi;)V", line = 32)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            method2261(-118);
        }
        if (arg1 == 0) {
            this.field5608 = arg2.method2011(-43);
        } else if (arg1 == 1) {
            this.field5609 = arg2.method2011(-55);
        } else if (arg1 == 3) {
            this.field5591 = arg2.method2011(arg0 - 31279);
        }
        field5599++;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 91)
    public final void method673(int arg0) {
        if (arg0 != 8) {
            field5592 = (int[]) null;
        }
        field5601++;
        class243.method1667(14);
    }

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V", line = 107)
    public static void method2260(int arg0) {
        field5604 = null;
        field5590 = null;
        field5598 = null;
        if (arg0 < 21) {
            method2259(-91, -27, 6);
        }
        field5592 = null;
        field5596 = null;
        field5595 = null;
        field5593 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)[I", line = 131)
    public final int[] method53(byte arg0, int arg1) {
        field5606++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 59);
        if (arg0 != -3) {
            this.method52(67, -114, (class291) null);
        }
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class58.field889; var6++) {
                int var7 = class131.field1992[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field5608 == 0) {
                    var9 = (var7 - var4) * this.field5591;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field5591 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field5609 == 0) {
                    var12 = class203.field3286[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field5609 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "i", descriptor = "(I)V", line = 200)
    public static final void method2261(int arg0) {
        class245.field4102.method1065(149, 124);
        class245.field4102.method1980(false, class89.method586(1));
        class245.field4102.method1994(class172.field2757, 2921);
        if (arg0 != -4847) {
            field5604 = (class152) null;
        }
        class245.field4102.method1994(class227.field3709, 2921);
        field5603++;
        class245.field4102.method1980(false, class225.field3657);
        class152.field2393++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)Ltf;", line = 250)
    public static final class256 method2262(boolean arg0, int arg1) {
        class256 var2 = (class256) class2.field34.method1663((long) arg1, (byte) 69);
        field5597++;
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return (class256) null;
        } else {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class41.field656.method1381(0, arg1 & 0x7FFF, 0);
            } else {
                var3 = class110.field1557.method1381(0, arg1, 0);
            }
            class256 var4 = new class256();
            if (var3 != null) {
                var4.method1786(new class291(var3), 22);
            }
            if (arg1 >= 32768) {
                var4.method1785(32768);
            }
            class2.field34.method1662(var4, (long) arg1, -87);
            return var4;
        }
    }
}
