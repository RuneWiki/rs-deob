import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class400 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lqr;")
    private class65 field5580 = new class65(64);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lqr;")
    public class65 field5590 = new class65(50);

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lqr;")
    public class65 field5591 = new class65(5);

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lwu;")
    public class376 field5589;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public boolean field5573;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lms;")
    public class763 field5577;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lwu;")
    private class376 field5585;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method2348(int arg0, boolean arg1) {
        field5581++;
        if (arg1 == this.field5573) {
            return;
        }
        this.field5573 = arg1;
        this.method2352((byte) -60);
        if (arg0 != 3) {
            method2356(-80);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 26)
    public final void method2349(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field5585 = null;
        }
        class65 var3 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method553(arg1, -15782);
        }
        field5574++;
        class65 var4 = this.field5590;
        synchronized (this.field5590) {
            this.field5590.method553(arg1, -15782);
        }
        class65 var5 = this.field5591;
        synchronized (this.field5591) {
            this.field5591.method553(arg1, -15782);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 47)
    public final void method2350(byte arg0) {
        field5588++;
        class65 var2 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method558(0);
        }
        class65 var3 = this.field5590;
        synchronized (this.field5590) {
            this.field5590.method558(0);
        }
        if (arg0 < 94) {
            this.method2357((byte) 126);
        }
        class65 var4 = this.field5591;
        synchronized (this.field5591) {
            this.field5591.method558(0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIILft;Lwu;I)V", line = 69)
    public static final void method2351(int arg0, boolean arg1, int arg2, int arg3, class3 arg4, class376 arg5, int arg6) {
        field5576++;
        int var7 = -113 / ((-arg0 - 86) / 32);
        class238.method1498(arg1, 106, arg6, arg2, arg3, arg5);
        class577.field7577 = arg4;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 83)
    public final void method2352(byte arg0) {
        field5587++;
        class65 var2 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method561((byte) -78);
        }
        class65 var3 = this.field5590;
        synchronized (this.field5590) {
            this.field5590.method561((byte) -78);
        }
        class65 var4 = this.field5591;
        synchronized (this.field5591) {
            this.field5591.method561((byte) -78);
            if (arg0 >= -30) {
                this.method2354(-72, -71);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 104)
    public static final void method2353(int arg0) {
        if (arg0 != 11473) {
            return;
        }
        while (class3.field63.method1655(false, class732.field10143) >= 15) {
            int var1 = class3.field63.method1664(2059, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class134 var3 = (class134) class390.field5470.method2135((long) var1, (byte) 31);
            if (var3 == null) {
                class556 var4 = new class556();
                var4.field10297 = var1;
                var3 = new class134(var4);
                class390.field5470.method2143(-1, var3, (long) var1);
                var2 = true;
                class302.field4281[class243.field3403++] = var3;
            }
            class556 var5 = var3.field2154;
            class628.field8351[class306.field4404++] = var1;
            var5.field10265 = class650.field8633;
            if (var5.field7328 != null && var5.field7328.method1193((byte) -94)) {
                class474.method2671(false, var5);
            }
            int var6 = class3.field63.method1664(2059, 1);
            if (var6 == 1) {
                class600.field7882[class92.field1118++] = var1;
            }
            int var7 = (class3.field63.method1664(2059, 3) + 4 & 0xCE000007) << 11;
            int var8 = class3.field63.method1664(2059, 2);
            var5.method3099((byte) -80, class292.field4177.method2358(class3.field63.method1664(2059, 14), 8881));
            int var9 = class3.field63.method1664(2059, 1);
            int var10 = class3.field63.method1664(2059, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class3.field63.method1664(2059, 5);
            if (var11 > 15) {
                var11 -= 32;
            }
            var5.method4146((byte) 119, var5.field7328.field2544);
            var5.field10293 = var5.field7328.field2562 << 3;
            if (var2) {
                var5.method4143((byte) -17, var7, true);
            }
            var5.method3095(var9 == 1, class472.field6475.field10322[0] + var11, class472.field6475.field10321[0] + var10, var5.method2256(-1), var8, 108);
            if (var5.field7328.method1193((byte) -87)) {
                class153.method1120(var5, 0, var5.field10322[0], null, var5.field3508, var5.field10321[0], -652104791, null);
            }
        }
        field5582++;
        class3.field63.method1660(-73);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V", line = 185)
    public final void method2354(int arg0, int arg1) {
        field5578++;
        this.field5592 = arg1;
        class65 var3 = this.field5590;
        synchronized (this.field5590) {
            this.field5590.method561((byte) -78);
        }
        class65 var4 = this.field5591;
        synchronized (this.field5591) {
            this.field5591.method561((byte) -78);
            if (arg0 != 5) {
                method2353(-122);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 203)
    public static final void method2355(String arg0, boolean arg1) {
        if (!arg1) {
            field5583++;
            class494.method2789(0, arg0, "", (byte) -15, "", "", 0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 214)
    public static final void method2356(int arg0) {
        if (arg0 <= 26) {
            method2356(38);
        }
        field5575++;
        for (class9 var1 = (class9) class141.field2256.method21(2); var1 != null; var1 = (class9) class141.field2256.method9(-127)) {
            class628 var2 = var1.field163;
            if (var2.field8364) {
                var1.method3564(true);
                var2.method3458(false);
            } else if (class29.field474 >= var2.field8360) {
                var2.method3457((byte) 0, class244.field3417);
                if (var2.field8364) {
                    var1.method3564(true);
                } else {
                    class294.method1821(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 250)
    public final void method2357(byte arg0) {
        class65 var2 = this.field5590;
        synchronized (this.field5590) {
            this.field5590.method561((byte) -78);
        }
        field5584++;
        class65 var3 = this.field5591;
        synchronized (this.field5591) {
            this.field5591.method561((byte) -78);
        }
        if (arg0 > -116) {
            this.field5585 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lpha;", line = 266)
    public final class166 method2358(int arg0, int arg1) {
        field5586++;
        class65 var3 = this.field5580;
        class166 var4;
        synchronized (this.field5580) {
            var4 = (class166) this.field5580.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field5585;
        byte[] var6;
        synchronized (this.field5585) {
            var6 = this.field5585.method2218((byte) 119, class463.method2627(82, arg0), class251.method1533(arg1 - 8984, arg0));
        }
        class166 var7 = new class166();
        var7.field2566 = arg0;
        var7.field2576 = this;
        if (var6 != null) {
            var7.method1189(new class677(var6), (byte) -54);
        }
        var7.method1196(-65536);
        class65 var8 = this.field5580;
        synchronized (this.field5580) {
            this.field5580.method556((byte) 0, (long) arg0, var7);
        }
        if (arg1 != 8881) {
            this.method2350((byte) 50);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lms;IZLwu;Lwu;)V", line = 340)
    public class400(class763 arg0, int arg1, boolean arg2, class376 arg3, class376 arg4) {
        this.field5589 = arg4;
        this.field5573 = arg2;
        this.field5577 = arg0;
        this.field5585 = arg3;
        if (this.field5585 != null) {
            int var6 = this.field5585.method2198(0) - 1;
            this.field5585.method2195(var6, 0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 305)
    public static final void method2359(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field5579++;
        if (class5.field124 == null) {
            return;
        }
        if (class5.field124.field2987 == 1) {
            class5.field124 = null;
            return;
        }
        if (class5.field124.field2987 == 2) {
            class506.method2844(2, class411.field5709, class718.field9979, (byte) -128);
            class5.field124 = null;
            return;
        }
    }
}
