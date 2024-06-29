import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class191 extends class28 {

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "[I")
    private int[] field3056 = new int[this.field453];

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lik;")
    public static class259 field3048 = new class259(50);

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3060 = "wave2:";

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3058 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3059 = "Loaded update list";

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3064 = 127;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lbd;")
    public static class308 field3061;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[B")
    private byte[] field3055;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V", line = 4)
    public final void method187(byte arg0) {
        field3057++;
        this.field3050 = Math.abs(this.field3050);
        if (this.field3050 >= 4096) {
            this.field3050 = 4095;
        }
        if (arg0 <= 81) {
            field3061 = (class308) null;
        }
        this.method1411(this.field3053++, (byte) (this.field3050 >> 4));
        this.field3050 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V", line = 21)
    public void method1411(int arg0, byte arg1) {
        this.field3055[this.field3053++] = (byte) (class280.method2001(127, arg1 >> 1) + 127);
        field3049++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V", line = 30)
    public static final void method1412() {
        for (int var0 = 0; var0 < class104.field1764; var0++) {
            class45 var1 = class63.field979[var0];
            class125.method937(var1);
            class63.field979[var0] = null;
        }
        class104.field1764 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I", line = 44)
    public static final int method1413(int arg0, int arg1, int arg2, int arg3) {
        field3051++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = 128 - arg0;
        if (arg3 == 28702) {
            int var5 = (arg1 >>> 7 & 0x1FE01FE) * var4 + (arg2 >>> 7 & 0x1FE01FE) * arg0 & 0xFF00FF00;
            int var6 = (arg1 & 0xFF00FF) * var4 + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00;
            return (var6 >> 7) + var5;
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 65)
    public final void method189(int arg0, int arg1, int arg2) {
        this.field3050 += this.field3056[arg2] * arg0 >> 12;
        field3063++;
        if (arg1 != -2097549204) {
            this.method187((byte) -14);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 80)
    public final void method188(int arg0) {
        this.field3050 = 0;
        field3065++;
        if (arg0 == 200) {
            this.field3053 = 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V", line = 103)
    public static final void method1414(boolean arg0, boolean arg1) {
        class168.field2607 = (byte[][][]) null;
        class195.field3110 = (byte[][][]) null;
        if (arg0 && class81.field1222 != null) {
            class264.field4092 = class81.field1222.field2624;
        } else {
            class264.field4092 = null;
        }
        field3054++;
        class91.field1500 = null;
        class23.field403 = null;
        class148.field2387 = (int[][][]) null;
        class81.field1222 = null;
        class78.field1183 = 0;
        class210.field3362 = (int[][][]) null;
        class139.field2218 = (byte[][][]) null;
        class151.field2432 = (byte[][][]) null;
        class276.field4279 = (byte[][][]) null;
        class222.field3562 = (int[][][]) null;
        class219.field3499.method1489(200);
        class98.field1629 = null;
        class89.field1418 = null;
        if (arg1) {
            field3062 = 46;
        }
        class188.field2994 = -1;
        class43.field763 = null;
        class240.field3735 = null;
        class170.field2647 = null;
        class12.field229 = null;
        class295.field4670 = -1;
        class216.field3455 = null;
        class61.field952 = null;
        class141.field2239 = null;
        class145.field2280 = null;
        class109.field1803 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)J", line = 157)
    public static final long method1415(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null || var3.field4219 == null ? 0L : var3.field4219.field1865;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 172)
    public static void method1416(int arg0) {
        field3060 = null;
        if (arg0 != -1) {
            field3060 = (String) null;
        }
        field3048 = null;
        field3059 = null;
        field3061 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIF)V", line = 192)
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field453; var7++) {
            this.field3056[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
