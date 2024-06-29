import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class296 extends class179 {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lqi;")
    public static class382 field4492 = new class382("LOCAL", 4);

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "[Lfn;")
    public static class87[] field4494 = new class87[14];

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "Z")
    public static boolean field4495 = false;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4497 = new String[200];

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "Llt;")
    public static class458 field4496;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "[I")
    public int[] field4493;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(JBLqq;)V", line = 3)
    public static final void method1796(long arg0, byte arg1, class318 arg2) {
        class439.field6449 = class263.field3982;
        class292.field4452 = 0;
        field4499++;
        class263.field3982 = 0;
        long var4 = class344.method2111((byte) -93);
        if (arg1 != -13) {
            return;
        }
        for (class477 var6 = (class477) class139.field2285.method1319(arg1 + 131); var6 != null; var6 = (class477) class139.field2285.method1320((byte) -70)) {
            if (var6.method2876(arg2, arg0)) {
                class292.field4452++;
            }
        }
        if (class159.field2505 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class139.field2285.method1316((byte) 91) + ", running: " + class292.field4452 + ". Particles: " + class263.field3982 + ". Time taken: " + (class344.method2111((byte) -41) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V", line = 39)
    public static void method1797(int arg0) {
        field4496 = null;
        field4492 = null;
        field4494 = null;
        field4497 = null;
        int var1 = -78 / ((arg0 + 54) / 51);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method1519(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method1518(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public abstract void method1522(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5);
}
