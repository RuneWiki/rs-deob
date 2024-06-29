import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class343 {

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lpca;")
    private class653 field4456 = new class653(64);

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "Lpca;")
    public class653 field4464 = new class653(50);

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "Ldq;")
    public class638 field4465 = new class638(250);

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "Lee;")
    private class618 field4466 = new class618();

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Ljo;")
    private class303 field4457;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    private boolean field4445;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Ljo;")
    public class303 field4447;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Lgm;")
    private class110 field4467;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field4446;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4470;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field4468;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4443 = null;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Ljda;")
    public static class207 field4453 = new class207("stellardawn", 1);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lli;")
    public static class390 field4455 = new class390(16);

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Lqq;")
    public static class434 field4444;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Lia;")
    public final class537 method1903(int arg0, byte arg1) {
        field4459++;
        int var3 = -114 % ((-arg1 - 67) / 43);
        class653 var4 = this.field4456;
        class537 var5;
        synchronized (this.field4456) {
            var5 = (class537) this.field4456.method3690((byte) -96, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class303 var6 = this.field4457;
        byte[] var7;
        synchronized (this.field4457) {
            var7 = this.field4457.method1719(class214.method1280((byte) -116, arg0), class470.method2671((byte) 84, arg0), 4);
        }
        class537 var8 = new class537();
        var8.field7710 = arg0;
        var8.field7686 = this;
        var8.field7673 = new String[] { null, null, class221.field2679.method1296(this.field4446, (byte) -126), null, null };
        var8.field7670 = new String[] { null, null, null, null, class221.field2680.method1296(this.field4446, (byte) -110) };
        if (var7 != null) {
            var8.method3067(new class452(var7), false);
        }
        var8.method3058(111);
        if (var8.field7703 != -1) {
            var8.method3054(this.method1903(var8.field7707, (byte) -125), this.method1903(var8.field7703, (byte) 71), 2639);
        }
        if (var8.field7729 != -1) {
            var8.method3056(this.method1903(var8.field7684, (byte) 68), this.method1903(var8.field7729, (byte) -114), -123);
        }
        if (!this.field4445 && var8.field7737) {
            var8.field7677 = class221.field2677.method1296(this.field4446, (byte) -69);
            var8.field7687 = false;
            var8.field7670 = this.field4468;
            var8.field7673 = this.field4470;
            var8.field7702 = null;
            var8.field7711 = 0;
            if (var8.field7718 != null) {
                boolean var9 = false;
                for (class270 var10 = var8.field7718.method3232(-1); var10 != null; var10 = var8.field7718.method3236(-27646)) {
                    class450 var11 = this.field4467.method687(false, (int) var10.field3405);
                    if (var11.field6193) {
                        var10.method1519((byte) 121);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var8.field7718 = null;
                }
            }
        }
        class653 var12 = this.field4456;
        synchronized (this.field4456) {
            this.field4456.method3683(var8, (byte) -85, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
    public final void method1904(int arg0, int arg1) {
        if (arg0 >= -1) {
            return;
        }
        this.field4469 = arg1;
        field4460++;
        class653 var3 = this.field4464;
        synchronized (this.field4464) {
            this.field4464.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final void method1905(int arg0) {
        class653 var2 = this.field4456;
        synchronized (this.field4456) {
            this.field4456.method3684(arg0 - 17189);
        }
        field4450++;
        class653 var3 = this.field4464;
        synchronized (this.field4464) {
            this.field4464.method3684(-17200);
        }
        class638 var4 = this.field4465;
        synchronized (this.field4465) {
            this.field4465.method3595(true);
        }
        if (arg0 != -11) {
            this.method1903(-69, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method1906(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field4458++;
        class382 var5 = class657.method3708(arg4, (byte) -76, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field4966 != null) {
            class676 var6 = new class676();
            var6.field9577 = arg1;
            var6.field9574 = arg2;
            var6.field9580 = var5.field4966;
            var6.field9585 = var5;
            class364.method1998(var6);
        }
        if (class351.field4601 != 10 || !client.method1530(var5).method1496(arg1 - 1, -1)) {
            return;
        }
        if (arg1 == arg3) {
            class309.field4011++;
            class480.method2802(class489.field7091, arg3 ^ 0x416E);
            class65.method428(arg4, arg0, arg3 ^ 0x1C, var5.field5110);
        }
        if (arg1 == 2) {
            class62.field671++;
            class480.method2802(class533.field7621, 16751);
            class65.method428(arg4, arg0, 23, var5.field5110);
        }
        if (arg1 == 3) {
            class480.method2802(class505.field7271, 16751);
            class186.field2262++;
            class65.method428(arg4, arg0, arg3 ^ 0xFFFFFF81, var5.field5110);
        }
        if (arg1 == 4) {
            class480.method2802(class482.field7052, 16751);
            class241.field3060++;
            class65.method428(arg4, arg0, arg3 + 70, var5.field5110);
        }
        if (arg1 == 5) {
            class334.field4313++;
            class480.method2802(class539.field7753, 16751);
            class65.method428(arg4, arg0, -125, var5.field5110);
        }
        if (arg1 == 6) {
            class24.field294++;
            class480.method2802(class359.field4704, 16751);
            class65.method428(arg4, arg0, arg3 ^ 0x4, var5.field5110);
        }
        if (arg1 == 7) {
            class647.field9162++;
            class480.method2802(class111.field1288, arg3 ^ 0x416E);
            class65.method428(arg4, arg0, 11, var5.field5110);
        }
        if (arg1 == 8) {
            class480.method2802(class685.field9704, 16751);
            class467.field6471++;
            class65.method428(arg4, arg0, 43, var5.field5110);
        }
        if (arg1 == 9) {
            class480.method2802(class208.field2522, 16751);
            class141.field1607++;
            class65.method428(arg4, arg0, -123, var5.field5110);
        }
        if (arg1 == 10) {
            class387.field5178++;
            class480.method2802(class81.field861, arg3 ^ 0x416E);
            class65.method428(arg4, arg0, -126, var5.field5110);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public final void method1907(byte arg0) {
        class653 var2 = this.field4464;
        synchronized (this.field4464) {
            this.field4464.method3687((byte) -10);
        }
        field4449++;
        if (arg0 >= -70) {
            field4444 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static void method1908(byte arg0) {
        field4444 = null;
        field4443 = null;
        field4453 = null;
        if (arg0 < 79) {
            method1908((byte) -125);
        }
        field4455 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILoa;ZIILoa;ILta;Ldea;Z)Lxa;")
    public final class458 method1909(int arg0, byte arg1, int arg2, class635 arg3, boolean arg4, int arg5, int arg6, class635 arg7, int arg8, class195 arg9, class223 arg10, boolean arg11) {
        field4448++;
        class458 var13 = this.method1913(arg8, arg7, arg5, arg0, -1, arg10, arg6, arg2);
        if (var13 != null) {
            return var13;
        }
        class537 var14 = this.method1903(arg5, (byte) -118);
        if (arg8 > 1 && var14.field7692 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg8 >= var14.field7666[var16] && var14.field7666[var16] != 0) {
                    var15 = var14.field7692[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1903(var15, (byte) -123);
            }
        }
        int[] var17 = var14.method3055(arg3, arg2, arg11, 7184, arg10, arg7, arg0, arg8, arg9, arg6);
        if (var17 == null) {
            return null;
        }
        if (arg1 <= 99) {
            this.method1911(-4);
        }
        class458 var18;
        if (arg4) {
            var18 = arg3.method326(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method326(var17, 0, 36, 36, 32);
        }
        if (!arg4) {
            class618 var19 = new class618();
            var19.field8693 = arg7.field8985;
            var19.field8694 = arg8;
            var19.field8695 = arg10 != null;
            var19.field8700 = arg2;
            var19.field8707 = arg6;
            var19.field8698 = arg0;
            var19.field8709 = arg5;
            this.field4465.method3597(var18, (byte) -65, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
    public final void method1910(int arg0, int arg1) {
        class653 var3 = this.field4456;
        synchronized (this.field4456) {
            this.field4456.method3691(false, arg0);
        }
        field4452++;
        class653 var4 = this.field4464;
        synchronized (this.field4464) {
            this.field4464.method3691(false, arg0);
        }
        if (arg1 == 8) {
            class638 var5 = this.field4465;
            synchronized (this.field4465) {
                this.field4465.method3600(arg0, 128);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public final void method1911(int arg0) {
        int var2 = -33 / ((-arg0 - 75) / 33);
        class638 var3 = this.field4465;
        synchronized (this.field4465) {
            this.field4465.method3599(-27);
        }
        field4461++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZ)V")
    public final void method1912(boolean arg0, boolean arg1) {
        field4451++;
        if (arg0 == this.field4445) {
            return;
        }
        if (arg1) {
            this.field4470 = null;
        }
        this.field4445 = arg0;
        this.method1914(-11);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILoa;IIILdea;II)Lxa;")
    public final class458 method1913(int arg0, class635 arg1, int arg2, int arg3, int arg4, class223 arg5, int arg6, int arg7) {
        this.field4466.field8694 = arg0;
        this.field4466.field8707 = arg6;
        this.field4466.field8698 = arg3;
        if (arg4 != -1) {
            return null;
        }
        this.field4466.field8693 = arg1.field8985;
        this.field4466.field8695 = arg5 != null;
        field4454++;
        this.field4466.field8709 = arg2;
        this.field4466.field8700 = arg7;
        return (class458) this.field4465.method3591(this.field4466, -13445);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public final void method1914(int arg0) {
        class653 var2 = this.field4456;
        synchronized (this.field4456) {
            this.field4456.method3687((byte) -10);
        }
        if (arg0 != -11) {
            this.method1910(75, 90);
        }
        field4462++;
        class653 var3 = this.field4464;
        synchronized (this.field4464) {
            this.field4464.method3687((byte) -10);
        }
        class638 var4 = this.field4465;
        synchronized (this.field4465) {
            this.field4465.method3599(-103);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljda;IZLgm;Ljo;Ljo;)V")
    public class343(class207 arg0, int arg1, boolean arg2, class110 arg3, class303 arg4, class303 arg5) {
        this.field4457 = arg4;
        this.field4445 = arg2;
        this.field4447 = arg5;
        this.field4467 = arg3;
        this.field4446 = arg1;
        if (this.field4457 == null) {
            this.field4463 = 0;
        } else {
            int var7 = this.field4457.method1740((byte) 35) - 1;
            this.field4463 = var7 * 256 + this.field4457.method1727(-77, var7);
        }
        this.field4470 = new String[] { null, null, class221.field2679.method1296(this.field4446, (byte) -103), null, null };
        this.field4468 = new String[] { null, null, null, null, class221.field2680.method1296(this.field4446, (byte) 65) };
    }
}
