import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lwj;")
    private class129 field6 = new class129();

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lgf;")
    private class222 field12 = new class222();

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Li;")
    private class112 field8;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4 = "wave2:";

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)Lia;")
    public final class83 method1(byte arg0) {
        if (arg0 == -6) {
            field1++;
            return this.field8.method788(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 != 5) {
            this.method3(20, 16L);
        }
        this.field12.method1497((byte) 62);
        this.field8.method777(true);
        this.field6 = new class129();
        field2++;
        this.field7 = this.field15;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)Lwj;")
    public final class129 method3(int arg0, long arg1) {
        class129 var4 = (class129) this.field8.method779(-79, arg1);
        if (arg0 != 32) {
            return null;
        }
        if (var4 != null) {
            this.field12.method1498(0, var4);
        }
        field13++;
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILwj;J)V")
    public final void method4(int arg0, class129 arg1, long arg2) {
        field5++;
        if (this.field7 == 0) {
            class129 var5 = this.field12.method1492((byte) -112);
            var5.method547(10026);
            var5.method887((byte) -51);
            if (this.field6 == var5) {
                class129 var6 = this.field12.method1492((byte) 125);
                var6.method547(10026);
                var6.method887((byte) -51);
            }
        } else {
            this.field7--;
        }
        this.field8.method780((byte) -78, arg2, arg1);
        this.field12.method1498(arg0, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method5(int arg0) {
        if (arg0 != -2048) {
            method8((byte) -14);
        }
        field4 = null;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method6(int arg0) {
        while (true) {
            if (class248.field4058.method201(class101.field1747, -22966) >= 11) {
                int var1 = class248.field4058.method198(11, (byte) 0);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class105.field1874[var1] == null) {
                        class105.field1874[var1] = new class288();
                        var2 = true;
                        if (class53.field930[var1] != null) {
                            class105.field1874[var1].method1954((byte) -107, class53.field930[var1]);
                        }
                    }
                    class280.field4458[class157.field2624++] = var1;
                    class288 var3 = class105.field1874[var1];
                    var3.field1406 = class266.field4301;
                    int var4 = class248.field4058.method198(1, (byte) 0);
                    if (var4 == 1) {
                        class60.field1051[class292.field4664++] = var1;
                    }
                    int var5 = class248.field4058.method198(5, (byte) 0);
                    int var6 = class248.field4058.method198(5, (byte) 0);
                    int var7 = class141.field2420[class248.field4058.method198(3, (byte) 0)];
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var2) {
                        var3.field1389 = var3.field1413 = var7;
                    }
                    int var8 = class248.field4058.method198(1, (byte) 0);
                    var3.method1949(class273.field4378.field1464[0] + var5, var8 == 1, class273.field4378.field1486[0] + var6, 32);
                    continue;
                }
            }
            class248.field4058.method197((byte) -112);
            field3++;
            int var9 = -114 % ((37 - arg0) / 63);
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Lia;")
    public final class83 method7(int arg0) {
        if (arg0 == 23635) {
            field9++;
            return this.field8.method782(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        field10++;
        class168.field2783.method53(true);
        if (arg0 != -118) {
            method5(-117);
        }
        class139.field2397.method53(true);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
    public class1(int arg0) {
        this.field7 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field15 = arg0;
        this.field8 = new class112(var2);
    }
}
