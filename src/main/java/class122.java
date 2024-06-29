import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class122 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public static int[] field2772 = new int[100];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lsc;")
    public static class128 field2773 = class129.method1017(false, "welle2:");

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lmc;")
    public static class86 field2784;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lb;")
    public static class8 field2778;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field2781;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    public static int[] field2777;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "[I")
    public int[] field2780;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lma;I)V")
    public static final void method935(class84 arg0, int arg1) {
        field2779++;
        if (class120.field2726 == 1) {
            short var2 = 280;
            if (var2 <= class43.field806 && class43.field806 <= var2 + 14 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(0, -122, 0);
                return;
            }
            if (var2 + 15 <= class43.field806 && class43.field806 <= var2 + 80 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(1, -115, 0);
                return;
            }
            short var3 = 390;
            if (class43.field806 >= var3 && var3 + 14 >= class43.field806 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(0, -103, 1);
                return;
            }
            if (var3 + 15 <= class43.field806 && var3 + 80 >= class43.field806 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(1, -108, 1);
                return;
            }
            short var4 = 500;
            if (class43.field806 >= var4 && var4 + 14 >= class43.field806 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(0, -120, 2);
                return;
            }
            if (var4 + 15 <= class43.field806 && class43.field806 <= var4 + 80 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(1, arg1 ^ 0xFFFF9328, 2);
                return;
            }
            short var5 = 610;
            if (var5 <= class43.field806 && var5 + 14 >= class43.field806 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(0, arg1 - 27932, 3);
                return;
            }
            if (class43.field806 >= var5 + 15 && class43.field806 <= var5 + 80 && class9.field133 >= 4 && class9.field133 <= 18) {
                class37.method269(1, -108, 3);
                return;
            }
            if (class43.field806 >= 708 && class9.field133 >= 4 && class43.field806 <= 758 && class9.field133 <= 20) {
                class75.field1663 = false;
                class151.field3475.method40(0, 0);
                class152.field3514.method40(382, 0);
                class115.field2604.method430(382 - class115.field2604.field1237 / 2, 18);
                return;
            }
            if (class156.field3577 != -1) {
                class5 var6 = class23.field475[class156.field3577];
                if (var6.field66 == class40.field740) {
                    byte[] var7 = class51.method395(new class128[] { var6.field50, class134.field3153 }, false).method977((byte) -124);
                    class121.field2742 = new String(var7, 0, var7.length);
                    if (class151.field3484 != 0) {
                        class151.field3484 = 0;
                        class111.field2506 = 43594;
                        class149.field3442 = 43594;
                        class9.field145 = 443;
                    }
                    class75.field1663 = false;
                    class142.field3335 = var6.field54;
                    class151.field3475.method40(0, 0);
                    class152.field3514.method40(382, 0);
                    class115.field2604.method430(382 - class115.field2604.field1237 / 2, 18);
                    return;
                }
                class128 var8 = class51.method395(new class128[] { class108.field2462, var6.field50, class134.field3153, class18.field319, class43.field791, class111.method857(class110.field2487 ? 1 : 0, (byte) 97), class94.field2212, class111.method857(class132.field3069, (byte) 101), class137.field3244, class111.method857(class21.field395, (byte) -62) }, false);
                try {
                    arg0.getAppletContext().showDocument(var8.method1011((byte) -94), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg1 != 27827) {
            method939(50);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method936(int arg0) {
        int var1 = 122 % ((56 - arg0) / 60);
        field2784 = null;
        field2773 = null;
        field2778 = null;
        field2777 = null;
        field2772 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)V")
    public static final void method937(byte arg0, int arg1, int arg2) {
        if (arg0 != -68) {
            method939(-88);
        }
        field2775++;
        if (class65.method488((byte) 120, arg2)) {
            class128.method971(arg1, 1, class123.field2791[arg2]);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public abstract void method66(byte arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method938(int arg0) {
        class138.method1140(this.field2780, this.field2776, this.field2783);
        if (arg0 != 0) {
            method936(-71);
        }
        field2774++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public abstract void method71(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method939(int arg0) {
        field2771++;
        class108.method839((byte) -127);
        class31.method244(8);
        class73.method549(73);
        class95.method747(108);
        class35.method254(arg0 ^ 0x7089);
        class40.method291(true);
        class137.method1122(0);
        class73.method548((byte) -101);
        class97.method753((byte) 20);
        class156.method1225(0);
        class123.method940((byte) -45);
        class21.method181(arg0 + 36733);
        ((class115) class114.field2560).method890(arg0 - 28863);
        class27.field520.method919((byte) -104);
        if (arg0 != 28803) {
            field2782 = -55;
        }
        class120.field2728.method1033(19028);
        class87.field1985.method1033(19028);
        class147.field3397.method1033(19028);
        class108.field2446.method1033(arg0 ^ 0x3AD7);
        class1.field1.method1033(arg0 - 9775);
        class36.field701.method1033(19028);
        class119.field2706.method1033(19028);
        class135.field3184.method1033(arg0 - 9775);
        class54.field1118.method1033(19028);
        class12.field205.method1033(19028);
        class146.field3377.method1033(19028);
        class95.field2234.method1033(19028);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    protected class122() {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public abstract void method67(int arg0, boolean arg1, Component arg2, int arg3);
}
