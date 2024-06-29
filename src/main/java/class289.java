import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class289 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lpa;")
    private class387 field4402 = new class387(64);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lpa;")
    private class387 field4410 = new class387(100);

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lcb;")
    private class544 field4405;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
    public static int[] field4411;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1928(int arg0) {
        for (int var1 = 0; var1 < class26.field379; var1++) {
            int var2 = class790.field10846[var1];
            class14 var3 = (class14) class543.field7606.method380((byte) -3, (long) var2);
            if (var3 != null) {
                class645 var4 = var3.field262;
                class437.method2639(var4, (byte) -110, var4.field9071.field3878);
            }
        }
        field4401++;
        if (arg0 < 18) {
            method1932(null, 88);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 34)
    public final void method1929(int arg0) {
        field4408++;
        class387 var2 = this.field4402;
        synchronized (this.field4402) {
            if (arg0 < 70) {
                this.field4410 = null;
            }
            this.field4402.method2369(-1);
        }
        class387 var3 = this.field4410;
        synchronized (this.field4410) {
            this.field4410.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 51)
    public final void method1930(int arg0, int arg1) {
        field4403++;
        class387 var3 = this.field4402;
        synchronized (this.field4402) {
            this.field4402.method2366(arg0, 117);
        }
        if (arg1 != 256) {
            this.method1933(true);
        }
        class387 var4 = this.field4410;
        synchronized (this.field4410) {
            this.field4410.method2366(arg0, arg1 ^ 0x17C);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Lco;", line = 68)
    public final class129 method1931(byte arg0, int arg1) {
        field4409++;
        class387 var3 = this.field4402;
        class129 var4;
        synchronized (this.field4402) {
            var4 = (class129) this.field4402.method2373((long) arg1, arg0 ^ 0xFFFFFFC8);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field4405;
        byte[] var6;
        synchronized (this.field4405) {
            var6 = this.field4405.method3150(class35.method236(arg1, (byte) -30), -77, class519.method3025((byte) -49, arg1));
        }
        class129 var7 = new class129();
        var7.field1665 = this;
        if (arg0 != -81) {
            this.field4402 = null;
        }
        var7.field1690 = arg1;
        if (var6 != null) {
            var7.method935(47, new class120(var6));
        }
        var7.method933(true);
        class387 var8 = this.field4402;
        synchronized (this.field4402) {
            this.field4402.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwq;I)V", line = 105)
    public static final void method1932(class176 arg0, int arg1) {
        field4406++;
        if (arg1 != -2167) {
            method1932(null, 92);
        }
        if (class517.field7393 != arg0.field2551) {
            return;
        }
        if (class251.field3549.field7955 == null) {
            arg0.field2656 = 0;
            arg0.field2525 = 0;
            return;
        }
        arg0.field2597 = 150;
        arg0.field2520 = (int) (Math.sin((double) class673.field9441 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2656 = class223.field3199;
        arg0.field2569 = 5;
        arg0.field2525 = class338.method2167(class251.field3549.field7955, 0);
        arg0.field2609 = class251.field3549.field6383;
        arg0.field2670 = class251.field3549.field6378;
        arg0.field2506 = class251.field3549.field6418;
        arg0.field2668 = 0;
        class129 var2 = arg0.field2609 == -1 ? null : class203.field2975.method1931((byte) -81, arg0.field2609);
        if (var2 != null) {
            class384.method2350(var2, (byte) 117, arg0.field2506);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 147)
    public final void method1933(boolean arg0) {
        field4404++;
        class387 var2 = this.field4402;
        synchronized (this.field4402) {
            this.field4402.method2364(1);
            if (!arg0) {
                this.field4405 = null;
            }
        }
        class387 var3 = this.field4410;
        synchronized (this.field4410) {
            this.field4410.method2364(1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 164)
    public static void method1934(boolean arg0) {
        field4411 = null;
        if (arg0) {
            field4411 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Liv;ILcb;Lcb;Lcb;)V", line = 206)
    public class289(class106 arg0, int arg1, class544 arg2, class544 arg3, class544 arg4) {
        this.field4405 = arg2;
        if (this.field4405 != null) {
            int var6 = this.field4405.method3136(false) - 1;
            this.field4405.method3147(var6, 125);
        }
        class70.method558(arg4, 64, arg3, 2);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lva;", line = 177)
    public final class520 method1935(int arg0, int arg1) {
        field4407++;
        class387 var3 = this.field4410;
        synchronized (this.field4410) {
            class520 var4 = (class520) this.field4410.method2373((long) arg1, 103);
            if (var4 == null) {
                var4 = new class520(arg1);
                this.field4410.method2362(var4, 0, (long) arg1);
            }
            if (var4.method3031((byte) -2)) {
                if (arg0 != 984) {
                    this.field4402 = null;
                }
                return var4;
            } else {
                return null;
            }
        }
    }
}
