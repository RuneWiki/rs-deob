import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "J")
    private long field202;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field193 = -1;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
    public static int[] field201 = new int[16];

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[I")
    public static int[] field198;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lri;Z)V")
    private final void method170(class94 arg0, boolean arg1) {
        if (arg1) {
            field200++;
            this.field202 |= (arg0.field1444 << class94.field1450 * this.field199++);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static final void method171(byte arg0) {
        field194++;
        class141.field2191.method2067(5, -9);
        class493.field6910.method1252(5, 0);
        class412.field5801.method2726(0, 5);
        class18.field227.method1207(15789, 5);
        class516.field7253.method3267(arg0 - 131, 5);
        class181.field2574.method873(5, -448414484);
        class331.field4418.method192(5, true);
        if (arg0 != 39) {
            method173(-77);
        }
        class78.field1263.method1567(5, 30);
        class595.field8604.method2249((byte) 125, 5);
        class534.field7474.method589(5, 3056);
        class263.field3678.method709(17196, 5);
        class163.field2366.method2138(-98, 5);
        class340.field4583.method3257(5, true);
        class533.field7455.method3114(5, arg0 ^ 0x48);
        class630.field9230.method2775(5, 5);
        class303.field4141.method2356((byte) -104, 5);
        class358.field4823.method1154(false, 5);
        class534.field7475.method2061(5, -1);
        class62.field1080.method2540(arg0 ^ 0xFFFFFF88, 5);
        class642.field9327.method3564(5, false);
        class626.method3654(28698, 5);
        class20.method207((byte) 67, 50);
        class152.method993(true, 5);
        class356.method2135(5, (byte) 123);
        class41.field809.method3253(5, -127);
        class365.field4963.method3253(5, -120);
        class213.field3020.method3253(5, -126);
        class35.field674.method3253(5, -125);
        class123.field2013.method3253(5, -123);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
    public final int method172(int arg0) {
        field192++;
        if (arg0 != -26506) {
            this.method175(-104, 20);
        }
        return this.field199;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public static void method173(int arg0) {
        field201 = null;
        field198 = null;
        if (arg0 != 5) {
            field198 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Lri;")
    public final class94 method174(int arg0, byte arg1) {
        field197++;
        if (arg1 != 105) {
            field201 = null;
        }
        return class94.method683(1)[this.method175(arg0, -2064)];
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
    private final int method175(int arg0, int arg1) {
        field195++;
        if (arg1 != -2064) {
            this.method175(-60, -83);
        }
        return (int) (this.field202 >> class94.field1450 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lri;)V")
    public class14(class94 arg0) {
        this.field199 = 1;
        this.field202 = arg0.field1444;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([Lri;)V")
    public class14(class94[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method170(arg0[var2], true);
        }
    }
}
