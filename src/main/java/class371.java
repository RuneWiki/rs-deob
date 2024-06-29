import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class371 extends class35 {

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public int field5265;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field5251;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    private int field5249;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    private int field5262;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[Z")
    public static boolean[] field5250 = new boolean[100];

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field5247 = 0;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIII)V", line = 3)
    public final void method2352(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[0] = this.field5256;
        arg0[1] = this.field5255 - (this.field5265 - arg2);
        field5254++;
        arg0[2] = this.field5249 + arg1 - this.field5258;
        if (arg3 >= -120) {
            method2362(30, 51);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 17)
    public static void method2353(int arg0) {
        if (arg0 != 0) {
            method2357(96, 81);
        }
        field5250 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z", line = 34)
    public final boolean method2354(int arg0, int arg1, int arg2) {
        field5261++;
        if (arg0 != 2) {
            this.method2352((int[]) null, 109, 69, -39);
        }
        return arg1 >= this.field5265 && arg1 <= this.field5264 && arg2 >= this.field5258 && this.field5259 >= arg2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBI)Z", line = 49)
    public final boolean method2355(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = -123 / ((38 - arg2) / 46);
        field5263++;
        return this.field5256 == arg3 && arg0 >= this.field5255 && arg0 <= this.field5262 && arg1 >= this.field5249 && arg1 <= this.field5251;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 70)
    public static final void method2356(boolean arg0, int arg1) {
        field5248++;
        class18 var2 = class234.field3395;
        synchronized (class234.field3395) {
            class234.field3395.method104(arg1, (byte) -34);
            if (arg0) {
                method2356(true, -4);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)Lbh;", line = 83)
    public static final class11 method2357(int arg0, int arg1) {
        field5253++;
        class18 var2 = class105.field1744;
        class11 var3;
        synchronized (class105.field1744) {
            var3 = (class11) class105.field1744.method103(0, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class287.field4290.method1355(class144.method1138(arg0, 1), -12607, class102.method840(arg0, 6590));
        class11 var5 = new class11();
        var5.field152 = arg0;
        if (var4 != null) {
            var5.method72(new class37(var4), arg1 ^ 0xFFFFCC52);
        }
        var5.method68((byte) -35);
        class18 var6 = class105.field1744;
        synchronized (class105.field1744) {
            class105.field1744.method113(var5, arg1 ^ arg1, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/Class;)Lpf;", line = 112)
    public static final class447 method2358(int arg0, int arg1, int arg2, Class arg3) {
        class168 var4 = class443.field6447[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class36 var5 = var4.field2488; var5 != null; var5 = var5.field505) {
            class447 var6 = var5.field511;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6526 == arg1 && var6.field6513 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)Z", line = 142)
    public final boolean method2359(byte arg0, int arg1, int arg2) {
        if (arg0 == 117) {
            field5257++;
            return this.field5255 <= arg2 && this.field5262 >= arg2 && this.field5249 <= arg1 && this.field5251 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 158)
    public static final void method2360(int arg0) {
        field5260++;
        if (class228.field3333) {
            return;
        }
        class40.method338(class317.field4594, (byte) -114);
        if (arg0 == 2857) {
            if (class265.field3980 != null) {
                class40.method338(class265.field3980, (byte) -103);
            }
            class228.field3333 = true;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[II)V", line = 184)
    public final void method2361(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = 0;
        field5246++;
        arg2[2] = arg1 + this.field5258 - this.field5249;
        if (arg3 == -10793) {
            arg2[1] = arg0 - (this.field5255 - this.field5265);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V", line = 197)
    public static final void method2362(int arg0, int arg1) {
        field5252++;
        class384.field5499.method104(arg1, (byte) -34);
        if (arg0 != 0) {
            method2358(125, -53, -3, (Class) null);
        }
        class250.field3610.method104(arg1, (byte) -34);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIII)V", line = 210)
    public class371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5265 = arg5;
        this.field5251 = arg4;
        this.field5249 = arg2;
        this.field5264 = arg7;
        this.field5262 = arg3;
        this.field5258 = arg6;
        this.field5259 = arg8;
        this.field5256 = arg0;
        this.field5255 = arg1;
    }
}
