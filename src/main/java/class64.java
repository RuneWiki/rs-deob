import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class64 extends class31 {

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "[[B")
    public static byte[][] field1210 = new byte[50][];

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "[I")
    public static int[] field1200 = new int[14];

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1209 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "F")
    public static float field1208;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!naa", name = "K", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "[Lmca;")
    public static class29[] field1214;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method655(boolean arg0) {
        field1207++;
        if (class438.field6398) {
            return;
        }
        if (class287.field4270.field3685) {
            class105.field1635 = ((int) class105.field1635 + 47 & 0xFFFFFFF0);
        } else {
            class290.field4303 += (12.0F - class290.field4303) / 2.0F;
        }
        class700.field9892 = true;
        class438.field6398 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lut;Lgi;IIIIIIIIIIIII)V", line = 30)
    public class64(class109 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1211 = arg11;
        this.field1212 = arg14;
        this.field1203 = arg10;
        this.field1205 = arg9;
        this.field1215 = arg13;
        this.field1202 = arg12;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lrw;", line = 44)
    public class703 method351(byte arg0) {
        field1201++;
        if (arg0 <= 73) {
            field1200 = null;
        }
        return class333.field4944;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZILok;II[I)Lot;", line = 63)
    public static final class546 method656(boolean arg0, int arg1, class228 arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 < 106) {
            method658((byte) 47, false, 1, 88);
        }
        field1204++;
        if (!arg2.field3521 && (!class284.method1835(arg3, 108) || !class284.method1835(arg1, 47))) {
            return arg2.field3471 ? new class546(arg2, 34037, arg3, arg1, arg0, arg5) : new class546(arg2, arg3, arg1, class2.method9(arg3, 84), class2.method9(arg1, -60), arg5);
        } else {
            return new class546(arg2, 3553, arg3, arg1, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZI)I", line = 84)
    public static final int method657(boolean arg0, int arg1) {
        field1198++;
        if (class254.field3898 == null) {
            return 0;
        } else if (arg0 || class185.field2592 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class254.field3898.length; var3++) {
                int var4 = class254.field3898[var3];
                if (class141.field2086.method2997((byte) -95, var4)) {
                    var2++;
                }
                if (class558.field7879.method2997((byte) -95, var4)) {
                    var2++;
                }
            }
            if (arg1 != 4071) {
                method655(true);
            }
            return var2;
        } else {
            return class254.field3898.length * 2;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZII)Ljava/lang/String;", line = 123)
    public static final String method658(byte arg0, boolean arg1, int arg2, int arg3) {
        field1213++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (arg0 <= 126) {
            method660(48);
        }
        if (!arg1 || arg3 < 0) {
            return Integer.toString(arg3, arg2);
        }
        int var4 = 2;
        int var5 = arg3 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        char[] var6 = new char[var4];
        var6[0] = '+';
        for (int var7 = var4 - 1; var7 > 0; var7--) {
            int var8 = arg3;
            arg3 /= arg2;
            int var9 = var8 - (arg2 * arg3);
            if (var9 < 10) {
                var6[var7] = (char) (var9 + 48);
            } else {
                var6[var7] = (char) (var9 + 87);
            }
        }
        return new String(var6);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)I", line = 175)
    public static final int method659(int arg0, int arg1, int arg2) {
        field1216++;
        int var3 = arg0;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V", line = 199)
    public static void method660(int arg0) {
        field1210 = null;
        field1214 = null;
        if (arg0 < -78) {
            field1200 = null;
            field1209 = null;
        }
    }
}
