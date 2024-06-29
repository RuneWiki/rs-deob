import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class357 extends class43 {

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Z")
    public static boolean field4843 = false;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Lsj;")
    public static class432 field4846;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4845;

    static {
        new class72("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 3)
    public static final void method2255(int arg0) {
        field4837++;
        class283.field3699.method1701(true);
        for (class266 var1 = (class266) class97.field1138.method1690((byte) -112); var1 != null; var1 = (class266) class97.field1138.method1699((byte) 30)) {
            if (var1.field3424 < 1000) {
                var1.method263(false);
                class283.field3699.method1696(false, var1);
            }
        }
        if (arg0 < 69) {
            field4844 = -30;
        }
        class283.field3699.method1695(0, class97.field1138);
        if (class264.field3404 != null || class38.field453 > 0) {
            return;
        }
        int var2 = -1;
        if (class208.field2516 != null) {
            var2 = class208.field2516.method6(false);
        }
        if (!class49.field574) {
            if (class213.field2621 >= 0) {
                var2 = class213.field2621;
            }
            class213.field2621 = -1;
            if (var2 == 0 && (class396.field5388 == 1 && class57.field660 > 2 || client.method2703(84))) {
                var2 = 2;
            }
            if (var2 == 2 && class57.field660 > 0) {
                if (class208.field2516 == null) {
                    class219.method1332((byte) -124, class242.field3232, class301.field4014);
                } else {
                    class219.method1332((byte) -125, class208.field2516.method2(false), class208.field2516.method5(27878));
                }
            }
            if (var2 != 0 || class57.field660 <= 0) {
                return;
            }
            class416.method2559(5519);
            return;
        }
        if (var2 == -1) {
            int var3 = class358.field4866.method1860(16);
            int var4 = class358.field4866.method1858(-18493);
            if (class148.field1735 - 10 > var3 || var3 > (class148.field1735 + class143.field1686 + 10) || class76.field941 - 10 > var4 || var4 > (class76.field941 + class194.field2298 + 10)) {
                class49.field574 = false;
                class31.method203(class194.field2298, class143.field1686, class76.field941, class148.field1735, 174);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class148.field1735;
        int var6 = class76.field941;
        int var7 = class143.field1686;
        int var8 = class208.field2516.method5(27878);
        int var9 = class208.field2516.method2(false);
        int var10 = -1;
        for (int var11 = 0; var11 < class57.field660; var11++) {
            if (class231.field3044) {
                int var15 = var6 - (-(class57.field660 - var11 - 1) * 16 - 33);
                if (var8 > var5 && var8 < (var5 + var7) && (var15 - 13) < var9 && (var15 + 4) > var9) {
                    var10 = var11;
                }
            } else {
                int var16 = (class57.field660 - var11 - 1) * 16 + var6 + 31;
                if (var8 > var5 && var8 < var5 + var7 && var9 > (var16 - 13) && var9 < (var16 + 3)) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class35 var13 = new class35(class97.field1138);
            for (class266 var14 = (class266) var13.method227(1798357390); var14 != null; var14 = (class266) var13.method224(-1354376344)) {
                if (var10 == var12) {
                    class76.method452(0, var14);
                }
                var12++;
            }
        }
        class49.field574 = false;
        class31.method203(class194.field2298, class143.field1686, class76.field941, class148.field1735, 174);
        return;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z", line = 153)
    public final boolean method2256(int arg0, int arg1) {
        if (arg0 > -24) {
            return true;
        } else {
            field4840++;
            return (this.field4847 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I", line = 164)
    public final int method2257(byte arg0) {
        if (arg0 <= 86) {
            field4845 = null;
        }
        field4834++;
        return class31.method197(this.field4847, (byte) -83);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)I", line = 180)
    public final int method2258(boolean arg0) {
        field4841++;
        if (arg0) {
            field4846 = null;
        }
        return this.field4847 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Z", line = 192)
    public final boolean method2259(int arg0) {
        field4835++;
        if (arg0 == 2) {
            return (this.field4847 & 0x37CCE9) >> 21 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Z", line = 205)
    public final boolean method2260(byte arg0) {
        if (arg0 > -42) {
            field4844 = 39;
        }
        field4839++;
        return (this.field4847 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 217)
    public static final boolean method2261(String arg0, int arg1) {
        field4838++;
        return arg1 == 18495 ? class363.method2279(1309, arg0, 10, true) : true;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 229)
    public static void method2262(int arg0) {
        field4846 = null;
        if (arg0 != -1) {
            method2255(23);
        }
        field4845 = null;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Z)Z", line = 258)
    public final boolean method2263(boolean arg0) {
        if (arg0) {
            field4842++;
            return ((this.field4847 & 0x7EFBB2) >> 22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(II)V", line = 268)
    public class357(int arg0, int arg1) {
        this.field4847 = arg0;
        this.field4836 = arg1;
    }
}
