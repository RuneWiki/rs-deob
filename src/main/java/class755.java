import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class755 extends class325 {

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class755() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
    public static final String method4211(boolean arg0, int arg1, long arg2, int arg3) {
        field10485++;
        Calendar var5;
        if (arg0) {
            class146.method1094(-17062, arg2);
            var5 = class295.field4283;
        } else {
            class109.method822((byte) -105, arg2);
            var5 = class295.field4285;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2);
        if (arg3 > -94) {
            return null;
        } else {
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return arg1 == 3 ? class548.method3112(arg1, arg0, (byte) 70, arg2) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class339.field4916[arg1][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        field10486++;
        return arg0 <= 21 ? null : class556.field7498;
    }
}
