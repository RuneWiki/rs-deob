import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class141 extends class264 {

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field1822 = -1;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
    public static int[] field1823;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)I", line = 3)
    public final int method978(byte arg0) {
        ++field1817;
        if (arg0 >= -31) {
            field1822 = 69;
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)I", line = 14)
    public static final int method979(int arg0, int arg1, int arg2, int arg3) {
        ++field1816;
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg2;
        } else if (~var4 == -2) {
            return arg3;
        } else {
            if (arg1 >= -4) {
                method983(-66);
            }
            return var4 == 2 ? -arg2 + 4095 : 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lmfa;)V", line = 37)
    public class141(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I", line = 40)
    public final int method663(byte arg0) {
        ++field1819;
        return arg0 != -38 ? 69 : 127;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I", line = 54)
    public static final int method980(int arg0) {
        ++field1813;
        if (arg0 != -26546) {
            method981(41);
        }
        int var1 = class515.field7364.method2901(125);
        if (~(class117.field1458.length + -1) < ~var1) {
            class515.field7364 = class117.field1458[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V", line = 72)
    public static void method981(int arg0) {
        field1823 = null;
        int var1 = 95 / ((33 - arg0) / 51);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z", line = 82)
    public static final boolean method982(int arg0, int arg1, int arg2) {
        ++field1820;
        if (arg1 != 3) {
            field1823 = null;
        }
        return class697.method3931(arg0, arg2, 2226) & class530.method3079(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 93)
    public final void method660(int arg0) {
        int var2 = -118 % ((arg0 - 1) / 41);
        if (~super.field3733 > -1 && ~super.field3733 < -128) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field1815;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(ILmfa;)V", line = 108)
    public class141(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)I", line = 113)
    public final int method666(byte arg0, int arg1) {
        ++field1812;
        if (arg0 != 112) {
            field1822 = 103;
        }
        return 1;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(BI)V", line = 125)
    public final void method659(byte arg0, int arg1) {
        ++field1821;
        super.field3733 = arg1;
        if (arg0 >= -114) {
            field1823 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)Lmfa;", line = 139)
    public static final class640 method983(int arg0) {
        ++field1818;
        class29 var1 = null;
        if (arg0 < 108) {
            return null;
        } else {
            class640 var2 = new class640(class536.field7555, 0);
            try {
                class370 var3 = class27.field395.method3422("", 74, true);
                while (~var3.field5314 == -1) {
                    class117.method820(false, 1L);
                }
                if (~var3.field5314 == -2) {
                    var1 = (class29) var3.field5317;
                    byte[] var4 = new byte[(int) var1.method215((byte) 116)];
                    int var6;
                    for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                        var6 = var1.method212(var4, var4.length + -var5, var5, 19065);
                        if (var6 == -1) {
                            throw new IOException("EOF");
                        }
                    }
                    var2 = new class640(new class120(var4), class536.field7555, 0);
                }
            } catch (Exception var8) {
            }
            try {
                if (var1 != null) {
                    var1.method210(14471);
                }
            } catch (Exception var7) {
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/io/File;I[B)V", line = 197)
    public static final void method984(int arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        ++field1814;
        if (arg0 != -1) {
            field1823 = null;
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg3, 0, arg2);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
