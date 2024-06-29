import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class370 extends class28 {

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Lpea;")
    public class641 field5316;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Lcb;")
    public static class318 field5320 = new class318(46, 0);

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "[I")
    public static int[] field5322 = new int[3];

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "Z")
    public boolean field5317;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I", line = 4)
    public final int method2270(boolean arg0) {
        field5321++;
        if (arg0) {
            this.field5316 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)Z", line = 15)
    public final boolean method2271(boolean arg0) {
        field5323++;
        if (arg0) {
            this.method570(-78, (byte) 100, 107);
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLpq;)V", line = 30)
    public static final void method2272(boolean arg0, class159 arg1) {
        if (arg0) {
            field5320 = null;
        }
        field5315++;
        class198.field2621 = arg1.method1090("hitmarks", (byte) -103);
        class8.field72 = arg1.method1090("hitbar_default", (byte) -118);
        class490.field6608 = arg1.method1090("timerbar_default", (byte) 9);
        class631.field8576 = arg1.method1090("headicons_pk", (byte) -119);
        class118.field1525 = arg1.method1090("headicons_prayer", (byte) -104);
        class201.field2640 = arg1.method1090("hint_headicons", (byte) 72);
        class417.field5812 = arg1.method1090("hint_mapmarkers", (byte) 90);
        class227.field2978 = arg1.method1090("mapflag", (byte) 21);
        class237.field3083 = arg1.method1090("cross", (byte) -118);
        class236.field3075 = arg1.method1090("mapdots", (byte) 35);
        class323.field4731 = arg1.method1090("scrollbar", (byte) 103);
        class45.field600 = arg1.method1090("name_icons", (byte) 73);
        class248.field3337 = arg1.method1090("floorshadows", (byte) -112);
        class352.field5144 = arg1.method1090("compass", (byte) -112);
        class431.field5991 = arg1.method1090("otherlevel", (byte) 101);
        class147.field1858 = arg1.method1090("hint_mapedge", (byte) 125);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Z", line = 56)
    public final boolean method2273(byte arg0) {
        if (arg0 >= -106) {
            field5320 = null;
        }
        field5318++;
        return this.field5317;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 74)
    public static void method2274(int arg0) {
        if (arg0 < -63) {
            field5322 = null;
            field5320 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I", line = 86)
    public int method566(int arg0) {
        field5319++;
        if (arg0 != 1) {
            this.field5317 = false;
        }
        return 0;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lpea;)V", line = 104)
    public class370(class641 arg0) {
        this.field5316 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
    public abstract boolean method568(int arg0);

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V")
    public abstract void method574(byte arg0);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lqw;Lqw;II)V")
    public abstract void method575(class379 arg0, class379 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public abstract void method576(int arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBI)V")
    public abstract void method570(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)Z")
    public abstract boolean method578(boolean arg0);
}
