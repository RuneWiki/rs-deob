import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class446 {

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Laf;")
    private class39 field6250 = new class39(64);

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field6252 = 0;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lae;")
    private class283 field6248;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field6249;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
    public static int[] field6255 = new int[4];

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Loe;")
    public static class15 field6251 = new class15();

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method2702(byte arg0) {
        field6255 = null;
        if (arg0 != 104) {
            field6255 = null;
        }
        field6251 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)Lbja;")
    public final class250 method2703(boolean arg0, int arg1) {
        field6245++;
        class39 var3 = this.field6250;
        class250 var4;
        synchronized (this.field6250) {
            var4 = (class250) this.field6250.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            this.method2704(-37);
        }
        class283 var5 = this.field6248;
        byte[] var6;
        synchronized (this.field6248) {
            var6 = this.field6248.method1849(arg1, (byte) -90, 4);
        }
        class250 var7 = new class250();
        var7.field3720 = this;
        var7.field3710 = arg1;
        if (var6 != null) {
            var7.method1677(true, new class511(var6));
        }
        var7.method1676(-50);
        class39 var8 = this.field6250;
        synchronized (this.field6250) {
            this.field6250.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public final void method2704(int arg0) {
        field6256++;
        if (arg0 != -20678) {
            this.method2703(true, 40);
        }
        class39 var2 = this.field6250;
        synchronized (this.field6250) {
            this.field6250.method319(-22);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Lsha;")
    public static final class115 method2705(int arg0, int arg1, int arg2) {
        int var3 = -18 % ((-arg1 - 58) / 46);
        field6246++;
        class115 var4 = class384.method2387(false, arg0);
        if (arg2 == -1) {
            return var4;
        } else if (var4 == null || var4.field1394 == null || var4.field1394.length <= arg2) {
            return null;
        } else {
            return var4.field1394[arg2];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIB)V")
    public static final void method2706(int arg0, int arg1, int arg2, byte arg3) {
        field6247++;
        class17 var4 = class245.method1634(1, (long) arg2, 9);
        var4.method66((byte) -119);
        var4.field104 = arg0;
        if (arg3 > -21) {
            field6255 = null;
        }
        var4.field107 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class446(class788 arg0, int arg1, class283 arg2) {
        this.field6248 = arg2;
        this.field6249 = this.field6248.method1867(4, (byte) 49);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
    public final void method2707(byte arg0) {
        field6254++;
        if (arg0 < 12) {
            this.field6252 = 1;
        }
        class39 var2 = this.field6250;
        synchronized (this.field6250) {
            this.field6250.method314(-2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
    public final void method2708(int arg0, boolean arg1) {
        if (!arg1) {
            this.field6249 = 49;
        }
        field6253++;
        class39 var3 = this.field6250;
        synchronized (this.field6250) {
            this.field6250.method308(-1, arg0);
        }
    }
}
