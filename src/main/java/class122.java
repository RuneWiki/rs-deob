import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class122 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lgk;")
    public static class331 field1786 = new class331("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lbg;")
    public static class324 field1789 = new class324(59, -2);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lhe;")
    public static class250 field1790;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lla;")
    public static class314 field1792;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZILuu;II)V", line = 25)
    public static final void method971(boolean arg0, int arg1, class188 arg2, int arg3, int arg4) {
        field1787++;
        int var5 = arg2.field2711;
        if (arg2.field2668 == 0) {
            arg2.field2711 = arg2.field2688;
        } else if (arg2.field2668 == 1) {
            arg2.field2711 = arg1 - arg2.field2688;
        } else if (arg2.field2668 == 2) {
            arg2.field2711 = arg2.field2688 * arg1 >> 14;
        }
        int var6 = arg2.field2672;
        int var7 = 4 % ((-arg3 - 13) / 45);
        if (arg2.field2630 == 0) {
            arg2.field2672 = arg2.field2666;
        } else if (arg2.field2630 == 1) {
            arg2.field2672 = arg4 - arg2.field2666;
        } else if (arg2.field2630 == 2) {
            arg2.field2672 = arg2.field2666 * arg4 >> 14;
        }
        if (arg2.field2668 == 4) {
            arg2.field2711 = arg2.field2672 * arg2.field2607 / arg2.field2760;
        }
        if (arg2.field2630 == 4) {
            arg2.field2672 = arg2.field2760 * arg2.field2711 / arg2.field2607;
        }
        if (class407.field6069 && (client.method1380(arg2).field4072 != 0 || arg2.field2727 == 0)) {
            if (arg2.field2672 < 5 && arg2.field2711 < 5) {
                arg2.field2672 = 5;
                arg2.field2711 = 5;
            } else {
                if (arg2.field2672 <= 0) {
                    arg2.field2672 = 5;
                }
                if (arg2.field2711 <= 0) {
                    arg2.field2711 = 5;
                }
            }
        }
        if (class516.field7609 == arg2.field2732) {
            class56.field658 = arg2;
        }
        if (arg0 && arg2.field2613 != null && arg2.field2711 != var5 || arg2.field2672 != var6) {
            class125 var8 = new class125();
            var8.field1830 = arg2;
            var8.field1833 = arg2.field2613;
            class440.field6536.method1015(false, var8);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 99)
    public static void method972(boolean arg0) {
        field1790 = null;
        if (arg0) {
            field1791 = 60;
        }
        field1789 = null;
        field1786 = null;
        field1792 = null;
    }

    @OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
    public abstract void method241(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
    public abstract void method252(int arg0);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
    public abstract void method250();

    @OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
    public abstract void method244(int[] arg0);

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
    public abstract void method253(int arg0);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
    public abstract void method249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class122 method245();

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
    public abstract void method247(int arg0);

    @OriginalMember(owner = "client!c", name = "za", descriptor = "(Lc;)V")
    public abstract void method256(class122 arg0);

    @OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
    public abstract void method254(int arg0);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
    public abstract void method243(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method255(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
    public abstract void method251(int arg0, int arg1, int arg2);
}
