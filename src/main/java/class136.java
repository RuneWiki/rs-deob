import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class136 {

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public int field3203 = -1;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lwd;")
    public static class150 field3190 = class2.method9(true, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3191 = 99;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lwd;")
    private static class150 field3192 = class2.method9(true, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lwd;")
    public static class150 field3197 = field3192;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lwd;")
    private static class150 field3202 = class2.method9(true, " more options");

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lwd;")
    public static class150 field3198 = field3202;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lwd;")
    private static class150 field3201 = class2.method9(true, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lwd;")
    public static class150 field3188 = field3201;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lt;")
    public static class128 field3206 = new class128(5000);

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lfa;")
    public class37 field3193;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lff;")
    public static class42 field3196;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lff;")
    public static class42 field3204;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lkf;")
    public static class75 field3195;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    public int[] field3187;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
    public static int[] field3205;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[Lwd;")
    public class150[] field3207;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method1012(boolean arg0) {
        if (arg0) {
            return;
        }
        field3190 = null;
        field3205 = null;
        field3198 = null;
        field3195 = null;
        field3192 = null;
        field3201 = null;
        field3204 = null;
        field3206 = null;
        field3197 = null;
        field3202 = null;
        field3188 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method1013(int arg0) {
        field3200++;
        int var1 = 6 / ((20 - arg0) / 56);
        try {
            Graphics var2 = class142.field3439.getGraphics();
            class121.field2794.method287(var2, true, 4, 550);
        } catch (Exception var3) {
            class142.field3439.repaint();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILcb;)V")
    public static final void method1014(boolean arg0, int arg1, class17 arg2) {
        if (class58.field1496 != null) {
            try {
                class58.field1496.method121((byte) 79);
            } catch (Exception var8) {
            }
            class58.field1496 = null;
        }
        field3189++;
        class58.field1496 = arg2;
        class30.method246((byte) -77, arg0);
        class142.field3438.field3601 = 0;
        if (arg1 != 4) {
            method1012(false);
        }
        class83.field2015 = null;
        class98.field2240 = null;
        client.field621 = 0;
        while (true) {
            class126 var3 = (class126) class131.field3081.method539((byte) -42);
            if (var3 == null) {
                while (true) {
                    class126 var4 = (class126) class22.field645.method539((byte) -42);
                    if (var4 == null) {
                        if (class109.field2531 != 0) {
                            try {
                                class148 var5 = new class148(4);
                                var5.method1126(31159, 4);
                                var5.method1126(31159, class109.field2531);
                                var5.method1114((byte) -117, 0);
                                class58.field1496.method122(0, var5.field3592, (byte) 4, 4);
                            } catch (IOException var7) {
                                try {
                                    class58.field1496.method121((byte) -102);
                                } catch (Exception var6) {
                                }
                                class134.field3158++;
                                class58.field1496 = null;
                            }
                        }
                        class126.field2927 = 0;
                        class113.field2620 = class55.method430(0);
                        return;
                    }
                    class134.field3148.method1006(var4, 16032);
                    class50.field1332.method541(var4, var4.field2228, false);
                    class66.field1684++;
                    class96.field2216--;
                }
            }
            class43.field1182.method541(var3, var3.field2228, false);
            class63.field1622++;
            class32.field932--;
        }
    }
}
