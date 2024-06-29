import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class444 {

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field6431 = 443;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "Z")
    private boolean field6437 = true;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "Z")
    private boolean field6440 = false;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public int field6441 = 43594;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public int field6435;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Ljava/lang/String;")
    public String field6430;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)I")
    public static final int method2753(byte arg0) {
        if (arg0 > 0) {
            return 90;
        } else {
            field6436++;
            return 16;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqv;I)Z")
    public final boolean method2754(class444 arg0, int arg1) {
        if (arg1 != 4761) {
            this.method2754(null, -35);
        }
        field6429++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field6435 == arg0.field6435 && this.field6430.equals(arg0.field6430);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZII)V")
    public static final void method2755(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            class249 var3 = class289.method1715(class242.field2878, arg1 - 10449, class41.field470);
            var3.field3016.method1446(arg2, true);
            class510.method3017(var3, 111);
        } else {
            class133.method853(class84.field882, arg2, -1);
        }
        if (arg1 == 10501) {
            field6438++;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static final void method2756(int arg0) {
        if (arg0 != 10441) {
            field6433 = 99;
        }
        field6428++;
        if (class125.field1314 > 1) {
            class654.field9334.method3924(true, class654.field9334.field9876, 4);
        } else {
            class654.field9334.method3924(true, class654.field9334.field9876, 2);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILgh;)Lsb;")
    public final class290 method2757(int arg0, class546 arg1) {
        field6432++;
        if (arg0 != -12113) {
            field6433 = -53;
        }
        return arg1.method3207(this.field6437 ? this.field6431 : this.field6441, false, this.field6430, this.field6440);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Loh;Z)V")
    public static final void method2758(class404 arg0, boolean arg1) {
        field6434++;
        class418.field6080 = arg0.method2474(120, "hitmarks");
        class222.field2552 = arg0.method2474(-115, "hitbar_default");
        class270.field3335 = arg0.method2474(-103, "timerbar_default");
        class683.field9666 = arg0.method2474(-117, "headicons_pk");
        class745.field10408 = arg0.method2474(-109, "headicons_prayer");
        if (!arg1) {
            method2755(true, 61, 126);
        }
        class449.field6487 = arg0.method2474(-107, "hint_headicons");
        class148.field1645 = arg0.method2474(-114, "hint_mapmarkers");
        class354.field4543 = arg0.method2474(33, "mapflag");
        class711.field10017 = arg0.method2474(126, "cross");
        class603.field8586 = arg0.method2474(-112, "mapdots");
        class645.field9218 = arg0.method2474(65, "scrollbar");
        class322.field4115 = arg0.method2474(96, "name_icons");
        class713.field10033 = arg0.method2474(78, "floorshadows");
        class119.field1234 = arg0.method2474(-108, "compass");
        class753.field10526 = arg0.method2474(-107, "otherlevel");
        class280.field3433 = arg0.method2474(57, "hint_mapedge");
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
    public final void method2759(byte arg0) {
        if (arg0 != -53) {
            method2755(false, 110, -81);
        }
        field6439++;
        if (!this.field6437) {
            this.field6437 = true;
            this.field6440 = true;
        } else if (this.field6440) {
            this.field6440 = false;
        } else {
            this.field6437 = false;
        }
    }
}
