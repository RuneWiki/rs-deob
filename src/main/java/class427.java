import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class427 {

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Lil;")
    public class598 field5931 = null;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Lta;")
    public class301 field5934 = null;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5933 = "";

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILpq;Le;)V")
    public static final void method2458(int arg0, class159 arg1, class479 arg2) {
        field5929++;
        class19.field168 = arg1;
        if (arg0 == 29998) {
            class511.field6895 = arg2;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLdga;)Lbk;")
    public static final class194 method2459(byte arg0, class138 arg1) {
        field5930++;
        class550 var2 = class394.method2341(arg1, 18236);
        int var3 = arg1.method943(-122);
        int var4 = arg1.method943(-87);
        int var5 = -15 % ((-arg0 - 63) / 34);
        return new class194(var2.field7522, var2.field7524, var2.field7518, var2.field7525, var2.field7517, var2.field7519, var2.field7520, var3, var4);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static void method2460(byte arg0) {
        int var1 = -27 / ((arg0 - 74) / 51);
        field5933 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2461(int arg0, byte arg1, int arg2) {
        if (arg1 > -123) {
            return true;
        } else {
            field5932++;
            return (arg2 & 0x70000) != 0 | class410.method2404(0, arg0, arg2) || class629.method3441(arg2, arg0, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lta;)V")
    public class427(class301 arg0) {
        this.field5934 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lta;Lil;)V")
    public class427(class301 arg0, class598 arg1) {
        this.field5934 = arg0;
        this.field5931 = arg1;
    }
}
