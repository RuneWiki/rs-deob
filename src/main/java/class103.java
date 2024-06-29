import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Li;")
    public static class48 field2599 = new class48(4096);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "La;")
    public static class1 field2604 = class113.method934(-11538, "(Y");

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field2610 = -1;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "La;")
    private static class1 field2606 = class113.method934(-11538, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "La;")
    public static class1 field2605 = field2606;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "La;")
    private static class1 field2612 = class113.method934(-11538, "Accept trade");

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "La;")
    public static class1 field2613 = field2612;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "La;")
    private static class1 field2614 = class113.method934(-11538, "glow3:");

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "La;")
    public static class1 field2615 = class113.method934(-11538, "@cr1@");

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "J")
    public static long field2608 = 0L;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "La;")
    public static class1 field2601 = field2614;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lwc;")
    public static class134 field2611;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    public static int[] field2603;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[La;")
    public static class1[] field2609;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)J", line = 12)
    public static final synchronized long method872(int arg0) {
        field2597++;
        if (arg0 != 1) {
            field2611 = null;
        }
        long var1 = System.currentTimeMillis();
        if (class122.field3039 > var1) {
            class122.field3050 += class122.field3039 - var1;
        }
        class122.field3039 = var1;
        return class122.field3050 + var1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 49)
    public static final int method873(int arg0, KeyEvent arg1) {
        field2593++;
        if (arg0 <= 86) {
            method875(-15, null, false, null);
        }
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 66)
    public static void method874(int arg0) {
        field2612 = null;
        field2605 = null;
        field2601 = null;
        field2615 = null;
        field2606 = null;
        field2613 = null;
        field2603 = null;
        field2599 = null;
        field2609 = null;
        field2611 = null;
        field2604 = null;
        int var1 = -41 / ((arg0 - 53) / 57);
        field2614 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILa;ZLa;)V", line = 109)
    public static final void method875(int arg0, class1 arg1, boolean arg2, class1 arg3) {
        if (class97.field2405) {
            class97.field2405 = false;
            class115.method946(205);
            class92.method811((byte) 114);
            class108.method904(40);
            class42.method455(4);
            class105.method883(class115.field2831, -118, class106.field2687, class6.field237, class75.field1867);
            class12.method247(class9.field331, arg0 + 4, class97.field2400, class66.field1651 == -1, -1);
            class79.field1944 = true;
            class22.field688 = true;
            class11.field411 = true;
        }
        short var4 = 151;
        class131.method1031((byte) -83);
        int var6 = var4 - 3;
        class106.field2687.method210(arg1, 257, var6, arg0);
        class106.field2687.method210(arg1, 256, var6 - 1, 16777215);
        if (arg3 != null) {
            var6 += 15;
            if (arg2) {
                int var5 = class106.field2687.method209(arg3) + 4;
                class111.method916(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class106.field2687.method210(arg3, 257, var6, 0);
            class106.field2687.method210(arg3, 256, var6 - 1, 16777215);
        }
        field2598++;
        class2.method45(arg0 + 107);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 152)
    public static final void method876(byte arg0) {
        class11.field380.method268((byte) 50);
        if (arg0 == -93) {
            field2596++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 169)
    public static final void method877(int arg0, int arg1) {
        field2595++;
        if (arg1 == -1 && class75.field1863 == 0) {
            class72.method672(false);
        } else if (arg1 != -1 && class122.field3040 != arg1 && class62.field1557 != 0 && class75.field1863 == 0) {
            class72.method673(class62.field1557, true, 10, arg1, class108.field2705, 0, 0, false);
        }
        class122.field3040 = arg1;
        if (arg0 != 257) {
            field2604 = null;
        }
    }
}
