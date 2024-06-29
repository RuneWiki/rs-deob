import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class375 extends Canvas {

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field5188;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public static int[] field5186 = new int[13];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2244(int arg0) {
        field5187++;
        try {
            if (class219.field3190 == 1) {
                int var1 = class129.field1796.method1098(4096);
                if (var1 > 0 && class129.field1796.method1082(false)) {
                    int var2 = var1 - class312.field4298;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class129.field1796.method1107(var2, 16384);
                    return;
                }
                class129.field1796.method1102(120);
                class129.field1796.method1085(false);
                if (class514.field7343 == null) {
                    class219.field3190 = 0;
                } else {
                    class219.field3190 = 2;
                }
                class33.field403 = null;
                class518.field7392 = null;
            }
            if (arg0 >= -41) {
                method2246(93);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class129.field1796.method1102(121);
            class219.field3190 = 0;
            class33.field403 = null;
            class514.field7343 = null;
            class518.field7392 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 52)
    public final void paint(Graphics arg0) {
        this.field5188.paint(arg0);
        field5185++;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 60)
    public static void method2245(int arg0) {
        if (arg0 >= -42) {
            field5186 = null;
        }
        field5186 = null;
    }

    @OriginalMember(owner = "client!ti", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 75)
    public final void update(Graphics arg0) {
        field5190++;
        this.field5188.update(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 84)
    public static final void method2246(int arg0) {
        field5189++;
        int[] var1 = new int[class150.field2242.field9095];
        int var2 = 0;
        for (int var3 = 0; var3 < class150.field2242.field9095; var3++) {
            class540 var5 = class150.field2242.method3606((byte) 0, var3);
            if (var5.field8042 >= 0 || var5.field8099 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 != 25042) {
            method2244(-91);
        }
        class482.field6877 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class482.field6877[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 119)
    public class375(Component arg0) {
        this.field5188 = arg0;
    }
}
