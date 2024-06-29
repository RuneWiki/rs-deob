import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class116 extends class25 {

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "F")
    public float field1598;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "F")
    public float field1602;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Z")
    public boolean field1593;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lco;")
    public static class77 field1601;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Laa;")
    public static class341[] field1599;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIIII[BI)V", line = 4)
    public class116(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1595 = arg3;
        this.field1594 = arg2;
        this.method233(arg3, 0, 22711, arg6, 0, 0, arg2, arg7, 0, true);
        this.field1598 = (float) arg3 / (float) arg5;
        this.field1602 = (float) arg2 / (float) arg4;
        this.field1593 = false;
        this.method229((byte) 77, false, false);
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 18)
    public static void method715(int arg0) {
        if (arg0 == 28034) {
            field1601 = null;
            field1599 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIII[I)V", line = 34)
    public class116(class325 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1595 = arg2;
        this.field1594 = arg1;
        this.method231(0, 0, true, false, 0, arg5, arg2, arg1, 0);
        this.field1593 = false;
        this.field1602 = (float) arg1 / (float) arg3;
        this.field1598 = (float) arg2 / (float) arg4;
        this.method229((byte) 77, false, false);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIIIIIZ)V", line = 55)
    public class116(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1598 = (float) arg4 / (float) arg6;
        this.field1593 = false;
        this.field1595 = arg4;
        this.field1594 = arg3;
        this.field1602 = (float) arg3 / (float) arg5;
        this.method229((byte) 77, false, false);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIIIZ[BI)V", line = 68)
    public class116(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field7881 == 34037) {
            this.field1593 = false;
            this.field1598 = (float) arg4;
            this.field1602 = (float) arg3;
        } else {
            this.field1593 = true;
            this.field1602 = this.field1598 = 1.0F;
        }
        this.field1594 = arg3;
        this.field1595 = arg4;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Z", line = 93)
    public static final boolean method716(int arg0) {
        ++field1597;
        if (arg0 != 14815) {
            field1600 = -98;
        }
        try {
            return class329.method2123(-28757);
        } catch (IOException var4) {
            class300.method1905(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class501.field7394 != null ? class501.field7394.method1997((byte) 46) : -1) + "," + (class250.field3479 != null ? class250.field3479.method1997((byte) 77) : -1) + "," + (class205.field2737 == null ? -1 : class205.field2737.method1997((byte) 117)) + " - " + class497.field7326 + "," + (class331.field5162 - -class56.field800.field3917[0]) + "," + (class328.field5099 - -class56.field800.field3915[0]) + " - ";
            for (int var3 = 0; class497.field7326 > var3 && ~var3 > -51; ++var3) {
                var2 = var2 + class409.field6214.field2219[var3] + ",";
            }
            class395.method2457(var2, var5, 1);
            class420.method2566(-5, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJIZI)Ljava/lang/String;", line = 127)
    public static final String method717(int arg0, long arg1, int arg2, boolean arg3, int arg4) {
        ++field1596;
        if (arg4 >= -32) {
            method716(-45);
        }
        char var6 = ',';
        char var7 = '.';
        if (~arg2 == -1) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg0 < -1) {
            for (int var10 = 0; ~var10 > ~arg0; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (48 - (int) arg1 * 10 + var11));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - ((int) arg1 * 10 + -var13)));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIIIIZ)V", line = 206)
    public class116(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1594 = arg4;
        this.field1595 = arg5;
        if (super.field7881 == 34037) {
            this.field1598 = (float) arg5;
            this.field1602 = (float) arg4;
            this.field1593 = false;
        } else {
            this.field1593 = true;
            this.field1602 = this.field1598 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lnq;IIIZ[I)V", line = 228)
    public class116(class325 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1594 = arg2;
        if (super.field7881 != 34037) {
            this.field1602 = this.field1598 = 1.0F;
            this.field1593 = true;
        } else {
            this.field1593 = false;
            this.field1598 = (float) arg3;
            this.field1602 = (float) arg2;
        }
        this.field1595 = arg3;
    }
}
