import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class54 extends class69 {

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lqk;")
    public static class1 field648 = new class1(55, -1);

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class236.method1613(arg6, arg0, arg7, arg8, arg3, (byte) -100, arg2, 0, arg4, arg5);
        field646++;
        if (arg1 != 30686) {
            method463(-59);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lag;I)V")
    public abstract void method419(class459 arg0, int arg1);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static final void method460(int arg0) {
        class731.field10109.method2300((byte) 108);
        field645++;
        for (int var1 = 0; var1 < 32; var1++) {
            class289.field4266[var1] = 0L;
        }
        if (arg0 != -1) {
            method461(null, -75);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class44.field464[var2] = 0L;
        }
        class556.field7792 = 0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lae;I)V")
    public static final void method461(class283 arg0, int arg1) {
        class680.field9500 = arg0.method1839(-1, "hitmarks");
        field647++;
        class302.field4406 = arg0.method1839(arg1 + 2850, "hitbar_default");
        class17.field108 = arg0.method1839(-1, "timerbar_default");
        class9.field53 = arg0.method1839(arg1 + 2850, "headicons_pk");
        class769.field10589 = arg0.method1839(-1, "headicons_prayer");
        class145.field1876 = arg0.method1839(arg1 ^ 0xB22, "hint_headicons");
        class681.field9548 = arg0.method1839(-1, "hint_mapmarkers");
        class764.field10473 = arg0.method1839(-1, "mapflag");
        if (arg1 != -2851) {
            method460(-37);
        }
        class591.field8334 = arg0.method1839(-1, "cross");
        class351.field5100 = arg0.method1839(-1, "mapdots");
        class559.field7874 = arg0.method1839(-1, "scrollbar");
        class392.field5588 = arg0.method1839(-1, "name_icons");
        class436.field6054 = arg0.method1839(-1, "floorshadows");
        class685.field9572 = arg0.method1839(-1, "compass");
        class758.field10424 = arg0.method1839(-1, "otherlevel");
        class479.field6648 = arg0.method1839(arg1 + 2850, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lgga;B)V")
    public abstract void method422(class511 arg0, byte arg1);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static final void method462(byte arg0) {
        if (arg0 != 14) {
            method460(119);
        }
        if (class471.field6527 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class74.field826.length; var2++) {
                if (class74.field826[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class471.field6527;
                    var1++;
                    if (var10000 == ~var1) {
                        class108.field1279 = class74.field826[var2].substring(class74.field826[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class108.field1279 = "";
        }
        field649++;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static void method463(int arg0) {
        field648 = null;
        if (arg0 > -80) {
            field648 = null;
        }
    }
}
