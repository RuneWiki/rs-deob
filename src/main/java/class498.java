import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class498 extends class530 {

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field6980 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "D")
    public static double field6981;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I", line = 3)
    public final int method75(int arg0, int arg1) {
        ++field6973;
        int var3 = 36 % ((63 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(ILah;)V", line = 13)
    public class498(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2983(int arg0) {
        class679.field9565 = -1;
        class38.field530 = null;
        class485.field6557 = -1;
        class430.field5926 = null;
        class76.field1051 = null;
        class264.field3599 = null;
        class410.field5731 = null;
        class637.field9059 = null;
        class675.field9510 = -1;
        class19.field237 = null;
        ++field6975;
        class589.field8461 = -1;
        if (arg0 != -13464) {
            field6981 = 0.3294024207824116D;
        }
        class216.field3059.method1876(arg0 + 13403);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 38)
    public static final String[] method2984(String arg0, char arg1, int arg2) {
        ++field6977;
        int var3 = class261.method1619(arg0, (byte) 98, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; ++var7) {
            int var8;
            for (var8 = var6; ~arg0.charAt(var8) != ~arg1; ++var8) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg2 != -97) {
            method2986(-36);
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V", line = 73)
    public final void method70(int arg0, int arg1) {
        ++field6974;
        if (arg1 >= -38) {
            method2985(40, false);
        }
        super.field7419 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IZ)I", line = 84)
    public static final int method2985(int arg0, boolean arg1) {
        ++field6982;
        if (~arg0 > -97) {
            return 0;
        } else {
            if (arg1) {
                method2985(-10, true);
            }
            return arg0 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I", line = 102)
    public final int method74(int arg0) {
        ++field6979;
        if (arg0 != 0) {
            this.method73(true);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 122)
    public static final void method2986(int arg0) {
        class126.field1741.method2069(class547.field7715, class674.field9500.field5143.method656(arg0 ^ arg0) == 1 ? class478.field6514 - -256 << 2 : -1, 0);
        ++field6972;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 130)
    public final void method73(boolean arg0) {
        if (~super.field7419 != -2 && ~super.field7419 != -1) {
            super.field7419 = this.method74(0);
        }
        ++field6978;
        if (!arg0) {
            this.method70(-10, 37);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I", line = 144)
    public final int method2987(int arg0) {
        ++field6984;
        if (arg0 != 0) {
            method2986(-34);
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lah;)V", line = 159)
    public class498(class374 arg0) {
        super(arg0);
    }
}
