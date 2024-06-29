import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class126 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Luv;")
    public static class2 field1894 = new class2(19, -1);

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Lt;")
    public class398 field1903;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lba;")
    public class502 field1897;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 3)
    public static final void method924(byte arg0) {
        field1901++;
        if (!class454.field6661.method1533(-1, class113.field1723) && class521.field7651 != class151.field2295) {
            class498.method2963(10, (byte) 127, class161.field2414, class116.field1743, false);
        } else if (arg0 == -4) {
            class314.method1973((byte) -106, class407.field6147);
            if (class521.field7651 != class289.field4340) {
                class440.method2586(arg0 + 2);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lya;B)V", line = 24)
    public static final void method925(class11 arg0, byte arg1) {
        field1895++;
        if (class261.field3906.method2960(false) == 0) {
            return;
        }
        if (class113.field1723 == 0) {
            for (class201 var4 = (class201) class261.field3906.method2957(111); var4 != null; var4 = (class201) class261.field3906.method2947(32)) {
                class164.field2437.method1755(class267.field3975, var4.field2933, var4.field2934, false, false, (byte) -108, var4.field2931, var4.field2927, var4.field2929, var4.field2928 ? class410.field6198.field7104 : null, arg0, arg0);
                var4.method876((byte) -96);
            }
            class134.method988(arg1 - 28949);
        } else {
            if (class348.field5366 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class348.field5366 = class11.method76(0, class274.field4096, 8, var2, class25.field375, 0);
                class291.field4363 = class348.field5366.method61(class19.method210(class529.field7795, 0, class172.field2523, (byte) 123), class319.method1995(class142.field2146, class172.field2523, 0), true);
            }
            for (class201 var3 = (class201) class261.field3906.method2957(106); var3 != null; var3 = (class201) class261.field3906.method2947(110)) {
                class164.field2437.method1755(class291.field4363, var3.field2933, var3.field2934, false, false, (byte) 43, var3.field2931, var3.field2927, var3.field2929, var3.field2928 ? class410.field6198.field7104 : null, arg0, class348.field5366);
                var3.method876((byte) -96);
            }
        }
        if (arg1 != 4) {
            method929((byte) 7);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIZIII)V", line = 79)
    public static final void method926(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class215.field3065 = arg4;
        class227.field3208 = arg1;
        field1896++;
        class305.field4564 = arg3;
        class333.field5159 = arg5;
        class226.field3194 = arg0;
        if (class215.field3065 >= 100) {
            int var6 = class227.field3208 * 128 + 64;
            int var7 = class333.field5159 * 128 + 64;
            int var8 = class50.method373(class521.field7651, 14966, var7, var6) - class226.field3194;
            int var9 = var6 - class282.field4263;
            int var10 = var8 - class201.field2925;
            int var11 = var7 - class393.field5897;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class350.field5383 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class431.field6396 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class350.field5383 < 1024) {
                class350.field5383 = 1024;
            }
            class487.field7247 = 0;
            if (class350.field5383 > 3072) {
                class350.field5383 = 3072;
            }
        }
        class350.field5388 = 2;
        if (!arg2) {
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(JIIBZ)Ljava/lang/String;", line = 132)
    public static final String method927(long arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 != -26) {
            field1898 = 33;
        }
        field1902++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)[Lfp;", line = 212)
    public static final class437[] method928(int arg0) {
        field1904++;
        if (arg0 != 128) {
            method926(92, 60, false, -75, -123, -43);
        }
        return new class437[] { class316.field4879, class257.field3494, class487.field7248, class56.field763, class300.field4455, class27.field390, class427.field6368, class414.field6247, class275.field4104, class117.field1751, class175.field2582, class257.field3493, class118.field1798, class75.field1061 };
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V", line = 225)
    public static void method929(byte arg0) {
        field1894 = null;
        int var1 = -4 / ((arg0 + 46) / 44);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIIZI)I", line = 234)
    public static final int method930(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1899++;
        class411 var5 = class171.method1179(arg3, true, arg1);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg2 != -24554) {
            method924((byte) 112);
        }
        for (int var7 = 0; var7 < var5.field6200.length; var7++) {
            if (var5.field6200[var7] >= 0 && class164.field2437.field4234 > var5.field6200[var7]) {
                class81 var8 = class164.field2437.method1749(var5.field6200[var7], -20230);
                int var9 = var8.method586(arg4, arg2 + 24428, class260.field3873.method2676(arg4, (byte) -14).field2717);
                if (arg0) {
                    var6 += var5.field6201[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)I", line = 273)
    public static final int method931(int arg0, String arg1) {
        field1900++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == 3032) {
            for (int var2 = 0; var2 < class222.field3162; var2++) {
                if (arg1.equalsIgnoreCase(class134.field1996[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -46;
        }
    }
}
