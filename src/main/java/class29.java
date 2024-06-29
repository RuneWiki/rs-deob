import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Z")
    public static boolean field400 = false;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lwa;")
    public static class75 field409 = class66.method560(" zuerst von Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lwa;")
    public static class75 field412 = class66.method560("huffman", false);

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lwa;")
    public static class75 field408 = class66.method560("Stufe)2", false);

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static volatile int field416 = -1;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Lwa;")
    public class75 field414;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Z")
    public boolean field407;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 6)
    public static void method195(byte arg0) {
        field408 = null;
        if (arg0 <= -39) {
            field409 = null;
            field412 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 24)
    public static final void method196(int arg0) {
        int var1 = -67 % ((arg0 - 49) / 38);
        class239.method1741();
        class239.method1742();
        field417++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/util/Random;ZI)I", line = 34)
    public static final int method197(Random arg0, boolean arg1, int arg2) {
        field406++;
        if (!arg1) {
            method199(false, 38L);
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class242.method1767(arg2, !arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class73.method603(-123, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 67)
    public static final void method198(int arg0, int arg1) {
        field404++;
        Container var2;
        if (class299.field5117 != null) {
            var2 = class299.field5117;
        } else if (class211.field3601 == null) {
            var2 = class210.field3585.field2072;
        } else {
            var2 = class211.field3601;
        }
        class275.field4739 = var2.getSize().width;
        class113.field1924 = var2.getSize().height;
        if (class211.field3601 == var2) {
            Insets var3 = class211.field3601.getInsets();
            class113.field1924 -= var3.top + var3.bottom;
            class275.field4739 -= var3.right + var3.left;
        }
        if (!class279.field4838 && class299.field5117 == null) {
            class111.field1896 = class240.field4061;
            class244.field4111 = 503;
            class98.field1620 = (class275.field4739 - 765) / 2;
            class188.field3141 = 765;
        } else {
            class188.field3141 = class275.field4739;
            class244.field4111 = class113.field1924 - class240.field4061;
            class111.field1896 = class240.field4061;
            class98.field1620 = 0;
        }
        if (arg1 != 765) {
            return;
        }
        class47.method342(class188.field3141, class244.field4111);
        class237.field3991.setSize(class188.field3141, class244.field4111);
        if (class211.field3601 == var2) {
            Insets var4 = class211.field3601.getInsets();
            class237.field3991.setLocation(class98.field1620 + var4.left, var4.top - -class111.field1896);
        } else {
            class237.field3991.setLocation(class98.field1620, class111.field1896);
        }
        if (class81.field1361 != -1) {
            class45.method306(true, (byte) -100);
        }
        class127.method1015(-123);
        if (class124.field2070.startsWith("mac")) {
            class61.field1089 = (long) arg0 + class78.method669(arg1 ^ 0x502);
        }
        class168.field2830 = class78.method669(2047) + ((long) arg0);
        if (arg0 == 0 && class35.field513 != null && (class118.field2003 == 30 || class118.field2003 == 25)) {
            class202.method1499(arg1 - 870);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZJ)Lwa;", line = 144)
    public static final class75 method199(boolean arg0, long arg1) {
        class300.field5128.setTime(new Date(arg1));
        field401++;
        int var3 = class300.field5128.get(7);
        int var4 = class300.field5128.get(5);
        int var5 = class300.field5128.get(2);
        int var6 = class300.field5128.get(1);
        int var7 = class300.field5128.get(11);
        int var8 = class300.field5128.get(12);
        if (arg0) {
            return (class75) null;
        } else {
            int var9 = class300.field5128.get(13);
            return class66.method562((byte) 113, new class75[] { class292.field5007[var3 - 1], class235.field3969, class67.method565(127, var4 / 10), class67.method565(115, var4 % 10), class286.field4928, class32.field476[var5], class286.field4928, class67.method565(115, var6), class249.field4197, class67.method565(88, var7 / 10), class67.method565(120, var7 % 10), class295.field5073, class67.method565(38, var8 / 10), class67.method565(47, var8 % 10), class295.field5073, class67.method565(101, var9 / 10), class67.method565(101, var9 % 10), class214.field3650 });
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILah;I)V", line = 174)
    public static final void method200(int arg0, class194 arg1, int arg2) {
        if (class143.field2463 < arg1.field3249) {
            class157.method1190(arg1, (byte) -14);
        } else if (class143.field2463 > arg1.field3214) {
            class180.method1323(6987, arg1);
        } else {
            class226.method1662(arg1, -24772);
        }
        field411++;
        if (arg1.field3259 < 128 || arg1.field3218 < 128 || arg1.field3259 >= 13184 || arg1.field3218 >= 13184) {
            arg1.field3249 = 0;
            arg1.field3261 = -1;
            arg1.field3214 = 0;
            arg1.field3204 = -1;
            arg1.field3259 = arg1.field3236[0] * 128 + (arg1.method739(arg0) * 64);
            arg1.field3218 = arg1.field3205[0] * 128 + (arg1.method739(0) * 64);
            arg1.method1453(true);
        }
        if (class279.field4831 == arg1 && (arg1.field3259 < 1536 || arg1.field3218 < 1536 || arg1.field3259 >= 11776 || arg1.field3218 >= 11776)) {
            arg1.field3261 = -1;
            arg1.field3214 = 0;
            arg1.field3249 = 0;
            arg1.field3204 = -1;
            arg1.field3259 = arg1.field3236[0] * 128 + arg1.method739(0) * 64;
            arg1.field3218 = arg1.field3205[0] * 128 + (arg1.method739(0) * 64);
            arg1.method1453(true);
        }
        class238.method1725(2048, arg1);
        class63.method547(arg1, 110);
        if (arg0 != 0) {
            method200(118, (class194) null, -18);
        }
    }
}
