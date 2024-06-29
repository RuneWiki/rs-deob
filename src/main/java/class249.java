import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class249 extends class59 {

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "[I")
    private final int[] field4019 = new int[this.field946];

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Luj;")
    public static class156 field4017 = new class156();

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "[Lai;")
    public static class15[] field4023 = new class15[50];

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Lvh;")
    public static class212 field4024 = new class212(512);

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lck;")
    public static class119 field4025 = class298.method1987((byte) 101, "(U(Y");

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field4028 = 0;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Lwi;")
    public static class23 field4026;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lva;")
    public static class36 field4018;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[B")
    private byte[] field4013;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 4)
    public final void method442(int arg0) {
        this.field4020 = 0;
        if (arg0 <= 75) {
            field4028 = -110;
        }
        this.field4012 = 0;
        field4015++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 20)
    public void method554(int arg0, byte arg1) {
        this.field4013[this.field4012++] = (byte) ((class19.method151(arg1, 255) >> 1) + 127);
        field4014++;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 29)
    public static void method1613(int arg0) {
        field4024 = null;
        field4017 = null;
        field4018 = null;
        field4026 = null;
        int var1 = 16 / ((-arg0 - 62) / 56);
        field4023 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIF)V", line = 43)
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field946; var7++) {
            this.field4019[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 71)
    public final void method435(byte arg0) {
        field4016++;
        if (arg0 != -84) {
            method1613(-1);
        }
        this.field4020 = Math.abs(this.field4020);
        if (this.field4020 >= 4096) {
            this.field4020 = 4095;
        }
        this.method554(this.field4012++, (byte) (this.field4020 >> 4));
        this.field4020 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 87)
    public static final void method1614(int arg0, int arg1, int arg2) {
        field4021++;
        if (arg0 == -10170 && class247.method1609(30881, arg2)) {
            class39.method305(0, arg1, class135.field2189[arg2]);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)V", line = 108)
    public final void method445(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4011++;
            this.field4020 += this.field4019[arg0] * arg1 >> 12;
        }
    }
}
