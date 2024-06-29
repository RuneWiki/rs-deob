import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class700 extends class388 {

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    private int field9874;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "[Lcv;")
    public class540[] field9873;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "[[B")
    private byte[][] field9875;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 10)
    public static final void method3929(int arg0, int arg1, String arg2, String arg3) {
        class544.field7903 = arg0;
        if (arg1 != -25696) {
            method3933(-22);
        }
        class39.field672 = 2;
        field9872++;
        class715.method4014((byte) 7, arg3, false, arg2);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)Z", line = 29)
    public final boolean method3930(byte arg0, int arg1) {
        field9871++;
        if (arg0 != 63) {
            this.method3934(-73, (byte) 119);
        }
        return this.field9873[arg1].field7842;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Z", line = 40)
    public final boolean method3931(int arg0, byte arg1) {
        field9870++;
        if (arg1 != -78) {
            this.field9874 = 72;
        }
        return this.field9873[arg0].field7837;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z", line = 51)
    public final boolean method3932(byte arg0) {
        field9876++;
        if (this.field9873 != null) {
            return true;
        }
        if (this.field9875 == null) {
            class423 var2 = class613.field8759;
            synchronized (class613.field8759) {
                if (!class613.field8759.method2617(0, this.field9874)) {
                    return false;
                }
                int[] var4 = class613.field8759.method2621(this.field9874, 100);
                this.field9875 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field9875[var5] = class613.field8759.method2600(0, this.field9874, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field9875.length; var7++) {
            byte[] var8 = this.field9875[var7];
            class479 var9 = new class479(var8);
            var9.field6864 = 1;
            int var10 = var9.method2882(-1);
            class423 var11 = class751.field10461;
            synchronized (class751.field10461) {
                var6 &= class751.field10461.method2609(0, var10);
            }
        }
        if (arg0 >= -37) {
            this.field9874 = -112;
        }
        if (!var6) {
            return false;
        }
        class611 var12 = new class611();
        class423 var13 = class613.field8759;
        int[] var15;
        synchronized (class613.field8759) {
            int var14 = class613.field8759.method2616(this.field9874, 0);
            this.field9873 = new class540[var14];
            var15 = class613.field8759.method2621(this.field9874, 100);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field9875[var16];
            class479 var18 = new class479(var17);
            var18.field6864 = 1;
            int var19 = var18.method2882(-1);
            class367 var20 = null;
            for (class367 var21 = (class367) var12.method3565(103); var21 != null; var21 = (class367) var12.method3561((byte) 83)) {
                if (var21.field5362 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class423 var22 = class751.field10461;
                synchronized (class751.field10461) {
                    var20 = new class367(var19, class751.field10461.method2611((byte) 106, var19));
                }
                var12.method3559(var20, (byte) 12);
            }
            this.field9873[var15[var16]] = new class540(var17, var20);
        }
        this.field9875 = null;
        return true;
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V", line = 161)
    public static final void method3933(int arg0) {
        class166.field2358.method552((byte) -72);
        field9869++;
        class159.field2290.method990(-90);
        class434.field6215.method2245((byte) -100);
        class375.field5421.method2676((byte) 91);
        class288.field4000.method2831(1635829665);
        class425.field6147.method4156((byte) 123);
        class610.field8698.method3004((byte) 27);
        class596.field8476.method2258((byte) 123);
        class215.field3233.method1142(-115);
        class600.field8526.method903(arg0 - 3136);
        class306.field4169.method1693((byte) 55);
        class258.field3697.method4091(19252);
        class386.field5581.method2688(arg0 - 48);
        class451.field6457.method1717(arg0 ^ 0x2D);
        class332.field4513.method1902(7);
        class455.field6490.method3317(-128);
        class154.field2237.method1799(arg0 + 102);
        class139.field1897.method17(31);
        class113.field1587.method3420((byte) -123);
        class379.field5506.method3359(-128);
        class329.method2024((byte) -86);
        class19.method94(arg0 ^ 0xFFFFA2EB);
        class639.method3688((byte) -98);
        class143.method1004((byte) -112);
        class292.method1836((byte) -113);
        class501.field7281.method2219(-5300);
        if (arg0 == 0) {
            class487.field7018.method2219(arg0 ^ 0xFFFFEB4C);
            class572.field8248.method2219(arg0 ^ 0xFFFFEB4C);
            class405.field5767.method2219(arg0 ^ 0xFFFFEB4C);
            class529.field7712.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V", line = 201)
    public class700(int arg0) {
        this.field9874 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(IB)Z", line = 211)
    public final boolean method3934(int arg0, byte arg1) {
        int var3 = 80 % ((arg1 + 51) / 33);
        field9877++;
        return this.field9873[arg0].field7846;
    }
}
