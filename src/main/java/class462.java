import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class462 {

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "Lww;")
    private class287 field6330 = new class287();

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "Ldm;")
    private class98 field6336 = new class98();

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    private int field6333;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    private int field6335;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "Lgca;")
    private class209 field6334;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BJ)Lww;")
    public final class287 method2761(byte arg0, long arg1) {
        field6329++;
        class287 var4 = (class287) this.field6334.method1381(true, arg1);
        if (arg0 <= 55) {
            this.field6333 = -42;
        }
        if (var4 != null) {
            this.field6336.method666(8192, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public final void method2762(byte arg0) {
        this.field6336.method661(false);
        field6328++;
        if (arg0 >= -24) {
            this.field6334 = null;
        }
        this.field6334.method1385((byte) -97);
        this.field6330 = new class287();
        this.field6335 = this.field6333;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(JB)V")
    public final void method2763(long arg0, byte arg1) {
        field6332++;
        class287 var4 = (class287) this.field6334.method1381(true, arg0);
        if (var4 != null) {
            var4.method3065(-17363);
            var4.method1706((byte) 79);
            this.field6335++;
        }
        if (arg1 != -93) {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(JLww;I)V")
    public final void method2764(long arg0, class287 arg1, int arg2) {
        if (this.field6335 == 0) {
            class287 var5 = this.field6336.method665((byte) -55);
            var5.method3065(-17363);
            var5.method1706((byte) 79);
            if (this.field6330 == var5) {
                class287 var6 = this.field6336.method665((byte) -55);
                var6.method3065(-17363);
                var6.method1706((byte) 79);
            }
        } else {
            this.field6335--;
        }
        field6331++;
        this.field6334.method1387(arg1, arg0, (byte) -117);
        if (arg2 != -4900) {
            this.field6330 = null;
        }
        this.field6336.method666(8192, arg1);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Z")
    public static final boolean method2765(byte arg0, int arg1) {
        field6326++;
        if (arg1 == 11 || arg1 == 51 || arg1 == 16 || arg1 == 19 || arg1 == 59) {
            return true;
        } else {
            int var2 = -125 % ((arg0 - 32) / 38);
            return arg1 == 20 || arg1 == 1011;
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(I)V")
    public class462(int arg0) {
        this.field6333 = arg0;
        this.field6335 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field6334 = new class209(var2);
    }
}
