import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class312 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Luj;")
    private class155 field4994 = new class155();

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lek;")
    private class205 field5005 = new class205();

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field5002;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field5004;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lrb;")
    private class143 field5006;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4993 = 0;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "J")
    public static long field5000 = 0L;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lrb;")
    public static class143 field4998;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Llc;")
    public static class270 field5001;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4992;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BJ)Luj;")
    public final class155 method2099(byte arg0, long arg1) {
        if (arg0 != 125) {
            field5000 = 112L;
        }
        field5003++;
        class155 var4 = (class155) this.field5006.method1073(-1, arg1);
        if (var4 != null) {
            this.field5005.method1453(40, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Ltl;")
    public final class259 method2100(int arg0) {
        if (arg0 != -51) {
            this.field5006 = null;
        }
        field4999++;
        return this.field5006.method1069(-123);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method2101(int arg0) {
        field4995++;
        this.field5005.method1449(-12452);
        this.field5006.method1072(0);
        this.field4994 = new class155();
        if (arg0 == 3080) {
            this.field5002 = this.field5004;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Ltl;")
    public final class259 method2102(int arg0) {
        field4997++;
        if (arg0 != 15124) {
            this.method2099((byte) 90, -102L);
        }
        return this.field5006.method1071(arg0 - 15248);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Luj;IJ)V")
    public final void method2103(class155 arg0, int arg1, long arg2) {
        if (~this.field5002 == arg1) {
            class155 var5 = this.field5005.method1452((byte) 23);
            var5.method1781(arg1 ^ 0xFFFFEB7D);
            var5.method1135(false);
            if (this.field4994 == var5) {
                class155 var6 = this.field5005.method1452((byte) 23);
                var6.method1781(5250);
                var6.method1135(false);
            }
        } else {
            this.field5002--;
        }
        field4996++;
        this.field5006.method1074((byte) 39, arg0, arg2);
        this.field5005.method1453(arg1 - 110, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method2104(byte arg0) {
        field5001 = null;
        field4992 = null;
        int var1 = 95 % ((-arg0 - 70) / 35);
        field4998 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    public class312(int arg0) {
        this.field5002 = arg0;
        int var2 = 1;
        this.field5004 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field5006 = new class143(var2);
    }
}
