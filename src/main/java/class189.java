import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class189 {

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Ljava/lang/String;")
    public String field2463;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Ljava/lang/String;")
    public String field2461;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "J")
    public long field2462;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "Ljb;")
    public static class519 field2465 = new class519(61, 7);

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ltd;I)V", line = 8)
    public static final void method1262(class478 arg0, int arg1) {
        field2464++;
        if (arg1 != 7) {
            method1262(null, -125);
        }
        if (class677.field9075) {
            return;
        }
        arg0.method1102((byte) 80);
        class269.field3929--;
        if (!arg0.field6709) {
            long var2 = arg0.field6708;
            class641 var4;
            for (var4 = (class641) class533.field7395.method1248(116, var2); var4 != null && !var4.field8635.equals(arg0.field6720); var4 = (class641) class533.field7395.method1243(82)) {
            }
            if (var4 != null && var4.method3530((byte) 89, arg0)) {
                class368.method2306(var4, (byte) 111);
                return;
            }
            return;
        }
        for (class641 var5 = (class641) class716.field9763.method152((byte) -13); var5 != null; var5 = (class641) class716.field9763.method146((byte) 97)) {
            if (var5.field8635.equals(arg0.field6720)) {
                boolean var6 = false;
                for (class478 var7 = (class478) var5.field8636.method152((byte) -13); var7 != null; var7 = (class478) var5.field8636.method146((byte) 97)) {
                    if (arg0 == var7) {
                        var6 = true;
                        if (var5.method3530((byte) 89, arg0)) {
                            class368.method2306(var5, (byte) 119);
                        }
                        break;
                    }
                }
                if (var6) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V", line = 92)
    public static void method1263(boolean arg0) {
        if (!arg0) {
            field2465 = null;
        }
        field2465 = null;
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 101)
    public class189(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2463 = arg3;
        this.field2461 = arg1;
        this.field2466 = arg0;
        this.field2462 = arg4;
        this.field2460 = arg2;
    }
}
