import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class86 extends class306 {

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    private int field1129 = 1;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    private int field1133 = 1;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field1136 = 204;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "Z")
    public static boolean field1141 = false;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "[I")
    public static int[] field1138 = new int[1000];

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "Lcf;")
    public static class149 field1135;

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 4)
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(II)Lfa;", line = 10)
    public static final class222 method543(int arg0, int arg1) {
        class222 var2 = (class222) class77.field1013.method1998(-1114531641, (long) arg1);
        field1132++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class344.field5467.method100(0, arg1 & 0x7FFF, (byte) -107);
        } else {
            var3 = class92.field1207.method100(0, arg1, (byte) -107);
        }
        int var4 = -19 % ((74 - arg0) / 43);
        class222 var5 = new class222();
        if (var3 != null) {
            var5.method1549(new class143(var3), (byte) 43);
        }
        if (arg1 >= 32768) {
            var5.method1555((byte) 17);
        }
        class77.field1013.method2000(var5, (byte) 47, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V", line = 40)
    public static void method544(byte arg0) {
        field1135 = null;
        field1138 = null;
        if (arg0 != -107) {
            method543(-28, -60);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)I", line = 53)
    public static final int method545(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg1 & 0xF;
        if (arg3 != 4096) {
            method546((String) null, (byte) 31, -82, (String) null);
        }
        field1131++;
        int var6 = var5 < 8 ? arg0 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg0 : arg4);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V", line = 72)
    public static final void method546(String arg0, byte arg1, int arg2, String arg3) {
        field1140++;
        class170.field2593 = arg0;
        class296.field4666 = arg3;
        class117.field1638 = arg2;
        if (class170.field2593.equals("") || class296.field4666.equals("")) {
            class30.field353 = 3;
        } else if (class196.field2976 == -1) {
            class70.field877 = 0;
            class30.field353 = -3;
            class52.field603 = 0;
            class50.field572 = 1;
            class143 var4 = new class143(128);
            var4.method1055(10, 90);
            var4.method1052((int) (Math.random() * 9.9999999E7D), false);
            var4.method1039(class294.method2093((byte) 100, class170.field2593), (byte) -55);
            var4.method1052((int) (Math.random() * 9.9999999E7D), false);
            var4.method1050(class296.field4666, -110);
            var4.method1052((int) (Math.random() * 9.9999999E7D), false);
            var4.method1064(class357.field5662, 121, class296.field4655);
            class328.field5282.field2295 = 0;
            class328.field5282.method1055(24, 79);
            class328.field5282.method1055(var4.field2295 + 2, 112);
            class328.field5282.method1003(549, -2);
            class328.field5282.method1000(var4.field2295, 0, var4.field2260, (byte) -95);
            if (arg1 >= -28) {
                field1142 = 6;
            }
        } else {
            class85.method541(false);
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 118)
    public static final void method547(int arg0) {
        field1139++;
        if (arg0 != -1) {
            field1141 = true;
        }
        for (class110 var1 = (class110) class91.field1197.method1812(1); var1 != null; var1 = (class110) class91.field1197.method1809(arg0 + 129)) {
            class227 var2 = var1.field1515;
            if (class219.field3290 != var2.field3434 || var2.field3442) {
                var1.method1290(109);
            } else if (class102.field1381 >= var2.field3454) {
                var2.method1575(class266.field4193, (byte) -42);
                if (var2.field3442) {
                    var1.method1290(-13);
                } else {
                    class214.method1495(var2.field3434, var2.field3438, var2.field3433, var2.field3431, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I", line = 155)
    public static final int method548(int arg0, int arg1, int arg2) {
        int var3 = class280.method2006(48, arg1 - 1, arg2 - 1) + class280.method2006(111, arg1 - 1, arg2 - -1) + class280.method2006(-121, arg1 + 1, arg2 - 1) + class280.method2006(69, arg1 + 1, arg2 + 1);
        field1134++;
        int var4 = class280.method2006(arg0 ^ 0x47, arg1, arg2 - 1) - (-class280.method2006(76, arg1, arg2 + 1) - class280.method2006(-107, arg1 - 1, arg2)) + class280.method2006(-72, arg1 + 1, arg2);
        int var5 = class280.method2006(arg0 ^ 0x77, arg1, arg2);
        return arg0 == 8 ? var5 / 4 + var3 / 16 + var4 / 8 : -63;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILlf;I)V", line = 185)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1133 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field1129 = arg1.method1043(true);
        } else if (arg2 == 2) {
            this.field1136 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            this.field1129 = -4;
        }
        field1137++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I", line = 231)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            this.field1133 = -2;
        }
        field1130++;
        int[] var3 = this.field4757.method903(arg0, arg1 + 1546337432);
        if (this.field4757.field1898) {
            for (int var4 = 0; var4 < class31.field367; var4++) {
                int var5 = class111.field1553[arg0];
                int var6 = this.field1129 * var5 >> 12;
                int var7 = var5 % (4096 / this.field1129) * this.field1129;
                int var8 = class25.field288[var4];
                int var9 = this.field1133 * var8 >> 12;
                int var10 = var8 % (4096 / this.field1133) * this.field1133;
                if (this.field1136 > var7) {
                    for (var9 -= var6; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field1136) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1136 > var10) {
                    int var11;
                    for (var11 = var9 - var6; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
