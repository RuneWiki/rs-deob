import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class185 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lmo;")
    private class336 field2785 = new class336(128);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lnl;")
    private class435 field2786;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lne;")
    public static class118 field2788 = new class118(128);

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lap;")
    public static class310 field2791 = new class310(49, 8);

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lmj;", line = 3)
    public final class62 method1315(int arg0, int arg1) {
        field2790++;
        class336 var3 = this.field2785;
        class62 var4;
        synchronized (this.field2785) {
            var4 = (class62) this.field2785.method2113(0, (long) arg0);
        }
        if (arg1 >= -95) {
            this.method1315(127, 19);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2786.method2633(class2.method11((byte) 125, arg0), class117.method910(arg0, (byte) 119), -31);
        class62 var6 = new class62();
        if (var5 != null) {
            var6.method563(new class161(var5), 12);
        }
        class336 var7 = this.field2785;
        synchronized (this.field2785) {
            this.field2785.method2116((long) arg0, (byte) -101, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIJI)V", line = 32)
    public static final void method1316(byte arg0, int arg1, long arg2, int arg3) {
        if (arg0 < 114) {
            field2787 = 6;
        }
        field2789++;
        int var5 = ((int) arg2 & 0x7EFA4) >> 14;
        int var6 = ((int) arg2 & 0x392E84) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class282.method1880(123, class262.field3781.field5807[0], 0, 0, arg1, class262.field3781.field5811[0], true, var5, var6, 0, arg3);
            return;
        }
        class267 var8 = class468.field6599.method506(-121, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field3843;
            var9 = var8.field3856;
        } else {
            var9 = var8.field3843;
            var10 = var8.field3856;
        }
        int var11 = var8.field3920;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class282.method1880(125, class262.field3781.field5807[0], var9, var11, arg1, class262.field3781.field5811[0], true, 0, 0, var10, arg3);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 77)
    public static void method1317(byte arg0) {
        field2788 = null;
        if (arg0 == -106) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 107)
    public class185(class280 arg0, int arg1, class435 arg2) {
        this.field2786 = arg2;
        if (this.field2786 != null) {
            int var4 = this.field2786.method2658(-1) - 1;
            this.field2786.method2638(1, var4);
        }
    }
}
