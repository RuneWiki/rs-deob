import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class243 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lnf;")
    public class130 field4329 = new class130();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lqj;")
    private static class196 field4320 = class80.method502("Loaded interfaces", -48);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lqj;")
    public static class196 field4314 = field4320;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lea;")
    public static class243 field4323 = new class243();

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field4333 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lnf;")
    private class130 field4331;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lnb;")
    public static class95 field4334;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4335;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public static final void method1649(int arg0, int arg1) {
        field4321++;
        class82 var2 = class193.field3403;
        synchronized (class193.field3403) {
            class218.field3911 = arg0;
            if (arg1 != 9492) {
                field4311 = 124;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field4314 = null;
        field4323 = null;
        field4335 = null;
        if (arg0 >= -70) {
            method1661(false, -14, null, 92, 70);
        }
        field4320 = null;
        field4334 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lnf;")
    public final class130 method1651(byte arg0) {
        field4325++;
        if (arg0 > -9) {
            return null;
        }
        class130 var2 = this.field4329.field1842;
        if (this.field4329 == var2) {
            this.field4331 = null;
            return null;
        } else {
            this.field4331 = var2.field1842;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILnf;)V")
    public final void method1652(int arg0, class130 arg1) {
        if (arg1.field1849 != null) {
            arg1.method797((byte) 109);
        }
        arg1.field1849 = this.field4329.field1849;
        arg1.field1842 = this.field4329;
        field4318++;
        if (arg0 != 26532) {
            this.method1656(28);
        }
        arg1.field1849.field1842 = arg1;
        arg1.field1842.field1849 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final void method1653(int arg0) {
        if (arg0 >= -26) {
            this.method1665(-34);
        }
        field4315++;
        while (true) {
            class130 var2 = this.field4329.field1842;
            if (this.field4329 == var2) {
                this.field4331 = null;
                return;
            }
            var2.method797((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Lnf;")
    public final class130 method1654(byte arg0) {
        field4316++;
        class130 var2 = this.field4331;
        int var3 = 5 / ((arg0 + 61) / 61);
        if (this.field4329 == var2) {
            this.field4331 = null;
            return null;
        } else {
            this.field4331 = var2.field1849;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Leb;")
    public static final class200 method1655(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field836; var4++) {
            class200 var5 = var3.field823[var4];
            if ((var5.field3554 >> 29 & 0x3L) == 2L && var5.field3549 == arg1 && var5.field3548 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lnf;")
    public final class130 method1656(int arg0) {
        if (arg0 > -1) {
            method1655(-113, -93, -66);
        }
        class130 var2 = this.field4331;
        field4328++;
        if (this.field4329 == var2) {
            this.field4331 = null;
            return null;
        } else {
            this.field4331 = var2.field1842;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            field4314 = null;
        }
        field4324++;
        int var6 = arg4 - arg0;
        int var7 = arg3 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class192.method1271(0, arg2, arg1, arg4, arg0);
            }
        } else if (var6 == 0) {
            class123.method753(arg1, (byte) 64, arg0, arg2, arg3);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class188.field3296) {
                var11 = class188.field3296;
                var10 = (class188.field3296 * var8 >> 12) + var9;
            } else if (class95.field1388 < arg2) {
                var10 = (class95.field1388 * var8 >> 12) + var9;
                var11 = class95.field1388;
            } else {
                var10 = arg0;
                var11 = arg2;
            }
            if (class93.field1361 > var10) {
                var11 = (class93.field1361 - var9 << 12) / var8;
                var10 = class93.field1361;
            } else if (class23.field291 < var10) {
                var10 = class23.field291;
                var11 = (class23.field291 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class188.field3296 > arg3) {
                var12 = class188.field3296;
                var13 = var9 + (class188.field3296 * var8 >> 12);
            } else if (class95.field1388 >= arg3) {
                var12 = arg3;
                var13 = arg4;
            } else {
                var12 = class95.field1388;
                var13 = (class95.field1388 * var8 >> 12) + var9;
            }
            if (var13 < class93.field1361) {
                var12 = (class93.field1361 - var9 << 12) / var8;
                var13 = class93.field1361;
            } else if (class23.field291 < var13) {
                var13 = class23.field291;
                var12 = (class23.field291 - var9 << 12) / var8;
            }
            class212.method1469(arg1, -1, var10, var13, var11, var12);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILbk;I)[Lqh;")
    public static final class68[] method1658(int arg0, class136 arg1, int arg2) {
        field4312++;
        int var3 = 29 / ((arg0 + 34) / 50);
        return class47.method251(7172, arg1, arg2) ? class20.method106(107) : null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Lnf;")
    public final class130 method1659(byte arg0) {
        field4322++;
        class130 var2 = this.field4329.field1849;
        if (arg0 != 70) {
            return null;
        } else if (this.field4329 == var2) {
            this.field4331 = null;
            return null;
        } else {
            this.field4331 = var2.field1849;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnf;Lnf;I)V")
    public final void method1660(class130 arg0, class130 arg1, int arg2) {
        field4313++;
        if (arg0.field1849 != null) {
            arg0.method797((byte) 116);
        }
        arg0.field1842 = arg1;
        arg0.field1849 = arg1.field1849;
        if (arg2 != -22047) {
            method1650(65);
        }
        arg0.field1849.field1842 = arg0;
        arg0.field1842.field1849 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILec;II)V")
    public static final void method1661(boolean arg0, int arg1, class178 arg2, int arg3, int arg4) {
        if (class156.field2510 >= 3) {
            class55.method298(arg1, arg4, 0, arg2.field3007, arg2.field3060);
        } else {
            ((class233) class65.field898).method1409(arg1, arg4, arg2.field3085, arg2.field2997, class65.field898.field491 / 2, class65.field898.field488 / 2, class18.field216, 256, arg2.field3007, arg2.field3060);
        }
        class86.field1271[arg3] = true;
        field4319++;
        if (arg0) {
            method1649(66, 30);
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
    public final int method1662(byte arg0) {
        if (arg0 < 88) {
            return -94;
        }
        field4317++;
        int var2 = 0;
        class130 var3 = this.field4329.field1842;
        while (this.field4329 != var3) {
            var3 = var3.field1842;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLnf;)V")
    public final void method1663(byte arg0, class130 arg1) {
        field4332++;
        if (arg1.field1849 != null) {
            arg1.method797((byte) 100);
        }
        arg1.field1842 = this.field4329.field1842;
        arg1.field1849 = this.field4329;
        arg1.field1849.field1842 = arg1;
        int var3 = 19 / ((-arg0 - 22) / 45);
        arg1.field1842.field1849 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)V")
    public static final void method1664(byte arg0) {
        if (arg0 <= 96) {
            return;
        }
        class1.field8 = 0;
        int var1 = (class102.field1477.field2085 >> 7) + class178.field3011;
        int var2 = (class102.field1477.field2081 >> 7) + class106.field1523;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class1.field8 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class1.field8 = 1;
        }
        if (class1.field8 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class1.field8 = 0;
        }
        field4330++;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Lnf;")
    public final class130 method1665(int arg0) {
        class130 var2 = this.field4329.field1842;
        field4326++;
        if (this.field4329 == var2) {
            return null;
        }
        if (arg0 != 3072) {
            method1650(-26);
        }
        var2.method797((byte) 114);
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class243() {
        this.field4329.field1842 = this.field4329;
        this.field4329.field1849 = this.field4329;
    }
}
