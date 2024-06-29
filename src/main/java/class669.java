import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class669 extends class434 {

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "[I")
    public int[] field9281 = new int[class182.field2292 + 8191];

    @OriginalMember(owner = "client!et", name = "db", descriptor = "[I")
    public int[] field9285 = new int[2200];

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "[I")
    public int[] field9286 = new int[class182.field2304];

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "[I")
    public int[] field9283 = new int[12];

    @OriginalMember(owner = "client!et", name = "ib", descriptor = "[[I")
    public int[][] field9290 = new int[12][class182.field2292 - -8191];

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "[I")
    public int[] field9287 = new int[class182.field2292 + 8191];

    @OriginalMember(owner = "client!et", name = "kb", descriptor = "[[I")
    public int[][] field9292 = new int[2200][64];

    @OriginalMember(owner = "client!et", name = "nb", descriptor = "[I")
    public int[] field9295 = new int[12];

    @OriginalMember(owner = "client!et", name = "mb", descriptor = "[I")
    public int[] field9294 = new int[32];

    @OriginalMember(owner = "client!et", name = "ob", descriptor = "[[I")
    public int[][] field9296 = new int[32][512];

    @OriginalMember(owner = "client!et", name = "jb", descriptor = "Llr;")
    public class312 field9291;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!et", name = "gb", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!et", name = "lb", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
    public static boolean field9289;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
    public static final boolean method3663(int arg0, int arg1, int arg2) {
        if (arg1 != -18020) {
            return false;
        } else {
            ++field9282;
            return class688.method3756(arg0, arg2, -123) || class192.method1256(arg0, arg2, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public final void method2479(byte arg0) {
        ++field9293;
        this.field9291 = new class312(super.field5596);
        if (arg0 != -18) {
            method3665(-64);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lql;)V")
    public class669(class173 arg0) {
        super(arg0);
        this.field9291 = new class312(arg0);
        super.field5619 = new class404(super.field5596);
        super.field5608 = new class404(super.field5596);
        super.field5609 = new class404(super.field5596);
        super.field5600 = new class404(super.field5596);
        super.field5601 = new class404(super.field5596);
        super.field5628 = new class404(super.field5596);
        super.field5625 = new class404(super.field5596);
        super.field5618 = new class404(super.field5596);
        super.field5606 = new class404(super.field5596);
        super.field5630 = new class404(super.field5596);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Lcg;")
    public static final class11 method3664(int arg0, int arg1, int arg2, int arg3) {
        ++field9284;
        class11 var4 = null;
        if (arg3 != 0) {
            method3664(-98, -87, 68, -120);
        }
        if (~arg1 == -1) {
            var4 = class130.method931(class649.field9035, (byte) 54, class35.field514);
            ++class217.field2846;
        }
        if (~arg1 == -2) {
            var4 = class130.method931(class649.field9035, (byte) 54, class336.field4342);
            ++class565.field7379;
        }
        var4.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
        var4.field114.method2385(class186.field2376 + arg2, -1540);
        var4.field114.method2385(class100.field1326 + arg0, -1540);
        class49.field689 = false;
        class199.field2598 = arg0;
        class247.field3310 = arg2;
        method3665(15);
        return var4;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static final void method3665(int arg0) {
        ++field9288;
        class367 var1 = class573.method3057(arg0, 0, arg0 + -13);
        var1.method2113(-119);
    }
}
