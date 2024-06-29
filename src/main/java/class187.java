import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class187 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lim;")
    public static class170 field2932 = new class170(new byte[5000]);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field2938 = 100;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lnl;")
    public static class29 field2937 = new class29(0, -1);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    public static int[] field2939 = new int[1024];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Llk;")
    public static class264 field2935;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lvl;")
    public static class73 field2936;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lrb;")
    public static final class210 method1314(int arg0, int arg1) {
        field2933++;
        if (class287.field4644 && class241.field3883 <= arg1 && arg1 <= class287.field4641) {
            int var2 = 50 % ((arg0 + 17) / 49);
            return class61.field888[arg1 - class241.field3883];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1315(Component arg0, int arg1) {
        field2934++;
        arg0.addMouseListener(class108.field1568);
        if (arg1 != -28500) {
            field2938 = -49;
        }
        arg0.addMouseMotionListener(class108.field1568);
        arg0.addFocusListener(class108.field1568);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1316(byte arg0, String arg1, int arg2) {
        field2931++;
        String var3 = class256.method1820(-16963, class40.method226(arg1, 0));
        boolean var4 = false;
        for (int var5 = 0; var5 < class272.field4432; var5++) {
            class1 var6 = class35.field409[class52.field745[var5]];
            if (var6 != null && var6.field31 != null && var6.field31.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg2 == 1) {
                    class150.field2218.method445(198, 7);
                    class150.field2218.method1161(0, 128);
                    class217.field3393++;
                    class150.field2218.method1207(true, class52.field745[var5]);
                } else if (arg2 == 4) {
                    class150.field2218.method445(180, 7);
                    class275.field4459++;
                    class150.field2218.method1161(0, 128);
                    class150.field2218.method1207(true, class52.field745[var5]);
                } else if (arg2 == 5) {
                    class112.field1623++;
                    class150.field2218.method445(5, 7);
                    class150.field2218.method1213(class52.field745[var5], (byte) -105);
                    class150.field2218.method1202(24924, 0);
                } else if (arg2 == 6) {
                    class150.field2218.method445(101, 7);
                    class150.field2218.method1207(true, class52.field745[var5]);
                    class253.field4137++;
                    class150.field2218.method1183(0, 984049208);
                } else if (arg2 == 7) {
                    class150.field2218.method445(97, 7);
                    class150.field2218.method1203(class52.field745[var5], 714844776);
                    class138.field1982++;
                    class150.field2218.method1214(-55, 0);
                }
                break;
            }
        }
        if (!var4) {
            class236.method1655(0, "", 101, class94.field1405 + var3);
        }
        if (arg0 <= 6) {
            field2932 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field2939 = null;
        field2937 = null;
        field2935 = null;
        field2936 = null;
        field2932 = null;
        if (arg0 > -19) {
            field2935 = null;
        }
    }
}
