import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class305 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljava/lang/String;")
    private String field4377 = "null";

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lhda;")
    public static class752 field4386 = new class752(78, -1);

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "D")
    public static double field4393 = -1.0D;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
    public static boolean field4394 = false;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "C")
    public char field4380;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "C")
    public char field4389;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Ldu;")
    private class360 field4384;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ldu;")
    public class360 field4388;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
    public static int[] field4390;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    private final void method1885(byte arg0) {
        field4387++;
        this.field4384 = new class360(this.field4388.method2139(-1));
        for (class248 var2 = (class248) this.field4388.method2144(true); var2 != null; var2 = (class248) this.field4388.method2146(false)) {
            class356 var4 = new class356(var2.field3436, (int) var2.field8680);
            this.field4384.method2143(-1, var4, class515.method2873(0, var2.field3436));
        }
        int var3 = -32 % ((-arg0 - 31) / 41);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
    public final int method1886(byte arg0, int arg1) {
        field4391++;
        if (this.field4388 == null) {
            return this.field4385;
        } else if (arg0 > -110) {
            return -58;
        } else {
            class651 var3 = (class651) this.field4388.method2135((long) arg1, (byte) 31);
            return var3 == null ? this.field4385 : var3.field8636;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1887(String arg0, int arg1) {
        field4392++;
        if (this.field4388 == null) {
            return false;
        }
        if (this.field4384 == null) {
            this.method1885((byte) -126);
        }
        for (class356 var3 = (class356) this.field4384.method2135(class515.method2873(arg1 ^ arg1, arg0), (byte) 31); var3 != null; var3 = (class356) this.field4384.method2141((byte) 50)) {
            if (var3.field4997.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static void method1888(boolean arg0) {
        field4386 = null;
        field4390 = null;
        if (arg0) {
            field4390 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILee;)V")
    public final void method1889(int arg0, class677 arg1) {
        field4383++;
        if (arg0 <= 71) {
            this.method1892(-3, 104);
        }
        while (true) {
            int var3 = arg1.method3821((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method1891(-84, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    private final void method1890(boolean arg0) {
        this.field4384 = new class360(this.field4388.method2139(-1));
        field4378++;
        for (class651 var2 = (class651) this.field4388.method2144(arg0); var2 != null; var2 = (class651) this.field4388.method2146(!arg0)) {
            class651 var3 = new class651((int) var2.field8680);
            this.field4384.method2143(-1, var3, (long) var2.field8636);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILee;)V")
    private final void method1891(int arg0, int arg1, class677 arg2) {
        if (arg1 == 1) {
            this.field4389 = class703.method3957((byte) -71, arg2.method3811(66));
        } else if (arg1 == 2) {
            this.field4380 = class703.method3957((byte) -71, arg2.method3811(51));
        } else if (arg1 == 3) {
            this.field4377 = arg2.method3793(15598);
        } else if (arg1 == 4) {
            this.field4385 = arg2.method3799(false);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method3807(-1);
            this.field4388 = new class360(class737.method4119(var4, (byte) -128));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3799(false);
                class656 var7;
                if (arg1 == 5) {
                    var7 = new class248(arg2.method3793(15598));
                } else {
                    var7 = new class651(arg2.method3799(false));
                }
                this.field4388.method2143(-1, var7, (long) var6);
            }
        }
        field4382++;
        int var8 = -85 % ((81 - arg0) / 43);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1892(int arg0, int arg1) {
        field4381++;
        if (this.field4388 == null) {
            return this.field4377;
        } else {
            int var3 = -111 % ((arg0 + 65) / 59);
            class248 var4 = (class248) this.field4388.method2135((long) arg1, (byte) 31);
            return var4 == null ? this.field4377 : var4.field3436;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
    public final boolean method1893(int arg0, int arg1) {
        field4379++;
        if (this.field4388 == null) {
            return false;
        }
        if (this.field4384 == null) {
            this.method1890(true);
        }
        class651 var3 = (class651) this.field4384.method2135((long) arg0, (byte) 31);
        if (var3 == null) {
            return false;
        } else if (arg1 == 78) {
            return true;
        } else {
            return true;
        }
    }
}
