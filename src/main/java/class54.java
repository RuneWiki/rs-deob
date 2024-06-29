import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class54 extends class428 {

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public int field734 = -1;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public int field742 = -1;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lpi;")
    public static class340 field731 = new class340(18, -1);

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "Lhb;")
    public static class250 field740 = new class250(20, 7);

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Lhb;")
    public static class250 field744 = new class250(17, 0);

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "[Lf;")
    public static class404[] field745;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "[Z")
    public static boolean[] field737;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Lf;)V", line = 5)
    public static final void method316(int arg0, class404[] arg1) {
        class221.field2853 = arg1.length;
        ++field743;
        class374.field4857 = new int[class221.field2853 + 10];
        class270.field3427 = new class404[class221.field2853 - -10];
        class526.method3115(arg1, 0, class270.field3427, 0, class221.field2853);
        for (int var2 = arg0; ~class221.field2853 < ~var2; ++var2) {
            class374.field4857[var2] = class270.field3427[var2].method369();
        }
        for (int var3 = class221.field2853; var3 < class270.field3427.length; ++var3) {
            class374.field4857[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLqa;)V", line = 31)
    public final void method175(byte arg0, class129 arg1) {
        ++field739;
        if (arg0 != 91) {
            method316(80, (class404[]) null);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lqa;B)Lvs;", line = 41)
    public final class465 method172(class129 arg0, byte arg1) {
        ++field736;
        class142 var3 = arg0.method847();
        var3.method982(super.field5861, super.field5864, super.field5863);
        class465 var4 = class92.method635(3, -16461);
        int var5 = 76 % ((48 - arg1) / 60);
        if (~this.field742 != 0) {
            class507 var6 = class89.field1238.method111(this.field742, 46).method2974(2048, 0, 126, arg0, this.field741, 0, -1, (class44) null, (class345) null);
            if (var6 != null) {
                var6.method520(var3, var4.field6843[2], 0);
            }
        }
        if (~this.field734 != 0) {
            class507 var7 = class89.field1238.method111(this.field734, -70).method2974(2048, 0, -124, arg0, this.field733, 0, -1, (class44) null, (class345) null);
            if (var7 != null) {
                var7.method520(var3, var4.field6843[1], 0);
            }
        }
        class507 var8 = class89.field1238.method111(this.field738, 101).method2974(2048, 0, 127, arg0, this.field735, 0, -1, (class44) null, (class345) null);
        if (var8 != null) {
            var8.method520(var3, var4.field6843[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILqa;)Z", line = 84)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field732;
        class142 var5 = arg3.method847();
        if (arg1) {
            this.field738 = -22;
        }
        var5.method982(super.field5861, super.field5864, super.field5863);
        class507 var6 = class89.field1238.method111(this.field738, 56).method2974(131072, 0, -96, arg3, this.field735, 0, -1, (class44) null, (class345) null);
        if (var6 != null && var6.method499(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field734 != 0) {
                class507 var7 = class89.field1238.method111(this.field734, -127).method2974(131072, 0, 126, arg3, this.field733, 0, -1, (class44) null, (class345) null);
                if (var7 != null && var7.method499(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (~this.field742 != 0) {
                class507 var8 = class89.field1238.method111(this.field742, -99).method2974(131072, 0, -10, arg3, this.field741, 0, -1, (class44) null, (class345) null);
                if (var8 != null && var8.method499(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 123)
    public static void method317(int arg0) {
        field740 = null;
        field737 = null;
        field731 = null;
        field745 = null;
        if (arg0 != 7) {
            method317(-10);
        }
        field744 = null;
    }
}
