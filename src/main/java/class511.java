import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class511 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lub;")
    private class18 field7412 = new class18();

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field7411;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    private int field7419;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lhl;")
    private class375 field7427;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lqv;")
    public static class316 field7418 = new class316(53, 7);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "J")
    public static long field7425 = -1L;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field7426 = -1;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "S")
    public static short field7424 = 205;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[J")
    public static long[] field7431;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[[B")
    public static byte[][] field7430;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JBILjava/lang/Object;)V", line = 3)
    private final void method2978(long arg0, byte arg1, int arg2, Object arg3) {
        field7408++;
        if (this.field7419 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2988(arg0, (byte) -118);
        this.field7411 -= arg2;
        while (this.field7411 < 0) {
            class6 var7 = (class6) this.field7412.method103(arg1 + 1048560);
            this.method2991(var7, -67);
        }
        class370 var6 = new class370(arg3, arg2);
        this.field7427.method2292(arg0, var6, (byte) -128);
        if (arg1 != 15) {
            this.method2980(31);
        }
        this.field7412.method99(var6, 5604);
        var6.field7659 = 0L;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 33)
    public final Object method2979(int arg0) {
        field7409++;
        if (arg0 != -28362) {
            return null;
        }
        class6 var2 = (class6) this.field7427.method2283((byte) 11);
        while (var2 != null) {
            Object var3 = var2.method17(0);
            if (var3 != null) {
                return var3;
            }
            class6 var4 = var2;
            var2 = (class6) this.field7427.method2283((byte) 11);
            var4.method421(22071);
            var4.method3115((byte) 103);
            this.field7411 += var2.field32;
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 66)
    public final void method2980(int arg0) {
        field7414++;
        if (arg0 != -182819096) {
            return;
        }
        for (class6 var2 = (class6) this.field7412.method102(arg0 + 183867671); var2 != null; var2 = (class6) this.field7412.method105((byte) 43)) {
            if (var2.method19((byte) -76)) {
                var2.method421(22071);
                var2.method3115((byte) 103);
                this.field7411 += var2.field32;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 93)
    public final void method2981(Object arg0, int arg1, long arg2) {
        field7421++;
        this.method2978(arg2, (byte) 15, 1, arg0);
        if (arg1 < 23) {
            this.method2987(23);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 104)
    public final Object method2982(int arg0, long arg1) {
        field7429++;
        class6 var4 = (class6) this.field7427.method2284(true, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method17(arg0);
        if (var5 == null) {
            var4.method421(22071);
            var4.method3115((byte) 103);
            this.field7411 += var4.field32;
            return null;
        }
        if (var4.method19((byte) 76)) {
            class370 var6 = new class370(var5, var4.field32);
            this.field7427.method2292(var4.field863, var6, (byte) -128);
            this.field7412.method99(var6, 5604);
            var6.field7659 = 0L;
            var4.method421(22071);
            var4.method3115((byte) 103);
        } else {
            this.field7412.method99(var4, 5604);
            var4.field7659 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZLkg;I)V", line = 146)
    public static final void method2983(int arg0, int arg1, int arg2, int arg3, boolean arg4, class183 arg5, int arg6) {
        field7416++;
        if (class215.field3238 >= 50 || arg5 == null || arg5.field2708 == null || arg1 >= arg5.field2708.length || arg5.field2708[arg1] == null) {
            return;
        }
        int var7 = arg5.field2708[arg1][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF6) >> 5;
        if (arg5.field2708[arg1].length > 1) {
            int var10 = (int) ((double) arg5.field2708[arg1].length * Math.random());
            if (var10 > 0) {
                var8 = arg5.field2708[arg1][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg4) {
                class371.method2272(var9, 9832, var8, 255, 0);
            }
        } else if (class220.field3371.field2550 != 0) {
            int var12 = arg0 + arg3 >> 7;
            int var13 = arg2 - 64 >> 7;
            class79.field1281[class215.field3238++] = new class306((byte) 1, var8, var9, 0, 255, (arg6 << 24) + var11 + (var12 << 16) + (var13 << 8));
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I", line = 198)
    public final int method2984(byte arg0) {
        field7415++;
        if (arg0 != -30) {
            this.method2984((byte) 60);
        }
        int var2 = 0;
        for (class6 var3 = (class6) this.field7412.method102(arg0 ^ 0xFFF0001D); var3 != null; var3 = (class6) this.field7412.method105((byte) 43)) {
            if (!var3.method19((byte) 75)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 223)
    public static void method2985(byte arg0) {
        field7431 = null;
        field7430 = null;
        field7418 = null;
        if (arg0 >= -38) {
            field7424 = -63;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 236)
    public final Object method2986(byte arg0) {
        field7423++;
        class6 var2 = (class6) this.field7427.method2285(90);
        if (arg0 <= 124) {
            this.method2982(-38, 27L);
        }
        while (var2 != null) {
            Object var3 = var2.method17(0);
            if (var3 != null) {
                return var3;
            }
            class6 var4 = var2;
            var2 = (class6) this.field7427.method2283((byte) 11);
            var4.method421(22071);
            var4.method3115((byte) 103);
            this.field7411 += var2.field32;
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I", line = 267)
    public final int method2987(int arg0) {
        if (arg0 == 1) {
            field7413++;
            return this.field7419;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)V", line = 287)
    private final void method2988(long arg0, byte arg1) {
        field7410++;
        class6 var4 = (class6) this.field7427.method2284(true, arg0);
        this.method2991(var4, -48);
        if (arg1 >= -67) {
            method2983(-17, -44, 57, -10, false, null, 25);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V", line = 303)
    public final void method2989(boolean arg0, int arg1) {
        field7420++;
        if (class18.field192 != null) {
            for (class6 var3 = (class6) this.field7412.method102(1048575); var3 != null; var3 = (class6) this.field7412.method105((byte) 43)) {
                if (var3.method19((byte) 95)) {
                    if (var3.method17(0) == null) {
                        var3.method421(22071);
                        var3.method3115((byte) 103);
                        this.field7411++;
                    }
                } else if ((++var3.field7659) > ((long) arg1)) {
                    class6 var4 = class18.field192.method435(var3, 114);
                    this.field7427.method2292(var3.field863, var4, (byte) -128);
                    class313.method1987(var3, -26480, var4);
                    var3.method421(22071);
                    var3.method3115((byte) 103);
                }
            }
        }
        if (arg0) {
            this.method2992(72);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V", line = 360)
    public final void method2990(byte arg0) {
        field7417++;
        if (arg0 > -43) {
            method2985((byte) 69);
        }
        this.field7412.method101((byte) -128);
        this.field7427.method2286((byte) 19);
        this.field7411 = this.field7419;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lie;I)V", line = 376)
    private final void method2991(class6 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method421(22071);
            arg0.method3115((byte) 103);
            this.field7411 += arg0.field32;
        }
        field7428++;
        if (arg1 > -39) {
            this.method2981(null, 49, 110L);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V", line = 397)
    public class511(int arg0) {
        this.field7411 = arg0;
        this.field7419 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field7427 = new class375(var2);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I", line = 418)
    public final int method2992(int arg0) {
        if (arg0 > -9) {
            return 52;
        } else {
            field7422++;
            return this.field7411;
        }
    }
}
