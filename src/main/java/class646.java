import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class646 extends OutputStream {

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lqaa;")
    public static class26 field9074 = new class26();

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lpw;")
    public static class656 field9077 = new class656();

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!sfa", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field9075++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZLdh;)V")
    public static final void method3737(boolean arg0, class295 arg1) {
        field9076++;
        if (class453.field6808) {
            return;
        }
        arg1.method707((byte) -97);
        class52.field693--;
        if (arg0) {
            method3738(-42, null);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILoo;)V")
    public static final void method3738(int arg0, class580 arg1) {
        arg1.method82(false, class1.field1.method927(false));
        field9073++;
        arg1.method82(false, class320.field5013.method927(false));
        arg1.method82(false, class456.field6845.method927(false));
        arg1.method82(false, class193.field3196.method927(false));
        arg1.method82(false, class452.field6799.method927(false));
        arg1.method82(false, class247.field3943.method927(false));
        arg1.method82(false, class663.field9232.method927(false));
        arg1.method82(false, class547.field7970.method927(false));
        arg1.method82(false, class158.field2699.method927(false));
        arg1.method82(false, class105.field1707.method927(false));
        arg1.method82(false, class258.field4122.method927(false));
        arg1.method82(false, class641.field8988.method927(false));
        arg1.method82(false, class321.field5030.method927(false));
        arg1.method82(false, class51.field682.method927(false));
        arg1.method82(false, class290.field4598.method927(false));
        arg1.method82(false, class553.field8017.method927(false));
        arg1.method82(false, class422.field6434.method927(false));
        arg1.method82(false, class216.field3561.method927(false));
        arg1.method82(false, class132.field2157.method927(false));
        arg1.method82(false, class304.field4755.method927(false));
        arg1.method82(false, class286.field4546.method927(false));
        arg1.method82(false, class28.field434.method927(false));
        int var2 = -70 / ((19 - arg0) / 35);
        arg1.method82(false, class469.field6958.method927(false));
        arg1.method82(false, class660.field9199.method927(false));
        arg1.method82(false, class292.field4604.method927(false));
        arg1.method82(false, class287.field4566.method927(false));
        arg1.method82(false, class51.field688.method927(false));
        arg1.method82(false, class275.field4424.method927(false));
        arg1.method82(false, class95.field1491.method927(false));
        arg1.method82(false, class85.field1045.method927(false));
        arg1.method82(false, class357.field5695.method927(false));
        arg1.method82(false, class28.field436.method927(false));
        arg1.method82(false, class238.method1709(-24461));
        arg1.method82(false, class122.method1092(-117));
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public static void method3739(int arg0) {
        field9077 = null;
        if (arg0 == -20200) {
            field9074 = null;
        }
    }
}
