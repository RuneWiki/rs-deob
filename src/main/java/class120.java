import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class120 extends class96 {

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lna;")
    public static class26 field1870 = class69.method505("(U0a )2 via: ", (byte) -127);

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Lna;")
    public class26 field1878;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
    public static boolean field1869;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 6)
    public final void method823(boolean arg0) {
        field1881++;
        this.field1564 = class128.method869((byte) -55) + 500L | Long.MIN_VALUE & this.field1564;
        if (!arg0) {
            method834(-42);
        }
        class138.field2114.method1695(this, (byte) -127);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 22)
    public static final void method824(int arg0) {
        field1879++;
        if (class187.field2904 == -1 || class116.field1828 == -1) {
            return;
        }
        int var1 = ((class283.field4736 - class287.field4798) * class252.field4142 >> 16) + class287.field4798;
        float[] var2 = new float[3];
        class252.field4142 += var1;
        if (class252.field4142 >= 65535) {
            class252.field4142 = 65535;
            if (class2.field14) {
                class118.field1847 = false;
            } else {
                class118.field1847 = true;
            }
            class2.field14 = true;
        } else {
            class2.field14 = false;
            class118.field1847 = false;
        }
        if (arg0 != 65535) {
            return;
        }
        float var3 = (float) class252.field4142 / 65535.0F;
        int var4 = class233.field3690 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = (class258.field4204[class187.field2904][var4 + 2][var5] + class258.field4204[class187.field2904][var4 - -2][var5] - class258.field4204[class187.field2904][var4 + 3][var5]) * 3;
            int var7 = class258.field4204[class187.field2904][var4][var5];
            int var8 = class258.field4204[class187.field2904][var4 + 1][var5] * 3;
            int var9 = class258.field4204[class187.field2904][var4][var5] * 3;
            int var10 = var8 - var9;
            int var11 = var9 + var6 - (var8 * 2);
            int var12 = class258.field4204[class187.field2904][var4 + 2][var5] + var8 - var7 - var6;
            var2[var5] = (((float) var12 * var3 + (float) var11) * var3 + (float) var10) * var3 + (float) var7;
        }
        class178.field2793 = (int) var2[1] * -1;
        class324.field5589 = (int) var2[0] - (class12.field157 * 128);
        class14.field231 = (int) var2[2] - (class165.field2568 * 128);
        float[] var13 = new float[3];
        int var14 = class160.field2510 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class258.field4204[class116.field1828][var14][var15] * 3;
            int var17 = (class258.field4204[class116.field1828][var14 + 2][var15] + class258.field4204[class116.field1828][var14 - -2][var15] - class258.field4204[class116.field1828][var14 + 3][var15]) * 3;
            int var18 = class258.field4204[class116.field1828][var14][var15];
            int var19 = class258.field4204[class116.field1828][var14 + 1][var15] * 3;
            int var20 = var19 - var16;
            int var21 = var16 + var17 - (var19 * 2);
            int var22 = class258.field4204[class116.field1828][var14 + 2][var15] + var19 - var17 - var18;
            var13[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var20) * var3 + (float) var18;
        }
        float var23 = var13[0] - var2[0];
        float var24 = var13[2] - var2[2];
        float var25 = (var13[1] - var2[1]) * -1.0F;
        double var26 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        class123.field1915 = (float) Math.atan2((double) var25, var26);
        class7.field80 = -((float) Math.atan2((double) var23, (double) var24));
        class312.field5335 = (int) ((double) class123.field1915 * 325.949D) & 0x7FF;
        class230.field3660 = (int) ((double) class7.field80 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)J", line = 129)
    public final long method825(boolean arg0) {
        if (!arg0) {
            this.method827(90);
        }
        field1873++;
        return this.field1564 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILve;Z)Lok;", line = 140)
    public static final class150 method826(int arg0, class266 arg1, boolean arg2) {
        field1865++;
        if (class141.method938((byte) -127, arg1, arg0)) {
            return arg2 ? class10.method68((byte) -40) : (class150) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I", line = 154)
    public final int method827(int arg0) {
        if (arg0 != 2063817568) {
            this.field1877 = -47;
        }
        field1872++;
        return (int) (this.field2293 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)I", line = 169)
    public final int method828(byte arg0) {
        int var2 = -88 / ((arg0 - 83) / 34);
        field1868++;
        return (int) this.field2293;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Laa;", line = 181)
    public static final class9 method829(int arg0, int arg1) {
        field1866++;
        class9 var2 = (class9) class126.field1952.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field509.method1889(34, (byte) -122, arg0);
        if (arg1 != 0) {
            field1870 = (class26) null;
        }
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method56((byte) -115, new class82(var3), arg0);
        }
        class126.field1952.method1978((byte) -86, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 207)
    public static final String method830(String arg0, String arg1, int arg2, String arg3) {
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg1.length())) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
        }
        field1871++;
        int var5 = -20 % ((arg2 - 59) / 46);
        return arg3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILbe;)V", line = 226)
    public static final void method831(int arg0, int arg1, int arg2, class297 arg3) {
        field1874++;
        if (class95.field1549 != null || class11.field153) {
            return;
        }
        if (arg2 < 61) {
            method831(19, 20, -32, (class297) null);
        }
        if (arg3 == null || class302.method2121(0, arg3) == null) {
            return;
        }
        class95.field1549 = arg3;
        class163.field2540 = class302.method2121(0, arg3);
        class254.field4150 = arg1;
        class324.field5563 = false;
        class276.field4617 = 0;
        class313.field5346 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILna;JI)V", line = 249)
    public static final void method832(int arg0, int arg1, int arg2, int arg3, class26 arg4, long arg5, int arg6) {
        field1880++;
        class82 var8 = new class82(128);
        var8.method591((byte) -101, 10);
        var8.method643(-20037, (int) (Math.random() * 99999.0D));
        var8.method643(arg1 - 30640, 530);
        var8.method579(arg5, -2037491440);
        var8.method577(-122, (int) (Math.random() * 9.9999999E7D));
        var8.method584(0, arg4);
        var8.method577(-123, (int) (Math.random() * 9.9999999E7D));
        var8.method643(-20037, class301.field5184);
        var8.method591((byte) -125, arg0);
        var8.method591((byte) -8, arg3);
        if (arg1 != 10603) {
            method835((byte) -43);
        }
        var8.method577(-127, (int) (Math.random() * 9.9999999E7D));
        var8.method643(-20037, arg6);
        var8.method643(arg1 ^ 0xFFFF98D0, arg2);
        var8.method577(-127, (int) (Math.random() * 9.9999999E7D));
        var8.method639(class292.field4859, class144.field2190, -296);
        class114.field1789.field1301 = 0;
        class114.field1789.method591((byte) -46, 36);
        class114.field1789.method591((byte) -41, var8.field1301);
        class114.field1789.method592(var8.field1280, 0, var8.field1301, 115);
        class259.field4238 = -3;
        class127.field1969 = 1;
        class108.field1692 = 0;
        class300.field5174 = 0;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V", line = 284)
    public final void method833(byte arg0) {
        this.field1564 |= Long.MIN_VALUE;
        if (this.method825(true) == 0L) {
            class136.field2080.method1695(this, (byte) -128);
        }
        field1883++;
        if (arg0 != 33) {
            field1882 = 3;
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 306)
    public static void method834(int arg0) {
        if (arg0 == 3) {
            field1870 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V", line = 327)
    public class120(int arg0, int arg1) {
        this.field2293 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V", line = 336)
    public static final void method835(byte arg0) {
        class85.field1388.method1986((byte) -109);
        if (arg0 != 3) {
            field1869 = false;
        }
        class88.field1447.method1986((byte) -123);
        field1867++;
        class5.field59.method1986((byte) -106);
    }
}
