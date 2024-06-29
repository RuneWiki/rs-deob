import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class278 extends class359 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field3920 = -1;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
    public boolean field3928 = false;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
    public static boolean field3917 = false;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field3927 = 0;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field3916;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lki;")
    public static class422 field3915;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3922;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "[Z")
    public static boolean[] field3925;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 6)
    public static void method1756(int arg0) {
        field3925 = null;
        field3915 = null;
        field3922 = null;
        if (arg0 >= -93) {
            method1758(98, (class57) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V", line = 25)
    public static final void method1757(long arg0, int arg1) {
        field3919++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == (long) arg1) {
            class228.method1466(arg0 - 1L, arg1 ^ 0x5A);
            class228.method1466(1L, arg1 + 115);
        } else {
            class228.method1466(arg0, 83);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILra;)V", line = 43)
    public static final void method1758(int arg0, class57 arg1) {
        class417.field5990 = arg1.method332("p11_full", -1);
        int var2 = 80 % ((arg0 + 27) / 63);
        field3924++;
        class242.field3277 = arg1.method332("p12_full", -1);
        class166.field2331 = arg1.method332("b12_full", -1);
        class215.field2925 = arg1.method332("hitmarks", -1);
        class136.field1914 = arg1.method332("hitbar_default", -1);
        class261.field3603 = arg1.method332("timerbar_default", -1);
        class401.field5832 = arg1.method332("headicons_pk", -1);
        class27.field258 = arg1.method332("headicons_prayer", -1);
        class421.field6052 = arg1.method332("hint_headicons", -1);
        class287.field4051 = arg1.method332("hint_mapmarkers", -1);
        class34.field332 = arg1.method332("mapflag", -1);
        class109.field1261 = arg1.method332("cross", -1);
        class266.field3730 = arg1.method332("mapdots", -1);
        class350.field5113 = arg1.method332("scrollbar", -1);
        class407.field5909 = arg1.method332("name_icons", -1);
        class94.field1042 = arg1.method332("floorshadows", -1);
        class158.field2238 = arg1.method332("compass", -1);
        class190.field2588 = arg1.method332("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method1759(int arg0, int arg1, int arg2) {
        if (arg1 != 26002) {
            field3927 = 125;
        }
        field3914++;
        return (class166.field2327[1][arg2][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V", line = 110)
    public class278(int arg0) {
        this.field3920 = arg0;
    }
}
