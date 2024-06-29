import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class242 extends class307 {

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public int field3995;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Lqd;")
    public static class40 field3988 = class147.method1106("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -126);

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "Lqd;")
    public static class40 field4002 = class147.method1106(")2", (byte) -104);

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Lqd;")
    private static class40 field3994 = class147.method1106("Loaded title screen", (byte) -122);

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Lqd;")
    public static class40 field3993 = field3994;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILrb;IB)V", line = 7)
    public static final void method1703(int arg0, int arg1, class213 arg2, int arg3, byte arg4) {
        if (arg4 < 54) {
            field3994 = (class40) null;
        }
        field3999++;
        if (class21.field350) {
            class111.method847(arg3, arg0, arg2.field3502 + arg3, arg2.field3565 + arg0);
        }
        if (class44.field827 >= 3) {
            if (class21.field350) {
                class185 var5 = arg2.method1505(false, 21730);
                if (var5 != null) {
                    var5.method744(arg3, arg0);
                }
            } else {
                class115.method860(arg3, arg0, 0, arg2.field3572, arg2.field3425);
            }
        } else if (class21.field350) {
            ((class100) class185.field2970).method755(arg3, arg0, arg2.field3502, arg2.field3565, class185.field2970.field2976 / 2, class185.field2970.field2981 / 2, class108.field1893, 256, (class100) arg2.method1505(false, 21730));
        } else {
            ((class99) class185.field2970).method740(arg3, arg0, arg2.field3502, arg2.field3565, class185.field2970.field2976 / 2, class185.field2970.field2981 / 2, class108.field1893, 256, arg2.field3572, arg2.field3425);
        }
        class309.field5192[arg1] = true;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBI)Z", line = 50)
    public final boolean method1704(int arg0, byte arg1, int arg2) {
        if (arg1 < 15) {
            field3994 = (class40) null;
        }
        field3992++;
        return this.field4001 <= arg2 && this.field3995 >= arg2 && this.field3991 <= arg0 && arg0 <= this.field4000;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 75)
    public static final void method1705(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        if (class90.field1636 != 0 && arg0 != -1) {
            class150.method1127(false, 0, class274.field4562, (byte) 120, class90.field1636, arg0);
            class101.field1775 = true;
        }
        field3997++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V", line = 94)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3990++;
        class291.field4873 = arg1;
        class160.field2677 = -1;
        class92.field1675 = class268.field4462 * arg3 / arg4;
        class110.field1931 = class233.field3840 * arg0 / arg2;
        class309.method2113(arg1 - 31653);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 116)
    public static void method1707(int arg0) {
        field3994 = null;
        field3988 = null;
        field3993 = null;
        int var1 = 97 % ((-arg0 - 11) / 39);
        field4002 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lce;BLdh;Lce;)V", line = 132)
    public static final void method1708(class239 arg0, byte arg1, class161 arg2, class239 arg3) {
        class162.field2696 = arg3;
        class90.field1633 = arg2;
        field3996++;
        class29.field624 = arg0;
        if (class29.field624 != null) {
            class240.field3982 = class29.field624.method1664(1, (byte) 30);
        }
        if (class162.field2696 != null) {
            class306.field5126 = class162.field2696.method1664(1, (byte) 30);
        }
        if (arg1 <= 71) {
            method1707(-39);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIII)V", line = 153)
    public class242(int arg0, int arg1, int arg2, int arg3) {
        this.field3991 = arg1;
        this.field3995 = arg2;
        this.field4000 = arg3;
        this.field4001 = arg0;
    }
}
