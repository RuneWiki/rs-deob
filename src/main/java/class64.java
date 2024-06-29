import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class64 extends class381 {

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Lrk;")
    public static class427 field977;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field971;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lrk;Lrk;B)V")
    public static final void method563(class427 arg0, class427 arg1, byte arg2) {
        class446.field6426 = arg1;
        field969++;
        class96.field1394 = arg0;
        if (arg2 < 105) {
            field971 = null;
        }
        class55.field887 = class446.field6426.method2626(3, 125);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
    public static void method564(byte arg0) {
        field971 = null;
        int var1 = -82 / ((arg0 - 11) / 63);
        field977 = null;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static final void method565(int arg0) {
        field975++;
        for (int var1 = 0; var1 < class166.field2464; var1++) {
            int var2 = class344.field4664[var1];
            class338 var3 = class220.field3044[var2];
            int var4 = class417.field5851.method1861((byte) -72);
            if ((var4 & 0x1) != 0) {
                var4 += class417.field5851.method1861((byte) -72) << 8;
            }
            class413.method2559(var3, arg0 ^ 0xFFFFB9D7, var4, var2);
        }
        if (arg0 != -28202) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public static final int method566(int arg0, int arg1) {
        if (arg0 != 13787) {
            field977 = null;
        }
        field972++;
        return (arg1 & 0x3FDCE) >> 11;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
    public static final void method567(int arg0, int arg1) {
        field974++;
        class410 var2 = class385.field5421;
        synchronized (class385.field5421) {
            class385.field5421.method2534(arg0, arg1);
        }
        class410 var3 = class244.field3366;
        synchronized (class244.field3366) {
            class244.field3366.method2534(arg0, arg1);
        }
        class344 var4 = class234.field3227;
        synchronized (class234.field3227) {
            class234.field3227.method2178(arg1, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lrk;I)V")
    public static final void method568(class427 arg0, int arg1) {
        class14.field107 = arg0.method2643("p11_full", -1);
        field970++;
        class398.field5563 = arg0.method2643("p12_full", -1);
        class128.field1805 = arg0.method2643("b12_full", -1);
        class174.field2565 = arg0.method2643("hitmarks", -1);
        class451.field6518 = arg0.method2643("hitbar_default", -1);
        class90.field1332 = arg0.method2643("timerbar_default", -1);
        class372.field5177 = arg0.method2643("headicons_pk", -1);
        int var2 = 19 / ((arg1 - 17) / 47);
        class31.field521 = arg0.method2643("headicons_prayer", -1);
        class435.field6200 = arg0.method2643("hint_headicons", -1);
        class323.field4375 = arg0.method2643("hint_mapmarkers", -1);
        class13.field104 = arg0.method2643("mapflag", -1);
        class156.field2365 = arg0.method2643("cross", -1);
        class115.field1614 = arg0.method2643("mapdots", -1);
        class169.field2494 = arg0.method2643("scrollbar", -1);
        class161.field2397 = arg0.method2643("name_icons", -1);
        class21.field393 = arg0.method2643("floorshadows", -1);
        class448.field6494 = arg0.method2643("compass", -1);
        class352.field4816 = arg0.method2643("hint_mapedge", -1);
    }
}
