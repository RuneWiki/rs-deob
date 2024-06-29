import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class260 extends class222 {

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
    public final void method1268(int arg0, int arg1, int arg2) {
        int var4 = -90 % ((arg0 - -3) / 32);
        ++field3407;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
    public final void method1269(byte arg0, int arg1, int arg2) {
        int var4 = -103 / ((50 - arg0) / 38);
        ++field3408;
        int var5 = this.field3398 * arg2 >> 12;
        int var6 = this.field3399 * arg1 >> 12;
        int var7 = this.field3404 * arg2 >> 12;
        int var8 = this.field3406 * arg1 >> 12;
        int var9 = this.field3409 * arg2 >> 12;
        int var10 = this.field3405 * arg1 >> 12;
        int var11 = this.field3410 * arg2 >> 12;
        int var12 = this.field3403 * arg1 >> 12;
        class247.method1485(var7, var5, var9, true, var10, var8, var12, super.field2868, var6, var11);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method1264(int arg0, int arg1, int arg2) {
        ++field3411;
        if (arg2 != -5515) {
            this.method1269((byte) 87, -113, -49);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method1559(int arg0, int arg1) {
        ++field3401;
        class252 var2 = class150.method916(arg1, -116, arg0);
        var2.method1497(arg0 + -5);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILha;)V")
    public static final void method1560(int arg0, class60 arg1) {
        if (arg0 >= -9) {
            method1559(-4, 88);
        }
        ++field3400;
        if (class149.field1905.method730(0) != 0) {
            if (class11.field68.field5503.method741((byte) 121) != 0) {
                if (class256.field3310 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class256.field3310 = class144.method897(0, var2, 122, class15.field116, 0, class491.field6707);
                    class335.field4532 = class256.field3310.method425(class581.method3247((byte) 111, 0, class535.field7255, class641.field8923), class204.method1124(class97.field1282, class535.field7255, 0), true);
                }
                for (class109 var3 = (class109) class149.field1905.method724(32); var3 != null; var3 = (class109) class149.field1905.method723(106)) {
                    class761.field10628.method4177(class335.field4532, false, var3.field1452, var3.field1447, var3.field1449, !var3.field1454 ? null : class653.field9086.field1121, class256.field3310, var3.field1443, false, var3.field1448, arg1, false);
                    var3.method315(55);
                }
            } else {
                for (class109 var4 = (class109) class149.field1905.method724(32); var4 != null; var4 = (class109) class149.field1905.method723(114)) {
                    class761.field10628.method4177(class497.field6764, false, var4.field1452, var4.field1447, var4.field1449, var4.field1454 ? class653.field9086.field1121 : null, arg1, var4.field1443, false, var4.field1448, arg1, false);
                    var4.method315(84);
                }
                class340.method2004(2);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
    public static final int method1561(byte arg0, int arg1) {
        if (arg0 >= -67) {
            return -87;
        } else {
            ++field3402;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3406 = arg3;
        this.field3410 = arg6;
        this.field3409 = arg4;
        this.field3399 = arg1;
        this.field3405 = arg5;
        this.field3398 = arg0;
        this.field3404 = arg2;
        this.field3403 = arg7;
    }
}
