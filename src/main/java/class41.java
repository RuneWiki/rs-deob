import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class41 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Ljava/lang/String;")
    public static String field733 = "Close";

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Ljava/lang/String;")
    public static String field731 = " has logged in.";

    @OriginalMember(owner = "client!en", name = "d", descriptor = "F")
    public static float field732;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Lob;", line = 4)
    public static final class292 method330(int arg0, int arg1, int arg2) {
        field729++;
        class292 var3 = class215.method1555((byte) -48, arg0);
        if (arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field4553 == null || arg1 >= var3.field4553.length) {
            return null;
        } else {
            return var3.field4553[arg1];
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLnl;)V", line = 27)
    public static final void method331(byte arg0, class30 arg1) {
        if (arg0 != -96) {
            return;
        }
        field735++;
        class254 var2 = (class254) class94.field1553.method833(false, class36.method281(124, arg1.field494));
        if (var2 == null) {
            return;
        }
        if (var2.field3925 != null) {
            class128.field2045.method358(var2.field3925);
            var2.field3925 = null;
        }
        var2.method1701(-85);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 55)
    public static void method332(int arg0) {
        if (arg0 != 906) {
            field733 = (String) null;
        }
        field733 = null;
        field731 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lja;I)V", line = 72)
    public static final void method333(class64 arg0, int arg1) {
        class30.field507 = arg0;
        int var2 = 0 / ((75 - arg1) / 47);
        field730++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Loj;Z)V", line = 92)
    public static final void method334(class325 arg0, boolean arg1) {
        field736++;
        if (!arg1) {
            method333((class64) null, 54);
        }
        class322 var2 = null;
        try {
            class21 var3 = arg0.method2230(8, "runescape");
            while (var3.field387 == 0) {
                class279.method1991(121, 1L);
            }
            if (var3.field387 == 1) {
                var2 = (class322) var3.field391;
                class101 var4 = class243.method1724(!arg1);
                var2.method2202(1, 0, var4.field1667, var4.field1661);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2200(1);
            }
        } catch (Exception var7) {
        }
    }
}
