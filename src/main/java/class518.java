import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class518 extends class223 {

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lpk;")
    public class133 field7628 = new class133();

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7632;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field7633;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3084(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method3076(int arg0, byte arg1, int arg2) {
        if (arg1 > -100) {
            field7624 = 110;
        }
        field7631++;
        if ((class37.method283(arg0, 4, arg2) | (arg2 & 0x10000) != 0) || class385.method2344(arg0, arg2, 25926)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class66.method645(-20147, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method3077(int arg0, int arg1, int arg2) {
        int var3 = class6.field80[arg0][arg1][arg2];
        if (-class250.field3685 == var3) {
            return false;
        } else if (class250.field3685 == var3) {
            return true;
        } else {
            int var4 = arg1 << class527.field7754;
            int var5 = arg2 << class527.field7754;
            if (class473.method2861(var4 + 1, class131.field1899[arg0].method430(arg1, arg2), var5 + 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1 + 1, arg2), var5 + 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1 + 1, arg2 + 1), class376.field5566 + var5 - 1) && class473.method2861(var4 + 1, class131.field1899[arg0].method430(arg1, arg2 + 1), class376.field5566 + var5 - 1) && class473.method2861(class47.field517 + var4, class131.field1899[arg0].method430(arg1, arg2), var5 + 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1 + 1, arg2), class47.field517 + var5) && class473.method2861(class47.field517 + var4, class131.field1899[arg0].method430(arg1, arg2 + 1), class376.field5566 + var5 - 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1, arg2), class47.field517 + var5) && class473.method2861(class47.field517 + var4, class131.field1899[arg0].method430(arg1, arg2), class47.field517 + var5)) {
                class6.field80[arg0][arg1][arg2] = class250.field3685;
                return true;
            } else {
                class6.field80[arg0][arg1][arg2] = -class250.field3685;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([SI)[S", line = 46)
    public static final short[] method3078(short[] arg0, int arg1) {
        field7626++;
        if (arg1 >= -78) {
            method3078(null, 70);
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class201.method1410(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lr;Z)V", line = 63)
    public static final void method3079(class121 arg0, boolean arg1) {
        if ((arg0 instanceof class461)) {
            class461 var3 = (class461) arg0;
            if (var3.field6790 != null) {
                class49.method498(class435.field6375.field6328 != var3.field6328, var3, !arg1);
            }
        } else if (arg0 instanceof class364) {
            class364 var2 = (class364) arg0;
            class142.method1056(112, class435.field6375.field6328 != var2.field6328, var2);
        }
        field7629++;
        if (!arg1) {
            field7624 = -70;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V", line = 93)
    public static final void method3080(int arg0, int arg1, int arg2) {
        if (arg0 < -41) {
            field7632++;
            class215 var3 = class171.method1208(arg2, (byte) 121, 5);
            var3.method1465(-25852);
            var3.field3082 = arg1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z", line = 114)
    public static final boolean method3081(int arg0, int arg1) {
        field7630++;
        if (class251.field3693[arg1]) {
            return true;
        }
        if (arg0 >= -87) {
            method3080(-58, -51, 2);
        }
        if (!class230.field3365.method2360(arg1, 557)) {
            return false;
        }
        int var2 = class230.field3365.method2367(arg1, 28724);
        if (var2 == 0) {
            class251.field3693[arg1] = true;
            return true;
        }
        if (class123.field1803[arg1] == null) {
            class123.field1803[arg1] = new class188[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class123.field1803[arg1][var3] == null) {
                byte[] var4 = class230.field3365.method2363(var3, arg1, 110);
                if (var4 != null) {
                    class188 var5 = class123.field1803[arg1][var3] = new class188();
                    var5.field2678 = (arg1 << 16) + var3;
                    if (var4[0] != -1) {
                        throw new IllegalStateException("if1");
                    }
                    var5.method1312(new class65(var4), -122);
                }
            }
        }
        class251.field3693[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)I", line = 171)
    public static final int method3082(int arg0) {
        field7625++;
        try {
            if (class323.field4550 == 0) {
                if (class6.field77 > class437.method2644(-121) - 5000L) {
                    return 0;
                }
                class125.field1832 = class498.field7404.method2551(0, class66.field839, class310.field4421);
                class111.field1570 = class437.method2644(-97);
                class323.field4550 = 1;
            }
            if (class437.method2644(-64) > (class111.field1570 + 30000L)) {
                return class324.method2000(false, 1000);
            }
            if (class323.field4550 == 1) {
                if (class125.field1832.field6617 == 2) {
                    return class324.method2000(false, 1001);
                }
                if (class125.field1832.field6617 != 1) {
                    return -1;
                }
                class383.field5635 = new class66((Socket) class125.field1832.field6613, class498.field7404);
                class125.field1832 = null;
                int var1 = 0;
                if (class194.field2830) {
                    var1 = class352.field4883;
                }
                class472.field6970.field827 = 0;
                class472.field6970.method638(arg0 ^ 0xFC, class215.field3092.field3575);
                class472.field6970.method618(var1, (byte) 125);
                class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 127);
                class515.method3056((byte) 94);
                int var2 = class383.field5635.method647(28);
                class515.method3056((byte) 69);
                if (var2 != 0) {
                    return class324.method2000(false, var2);
                }
                class323.field4550 = 2;
            }
            if (class323.field4550 == 2) {
                if (class383.field5635.method641(arg0) < 2) {
                    return -1;
                }
                class241.field3569 = class383.field5635.method647(33);
                class241.field3569 <<= 0x8;
                class241.field3569 += class383.field5635.method647(117);
                class323.field4550 = 3;
                class148.field2072 = new byte[class241.field3569];
                class524.field7704 = 0;
            }
            if (class323.field4550 != arg0) {
                return -1;
            }
            int var3 = class383.field5635.method641(arg0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class241.field3569 - class524.field7704) {
                var3 = class241.field3569 - class524.field7704;
            }
            class383.field5635.method639(class524.field7704, (byte) 113, var3, class148.field2072);
            class524.field7704 += var3;
            if (class241.field3569 > class524.field7704) {
                return -1;
            } else if (class100.method857(false, class148.field2072)) {
                class371.field5520 = new class166[class75.field1021];
                int var4 = 0;
                for (int var5 = class53.field581; var5 <= class425.field6283; var5++) {
                    class166 var6 = class498.method2990(var5, (byte) -124);
                    if (var6 != null) {
                        class371.field5520[var4++] = var6;
                    }
                }
                class401.field5949 = 0;
                class299.field4298 = null;
                class383.field5635.method646(false);
                class383.field5635 = null;
                class148.field2072 = null;
                class417.field6159 = 0;
                class323.field4550 = 0;
                class6.field77 = class437.method2644(-128);
                return 0;
            } else {
                return class324.method2000(false, 1002);
            }
        } catch (IOException var7) {
            return class324.method2000(false, 1003);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 293)
    public static final void method3083(int arg0) {
        try {
            if (arg0 != 27616) {
                return;
            }
            Method var1 = (field7633 == null ? (field7633 = method3084("java.lang.Runtime")) : field7633).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class247.field3668 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field7627++;
    }
}
