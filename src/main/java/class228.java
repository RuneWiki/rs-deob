import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class228 implements class572 {

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lin;")
    public static class380 field3317 = new class380(12, -1);

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lvt;")
    public static class768 field3319 = new class768();

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3322;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
    public boolean field3310;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILkja;I)Z")
    public static final boolean method1544(int arg0, class373 arg1, int arg2) {
        field3320++;
        int var3 = arg1.method2222(8, 2);
        if (var3 == 0) {
            if (arg1.method2222(8, 1) != 0) {
                method1544(255, arg1, arg2);
            }
            int var4 = arg1.method2222(8, 6);
            int var5 = arg1.method2222(8, 6);
            boolean var6 = arg1.method2222(8, 1) == 1;
            if (var6) {
                class125.field2148[class518.field7114++] = arg2;
            }
            if (class588.field8451[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class138 var7 = class197.field2970[arg2];
            class21 var8 = class588.field8451[arg2] = new class21();
            var8.field4051 = arg2;
            if (class39.field456[arg2] != null) {
                var8.method195((byte) -120, class39.field456[arg2]);
            }
            var8.method1795(var7.field2287, 0, true);
            var8.field4054 = var7.field2284;
            int var9 = var7.field2279;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFDC7) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class222.field3266;
            var8.field215 = var7.field2280;
            int var14 = (var12 << 6) + var5 - class697.field9798;
            var8.field206 = var7.field2283;
            var8.field4139[0] = class279.field4025[arg2];
            var8.field10361 = var8.field10349 = (byte) var10;
            if (class717.method3994(32281, var13, var14)) {
                var8.field10349++;
            }
            var8.method189(var13, var14, arg0 ^ 0xFFFFB0FF);
            var8.field218 = false;
            class197.field2970[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method2222(8, 2);
            int var16 = class197.field2970[arg2].field2279;
            class197.field2970[arg2].field2279 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method2222(8, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class197.field2970[arg2].field2279;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class197.field2970[arg2].field2279 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method2222(8, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class197.field2970[arg2].field2279;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = arg0 & (var28 >> 14) + var26;
            int var31 = var27 + var28 & 0xFF;
            class197.field2970[arg2].field2279 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)J")
    public final long method1545(byte arg0) {
        field3312++;
        long[] var2 = class709.field9915;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field3318) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3313 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3313 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field3315 >> 24)) & 0xFFL)];
        int var13 = 3 % ((arg0 - 42) / 57);
        long var14 = var11 >>> 8 ^ var2[(int) (((long) (this.field3315 >> 16) ^ var11) & 0xFFL)];
        long var16 = var2[(int) ((var14 ^ (long) (this.field3315 >> 8)) & 0xFFL)] ^ var14 >>> 8;
        long var18 = var16 >>> 8 ^ var2[(int) (((long) this.field3315 ^ var16) & 0xFFL)];
        long var20 = var2[(int) ((var18 ^ (long) this.field3314) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var20 >>> 8 ^ var2[(int) (((long) (this.field3316 >> 24) ^ var20) & 0xFFL)];
        long var24 = var2[(int) (((long) (this.field3316 >> 16) ^ var22) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var24 >>> 8 ^ var2[(int) (((long) (this.field3316 >> 8) ^ var24) & 0xFFL)];
        long var28 = var2[(int) (((long) this.field3316 ^ var26) & 0xFFL)] ^ var26 >>> 8;
        long var30 = var2[(int) (((long) this.field3311 ^ var28) & 0xFFL)] ^ var28 >>> 8;
        return var2[(int) (((long) (this.field3310 ? 1 : 0) ^ var30) & 0xFFL)] ^ var30 >>> 8;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
    public static void method1546(byte arg0) {
        field3317 = null;
        field3319 = null;
        field3322 = null;
        int var1 = 0 % ((arg0 + 28) / 60);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lqj;I)Z")
    public final boolean method1547(class572 arg0, int arg1) {
        field3323++;
        if (!(arg0 instanceof class228)) {
            return false;
        }
        class228 var3 = (class228) arg0;
        if (this.field3318 != var3.field3318) {
            return false;
        } else if (this.field3313 != var3.field3313) {
            return false;
        } else if (this.field3315 != var3.field3315) {
            return false;
        } else if (this.field3314 != var3.field3314) {
            return false;
        } else if (this.field3316 != var3.field3316) {
            return false;
        } else if (this.field3311 != var3.field3311) {
            return false;
        } else if (this.field3310 == var3.field3310) {
            return arg1 == -26325 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIILbv;I)V")
    public static final void method1548(int arg0, int arg1, int arg2, int arg3, class421 arg4, int arg5) {
        field3321++;
        if (arg4.field5862 == -1 && arg4.field5837 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg4.field5853 * class420.field5820.field9484.method1367(17539) >> 8;
        if (arg1 > arg4.field5845) {
            var6 += arg1 - arg4.field5845;
        } else if (arg1 < arg4.field5855) {
            var6 += arg4.field5855 - arg1;
        }
        if (arg3 > arg4.field5848) {
            var6 += arg3 - arg4.field5848;
        } else if (arg3 < arg4.field5849) {
            var6 += arg4.field5849 - arg3;
        }
        if (arg4.field5864 == 0 || var6 - 256 > arg4.field5864 || class420.field5820.field9484.method1367(17539) == 0 || arg4.field5861 != arg5) {
            if (arg4.field5835 != null) {
                class234.field3399.method4220(arg4.field5835);
                arg4.field5835 = null;
                arg4.field5866 = null;
                arg4.field5854 = null;
            }
            if (arg4.field5863 != null) {
                class234.field3399.method4220(arg4.field5863);
                arg4.field5863 = null;
                arg4.field5838 = null;
                arg4.field5847 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg4.field5864 - arg4.field5856;
        if (var8 < 0) {
            var8 = arg4.field5864;
        }
        int var9 = var7;
        int var10 = var6 - arg4.field5856;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class719.field10041.method209(true);
        int var11 = 8192;
        int var12 = (arg4.field5845 + arg4.field5855) / 2 - arg1;
        int var13 = (arg4.field5849 + arg4.field5848) / 2 - arg3;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class642.field9037 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 >= 4096) {
                var15 = 16384;
            } else {
                var15 = var6 * 8192 / 4096 + 8192;
            }
            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
        }
        int var16 = -93 % ((arg0 + 29) / 61);
        if (arg4.field5835 != null) {
            arg4.field5835.method3226(var9);
            arg4.field5835.method3220(var11);
        } else if (arg4.field5862 >= 0) {
            int var17 = arg4.field5836 == 256 && arg4.field5843 == 256 ? 256 : class702.method3932(0, arg4.field5836, arg4.field5843);
            if (arg4.field5833) {
                if (arg4.field5854 == null) {
                    arg4.field5854 = class543.method3140(class224.field3296, arg4.field5862);
                }
                if (arg4.field5854 != null) {
                    if (arg4.field5866 == null) {
                        arg4.field5866 = arg4.field5854.method3141(new int[] { 22050 });
                    }
                    if (arg4.field5866 != null) {
                        class557 var18 = class557.method3247(arg4.field5866, var17, var9 << 6, var11);
                        var18.method3213(-1);
                        class234.field3399.method4221(var18);
                        arg4.field5835 = var18;
                    }
                }
            } else {
                class520 var19 = class520.method3057(class12.field151, arg4.field5862, 0);
                if (var19 != null) {
                    class101 var20 = var19.method3056().method839(class191.field2877);
                    class557 var21 = class557.method3247(var20, var17, var9 << 6, var11);
                    var21.method3213(-1);
                    class234.field3399.method4221(var21);
                    arg4.field5835 = var21;
                }
            }
        }
        if (arg4.field5863 != null) {
            arg4.field5863.method3226(var9);
            arg4.field5863.method3220(var11);
            if (arg4.field5863.method4235(-127)) {
                return;
            }
            arg4.field5838 = null;
            arg4.field5863 = null;
            arg4.field5847 = null;
        } else if (arg4.field5837 != null && (arg4.field5860 -= arg2) <= 0) {
            int var22 = arg4.field5836 == 256 && arg4.field5843 == 256 ? 256 : (int) ((double) (arg4.field5836 - arg4.field5843) * Math.random()) + arg4.field5843;
            if (arg4.field5834) {
                if (arg4.field5838 == null) {
                    int var23 = (int) (Math.random() * (double) arg4.field5837.length);
                    arg4.field5838 = class543.method3140(class224.field3296, arg4.field5837[var23]);
                }
                if (arg4.field5838 != null) {
                    if (arg4.field5847 == null) {
                        arg4.field5847 = arg4.field5838.method3141(new int[] { 22050 });
                    }
                    if (arg4.field5847 != null) {
                        class557 var24 = class557.method3247(arg4.field5847, var22, var9 << 6, var11);
                        var24.method3213(0);
                        class234.field3399.method4221(var24);
                        arg4.field5860 = arg4.field5851 + (int) ((double) (arg4.field5840 - arg4.field5851) * Math.random());
                        arg4.field5863 = var24;
                        return;
                    }
                }
                return;
            }
            int var25 = (int) (Math.random() * (double) arg4.field5837.length);
            class520 var26 = class520.method3057(class12.field151, arg4.field5837[var25], 0);
            if (var26 != null) {
                class101 var27 = var26.method3056().method839(class191.field2877);
                class557 var28 = class557.method3247(var27, var22, var9 << 6, var11);
                var28.method3213(0);
                class234.field3399.method4221(var28);
                arg4.field5863 = var28;
                arg4.field5860 = (int) (Math.random() * (double) (arg4.field5840 - arg4.field5851)) + arg4.field5851;
                return;
            }
        }
    }
}
