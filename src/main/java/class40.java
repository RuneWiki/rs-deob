import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class40 {

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "Lsw;")
    private class641 field308 = new class641(128);

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "Ldn;")
    private class438 field315;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "Ljs;")
    public static class275 field309 = new class275(4, 1, 1, 1);

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Let;")
    public static class509 field312 = null;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field313 = 0;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)I")
    public static final int method209(int arg0, int arg1, int arg2) {
        field311++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg1 >= -123) {
            method209(47, -13, 104);
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
    public static final void method210(int arg0) {
        int var1 = -71 / ((arg0 + 48) / 45);
        field314++;
        int var2 = class565.field8299.method3587((byte) 22, class529.field7429);
        if (var2 == 0) {
            class250.field3223 = null;
            class222.method1276(52, 0);
        } else if (var2 == 1) {
            class381.method2208(true, (byte) 0);
            class222.method1276(32, 512);
            if (class330.field4304 != null) {
                class91.method555(true);
            }
        } else {
            class381.method2208(true, (byte) (class631.field9087 - 4 & 0xFF));
            class222.method1276(89, 2);
        }
        class413.field5367 = class442.field6099;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Lhca;")
    public final class414 method211(int arg0, int arg1) {
        field305++;
        class641 var3 = this.field308;
        class414 var4;
        synchronized (this.field308) {
            var4 = (class414) this.field308.method3682(arg1 - 1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field315;
        byte[] var6;
        synchronized (this.field315) {
            var6 = this.field315.method2558(100, arg0, arg1);
        }
        class414 var7 = new class414();
        if (var6 != null) {
            var7.method2360((byte) -96, new class374(var6));
        }
        class641 var8 = this.field308;
        synchronized (this.field308) {
            this.field308.method3684(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
    public static void method212(int arg0) {
        field309 = null;
        field312 = null;
        if (arg0 > -86) {
            method210(70);
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)V")
    public final void method213(int arg0, int arg1) {
        field304++;
        if (arg1 == -1) {
            class641 var3 = this.field308;
            synchronized (this.field308) {
                this.field308.method3686((byte) 53, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V")
    public final void method214(int arg0) {
        field306++;
        class641 var2 = this.field308;
        synchronized (this.field308) {
            this.field308.method3694(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
    public final void method215(int arg0) {
        class641 var2 = this.field308;
        synchronized (this.field308) {
            this.field308.method3687(1402);
        }
        field307++;
        int var3 = -114 % ((-arg0 - 30) / 49);
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lre;ILdn;)V")
    public class40(class515 arg0, int arg1, class438 arg2) {
        this.field315 = arg2;
        this.field315.method2554(1, 126);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static final void method216(boolean arg0) {
        if (!arg0) {
            method209(32, 27, 49);
        }
        field310++;
        for (int var1 = 0; var1 < 5; var1++) {
            class637.field9150[var1] = false;
        }
        class160.field1938 = class39.field303;
        class206.field2483 = class482.field6748;
        class189.field2280 = 0;
        class560.field8242 = class168.field2055;
        class225.field2767 = -1;
        class611.field8872 = 0;
        class87.field1047 = class335.field4358;
        class617.field8931 = 5;
        class309.field3941 = class286.field3729;
        class268.field3503 = -1;
        class105.field1272 = class521.field7321;
    }
}
