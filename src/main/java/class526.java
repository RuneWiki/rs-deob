import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class526 extends Canvas {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field7513;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[Z")
    public static boolean[] field7516 = new boolean[8];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lpr;")
    public static class407 field7519 = new class407(21, 7);

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lpr;")
    public static class407 field7521 = new class407(79, 0);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "F")
    public static float field7522 = 0.0F;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lgl;")
    public static class547 field7523 = new class547(2, 4);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
    public static boolean field7524 = true;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field7525 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JLoa;I)V", line = 3)
    public static final void method2992(long arg0, class635 arg1, int arg2) {
        if (arg2 != 64) {
            field7521 = null;
        }
        field7515++;
        class190.field2300 = class43.field452;
        class396.field5283 = 0;
        class43.field452 = 0;
        long var4 = class641.method3604(false);
        for (class202 var6 = (class202) class515.field7362.method93((byte) 96); var6 != null; var6 = (class202) class515.field7362.method92(arg2 ^ 0x40)) {
            if (var6.method1240(arg1, arg0)) {
                class396.field5283++;
            }
        }
        if (class151.field1724 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class515.field7362.method90(true) + ", running: " + class396.field5283 + ". Particles: " + class43.field452 + ". Time taken: " + (class641.method3604(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!nf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 36)
    public final void update(Graphics arg0) {
        field7520++;
        this.field7513.update(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lok;", line = 44)
    public static final class231 method2993(int arg0, int arg1) {
        field7514++;
        class21[] var2 = class169.field2023;
        synchronized (class169.field2023) {
            class231 var3;
            if (class169.field2023.length <= arg0 || class169.field2023[arg0].method91(0)) {
                var3 = new class231();
                var3.field2947 = new class130[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field2947[var4] = new class130();
                }
            } else {
                var3 = (class231) class169.field2023[arg0].method83(-118);
                var3.method1374((byte) -125);
                int var10002 = class144.field1620[arg0]--;
            }
            if (arg1 != 32671) {
                field7524 = true;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V", line = 77)
    public static final void method2994(int arg0, boolean arg1) {
        field7518++;
        if (arg1 && class637.field9015 != null) {
            class214.field2601 = class637.field9015.field9544;
        } else {
            class214.field2601 = -1;
        }
        class504.field7252 = null;
        class376.field4887 = 0;
        class9.field92 = null;
        class637.field9015 = null;
        class637.method3576();
        class637.field9021.method3170((byte) -97);
        class61.field630 = null;
        class472.field6590 = -1;
        class580.field8249 = -1;
        class107.field1241 = null;
        class343.field4444 = null;
        class462.field6421 = null;
        class172.field2055 = null;
        class213.field2570 = null;
        class14.field128 = null;
        class653.field9330 = null;
        if (arg0 != 32130) {
            return;
        }
        class627.field8901 = null;
        class637.field9025 = null;
        if (class637.field9013 != null) {
            class637.field9013.method1969(-20);
            class637.field9013.method1974(64, true, 128);
        }
        if (class637.field9016 != null) {
            class637.field9016.method2779(64, 64, 57);
        }
        if (class637.field9012 != null) {
            class637.field9012.method3732(3, 64);
        }
        class470.field6566.method1693(64, -63);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Liaa;I)Lwo;", line = 125)
    public static final class677 method2995(class452 arg0, int arg1) {
        field7512++;
        class120 var2 = class294.method1674(arg0, -64);
        if (arg1 != -17330) {
            method2993(-2, 61);
        }
        int var3 = arg0.method2528((byte) -126);
        return new class677(var2.field1364, var2.field1366, var2.field1367, var2.field1369, var2.field1362, var3);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 140)
    public static void method2996(byte arg0) {
        field7523 = null;
        int var1 = -80 % ((-arg0 - 34) / 44);
        field7519 = null;
        field7516 = null;
        field7521 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 158)
    public class526(Component arg0) {
        this.field7513 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 167)
    public final void paint(Graphics arg0) {
        field7517++;
        this.field7513.paint(arg0);
    }
}
