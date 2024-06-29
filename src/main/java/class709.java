import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class709 {

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lqr;")
    private class65 field9833 = new class65(64);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lwu;")
    public class376 field9824;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lwu;")
    private class376 field9829;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    public static int[] field9830 = new int[128];

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lkaa;")
    public static class47 field9834;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lwu;")
    public static class376 field9836;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Z")
    public static boolean field9831;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lqea;")
    public final class129 method3981(int arg0, int arg1) {
        field9827++;
        class65 var3 = this.field9833;
        class129 var4;
        synchronized (this.field9833) {
            var4 = (class129) this.field9833.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field9829;
        byte[] var6;
        synchronized (this.field9829) {
            var6 = this.field9829.method2218((byte) 121, 3, arg1);
        }
        class129 var7 = new class129();
        var7.field2127 = this;
        if (var6 != null) {
            var7.method1016(new class677(var6), arg0 - 1646);
        }
        class65 var8 = this.field9833;
        synchronized (this.field9833) {
            if (arg0 == 1645) {
                this.field9833.method556((byte) 0, (long) arg1, var7);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public final void method3982(byte arg0) {
        if (arg0 != -69) {
            method3987((byte) -94);
        }
        field9825++;
        class65 var2 = this.field9833;
        synchronized (this.field9833) {
            this.field9833.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method3983(int arg0) {
        field9826++;
        class65 var2 = this.field9833;
        synchronized (this.field9833) {
            this.field9833.method558(0);
        }
        if (arg0 != -16976) {
            this.field9824 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method3984(int arg0) {
        if (arg0 <= 10) {
            method3987((byte) 102);
        }
        field9830 = null;
        field9836 = null;
        field9834 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIB)V")
    public static final void method3985(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 28) {
            field9831 = true;
        }
        field9823++;
        int var4 = class503.field6752 + arg0;
        int var5 = class334.field4757 + arg2;
        if (class660.field8718 == null || arg0 < 0 || arg2 < 0 || arg0 >= class719.field10004 || arg2 >= class107.field1453 || class411.field5711.field3890.method984(true) == 0 && class472.field6475.field3508 != arg1) {
            return;
        }
        long var6 = (long) (var4 | arg1 << 28 | var5 << 14);
        class635 var8 = (class635) class649.field8627.method2135(var6, (byte) 31);
        if (var8 == null) {
            class22.method229(arg1, arg0, arg2);
            return;
        }
        class11 var9 = (class11) var8.field8446.method21(2);
        if (var9 == null) {
            class22.method229(arg1, arg0, arg2);
            return;
        }
        class227 var10 = (class227) class22.method229(arg1, arg0, arg2);
        if (var10 == null) {
            var10 = new class227(arg0 << 9, class507.field6771[arg1].method1742(arg0, 76, arg2), arg2 << 9, arg1, arg1);
        } else {
            var10.field3238 = var10.field3237 = -1;
        }
        var10.field3233 = var9.field176;
        var10.field3239 = var9.field179;
        label60: while (true) {
            class11 var11 = (class11) var8.field8446.method9(-127);
            if (var11 == null) {
                break;
            }
            if (var10.field3239 != var11.field179) {
                var10.field3243 = var11.field176;
                var10.field3238 = var11.field179;
                while (true) {
                    class11 var12 = (class11) var8.field8446.method9(-127);
                    if (var12 == null) {
                        break label60;
                    }
                    if (var10.field3239 != var12.field179 && var10.field3238 != var12.field179) {
                        var10.field3237 = var12.field179;
                        var10.field3241 = var12.field176;
                    }
                }
            }
        }
        int var13 = class153.method1118((arg2 << 9) + 256, (arg0 << 9) + 256, 36, arg1);
        var10.field3510 = var13;
        var10.field3502 = arg2 << 9;
        var10.field3505 = arg0 << 9;
        var10.field3240 = 0;
        var10.field3515 = (byte) arg1;
        var10.field3508 = (byte) arg1;
        if (class498.method2810(-10387, arg0, arg2)) {
            var10.field3515++;
        }
        class240.method1508(arg1, arg0, arg2, var13, var10);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
    public final void method3986(int arg0, int arg1) {
        field9828++;
        class65 var3 = this.field9833;
        synchronized (this.field9833) {
            if (arg0 == 122) {
                this.field9833.method553(arg1, -15782);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public static final void method3987(byte arg0) {
        field9832++;
        class747.field10393 = new class672[class575.field7550.method2198(0)][];
        class580.field7607 = new class672[class575.field7550.method2198(0)][];
        if (arg0 <= 36) {
            field9836 = null;
        }
        class244.field3407 = new boolean[class575.field7550.method2198(0)];
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V")
    public class709(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field9824 = arg3;
        this.field9829 = arg2;
        this.field9829.method2195(3, 0);
    }

    static {
        for (int var0 = 0; var0 < field9830.length; var0++) {
            field9830[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field9830[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field9830[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field9830[var3] = var3 + 52 - 48;
        }
        field9830[42] = field9830[43] = 62;
        field9830[45] = field9830[47] = 63;
        field9834 = new class47(21, 7);
        field9835 = -1;
    }
}
