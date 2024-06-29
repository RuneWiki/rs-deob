import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class177 extends class55 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Z")
    private boolean field2472 = false;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[F")
    private float[] field2471 = new float[4];

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Lap;")
    private class479 field2484;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lap;")
    private class479 field2468;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Lap;")
    private class479 field2479;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lap;")
    private class479 field2475;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lwk;")
    private class145 field2478;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
    private boolean field2477;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Z")
    private boolean field2476;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Z")
    private boolean field2481;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 3)
    public final void method201(boolean arg0) {
        super.field759.method2393(1, (byte) 122);
        ++field2483;
        super.field759.method2396(22357, (class572) null);
        super.field759.method2397(class405.field5120, class405.field5120, (byte) -91);
        super.field759.method2394(class447.field5937, (byte) 97, 0);
        super.field759.method2394(class21.field383, (byte) 113, 2);
        super.field759.method2422(class447.field5937, 0, (byte) -10);
        if (arg0) {
            super.field759.method2393(0, (byte) 108);
            if (this.field2472) {
                super.field759.method2394(class447.field5937, (byte) 75, 0);
                super.field759.method2422(class447.field5937, 0, (byte) -10);
                this.field2472 = false;
            }
            if (this.field2481) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field2481 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 36)
    public static final long method1213(boolean arg0, String arg1) {
        ++field2473;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0) {
            return -66L;
        } else {
            for (int var5 = 0; var5 < var2; ++var5) {
                var3 = (var3 << 5) + -var3 + (long) arg1.charAt(var5);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V", line = 61)
    public static final void method1214(int arg0, int arg1, int arg2, int arg3) {
        ++field2480;
        int var4 = arg0 << 3;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        if (~class650.field9023 == -3) {
            class115.field1704 = var4;
            class206.field2731 = var5;
            class33.field544 = var6;
        }
        class521.field7309 = (float) var5;
        if (arg1 != -5346) {
            method1214(-114, 122, -7, -14);
        }
        class101.field1404 = (float) var6;
        class176.method1208(15030);
        class366.field4718 = true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZ)V", line = 87)
    public final void method199(int arg0, int arg1, boolean arg2) {
        ++field2487;
        if (!arg2) {
            this.method201(false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 98)
    public final void method403(byte arg0) {
        ++field2482;
        if (arg0 != 119) {
            this.field2484 = null;
        }
        if (this.field2481) {
            int var2 = super.field759.method546();
            int var3 = super.field759.method451();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field759.method2411(26860), (float) super.field759.method2401(10426) / 255.0F);
            super.field759.method2393(1, (byte) 54);
            super.field759.method2382(super.field759.method2425((byte) 105), arg0 ^ -3989);
            super.field759.method2393(0, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ltk;Lnd;)V", line = 137)
    public class177(class347 arg0, class547 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field4489) {
            this.field2484 = class101.method810(34336, arg1.method3158("gl", (byte) 122, "uw_ground_unlit"), -4348, arg0);
            this.field2468 = class101.method810(34336, arg1.method3158("gl", (byte) 94, "uw_ground_lit"), -4348, arg0);
            this.field2479 = class101.method810(34336, arg1.method3158("gl", (byte) 115, "uw_model_unlit"), -4348, arg0);
            this.field2475 = class101.method810(34336, arg1.method3158("gl", (byte) 111, "uw_model_lit"), -4348, arg0);
            if (this.field2479 != null & this.field2468 != null & this.field2484 != null & this.field2475 != null) {
                this.field2478 = super.field759.method2407(119, false, new int[] { 0, -1 }, 1, 2);
                this.field2478.method813((byte) -78, false, false);
                this.field2477 = true;
            } else {
                this.field2477 = false;
            }
        } else {
            this.field2477 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 165)
    public final void method405(int arg0) {
        ++field2474;
        int var2 = super.field759.method2389(arg0 ^ 7229);
        class477 var3 = super.field759.method2383((byte) 89);
        if (!this.field2476) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field2479.field6520 : this.field2484.field6520);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field2468.field6520 : this.field2475.field6520);
        }
        OpenGL.glEnable(34336);
        this.field2481 = true;
        var3.method2751((float) var2, 0.0F, this.field2471, (byte) 119, -1.0F, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field2471[0], this.field2471[1], this.field2471[2], this.field2471[3]);
        this.method403((byte) 119);
        if (arg0 != 7289) {
            method1214(-24, -39, 111, 63);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V", line = 198)
    public final void method197(boolean arg0, byte arg1) {
        int var3 = 103 / ((-61 - arg1) / 44);
        ++field2469;
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z", line = 207)
    public final boolean method202(int arg0) {
        ++field2470;
        if (arg0 != 1) {
            this.field2476 = true;
        }
        return this.field2477;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V", line = 220)
    public final void method196(int arg0, boolean arg1) {
        this.field2476 = arg1;
        ++field2486;
        super.field759.method2393(1, (byte) -110);
        super.field759.method2396(22357, this.field2478);
        super.field759.method2397(class740.field10325, class476.field6418, (byte) 46);
        if (arg0 != 5) {
            this.method197(true, (byte) 17);
        }
        super.field759.method2394(class21.field383, (byte) 70, 0);
        super.field759.method2036((byte) -31, false, true, class447.field5937, 2);
        super.field759.method2422(class84.field1162, 0, (byte) -10);
        super.field759.method2393(0, (byte) 97);
        this.method405(7289);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILfe;)V", line = 239)
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg2 != null) {
            if (this.field2472) {
                super.field759.method2394(class447.field5937, (byte) 61, 0);
                super.field759.method2422(class447.field5937, 0, (byte) -10);
                this.field2472 = false;
            }
            super.field759.method2396(22357, arg2);
            super.field759.method2379(arg0, -15829);
        } else if (!this.field2472) {
            super.field759.method2396(22357, super.field759.field5648);
            super.field759.method2379(1, -15829);
            super.field759.method2394(class84.field1162, (byte) 125, 0);
            super.field759.method2422(class84.field1162, 0, (byte) -10);
            this.field2472 = true;
        }
        ++field2485;
        if (arg1 < 30) {
            this.method202(97);
        }
    }
}
