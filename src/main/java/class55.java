import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class55 extends class180 {

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "[B")
    private byte[] field769;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[Lcl;")
    public static class48[] field765;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public final void method392(int arg0, int arg1, int arg2) {
        if (arg1 != 30864) {
            this.method398(-86, (byte) 89);
        }
        field764++;
        if (arg0 == 0) {
            this.field768 = this.field766 - (arg2 >= 0 ? arg2 : -arg2);
            this.field770 = 4096;
            this.field768 = this.field768 * this.field768 >> 12;
            this.field767 = this.field768;
            return;
        }
        this.field770 = this.field774 * this.field768 >> 12;
        if (this.field770 < 0) {
            this.field770 = 0;
        } else if (this.field770 > 4096) {
            this.field770 = 4096;
        }
        this.field768 = this.field766 - (arg2 < 0 ? -arg2 : arg2);
        this.field768 = this.field768 * this.field768 >> 12;
        this.field768 = this.field770 * this.field768 >> 12;
        this.field767 += this.field776 * this.field768 >> 12;
        this.field776 = this.field776 * this.field763 >> 12;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public final void method393(byte arg0) {
        field777++;
        this.field767 >>= 0x4;
        this.field776 = this.field763;
        if (this.field767 < 0) {
            this.field767 = 0;
        } else if (this.field767 > 255) {
            this.field767 = 255;
        }
        this.method398(this.field775++, (byte) this.field767);
        this.field767 = 0;
        int var2 = -45 / ((-arg0 - 46) / 50);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZZI)Ljava/lang/String;")
    public static final String method394(int arg0, boolean arg1, boolean arg2, int arg3) {
        field773++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg2) {
                method397(24, 24, 73);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public final void method395(byte arg0) {
        field778++;
        this.field775 = 0;
        if (arg0 < 23) {
            method396((byte) 54);
        }
        this.field767 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
    public static void method396(byte arg0) {
        if (arg0 > -38) {
            method397(-82, 20, -11);
        }
        field765 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)I")
    public static final int method397(int arg0, int arg1, int arg2) {
        field771++;
        int var3 = class208.method1406(arg1 - 1, arg2 + -1, -120) + class208.method1406(arg1 + 1, arg2 - 1, -51) + class208.method1406(arg1 + -1, arg2 - -1, -43) + class208.method1406(arg1 + 1, arg2 + 1, arg0 ^ 0xFFFFFFDA);
        int var4 = class208.method1406(arg1 - 1, arg2, -86) + (class208.method1406(arg1 + 1, arg2, -103) + class208.method1406(arg1, arg2 - 1, -43) + class208.method1406(arg1, arg0 + arg2, -108));
        int var5 = class208.method1406(arg1, arg2, -59);
        return var3 / 16 + (var4 / 8 + (var5 / 4));
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public void method398(int arg0, byte arg1) {
        this.field769[arg0] = arg1;
        field772++;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field766 = (int) (arg6 * 4096.0F);
        this.field774 = (int) (arg7 * 4096.0F);
        this.field776 = this.field763 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
