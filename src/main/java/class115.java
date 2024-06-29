import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class115 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lvc;")
    public static class137 field2731 = class45.method325("(U(Y", -46);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lqa;")
    public static class105 field2730 = new class105(64);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lvc;")
    public static class137 field2737 = class45.method325("", -46);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lvc;")
    public static class137 field2733 = field2737;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lvc;")
    public static class137 field2735 = field2737;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lvc;")
    public static class137 field2740 = field2737;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lvc;")
    public static class137 field2739 = field2737;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lvc;")
    public static class137 field2732 = field2737;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lvc;")
    public static class137 field2734 = field2737;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lqa;")
    public static class105 field2741 = new class105(64);

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lqa;")
    public static class105 field2742 = new class105(30);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lia;")
    public static class57 field2745;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
    public abstract void method154(boolean arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI[B)V")
    public abstract void method159(int arg0, boolean arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Color;Lvc;I)V")
    public static final void method891(int arg0, Color arg1, class137 arg2, int arg3) {
        field2729++;
        try {
            Graphics var4 = class124.field2871.getGraphics();
            if (class105.field2456 == null) {
                class105.field2456 = new Font("Helvetica", 1, 13);
                class126.field2949 = class124.field2871.getFontMetrics(class105.field2456);
            }
            if (class86.field2058) {
                class86.field2058 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class23.field528, class32.field688);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class83.field1858 == null) {
                    class83.field1858 = class124.field2871.createImage(304, 34);
                }
                Graphics var5 = class83.field1858.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class105.field2456);
                int var6 = 21 % ((54 - arg3) / 32);
                var5.setColor(Color.white);
                arg2.method1029(22, var5, (304 - arg2.method1022(0, class126.field2949)) / 2, (byte) -3);
                var4.drawImage(class83.field1858, class23.field528 / 2 - 152, class32.field688 / 2 - 18, null);
            } catch (Exception var9) {
                int var7 = class32.field688 / 2 - 18;
                int var8 = class23.field528 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 - -1, 301, 31);
                var4.fillRect(var8 + arg0 * 3 + 2, var7 - -2, 300 - arg0 * 3, 30);
                var4.setFont(class105.field2456);
                var4.setColor(Color.white);
                arg2.method1029(var7 + 22, var4, (304 - arg2.method1022(0, class126.field2949)) / 2 + var8, (byte) -3);
            }
        } catch (Exception var10) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method892(int arg0) {
        class70 var1 = class78.field1725;
        synchronized (class78.field1725) {
            class2.field46 = class24.field585;
            if (class104.field2423 >= 0) {
                while (class46.field1041 != class104.field2423) {
                    int var2 = class29.field638[class46.field1041];
                    class46.field1041 = class46.field1041 + 1 & 0x7F;
                    if (var2 < 0) {
                        class63.field1342[~var2] = false;
                    } else {
                        class63.field1342[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class63.field1342[var3] = false;
                }
                class104.field2423 = class46.field1041;
            }
            class24.field585 = class21.field437;
        }
        field2738++;
        if (arg0 != 127) {
            method893(-14, null, null, false, null);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public abstract void method160(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILnb;Lwe;ZLnb;)V")
    public static final void method893(int arg0, class88 arg1, class145 arg2, boolean arg3, class88 arg4) {
        class102.field2368 = arg1;
        class108.field2514 = arg3;
        field2727++;
        class92.field2183 = arg4;
        class82.field1852 = class92.field2183.method651(arg0, true);
        class119.field2773 = arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public abstract void method158(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public abstract void method156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method894(boolean arg0) {
        field2740 = null;
        field2737 = null;
        field2745 = null;
        field2741 = null;
        if (!arg0) {
            field2726 = -52;
        }
        field2731 = null;
        field2730 = null;
        field2732 = null;
        field2733 = null;
        field2742 = null;
        field2734 = null;
        field2739 = null;
        field2735 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public abstract void method157(byte arg0);
}
