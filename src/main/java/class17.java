import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 extends class191 {

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field326 = -1;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    private int field328 = 128;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    private int field336 = 0;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    private int field340 = 128;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    private int field353 = 0;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    private int field350 = 0;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Ldd;")
    private static class35 field332 = class180.method1196((byte) -7, "Loading sprites )2 ");

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Z")
    public static volatile boolean field335 = true;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static volatile int field343 = 0;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "Ldd;")
    private static class35 field341 = class180.method1196((byte) 126, "Please remove ");

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "Ldd;")
    public static class35 field346 = field341;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Ldd;")
    public static class35 field333 = field332;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Ldd;")
    public static class35 field331 = field341;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Lv;")
    public static class197 field344;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[S")
    private short[] field342;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[S")
    private short[] field345;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "[S")
    private short[] field348;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "[S")
    private short[] field349;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILce;I)V")
    private final void method150(int arg0, class26 arg1, int arg2) {
        field338++;
        if (arg2 < 68) {
            return;
        }
        if (arg0 == 1) {
            this.field327 = arg1.method256((byte) -78);
        } else if (arg0 == 2) {
            this.field326 = arg1.method256((byte) -78);
        } else if (arg0 == 4) {
            this.field328 = arg1.method256((byte) -78);
        } else if (arg0 == 5) {
            this.field340 = arg1.method256((byte) -78);
        } else if (arg0 == 6) {
            this.field336 = arg1.method256((byte) -78);
        } else if (arg0 == 7) {
            this.field350 = arg1.method221(-110);
        } else if (arg0 == 8) {
            this.field353 = arg1.method221(-91);
        } else if (arg0 == 40) {
            int var6 = arg1.method221(-117);
            this.field345 = new short[var6];
            this.field348 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field345[var7] = (short) arg1.method256((byte) -78);
                this.field348[var7] = (short) arg1.method256((byte) -78);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method221(-126);
            this.field342 = new short[var4];
            this.field349 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field342[var5] = (short) arg1.method256((byte) -78);
                this.field349[var5] = (short) arg1.method256((byte) -78);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Lia;")
    public final class81 method151(int arg0, byte arg1) {
        if (arg1 >= -114) {
            method154(99, -81, -116);
        }
        field347++;
        class81 var3 = (class81) class105.field2353.method817(true, (long) this.field330);
        if (var3 == null) {
            class16 var4 = class16.method136(class35.field708, this.field327, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field345 != null) {
                for (int var5 = 0; var5 < this.field345.length; var5++) {
                    var4.method144(this.field345[var5], this.field348[var5]);
                }
            }
            if (this.field342 != null) {
                for (int var6 = 0; var6 < this.field342.length; var6++) {
                    var4.method134(this.field342[var6], this.field349[var6]);
                }
            }
            var3 = var4.method142(this.field350 + 64, this.field353 + 850, -30, -50, -30, true, true);
            class105.field2353.method816(var3, (long) this.field330, 16);
        }
        class81 var7;
        if (this.field326 == -1 || arg0 == -1) {
            var7 = var3.method607(true);
        } else {
            var7 = class160.method1070((byte) -55, this.field326).method466(arg0, var3, 120);
        }
        if (this.field328 != 128 || this.field340 != 128) {
            var7.method613(this.field328, this.field340, this.field328);
        }
        if (this.field336 != 0) {
            if (this.field336 == 90) {
                var7.method612();
            }
            if (this.field336 == 180) {
                var7.method612();
                var7.method612();
            }
            if (this.field336 == 270) {
                var7.method612();
                var7.method612();
                var7.method612();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static void method152(int arg0) {
        field346 = null;
        field341 = null;
        field333 = null;
        field332 = null;
        field344 = null;
        field331 = null;
        if (arg0 != 0) {
            method159((byte) -13);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILfd;)V")
    public static final void method153(int arg0, int arg1, int arg2, class55 arg3) {
        field352++;
        if (class34.field702 != 0 && class34.field702 != 3) {
            return;
        }
        int var4 = arg2 - arg3.field1249 / 2;
        int var5 = class90.field2003 + class2.field40 & 0x7FF;
        int var6 = class11.field201[var5];
        int var7 = class11.field211[var5];
        int var8 = (class67.field1561 + 256) * var6 >> 8;
        int var9 = (class67.field1561 + 256) * var7 >> 8;
        int var10 = arg0 - arg3.field1329 / 2;
        int var11 = var9 * var10 + var4 * var8 >> 11;
        int var12 = class71.field1704.field1664 + var11 >> 7;
        int var13 = var8 * var10 - var4 * var9 >> 11;
        int var14 = class71.field1704.field1676 - var13 >> 7;
        boolean var15 = class55.method476(false, class71.field1704.field1605[0], 0, 0, true, var12, var14, 1, 0, class71.field1704.field1603[0], 0, 0);
        if (var15) {
            class1.field11.method257((byte) 126, var4);
            class1.field11.method257((byte) 126, var10);
            class1.field11.method264(class2.field40, -122);
            class1.field11.method257((byte) 126, 57);
            class1.field11.method257((byte) 126, class90.field2003);
            class1.field11.method257((byte) 126, class67.field1561);
            class1.field11.method257((byte) 126, 89);
            class1.field11.method264(class71.field1704.field1664, -103);
            class1.field11.method264(class71.field1704.field1676, -99);
            class1.field11.method257((byte) 126, class71.field1707);
            class1.field11.method257((byte) 126, 63);
        }
        if (arg1 >= -125) {
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)Lnb;")
    public static final class127 method154(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        return var3 == null || var3.field1230 == null ? null : var3.field1230;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lce;I)V")
    public final void method155(class26 arg0, int arg1) {
        field334++;
        if (arg1 != 12784) {
            return;
        }
        while (true) {
            int var3 = arg0.method221(-123);
            if (var3 == 0) {
                return;
            }
            this.method150(var3, arg0, 71);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)Z")
    public static final boolean method156(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class40.field889 * arg2 + class137.field2922 * arg0 >> 16;
        int var5 = class137.field2922 * arg2 - class40.field889 * arg0 >> 16;
        int var6 = class201.field4030 * var5 + class1.field13 * arg1 >> 16;
        int var7 = class201.field4030 * arg1 - class1.field13 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class137.field2931;
            int var9 = (var7 << 9) / var6 + class176.field3590;
            return var8 >= class120.field2637 && var8 <= class30.field608 && var9 >= class39.field857 && var9 <= class109.field2420;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILlc;Llc;IIJ)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, class110 arg4, class110 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class22 var10 = new class22();
        var10.field444 = arg8;
        var10.field449 = arg1 * 128 + 64;
        var10.field454 = arg2 * 128 + 64;
        var10.field451 = arg3;
        var10.field448 = arg4;
        var10.field446 = arg5;
        var10.field441 = arg6;
        var10.field440 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class191.field3853[var11][arg1][arg2] == null) {
                class191.field3853[var11][arg1][arg2] = new class54(var11, arg1, arg2);
            }
        }
        class191.field3853[arg0][arg1][arg2].field1210 = var10;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static final void method158(int arg0) {
        int[] var1 = new int[class121.field2664];
        int var2 = 0;
        for (int var3 = 0; var3 < class121.field2664; var3++) {
            class46 var5 = class207.method1370((byte) -73, var3);
            if (var5.field1038 >= 0 || var5.field1022 >= 0) {
                var1[var2++] = var3;
            }
        }
        field351++;
        class175.field3577 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class175.field3577[var4] = var1[var4];
        }
        if (arg0 <= 52) {
            field333 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        class14 var1 = (class14) class167.field3371.method1232(arg0 + 25848);
        if (arg0 != -17) {
            field344 = null;
        }
        while (var1 != null) {
            if (var1.field261 != null) {
                class88.field1958.method982(var1.field261);
                var1.field261 = null;
            }
            if (var1.field258 != null) {
                class88.field1958.method982(var1.field258);
                var1.field258 = null;
            }
            var1 = (class14) class167.field3371.method1238(22622);
        }
        field339++;
        class167.field3371.method1230(-13057);
    }
}
