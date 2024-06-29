import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class201 extends class128 {

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    private int field3217;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    private int field3229;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3223 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
    public final boolean method1402(int arg0, int arg1, int arg2) {
        field3221++;
        if (arg0 == 14) {
            return this.field3216 <= arg1 && this.field3214 >= arg1 && arg2 >= this.field3225 && this.field3211 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[I)V")
    public final void method1403(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg1] = this.field3222;
        arg3[2] = this.field3213 + arg0 - this.field3225;
        field3227++;
        arg3[1] = this.field3229 + arg2 - this.field3216;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public static final void method1404(int arg0, int arg1, int arg2) {
        field3230++;
        class175 var3 = class182.method1317(14, arg0, false);
        var3.method1279((byte) -80);
        var3.field2855 = arg1;
        if (arg2 != -25219) {
            method1404(-22, 106, 117);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)Z")
    public final boolean method1405(int arg0, int arg1, int arg2) {
        field3219++;
        if (arg0 >= -64) {
            this.field3226 = 24;
        }
        return this.field3229 <= arg2 && arg2 <= this.field3228 && arg1 >= this.field3213 && this.field3217 >= arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1406(Component arg0, int arg1) {
        field3220++;
        if (arg1 > -68) {
            field3218 = -120;
        }
        Method var2 = class45.field764;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class34.field516);
        arg0.addFocusListener(class34.field516);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static final void method1407(int arg0) {
        class206.method1438((byte) 116);
        field3210++;
        class112.method788(28577);
        class192.method1355(arg0 - 7356);
        class153.method1045(true);
        class136.method954(490368332);
        class212.method1481((byte) -66);
        class65.method458(1480833420);
        class146.method1022((byte) -113);
        class244.method1632(-29741);
        class182.method1321((byte) -103);
        class311.method2082(2048);
        class131.method929(-5373);
        class158.method1076((byte) -117);
        class107.method762(arg0 ^ 0x1C0F);
        class177.method1293(-70);
        class304.method2032(12919);
        class2.method12(952606864);
        class84.method575((byte) -111);
        class282.method1890(118);
        if (class130.field2044 != 0) {
            for (int var1 = 0; var1 < class70.field1182.length; var1++) {
                class70.field1182[var1] = null;
            }
            class267.field4296 = 0;
        }
        class163.method1173((byte) 47);
        class277.method1866(arg0 - 7306);
        class121.method852(-62);
        class192.method1352((byte) 1);
        if (arg0 != 7311) {
            method1410(false, (byte) 28);
        }
        class75.field1245.method1257(arg0 ^ 0xFFFFE301);
        ((class20) class302.field4828).method103(9974);
        class63.field1048.method692((byte) 125);
        class256.field4148.method1679(false);
        class220.field3602.method1679(false);
        class234.field3752.method1679(false);
        class229.field3690.method1679(false);
        class84.field1393.method1679(false);
        class50.field852.method1679(false);
        class265.field4266.method1679(false);
        class160.field2541.method1679(false);
        class247.field3938.method1679(false);
        class216.field3566.method1679(false);
        class10.field105.method1679(false);
        class189.field3059.method1257(-106);
        class119.field1904.method1257(49);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI[II)V")
    public final void method1408(byte arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 - (this.field3229 - this.field3216);
        field3212++;
        arg2[2] = this.field3225 + arg1 - this.field3213;
        int var5 = -71 % ((arg0 + 59) / 53);
        arg2[0] = this.field3226;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)Z")
    public final boolean method1409(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 11850) {
            field3215++;
            return this.field3222 == arg2 && arg3 >= this.field3229 && arg3 <= this.field3228 && this.field3213 <= arg0 && this.field3217 >= arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZB)I")
    public static final int method1410(boolean arg0, byte arg1) {
        field3224++;
        long var2 = class191.method1350((byte) 108);
        if (arg1 != -82) {
            method1407(10);
        }
        for (class34 var4 = arg0 ? (class34) class209.field3303.method1063(-112) : (class34) class209.field3303.method1055(18178); var4 != null; var4 = (class34) class209.field3303.method1055(18178)) {
            if (var2 > (var4.field514 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field514 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2012;
                    class195.field3160[var5] = class301.field4817[var5];
                    var4.method913(-3542);
                    return var5;
                }
                var4.method913(-3542);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3222 = arg0;
        this.field3213 = arg3;
        this.field3217 = arg5;
        this.field3214 = arg8;
        this.field3225 = arg7;
        this.field3226 = arg1;
        this.field3211 = arg9;
        this.field3216 = arg6;
        this.field3228 = arg4;
        this.field3229 = arg2;
    }
}
