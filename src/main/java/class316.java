import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class316 {

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lad;")
    private class11 field4076 = new class11(64);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ldn;")
    private class201 field4067;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lgp;")
    public static class459 field4071 = new class459(0, 7);

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[Z")
    public static boolean[] field4074 = new boolean[100];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I", line = 7)
    public static final int method1878(int arg0, int arg1) {
        field4072++;
        if (arg1 != 200) {
            field4073 = 22;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 18)
    public static void method1879(byte arg0) {
        field4071 = null;
        field4074 = null;
        if (arg0 != 113) {
            field4074 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V", line = 30)
    public final void method1880(int arg0, int arg1) {
        if (arg0 != 9747) {
            this.method1881(68, (byte) 43);
        }
        field4077++;
        class11 var3 = this.field4076;
        synchronized (this.field4076) {
            this.field4076.method80(-79, arg1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lkn;", line = 43)
    public final class371 method1881(int arg0, byte arg1) {
        field4078++;
        class11 var3 = this.field4076;
        class371 var4;
        synchronized (this.field4076) {
            var4 = (class371) this.field4076.method78((long) arg0, (byte) -99);
        }
        if (arg1 != 54) {
            this.method1881(76, (byte) -92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4067.method1313((byte) -99, 32, arg0);
        class371 var6 = new class371();
        if (var5 != null) {
            var6.method2162(new class88(var5), true);
        }
        class11 var7 = this.field4076;
        synchronized (this.field4076) {
            this.field4076.method88((long) arg0, arg1 ^ 0x4F, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 72)
    public final void method1882(int arg0) {
        field4066++;
        class11 var2 = this.field4076;
        synchronized (this.field4076) {
            this.field4076.method84(117);
        }
        if (arg0 != 21882) {
            method1878(-22, 22);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 85)
    public final void method1883(boolean arg0) {
        class11 var2 = this.field4076;
        synchronized (this.field4076) {
            if (arg0) {
                this.field4076 = null;
            }
            this.field4076.method90((byte) -27);
        }
        field4068++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[[I)V", line = 102)
    public static final void method1884(int arg0, int[][] arg1) {
        class333.field4265 = arg1;
        if (arg0 != 200) {
            field4073 = -95;
        }
        field4070++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLvs;)V", line = 113)
    public static final void method1885(boolean arg0, class465 arg1) {
        arg1.field6835 = null;
        field4069++;
        int var2 = arg1.field6843.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field6843[var3].field7813 = false;
        }
        class362[] var4 = class89.field1243;
        synchronized (class89.field1243) {
            if (var2 < class89.field1243.length && class18.field320[var2] < 200) {
                class89.field1243[var2].method2124(arg1, -93);
                int var10002 = class18.field320[var2]++;
            }
        }
        if (!arg0) {
            method1885(true, null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 159)
    public class316(class65 arg0, int arg1, class201 arg2) {
        this.field4067 = arg2;
        this.field4067.method1302(-107, 32);
    }
}
