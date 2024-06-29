import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class390 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lsw;")
    private class641 field5155 = new class641(64);

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Ldn;")
    private class438 field5156;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
    public static boolean field5151 = false;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lfn;")
    public static class118 field5157 = new class118(16);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Lwb;")
    public static class274 field5159;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZ)S")
    public static final short method2237(int arg0, boolean arg1) {
        field5154++;
        if (!arg1) {
            return -108;
        }
        int var2 = (arg0 & 0xFDA2) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V")
    public static final void method2238(byte arg0, boolean arg1) {
        int var2 = 24 / ((28 - arg0) / 60);
        field5152++;
        if (arg1 && class353.field4591 != null) {
            class260.field3361 = class353.field4591.field1219;
        } else {
            class260.field3361 = -1;
        }
        class552.field8122 = null;
        class22.field146 = null;
        class353.field4591 = null;
        class138.field1682 = 0;
        class353.method1974();
        class353.field4597.method1048(-7730);
        class516.field7284 = null;
        class467.field6533 = null;
        class298.field3834 = null;
        class353.field4596 = null;
        class438.field6043 = null;
        class145.field1749 = null;
        class43.field353 = -1;
        class536.field7516 = null;
        class533.field7497 = null;
        class461.field6362 = null;
        class185.field2240 = null;
        class62.field619 = -1;
        class353.field4587.method3241(36);
        class353.field4589.method3423(64, 27936, 64);
        class353.field4587.method3246(128, 64, false);
        class353.field4592.method1750(107, 64);
        class530.field7446.method2056(128, 64);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public final void method2239(int arg0, int arg1) {
        class641 var3 = this.field5155;
        synchronized (this.field5155) {
            this.field5155.method3686((byte) 53, arg0);
        }
        if (arg1 == 28142) {
            field5150++;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2240(int arg0) {
        field5159 = null;
        field5157 = null;
        if (arg0 != -1522074006) {
            method2238((byte) -30, false);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method2241(int arg0) {
        field5158++;
        if (arg0 != 64) {
            field5159 = null;
        }
        class641 var2 = this.field5155;
        synchronized (this.field5155) {
            this.field5155.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IZ)Ljaa;")
    public final class524 method2242(int arg0, boolean arg1) {
        field5149++;
        class641 var3 = this.field5155;
        class524 var4;
        synchronized (this.field5155) {
            if (!arg1) {
                this.method2242(77, true);
            }
            var4 = (class524) this.field5155.method3682(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field5156;
        byte[] var6;
        synchronized (this.field5156) {
            var6 = this.field5156.method2558(100, arg0, 31);
        }
        class524 var7 = new class524();
        if (var6 != null) {
            var7.method2980(-1, new class374(var6));
        }
        class641 var8 = this.field5155;
        synchronized (this.field5155) {
            this.field5155.method3684(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public final void method2243(byte arg0) {
        field5153++;
        class641 var2 = this.field5155;
        synchronized (this.field5155) {
            this.field5155.method3694(0);
        }
        if (arg0 != 10) {
            field5151 = true;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lre;ILdn;)V")
    public class390(class515 arg0, int arg1, class438 arg2) {
        this.field5156 = arg2;
        this.field5156.method2554(31, 123);
    }
}
