import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public abstract class class39 {

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Lua;")
    public static class41 field482 = class16.method86("Water Source", true);

    @OriginalMember(owner = "mapview!ta", name = "m", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Lua;")
    public static class41 field479 = class16.method86("Legende", true);

    @OriginalMember(owner = "mapview!ta", name = "n", descriptor = "Lab;")
    public static class3 field489 = null;

    @OriginalMember(owner = "mapview!ta", name = "k", descriptor = "Lua;")
    public static class41 field486 = class16.method86("Vegetable Store", true);

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "mapview!ta", name = "j", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "mapview!ta", name = "l", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "mapview!ta", name = "o", descriptor = "Lq;")
    public static class32 field490;

    @OriginalMember(owner = "mapview!ta", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field483;

    @OriginalMember(owner = "mapview!ta", name = "i", descriptor = "Ljava/lang/String;")
    public static String field484;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "[[B")
    public static byte[][] field478;

    @OriginalMember(owner = "mapview!ta", name = "p", descriptor = "[[Lq;")
    public static class32[][] field491;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)V", line = 15)
    public static final void method215(int arg0) {
        class9 var1 = class19.field156;
        synchronized (class19.field156) {
            class36.field446 = class19.field163;
            class37.field456 = class23.field239;
            class4.field66 = class8.field90;
            class32.field416 = class34.field431;
            field488 = class41.field500;
            class17.field154 = class23.field235;
            class34.field431 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V", line = 57)
    public static void method216(byte arg0) {
        field482 = null;
        field491 = null;
        if (arg0 != -34) {
            return;
        }
        field484 = null;
        field486 = null;
        field483 = null;
        field490 = null;
        field478 = null;
        field479 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)V", line = 123)
    public static final void method217(int arg0) {
        if (arg0 > -22) {
            return;
        }
        if (++class4.field69 >= 64) {
            class8.field91++;
            class4.field69 = 0;
            if (class8.field91 < class19.sizeZ >> 6) {
                class35.method201(53);
            }
        }
        class42.field514 = (class4.field69 << 6) + class14.field126;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(III)V")
    public abstract void method44(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II)V")
    public abstract void method42(int arg0, int arg1);
}
