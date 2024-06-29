import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public abstract class class27 {

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lt;")
    public static class35 field309 = class3.method28(false, "Sword Shop");

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Lt;")
    public static class35 field308 = class3.method28(false, "Switch to ");

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lr;")
    public static class33 field311 = null;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lea;")
    public static class10 field310;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Lna;")
    public static class27 field313;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lca;")
    public static class6 field307;

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field306;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "[B")
    public static byte[] field305;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIZLpa;)[Lja;", line = 4)
    public static final class20[] method151(int arg0, int arg1, boolean arg2, class31 arg3) {
        if (arg2) {
            method155(null, -104, 115, 12);
        }
        return class33.method195(arg0, arg1, -119, arg3) ? class19.method117(127) : null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BJ)V", line = 34)
    public static final void method152(byte arg0, long arg1) {
        int var3 = 41 / ((46 - arg0) / 60);
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class15.method95(arg1 - 1L, 0);
            class15.method95(1L, 0);
        } else {
            class15.method95(arg1, 0);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BIBII)V", line = 60)
    public static final void method153(byte arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = arg4 >> 6;
        int var6 = arg3 >> 6;
        if (class19.field223[arg1][var6][var5] == null) {
            class19.field223[arg1][var6][var5] = new byte[4096];
        }
        int var7 = -24 % ((-arg0 - 17) / 47);
        class19.field223[arg1][var6][var5][mapview.method15(arg3 << 6, 4032) + mapview.method15(63, arg4)] = arg2;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 76)
    public static void method154(int arg0) {
        field313 = null;
        field306 = null;
        field305 = null;
        field310 = null;
        if (arg0 != 6162) {
            field313 = null;
        }
        field308 = null;
        field309 = null;
        field307 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/Component;III)Lu;", line = 122)
    public static final class36 method155(Component arg0, int arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("s");
            if (arg3 == 4032) {
                class36 var5 = (class36) var4.getDeclaredConstructor().newInstance();
                var5.method27(arg0, -1, arg2, arg1);
                return var5;
            } else {
                return (class36) null;
            }
        } catch (Throwable var8) {
            class3 var7 = new class3();
            var7.method27(arg0, -1, arg2, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IBI)I")
    public abstract int method125(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V")
    public abstract void method124(byte arg0);
}
