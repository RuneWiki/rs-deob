import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class665 {

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public int field9354;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "S")
    public short field9350;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "B")
    public byte field9348;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "S")
    public short field9355;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "S")
    public short field9356;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public int field9345;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public int field9347;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public int field9342;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Z")
    public boolean field9343;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public int field9344;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "[I")
    public static int[] field9351 = new int[4096];

    @OriginalMember(owner = "client!et", name = "l", descriptor = "Ljb;")
    public static class666 field9353 = new class666(1);

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "[I")
    public static int[] field9346;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3747(byte arg0) {
        if (arg0 < 85) {
            method3748(-67);
        }
        field9352++;
        if (class224.field3359) {
            return;
        }
        class406.field5822 = true;
        class224.field3359 = true;
        if (class525.field7713.field5977) {
            class473.field6790 = ((int) class473.field6790 + 191 & 0xFFFFFF80);
        } else {
            class677.field9647 += (24.0F - class677.field9647) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 50)
    public static final void method3748(int arg0) {
        field9349++;
        for (int var1 = 0; var1 < 100; var1++) {
            class131.field2134[var1] = null;
        }
        class99.field1482 = 0;
        if (arg0 != 100) {
            method3749(-33);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 68)
    public class665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9354 = arg0;
        this.field9350 = (short) arg5;
        this.field9348 = (byte) arg8;
        this.field9355 = (short) arg6;
        this.field9356 = (short) arg4;
        this.field9345 = arg3;
        this.field9347 = arg2;
        this.field9342 = arg11;
        this.field9343 = arg10;
        this.field9344 = arg1;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V", line = 93)
    public static void method3749(int arg0) {
        field9351 = null;
        field9346 = null;
        if (arg0 != -11368) {
            field9353 = null;
        }
        field9353 = null;
    }
}
