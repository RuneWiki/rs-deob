import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class472 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field6641;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field6639;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field6644 = 0;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lwf;")
    public static class79 field6638 = new class79(1, 3);

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lkr;")
    public static class486 field6645 = new class486();

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[[B")
    public static byte[][] field6643;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method2775(boolean arg0) {
        field6638 = null;
        if (arg0) {
            field6643 = null;
            field6645 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V")
    public abstract void method16(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
    public static final void method2776(int arg0, byte arg1) {
        field6642++;
        int var2 = class353.field5090 - class45.field649;
        if (var2 >= 100) {
            class136.field1807 = 1;
            return;
        }
        int var3 = (int) class483.field6806;
        if (class487.field6867 >> 8 > var3) {
            var3 = class487.field6867 >> 8;
        }
        if (class238.field3570[4] && (class23.field306[4] + 128) > var3) {
            var3 = class23.field306[4] + 128;
        }
        int var4 = (int) class157.field2346 + class191.field2843 & 0x3FFF;
        class330.method2092(class353.field5098, class132.method835(class492.field6935.field4317, class29.field394, class492.field6935.field4331, 2002) - 50, 600 - -((var3 >> 3) * 3), (byte) -48, var3, var4, arg0, class480.field6734);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        if (arg1 <= 17) {
            method2775(false);
        }
        class490.field6904 = (int) ((float) (class490.field6904 - class207.field3163) * var5 + (float) class207.field3163);
        class134.field1778 = (int) ((float) (class134.field1778 - class363.field5225) * var5 + (float) class363.field5225);
        class214.field3219 = (int) ((float) (class214.field3219 - class93.field1181) * var5 + (float) class93.field1181);
        class343.field4996 = (int) ((float) (class343.field4996 - class81.field986) * var5 + (float) class81.field986);
        int var6 = class30.field407 - class2.field18;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class30.field407 = (int) ((float) var6 * var5 + (float) class2.field18);
        class30.field407 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
    public abstract void method14(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(III)V")
    public class472(int arg0, int arg1, int arg2) {
        this.field6640 = arg1;
        this.field6641 = arg0;
        this.field6639 = arg2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBI)V")
    public abstract void method15(int arg0, byte arg1, int arg2);
}
