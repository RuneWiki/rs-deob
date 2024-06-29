import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class107 implements class198 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljg;")
    private class42 field1744 = new class42(256);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Laj;")
    private class151 field1746;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Laj;")
    private class151 field1743;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Laa;")
    private class176[] field1745;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "J")
    public static long field1748 = 0L;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public static int[] field1751 = new int[500];

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[Lfc;")
    public static class41[] field1752;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIIZFI)[I")
    public final int[] method795(boolean arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5) {
        field1760++;
        if (!arg3) {
            method797(-88, -38, -100, (class151) null);
        }
        return this.method803(255, arg2).method720((byte) -28, arg1, arg0, this.field1743, this, arg5, (double) arg4, this.field1745[arg2].field2837);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Z")
    public final boolean method796(boolean arg0, int arg1) {
        field1755++;
        if (arg0) {
            this.field1745 = null;
        }
        class101 var3 = this.method803(255, arg1);
        return var3 != null && var3.method714(this, 110, this.field1743);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILaj;)Lmd;")
    public static final class273 method797(int arg0, int arg1, int arg2, class151 arg3) {
        field1754++;
        if (class167.method1242(arg3, arg0, arg2, 64)) {
            int var4 = 44 / ((arg1 - 48) / 55);
            return class171.method1273((byte) 115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)Lhg;")
    public static final class207 method798(int arg0, int arg1, byte arg2) {
        field1757++;
        class207 var3 = class222.method1574(125, arg0);
        if (arg1 == -1) {
            return var3;
        } else {
            if (arg2 != -71) {
                method798(-101, -126, (byte) 101);
            }
            return var3 == null || var3.field3462 == null || arg1 >= var3.field3462.length ? null : var3.field3462[arg1];
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Laa;")
    public final class176 method799(int arg0, byte arg1) {
        if (arg1 >= -25) {
            field1758 = -120;
        }
        field1750++;
        return this.field1745[arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIIIII)V")
    public static final void method800(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1747++;
        int var6 = arg4 - arg2;
        int var7 = arg5 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class131.method979(arg1, arg3, arg4, false, arg2);
            }
        } else if (var6 == 0) {
            class271.method1910(arg1, (byte) 37, arg5, arg3, arg2);
        } else {
            int var8 = (var6 << 12) / var7;
            if (!arg0) {
                field1749 = -89;
            }
            int var9 = arg2 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class23.field423) {
                var10 = (class23.field423 * var8 >> 12) + var9;
                var11 = class23.field423;
            } else if (class272.field4552 >= arg5) {
                var10 = arg4;
                var11 = arg5;
            } else {
                var10 = (class272.field4552 * var8 >> 12) + var9;
                var11 = class272.field4552;
            }
            int var12;
            int var13;
            if (arg3 < class23.field423) {
                var12 = var9 + (class23.field423 * var8 >> 12);
                var13 = class23.field423;
            } else if (arg3 <= class272.field4552) {
                var13 = arg3;
                var12 = arg2;
            } else {
                var13 = class272.field4552;
                var12 = var9 + (class272.field4552 * var8 >> 12);
            }
            if (class55.field972 > var10) {
                var10 = class55.field972;
                var11 = (class55.field972 - var9 << 12) / var8;
            } else if (var10 > class240.field4053) {
                var10 = class240.field4053;
                var11 = (class240.field4053 - var9 << 12) / var8;
            }
            if (class55.field972 > var12) {
                var13 = (class55.field972 - var9 << 12) / var8;
                var12 = class55.field972;
            } else if (class240.field4053 < var12) {
                var13 = (class240.field4053 - var9 << 12) / var8;
                var12 = class240.field4053;
            }
            class64.method438(var11, var12, var13, var10, arg1, -119);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method801(boolean arg0, byte arg1, String arg2) {
        if (arg1 != 119) {
            return;
        }
        if (arg0) {
            try {
                class154.field2556.getAppletContext().showDocument(new URL(class154.field2556.getCodeBase(), arg2), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class288.method2005(class142.field2344.field1380, (byte) 100, "loggedout");
            } catch (Throwable var4) {
            }
            try {
                class154.field2556.getAppletContext().showDocument(new URL(class154.field2556.getCodeBase(), arg2), "_top");
            } catch (Exception var3) {
            }
        }
        field1756++;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Laj;Laj;Laj;)V")
    public class107(class151 arg0, class151 arg1, class151 arg2) {
        this.field1746 = arg1;
        this.field1743 = arg2;
        class249 var4 = new class249(arg0.method1149(0, (byte) 65, 0));
        int var5 = var4.method1821((byte) 51);
        this.field1745 = new class176[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1802((byte) -122) == 1) {
                this.field1745[var6] = new class176();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1745[var7] != null) {
                this.field1745[var7].field2843 = var4.method1802((byte) -123) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1745[var8] != null) {
                this.field1745[var8].field2842 = var4.method1802((byte) -88) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1745[var9] != null) {
                this.field1745[var9].field2840 = var4.method1802((byte) -95) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1745[var10] != null) {
                var4.method1802((byte) -100);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1745[var11] != null) {
                var4.method1768(125);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1745[var12] != null) {
                var4.method1768(127);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1745[var13] != null) {
                var4.method1768(86);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1745[var14] != null) {
                var4.method1768(97);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1745[var15] != null) {
                this.field1745[var15].field2838 = (short) var4.method1821((byte) 51);
            }
        }
        if (var4.field4182.length > var4.field4160) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1745[var16] != null) {
                    var4.method1768(79);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1745[var17] != null) {
                    var4.method1768(78);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1745[var18] != null) {
                    var4.method1802((byte) -104);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1745[var19] != null) {
                    this.field1745[var19].field2837 = var4.method1802((byte) 35) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1745[var20] != null) {
                    var4.method1768(80);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1745[var21] != null) {
                    var4.method1802((byte) 55);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1745[var22] != null) {
                    var4.method1802((byte) -120);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1745[var23] != null) {
                    var4.method1802((byte) -104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field1752 = null;
        if (arg0 == -16664) {
            field1751 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Lej;")
    public class101 method803(int arg0, int arg1) {
        field1753++;
        if (arg0 != 255) {
            this.field1743 = null;
        }
        class155 var3 = this.field1744.method252((long) arg1, false);
        if (var3 != null) {
            return (class101) var3;
        }
        byte[] var4 = this.field1746.method1119(-2, arg1);
        if (var4 == null) {
            return null;
        } else {
            class101 var5 = new class101(new class249(var4));
            this.field1744.method247(var5, (long) arg1, -88);
            return var5;
        }
    }
}
