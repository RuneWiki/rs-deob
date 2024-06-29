import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class62 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lv;")
    public static class122 field1585 = class55.method425(-127, "mapedge");

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lv;")
    public static class122 field1586 = class55.method425(-124, "logo");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
    public static boolean field1588 = false;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lmb;")
    public static class74 field1590;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lne;")
    public static class83 field1594;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field1580;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[I")
    public int[] field1591;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lvb;")
    public static class124[] field1583;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 3)
    public final void method473(byte arg0) {
        class117.method898(this.field1591, this.field1579, this.field1593);
        field1589++;
        if (arg0 != -4) {
            this.method123(null, 44, (byte) -39, 39);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)V", line = 20)
    public static final void method474(int arg0, int arg1, byte arg2) {
        field1582++;
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class8.field194[var4] != null) {
                int var5 = class33.field832 + 70 + 4 - var3 * 14;
                int var6 = class67.field1734[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class122 var7 = class8.field195[var4];
                if (var7 != null && var7.method948(class41.field1029, (byte) 104)) {
                    var7 = var7.method960(5, 127);
                }
                if (var7 != null && var7.method948(class26.field702, (byte) 114)) {
                    var7 = var7.method960(5, 125);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class84.field2176 == 0 || class84.field2176 == 1 && class75.method637(0, var7))) {
                    var3++;
                    if (arg1 > var5 - 14 && var5 >= arg1 && !var7.method933(class70.field1828.field1448, 0)) {
                        class69.field1815++;
                        class44.field1148++;
                        if (class58.field1507 >= 1) {
                            class90.field2321++;
                            class108.method839(class64.field1629, 0, 23, 0, class59.method454(new class122[] { class89.field2270, var7 }, arg2 + 5285), 0, arg2 ^ 0xFFFFFFB3);
                        }
                        class108.method839(class34.field846, 0, 21, 0, class59.method454(new class122[] { class89.field2270, var7 }, 5176), 0, 69);
                        class108.method839(class32.field779, 0, 8, 0, class59.method454(new class122[] { class89.field2270, var7 }, 5176), 0, arg2 + 212);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class33.field829 == 0 && (var6 == 7 || class19.field496 == 0 || class19.field496 == 1 && class75.method637(0, var7))) {
                    if (var5 - 14 < arg1 && var5 >= arg1) {
                        if (class58.field1507 >= 1) {
                            class90.field2321++;
                            class108.method839(class64.field1629, 0, 23, 0, class59.method454(new class122[] { class89.field2270, var7 }, arg2 ^ 0xFFFFEBAB), 0, 97);
                        }
                        class44.field1148++;
                        class108.method839(class34.field846, 0, 21, 0, class59.method454(new class122[] { class89.field2270, var7 }, 5176), 0, -127);
                        class69.field1815++;
                        class108.method839(class32.field779, 0, 8, 0, class59.method454(new class122[] { class89.field2270, var7 }, arg2 + 5285), 0, 35);
                    }
                    var3++;
                }
                if (var6 == 4 && (class36.field905 == 0 || class36.field905 == 1 && class75.method637(arg2 + 109, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && arg1 <= var5) {
                        class108.method839(class46.field1189, 0, 42, 0, class59.method454(new class122[] { class89.field2270, var7 }, arg2 + 5285), 0, arg2 + 141);
                        class25.field676++;
                    }
                }
                if ((var6 == 5 || var6 == 6) && class33.field829 == 0 && class19.field496 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class36.field905 == 0 || class36.field905 == 1 && class75.method637(0, var7))) {
                    if (arg1 > var5 - 14 && arg1 <= var5) {
                        class108.method839(class115.field2806, 0, 52, 0, class59.method454(new class122[] { class89.field2270, var7 }, 5176), 0, -128);
                        class94.field2402++;
                    }
                    var3++;
                }
            }
        }
        if (arg2 != -109) {
            method476(29);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 182)
    public static final void method475(int arg0) {
        field1581++;
        class58.field1515.method473((byte) -4);
        class126.field3058.method63(0, 0);
        class118.field2840 = class77.method647(class118.field2840);
        int var1 = -55 % ((arg0 + 61) / 32);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 224)
    public static void method476(int arg0) {
        if (arg0 != 0) {
            field1594 = null;
        }
        field1594 = null;
        field1583 = null;
        field1586 = null;
        field1590 = null;
        field1585 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 237)
    protected class62() {
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method123(Component arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method122(int arg0, Graphics arg1, int arg2, int arg3);
}
