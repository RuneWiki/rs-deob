import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class237 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "B")
    private byte field3407;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
    public static boolean field3418 = false;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)I", line = 10)
    public static final int method1727(int arg0, byte arg1) {
        if (arg1 == 13) {
            field3414++;
            return arg0 & 0xFF;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I", line = 31)
    public final int method1728(byte arg0) {
        if (arg0 != 42) {
            this.method1729((byte) 70);
        }
        field3411++;
        return (this.field3407 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)I", line = 44)
    public final int method1729(byte arg0) {
        if (arg0 != -101) {
            method1727(-84, (byte) -106);
        }
        field3409++;
        return this.field3407 & 0x7;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 65)
    public static final void method1730(int arg0, int arg1) {
        field3412++;
        if (!class51.method407(arg1, 4)) {
            return;
        }
        if (arg0 < 117) {
            field3415 = false;
        }
        class258[] var2 = class45.field710[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class258 var4 = var2[var3];
            if (var4 != null) {
                var4.field3811 = 0;
                var4.field3731 = 1;
                var4.field3894 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 99)
    public class237() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lec;)V", line = 101)
    public class237(class37 arg0) {
        this.field3407 = arg0.method291(0);
        this.field3416 = arg0.method320((byte) -87);
        this.field3417 = arg0.method278(-116);
        this.field3408 = arg0.method278(-13);
        this.field3410 = arg0.method278(77);
        this.field3419 = arg0.method278(56);
    }
}
