import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class614 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lqr;")
    private class65 field8165 = new class65(64);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lwu;")
    private class376 field8169;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Ldia;")
    public static class235 field8168 = new class235("", 19);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILd;IILha;II)V")
    public static final void method3338(int arg0, class152 arg1, int arg2, int arg3, class59 arg4, int arg5, int arg6) {
        field8166++;
        if (class178.field2687 < 100) {
            class700.method3944(arg1, arg4, (byte) -84);
        }
        arg4.method419(arg5, arg6, arg5 + arg0, arg2 + arg6);
        if (class178.field2687 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg5;
            int var9 = arg6 + arg2 / 2 - var7 - 18;
            arg4.method504(arg5, arg6, arg0, arg2, -16777216, 0);
            arg4.method455(var8 - 152, var9, 304, 34, class74.field904[class287.field4064].getRGB(), 0);
            arg4.method504(var8 - 150, var9 + 2, class178.field2687 * 3, 30, class567.field7455[class287.field4064].getRGB(), 0);
            class64.field785.method513(var8, -94, class517.field6858.method2877(class713.field9854, (byte) -108), var7 + var9, class5.field126[class287.field4064].getRGB(), -1);
            return;
        }
        int var10 = class194.field2929 - ((int) ((float) arg0 / class744.field10349));
        if (arg3 != -1) {
            method3340(79, null);
        }
        int var11 = (int) ((float) arg2 / class744.field10349) + class432.field5949;
        int var12 = class194.field2929 + ((int) ((float) arg0 / class744.field10349));
        class703.field9754 = (int) ((float) (arg2 * 2) / class744.field10349);
        class347.field4879 = class194.field2929 - ((int) ((float) arg0 / class744.field10349));
        int var13 = class432.field5949 - ((int) ((float) arg2 / class744.field10349));
        class348.field4880 = class432.field5949 - ((int) ((float) arg2 / class744.field10349));
        class613.field8163 = (int) ((float) (arg0 * 2) / class744.field10349);
        class744.method4167(class744.field10370 + var10, var11 - -class744.field10371, class744.field10370 + var12, class744.field10371 + var13, arg5, arg6, arg0 + arg5, arg2 + 1 + arg6);
        class744.method4165(arg4);
        class2 var14 = class744.method4170(arg4);
        class556.method3097(0, arg4, 0, arg3 ^ 0x1068, var14);
        if (class11.field181 > 0) {
            class440.field6076--;
            if (class440.field6076 == 0) {
                class440.field6076 = 20;
                class11.field181--;
            }
        }
        if (!class365.field5129) {
            return;
        }
        int var15 = arg5 - (5 - arg0);
        int var16 = arg2 + arg6 - 8;
        class148.field2334.method534(16776960, var15, -1, (byte) -108, var16, "Fps:" + class662.field8734);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class148.field2334.method534(var19, var15, -1, (byte) -108, var20, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method3339(int arg0) {
        field8168 = null;
        if (arg0 != -7913) {
            field8168 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILkn;)I")
    public static final int method3340(int arg0, class742 arg1) {
        field8171++;
        if (~arg1.field10293 == arg0) {
            return 0;
        }
        if (arg1.field10287 != -1) {
            class742 var2 = null;
            if (arg1.field10287 < 32768) {
                class134 var3 = (class134) class390.field5470.method2135((long) arg1.field10287, (byte) 31);
                if (var3 != null) {
                    var2 = var3.field2154;
                }
            } else if (arg1.field10287 >= 32768) {
                var2 = class248.field3438[arg1.field10287 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field3505 - var2.field3505;
                int var5 = arg1.field3502 - var2.field3502;
                if (var4 != 0 || var5 != 0) {
                    arg1.method4132(false, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class383) {
            class383 var6 = (class383) arg1;
            if (var6.field5320 != -1 && (var6.field10316 == 0 || var6.field10313 > 0)) {
                var6.method4132(false, var6.field5320);
                var6.field5320 = -1;
            }
        } else if (arg1 instanceof class556) {
            class556 var7 = (class556) arg1;
            if (var7.field7308 != -1 && (var7.field10316 == 0 || var7.field10313 > 0)) {
                int var8 = var7.field3505 - ((var7.field7308 - class503.field6752 - class503.field6752) * 256);
                int var9 = var7.field3502 - ((var7.field7316 - class334.field4757 - class334.field4757) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method4132(false, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field7308 = -1;
            }
        }
        return arg1.method4137(true);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static final void method3341(int arg0) {
        field8172++;
        short var1 = 1024;
        short var2 = 3072;
        if (class540.field7159) {
            var2 = 4096;
            if (class415.field5734) {
                var1 = 2048;
            }
        }
        if (class578.field7586 < (float) var1) {
            class578.field7586 = var1;
        }
        int var3 = -80 % ((43 - arg0) / 33);
        while (class547.field7230 >= 16384.0F) {
            class547.field7230 -= 16384.0F;
        }
        if ((float) var2 < class578.field7586) {
            class578.field7586 = var2;
        }
        while (class547.field7230 < 0.0F) {
            class547.field7230 += 16384.0F;
        }
        int var4 = class425.field5854 >> 9;
        int var5 = class116.field1879 >> 9;
        int var6 = class153.method1118(class116.field1879, class425.field5854, 32, class507.field6775);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && class719.field10004 - 4 > var4 && var5 < (class107.field1453 - 4)) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = class507.field6775;
                    if (var10 < 3 && class498.method2810(-10387, var8, var9)) {
                        var10++;
                    }
                    int var11 = 0;
                    if (class491.field6656.field6039 != null && class491.field6656.field6039[var10] != null) {
                        var11 = (class491.field6656.field6039[var10][var8][var9] & 0xFF) * 8 << 2;
                    }
                    if (class507.field6771 != null && class507.field6771[var10] != null) {
                        int var12 = var6 + var11 - class507.field6771[var10].method1742(var8, 88, var9);
                        if (var12 > var7) {
                            var7 = var12;
                        }
                    }
                }
            }
        }
        int var13 = (var7 >> 2) * 1536;
        if (var13 > 786432) {
            var13 = 786432;
        }
        if (var13 < 262144) {
            var13 = 262144;
        }
        if (var13 > class167.field2585) {
            class167.field2585 += (var13 - class167.field2585) / 24;
        } else if (class167.field2585 > var13) {
            class167.field2585 += (var13 - class167.field2585) / 80;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
    public static final boolean method3342(int arg0, int arg1, int arg2) {
        if (arg2 == 3828) {
            field8174++;
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lci;")
    public final class453 method3343(int arg0, int arg1) {
        field8167++;
        if (arg1 != -4) {
            method3339(-108);
        }
        class65 var3 = this.field8165;
        class453 var4;
        synchronized (this.field8165) {
            var4 = (class453) this.field8165.method552(arg1 ^ 0xFFFFFFF8, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field8169;
        byte[] var6;
        synchronized (this.field8169) {
            var6 = this.field8169.method2218((byte) 120, 5, arg0);
        }
        class453 var7 = new class453();
        if (var6 != null) {
            var7.method2579(new class677(var6), (byte) 121);
        }
        class65 var8 = this.field8165;
        synchronized (this.field8165) {
            this.field8165.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(FIFFFFFI)F")
    public static final float method3344(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
        field8170++;
        float var8 = 0.0F;
        float var9 = arg0 - arg5;
        float var10 = arg4 - arg6;
        float var11 = arg3 - arg2;
        float var12 = (float) arg7;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg5;
            float var16 = var8 * var10 + arg6;
            float var17 = var8 * var11 + arg2;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class719.field10004 > var18 && class107.field1453 > var19) {
                int var20 = class472.field6475.field3508;
                if (var20 < 3 && (class184.field2782[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class113.field1866[var20].method1750((byte) 100, (int) var15, (int) var17);
                if (var16 > (float) var21) {
                    if (arg1 >= 2) {
                        return method3344(var15, arg1 - 1, var14, var17, var16, var12, var13, 0) * 0.1F + var8 - 0.1F;
                    }
                    return var8;
                }
            }
            var14 = var17;
            var12 = var15;
            var13 = var16;
            var8 += 0.1F;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class614(class763 arg0, int arg1, class376 arg2) {
        this.field8169 = arg2;
        this.field8169.method2195(5, 0);
    }
}
