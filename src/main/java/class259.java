import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class259 extends class88 {

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
    private int[] field4434 = new int[this.field1241];

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Z")
    public static boolean field4438;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "[B")
    private byte[] field4442;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 6)
    public final void method580(int arg0) {
        if (arg0 != -13820) {
            return;
        }
        field4444++;
        this.field4439 = Math.abs(this.field4439);
        if (this.field4439 >= 4096) {
            this.field4439 = 4095;
        }
        this.method1177(this.field4437++, (byte) (this.field4439 >> 4));
        this.field4439 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IIII[J)V", line = 22)
    public static final void method1799(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        field4441++;
        int var5 = -121 / ((arg1 + 77) / 49);
        if (arg3 >= arg2) {
            return;
        }
        int var6 = arg3;
        int var7 = (arg3 + arg2) / 2;
        long var8 = arg4[var7];
        arg4[var7] = arg4[arg2];
        arg4[arg2] = var8;
        int var10 = arg0[var7];
        arg0[var7] = arg0[arg2];
        arg0[arg2] = var10;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (arg4[var11] < var8 + ((long) (var11 & 0x1))) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                int var14 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6++] = var14;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var8;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var10;
        method1799(arg0, 34, var6 - 1, arg3, arg4);
        method1799(arg0, 73, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLwm;)Lak;", line = 85)
    public static final class311 method1800(byte arg0, class152 arg1) {
        field4435++;
        class311 var2 = (class311) class31.field520.method1221((byte) 42);
        if (arg0 >= -115) {
            field4438 = false;
        }
        while (var2 != null) {
            if (var2.field5328.method992(23292, arg1)) {
                return var2;
            }
            var2 = (class311) class31.field520.method1223(58);
        }
        return null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 114)
    public final void method581(int arg0, int arg1, int arg2) {
        this.field4439 += this.field4434[arg0] * arg2 >> 12;
        if (arg1 >= -98) {
            this.field4434 = (int[]) null;
        }
        field4440++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 127)
    public final void method579(boolean arg0) {
        field4443++;
        this.field4437 = 0;
        this.field4439 = 0;
        if (arg0) {
            this.field4437 = 33;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 142)
    public void method1177(int arg0, byte arg1) {
        this.field4442[this.field4437++] = (byte) (class34.method251(127, arg1 >> 1) + 127);
        field4436++;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIF)V", line = 157)
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1241; var7++) {
            this.field4434[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
