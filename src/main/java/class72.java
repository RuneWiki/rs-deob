import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class72 {

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lmh;")
    public static class62 field1105 = class201.method1405(true, "<img=1>");

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Z")
    public static boolean field1107 = true;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field1101 = 0;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lmh;")
    public static class62 field1109 = class201.method1405(true, "Abbrechen");

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field1108 = 1;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[B")
    public byte[] field1092;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[B")
    public byte[] field1104;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[[[B")
    public static byte[][][] field1110;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[[[I")
    public static int[][][] field1106;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsg;I)Lsg;", line = 16)
    public static final class191 method515(class191 arg0, int arg1) {
        field1093++;
        if (arg0.field3074 != -1) {
            return class1.method2(arg0.field3074, (byte) -37);
        }
        int var2 = arg0.field3142 >>> 16;
        class230 var3 = new class230(class214.field3632);
        for (class146 var4 = (class146) var3.method1626((byte) -18); var4 != null; var4 = (class146) var3.method1629((byte) 84)) {
            if (var4.field2312 == var2) {
                return class1.method2((int) var4.field3499, (byte) -37);
            }
        }
        if (arg1 >= -68) {
            field1110 = (byte[][][]) ((byte[][][]) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBII)I", line = 50)
    public static final int method516(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 40) {
            return 86;
        }
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        field1090++;
        return (arg0 >> 5 << 7) + (arg2 >> 2 << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBI)V", line = 88)
    public static final void method517(int arg0, int arg1, byte arg2, int arg3) {
        field1100++;
        class151 var4 = class165.method1194((byte) 1, 11, arg0);
        var4.method1088(124);
        int var5 = -45 / ((arg2 + 47) / 47);
        var4.field2388 = arg1;
        var4.field2395 = arg3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZ)V", line = 120)
    public static final void method518(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1096++;
        if (arg4) {
            return;
        }
        if (class176.field2819 <= arg0 - arg2 && (arg0 + arg2) <= class52.field755 && class99.field1630 <= (arg1 - arg2) && class81.field1348 >= (arg1 + arg2)) {
            class150.method1079(arg0, arg3, arg2, (byte) -55, arg1);
        } else {
            class135.method1028(arg0, arg3, arg2, arg1, 9464);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)[Lwj;", line = 148)
    public static final class135[] method519(byte arg0) {
        field1099++;
        class135[] var1 = new class135[class12.field100];
        if (arg0 < 100) {
            return (class135[]) null;
        }
        for (int var2 = 0; var2 < class12.field100; var2++) {
            int var3 = class184.field2940[var2] * class15.field132[var2];
            byte[] var4 = class42.field645[var2];
            if (class218.field3759[var2]) {
                byte[] var7 = class54.field802[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class270.method1854(class235.field4048[class234.method1648(var4[var9], 255)], class234.method1648(255, var7[var9]) << 24);
                }
                var1[var2] = new class255(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class235.field4048[class234.method1648(255, var4[var6])];
                }
                var1[var2] = new class257(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], var5);
            }
        }
        class135.method1020(-113);
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 209)
    public static void method520(byte arg0) {
        field1109 = null;
        if (arg0 >= 97) {
            field1105 = null;
            field1106 = (int[][][]) null;
            field1110 = (byte[][][]) null;
        }
    }
}
