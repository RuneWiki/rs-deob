import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class20 {

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Lj;")
    public static class17 field288 = class30.method190(-122, "Silk Trader");

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lj;")
    public static class17 field289 = class30.method190(-109, "Enter place name to find");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lj;")
    public static class17 field290 = class30.method190(-98, "labels)3dat");

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lj;")
    public static class17 field291 = class30.method190(-104, "Vegetable Store");

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lj;")
    public static class17 field286 = class30.method190(-116, "details)3dat");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "[Lj;")
    public static class17[] field292;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "[[Loa;")
    public static class28[][] field293;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 17)
    public static void method147(byte arg0) {
        field290 = null;
        field292 = null;
        field286 = null;
        field289 = null;
        if (arg0 <= 116) {
            method148(-100, null);
        }
        field288 = null;
        field293 = null;
        field291 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 59)
    public static final int method148(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        int var3 = 120 % ((-arg0 - 64) / 36);
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)J", line = 90)
    public static final synchronized long method149(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (class32.field399 > var1) {
            class18.field272 += class32.field399 - var1;
        }
        int var3 = -90 % ((arg0 + 56) / 39);
        class32.field399 = var1;
        return var1 + class18.field272;
    }
}
