import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class375 {

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Lbj;")
    public static class131 field5348 = new class131(4);

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field5352 = 0;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Laq;")
    public static class90 field5353 = new class90();

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5355 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[Lij;")
    public static class242[] field5354;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Lgm;", line = 12)
    public static final class64 method2395(byte arg0, int arg1) {
        field5345++;
        class131 var2 = class337.field4640;
        class64 var3;
        synchronized (class337.field4640) {
            var3 = (class64) class337.field4640.method904(false, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class150.field2128.method1745(class453.method2815(66, arg1), (byte) 57, class366.method2359(true, arg1));
        class64 var5 = new class64();
        var5.field916 = arg1;
        if (var4 != null) {
            var5.method501(25285, new class11(var4));
        }
        if (arg0 < 1) {
            field5352 = 36;
        }
        var5.method498((byte) 122);
        if (var5.field926) {
            var5.field906 = 0;
            var5.field953 = false;
        }
        if (!class128.field1804 && var5.field880) {
            var5.field920 = null;
            var5.field890 = null;
        }
        class131 var6 = class337.field4640;
        synchronized (class337.field4640) {
            class337.field4640.method902((long) arg1, (byte) 112, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 55)
    public static void method2396(byte arg0) {
        field5353 = null;
        field5348 = null;
        field5354 = null;
        field5355 = null;
        if (arg0 <= 32) {
            method2398(0, (byte) -102, -46, -77, 24);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLkh;)Ln;", line = 71)
    public static final class13 method2397(boolean arg0, class11 arg1) {
        field5346++;
        arg1.method172((byte) 52);
        int var2 = arg1.method172((byte) 52);
        class13 var3 = class53.method436(-167, var2);
        var3.field257 = arg1.method172((byte) 52);
        int var4 = arg1.method172((byte) 52);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method172((byte) 52);
            var3.method31(arg1, (byte) 96, var6);
        }
        if (arg0) {
            method2397(false, (class11) null);
        }
        var3.method33(104);
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)V", line = 107)
    public static final void method2398(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5347++;
        if (arg1 != -13) {
            return;
        }
        if (arg2 >= arg4) {
            class295.method1924(3289650, class296.field4138[arg0], arg2, arg3, arg4);
        } else {
            class295.method1924(3289650, class296.field4138[arg0], arg4, arg3, arg2);
        }
    }
}
