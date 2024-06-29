import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class436 extends class5 {

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field6599 = new String[100];

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field6598;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field6603;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field6604;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field6605;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/awt/Component;Z)Leb;")
    public static final class448 method2648(boolean arg0, Component arg1, boolean arg2) {
        field6601++;
        if (!arg0) {
            method2648(true, null, true);
        }
        try {
            Constructor var3 = Class.forName("dn").getDeclaredConstructor(field6604 == null ? (field6604 = method2653("java.awt.Component")) : field6604, Boolean.TYPE);
            return (class448) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class429(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6597++;
        if (arg7 != -83) {
            field6599 = null;
        }
        if (arg2 < 0 || arg1 < 0 || (class398.field6071 - 1) <= arg2 || (class528.field7734 - 1) <= arg1) {
            return;
        }
        if (class443.field6672 == null) {
            return;
        }
        if (arg0 == 0) {
            class68 var8 = (class68) class309.method1938(arg3, arg2, arg1);
            class68 var9 = (class68) class80.method544(arg3, arg2, arg1);
            if (var8 != null && arg4 != 2) {
                if ((var8 instanceof class521)) {
                    ((class521) var8).field7672.method281(-6, arg5);
                } else {
                    class159.method1030(arg0, arg5, arg2, var8.method338(105), arg1, arg3, arg6, arg4, 1);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class521) {
                    ((class521) var9).field7672.method281(arg7 ^ 0x57, arg5);
                    return;
                }
                class159.method1030(arg0, arg5, arg2, var9.method338(126), arg1, arg3, arg6, arg4, arg7 ^ 0xFFFFFFAC);
                return;
            }
            return;
        }
        if (arg0 == 1) {
            class68 var10 = (class68) class307.method1926(arg3, arg2, arg1);
            if (var10 != null) {
                if (var10 instanceof class498) {
                    ((class498) var10).field7335.method281(arg7 + 77, arg5);
                    return;
                }
                int var11 = var10.method338(105);
                if (arg4 != 4 && arg4 != 5) {
                    if (arg4 == 6) {
                        class159.method1030(arg0, arg5, arg2, var11, arg1, arg3, arg6 + 4, 4, arg7 ^ 0xFFFFFFAC);
                        return;
                    }
                    if (arg4 == 7) {
                        class159.method1030(arg0, arg5, arg2, var11, arg1, arg3, (arg6 + 2 & 0x3) + 4, 4, 1);
                    } else if (arg4 == 8) {
                        class159.method1030(arg0, arg5, arg2, var11, arg1, arg3, arg6 + 4, 4, 1);
                        class159.method1030(arg0, arg5, arg2, var11, arg1, arg3, (arg6 + 2 & 0x3) + 4, 4, arg7 ^ 0xFFFFFFAC);
                        return;
                    }
                    return;
                }
                class159.method1030(arg0, arg5, arg2, var11, arg1, arg3, arg6, 4, 1);
                return;
            }
            return;
        }
        if (arg0 != 2) {
            if (arg0 == 3) {
                class68 var12 = (class68) class471.method2823(arg3, arg2, arg1);
                if (var12 != null) {
                    if (!(var12 instanceof class41)) {
                        class159.method1030(arg0, arg5, arg2, var12.method338(arg7 + 206), arg1, arg3, arg6, arg4, 1);
                        return;
                    }
                    ((class41) var12).field602.method281(arg7 + 77, arg5);
                    return;
                }
            }
            return;
        }
        class68 var13 = (class68) class172.method1169(arg3, arg2, arg1, field6605 == null ? (field6605 = method2653("jt")) : field6605);
        if (var13 == null) {
            return;
        }
        if (arg4 == 11) {
            arg4 = 10;
        }
        if (var13 instanceof class520) {
            ((class520) var13).field7636.method281(-6, arg5);
            return;
        }
        class159.method1030(arg0, arg5, arg2, var13.method338(118), arg1, arg3, arg6, arg4, arg7 ^ 0xFFFFFFAC);
        return;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method2650(int arg0) {
        class225.field3116.method909(5, arg0 + 10098);
        field6602++;
        class306.field4441.method960(5, 1);
        class183.field2487.method1427(32, 5);
        class432.field6575.method1876(false, 5);
        class137.field1834.method1625(false, 5);
        class103.field1489.method1591(arg0 ^ 0xFFFF877A, 5);
        class201.field2707.method484(0, 5);
        class239.field3360.method2837(5, (byte) -76);
        if (arg0 != -30848) {
            return;
        }
        class102.field1481.method198(5, 64);
        class431.field6567.method186((byte) 6, 5);
        class509.field7483.method1555(32, 5);
        class509.field7484.method1853(arg0 + 30855, 5);
        class244.field3413.method971(5, -25104);
        class83.field1218.method3119(0, 5);
        class529.field7758.method1579((byte) 77, 5);
        class332.field5172.method2211(5, arg0 ^ 0xFFFF87EE);
        class182.field2469.method2283(true, 5);
        class448.field6743.method2175(5, arg0 + 30912);
        class77.field1120.method2963(5, arg0 + 30852);
        class319.field4623.method862(true, 5);
        class370.method2348(10, 5);
        class281.method1798(50, false);
        class82.method558(5, (byte) 126);
        class330.method2130(arg0 + 30757, 5);
        class359.field5512.method2140(-112, 5);
        class172.field2318.method2140(-124, 5);
        class317.field4604.method2140(-117, 5);
        class10.field177.method2140(-123, 5);
        class343.field5307.method2140(-128, 5);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method2651(byte arg0) {
        field6599 = null;
        if (arg0 != -20) {
            field6599 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2652(String arg0, byte arg1) {
        if (arg1 >= -68) {
            return 101;
        } else {
            field6600++;
            return arg0.length() + 1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2653(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
