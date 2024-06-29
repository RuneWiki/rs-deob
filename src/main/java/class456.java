import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class456 extends class459 {

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field7046 = new String[] { method3544(method3543(",n%5\u0019q")), method3544(method3543("7y(w")), method3544(method3543("\"\"j5\"")), method3544(method3543(",n%5\u001eq")), method3544(method3543(",n%5\u001bq")), method3544(method3543(",n%5\u001aq")), method3544(method3543(",n%5\u001dq")), method3544(method3543(",n%5\u001cq")) };

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "Z")
    public static boolean field7040 = false;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "Lvn;")
    public static class330 field7039 = new class330(14, 4);

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "I")
    public static int field7044 = 0;

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "Lvn;")
    public static class330 field7045 = new class330(1, -1);

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "Lqr;")
    private class69 field7036;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static final void method3537(int arg0) {
        try {
            field7038++;
            if (class662.field9437.method245()) {
                class662.field9437.method189(class442.field6902);
                class14.method103((byte) -123);
                if (class316.field5141) {
                    class163.method1534(class442.field6902, -115);
                } else {
                    Dimension var1 = class442.field6902.getSize();
                    class662.field9437.method231(class442.field6902, var1.width, var1.height);
                }
                class662.field9437.method210(class442.field6902);
            } else {
                class679.method4942(false, (byte) 6, class623.field8996.field6379.method4132(true));
            }
            class30.method318(-116);
            if (arg0 <= 60) {
                method3537(68);
            }
            class540.field7961 = true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7046[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method3538(String arg0, int arg1, int arg2) {
        try {
            field7041++;
            if (arg1 != 14) {
                this.method3542(17, 66, null);
            }
            if (this.field7036 == null) {
                return arg0;
            } else {
                class525 var4 = (class525) this.field7036.method737((byte) -39, (long) arg2);
                return var4 == null ? arg0 : var4.field7740;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7046[3] + (arg0 == null ? field7046[1] : field7046[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILwq;)V")
    public final void method3539(int arg0, class176 arg1) {
        try {
            field7037++;
            while (true) {
                int var3 = arg1.method1645((byte) -73);
                if (var3 == 0) {
                    if (arg0 > -27) {
                        method3540((byte) -90);
                        return;
                    } else {
                        return;
                    }
                }
                this.method3542(1, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7046[0] + arg0 + ',' + (arg1 == null ? field7046[1] : field7046[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
    public static void method3540(byte arg0) {
        try {
            int var1 = -66 / ((arg0 - 65) / 38);
            field7045 = null;
            field7039 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7046[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)I")
    public final int method3541(int arg0, byte arg1, int arg2) {
        try {
            field7043++;
            if (this.field7036 == null) {
                return arg0;
            } else if (arg1 == 12) {
                class272 var4 = (class272) this.field7036.method737((byte) -39, (long) arg2);
                return var4 == null ? arg0 : var4.field4377;
            } else {
                return -118;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7046[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILwq;)V")
    private final void method3542(int arg0, int arg1, class176 arg2) {
        try {
            if (arg0 == 1) {
                field7042++;
                if (arg1 == 249) {
                    int var4 = arg2.method1645((byte) -103);
                    if (this.field7036 == null) {
                        int var5 = class90.method883((byte) 125, var4);
                        this.field7036 = new class69(var5);
                    }
                    for (int var6 = 0; var6 < var4; var6++) {
                        boolean var7 = arg2.method1645((byte) -101) == 1;
                        int var8 = arg2.method1685(false);
                        class568 var9;
                        if (var7) {
                            var9 = new class525(arg2.method1635((byte) 124));
                        } else {
                            var9 = new class272(arg2.method1622(arg0 - 18713));
                        }
                        this.field7036.method738(var9, (long) var8, -12002);
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7046[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7046[1] : field7046[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3543(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3544(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
