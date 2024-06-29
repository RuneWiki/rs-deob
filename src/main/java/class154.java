import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class154 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lria;")
    public static class288 field2096 = null;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2098 = -60;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lkg;")
    public static class275 field2099;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[Liea;")
    public static class481[] field2100;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILtd;III)V", line = 8)
    public static final void method1073(int arg0, int arg1, class456 arg2, int arg3, int arg4, int arg5) {
        field2103++;
        class729 var6 = null;
        for (class729 var7 = (class729) class719.field10016.method3672(arg4 ^ 0xFFFFFFFD); var7 != null; var7 = (class729) class719.field10016.method3662(-1)) {
            if (var7.field10147 == arg5 && var7.field10154 == arg0 && var7.field10139 == arg3 && var7.field10140 == arg1) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class729();
            var6.field10139 = arg3;
            var6.field10147 = arg5;
            var6.field10154 = arg0;
            var6.field10140 = arg1;
            class719.field10016.method3671(var6, false);
        }
        var6.field10152 = arg2;
        var6.field10149 = false;
        if (arg4 == 2) {
            var6.field10146 = true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 52)
    public static void method1074(int arg0) {
        field2100 = null;
        field2099 = null;
        field2096 = null;
        if (arg0 != 512) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method1075(int arg0) {
        field2104++;
        if (arg0 < 106) {
            return true;
        } else {
            return (this.field2102 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z", line = 86)
    public final boolean method1076(byte arg0) {
        field2097++;
        if (arg0 < 50) {
            method1073(62, 61, null, 16, -125, -82);
        }
        return (this.field2102 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Z", line = 99)
    public final boolean method1077(int arg0) {
        field2106++;
        if (arg0 != 16) {
            field2098 = -12;
        }
        return (this.field2102 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Z", line = 112)
    public final boolean method1078(int arg0) {
        if (arg0 != -1) {
            field2099 = null;
        }
        field2105++;
        return (this.field2102 & 0x2) != 0;
    }
}
