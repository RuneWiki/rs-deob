import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class314 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lmo;")
    private class336 field4430 = new class336(64);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Lmo;")
    public class336 field4448 = new class336(50);

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lmo;")
    public class336 field4449 = new class336(5);

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Lnl;")
    private class435 field4438;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
    public boolean field4437;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lnl;")
    public class435 field4445;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field4436 = 0;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lir;")
    public static class226 field4429;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lv;")
    public static class98 field4442;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[[B")
    public static byte[][] field4444;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[[I")
    public static int[][] field4435;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 3)
    public final void method1994(int arg0, int arg1) {
        field4431++;
        this.field4450 = arg0;
        class336 var3 = this.field4448;
        synchronized (this.field4448) {
            if (arg1 != 64) {
                this.method1995(-3);
            }
            this.field4448.method2109(-1);
        }
        class336 var4 = this.field4449;
        synchronized (this.field4449) {
            this.field4449.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 25)
    public final void method1995(int arg0) {
        field4433++;
        class336 var2 = this.field4430;
        synchronized (this.field4430) {
            this.field4430.method2109(arg0);
        }
        class336 var3 = this.field4448;
        synchronized (this.field4448) {
            this.field4448.method2109(-1);
        }
        class336 var4 = this.field4449;
        synchronized (this.field4449) {
            this.field4449.method2109(arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 44)
    public static void method1996(int arg0) {
        field4442 = null;
        field4429 = null;
        int var1 = 119 % ((-arg0 - 23) / 54);
        field4444 = null;
        field4435 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Lkc;", line = 59)
    public final class37 method1997(int arg0, int arg1) {
        field4443++;
        class336 var3 = this.field4430;
        class37 var4;
        synchronized (this.field4430) {
            var4 = (class37) this.field4430.method2113(arg1 - 24749, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4438.method2633(class405.method2430(-113, arg0), class259.method1742(arg0, 4096), 108);
        class37 var6 = new class37();
        var6.field456 = this;
        var6.field398 = arg0;
        if (var5 != null) {
            var6.method230(23430, new class161(var5));
        }
        var6.method234((byte) -51);
        class336 var7 = this.field4430;
        synchronized (this.field4430) {
            if (arg1 != 24749) {
                this.method1994(-36, 46);
            }
            this.field4430.method2116((long) arg0, (byte) -88, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 91)
    public final void method1998(byte arg0) {
        class336 var2 = this.field4430;
        synchronized (this.field4430) {
            this.field4430.method2119(0);
        }
        if (arg0 != 19) {
            this.method1998((byte) -40);
        }
        field4447++;
        class336 var3 = this.field4448;
        synchronized (this.field4448) {
            this.field4448.method2119(0);
        }
        class336 var4 = this.field4449;
        synchronized (this.field4449) {
            this.field4449.method2119(arg0 ^ 0x13);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V", line = 110)
    public final void method1999(int arg0, boolean arg1) {
        field4440++;
        class336 var3 = this.field4430;
        synchronized (this.field4430) {
            this.field4430.method2120((byte) 70, arg0);
        }
        class336 var4 = this.field4448;
        synchronized (this.field4448) {
            this.field4448.method2120((byte) 118, arg0);
        }
        class336 var5 = this.field4449;
        synchronized (this.field4449) {
            if (arg1) {
                this.method1995(49);
            }
            this.field4449.method2120((byte) 61, arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBIII)Lrp;", line = 137)
    public static final class419 method2000(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4441++;
        if (arg3 >= -111) {
            return null;
        }
        long var7 = (long) arg2 * 76724863L ^ (long) arg6 * 986053L ^ (long) arg1 * 475427L ^ (long) arg0 * 97549L ^ (long) arg4 * 67481L ^ (long) arg5 * 32147369L;
        class419 var9 = (class419) class52.field760.method2113(0, var7);
        if (var9 == null) {
            class419 var10 = class266.field3835.method297(arg4, arg0, arg1, arg6, arg5, arg2);
            class52.field760.method2116(var7, (byte) -110, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 158)
    public final void method2001(int arg0) {
        class336 var2 = this.field4448;
        synchronized (this.field4448) {
            if (arg0 != 32760) {
                this.method1998((byte) 14);
            }
            this.field4448.method2109(-1);
        }
        field4439++;
        class336 var3 = this.field4449;
        synchronized (this.field4449) {
            this.field4449.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Llo;IZLnl;Lnl;)V", line = 206)
    public class314(class280 arg0, int arg1, boolean arg2, class435 arg3, class435 arg4) {
        this.field4438 = arg3;
        this.field4437 = arg2;
        this.field4445 = arg4;
        this.field4432 = arg1;
        if (this.field4438 != null) {
            int var6 = this.field4438.method2658(-1) - 1;
            this.field4438.method2638(1, var6);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)V", line = 182)
    public final void method2002(int arg0, boolean arg1) {
        field4434++;
        if (arg0 == 22108 && this.field4437 != arg1) {
            this.field4437 = arg1;
            this.method1995(arg0 - 22109);
        }
    }
}
