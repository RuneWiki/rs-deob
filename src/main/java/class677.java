import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class677 extends class55 {

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "J")
    public long field9450;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "Llga;")
    public static class712 field9454 = new class712(69, 2);

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "[Lgaa;")
    public static class300[] field9457 = new class300[14];

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "Lea;")
    public static class547 field9455 = new class547(9, -1);

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public static int field9458 = 0;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "Lufa;")
    public static class680 field9448;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)I")
    public static final int method3846(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field9452++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 <= 88) {
            field9458 = -42;
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IBIII)V")
    public static final void method3847(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field9449++;
        if (arg1 != 0) {
            field9454 = null;
        }
        if (class122.field1604 <= arg0 && arg0 <= class165.field2070) {
            int var5 = class105.method716(false, class29.field238, class759.field10576, arg2);
            int var6 = class105.method716(false, class29.field238, class759.field10576, arg3);
            class185.method1040(arg0, (byte) 59, arg4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
    public class677() {
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
    public static final void method3848(byte arg0) {
        class11.field68.method2276((byte) -13, 1, class11.field68.field5502);
        field9453++;
        class11.field68.method2276((byte) -13, 1, class11.field68.field5548);
        class11.field68.method2276((byte) -13, 2, class11.field68.field5493);
        class11.field68.method2276((byte) -13, 2, class11.field68.field5524);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5498);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5499);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5510);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5532);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5494);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5521);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5545);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5541);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5534);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5512);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5505);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5520);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5492);
        if (arg0 != 19) {
            return;
        }
        class11.field68.method2276((byte) -13, 0, class11.field68.field5508);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5536);
        class102.method703((byte) 101);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5501);
        class11.field68.method2276((byte) -13, 3, class11.field68.field5511);
        class216.method1201((byte) 62);
        class723.method4058((byte) 127);
        class139.field1786 = true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static void method3849(int arg0) {
        field9455 = null;
        field9448 = null;
        if (arg0 != 1) {
            field9458 = 41;
        }
        field9454 = null;
        field9457 = null;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(J)V")
    public class677(long arg0) {
        this.field9450 = arg0;
    }
}
