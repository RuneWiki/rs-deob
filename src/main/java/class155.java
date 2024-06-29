import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public abstract class class155 {

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field2330 = new Random();

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1183(boolean arg0) {
        if (!arg0) {
            method1183(true);
        }
        field2330 = null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)V", line = 27)
    public static final void method1184(int arg0, boolean arg1) {
        field2334++;
        class471.field6781.method2826(0, (byte) 89, class471.field6781.field6719);
        class471.field6781.method2826(0, (byte) 80, class471.field6781.field6704);
        class471.field6781.method2826(1, (byte) 100, class471.field6781.field6678);
        class471.field6781.method2826(1, (byte) 84, class471.field6781.field6668);
        class471.field6781.method2826(0, (byte) 80, class471.field6781.field6665);
        class471.field6781.method2826(0, (byte) 82, class471.field6781.field6674);
        class471.field6781.method2826(0, (byte) 109, class471.field6781.field6693);
        class471.field6781.method2826(0, (byte) 97, class471.field6781.field6698);
        class471.field6781.method2826(0, (byte) 99, class471.field6781.field6713);
        class471.field6781.method2826(arg0, (byte) 101, class471.field6781.field6689);
        class471.field6781.method2826(0, (byte) 81, class471.field6781.field6696);
        class471.field6781.method2826(0, (byte) 93, class471.field6781.field6688);
        class471.field6781.method2826(0, (byte) 83, class471.field6781.field6714);
        class471.field6781.method2826(0, (byte) 81, class471.field6781.field6673);
        class471.field6781.method2826(0, (byte) 94, class471.field6781.field6675);
        class471.field6781.method2826(0, (byte) 81, class471.field6781.field6697);
        class471.field6781.method2826(0, (byte) 95, class471.field6781.field6687);
        class471.field6781.method2826(0, (byte) 100, class471.field6781.field6677);
        class471.field6781.method2826(0, (byte) 95, class471.field6781.field6676);
        class56.method514(true);
        class471.field6781.method2826(2, (byte) 104, class471.field6781.field6705);
        class471.field6781.method2826(1, (byte) 99, class471.field6781.field6712);
        class685.method3857(true);
        class246.method1631(false);
        class291.field4095 = true;
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(III)V", line = 60)
    public class155(int arg0, int arg1, int arg2) {
        this.field2329 = arg1;
        this.field2333 = arg0;
        this.field2332 = arg2;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIB)V")
    public abstract void method3(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZI)V")
    public abstract void method4(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)V")
    public abstract void method5(int arg0, int arg1, int arg2);
}
