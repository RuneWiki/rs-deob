import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class215 {

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "[Ldga;")
    public class441[] field2826 = null;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "Lpd;")
    public class428 field2825 = null;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "[Ldga;")
    public class441[] field2832 = null;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "Lpd;")
    public class428 field2831 = null;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "Lpd;")
    public class428 field2821 = null;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "Z")
    public boolean field2829;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "[I")
    public static int[] field2824 = new int[13];

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "Lga;")
    public static class332 field2827;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "Lga;")
    public static class332 field2828;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field2828 = null;
        field2827 = null;
        if (arg0 == 16) {
            field2824 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1366(int arg0, byte arg1, int arg2) {
        if (arg1 < 53) {
            return false;
        } else {
            field2823++;
            return (arg2 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIII)V")
    public static final void method1367(int arg0, int arg1, int arg2, int arg3) {
        class207 var4 = class153.field2168[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class363 var5 = var4.field2763;
        class363 var6 = var4.field2764;
        if (var5 != null) {
            var5.field4796 = (short) (var5.field4796 * arg3 / (0x10 << class62.field762 - 7));
            var5.field4803 = (short) (var5.field4803 * arg3 / (0x10 << class62.field762 - 7));
        }
        if (var6 != null) {
            var6.field4796 = (short) (var6.field4796 * arg3 / (0x10 << class62.field762 - 7));
            var6.field4803 = (short) (var6.field4803 * arg3 / (0x10 << class62.field762 - 7));
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(JJ)J")
    public static long method1368(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(IIII)V")
    public static final void method1369(int arg0, int arg1, int arg2, int arg3) {
        field2830++;
        int var4 = class125.field1745 + arg1;
        int var5 = class4.field23 + arg2;
        if (class153.field2168 == null || arg1 < 0 || arg2 < 0 || arg1 >= class703.field9886 || class431.field5789 <= arg2 || !class602.field8408.method3554(class618.field8566, (byte) -125) && class408.field5369.field385 != arg3) {
            return;
        }
        if (arg0 != -1257869271) {
            field2828 = null;
        }
        long var6 = (long) (arg3 << 28 | var5 << 14 | var4);
        class543 var8 = (class543) class290.field3835.method3057(1, var6);
        if (var8 == null) {
            class429.method2423(arg3, arg1, arg2);
            return;
        }
        class685 var9 = (class685) var8.field7435.method2506(68);
        if (var9 == null) {
            class429.method2423(arg3, arg1, arg2);
            return;
        }
        class488 var10 = (class488) class429.method2423(arg3, arg1, arg2);
        if (var10 == null) {
            var10 = new class488(arg1 << 9, class246.field3214[arg3].method1611(arg1, true, arg2), arg2 << 9, arg3, arg3);
        } else {
            var10.field6755 = var10.field6769 = -1;
        }
        var10.field6753 = var9.field9691;
        var10.field6751 = var9.field9690;
        label61: while (true) {
            class685 var11 = (class685) var8.field7435.method2505(-109);
            if (var11 == null) {
                break;
            }
            if (var10.field6751 != var11.field9690) {
                var10.field6755 = var11.field9690;
                var10.field6759 = var11.field9691;
                while (true) {
                    class685 var12 = (class685) var8.field7435.method2505(-117);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field6751 != var12.field9690 && var10.field6755 != var12.field9690) {
                        var10.field6769 = var12.field9690;
                        var10.field6752 = var12.field9691;
                    }
                }
            }
        }
        int var13 = class180.method1211(arg3, true, (arg1 << 9) + 256, (arg2 << 9) + 256);
        var10.field385 = (byte) arg3;
        var10.field397 = arg2 << 9;
        var10.field398 = arg1 << 9;
        var10.field388 = var13;
        var10.field386 = (byte) arg3;
        if (class8.method44(arg2, arg1, 15090)) {
            var10.field386++;
        }
        class182.method1213(arg3, arg1, arg2, var13, var10);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static final void method1370(byte arg0) {
        class481.field6687.method2168((byte) -93);
        field2822++;
        if (arg0 < 59) {
            method1367(27, 29, 41, 43);
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lag;)V")
    public class215(class469 arg0) {
        this.field2829 = arg0.field6524;
        class81.method431(-4242, arg0);
        if (this.field2829) {
            byte[] var6 = class116.method682(class3.field9, false, (byte) -46);
            this.field2831 = new class428(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class116.method682(class242.field3190, false, (byte) -68);
            this.field2825 = new class428(arg0, 6410, 128, 128, 16, var7, 6410);
            class630 var8 = arg0.field6394;
            if (var8.method3486(-83)) {
                byte[] var9 = class116.method682(class41.field520, false, (byte) -68);
                this.field2821 = new class428(arg0, 6408, 128, 128, 16);
                class428 var10 = new class428(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3489(var10, 2.0F, false, this.field2821)) {
                    this.field2821.method1577(9729);
                } else {
                    this.field2821.method1581(-114);
                    this.field2821 = null;
                }
                var10.method1581(-124);
            }
        } else {
            this.field2832 = new class441[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class643.method3576((byte) 97, var2 * 128 * 128 * 2, class3.field9, 32768);
                this.field2832[var2] = new class441(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2826 = new class441[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class643.method3576((byte) 108, var3 * 128 * 128 * 2, class242.field3190, 32768);
                this.field2826[var3] = new class441(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
