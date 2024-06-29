import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class322 {

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field4307 = -1;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method1852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4312++;
        if (arg2 > 84) {
            this.method1604(arg1, arg4, arg3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I", line = 50)
    public static final int method1853(int arg0, int arg1) {
        field4308++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 <= 101) {
            return -34;
        } else {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)I", line = 69)
    public static final int method1854(int arg0, int arg1, int arg2) {
        field4299++;
        if (arg2 <= 110) {
            field4306 = -77;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 99)
    public final void method1855(byte arg0) {
        class168.field2127[this.field4307] = false;
        field4311++;
        this.method1599();
        int var2 = 39 / ((arg0 - 65) / 56);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 110)
    public static final void method1856(int arg0) {
        field4300++;
        class32.field315 = class275.method1519(true, 0.4F, 4, 8, (byte) -124, 35, 2048, 8);
        if (arg0 < 64) {
            field4306 = -115;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIIII)V", line = 122)
    public final void method1857(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1591(arg4, arg0, arg3, arg1, 1);
        int var6 = -57 % ((-arg2 - 8) / 37);
        field4304++;
    }

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V", line = 133)
    protected final void finalize() {
        field4303++;
        this.method1855((byte) 123);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 161)
    public static final void method1858(String arg0, int arg1, int arg2) {
        field4301++;
        class40 var3 = class162.method872(arg2, (byte) 92, arg1);
        var3.method190(0);
        var3.field408 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(IIIIII)V", line = 175)
    public final void method1859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1592(arg2, arg0, arg4, arg5, arg3, 1);
        field4310++;
        if (arg1 != 23059) {
            this.method1601((class402) null, (class241[]) null, false);
        }
    }

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(IIIIII)V", line = 187)
    public final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1614(arg3, arg0, arg2, arg4, arg5, 1);
        if (arg1 != -3272) {
            this.method1582((class130) null);
        }
        field4305++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZII)V", line = 212)
    public final void method1861(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4309++;
        if (arg2) {
            this.method1644(arg4, arg0, arg3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIBI)V", line = 237)
    public final void method1862(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 3) {
            this.method1561((class316) null);
        }
        field4302++;
        this.method1575(arg2, arg3, arg1, arg0, arg5, 1);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 262)
    public static final String method1863(long arg0, byte arg1) {
        if (arg1 >= -32) {
            field4306 = 40;
        }
        field4313++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class366.field5124[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lhc;)V")
    public abstract void method1635(class366 arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIZ)Llg;")
    public abstract class20 method1569(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
    public abstract void method1571(boolean arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
    public abstract void method1631(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method1642(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lue;)V")
    public abstract void method1582(class130 arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)V")
    public abstract void method1553(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "()I")
    public abstract int method1596();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[Lfs;)V")
    public abstract void method1607(int arg0, class349[] arg1);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "()V")
    public abstract void method1551();

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "()Z")
    public abstract boolean method1653();

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIIIII)Lmc;")
    public abstract class316 method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "()V")
    public abstract void method1555();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljn;Lhc;Lib;Lpf;I)V")
    public abstract void method1622(class396 arg0, class366 arg1, class247 arg2, class447 arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "()V")
    public abstract void method1646();

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "()V")
    public abstract void method1609();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([Ljn;Lib;[Lpf;I)V")
    public abstract void method1581(class396[] arg0, class247 arg1, class447[] arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "()V")
    public abstract void method1605();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1587(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIIII)V")
    public abstract void method1591(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIII)V")
    public abstract void method1648(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "()Z")
    public abstract boolean method1632();

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "()Z")
    public abstract boolean method1636();

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "()Z")
    public abstract boolean method1612();

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "()Z")
    public abstract boolean method1562();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
    public abstract void method1600(int arg0, int arg1);

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "()Z")
    public abstract boolean method1619();

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "()Lib;")
    public abstract class247 method1650();

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "()V")
    public abstract void method1584();

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "()Z")
    public abstract boolean method1598();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIII)V")
    public abstract void method1580(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "()F")
    public abstract float method1641();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([Ljn;Lhc;Lib;[Lpf;I)V")
    public abstract void method1559(class396[] arg0, class366 arg1, class247 arg2, class447[] arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "()I")
    public abstract int method1567();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljp;[Lv;Z)Lwm;")
    public abstract class298 method1601(class402 arg0, class241[] arg1, boolean arg2);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)I")
    public abstract int method1634(int arg0, int arg1);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[I[I)Lgo;")
    public abstract class175 method1593(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "()V")
    public abstract void method1638();

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIIII)V")
    public abstract void method1644(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "()I")
    public abstract int method1621();

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "()Z")
    public abstract boolean method1557();

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "()V")
    public abstract void method1613();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIILgo;II)V")
    public abstract void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class175 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)V")
    public abstract void method1603(int arg0, int arg1);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(FFF)V")
    public abstract void method1560(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "()F")
    public abstract float method1564();

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "()Z")
    public abstract boolean method1563();

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "()Z")
    public abstract boolean method1654();

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)V")
    public abstract void method1630(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "()I")
    public abstract int method1617();

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lue;")
    public abstract class130 method1595(int arg0);

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "()I")
    public abstract int method1590();

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(II)I")
    public abstract int method1620(int arg0, int arg1);

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "()V")
    public abstract void method1599();

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "()Z")
    public abstract boolean method1624();

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "()Z")
    public abstract boolean method1570();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lv;Z)Llg;")
    public abstract class20 method1633(class241 arg0, boolean arg1);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1574(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILgo;II)V")
    public abstract void method1566(int arg0, class175 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public abstract void method1627(int arg0);

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
    public abstract void method1588(int arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lmc;Lmc;FLmc;)Lmc;")
    public abstract class316 method1602(class316 arg0, class316 arg1, float arg2, class316 arg3);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lpe;IIII)Ljn;")
    public abstract class396 method1651(class390 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V")
    public abstract void method1618(int arg0);

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "()Z")
    public abstract boolean method1643();

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "()Z")
    public abstract boolean method1625();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lmc;)V")
    public abstract void method1561(class316 arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[[I[[IIII)Lbl;")
    public abstract class54 method1552(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "()I")
    public abstract int method1573();

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIII)V")
    public abstract void method1589(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1649(Canvas arg0);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
    public abstract void method1558(boolean arg0);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIIII)V")
    public abstract void method1604(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([I)V")
    public abstract void method1629(int[] arg0);

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
    public abstract void method1579(int arg0);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)V")
    public abstract void method1572(boolean arg0);

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V")
    public abstract void method1578(int arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lib;)V")
    public abstract void method1611(class247 arg0);

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "()V")
    public abstract void method1623();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "()Z")
    public abstract boolean method1585();

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIII)V")
    public abstract void method1616(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(F)V")
    public abstract void method1568(float arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([IIIII)Llg;")
    public abstract class20 method1637(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "()Lib;")
    public abstract class247 method1586();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(FF)V")
    public abstract void method1583(float arg0, float arg1);
}
