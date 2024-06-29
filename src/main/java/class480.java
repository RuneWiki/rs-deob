import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class480 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lku;")
    private class232 field6726 = new class232(64);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Lku;")
    public class232 field6739 = new class232(50);

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Lku;")
    public class232 field6740 = new class232(5);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lb;")
    public class201 field6735;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lb;")
    private class201 field6727;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
    public boolean field6721;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lus;")
    public static class1 field6732 = new class1(5, -2);

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Z")
    public static boolean field6738 = true;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "F")
    public static float field6736;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field6741;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Lb;")
    public static class201 field6733;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)Ldr;")
    public final class466 method2800(int arg0, byte arg1) {
        field6722++;
        class232 var3 = this.field6726;
        class466 var4;
        synchronized (this.field6726) {
            var4 = (class466) this.field6726.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 32) {
            method2805(false, (byte[][]) null, (class22) null);
        }
        byte[] var5 = this.field6727.method1257(class408.method2411((byte) 104, arg0), class40.method261(true, arg0), 24558);
        class466 var6 = new class466();
        var6.field6536 = this;
        var6.field6570 = arg0;
        if (var5 != null) {
            var6.method2732(new class276(var5), (byte) -44);
        }
        var6.method2734(89);
        class232 var7 = this.field6726;
        synchronized (this.field6726) {
            this.field6726.method1473(var6, (long) arg0, 123);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method2801(int arg0) {
        field6732 = null;
        field6733 = null;
        if (arg0 != 0) {
            method2805(false, (byte[][]) null, (class22) null);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public final void method2802(boolean arg0) {
        if (!arg0) {
            field6737 = -4;
        }
        field6724++;
        class232 var2 = this.field6726;
        synchronized (this.field6726) {
            this.field6726.method1475(0);
        }
        class232 var3 = this.field6739;
        synchronized (this.field6739) {
            this.field6739.method1475(0);
        }
        class232 var4 = this.field6740;
        synchronized (this.field6740) {
            this.field6740.method1475(0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final void method2803(byte arg0) {
        class232 var2 = this.field6726;
        synchronized (this.field6726) {
            this.field6726.method1478((byte) -118);
        }
        field6725++;
        class232 var3 = this.field6739;
        synchronized (this.field6739) {
            if (arg0 >= -104) {
                return;
            }
            this.field6739.method1478((byte) -87);
        }
        class232 var4 = this.field6740;
        synchronized (this.field6740) {
            this.field6740.method1478((byte) -120);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final void method2804(int arg0) {
        field6729++;
        class232 var2 = this.field6739;
        synchronized (this.field6739) {
            this.field6739.method1478((byte) -123);
        }
        class232 var3 = this.field6740;
        synchronized (this.field6740) {
            if (arg0 != 337670243) {
                this.field6741 = -102;
            }
            this.field6740.method1478((byte) -105);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z[[BLir;)V")
    public static final void method2805(boolean arg0, byte[][] arg1, class22 arg2) {
        if (arg0) {
            field6737 = 7;
        }
        for (int var3 = 0; var3 < arg2.field5412; var3++) {
            class164.method1027(false);
            for (int var4 = 0; var4 < class58.field758 >> 3; var4++) {
                for (int var5 = 0; var5 < (class287.field4181 >> 3); var5++) {
                    int var6 = class311.field4395[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field5406 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = (var6 & 0xFFF2A6) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class368.field5294.length; var12++) {
                                if (class368.field5294[var12] == var11 && arg1[var12] != null) {
                                    arg2.method150(var8, class422.field5918, (var9 & 0x7) * 8, var3, var7, (var10 & 0x7) * 8, (byte) 89, class141.field1878, var5 * 8, var4 * 8, arg1[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field6728++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
    public final void method2806(int arg0, boolean arg1) {
        field6731++;
        if (arg0 != -23920) {
            this.field6740 = null;
        }
        if (this.field6721 != arg1) {
            this.field6721 = arg1;
            this.method2803((byte) -126);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public final void method2807(int arg0, int arg1) {
        this.field6741 = arg1;
        field6730++;
        int var3 = 114 % ((arg0 - 12) / 50);
        class232 var4 = this.field6739;
        synchronized (this.field6739) {
            this.field6739.method1478((byte) -93);
        }
        class232 var5 = this.field6740;
        synchronized (this.field6740) {
            this.field6740.method1478((byte) -101);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    public final void method2808(int arg0, int arg1) {
        field6723++;
        class232 var3 = this.field6726;
        synchronized (this.field6726) {
            this.field6726.method1486(438127120, arg0);
        }
        class232 var4 = this.field6739;
        synchronized (this.field6739) {
            this.field6739.method1486(438127120, arg0);
        }
        class232 var5 = this.field6740;
        synchronized (this.field6740) {
            this.field6740.method1486(438127120, arg0);
            int var6 = 102 % ((arg1 - 10) / 32);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lea;IZLb;Lb;)V")
    public class480(class353 arg0, int arg1, boolean arg2, class201 arg3, class201 arg4) {
        this.field6735 = arg4;
        this.field6727 = arg3;
        this.field6721 = arg2;
        if (this.field6727 != null) {
            int var6 = this.field6727.method1233(-1) - 1;
            this.field6727.method1235(0, var6);
        }
    }
}
