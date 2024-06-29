import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class351 extends class107 {

    @OriginalMember(owner = "client!at", name = "u", descriptor = "[I")
    private int[] field4534 = new int[this.field1344];

    @OriginalMember(owner = "client!at", name = "x", descriptor = "Ldr;")
    public static class675 field4537 = new class675(103, 2);

    @OriginalMember(owner = "client!at", name = "y", descriptor = "[F")
    public static float[] field4538 = new float[16];

    @OriginalMember(owner = "client!at", name = "z", descriptor = "Lcga;")
    public static class449 field4539 = new class449(31, 3);

    @OriginalMember(owner = "client!at", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4540 = null;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "F")
    public static float field4527;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "[B")
    private byte[] field4535;

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class351(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field1344; ++var7) {
            this.field4534[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V", line = 20)
    public static void method2021(byte arg0) {
        field4537 = null;
        if (arg0 <= -66) {
            field4538 = null;
            field4540 = null;
            field4539 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V", line = 34)
    public final void method755(byte arg0) {
        this.field4529 = Math.abs(this.field4529);
        ++field4531;
        if (arg0 >= -97) {
            this.field4534 = null;
        }
        if (this.field4529 >= 4096) {
            this.field4529 = 4095;
        }
        this.method1245(this.field4528++, (byte) (this.field4529 >> 4), -1554);
        this.field4529 = 0;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V", line = 57)
    public final void method756(int arg0) {
        this.field4529 = 0;
        this.field4528 = arg0;
        ++field4532;
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V", line = 68)
    public static final void method2022(int arg0) {
        if (arg0 == -7403) {
            for (int var1 = 0; ~class99.field1276 < ~var1; ++var1) {
                int var2 = class352.field4562[var1];
                class704 var3 = (class704) class168.field1973.method3828((long) var2, (byte) -91);
                if (var3 != null) {
                    class506 var4 = var3.field9854;
                    class15.method85(var4.field6326.field9495, var4, (byte) 55);
                }
            }
            ++field4530;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(IBI)V", line = 97)
    public void method1245(int arg0, byte arg1, int arg2) {
        ++field4536;
        if (arg2 != -1554) {
            this.method753(-86, (byte) -58, 96);
        }
        this.field4535[this.field4528++] = (byte) (class109.method762(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)V", line = 112)
    public final void method753(int arg0, byte arg1, int arg2) {
        ++field4533;
        this.field4529 += this.field4534[arg2] * arg0 >> 12;
        if (arg1 != -59) {
            this.method756(4);
        }
    }
}
