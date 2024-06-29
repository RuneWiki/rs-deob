import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class233 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[Lsc;")
    public static class364[] field2904 = new class364[100];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)V", line = 4)
    public static final void method1400(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            int var3 = 105 % ((arg1 + 40) / 33);
        } catch (InterruptedException var4) {
        }
        field2908++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method1401(int arg0) {
        if (arg0 != 2) {
            this.field2901 = 119;
        }
        field2906++;
        return (this.field2905 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method1402(int arg0) {
        field2903++;
        if (arg0 != 29342) {
            this.method1402(48);
        }
        return (this.field2905 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method1403(byte arg0) {
        field2909++;
        if (arg0 <= 28) {
            method1406(-50);
        }
        return (this.field2905 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method1404(byte arg0) {
        if (arg0 >= -97) {
            this.field2905 = 55;
        }
        field2911++;
        return (this.field2905 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 82)
    public static final void method1405(byte arg0) {
        field2910++;
        if (arg0 <= 28 || class381.field4815) {
            return;
        }
        class575.method3173(class582.field8139, -6429);
        if (class173.field2260 != null) {
            class575.method3173(class173.field2260, -6429);
        }
        class381.field4815 = true;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 107)
    public static final void method1406(int arg0) {
        field2907++;
        class605.field8510 = class702.field9928;
        class484.field6435 = new class199[500];
        class311.field3980 = new class199[arg0];
        class430.field5385 = 0;
        class472.field5992 = 0;
        class642.field9049 = new class199[500];
        class207.field2629 = 0;
        class145.field1881 = 0;
        class359.field4578 = new int[class391.field4927][class429.field5383 + 1][class37.field508 + 1];
        class269.field3404 = false;
        class425.field5335 = new class199[2000];
        class152.field1945 = class702.field9928;
        if ((class590.field8291 instanceof class171)) {
            class68.field926 = false;
        } else {
            class68.field926 = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 136)
    public static void method1407(int arg0) {
        if (arg0 != 15223) {
            method1400(46L, (byte) 6);
        }
        field2904 = null;
    }
}
