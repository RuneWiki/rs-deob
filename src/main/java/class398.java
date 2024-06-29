import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class398 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Luca;")
    public class287 field6009;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lvg;")
    public static class622 field6006 = new class622(32, -1);

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
    public static boolean field6008 = false;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lrg;B)V", line = 5)
    public static final void method2473(class523 arg0, byte arg1) {
        field6007++;
        if (arg1 != 73) {
            method2474((byte) 38);
        }
        boolean var2 = false;
        if (class45.field685 == arg0.field7411 || arg0.field7389 == -1 || arg0.field7392 != 0) {
            var2 = true;
        } else {
            class47 var3 = class203.field2769.method2971(-51, arg0.field7389);
            if (var3.field722 || var3.field729[arg0.field7419] < (arg0.field7391 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field7411 - arg0.field7359;
            int var5 = class45.field685 - arg0.field7359;
            int var6 = arg0.field7343 * 512 + (arg0.method422((byte) 83) * 256);
            int var7 = arg0.field7345 * 512 + arg0.method422((byte) 73) * 256;
            int var8 = arg0.field7397 * 512 + (arg0.method422((byte) -69) * 256);
            int var9 = arg0.field7350 * 512 + arg0.method422((byte) 50) * 256;
            arg0.field7895 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field7896 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field7432 = 0;
        if (arg0.field7425 == 0) {
            arg0.method2956(8192, false, -101);
        }
        if (arg0.field7425 == 1) {
            arg0.method2956(12288, false, -31);
        }
        if (arg0.field7425 == 2) {
            arg0.method2956(0, false, -33);
        }
        if (arg0.field7425 == 3) {
            arg0.method2956(4096, false, arg1 - 104);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 66)
    public static void method2474(byte arg0) {
        field6006 = null;
        if (arg0 >= -7) {
            field6008 = true;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Luca;)V", line = 87)
    public class398(class287 arg0) {
        this.field6009 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
    public abstract boolean method87(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)V")
    public abstract void method94(int arg0, boolean arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBI)V")
    public abstract void method86(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public abstract void method91(boolean arg0, int arg1);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public abstract void method92(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILvaa;B)V")
    public abstract void method93(int arg0, class517 arg1, byte arg2);
}
