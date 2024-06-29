import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class222 extends Canvas {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field3515;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
    public static long field3516 = 0L;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ve", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 23)
    public final void update(Graphics arg0) {
        this.field3515.update(arg0);
        field3518++;
    }

    @OriginalMember(owner = "client!ve", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 38)
    public final void paint(Graphics arg0) {
        this.field3515.paint(arg0);
        field3511++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 46)
    public static final void method1622(int arg0, int arg1) {
        class271.field4200.method1353(-1, arg0);
        field3517++;
        if (arg1 != 23133) {
            field3513 = -128;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lug;Lug;ILug;)V", line = 57)
    public static final void method1623(class253 arg0, class253 arg1, int arg2, class253 arg3) {
        if (arg2 >= 42) {
            class1.field11 = arg0;
            class172.field2829 = arg3;
            field3510++;
            class213.field3352 = arg1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([FI)[F", line = 75)
    public static final float[] method1624(float[] arg0, int arg1) {
        field3512++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 20598) {
            method1622(5, 40);
        }
        float[] var2 = new float[arg0.length];
        class54.method423(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 94)
    public static final void method1625(int arg0) {
        while (true) {
            if (class111.field1544.method1940(class61.field899, -8703) >= 27) {
                int var1 = class111.field1544.method1950((byte) -69, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class59.field870[var1] == null) {
                        class59.field870[var1] = new class212();
                        var2 = true;
                    }
                    class212 var3 = class59.field870[var1];
                    class85.field1157[class79.field1083++] = var1;
                    var3.field4718 = class229.field3595;
                    if (var3.field3346 != null && var3.field3346.method1191(0)) {
                        class298.method2075(var3, -125);
                    }
                    var3.method1541(46, class41.method339(11, class111.field1544.method1950((byte) 72, 14)));
                    int var4 = class111.field1544.method1950((byte) 76, 5);
                    int var5 = class111.field1544.method1950((byte) 90, 1);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    if (var5 == 1) {
                        class36.field526[class277.field4285++] = var1;
                    }
                    int var6 = class111.field1544.method1950((byte) -21, 1);
                    int var7 = class111.field1544.method1950((byte) -28, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class55.field749[class111.field1544.method1950((byte) -120, 3)];
                    if (var2) {
                        var3.field4674 = var3.field4715 = var8;
                    }
                    var3.method2098(var3.field3346.field2555, (byte) 43);
                    var3.field4684 = var3.field3346.field2604;
                    var3.field4690 = var3.field3346.field2581;
                    if (var3.field4690 == 0) {
                        var3.field4715 = 0;
                    }
                    var3.method2102(class146.field2310.field4708[0] + var7, var3.method2099((byte) 123), class146.field2310.field4675[0] + var4, (byte) -101, var6 == 1);
                    if (var3.field3346.method1191(0)) {
                        class58.method475(var3, (class337) null, 0, class154.field2392, var3.field4708[0], 128, var3.field4675[0], (class121) null);
                    }
                    continue;
                }
            }
            if (arg0 > -16) {
                return;
            }
            field3514++;
            class111.field1544.method1945((byte) -127);
            return;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 171)
    public class222(Component arg0) {
        this.field3515 = arg0;
    }
}
