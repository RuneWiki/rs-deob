import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class204 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3059 = new BigInteger("9c685470e9b6e400682b16dcc857c11d689e14f0ace8b90fb56c4ea65fb402d30a46e4c003a735d4462d8723ea379e221646c32938e1cfc26572a04c111a2d71", 16);

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field3061 = 100;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IJ)I", line = 4)
    public final int method1454(int arg0, long arg1) {
        field3060++;
        long var4 = this.method1457(-6);
        if (var4 > 0L) {
            class363.method2283(var4, -24244);
        }
        if (arg0 != 100) {
            field3062 = 21;
        }
        return this.method1456(arg1, 0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 21)
    public static void method1455(byte arg0) {
        field3059 = null;
        if (arg0 <= 20) {
            method1458((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 39)
    public static final void method1458(byte arg0) {
        field3058++;
        if (class35.field318 == 5) {
            int var1 = -87 % ((arg0 + 11) / 58);
            class35.field318 = 6;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(JI)I")
    public abstract int method1456(long arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)J")
    public abstract long method1457(int arg0);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)J")
    public abstract long method1459(int arg0);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public abstract void method1460(int arg0);
}
