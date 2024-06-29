import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Z")
    public boolean field4082 = true;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field4087 = new Object();

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[I")
    public int[] field4091 = new int[500];

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public int[] field4090 = new int[500];

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field4092 = 0;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public static boolean field4084 = false;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lmh;")
    public static class128 field4080 = class22.method156(125, "Angreifen");

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4081 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 4)
    public static void method1627(byte arg0) {
        field4080 = null;
        if (arg0 <= 91) {
            method1629((byte) -55, 109);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILdj;)V", line = 15)
    public static final void method1628(int arg0, class314 arg1) {
        class104.field1786 = arg1.method2142(1, class310.field5260);
        if (arg0 >= -112) {
            field4084 = false;
        }
        field4089++;
        class229.field3977 = arg1.method2142(1, class96.field1617);
    }

    @OriginalMember(owner = "client!dd", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        while (this.field4082) {
            Object var1 = this.field4087;
            synchronized (this.field4087) {
                if (this.field4092 < 500) {
                    this.field4090[this.field4092] = class275.field4760;
                    this.field4091[this.field4092] = class77.field1411;
                    this.field4092++;
                }
            }
            class177.method1213(0, 50L);
        }
        field4086++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lcg;", line = 66)
    public static final class38 method1629(byte arg0, int arg1) {
        class38 var2 = (class38) class79.field1432.method1836((long) arg1, 0);
        int var3 = -98 / ((39 - arg0) / 36);
        field4088++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class171.field2995.method2155(class260.method1826(false, arg1), class284.method1968(arg1, (byte) -121), (byte) 70);
        class38 var5 = new class38();
        var5.field819 = arg1;
        if (var4 != null) {
            var5.method253(0, new class194(var4));
        }
        var5.method256(0);
        if (var5.field785) {
            var5.field807 = false;
            var5.field813 = 0;
        }
        if (!class121.field2042 && var5.field797) {
            var5.field798 = null;
        }
        class79.field1432.method1835((byte) -81, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)[Lng;", line = 102)
    public static final class152[] method1630(byte arg0) {
        int var1 = 96 % ((arg0 + 54) / 42);
        field4085++;
        class152[] var2 = new class152[class75.field1405];
        for (int var3 = 0; var3 < class75.field1405; var3++) {
            if (class247.field4247) {
                var2[var3] = new class67(class72.field1327, class132.field2294, class151.field2607[var3], class266.field4603[var3], class125.field2106[var3], class178.field3128[var3], class157.field2690[var3], class205.field3614);
            } else {
                var2[var3] = new class127(class72.field1327, class132.field2294, class151.field2607[var3], class266.field4603[var3], class125.field2106[var3], class178.field3128[var3], class157.field2690[var3], class205.field3614);
            }
        }
        class15.method113(87);
        return var2;
    }
}
