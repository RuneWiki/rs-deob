import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class337 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field4470 = 443;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
    private boolean field4477 = false;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
    private boolean field4478 = false;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public int field4468 = 43594;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Log;")
    public static class599 field4473 = new class599(2);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/String;")
    public String field4480;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILwd;)Lnga;")
    public final class477 method1940(int arg0, class248 arg1) {
        if (arg0 != -16093) {
            this.method1940(108, null);
        }
        field4469++;
        return arg1.method1510(this.field4477 ? this.field4470 : this.field4468, this.field4478, 22, this.field4480);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ldc;I)V")
    public static final void method1941(class5 arg0, int arg1) {
        field4474++;
        arg0.method2233((byte) 85, class630.field9028.method3782((byte) 51));
        arg0.method2233((byte) 90, class622.field8936.method3782((byte) 51));
        arg0.method2233((byte) -48, class474.field6631.method3782((byte) 51));
        arg0.method2233((byte) -53, class502.field7007.method3782((byte) 51));
        arg0.method2233((byte) 70, class538.field7834.method3782((byte) 51));
        arg0.method2233((byte) 120, class89.field1249.method3782((byte) 51));
        if (arg1 != 0) {
            return;
        }
        arg0.method2233((byte) 92, class275.field3764.method3782((byte) 51));
        arg0.method2233((byte) -51, class123.field1589.method3782((byte) 51));
        arg0.method2233((byte) 105, class692.field9847.method3782((byte) 51));
        arg0.method2233((byte) -63, class416.field5897.method3782((byte) 51));
        arg0.method2233((byte) -97, class6.field62.method3782((byte) 51));
        arg0.method2233((byte) -54, class78.field1145.method3782((byte) 51));
        arg0.method2233((byte) 71, class351.field4691.method3782((byte) 51));
        arg0.method2233((byte) 83, class420.field5953.method3782((byte) 51));
        arg0.method2233((byte) 111, class166.field2040.method3782((byte) 51));
        arg0.method2233((byte) -109, class153.field1890.method3782((byte) 51));
        arg0.method2233((byte) -88, class361.field4803.method3782((byte) 51));
        arg0.method2233((byte) -111, class163.field1998.method3782((byte) 51));
        arg0.method2233((byte) 84, class618.field8872.method3782((byte) 51));
        arg0.method2233((byte) -113, class187.field2287.method3782((byte) 51));
        arg0.method2233((byte) -93, class469.field6553.method3782((byte) 51));
        arg0.method2233((byte) -56, class672.field9662.method3782((byte) 51));
        arg0.method2233((byte) -73, class704.field9963.method3782((byte) 51));
        arg0.method2233((byte) -56, class634.field9107.method3782((byte) 51));
        arg0.method2233((byte) 79, class70.field1068.method3782((byte) 51));
        arg0.method2233((byte) 76, class670.field9630.method3782((byte) 51));
        arg0.method2233((byte) -93, class568.field8300.method3782((byte) 51));
        arg0.method2233((byte) 75, class216.field2812.method3782((byte) 51));
        arg0.method2233((byte) -77, class384.field5116.method3782((byte) 51));
        arg0.method2233((byte) -104, class232.field3103.method3782((byte) 51));
        arg0.method2233((byte) 96, class384.field5115.method3782((byte) 51));
        arg0.method2233((byte) 66, class561.field8099.method3782((byte) 51));
        arg0.method2233((byte) -73, class503.method2916((byte) -86));
        arg0.method2233((byte) 92, class633.method3618((byte) -127));
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lvk;I)Z")
    public final boolean method1942(class337 arg0, int arg1) {
        field4472++;
        if (arg1 > -101) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else {
            return this.field4476 == arg0.field4476 && this.field4480.equals(arg0.field4480);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static final void method1943(byte arg0) {
        field4475++;
        class363[] var1 = class34.field680;
        synchronized (class34.field680) {
            for (int var2 = 0; var2 < class34.field680.length; var2++) {
                class34.field680[var2] = new class363();
                class6.field59[var2] = 0;
            }
            if (arg0 >= -60) {
                method1945(-69, -50, 103);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public final void method1944(int arg0) {
        field4479++;
        if (!this.field4477) {
            this.field4478 = true;
            this.field4477 = true;
        } else if (this.field4478) {
            this.field4478 = false;
        } else {
            this.field4477 = false;
        }
        if (arg0 != 0) {
            this.field4480 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
    public static final boolean method1945(int arg0, int arg1, int arg2) {
        field4471++;
        if (arg2 == 0) {
            return (arg0 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method1946(boolean arg0) {
        if (arg0) {
            method1945(-97, 112, 39);
        }
        field4473 = null;
    }
}
