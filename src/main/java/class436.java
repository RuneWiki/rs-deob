import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class436 extends class224 {

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "Luga;")
    public class206 field6102;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Lva;")
    public class494 field6090;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field6093 = 0;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Lkg;")
    public static class271 field6095 = new class271("", 13);

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field6101 = 0;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public int field6087;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public int field6099;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "Lfp;")
    public static class323 field6100;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
    public static final boolean method2628(int arg0, int arg1, int arg2) {
        if (arg0 < 51) {
            field6093 = 69;
        }
        field6098++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)B")
    public static final byte method2629(int arg0, int arg1, int arg2) {
        if (arg0 >= -75) {
            method2633(-104);
        }
        field6091++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)Laga;")
    public static final class663 method2630(boolean arg0) {
        field6092++;
        try {
            return (class663) Class.forName("jl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return arg0 ? null : new class599();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lrca;B)V")
    public static final void method2631(class452 arg0, byte arg1) {
        field6094++;
        arg0.method233(class4.field66.method1455(true), -23162);
        arg0.method233(class242.field3396.method1455(true), -23162);
        arg0.method233(class14.field167.method1455(true), -23162);
        arg0.method233(class513.field7322.method1455(true), -23162);
        arg0.method233(class662.field9317.method1455(true), -23162);
        arg0.method233(class391.field5460.method1455(true), -23162);
        arg0.method233(class351.field4955.method1455(true), -23162);
        arg0.method233(class423.field5926.method1455(true), -23162);
        if (arg1 >= -120) {
            field6100 = null;
        }
        arg0.method233(class501.field7161.method1455(true), -23162);
        arg0.method233(class104.field1741.method1455(true), -23162);
        arg0.method233(class427.field5962.method1455(true), -23162);
        arg0.method233(class586.field8253.method1455(true), -23162);
        arg0.method233(class515.field7336.method1455(true), -23162);
        arg0.method233(class722.field10091.method1455(true), -23162);
        arg0.method233(class710.field9930.method1455(true), -23162);
        arg0.method233(class528.field7505.method1455(true), -23162);
        arg0.method233(class231.field3293.method1455(true), -23162);
        arg0.method233(class372.field5214.method1455(true), -23162);
        arg0.method233(class744.field10424.method1455(true), -23162);
        arg0.method233(class136.field2119.method1455(true), -23162);
        arg0.method233(class497.field7079.method1455(true), -23162);
        arg0.method233(class46.field673.method1455(true), -23162);
        arg0.method233(class292.field4105.method1455(true), -23162);
        arg0.method233(class588.field8272.method1455(true), -23162);
        arg0.method233(class491.field7005.method1455(true), -23162);
        arg0.method233(class86.field1559.method1455(true), -23162);
        arg0.method233(class444.field6177.method1455(true), -23162);
        arg0.method233(class711.field9935.method1455(true), -23162);
        arg0.method233(class128.field1932.method1455(true), -23162);
        arg0.method233(class411.field5688.method1455(true), -23162);
        arg0.method233(class81.field1511.method1455(true), -23162);
        arg0.method233(class345.field4863.method1455(true), -23162);
        arg0.method233(class523.method3101(2), -23162);
        arg0.method233(class301.method1962(114), -23162);
        arg0.method233(class546.field7698.method1455(true), -23162);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public final void method2632(int arg0) {
        this.field6087 = this.field6102.field2952;
        field6097++;
        this.field6088 = this.field6102.field2949;
        this.field6096 = this.field6102.field2948;
        if (this.field6102.field2959 != null) {
            this.field6102.field2959.method162(this.field6090.field7052, this.field6090.field7048, this.field6090.field7047, class399.field5583);
        }
        this.field6099 = class399.field5583[2];
        if (arg0 >= 80) {
            this.field6089 = class399.field5583[0];
        }
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6100 = null;
        if (arg0 >= -111) {
            method2633(50);
        }
        field6095 = null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Luga;Lf;)V")
    public class436(class206 arg0, class753 arg1) {
        this.field6102 = arg0;
        this.field6090 = this.field6102.method1435((byte) 25);
        this.method2632(102);
    }
}
