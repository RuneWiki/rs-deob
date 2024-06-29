import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class589 extends class528 {

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "[I")
    private int[] field8020 = new int[this.field7320];

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "Lst;")
    public static class335 field8017 = new class335(18, -1);

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "F")
    public static float field8028 = 1024.0F;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "D")
    public static double field8026;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
    private int field8021;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
    private int field8022;

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "Luu;")
    public static class237 field8029;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "[B")
    private byte[] field8016;

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IIIIIF)V")
    public class589(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field7320; ++var7) {
            this.field8020[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public final void method3135(boolean arg0) {
        if (!arg0) {
            method3399((byte) -128);
        }
        ++field8018;
        this.field8022 = 0;
        this.field8021 = 0;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)V")
    public final void method3137(byte arg0) {
        this.field8021 = Math.abs(this.field8021);
        ++field8023;
        if (this.field8021 >= 4096) {
            this.field8021 = 4095;
        }
        this.method2670((byte) (this.field8021 >> 4), this.field8022++, -13461);
        int var2 = -5 / ((57 - arg0) / 54);
        this.field8021 = 0;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BII)V")
    public void method2670(byte arg0, int arg1, int arg2) {
        ++field8027;
        this.field8016[this.field8022++] = (byte) (class665.method3759(arg0 >> 1, 127) + 127);
        if (arg2 != -13461) {
            field8028 = 0.9383572F;
        }
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(B)V")
    public static void method3399(byte arg0) {
        if (arg0 != 10) {
            field8026 = 1.755721130411004D;
        }
        field8017 = null;
        field8029 = null;
    }

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Lis;")
    public static final class333 method3400(byte arg0) {
        if (arg0 != 110) {
            method3399((byte) -44);
        }
        ++field8025;
        try {
            return (class333) Class.forName("mt").newInstance();
        } catch (Throwable var1) {
            return new class405();
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)V")
    public final void method3141(int arg0, int arg1, int arg2) {
        ++field8019;
        if (arg0 != 1) {
            method3400((byte) -41);
        }
        this.field8021 += this.field8020[arg1] * arg2 >> 12;
    }
}
