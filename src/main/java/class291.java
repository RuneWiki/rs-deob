import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class291 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field4524 = 1;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lpg;")
    public static class320 field4522 = new class320(30);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Ll;")
    public static class133 field4527;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "[B")
    public byte[] field4530;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "[B")
    public byte[] field4534;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ID)V", line = 10)
    public static final void method1992(int arg0, double arg1) {
        if (class178.field2693 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class67.field1119[var3] = var4 > 255 ? 255 : var4;
            }
            class178.field2693 = arg1;
        }
        if (arg0 != -256) {
            field4524 = 104;
        }
        field4531++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 59)
    public static void method1993(byte arg0) {
        field4522 = null;
        if (arg0 <= 54) {
            method1993((byte) 50);
        }
        field4527 = null;
    }
}
