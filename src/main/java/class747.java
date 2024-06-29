import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class747 {

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "Lof;")
    private class620 field10421 = new class620(64);

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "Loh;")
    private class404 field10414;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public int field10419;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "[F")
    public static float[] field10415 = new float[2];

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field10416 = new String[5];

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "[Lvj;")
    public static class440[] field10420;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V", line = 4)
    public static void method4150(byte arg0) {
        field10420 = null;
        field10415 = null;
        field10416 = null;
        if (arg0 != -53) {
            field10416 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)I", line = 29)
    public static final int method4151(int arg0, int arg1, int arg2) {
        if (arg0 != -115595585) {
            field10420 = null;
        }
        field10418++;
        int var3 = arg1 - 1 & arg2 >> 31;
        return (arg2 + (arg2 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLtp;)V", line = 49)
    public static final void method4152(byte arg0, class532 arg1) {
        field10413++;
        if (!class568.field8075) {
            return;
        }
        class189.field2239++;
        if (arg1.field7576 != null) {
            class532 var2 = class689.method3895((byte) 122, class283.field3449, class620.field8886);
            if (var2 != null) {
                class622 var3 = new class622();
                var3.field8904 = arg1.field7576;
                var3.field8907 = var2;
                var3.field8908 = arg1;
                class133.method859(var3);
            }
        }
        class249 var4 = class289.method1715(class10.field71, 116, class41.field470);
        var4.field3016.method1421(arg1.field7704, -20798);
        if (arg0 != -80) {
            method4151(-22, 66, 5);
        }
        var4.field3016.method1444(1507430696, arg1.field7691);
        var4.field3016.method1446(class421.field6093, true);
        var4.field3016.method1449(-1, arg1.field7628);
        var4.field3016.method1445(class283.field3449, true);
        var4.field3016.method1444(arg0 ^ 0xA6266E98, class620.field8886);
        class510.method3017(var4, 59);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 122)
    public class747(class301 arg0, int arg1, class404 arg2) {
        this.field10414 = arg2;
        this.field10419 = this.field10414.method2482(0, 19);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)Lkj;", line = 94)
    public final class564 method4153(int arg0, byte arg1) {
        field10417++;
        class620 var3 = this.field10421;
        class564 var4;
        synchronized (this.field10421) {
            var4 = (class564) this.field10421.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field10414;
        byte[] var6;
        synchronized (this.field10414) {
            var6 = this.field10414.method2481(19, arg0, (byte) 124);
        }
        class564 var7 = new class564();
        if (var6 != null) {
            var7.method3284(0, new class244(var6));
        }
        class620 var8 = this.field10421;
        synchronized (this.field10421) {
            this.field10421.method3537(123, (long) arg0, var7);
            if (arg1 < 17) {
                method4152((byte) -79, null);
            }
            return var7;
        }
    }
}
