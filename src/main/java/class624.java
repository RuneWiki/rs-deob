import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class624 extends class409 {

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
    private int field9026;

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
    private int field9032;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    private int field9021;

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    private int field9018;

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    private int field9023;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    private int field9020;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "J")
    public static long field9017 = -1L;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "F")
    public static float field9022;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "Lfo;")
    public static class606 field9024;

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9026 = arg4;
        this.field9032 = arg5;
        this.field9021 = arg2;
        this.field9029 = arg6;
        this.field9018 = arg0;
        this.field9030 = arg3;
        this.field9023 = arg1;
        this.field9020 = arg7;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
    public static final void method3590(byte arg0) {
        ++field9025;
        if (!class408.field6089) {
            if (!class335.field4872.field9499) {
                class457.field6595 += (12.0F - class457.field6595) / 2.0F;
            } else {
                class528.field7602 = (float) ((int) class528.field7602 + 47 & -16);
            }
            if (arg0 != 115) {
                method3592(-13);
            }
            class408.field6089 = true;
            class567.field8268 = true;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)I")
    public static final int method3591(int arg0, boolean arg1) {
        ++field9027;
        if (!arg1) {
            method3591(32, true);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static final void method3592(int arg0) {
        ++field9028;
        class416.field6148.method3543((byte) -55);
        class634.field9148 = null;
        if (arg0 < -83) {
            class258.field3346 = null;
            class177.field2475 = 1;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field9033;
        int var4 = this.field9018 * arg2 >> 12;
        int var5 = this.field9023 * arg1 >> 12;
        int var6 = this.field9021 * arg2 >> 12;
        int var7 = this.field9030 * arg1 >> 12;
        int var8 = this.field9026 * arg2 >> 12;
        int var9 = this.field9032 * arg1 >> 12;
        int var10 = this.field9029 * arg2 >> 12;
        if (arg0 == 2048) {
            int var11 = this.field9020 * arg1 >> 12;
            class239.method1469(var5, super.field6091, var7, var11, var9, (byte) -125, var6, var8, var4, var10);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
    public static void method3593(int arg0) {
        if (arg0 == -12393) {
            field9024 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        ++field9031;
        if (arg1 != 27775) {
            this.field9021 = -32;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        ++field9019;
        if (arg0 != -1) {
            this.field9029 = -16;
        }
    }
}
