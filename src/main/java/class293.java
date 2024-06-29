import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class293 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lhu;")
    private class76 field3916 = new class76(16);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lr;")
    private class110 field3918;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field3922 = -2;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
    public static boolean field3917 = false;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLcf;)Ljava/lang/String;", line = 6)
    public static final String method1640(byte arg0, class395 arg1) {
        field3921++;
        if (arg0 == 90) {
            return arg1.field5475 == null || arg1.field5475.length() <= 0 ? arg1.field5474 : arg1.field5474 + class205.field2782.method1176(class110.field1676, (byte) -112) + arg1.field5475;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 21)
    public final void method1641(int arg0) {
        if (arg0 <= 6) {
            return;
        }
        field3920++;
        class76 var2 = this.field3916;
        synchronized (this.field3916) {
            this.field3916.method502(0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 35)
    public final void method1642(int arg0, int arg1) {
        class76 var3 = this.field3916;
        synchronized (this.field3916) {
            this.field3916.method496(arg1, -87);
        }
        if (arg0 == -2) {
            field3914++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILng;IB)Ldd;", line = 48)
    public final class458 method1643(int arg0, int arg1, int arg2, class208 arg3, int arg4, byte arg5) {
        field3926++;
        class167[] var7 = null;
        if (arg5 != -113) {
            return null;
        }
        class400 var8 = this.method1646(arg0, arg5 ^ 0xFFFFFF8F);
        if (var8.field5506 != null) {
            var7 = new class167[var8.field5506.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class6 var10 = arg3.method1186(var8.field5506[var9], arg5 + 7121);
                var7[var9] = new class167(var10.field72, var10.field66, var10.field75, var10.field80, var10.field73, var10.field70, var10.field67, var10.field76);
            }
        }
        return new class458(var8.field5498, var7, var8.field5505, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1644(int arg0) {
        field3919++;
        if (arg0 != 0) {
            method1648(-7, (class364) null);
        }
        class468 var1 = null;
        try {
            class474 var2 = class251.field3359.method1338((byte) -128);
            while (var2.field6534 == 0) {
                class374.method2298(-28114, 1L);
            }
            if (var2.field6534 == 1) {
                var1 = (class468) var2.field6529;
                byte[] var3 = new byte[(int) var1.method2751((byte) -127)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2749(var3.length - var4, var4, var3, true);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class13.method83(arg0 ^ 0xFFFFFFFE, new class32(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2748((byte) 120);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 131)
    public final void method1645(byte arg0) {
        if (arg0 > -43) {
            this.field3918 = null;
        }
        field3924++;
        class76 var2 = this.field3916;
        synchronized (this.field3916) {
            this.field3916.method495(-91);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lwa;", line = 150)
    private final class400 method1646(int arg0, int arg1) {
        field3923++;
        class76 var3 = this.field3916;
        class400 var5;
        synchronized (this.field3916) {
            if (arg1 != 0) {
                return null;
            }
            var5 = (class400) this.field3916.method493((byte) 19, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field3918.method702((byte) -86, arg0, 29);
        class400 var7 = new class400();
        if (var6 != null) {
            var7.method2427(new class32(var6), (byte) -52);
        }
        class76 var8 = this.field3916;
        synchronized (this.field3916) {
            this.field3916.method505((long) arg0, var7, 19);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V", line = 181)
    public static final void method1647(int arg0, int arg1) {
        field3925++;
        if (arg0 > -24) {
            field3917 = false;
        }
        class106 var2 = class250.method1400(9, -21, arg1);
        var2.method659(-61);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILwm;)V", line = 200)
    public static final void method1648(int arg0, class364 arg1) {
        field3915++;
        if (class383.field5275.method644((byte) 99) == 0) {
            return;
        }
        if (class222.field2958 == 0) {
            for (class99 var4 = (class99) class383.field5275.method652((byte) 37); var4 != null; var4 = (class99) class383.field5275.method653(79)) {
                class175.field2385.method1567(var4.field1448, class490.field6832, var4.field1446, arg1, false, var4.field1439, false, var4.field1443 ? class233.field3103.field6783 : null, var4.field1441, arg1, var4.field1445, (byte) 10);
                var4.method2614((byte) -75);
            }
            class480.method2803((byte) -91);
        } else {
            if (class163.field2269 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class163.field2269 = class364.method2216(87, 0, class251.field3359, class248.field3300, var2, 0);
                class62.field822 = class163.field2269.method2084(class330.method1836(arg0 + 2, 0, class51.field680, class172.field2358), class325.method1823(class473.field6525, class51.field680, 0), true);
            }
            for (class99 var3 = (class99) class383.field5275.method652((byte) 37); var3 != null; var3 = (class99) class383.field5275.method653(65)) {
                class175.field2385.method1567(var3.field1448, class62.field822, var3.field1446, arg1, false, var3.field1439, false, var3.field1443 ? class233.field3103.field6783 : null, var3.field1441, class163.field2269, var3.field1445, (byte) 10);
                var3.method2614((byte) -102);
            }
        }
        if (arg0 != -2) {
            field3917 = false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 255)
    public class293(class329 arg0, int arg1, class110 arg2) {
        this.field3918 = arg2;
        this.field3918.method694(29, (byte) 119);
    }
}
