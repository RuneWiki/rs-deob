import java.awt.Canvas;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class440 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lss;")
    public static class213 field6820 = new class213("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field6823 = 0;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6824 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Z")
    public static boolean field6825 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
    public static final void method2790(int arg0, byte arg1) {
        field6819++;
        if (!class385.method2479(0, arg0)) {
            return;
        }
        int var2 = -7 / ((arg1 + 54) / 43);
        class437[] var3 = class433.field6540[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class437 var5 = var3[var4];
            if (var5 != null) {
                var5.field6659 = 1;
                var5.field6610 = 0;
                var5.field6621 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public abstract void method1892(int arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method2791(byte arg0) {
        field6824 = null;
        field6820 = null;
        int var1 = -57 / ((arg0 + 5) / 33);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1893(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
    public static final int method2792(int arg0) {
        field6821++;
        class497 var1 = class19.field198;
        boolean var2 = false;
        if (class452.field7013 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class497.method3044(null, var3, 0, -98, 0, null);
            var2 = true;
        }
        long var4 = class246.method1705((byte) 28);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1269(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class246.method1705((byte) 28) - var4);
        var1.method3042(arg0, (byte) -106, 0, -16777216, 0, 100);
        if (var2) {
            var1.method3039(12755);
        }
        return var7;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[BI)V")
    public abstract void method1895(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public abstract void method1897(byte arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BBI)I")
    public abstract int method1896(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException;
}
