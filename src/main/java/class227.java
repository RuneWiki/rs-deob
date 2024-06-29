import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class227 extends class150 {

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
    private int[] field3007 = new int[this.field2069];

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lsf;")
    public static class526 field3009 = new class526("", 12);

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public static int[] field3011 = new int[5];

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "[B")
    private byte[] field3008;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method1055(int arg0) {
        ++field3005;
        this.field3002 = Math.abs(this.field3002);
        if (~this.field3002 <= -4097) {
            this.field3002 = 4095;
        }
        this.method1358(this.field3000++, (byte) (this.field3002 >> 4), (byte) -33);
        if (arg0 != -25494) {
            method1453(69, -9, -15, 13);
        }
        this.field3002 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        field3009 = null;
        field3011 = null;
        if (arg0 <= 12) {
            field3009 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBB)V")
    public void method1358(int arg0, byte arg1, byte arg2) {
        this.field3008[this.field3000++] = (byte) ((class702.method3949(arg1, 255) >> 1) + 127);
        if (arg2 > -15) {
            field3004 = -84;
        }
        ++field3003;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method1060(int arg0, int arg1, int arg2) {
        ++field3006;
        this.field3002 += this.field3007[arg1] * arg2 >> 12;
        if (arg0 != -805372180) {
            this.field3008 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field2069 > var7; ++var7) {
            this.field3007[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
    public static final int method1453(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 < -244) {
            arg0 >>= 4;
        } else if (arg3 <= 217) {
            if (arg3 > 192) {
                arg0 >>= 2;
            } else if (arg3 > 179) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 3;
        }
        if (arg1 != 0) {
            field3009 = null;
        }
        ++field3001;
        return ((arg2 & 255) >> 2 << 10) + (arg0 >> 5 << 7) - -(arg3 >> 1);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method1062(int arg0) {
        this.field3002 = 0;
        if (arg0 == 255) {
            ++field3010;
            this.field3000 = 0;
        }
    }
}
