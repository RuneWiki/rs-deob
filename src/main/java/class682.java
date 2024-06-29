import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class682 extends class154 {

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Ljava/lang/String;")
    public String field9498;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Leaa;")
    public static class528 field9499 = new class528();

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field9500 = 0;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lvl;")
    public static class15 field9501 = new class15(86, 11);

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "F")
    public static float field9502;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lmh;")
    public static class659 field9503;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 3)
    public static void method3842(int arg0) {
        field9503 = null;
        field9501 = null;
        if (arg0 < 25) {
            method3845(-118);
        }
        field9499 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V", line = 18)
    public static final void method3843(Rectangle[] arg0, int arg1, byte arg2) throws class789 {
        if (arg2 >= -82) {
            field9501 = null;
        }
        field9497++;
        if (class278.field3847 == 1) {
            class369.field5000.method560(arg0, arg1, class112.field2110, class361.field4925);
        } else {
            class369.field5000.method560(arg0, arg1, 0, 0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 33)
    public static final boolean method3844(int arg0, String arg1, int arg2) {
        int var3 = -52 % ((16 - arg0) / 41);
        field9496++;
        if (class630.field8751.field10241) {
            class178.field2812 = new class752();
            class178.field2812.field10366 = arg1;
            class178.field2812.field10374 = arg2;
            if (class556.field7850 != class517.field7028) {
                class178.field2812.field10372 = class178.field2812.field10374 + 40000;
                class178.field2812.field10373 = class178.field2812.field10374 + 50000;
            }
            for (int var4 = 0; var4 < class18.field426.length; var4++) {
                if (class18.field426[var4].field10096 == arg2) {
                    class655.field9070 = class18.field426[var4].field5323;
                }
            }
            return true;
        }
        String var5 = "";
        if (class556.field7850 != class517.field7028) {
            var5 = ":" + (arg2 + 7000);
        }
        String var6 = "";
        if (class178.field2806 != null) {
            var6 = "/p=" + class178.field2806;
        }
        String var7 = "http://" + arg1 + var5 + "/l=" + class464.field6309 + "/a=" + class361.field4919 + var6 + "/j" + (class740.field10206 ? "1" : "0") + ",o" + (class460.field6254 ? "1" : "0") + ",a2";
        try {
            class594.field8348.getAppletContext().showDocument(new URL(var7), "_self");
            return true;
        } catch (Exception var8) {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)[Lot;", line = 87)
    public static final class617[] method3845(int arg0) {
        field9495++;
        return arg0 == -2 ? new class617[] { class278.field3845, class33.field562, class543.field7395 } : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lfe;Z)V", line = 100)
    public static final void method3846(class597 arg0, boolean arg1) {
        for (int var2 = arg0.field8368; var2 <= arg0.field8372; var2++) {
            for (int var3 = arg0.field8369; var3 <= arg0.field8365; var3++) {
                class549 var4 = class325.field4448[arg0.field7391][var2][var3];
                if (var4 != null) {
                    class58 var5 = var4.field7466;
                    class58 var6 = null;
                    while (var5 != null) {
                        if (var5.field815 == arg0) {
                            if (var6 == null) {
                                var4.field7466 = var5.field811;
                            } else {
                                var6.field811 = var5.field811;
                            }
                            var5.method410((byte) 14);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field811;
                    }
                }
            }
        }
        if (!arg1) {
            class9.method60(arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 151)
    public class682() {
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 158)
    public class682(String arg0) {
        this.field9498 = arg0;
    }
}
