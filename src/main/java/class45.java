import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class45 extends class197 {

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    private int field678 = 3216;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "[I")
    private int[] field682 = new int[3];

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    private int field679 = 3216;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    private int field689 = 4096;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "Loh;")
    public static class258 field669 = class153.method1046(")2", 90);

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Loh;")
    public static class258 field673 = class153.method1046(")1 ", 106);

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "Loh;")
    public static class258 field687 = class153.method1046("<)4col>", 94);

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "Loh;")
    private static class258 field683 = class153.method1046("red:", 86);

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "Loh;")
    public static class258 field677 = field683;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "Z")
    public static boolean field672 = true;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "Loh;")
    public static class258 field685 = class153.method1046("Musik)2Engine vorbereitet)3", 99);

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "Loh;")
    public static class258 field680 = field683;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "Lme;")
    public static class295 field681;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILva;I)V", line = 14)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field689 = arg1.method1615(arg0 ^ 0x1F39);
        } else if (arg2 == 1) {
            this.field679 = arg1.method1615(arg0 - 7958);
        } else if (arg2 == 2) {
            this.field678 = arg1.method1615(-120);
        }
        if (arg0 != 7955) {
            this.method376((byte) 48);
        }
        field671++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 53)
    public static void method373(int arg0) {
        field669 = null;
        if (arg0 != 0) {
            field687 = (class258) null;
        }
        field677 = null;
        field681 = null;
        field683 = null;
        field687 = null;
        field673 = null;
        field685 = null;
        field680 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 73)
    public class45() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)I", line = 77)
    public static final int method374(int arg0, int arg1, int arg2, int arg3) {
        field674++;
        int var4 = arg0 & arg3 - 1;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = arg2 / arg3;
        if (arg1 != 16487) {
            return 81;
        }
        int var8 = class57.method441(var6, var7, (byte) -34);
        int var9 = class57.method441(var6 + 1, var7, (byte) -34);
        int var10 = class57.method441(var6, var7 + 1, (byte) -34);
        int var11 = class57.method441(var6 + 1, var7 + 1, (byte) -34);
        int var12 = class231.method1544(arg3, var4, var8, var9, (byte) 117);
        int var13 = class231.method1544(arg3, var4, var10, var11, (byte) 122);
        return class231.method1544(arg3, var5, var12, var13, (byte) 114);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 118)
    public final void method223(int arg0) {
        this.method376((byte) -98);
        if (arg0 != 11135) {
            method374(82, 23, -2, -99);
        }
        field686++;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)V", line = 131)
    public static final void method375(byte arg0) {
        class272.field4710 = (int[][][]) null;
        if (arg0 >= -100) {
            method375((byte) -126);
        }
        class243.field4223 = (short[][][]) null;
        class37.field494 = null;
        class115.field2053 = (byte[][][]) null;
        class206.field3557 = 0;
        class64.field1122 = (byte[][][]) null;
        class202.field3502 = (int[][][]) null;
        class280.field4814 = null;
        class167.field2836 = (byte[][][]) null;
        class19.field224 = (byte[][][]) null;
        field675++;
        class154.field2640 = null;
        class56.field885 = (byte[][][]) null;
        class15.field201.method80(0);
        class209.field3603 = null;
        class138.field2354 = null;
        class62.field1093 = null;
        class300.field5136 = null;
        class62.field1095 = null;
        class218.field3755 = null;
        class85.field1448 = null;
        class123.field2175 = null;
        class65.field1144 = null;
        class105.field1893 = null;
        class23.field278 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I", line = 178)
    public final int[] method96(int arg0, int arg1) {
        field670++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = class281.field4838 * this.field689 >> 12;
            int[] var5 = this.method1327(0, -119, class155.field2662 & arg1 - 1);
            int[] var6 = this.method1327(0, arg0 ^ 0x3F21, arg1);
            int[] var7 = this.method1327(0, arg0 ^ 0x3F27, arg1 + 1 & class155.field2662);
            for (int var8 = 0; var8 < class190.field3362; var8++) {
                int var9 = (var6[class48.field723 & var8 - 1] - var6[var8 + 1 & class48.field723]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class96.field1674[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field682[2] * var14 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field682[1] * var15 >> 12;
                int var19 = this.field682[0] * var17 >> 12;
                var3[var8] = var16 + var19 + var18;
            }
        }
        if (arg0 != -16221) {
            this.method376((byte) -36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(B)V", line = 252)
    private final void method376(byte arg0) {
        field684++;
        double var2 = Math.cos((double) ((float) this.field678 / 4096.0F));
        this.field682[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field679 / 4096.0F)));
        this.field682[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field679 / 4096.0F)));
        this.field682[2] = (int) (Math.sin((double) ((float) this.field678 / 4096.0F)) * 4096.0D);
        if (arg0 >= -53) {
            this.method223(-83);
        }
        int var4 = this.field682[1] * this.field682[1] >> 12;
        int var5 = this.field682[0] * this.field682[0] >> 12;
        int var6 = this.field682[2] * this.field682[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field682[0] = (this.field682[0] << 12) / var7;
            this.field682[1] = (this.field682[1] << 12) / var7;
            this.field682[2] = (this.field682[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 282)
    public static final Class method377(int arg0, String arg1) throws ClassNotFoundException {
        field676++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        }
        if (arg0 != -1812135284) {
            method373(-49);
        }
        if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }
}
