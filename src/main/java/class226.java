import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class226 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lnj;")
    private class162 field3207 = new class162(128);

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lmg;")
    private class101 field3215;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3209 = -1;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "[I")
    public static int[] field3219;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "F")
    public static float field3208;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static final void method1399(byte arg0) {
        class149.field2156 = 0;
        if (arg0 != 13) {
            return;
        }
        field3213++;
        class154.field2357 = -3;
        class59.field719 = 0;
        class401.field5887 = 0;
        class459.field6727 = 1;
        class438.field6405 = -1;
        class10.field151 = false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public static void method1400(boolean arg0) {
        if (!arg0) {
            method1400(false);
        }
        field3219 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjo;IIILsk;ILdw;)V")
    public static final void method1401(int arg0, class220 arg1, int arg2, int arg3, int arg4, class438 arg5, int arg6, class502 arg7) {
        field3218++;
        if (arg4 < 119) {
            method1404(-29, -88, -102);
        }
        class365 var8 = new class365();
        var8.field5347 = arg0 << 7;
        var8.field5339 = arg6;
        var8.field5335 = arg2 << 7;
        if (arg1 != null) {
            var8.field5361 = arg1;
            int var9 = arg1.field3143;
            int var10 = arg1.field3118;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg1.field3143;
                var9 = arg1.field3118;
            }
            var8.field5336 = arg0 + var9 << 7;
            var8.field5358 = arg1.field3062;
            var8.field5352 = arg1.field3066;
            var8.field5348 = arg1.field3069;
            var8.field5338 = arg1.field3128;
            var8.field5354 = arg1.field3139;
            var8.field5359 = arg2 + var10 << 7;
            var8.field5343 = arg1.field3106 << 7;
            if (arg1.field3080 != null) {
                var8.field5349 = true;
                var8.method2199((byte) 65);
            }
            if (var8.field5352 != null) {
                var8.field5344 = var8.field5358 + (int) (Math.random() * (double) (var8.field5338 - var8.field5358));
            }
            class490.field7151.method2809(var8, 2);
        } else if (arg7 != null) {
            var8.field5337 = arg7;
            class79 var11 = arg7.field7387;
            if (var11.field1143 != null) {
                var8.field5349 = true;
                var11 = var11.method646(0, class421.field6166);
            }
            if (var11 != null) {
                var8.field5359 = var11.field1168 + arg2 << 7;
                var8.field5336 = var11.field1168 + arg0 << 7;
                var8.field5348 = class52.method451(arg7, 116);
                var8.field5354 = var11.field1202;
                var8.field5343 = var11.field1195 << 7;
            }
            class281.field3860.method2809(var8, 2);
        } else if (arg5 != null) {
            var8.field5353 = arg5;
            var8.field5336 = arg0 + arg5.method626((byte) 120) << 7;
            var8.field5359 = arg5.method626((byte) 120) + arg2 << 7;
            var8.field5348 = class178.method1152(200, arg5);
            var8.field5354 = arg5.field6448;
            var8.field5343 = arg5.field6427 << 7;
            class315.field4315.method1487(-116, (long) arg5.field1035, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)Z")
    public static final boolean method1402(int arg0, byte arg1) {
        if (arg1 > -85) {
            method1400(true);
        }
        field3206++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public final void method1403(int arg0, int arg1) {
        field3211++;
        class162 var3 = this.field3207;
        synchronized (this.field3207) {
            if (arg1 != -196807513) {
                method1402(-94, (byte) -115);
            }
            this.field3207.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
    public static final void method1404(int arg0, int arg1, int arg2) {
        field3210++;
        class97 var3 = class348.method2064(arg0, arg2, arg2 + 121);
        var3.method712((byte) -86);
        var3.field1468 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
    public final void method1405(boolean arg0) {
        class162 var2 = this.field3207;
        synchronized (this.field3207) {
            this.field3207.method1066(4080);
        }
        field3212++;
        if (!arg0) {
            field3208 = 1.2094166F;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
    public final void method1406(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3214++;
        class162 var2 = this.field3207;
        synchronized (this.field3207) {
            this.field3207.method1068(0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BZI)V")
    public static final void method1407(byte arg0, boolean arg1, int arg2) {
        if (arg0 <= 103) {
            return;
        }
        field3217++;
        class128 var3 = class507.method3024(arg2, arg1, Integer.MIN_VALUE);
        if (var3 != null) {
            var3.method1565(0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class226(class66 arg0, int arg1, class101 arg2) {
        this.field3215 = arg2;
        this.field3215.method753(1, -108);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IB)Lwv;")
    public final class26 method1408(int arg0, byte arg1) {
        field3216++;
        class162 var3 = this.field3207;
        class26 var4;
        synchronized (this.field3207) {
            var4 = (class26) this.field3207.method1073((long) arg0, false);
        }
        if (arg1 < 45) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field3215.method727(arg0, 1, -108);
            class26 var6 = new class26();
            if (var5 != null) {
                var6.method152(new class391(var5), -89);
            }
            class162 var7 = this.field3207;
            synchronized (this.field3207) {
                this.field3207.method1072((long) arg0, var6, false);
                return var6;
            }
        } else {
            return var4;
        }
    }

    static {
        new class466("From", "Von:", "De", "De");
        field3219 = new int[16];
    }
}
