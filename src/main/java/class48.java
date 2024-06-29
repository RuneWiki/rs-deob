import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[Loe;")
    public volatile class140[] field843 = new class140[2];

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Z")
    public volatile boolean field852 = false;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Z")
    public volatile boolean field845 = false;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Leb;")
    public static class230 field853 = class68.method589(0, ":allyreq:");

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Leb;")
    public static class230 field854 = class68.method589(0, "0(U");

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "J")
    public static volatile long field855 = 0L;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Leb;")
    public static class230 field851 = class68.method589(0, "(U0a )2 in: ");

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field850 = 0;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Leb;")
    public static class230 field856 = class68.method589(0, "overlay");

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lfh;")
    public class129 field847;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[S")
    public static short[] field844;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILt;)V")
    public static final void method400(int arg0, class191 arg1) {
        if (arg0 != 1261384544) {
            field850 = -81;
        }
        field846++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        if (arg1.field3380 == 0) {
            var5 = class176.method1283(arg1.field3382, arg1.field3381, arg1.field3377);
        }
        if (arg1.field3380 == 1) {
            var5 = class44.method380(arg1.field3382, arg1.field3381, arg1.field3377);
        }
        if (arg1.field3380 == 2) {
            var5 = class178.method1297(arg1.field3382, arg1.field3381, arg1.field3377);
        }
        if (arg1.field3380 == 3) {
            var5 = class191.method1359(arg1.field3382, arg1.field3381, arg1.field3377);
        }
        if (var5 != 0L) {
            var2 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
            var3 = (int) var5 >> 14 & 0x1F;
            var4 = (int) var5 >> 20 & 0x3;
        }
        arg1.field3373 = var2;
        arg1.field3370 = var4;
        arg1.field3369 = var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JI)V")
    public static final void method401(long arg0, int arg1) {
        field857++;
        if (arg0 == 0L) {
            return;
        }
        class153.field2729++;
        if (arg1 > 119) {
            class153.field2747.method978(107, 118);
            class153.field2747.method148(arg0, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lkk;IZ)Z")
    public static final boolean method402(class223 arg0, int arg1, boolean arg2) {
        field849++;
        byte[] var3 = arg0.method1543(false, arg1);
        if (!arg2) {
            field851 = null;
        }
        if (var3 == null) {
            return false;
        } else {
            class150.method1135(var3, (byte) 103);
            return true;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method403(int arg0) {
        field853 = null;
        field851 = null;
        field844 = null;
        int var1 = -47 % ((60 - arg0) / 51);
        field856 = null;
        field854 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method404(int arg0) {
        field842++;
        if (arg0 != -6742) {
            method403(38);
        }
        class179.field3145++;
        class153.field2747.method978(75, 22);
        class153.field2747.method181(-20053, class146.field2621);
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V")
    public final void run() {
        field848++;
        this.field845 = true;
        try {
            while (!this.field852) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class140 var2 = this.field843[var1];
                    if (var2 != null) {
                        var2.method1073(-93);
                    }
                }
                class52.method417((byte) -115, 10L);
                class121.method950(this.field847, (byte) -124, (Object) null);
            }
        } catch (Exception var9) {
            class154.method1177(var9, (byte) -123, (String) null);
        } finally {
            Object var6 = null;
            this.field845 = false;
        }
    }
}
