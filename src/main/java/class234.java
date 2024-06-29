import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class234 {

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    private int field4313 = 128;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    private int field4321 = 0;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
    public boolean field4322 = false;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    private int field4331 = 0;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    private int field4326 = 128;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    private int field4328 = 0;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public int field4332 = -1;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lqk;")
    private static class207 field4307 = class24.method212(255, "Tue");

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lqk;")
    private static class207 field4316 = class24.method212(255, "Thu");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lqk;")
    private static class207 field4312 = class24.method212(255, "Sun");

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lqk;")
    private static class207 field4329 = class24.method212(255, "Sat");

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Lqk;")
    public static class207 field4327 = class24.method212(255, "::fpsoff");

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "Lqk;")
    private static class207 field4330 = class24.method212(255, "Wed");

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "[S")
    public static short[] field4324 = new short[] { 44, 21, 17, 33, 18, 39, 38, 2 };

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lqk;")
    private static class207 field4311 = class24.method212(255, "Fri");

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field4334 = -1;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lqk;")
    private static class207 field4317 = class24.method212(255, "Mon");

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "[Lqk;")
    public static class207[] field4335 = new class207[100];

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[Lqk;")
    public static class207[] field4323 = new class207[] { field4312, field4317, field4307, field4330, field4316, field4311, field4329 };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field4303;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lpk;")
    public static class99 field4309;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[S")
    private short[] field4304;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[S")
    private short[] field4305;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[S")
    private short[] field4320;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[S")
    private short[] field4325;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLmd;)Lqk;")
    public static final class207 method1670(byte arg0, class220 arg1) {
        field4310++;
        if (client.method1112(arg1).method837(1) == 0) {
            return null;
        } else if (arg0 > -76) {
            return null;
        } else if (arg1.field3914 == null || arg1.field3914.method1443(6).method1450((byte) -110) == 0) {
            return class138.field2385 ? class128.field2227 : null;
        } else {
            return arg1.field3914;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static final void method1671(boolean arg0) {
        class176.field3180.method1390((byte) 120);
        if (arg0) {
            field4308++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public static void method1672(boolean arg0) {
        field4309 = null;
        field4311 = null;
        field4330 = null;
        field4312 = null;
        field4323 = null;
        field4327 = null;
        field4329 = null;
        if (arg0) {
            field4318 = -118;
        }
        field4307 = null;
        field4324 = null;
        field4335 = null;
        field4316 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)Lba;")
    public final class166 method1673(int arg0, int arg1, int arg2, int arg3) {
        class166 var5 = (class166) class191.field3373.method1387((long) this.field4315, 122);
        field4333++;
        if (var5 == null) {
            class210 var6 = class210.method1488(class280.field4919, this.field4303, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4320 != null) {
                for (int var7 = 0; var7 < this.field4320.length; var7++) {
                    var6.method1485(this.field4320[var7], this.field4304[var7]);
                }
            }
            if (this.field4325 != null) {
                for (int var8 = 0; var8 < this.field4325.length; var8++) {
                    var6.method1503(this.field4325[var8], this.field4305[var8]);
                }
            }
            var5 = var6.method1498(this.field4321 + 64, this.field4331 + 850, -30, -50, -30);
            class191.field3373.method1385((long) this.field4315, var5, (byte) -118);
        }
        class166 var9;
        if (this.field4332 == -1 || arg0 == -1) {
            var9 = var5.method286(true, true, true);
        } else {
            var9 = class16.method101((byte) -87, this.field4332).method472(arg2, arg3, arg0, (byte) -70, var5);
        }
        int var10 = -20 / ((-arg1 - 22) / 57);
        if (this.field4313 != 128 || this.field4326 != 128) {
            var9.method294(this.field4313, this.field4326, this.field4313);
        }
        if (this.field4328 != 0) {
            if (this.field4328 == 90) {
                var9.method285();
            }
            if (this.field4328 == 180) {
                var9.method295();
            }
            if (this.field4328 == 270) {
                var9.method273();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILv;)V")
    private final void method1674(int arg0, int arg1, class149 arg2) {
        if (arg1 != -10346) {
            this.method1676(-68, (class149) null);
        }
        if (arg0 == 1) {
            this.field4303 = arg2.method1050(arg1 + 1272016914);
        } else if (arg0 == 2) {
            this.field4332 = arg2.method1050(1272006568);
        } else if (arg0 == 4) {
            this.field4313 = arg2.method1050(1272006568);
        } else if (arg0 == 5) {
            this.field4326 = arg2.method1050(1272006568);
        } else if (arg0 == 6) {
            this.field4328 = arg2.method1050(1272006568);
        } else if (arg0 == 7) {
            this.field4321 = arg2.method1045((byte) 124);
        } else if (arg0 == 8) {
            this.field4331 = arg2.method1045((byte) 108);
        } else if (arg0 == 9) {
            this.field4322 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1045((byte) 102);
            this.field4304 = new short[var4];
            this.field4320 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4320[var5] = (short) arg2.method1050(1272006568);
                this.field4304[var5] = (short) arg2.method1050(1272006568);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1045((byte) 108);
            this.field4305 = new short[var6];
            this.field4325 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4325[var7] = (short) arg2.method1050(1272006568);
                this.field4305[var7] = (short) arg2.method1050(1272006568);
            }
        }
        field4319++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method1675(class99 arg0, int arg1, class99 arg2) {
        class243.field4418 = arg2;
        if (arg1 != -16295) {
            return;
        }
        field4306++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class199.field3499 = arg0;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class199.field3499.method698(7, 34);
        class25.field526 = var4 + var5;
        class70.field1252 = var6 + var5;
        class124.field2164 = var3 + var5;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILv;)V")
    public final void method1676(int arg0, class149 arg1) {
        while (true) {
            int var3 = arg1.method1045((byte) -95);
            if (var3 == 0) {
                if (arg0 != 100) {
                    method1670((byte) -37, (class220) null);
                }
                field4314++;
                return;
            }
            this.method1674(var3, -10346, arg1);
        }
    }
}
