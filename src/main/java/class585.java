import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class585 implements class320 {

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lrn;")
    public static class633 field7407 = new class633(2, 2);

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "Z")
    public static volatile boolean field7410 = true;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "D")
    public static double field7402;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public int field7397;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public int field7401;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Lpu;")
    public static class772 field7406;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Z")
    public boolean field7400;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method3131(int arg0, int arg1, int arg2, int arg3, int arg4, class570 arg5) {
        field7408++;
        class699.field9263 = arg5;
        class467.field6041 = class699.field9263.method994();
        class58.field765 = class699.field9263.method994();
        class384.field4802 = class699.field9263.method994();
        class212.field2921 = null;
        class465.field6034 = null;
        class296.field3757 = arg4;
        class230.field3093 = arg1;
        class596.field7567 = 0;
        class203.method1383(arg3, arg0, (byte) 32);
        class575.field7313 = arg2;
        class203.field2814 = -1;
        class746.field10200 = -1;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILvba;IIIIIIIILha;)V")
    public static final void method3132(int arg0, int arg1, class765 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class570 arg11) {
        field7399++;
        int var12 = 61 / ((arg3 - 42) / 43);
        if (arg0 < arg4 && (arg0 + arg5) > arg4 && arg7 - 13 < arg10 && arg10 < (arg7 + 3) && arg2.field10403) {
            arg9 = arg6;
        }
        int[] var13 = null;
        if (class122.method722(arg2.field10412, true)) {
            var13 = class640.field8189.method705((int) arg2.field10404, -11467).field616;
        } else if (arg2.field10400 != -1) {
            var13 = class640.field8189.method705(arg2.field10400, -11467).field616;
        } else if (class49.method319(arg2.field10412, -60)) {
            class232 var16 = (class232) class444.field5811.method2616((long) ((int) arg2.field10404), (byte) 11);
            if (var16 != null) {
                class727 var17 = var16.field3125;
                class240 var18 = var17.field9545;
                if (var18.field3289 != null) {
                    var18 = var18.method1585((byte) -100, class381.field4705);
                }
                if (var18 != null) {
                    var13 = var18.field3318;
                }
            }
        } else if (class143.method827(arg2.field10412, (byte) -108)) {
            Object var14 = null;
            class773 var15;
            if (arg2.field10412 == 1009) {
                var15 = class390.field4983.method4292((int) arg2.field10404, (byte) -81);
            } else {
                var15 = class390.field4983.method4292((int) (arg2.field10404 >>> 32 & 0x7FFFFFFFL), (byte) -115);
            }
            if (var15.field10536 != null) {
                var15 = var15.method4213(class381.field4705, -117);
            }
            if (var15 != null) {
                var13 = var15.field10502;
            }
        }
        String var19 = class381.method2185(arg2, -2);
        if (var13 != null) {
            var19 = var19 + class405.method2361(var13, 0);
        }
        class595.field7562.method2430(var19, arg9, class269.field3556, arg0 + 3, 0, 0, arg7, class230.field3103);
        if (arg2.field10398) {
            field7406.method4203(class66.field868.method1049(100, var19) + arg0 + 5, arg7 - 12);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLofa;)Z")
    public final boolean method1864(byte arg0, class320 arg1) {
        field7403++;
        if (!(arg1 instanceof class585)) {
            return false;
        }
        class585 var3 = (class585) arg1;
        if (this.field7397 != var3.field7397) {
            return false;
        } else if (this.field7405 != var3.field7405) {
            return false;
        } else if (this.field7395 != var3.field7395) {
            return false;
        } else if (this.field7396 != var3.field7396) {
            return false;
        } else if (this.field7398 != var3.field7398) {
            return false;
        } else if (arg0 >= -119) {
            return true;
        } else if (this.field7401 == var3.field7401) {
            return this.field7400 == var3.field7400;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method3133(byte arg0) {
        field7407 = null;
        int var1 = -23 % ((arg0 + 73) / 42);
        field7406 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)J")
    public final long method1863(int arg0) {
        field7404++;
        long[] var2 = class693.field8897;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field7397) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field7405 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field7405) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field7395 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field7395 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field7395 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field7395 ^ var15) & 0xFFL)];
        if (arg0 != -8671) {
            method3132(96, -1, null, -10, 65, 43, 101, -28, 50, 121, -54, null);
        }
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field7396) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field7398 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field7398 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field7398 >> 8)) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field7398) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field7401 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field7400 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lha;IIILfca;)V")
    public static final void method3134(class570 arg0, int arg1, int arg2, int arg3, class661 arg4) {
        class565.field7168.method3594(arg3 - 22287);
        field7394++;
        if (class576.field7321) {
            return;
        }
        if (arg3 != 22371) {
            method3132(-71, 39, null, 60, 21, -67, -85, -49, 80, 53, 31, null);
        }
        for (class307 var5 = (class307) arg4.method3591(arg3 - 22371); var5 != null; var5 = (class307) arg4.method3600((byte) 48)) {
            class624 var6 = class402.field5322.method2323(var5.field3860, true);
            if (class756.method4106(var6, (byte) -127)) {
                boolean var7 = class128.method758(arg2, var5, var6, arg1, false, arg0);
                if (var7) {
                    class601.method3244((byte) 93, var5, arg0, var6);
                }
            }
        }
    }
}
