import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class292 {

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Lea;")
    public class325 field4089 = new class325();

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Z")
    public static boolean field4086 = false;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4082 = 0;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
    public static boolean field4095 = false;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "B")
    public static byte field4087;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "Lea;")
    private class325 field4097;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[Lsg;")
    public static class226[] field4083;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILea;)V", line = 4)
    public final void method1885(int arg0, class325 arg1) {
        field4096++;
        if (arg1.field4445 != null) {
            arg1.method2087(arg0 - 1858);
        }
        arg1.field4445 = this.field4089.field4445;
        arg1.field4449 = this.field4089;
        if (arg0 == 1859) {
            arg1.field4445.field4449 = arg1;
            arg1.field4449.field4445 = arg1;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 22)
    public final void method1886(int arg0) {
        field4090++;
        int var2 = 59 % ((23 - arg0) / 38);
        while (true) {
            class325 var3 = this.field4089.field4449;
            if (this.field4089 == var3) {
                this.field4097 = null;
                return;
            }
            var3.method2087(1);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLqa;)V", line = 46)
    public static final void method1887(byte arg0, class134 arg1) {
        int var2 = 91 / ((54 - arg0) / 53);
        field4085++;
        class194 var3 = (class194) class188.field2593.method886((long) arg1.field5294, 25651);
        if (var3 == null) {
            class369.method2373(1, arg1.field5332[0], arg1, 0, (class198) null, arg1.field5326[0], (class64) null, class142.field2034);
        } else {
            var3.method1254((byte) 126);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Lea;", line = 68)
    public final class325 method1888(byte arg0) {
        field4091++;
        class325 var2 = this.field4089.field4449;
        if (this.field4089 == var2) {
            this.field4097 = null;
            return null;
        }
        this.field4097 = var2.field4449;
        if (arg0 != 85) {
            field4095 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 95)
    public static final void method1889(byte arg0) {
        field4084++;
        class291.method1884();
        for (int var1 = 0; var1 < 4; var1++) {
            class426.field5999[var1].method532((byte) -95);
        }
        if (arg0 >= -30) {
            method1891(-42);
        }
        class247.method1666((byte) -122);
        client.method1095(false);
        System.gc();
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 206)
    public class292() {
        this.field4089.field4449 = this.field4089;
        this.field4089.field4445 = this.field4089;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;", line = 124)
    public static final String method1890(String arg0, String arg1, byte arg2, String arg3) {
        field4093++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg3.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(var4 + arg0.length());
        }
        int var5 = -30 / ((arg2 - 36) / 60);
        return arg1;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 153)
    public static void method1891(int arg0) {
        field4083 = null;
        if (arg0 >= -20) {
            field4086 = true;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V", line = 164)
    public static final void method1892(int arg0, int arg1) {
        class192.field2649 = -1;
        class222.field3100 = arg0;
        int var2 = 121 % ((57 - arg1) / 50);
        class277.field3854 = -1;
        field4098++;
        class410.method2564((byte) -42);
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Lea;", line = 186)
    public final class325 method1893(int arg0) {
        field4092++;
        class325 var2 = this.field4097;
        if (this.field4089 == var2) {
            this.field4097 = null;
            return null;
        }
        if (arg0 != 27597) {
            method1890((String) null, (String) null, (byte) 41, (String) null);
        }
        this.field4097 = var2.field4449;
        return var2;
    }
}
