import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class259 {

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[[S")
    public static short[][] field4451 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[I")
    public static int[] field4453 = new int[1000];

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4450 = -2;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field4447;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
    public static int[] field4448;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
    public static final void method1743(int arg0, byte arg1) {
        class270 var2 = class202.method1368(-15, 5, arg0);
        if (arg1 >= -51) {
            method1745((byte) -89);
        }
        var2.method1795(-2113);
        field4445++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field4448 = null;
        field4447 = null;
        field4453 = null;
        field4451 = null;
        if (arg0 != 7595) {
            field4448 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static final void method1745(byte arg0) {
        if (arg0 != -17) {
            method1744(-45);
        }
        class64.field1276.method934((byte) 62);
        field4446++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZJ)V")
    public static final void method1746(boolean arg0, long arg1) {
        field4444++;
        class223.field3830.field647 = 0;
        if (!arg0) {
            method1746(true, -121L);
        }
        class223.field3830.method293((byte) 125, 249);
        class223.field3830.method292(-104, arg1);
        class207.field3534 = 0;
        class182.field3203 = 1;
        class63.field1259 = 0;
        class45.field974 = -3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lpj;)[Lpj;")
    public static final class237[] method1747(int arg0, class237[] arg1) {
        if (arg0 != 1328872140) {
            field4453 = null;
        }
        field4449++;
        class237[] var2 = new class237[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class238.method1626(new class237[] { class14.method130(var3, (byte) 117), class111.field1945 }, -95);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class238.method1626(new class237[] { var2[var3], arg1[var3] }, class38.method384(arg0, -1328872086));
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method1748(int arg0) {
        if (arg0 != -31074) {
            field4447 = null;
        }
        field4442++;
        class199.field3448.method934((byte) 62);
    }
}
