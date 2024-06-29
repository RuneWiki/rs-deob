import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class245 extends class322 {

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    private int field4025;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4017 = "Loaded title screen";

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4029 = "rating: ";

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field4019;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    private int field4021;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Lii;")
    public static class303 field4030;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "[B")
    private byte[] field4012;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 7)
    public static void method1874(int arg0) {
        field4029 = null;
        field4030 = null;
        field4017 = null;
        if (arg0 != 4096) {
            method1876(34, -45);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)V", line = 19)
    public static final void method1875(byte arg0, int arg1, int arg2) {
        field4010++;
        class273.field4527[arg2] = arg1;
        class204 var3 = (class204) class279.field4583.method1268(12, (long) arg2);
        if (arg0 != -124) {
            field4030 = (class303) null;
        }
        if (var3 == null) {
            class204 var4 = new class204(4611686018427387905L);
            class279.field4583.method1273(arg0 + 125, (long) arg2, var4);
        } else if (var3.field3220 != 4611686018427387905L) {
            var3.field3220 = class47.method371(-119) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V", line = 47)
    public final void method154(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            method1874(62);
        }
        field4028++;
        if (arg2 == 0) {
            this.field4021 = 4096;
            this.field4018 = this.field4027 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4018 = this.field4018 * this.field4018 >> 12;
            this.field4026 = this.field4018;
            return;
        }
        this.field4021 = this.field4020 * this.field4018 >> 12;
        this.field4018 = this.field4027 - (arg1 < 0 ? -arg1 : arg1);
        if (this.field4021 < 0) {
            this.field4021 = 0;
        } else if (this.field4021 > 4096) {
            this.field4021 = 4096;
        }
        this.field4018 = this.field4018 * this.field4018 >> 12;
        this.field4018 = this.field4021 * this.field4018 >> 12;
        this.field4026 += this.field4018 * this.field4016 >> 12;
        this.field4016 = this.field4025 * this.field4016 >> 12;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIFFF)V", line = 80)
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4020 = (int) (arg7 * 4096.0F);
        this.field4027 = (int) (arg6 * 4096.0F);
        this.field4016 = this.field4025 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 93)
    public static final void method1876(int arg0, int arg1) {
        field4023++;
        if (arg1 != 4096) {
            field4011 = -3;
        }
        class77.field1342.method2334(arg1 - 4092, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V", line = 106)
    public static final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class152 var7 = new class152();
        var7.field2423 = arg1 / 128;
        var7.field2420 = arg2 / 128;
        var7.field2412 = arg3 / 128;
        var7.field2432 = arg4 / 128;
        var7.field2427 = arg0;
        var7.field2424 = arg1;
        var7.field2409 = arg2;
        var7.field2419 = arg3;
        var7.field2408 = arg4;
        var7.field2421 = arg5;
        var7.field2414 = arg6;
        class44.field687[class103.field1674++] = var7;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V", line = 123)
    public void method1018(int arg0, byte arg1) {
        this.field4012[arg0] = arg1;
        field4022++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V", line = 131)
    public final void method162(boolean arg0) {
        field4014++;
        this.field4016 = this.field4025;
        this.field4026 >>= 0x4;
        if (this.field4026 < 0) {
            this.field4026 = 0;
        } else if (this.field4026 > 255) {
            this.field4026 = 255;
        }
        this.method1018(this.field4019++, (byte) this.field4026);
        this.field4026 = 0;
        if (!arg0) {
            method1877(-110, 122, -19, 110, 100, -45, 20);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 183)
    public final void method156(int arg0) {
        this.field4019 = 0;
        if (arg0 < 93) {
            this.method154(123, -70, -88);
        }
        this.field4026 = 0;
        field4013++;
    }
}
