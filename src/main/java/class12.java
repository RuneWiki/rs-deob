import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class12 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[I")
    public static int[] field229 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static volatile int field230 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lub;")
    public static class227 field240 = class257.method1749("Lade Benutzeroberfl-=che )2 ", 17263);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field237;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z")
    public static final boolean method55(int arg0, int arg1) {
        if (arg1 != 2) {
            method55(51, 91);
        }
        field232++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -4) {
            field230 = -24;
        }
        field233++;
        if (arg1 < 0 || arg3 < 0 || arg1 >= 103 || arg3 >= 103) {
            return;
        }
        if (arg2 == 0) {
            class50 var8 = class92.method542(arg4, arg1, arg3);
            if (var8 != null) {
                int var9 = (int) (var8.field879 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 2) {
                    var8.field886 = new class47(var9, 2, arg0 + 4, arg4, arg1, arg3, arg6, false, var8.field886);
                    var8.field880 = new class47(var9, 2, arg0 + 1 & 0x3, arg4, arg1, arg3, arg6, false, var8.field880);
                } else {
                    var8.field886 = new class47(var9, arg7, arg0, arg4, arg1, arg3, arg6, false, var8.field886);
                }
            }
        }
        if (arg2 == 1) {
            class78 var10 = class213.method1355(arg4, arg1, arg3);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field1378 >>> 32);
                if (arg7 == 4 || arg7 == 5) {
                    var10.field1362 = new class47(var11, 4, arg0, arg4, arg1, arg3, arg6, false, var10.field1362);
                } else if (arg7 == 6) {
                    var10.field1362 = new class47(var11, 4, arg0 + 4, arg4, arg1, arg3, arg6, false, var10.field1362);
                } else if (arg7 == 7) {
                    var10.field1362 = new class47(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg1, arg3, arg6, false, var10.field1362);
                } else if (arg7 == 8) {
                    var10.field1362 = new class47(var11, 4, arg0 + 4, arg4, arg1, arg3, arg6, false, var10.field1362);
                    var10.field1373 = new class47(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg1, arg3, arg6, false, var10.field1373);
                }
            }
        }
        if (arg2 == 2) {
            if (arg7 == 11) {
                arg7 = 10;
            }
            class230 var12 = class25.method123(arg4, arg1, arg3);
            if (var12 != null) {
                var12.field4021 = new class47((int) (var12.field4029 >>> 32) & Integer.MAX_VALUE, arg7, arg0, arg4, arg1, arg3, arg6, false, var12.field4021);
            }
        }
        if (arg2 != 3) {
            return;
        }
        class133 var13 = class98.method606(arg4, arg1, arg3);
        if (var13 != null) {
            var13.field2304 = new class47((int) (var13.field2312 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg4, arg1, arg3, arg6, false, var13.field2304);
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)J")
    public static final synchronized long method57(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 > -74) {
            return -32L;
        }
        field231++;
        if (var1 < class141.field2438) {
            class19.field326 += class141.field2438 - var1;
        }
        class141.field2438 = var1;
        return class19.field326 + var1;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static void method58(int arg0) {
        field237 = null;
        if (arg0 != -9) {
            field240 = null;
        }
        field240 = null;
        field229 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V")
    public static final void method59(boolean arg0, byte arg1) {
        if (arg1 == 112) {
            field241++;
            class225.method1422((byte) -75, class49.field867, arg0, class208.field3538, class116.field2131);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public static final void method60(int arg0, int arg1) {
        field235++;
        if (class184.field3139 == arg0) {
            return;
        }
        if (class184.field3139 == 0) {
            class215.method1363((byte) 33);
        }
        int var2 = 44 / ((36 - arg1) / 61);
        boolean var3 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 40) {
            class169.method1041(false, class91.field1546, class91.field1564);
        }
        if (arg0 != 40 && class34.field581 != null) {
            class34.field581.method97(0);
            class34.field581 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class108.field2011 = 0;
            class211.field3569 = 0;
            class88.field1533 = 0;
            class65.field1186 = 1;
            class138.field2405 = 1;
            class184.method1176(1);
        }
        if (arg0 == 5) {
            class219.method1387(class94.field1639, 1);
        } else {
            class256.method1741(255);
        }
        boolean var4 = class184.field3139 == 5 || class184.field3139 == 10 || class184.field3139 == 28;
        if (var3 != var4) {
            if (var3) {
                class13.field248 = class195.field3320;
                if (class179.field3072 == 0) {
                    class225.method1416(0, 2);
                } else {
                    class29.method148(255, class14.field270, false, 2, class195.field3320, 0, false);
                }
                class192.method1223(false, true);
            } else {
                class225.method1416(0, 2);
                class192.method1223(true, true);
            }
        }
        class184.field3139 = arg0;
    }
}
