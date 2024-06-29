import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class631 extends class303 {

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
    private int[] field9270 = new int[this.field4169];

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field9272 = 0;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Llu;")
    public static class610 field9265 = new class610(40, 2);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    private int field9263;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    private int field9269;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[B")
    private byte[] field9275;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 3)
    public static final boolean method3673(String arg0, int arg1) {
        ++field9261;
        if (arg1 != 10) {
            method3676(-100, 107, 50);
        }
        return class276.method1730(10, true, arg0, -1);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIF)V", line = 14)
    public class631(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4169 > var7; ++var7) {
            this.field9270[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 33)
    public final void method1188(byte arg0) {
        ++field9262;
        if (arg0 == -68) {
            this.field9263 = 0;
            this.field9269 = 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZ)Z", line = 47)
    public static final boolean method3674(byte arg0, boolean arg1) {
        ++field9271;
        int var2 = 57 / ((71 - arg0) / 34);
        boolean var3 = class99.field1445.method423();
        if (var3 != !arg1) {
            return true;
        } else {
            if (arg1) {
                if (!class99.field1445.method487()) {
                    arg1 = false;
                }
            } else {
                class99.field1445.method436();
            }
            if (arg1 != var3) {
                class56.field668.field6867 = arg1;
                class56.field668.method1480(class442.field5896, (byte) -69);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 88)
    public static void method3675(byte arg0) {
        int var1 = 122 % ((arg0 - -37) / 59);
        field9265 = null;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V", line = 99)
    public static final void method3676(int arg0, int arg1, int arg2) {
        ++field9273;
        if (class348.field4768 != class143.field2006) {
            if (class11.method50(arg1, 1, false, (byte) 125, arg0, 1, -3, 0, 0)) {
                return;
            }
            class11.method50(arg1, 1, false, (byte) 114, arg0, 1, -2, 0, 0);
        } else {
            if (class11.method50(arg1, 1, false, (byte) 117, arg0, 1, -2, 0, 0)) {
                return;
            }
            class11.method50(arg1, 1, false, (byte) 112, arg0, 1, -3, 0, 0);
        }
        if (arg2 >= -111) {
            method3673((String) null, 15);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V", line = 130)
    public final void method1185(int arg0, int arg1, int arg2) {
        ++field9264;
        this.field9269 += this.field9270[arg0] * arg2 >> 12;
        if (arg1 >= -112) {
            method3675((byte) -11);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V", line = 141)
    public void method1839(byte arg0, int arg1, int arg2) {
        ++field9266;
        int var4 = -123 / ((16 - arg1) / 43);
        this.field9275[this.field9263++] = (byte) (class37.method245(arg0 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[B)[B", line = 154)
    public static final byte[] method3677(int arg0, byte[] arg1) {
        ++field9267;
        if (arg0 != 3453) {
            return null;
        } else {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class648.method3737(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 177)
    public final void method1187(int arg0) {
        this.field9269 = Math.abs(this.field9269);
        ++field9268;
        if (this.field9269 >= 4096) {
            this.field9269 = 4095;
        }
        this.method1839((byte) (this.field9269 >> 4), arg0 ^ -32335, this.field9263++);
        if (arg0 != 32275) {
            method3677(102, (byte[]) null);
        }
        this.field9269 = 0;
    }
}
