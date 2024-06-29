import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class457 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)Lsaa;", line = 8)
    public static final class305 method2512(byte arg0) {
        class528.field6663 = 0;
        if (arg0 > -88) {
            field5702 = 40;
        }
        field5706++;
        return class210.method1234(83);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V", line = 25)
    public static final void method2516(byte arg0) {
        if (arg0 != 5) {
            method2512((byte) 120);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class642.field8705[var1] = false;
        }
        field5704++;
        class221.field2562 = class177.field2068;
        class301.field3830 = class665.field9027;
        class116.field1446 = -1;
        class699.field9682 = 0;
        class424.field5364 = client.field3568;
        class702.field9814 = -1;
        class41.field583 = class710.field9924;
        class631.field8556 = class455.field5688;
        class465.field5772 = 0;
        class385.field4946 = 5;
        class102.field1298 = class238.field3071;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)[Lpd;", line = 55)
    public static final class241[] method2517(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field5705++;
            return new class241[] { class514.field6536, class480.field5969, class250.field3224 };
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public abstract void method2511(byte arg0);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII[B)I")
    public abstract int method2513(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)Z")
    public abstract boolean method2514(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[BIB)V")
    public abstract void method2515(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public abstract void method2518(int arg0);
}
