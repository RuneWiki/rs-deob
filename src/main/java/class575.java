import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class575 extends class513 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public volatile int field8416 = -1;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field8419;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field8422 = -1;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "F")
    public static float field8420;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static final void method3365(byte arg0) {
        field8421++;
        class37.method422();
        if (arg0 != 37) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class349.field4642[var1].method2138((byte) -100);
        }
        class338.method1955(43);
        class354.method2000(0);
        System.gc();
        class68.field1045.method246();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(CB)Z")
    public static final boolean method3366(char arg0, byte arg1) {
        int var2 = 102 % ((arg1 - 9) / 52);
        field8417++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class575(String arg0) {
        this.field8419 = arg0;
    }
}
