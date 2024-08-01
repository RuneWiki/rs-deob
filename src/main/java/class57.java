import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ff")
public class class57 {

    @OriginalMember(owner = "ff", name = "e", descriptor = "Llf;")
    private static class109 field1156 = class35.method275("Cancel", 2);

    @OriginalMember(owner = "ff", name = "c", descriptor = "Llf;")
    public static class109 field1154 = field1156;

    @OriginalMember(owner = "ff", name = "d", descriptor = "Llf;")
    private static class109 field1155 = class35.method275("Invalid username or password)3", 2);

    @OriginalMember(owner = "ff", name = "b", descriptor = "[S")
    public static short[] field1153 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "ff", name = "k", descriptor = "Llf;")
    public static class109 field1162 = field1155;

    @OriginalMember(owner = "ff", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "ff", name = "f", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "ff", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "ff", name = "h", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "ff", name = "l", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "ff", name = "m", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "ff", name = "i", descriptor = "J")
    public static long field1160;

    @OriginalMember(owner = "ff", name = "j", descriptor = "Loh;")
    public static class138 field1161;

    @OriginalMember(owner = "ff", name = "a", descriptor = "(IZJI)Z")
    public static final boolean method374(int arg0, boolean arg1, long arg2, int arg3) {
        field1163++;
        int var5 = (int) arg2 >> 20 & 0x3;
        int var6 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (arg1) {
            return true;
        }
        int var7 = (int) arg2 >> 14 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class78 var8 = class140.method1000(var6, 0);
            int var9 = var8.field1535;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field1498;
                var11 = var8.field1501;
            } else {
                var10 = var8.field1501;
                var11 = var8.field1498;
            }
            if (var5 != 0) {
                var9 = (var9 << var5 & 0xF) + (var9 >> 4 - var5);
            }
            class55.method358(0, var11, var10, arg3, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], true, arg0, 0, var9);
        } else {
            class55.method358(0, 0, 0, arg3, var5, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], true, arg0, var7 + 1, 0);
        }
        class145.field2801 = class67.field1310;
        class90.field1858 = 0;
        class60.field1185 = class129.field2511;
        class199.field3812 = 2;
        return true;
    }

    @OriginalMember(owner = "ff", name = "a", descriptor = "(Loe;III)V")
    public static final void method375(class135 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class103.field2036) {
            class3 var4 = class78.field1550[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field27 != null && var4.field27.field1027 instanceof class135) {
                class135 var5 = (class135) var4.field27.field1027;
                class135.method959(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class103.field2036) {
            class3 var6 = class78.field1550[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field27 != null && var6.field27.field1027 instanceof class135) {
                class135 var7 = (class135) var6.field27.field1027;
                class135.method959(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class103.field2036 && arg3 < class65.field1245) {
            class3 var8 = class78.field1550[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field27 != null && var8.field27.field1027 instanceof class135) {
                class135 var9 = (class135) var8.field27.field1027;
                class135.method959(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 >= class103.field2036 || arg3 <= 0) {
            return;
        }
        class3 var10 = class78.field1550[arg1][arg2 + 1][arg3 - 1];
        if (var10 != null && var10.field27 != null && var10.field27.field1027 instanceof class135) {
            class135 var11 = (class135) var10.field27.field1027;
            class135.method959(arg0, var11, 128, 0, -128, true);
        }
    }

    @OriginalMember(owner = "ff", name = "a", descriptor = "(B)V")
    public static void method376(byte arg0) {
        field1162 = null;
        if (arg0 >= -43) {
            field1152 = -89;
        }
        field1161 = null;
        field1155 = null;
        field1153 = null;
        field1156 = null;
        field1154 = null;
    }

    @OriginalMember(owner = "ff", name = "a", descriptor = "(Lja;B)Llf;")
    public static final class109 method377(class86 arg0, byte arg1) {
        field1158++;
        if (arg1 <= 52) {
            field1161 = null;
        }
        return class105.method760(arg0, 0, 32767);
    }

    @OriginalMember(owner = "ff", name = "b", descriptor = "(B)[Lkf;")
    public static final class100[] method378(byte arg0) {
        field1159++;
        class100[] var1 = new class100[class131.field2540];
        int var2 = -33 / ((arg0 - 21) / 33);
        for (int var3 = 0; var3 < class131.field2540; var3++) {
            class100 var4 = new class100();
            var4.field2010 = class168.field3114;
            var4.field2012 = class116.field2298;
            var4.field2011 = class160.field2992[var3];
            var4.field2013 = class202.field3976[var3];
            var4.field2009 = class21.field481[var3];
            var4.field2008 = class69.field1345[var3];
            int var5 = var4.field2009 * var4.field2008;
            byte[] var6 = class10.field166[var3];
            var4.field2007 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field2007[var7] = class51.field1036[class170.method1140(255, var6[var7])];
            }
            var1[var3] = var4;
        }
        class69.method444(-109);
        return var1;
    }

    @OriginalMember(owner = "ff", name = "a", descriptor = "(II)Z")
    public static final boolean method379(int arg0, int arg1) {
        field1164++;
        if (arg1 == -13101) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ff", name = "a", descriptor = "(Lbg;ILbg;Ljava/awt/Component;)V")
    public static final void method380(class18 arg0, int arg1, class18 arg2, Component arg3) {
        field1157++;
        if (class83.field1691) {
            return;
        }
        int var4 = 115 % ((arg1 + 68) / 48);
        class11.method61();
        byte[] var5 = arg2.method156(83, class145.field2795, class132.field2546);
        class98.field1986 = new class100(var5, arg3);
        class51.field1033 = class98.field1986.method720();
        class158.field2965 = class163.method1109(class145.field2795, arg0, (byte) 75, class79.field1558);
        class34.field770 = class163.method1109(class145.field2795, arg0, (byte) 75, class84.field1707);
        class128.field2488 = class163.method1109(class145.field2795, arg0, (byte) 75, class20.field461);
        class210.field4081 = class141.method1006(class145.field2795, 107, class204.field4017, arg0);
        class82.field1612 = class141.method1006(class145.field2795, -78, class161.field3027, arg0);
        class76.field1467 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            class76.field1467[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class76.field1467[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class76.field1467[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            class76.field1467[var9 + 192] = 16777215;
        }
        class143.field2753 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            class143.field2753[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class143.field2753[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class143.field2753[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class143.field2753[var13 + 192] = 16777215;
        }
        class170.field3167 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            class170.field3167[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class170.field3167[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class170.field3167[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class170.field3167[var17 + 192] = 16777215;
        }
        class115.field2275 = new int[256];
        class190.field3641 = new int[32768];
        class10.field161 = new int[32768];
        class21.method194(null, (byte) -86);
        class134.field2570 = false;
        if (class178.field3349 == 0) {
            class47.field979 = true;
        } else {
            class47.field979 = false;
        }
        class109.field2167 = 0;
        class145.field2807 = class145.field2795;
        class145.field2787 = class145.field2795;
        class38.field819 = new int[32768];
        class12.field179 = new int[32768];
        if (class47.field979) {
            class49.method333(2, 1);
        } else {
            class181.method1238(class137.field2643, 2, class103.field2030, class145.field2795, (byte) 122, false, 255);
        }
        class41.method297(-1, false);
        class83.field1691 = true;
        class98.field1986.method730(0, 0);
        class51.field1033.method730(382, 0);
        class158.field2965.method280(382 - class158.field2965.field801 / 2, 18);
        class77.field1485 = new class100(128, 254);
        class160.field3003 = new class100(128, 254);
    }
}
