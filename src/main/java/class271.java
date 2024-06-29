import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class271 extends class443 {

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public int field3986 = 0;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Z")
    public static boolean field3980 = false;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lco;I)V", line = 5)
    public final void method1758(class268 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                if (arg1 != -2049) {
                    field3981 = -87;
                }
                field3984++;
                return;
            }
            this.method1761(var3, 22282, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method1759(boolean arg0, int arg1) {
        if (client.field8770 != null) {
            client.field8770.method2743((byte) -111);
            client.field8770 = null;
        }
        field3983++;
        class599.field8510 = 0;
        class414.method2504(arg1 - 115);
        class227.method1505();
        for (int var2 = 0; var2 < 4; var2++) {
            class268.field3916[var2].method329(-113);
        }
        class382.method2327(false, (byte) 110);
        System.gc();
        class277.method1784(-77, 2);
        class93.field1643 = -1;
        class331.field4757 = false;
        class77.method727(true, true);
        if (arg1 != 4) {
            field3981 = -97;
        }
        class382.field5687 = 0;
        class533.field7443 = 0;
        class597.field8500 = 0;
        class234.field3439 = 0;
        class37.field510 = 0;
        class559.field7931 = 0;
        for (int var3 = 0; var3 < class451.field6552.length; var3++) {
            class451.field6552[var3] = null;
        }
        class515.method2880((byte) -96);
        for (int var4 = 0; var4 < 2048; var4++) {
            class39.field536[var4] = null;
        }
        class128.field2098 = 0;
        class432.field6368.method739(2048);
        class313.field4570 = 0;
        class573.field8163.method739(2048);
        class393.method2379((byte) 102);
        class465.field6711 = 0;
        class401.field6001.method3550(false);
        class206.method1327((byte) 2);
        class514.method2878((byte) -125);
        class307.field4421 = 0L;
        class547.field7610 = null;
        if (arg0) {
            class307.method1904(true, 11);
            return;
        }
        class307.method1904(true, 2);
        try {
            class630.method3564(class270.field3976.field549, "loggedout", (byte) 104);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V", line = 109)
    public static final void method1760(byte arg0, int arg1) {
        if (arg0 == -78) {
            field3985++;
            class21 var2 = class601.method3413(arg1, 8, (byte) 85);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILco;)V", line = 124)
    private final void method1761(int arg0, int arg1, class268 arg2) {
        if (arg1 == 22282) {
            if (arg0 == 2) {
                this.field3986 = arg2.method1745(32132);
            }
            field3982++;
        }
    }
}
