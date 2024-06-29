import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class372 extends class81 {

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lwu;")
    public static class557 field5101;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "[J")
    public static long[] field5103;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method2232(int arg0) {
        field5103 = null;
        field5101 = null;
        if (arg0 != 10) {
            field5101 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2233(int arg0, long arg1) {
        field5102++;
        if (arg0 != -23024) {
            method2233(-104, -45L);
        }
        class332.field4261.setTime(new Date(arg1));
        int var3 = class332.field4261.get(7);
        int var4 = class332.field4261.get(5);
        int var5 = class332.field4261.get(2);
        int var6 = class332.field4261.get(1);
        int var7 = class332.field4261.get(11);
        int var8 = class332.field4261.get(12);
        int var9 = class332.field4261.get(13);
        return class539.field7545[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class558.field7935[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
