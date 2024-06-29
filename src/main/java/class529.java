import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class529 extends class303 {

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "[I")
    public static int[] field7449 = new int[4];

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "[I")
    public static int[] field7455 = new int[8];

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "B")
    public byte field7447;

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!iba", name = "A", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!iba", name = "B", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "Lee;")
    public class675 field7453;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BLag;)I")
    public static final int method3079(byte arg0, class682 arg1) {
        ++field7446;
        if (arg0 != -5) {
            field7455 = null;
        }
        int var2 = arg1.method3821(2, (byte) 108);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (~var2 == -2) {
            var3 = arg1.method3821(5, (byte) 108);
        } else if (~var2 == -3) {
            var3 = arg1.method3821(8, (byte) 108);
        } else {
            var3 = arg1.method3821(11, (byte) 108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Low;")
    public static final class346 method3080(int arg0, int arg1) {
        ++field7452;
        class346 var2 = (class346) class606.field8524.method4022((long) arg1, (byte) 108);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class511.field7308.method2100(arg1, (byte) 112, arg0);
            class346 var4 = new class346();
            if (var3 != null) {
                var4.method2237(new class675(var3), arg1, (byte) -43);
            }
            class606.field8524.method4018((byte) 127, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
    public final int method734(int arg0) {
        ++field7456;
        if (this.field7453 == null) {
            return 0;
        } else {
            return arg0 != 0 ? 86 : this.field7453.field9146 * 100 / (this.field7453.field9154.length + -this.field7447);
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)[B")
    public final byte[] method735(byte arg0) {
        ++field7451;
        if (!super.field4256 && ~(this.field7453.field9154.length + -this.field7447) >= ~this.field7453.field9146) {
            if (arg0 != 68) {
                this.field7447 = -69;
            }
            return this.field7453.field9154;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method3081(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field7454;
        if (arg2 != 63) {
            return null;
        } else {
            char[] var4 = new char[arg3];
            int var5 = 0;
            for (int var6 = 0; ~arg3 < ~var6; ++var6) {
                int var7 = 255 & arg0[arg1 + var6];
                if (~var7 != -1) {
                    if (~var7 <= -129 && ~var7 > -161) {
                        char var8 = class322.field4457[var7 + -128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "(I)V")
    public static void method3082(int arg0) {
        if (arg0 != 4) {
            method3081((byte[]) null, 93, 3, -108);
        }
        field7455 = null;
        field7449 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "([BB)[B")
    public static final byte[] method3083(byte[] arg0, byte arg1) {
        ++field7448;
        if (arg1 != 95) {
            method3082(-101);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class255.method1690(arg0, 0, var3, 0, var2);
        return var3;
    }
}
