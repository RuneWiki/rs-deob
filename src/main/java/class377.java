import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class377 extends class10 {

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    public int[] field4956;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    public int[] field4954;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lkg;")
    public static class179 field4958 = new class179(9, -1);

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    public static int[] field4962 = new int[5];

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field4959 = -1;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lkc;")
    public static class87 field4960;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method2139(int arg0, boolean arg1, int arg2) {
        field4961++;
        if (arg1) {
            return class22.method188(arg2, (byte) -105, arg0) || class9.method57(arg2, arg0, 55);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 15)
    public static void method2140(byte arg0) {
        field4958 = null;
        field4962 = null;
        int var1 = -109 / ((arg0 - 30) / 47);
        field4960 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 28)
    public static final void method2141(int arg0) {
        class194.method1203();
        field4957++;
        for (int var1 = 0; var1 < 4; var1++) {
            class172.field2185[var1].method2004(-1);
        }
        class2.method5(false);
        class124.method876((byte) 107);
        System.gc();
        if (arg0 != 2278) {
            field4958 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 54)
    public static final void method2142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class407.field5817.field3619 != arg1 && arg2 != 0 && class189.field2475 < 50 && arg3 != -1) {
            class466.field6728[class189.field2475++] = new class212((byte) 1, arg3, arg2, arg0, arg4, 0);
        }
        field4955++;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II[I[I)V", line = 68)
    public class377(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4956 = arg2;
        this.field4954 = arg3;
    }
}
