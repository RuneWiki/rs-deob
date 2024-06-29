import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class382 {

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lmo;")
    private class336 field5246 = new class336(64);

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lnl;")
    private class435 field5245;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
    public static boolean field5244 = false;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lir;")
    public static class226 field5241;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lkp;")
    public static class263 field5247;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lrn;")
    public static class417 field5243;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 10)
    public final void method2324(boolean arg0) {
        if (!arg0) {
            method2330((class39) null, -26, 123, -8, (byte) 8);
        }
        class336 var2 = this.field5246;
        synchronized (this.field5246) {
            this.field5246.method2109(-1);
        }
        field5250++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIBI)V", line = 23)
    public static final void method2325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field5251++;
        if (arg1 < 128 || arg5 < 128 || (class36.field388 - 2) * 128 < arg1 || ((class68.field998 - 2) * 128) < arg5) {
            class98.field1383[0] = class98.field1383[1] = -1;
            return;
        }
        int var10 = class407.method2440(arg1, -16490, arg5, arg4) - arg0;
        class119.field1654.method107(arg2, 0, 0);
        class374.field5152.method454(class119.field1654);
        if (arg8 >= 3) {
            class374.field5152.method316(arg1, var10, arg5, class98.field1383);
            class119.field1654.method107(-arg2, 0, 0);
            class374.field5152.method454(class119.field1654);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V", line = 47)
    public static final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class311.field4403.field2298 = 0;
        field5252++;
        class311.field4403.method1180((byte) -110, class433.field6128.field60);
        class311.field4403.method1180((byte) -110, arg3);
        class311.field4403.method1180((byte) -110, arg4);
        class311.field4403.method1173(arg0, (byte) 124);
        class311.field4403.method1173(arg2, (byte) 117);
        class196.field2908 = 0;
        class181.field2729 = 1;
        class39.field530 = -3;
        class67.field973 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 64)
    public final void method2327(byte arg0) {
        field5254++;
        if (arg0 == -105) {
            class336 var2 = this.field5246;
            synchronized (this.field5246) {
                this.field5246.method2119(0);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 88)
    public final void method2328(int arg0, int arg1) {
        class336 var3 = this.field5246;
        synchronized (this.field5246) {
            if (arg0 != 12623) {
                this.field5246 = null;
            }
            this.field5246.method2109(-1);
            this.field5246 = new class336(arg1);
        }
        field5249++;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lma;", line = 102)
    public final class410 method2329(int arg0, int arg1) {
        field5240++;
        class336 var3 = this.field5246;
        class410 var4;
        synchronized (this.field5246) {
            var4 = (class410) this.field5246.method2113(arg0 - 128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5245.method2633(class350.method2166(-1017594230, arg1), class169.method1229(57, arg1), arg0 ^ 0xFFFFFF12);
        class410 var6 = new class410();
        if (var5 != null) {
            var6.method2452(-1, new class161(var5));
        }
        class336 var7 = this.field5246;
        synchronized (this.field5246) {
            this.field5246.method2116((long) arg1, (byte) -20, var6);
        }
        return arg0 == 128 ? var6 : null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lgf;IIIB)V", line = 130)
    public static final void method2330(class39 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5242++;
        int var5 = class235.method1640(-4, true, class300.field4249[arg0.field4531], arg0.field5811[0], 0, 0, 0, 0, (byte) -113, arg3, class399.field5473, class262.field3781.method245(4452), class162.field2350, arg2, arg0.field5807[0]);
        if (var5 >= 1 && arg1 == -23956) {
            for (int var6 = 0; var6 < (var5 - 1); var6++) {
                arg0.method240(true, class399.field5473[var6], class162.field2350[var6], arg4);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 152)
    public static void method2331(int arg0) {
        field5247 = null;
        field5243 = null;
        if (arg0 != 23398) {
            method2325(-90, 46, 12, 46, 90, 43, -33, -40, (byte) 57, -18);
        }
        field5241 = null;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 164)
    public final void method2332(int arg0, int arg1) {
        field5253++;
        class336 var3 = this.field5246;
        synchronized (this.field5246) {
            this.field5246.method2120((byte) -120, arg0);
        }
        if (arg1 != 0) {
            field5241 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 194)
    public class382(class280 arg0, int arg1, class435 arg2) {
        this.field5245 = arg2;
        if (this.field5245 != null) {
            int var4 = this.field5245.method2658(-1) - 1;
            this.field5245.method2638(1, var4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V", line = 183)
    public static final void method2333(byte arg0, int arg1) {
        if (arg0 != 70) {
            method2333((byte) -10, -24);
        }
        field5248++;
        class233.field3406 = arg1;
        class225.field3249.method2109(-1);
    }
}
