import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class314 {

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lad;")
    private class11 field4043 = new class11(64);

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Lad;")
    public class11 field4049 = new class11(50);

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "Lad;")
    public class11 field4051 = new class11(5);

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "Ldn;")
    public class201 field4044;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
    public boolean field4033;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Ldn;")
    private class201 field4035;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lpi;")
    public static class340 field4041 = new class340(90, -2);

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "[I")
    public static int[] field4048 = new int[13];

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
    public static int[] field4047;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class319.field4112.field1176 = 0;
        field4037++;
        class319.field4112.method565(arg2 + 55, class275.field3518.field195);
        class319.field4112.method565(-127, arg4);
        class319.field4112.method565(arg2 + 101, arg1);
        class319.field4112.method609(arg0, -128);
        class319.field4112.method609(arg3, -97);
        class227.field2925 = 0;
        class407.field5455 = 1;
        class221.field2857 = arg2;
        class82.field1020 = -3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 24)
    public static void method1865(int arg0) {
        field4047 = null;
        field4048 = null;
        if (arg0 == 64) {
            field4041 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 37)
    public final void method1866(int arg0) {
        field4040++;
        class11 var2 = this.field4043;
        synchronized (this.field4043) {
            this.field4043.method84(-64);
        }
        class11 var3 = this.field4049;
        synchronized (this.field4049) {
            this.field4049.method84(-69);
        }
        class11 var4 = this.field4051;
        synchronized (this.field4051) {
            if (arg0 == 12270) {
                this.field4051.method84(98);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 56)
    public static final void method1867(boolean arg0) {
        field4039++;
        for (class344 var1 = (class344) class180.field2333.method2126((byte) -127); var1 != null; var1 = (class344) class180.field2333.method2126((byte) -126)) {
            class417.method2453(var1, 0);
        }
        int var2;
        int var3;
        if (class421.field5647.method648(-47, class520.field7690)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class473.field6914;
            var3 = class473.field6914;
        }
        client.method3036();
        if (!arg0) {
            return;
        }
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method3047();
            client.method3041(var4);
            client.method3044(var4);
        }
        client.method3031();
        client.method3039();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 100)
    public final void method1868(int arg0, int arg1) {
        this.field4052 = arg0;
        field4046++;
        class11 var3 = this.field4049;
        synchronized (this.field4049) {
            this.field4049.method90((byte) -27);
        }
        class11 var4 = this.field4051;
        synchronized (this.field4051) {
            if (arg1 != -28874) {
                this.field4035 = null;
            }
            this.field4051.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)Lde;", line = 117)
    public final class10 method1869(int arg0, boolean arg1) {
        field4034++;
        class11 var3 = this.field4043;
        class10 var4;
        synchronized (this.field4043) {
            var4 = (class10) this.field4043.method78((long) arg0, (byte) -107);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4035.method1313((byte) -105, class487.method2912(true, arg0), class69.method389(arg0, false));
        class10 var6 = new class10();
        var6.field104 = arg0;
        var6.field118 = this;
        if (var5 != null) {
            var6.method75((byte) -91, new class88(var5));
        }
        var6.method67(arg1);
        class11 var7 = this.field4043;
        synchronized (this.field4043) {
            this.field4043.method88((long) arg0, 71, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 146)
    public final void method1870(int arg0) {
        if (arg0 != 0) {
            this.method1866(-55);
        }
        class11 var2 = this.field4043;
        synchronized (this.field4043) {
            this.field4043.method90((byte) -27);
        }
        field4036++;
        class11 var3 = this.field4049;
        synchronized (this.field4049) {
            this.field4049.method90((byte) -27);
        }
        class11 var4 = this.field4051;
        synchronized (this.field4051) {
            this.field4051.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V", line = 171)
    public final void method1871(boolean arg0, int arg1) {
        field4045++;
        if (this.field4033 != arg0) {
            this.field4033 = arg0;
            this.method1870(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 184)
    public final void method1872(byte arg0) {
        field4038++;
        class11 var2 = this.field4049;
        synchronized (this.field4049) {
            if (arg0 < 44) {
                return;
            }
            this.field4049.method90((byte) -27);
        }
        class11 var3 = this.field4051;
        synchronized (this.field4051) {
            this.field4051.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V", line = 200)
    public final void method1873(int arg0, int arg1) {
        if (arg1 != -5660) {
            return;
        }
        field4042++;
        class11 var3 = this.field4043;
        synchronized (this.field4043) {
            this.field4043.method80(arg1 ^ 0x162E, arg0);
        }
        class11 var4 = this.field4049;
        synchronized (this.field4049) {
            this.field4049.method80(-52, arg0);
        }
        class11 var5 = this.field4051;
        synchronized (this.field4051) {
            this.field4051.method80(-104, arg0);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lgt;IZLdn;Ldn;)V", line = 246)
    public class314(class65 arg0, int arg1, boolean arg2, class201 arg3, class201 arg4) {
        this.field4044 = arg4;
        this.field4033 = arg2;
        this.field4035 = arg3;
        if (this.field4035 != null) {
            int var6 = this.field4035.method1309((byte) 31) - 1;
            this.field4035.method1302(-122, var6);
        }
    }
}
