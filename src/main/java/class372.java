import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class372 extends class349 {

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field5484 = 0;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5489 = "wave2:";

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "[C")
    public static char[] field5492 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Ljg;")
    public static class112 field5482;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lkm;")
    public class402 field5490;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[Laj;")
    public class137[] field5481;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLtj;I)Z")
    public final boolean method2444(int arg0, boolean arg1, class298 arg2, int arg3) {
        if (!arg1) {
            field5487 = 126;
        }
        field5485++;
        if (this.field5481 != null) {
            for (int var5 = 0; var5 < this.field5481.length; var5++) {
                if (this.field5481[var5].method967(arg0, arg3) && this.field5490.method120(arg3, arg2, arg0, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static final void method2445(int arg0) {
        field5491++;
        class189.field2593 = new class199(8);
        class229.field3153 = 0;
        int var1 = -5 % ((arg0 - 81) / 43);
        for (class411 var2 = (class411) class309.field4576.method54((byte) 18); var2 != null; var2 = (class411) class309.field4576.method53((byte) 123)) {
            var2.method2604();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILsj;)Lsj;")
    public static final class248 method2446(int arg0, class248 arg1) {
        field5486++;
        if (arg1.field3584 != -1) {
            return class27.method224(65535, arg1.field3584);
        }
        if (arg0 != -14263) {
            method2446(-81, (class248) null);
        }
        int var2 = arg1.field3636 >>> 16;
        class6 var3 = new class6(class242.field3402);
        for (class28 var4 = (class28) var3.method29(false); var4 != null; var4 = (class28) var3.method32(-1)) {
            if (var4.field482 == var2) {
                return class27.method224(arg0 ^ 0xFFFF37B6, (int) var4.field6091);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Lqr;")
    public static final class212 method2447(int arg0, byte arg1) {
        field5483++;
        class51 var2 = class159.field2043;
        class212 var3;
        synchronized (class159.field2043) {
            var3 = (class212) class159.field2043.method378((byte) 28, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class167.field2272.method1235(class242.method1567(arg0, (byte) -126), false, class160.method1075(0, arg0));
        class212 var5 = new class212();
        var5.field2942 = arg0;
        if (var4 != null) {
            var5.method1407((byte) -78, new class341(var4));
        }
        var5.method1396(0);
        if (var5.field2936) {
            var5.field2905 = 0;
            var5.field2885 = false;
        }
        if (!class399.field5851 && var5.field2892) {
            var5.field2923 = null;
            var5.field2911 = null;
        }
        class51 var6 = class159.field2043;
        synchronized (class159.field2043) {
            class159.field2043.method367((long) arg0, var5, true);
        }
        int var7 = 46 % ((-arg1 - 49) / 37);
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
    public static void method2448(int arg0) {
        field5482 = null;
        field5492 = null;
        field5489 = null;
        if (arg0 != 35) {
            method2448(-76);
        }
    }
}
