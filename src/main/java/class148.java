import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class148 extends Canvas {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2332;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lqr;")
    public static class65 field2333 = new class65(64);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lda;")
    public static class60 field2334;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field2335;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1109(int arg0) {
        if (arg0 > 112) {
            field2335 = null;
            field2334 = null;
            field2333 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2332.update(arg0);
        field2331++;
    }

    @OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2327++;
        this.field2332.paint(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)Ljw;")
    public static final class555 method1110(byte arg0) {
        field2329++;
        if (arg0 <= 10) {
            method1109(94);
        }
        try {
            return new class647();
        } catch (Throwable var2) {
            try {
                return (class555) Class.forName("hl").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class144();
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lli;I)V")
    public static final void method1111(class433 arg0, int arg1) {
        field2328++;
        if (arg0 == null || arg1 < 46) {
            return;
        }
        class446.field6126.method11(arg0, -120);
        class181.field2730++;
        Object var2 = null;
        class236 var5;
        if (arg0.field5955 || "".equals(arg0.field5965)) {
            var5 = new class236(arg0.field5965);
            class172.field2634++;
        } else {
            long var3 = arg0.field5958;
            for (var5 = (class236) class76.field925.method2135(var3, (byte) 31); var5 != null && !var5.field3320.equals(arg0.field5965); var5 = (class236) class76.field925.method2141((byte) 88)) {
            }
            if (var5 == null) {
                var5 = (class236) class525.field6962.method552(4, var3);
                if (var5 != null && !var5.field3320.equals(arg0.field5965)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class236(arg0.field5965);
                }
                class76.field925.method2143(-1, var5, var3);
                class172.field2634++;
            }
        }
        if (var5.method1484(arg0, (byte) 86)) {
            class130.method1022(true, var5);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1112(int arg0, byte arg1, int arg2) {
        field2330++;
        if (arg1 <= 31) {
            field2334 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class148(Component arg0) {
        this.field2332 = arg0;
    }
}
