import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class106 extends class322 {

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Z")
    public boolean field1700 = false;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    private int field1712 = -32768;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    private int field1713 = 0;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    private int field1720 = 0;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lgm;")
    private class287 field1705;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "S")
    public static short field1704 = 32767;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field1701 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "[J")
    public static long[] field1715 = new long[100];

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lmk;")
    private class284 field1721;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[I")
    public static int[] field1711;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V", line = 13)
    public static final void method714(boolean arg0, int arg1) {
        field1708++;
        if (class102.field1639.field5409 >> 7 == class230.field3854 && (class102.field1639.field5380 >> 7) == class171.field2893) {
            class230.field3854 = 0;
        }
        int var2 = class158.field2670;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 != 1398) {
            return;
        }
        while (var3 < var2) {
            class234 var4;
            long var5;
            if (arg0) {
                var4 = class102.field1639;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class112.field1791[var3] << 32;
                var4 = class75.field1215[class112.field1791[var3]];
            }
            if (var4 != null && var4.method1719((byte) -88)) {
                var4.field3915 = false;
                if ((class195.field3252 && class158.field2670 > 200 || class158.field2670 > 50) && !arg0 && var4.field5429 == var4.field5398) {
                    var4.field3915 = true;
                }
                int var7 = var4.field5380 >> 7;
                int var8 = var4.field5409 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field3905 == null || class203.field3385 < var4.field3908 || class203.field3385 >= var4.field3911) {
                        label99: {
                            if (var4.method1717(0) == 1 && (var4.field5409 & 0x7F) == 64 && (var4.field5380 & 0x7F) == 64) {
                                if (class117.field1877[var8][var7] == class260.field4321) {
                                    break label99;
                                }
                                class117.field1877[var8][var7] = class260.field4321;
                            }
                            var4.field5417 = class19.method141(var4.field5409, class203.field3387, var4.field5380, 125);
                            class85.method598(class203.field3387, var4.field5409, var4.field5380, var4.field5417, (var4.method1717(0) - 1) * 64 + 60, var4, var4.field5406, var5, var4.field5378);
                        }
                    } else {
                        var4.field3915 = false;
                        var4.field5417 = class19.method141(var4.field5409, class203.field3387, var4.field5380, 125);
                        class311.method2184(class203.field3387, var4.field5409, var4.field5380, var4.field5417, var4, var4.field5406, var5, var4.field3924, var4.field3909, var4.field3893, var4.field3920);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIII)V", line = 270)
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1709 = arg1;
        this.field1706 = arg2;
        this.field1699 = arg5 + arg6;
        this.field1702 = arg0;
        this.field1718 = arg3;
        this.field1722 = arg4;
        int var8 = class73.method540((byte) 85, this.field1702).field2329;
        if (var8 == -1) {
            this.field1700 = true;
        } else {
            this.field1700 = false;
            this.field1705 = class306.method2156(119, var8);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)V", line = 117)
    public static final void method715(int arg0, long arg1) {
        int var3 = 88 / ((-arg0 - 9) / 51);
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var5) {
        }
        field1698++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V", line = 136)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1707++;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 151)
    public static void method716(int arg0) {
        if (arg0 != 0) {
            field1715 = (long[]) null;
        }
        field1715 = null;
        field1711 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()I", line = 163)
    public final int method325() {
        field1714++;
        return this.field1712;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lfg;", line = 180)
    private final class208 method717(byte arg0) {
        if (arg0 != 52) {
            this.method325();
        }
        field1710++;
        class140 var2 = class73.method540((byte) 5, this.field1702);
        class208 var3;
        if (this.field1700) {
            var3 = var2.method1035(-1, (byte) -42);
        } else {
            var3 = var2.method1035(this.field1713, (byte) -42);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJILmk;)V", line = 218)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10) {
        field1719++;
        class208 var13 = this.method717((byte) 52);
        if (var13 != null) {
            var13.method326(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1721);
            this.field1712 = var13.method325();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 237)
    public final void method718(int arg0, int arg1) {
        field1717++;
        if (this.field1700) {
            return;
        }
        if (arg0 != 1406076455) {
            this.method316(-34, 20, -16, 5, 65);
        }
        this.field1720 += arg1;
        while (this.field1720 > this.field1705.field4898[this.field1713]) {
            this.field1720 -= this.field1705.field4898[this.field1713];
            this.field1713++;
            if (this.field1705.field4904.length <= this.field1713) {
                this.field1700 = true;
                break;
            }
        }
    }
}
