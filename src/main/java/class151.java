import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class151 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lsg;")
    private class159 field2722;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ldf;")
    private class53 field2719;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lgh;")
    private class24 field2715;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Loh;")
    public static class263 field2727 = null;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[B")
    public static byte[] field2716 = new byte[520];

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[Ldg;")
    public static class137[] field2725 = new class137[2048];

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lsb;")
    public static class216 field2724 = new class216(128);

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "S")
    public static short field2734 = 32767;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lsi;")
    private class194 field2720;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lrc;")
    public static class65 field2733;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2732;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[Lui;")
    private class220[] field2723;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lkb;Lkb;IBZ)Lui;")
    private final class220 method988(class51 arg0, class51 arg1, int arg2, byte arg3, boolean arg4) {
        field2721++;
        if (this.field2720 == null) {
            throw new RuntimeException();
        }
        this.field2720.field3497 = arg2 * 8 + 5;
        if (this.field2720.field3469.length <= this.field2720.field3497) {
            throw new RuntimeException();
        } else if (this.field2723[arg2] == null) {
            int var6 = this.field2720.method1266(4);
            if (arg3 >= -81) {
                return null;
            } else {
                int var7 = this.field2720.method1266(4);
                class220 var8 = new class220(arg2, arg0, arg1, this.field2722, this.field2719, var6, var7, arg4);
                this.field2723[arg2] = var8;
                return var8;
            }
        } else {
            return this.field2723[arg2];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        if (arg0 <= 47) {
            return true;
        }
        field2717++;
        if (this.field2720 != null) {
            return true;
        }
        if (this.field2715 == null) {
            if (this.field2722.method1033(true)) {
                return false;
            }
            this.field2715 = this.field2722.method1041(255, true, -74, 255, (byte) 0);
        }
        if (this.field2715.field3427) {
            return false;
        } else {
            this.field2720 = new class194(this.field2715.method179(1));
            this.field2723 = new class220[(this.field2720.field3469.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method990(byte arg0) {
        field2726++;
        if (arg0 != -115) {
            method992(-62);
        }
        class108.field2038.method825(arg0 + 115);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2727 = null;
        field2724 = null;
        field2732 = null;
        field2733 = null;
        if (arg0 < 115) {
            field2732 = null;
        }
        field2725 = null;
        field2716 = null;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Loh;")
    public static final class263 method992(int arg0) {
        field2730++;
        int var1 = -15 % ((arg0 + 70) / 45);
        class263 var2 = class20.field459;
        class263 var3 = class161.field2931;
        if (class55.field1157 != 0) {
            var3 = class28.field721;
        }
        if (class276.field4835 != null) {
            var2 = class124.method797(-70, new class263[] { class212.field3790, class276.field4835 });
        }
        return class124.method797(-96, new class263[] { class229.field4015, var3, class71.field1436, class136.method891(-92, class17.field388), class16.field385, class136.method891(-60, class271.field4789), var2, class116.field2162 });
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lsg;Ldf;)V")
    public class151(class159 arg0, class53 arg1) {
        this.field2722 = arg0;
        this.field2719 = arg1;
        if (!this.field2722.method1033(true)) {
            this.field2715 = this.field2722.method1041(255, true, -81, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public final void method993(int arg0) {
        field2731++;
        if (arg0 != -26634) {
            this.method989(96);
        }
        if (this.field2723 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2723.length; var2++) {
            if (this.field2723[var2] != null) {
                this.field2723[var2].method1501(arg0 + 26636);
            }
        }
        for (int var3 = 0; var3 < this.field2723.length; var3++) {
            if (this.field2723[var3] != null) {
                this.field2723[var3].method1502(arg0 + 16144);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZII)I")
    public static final int method994(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method991(124);
        }
        field2718++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + ((arg3 >> 2 << 10) + (arg0 >> 1));
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253 var7 = new class253();
        var7.field4403 = arg1 / 128;
        var7.field4387 = arg2 / 128;
        var7.field4406 = arg3 / 128;
        var7.field4407 = arg4 / 128;
        var7.field4400 = arg0;
        var7.field4389 = arg1;
        var7.field4402 = arg2;
        var7.field4391 = arg3;
        var7.field4388 = arg4;
        var7.field4410 = arg5;
        var7.field4394 = arg6;
        class70.field1415[class59.field1229++] = var7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lkb;Lkb;IB)Lui;")
    public final class220 method996(class51 arg0, class51 arg1, int arg2, byte arg3) {
        field2728++;
        if (arg3 != -60) {
            this.method993(-62);
        }
        return this.method988(arg1, arg0, arg2, (byte) -100, true);
    }
}
