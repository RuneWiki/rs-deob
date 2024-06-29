import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class85 extends Canvas {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field1235;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1239 = "red:";

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1241 = 0;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lei;")
    public static class176 field1236;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field1240;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public static int[] field1233;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[Lae;")
    public static class174[] field1238;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method613(int arg0) {
        if (arg0 != 104) {
            field1239 = null;
        }
        class216.field3426.method1556((byte) 106);
        field1234++;
    }

    @OriginalMember(owner = "client!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1235.update(arg0);
        field1242++;
    }

    @OriginalMember(owner = "client!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1237++;
        this.field1235.paint(arg0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method614(int arg0, String arg1, String arg2, int arg3) {
        class281.field4477 = arg0;
        class2.field6 = arg2;
        class153.field2532 = arg1;
        field1244++;
        if (class2.field6.equals("") || class153.field2532.equals("")) {
            class136.field2224 = 3;
        } else if (class155.field2554 == -1) {
            class206.field3312 = 1;
            class240.field3826 = 0;
            class136.field2224 = -3;
            class179.field2889 = 0;
            class152 var4 = new class152(arg3);
            var4.method1074(10, 76);
            var4.method1119((int) (Math.random() * 9.9999999E7D), (byte) 124);
            var4.method1069(class193.method1431(class2.field6, false), -124);
            var4.method1119((int) (Math.random() * 9.9999999E7D), (byte) 90);
            var4.method1073(class153.field2532, false);
            var4.method1119((int) (Math.random() * 9.9999999E7D), (byte) 74);
            var4.method1131(-51, class44.field645, class204.field3268);
            class220.field3532.field2511 = 0;
            class220.field3532.method1074(24, arg3 ^ 0xDF);
            class220.field3532.method1074(var4.field2511 + 2, 68);
            class220.field3532.method1094(arg3 - 700862104, 545);
            class220.field3532.method1075(var4.field2523, -1279016712, var4.field2511, 0);
        } else {
            class62.method451(arg3 - 249);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method615(int arg0, int arg1) {
        field1232++;
        if (class51.field738 == arg1) {
            return false;
        }
        class121.field1771 = new int[4][13][13];
        class267.field4316 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class138.field2237[var2] = new class113(104, 104);
        }
        if (arg0 != 28962) {
            field1236 = null;
        }
        class51.field738 = arg1;
        class86.field1277 = new byte[4][104][104];
        class43.field627 = new class187[4][104][104];
        class105.field1533 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1236 = null;
        if (arg0 != -18836) {
            field1236 = null;
        }
        field1233 = null;
        field1238 = null;
        field1240 = null;
        field1239 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class85(Component arg0) {
        this.field1235 = arg0;
    }
}
