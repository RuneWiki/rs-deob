import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class85 {

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "[[[I")
    public static int[][][] field1610;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "[[[S")
    public static short[][][] field1611;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I")
    public final int method851(byte arg0) {
        field1617++;
        int var2 = -62 % ((arg0 - 41) / 38);
        return this.field1612;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
    public static final void method852(int arg0, boolean arg1) {
        field1615++;
        if (class165.field2755 != null) {
            class165.field2755.method481(true);
            class165.field2755 = null;
        }
        class183.field2942 = 0;
        class432.method2627(255);
        class92.method885();
        for (int var2 = 0; var2 < 4; var2++) {
            class223.field3352[var2].method3480((byte) -113);
        }
        class11.method284(64, false);
        System.gc();
        class610.method3506(15995, 2);
        class65.field1434 = -1;
        if (arg0 > -113) {
            field1610 = null;
        }
        class552.field7822 = false;
        class393.method2428((byte) 47, true);
        class287.field4278 = 0;
        class323.field4749 = 0;
        class32.field961 = 0;
        class470.field6673 = 0;
        class273.field4095 = 0;
        class33.field967 = 0;
        for (int var3 = 0; var3 < class565.field8254.length; var3++) {
            class565.field8254[var3] = null;
        }
        class368.method2325(-1017);
        for (int var4 = 0; var4 < 2048; var4++) {
            class59.field1341[var4] = null;
        }
        class363.field5389 = 0;
        class208.field3179.method2600((byte) -114);
        class39.field1062 = 0;
        class409.field5924.method2600((byte) -114);
        class335.method2163((byte) 113);
        class130.field2351 = 0;
        class113.field2038.method1123(-3451);
        class648.method3696(true);
        class531.method3085(-1);
        class385.field5659 = null;
        class674.field9595 = 0L;
        if (arg1) {
            class118.method1038(12, 1);
            return;
        }
        class118.method1038(3, 1);
        try {
            class31.method507(13009, "loggedout", class416.field6017);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
    public static void method853(byte arg0) {
        if (arg0 != -4) {
            method852(1, true);
        }
        field1611 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1616++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IZ)V")
    public static final void method854(int arg0, boolean arg1) {
        field1613++;
        class33.field965 = arg0;
        class22.field867.method1913(arg1);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
    public static final void method855(boolean arg0) {
        if (class237.field3522 != null) {
            for (int var1 = 0; var1 < class695.field9792; var1++) {
                class237.field3522[var1] = null;
            }
            class237.field3522 = null;
        }
        field1618++;
        if (class611.field8891 != null) {
            for (int var2 = 0; var2 < class254.field3771; var2++) {
                class611.field8891[var2] = null;
            }
            class611.field8891 = null;
        }
        if (class649.field9365 != null) {
            for (int var3 = 0; var3 < class78.field1569; var3++) {
                class649.field9365[var3] = null;
            }
            class649.field9365 = null;
        }
        class122.field2228 = null;
        field1610 = null;
        class295.field4420 = -1;
        class356.field5332 = -1;
        if (arg0) {
            method855(false);
        }
        class177.field2890 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
    public static final void method856(byte arg0) {
        field1609++;
        class486.field6965.method2201((byte) -108);
        if (arg0 != -111) {
            field1611 = null;
        }
        class410.field5945.method1930(false);
        class486.field6963.method1829((byte) 108);
        class699.field9853.setBackground(Color.black);
        class679.field9638 = -1;
        class486.field6965 = class486.method2933(arg0 ^ 0xFFFFFF91, class699.field9853);
        class410.field5945 = class481.method2920(class699.field9853, 13233, true);
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(II)V")
    public class85(int arg0, int arg1) {
        this.field1612 = arg0;
        this.field1614 = arg1;
    }
}
