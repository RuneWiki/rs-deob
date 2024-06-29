import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class328 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field5605 = 20;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Ljc;")
    public static class185 field5607 = null;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private static int field5608;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lni;")
    public static class220 field5598;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lme;")
    public static class75 field5603;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtg;)V", line = 11)
    public static final void method2242(int arg0, class93 arg1) {
        field5606++;
        if (class212.field3708 == arg1.field1656 || arg1.field1709 == -1 || arg1.field1671 != 0 || arg1.field1708 + 1 > class284.method1973(arg1.field1709, false).field539[arg1.field1659]) {
            int var2 = arg1.field1656 - arg1.field1690;
            int var3 = class212.field3708 - arg1.field1690;
            int var4 = arg1.field1651 * 128 + (arg1.method520(true) * 64);
            int var5 = arg1.field1670 * 128 + (arg1.method520(true) * 64);
            int var6 = arg1.field1665 * 128 + arg1.method520(true) * 64;
            int var7 = arg1.field1713 * 128 + arg1.method520(true) * 64;
            arg1.field1685 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg1.field1689 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0 != 64) {
            field5607 = (class185) null;
        }
        if (arg1.field1699 == 0) {
            arg1.field1673 = 1024;
        }
        if (arg1.field1699 == 1) {
            arg1.field1673 = 1536;
        }
        if (arg1.field1699 == 2) {
            arg1.field1673 = 0;
        }
        if (arg1.field1699 == 3) {
            arg1.field1673 = 512;
        }
        arg1.field1704 = arg1.field1673;
        arg1.field1652 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)Z", line = 56)
    public static final boolean method2243(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class199.field3422 * arg0 + class123.field2143 * arg3 >> 16;
        int var6 = class199.field3422 * arg3 - class123.field2143 * arg0 >> 16;
        int var7 = class311.field5312 * var6 + class280.field4712 * arg1 >> 16;
        int var8 = class311.field5312 * arg1 - class280.field4712 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class311.field5312 * var6 + class280.field4712 * arg2 >> 16;
        int var12 = class311.field5312 * arg2 - class280.field4712 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class109.field1951 && var13 < class109.field1951) {
            return false;
        } else if (var9 > class287.field4828 && var13 > class287.field4828) {
            return false;
        } else if (var10 < class281.field4722 && var14 < class281.field4722) {
            return false;
        } else {
            return var10 <= class16.field146 || var14 <= class16.field146;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)I", line = 103)
    public static final int method2244(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class133.field2303) {
            arg3 = 1000000;
            class133.field2303 = false;
        }
        if (arg1 != 22) {
            return -98;
        }
        field5601++;
        class309 var5 = class276.field4646[arg4][arg2];
        float var6 = ((float) arg0 * 0.1F + 0.7F) * var5.field5258;
        float var7 = var5.field5260;
        float var8 = var5.field5276;
        int var9 = var5.field5270;
        int var10 = var5.field5273;
        int var11 = var5.field5269;
        if (!class52.field839) {
            var11 = 0;
        }
        if (field5608 != var9 || class316.field5435 != var6 || class34.field520 != var8 || class150.field2555 != var7 || class163.field2821 != var10 || class308.field5240 != var11) {
            class150.field2555 = var7;
            class245.field4248 = class81.field1394;
            class163.field2821 = var10;
            class314.field5418 = class245.field4258;
            class201.field3455 = 0;
            class308.field5240 = var11;
            class316.field5435 = var6;
            class205.field3585 = class292.field4901;
            field5608 = var9;
            class150.field2559 = class140.field2412;
            class182.field3110 = class253.field4361;
            class34.field520 = var8;
            class214.field3733 = class141.field2420;
        }
        if (class201.field3455 < 65536) {
            class201.field3455 += arg3 * 250;
            if (class201.field3455 >= 65536) {
                class201.field3455 = 65536;
            }
            int var12 = 65536 - class201.field3455 >> 8;
            int var13 = class201.field3455 >> 8;
            float var14 = (float) (65536 - class201.field3455) / 65536.0F;
            float var15 = (float) class201.field3455 / 65536.0F;
            class81.field1394 = ((field5608 & 0xFF00) * var13 + (class245.field4248 & 0xFF00) * var12 & 0xFF0000) + ((field5608 & 0xFF00FF) * var13 + (class245.field4248 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class292.field4901 = class205.field3585 * var14 + class150.field2555 * var15;
            class253.field4361 = class34.field520 * var15 + class182.field3110 * var14;
            class141.field2420 = ((class214.field3733 & 0xFF00FF) * var12 + (class163.field2821 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class214.field3733 & 0xFF00) * var12 + (class163.field2821 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class245.field4258 = class316.field5435 * var15 + class314.field5418 * var14;
            class140.field2412 = class150.field2559 * var12 + (class308.field5240 * var13) >> 8;
        }
        class85.method592(class81.field1394, class245.field4258, class253.field4361, class292.field4901);
        class85.method594(class141.field2420, class140.field2412);
        class85.method588((float) class306.field5208, (float) class271.field4572, (float) class87.field1551);
        class85.method591();
        return class141.field2420;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 188)
    public static void method2245(boolean arg0) {
        if (!arg0) {
            method2244(-106, (byte) -104, -37, -73, 49);
        }
        field5603 = null;
        field5607 = null;
        field5598 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Z", line = 208)
    public static final boolean method2246(byte arg0) {
        if (arg0 <= 106) {
            field5608 = 67;
        }
        field5600++;
        if (class124.field2166) {
            try {
                return !(Boolean) class9.field76.method549(class55.field881.field2109, (byte) 43);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 229)
    public static final void method2247(boolean arg0) {
        field5599++;
        class62.field964.method2172(false);
        if (!arg0) {
            method2249(-114, -24);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[JI[II)V", line = 242)
    public static final void method2248(int arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 != 1) {
            return;
        }
        field5604++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        long var6 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var6;
        int var8 = arg4;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (arg1[var10] < (long) (var10 & 0x1) + var6) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var8];
                arg1[var8] = var11;
                int var13 = arg3[var10];
                arg3[var10] = arg3[var8];
                arg3[var8++] = var13;
            }
        }
        arg1[arg2] = arg1[var8];
        arg1[var8] = var6;
        arg3[arg2] = arg3[var8];
        arg3[var8] = var9;
        method2248(1, arg1, var8 - 1, arg3, arg4);
        method2248(arg0, arg1, arg2, arg3, var8 + 1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 299)
    public static final void method2249(int arg0, int arg1) {
        if (arg0 != 0) {
            method2246((byte) -71);
        }
        field5602++;
        field5605 = 1000 / arg1;
    }
}
