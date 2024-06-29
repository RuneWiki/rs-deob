import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class161 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lqd;")
    public static class37 field2332 = new class37(200);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class183.method1181(arg2, (byte) -69, arg1, class163.field2370[arg5], arg0);
        field2330++;
        int var8 = arg4 - 1;
        class183.method1181(arg2, (byte) -69, arg1, class163.field2370[arg4], arg0);
        if (arg3 != -27138) {
            method1082(true);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class163.field2370[var6];
            var7[arg0] = var7[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)J")
    public static final long method1079(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1926; var4++) {
            class162 var5 = var3.field1908[var4];
            if ((var5.field2350 >> 29 & 0x3L) == 2L && var5.field2353 == arg1 && var5.field2357 == arg2) {
                return var5.field2350;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method84(Component arg0, byte arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method1080(byte[] arg0, int arg1, boolean arg2) {
        field2329++;
        if (arg0 == null) {
            return null;
        }
        if (~arg0.length < arg1 && !class271.field4250) {
            try {
                class76 var3 = (class76) Class.forName("hf").getDeclaredConstructor().newInstance();
                var3.method505(arg0, (byte) 49);
                return var3;
            } catch (Throwable var4) {
                class271.field4250 = true;
            }
        }
        return arg2 ? class251.method1657(arg0, 65) : arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ICI)I")
    public static final int method1081(int arg0, char arg1, int arg2) {
        field2328++;
        int var3 = arg1 << 4;
        if (arg2 != -1) {
            return 11;
        }
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method82(Component arg0, int arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method1082(boolean arg0) {
        field2332 = null;
        if (!arg0) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lve;I)V")
    public static final void method1083(class233 arg0, int arg1) {
        class213.field3050 = arg0.method1522(7233, "p11_full");
        class48.field702 = arg0.method1522(7233, "p12_full");
        class276.field4422 = arg0.method1522(7233, "b12_full");
        field2334++;
        class118.field1738 = arg0.method1522(7233, "mapfunction");
        class90.field1375 = arg0.method1522(7233, "hitmarks");
        class264.field3982 = arg0.method1522(7233, "hitbar_default");
        class72.field1109 = arg0.method1522(7233, "headicons_pk");
        class267.field4143 = arg0.method1522(7233, "headicons_prayer");
        class108.field1564 = arg0.method1522(7233, "hint_headicons");
        class24.field319 = arg0.method1522(7233, "hint_mapmarkers");
        int var2 = -2 % ((arg1 - 43) / 40);
        class52.field762 = arg0.method1522(7233, "mapflag");
        class260.field3933 = arg0.method1522(7233, "cross");
        class84.field1299 = arg0.method1522(7233, "mapdots");
        class223.field3332 = arg0.method1522(7233, "scrollbar");
        class53.field775 = arg0.method1522(7233, "name_icons");
        class30.field433 = arg0.method1522(7233, "floorshadows");
        class207.field2995 = arg0.method1522(7233, "compass");
        class122.field1768 = arg0.method1522(7233, "hint_mapedge");
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
    public abstract int method83(int arg0);
}
