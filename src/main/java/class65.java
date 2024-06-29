import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class65 extends class331 implements class52 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lkw;I[BI)V", line = 5)
    public class65(class346 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1016 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)I", line = 13)
    public static final int method584(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        if (arg3 != 19171) {
            field1014 = -110;
        }
        ++field1017;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return -arg1 + 7;
        } else {
            return var4 == 2 ? -arg0 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I", line = 38)
    public final int method475(int arg0) {
        ++field1015;
        if (arg0 != -8745) {
            this.method474(false, 88, 91, (byte[]) null);
        }
        return this.field1016;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZII[B)V", line = 50)
    public final void method474(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (!arg0) {
            method585(-94L, -52);
        }
        ++field1013;
        this.method2038(arg3, arg2);
        this.field1016 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V", line = 67)
    public static final void method585(long arg0, int arg1) {
        ++field1018;
        int var3 = class108.field1536.field3923 - -class504.field7332;
        int var4 = class261.field3711 + class108.field1536.field3916;
        if (-var3 + class646.field9302 < -2000 || ~(-var3 + class646.field9302) < -2001 || -var4 + class537.field7811 < -2000 || -var4 + class537.field7811 > 2000) {
            class537.field7811 = var4;
            class646.field9302 = var3;
        }
        if (arg1 != -1) {
            method585(68L, 119);
        }
        if (~class646.field9302 != ~var3) {
            int var5 = var3 - class646.field9302;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (~var5 < ~var6) {
                    var6 = var5;
                }
            } else if (~var6 != -1) {
                if (var6 > var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class646.field9302 += var6;
        }
        if (~class537.field7811 != ~var4) {
            int var7 = -class537.field7811 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (~var8 == -1) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 != 0) {
                if (var8 > var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class537.field7811 += var8;
        }
        class680.field9668 += (float) arg0 * class112.field1579 / 6.0F;
        class112.field1584 += (float) arg0 * class201.field2980 / 6.0F;
        class553.method3324(false);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lkw;ILjaclib/memory/Buffer;)V", line = 156)
    public class65(class346 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1016 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I", line = 166)
    public final int method476(int arg0) {
        ++field1020;
        int var2 = -29 / ((-40 - arg0) / 35);
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)J", line = 176)
    public final long method477(int arg0) {
        ++field1019;
        int var2 = 84 % ((-59 - arg0) / 32);
        return super.field4494.getAddress();
    }
}
