import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 extends class174 {

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    private int field1313 = 0;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field1309 = -32768;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    private int field1316 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Z")
    private boolean field1321 = false;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Z")
    public boolean field1308 = false;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lcm;")
    private class194 field1332;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lkh;")
    public static class14[] field1320 = new class14[2048];

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Ljf;")
    public static class229 field1311 = class212.method1457((byte) 97, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Ljf;")
    public static class229 field1319 = class212.method1457((byte) 121, ":assistreq:");

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Lki;")
    private class164 field1331;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "Lek;")
    public static class185 field1330;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V", line = 8)
    public final void method509(int arg0, byte arg1) {
        field1310++;
        int var3 = 89 % ((-arg1 - 28) / 43);
        if (this.field1308) {
            return;
        }
        this.field1313 += arg0;
        while (this.field1313 > this.field1332.field3384[this.field1316]) {
            this.field1313 -= this.field1332.field3384[this.field1316];
            this.field1316++;
            if (this.field1316 >= this.field1332.field3366.length) {
                this.field1308 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lrl;", line = 40)
    private final class196 method510(int arg0) {
        field1314++;
        class224 var2 = class66.method492(8, this.field1326);
        class196 var3;
        if (this.field1308) {
            var3 = var2.method1545(-1, (byte) 103);
        } else {
            var3 = var2.method1545(this.field1316, (byte) 103);
        }
        if (arg0 != -1) {
            method511(-51, 36, 121, 50);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I", line = 65)
    public final int method201() {
        field1323++;
        return this.field1309;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V", line = 74)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1324++;
        if (!this.field1321) {
            class196 var6 = this.method510(-1);
            if (var6 == null) {
                return;
            }
            this.method512((byte) 33, var6);
        }
        if (this.field1331 != null) {
            this.field1331.method1108(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIII)V", line = 306)
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1327 = arg5 + arg6;
        this.field1328 = arg3;
        this.field1329 = arg1;
        this.field1307 = arg4;
        this.field1326 = arg0;
        this.field1315 = arg2;
        int var8 = class66.method492(8, this.field1326).field3829;
        if (var8 == -1) {
            this.field1308 = true;
        } else {
            this.field1308 = false;
            this.field1332 = class280.method1965(var8, -82);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILki;)V", line = 116)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class164 arg10) {
        class196 var13 = this.method510(-1);
        field1325++;
        if (var13 != null) {
            this.method512((byte) 33, var13);
            var13.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1331);
            this.field1309 = var13.method201();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)Z", line = 143)
    public static final boolean method511(int arg0, int arg1, int arg2, int arg3) {
        if (class268.method1889(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class47.method404(var4 + 1, class132.field2328[arg0][arg1][arg2] + arg3, var5 + 1) && class47.method404(var4 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class47.method404(var4 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class47.method404(var4 + 1, class132.field2328[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLrl;)V", line = 158)
    private final void method512(byte arg0, class196 arg1) {
        field1318++;
        if (arg0 != 33) {
            this.method512((byte) 112, (class196) null);
        }
        if (class108.field1900) {
            class239 var3 = (class239) arg1;
            if ((this.field1331 == null || this.field1331.field2783) && (var3.field4203 != null || var3.field4191 != null)) {
                this.field1331 = new class164(class199.field3475, 1, 1);
            }
            if (this.field1331 != null) {
                this.field1331.method1122(var3.field4203, var3.field4191, false, var3.field4186, var3.field4192, var3.field4214);
            }
        } else {
            class32 var4 = (class32) arg1;
            if ((this.field1331 == null || this.field1331.field2783) && (var4.field560 != null || var4.field540 != null)) {
                this.field1331 = new class164(class199.field3475, 1, 1);
            }
            if (this.field1331 != null) {
                this.field1331.method1122(var4.field560, var4.field540, false, var4.field553, var4.field571, var4.field561);
            }
        }
        this.field1321 = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 211)
    public static void method513(byte arg0) {
        field1320 = null;
        field1311 = null;
        field1319 = null;
        if (arg0 == -60) {
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V", line = 229)
    public static final void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -1781369264) {
            return;
        }
        field1322++;
        if (class108.field1900) {
            int var8 = arg2 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = class44.field808 + ((class238.field4163 - class44.field808) * var8 / 100);
            arg4 = arg4 * var9 >> 8;
        }
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = 2048 - arg6 & 0x7FF;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg4;
        if (var10 != 0) {
            int var15 = class227.field3911[var10];
            int var16 = class227.field3896[var10];
            var13 = -arg4 * var16 >> 16;
            var14 = arg4 * var15 >> 16;
        }
        if (var11 != 0) {
            int var17 = class227.field3896[var11];
            var12 = var14 * var17 >> 16;
            int var18 = class227.field3911[var11];
            var14 = var14 * var18 >> 16;
        }
        class243.field4301 = arg5 - var14;
        class174.field3043 = arg6;
        class107.field1881 = arg0 - var13;
        class203.field3550 = arg7;
        class97.field1721 = arg1 - var12;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 292)
    public static final void method515(int arg0, int arg1) {
        field1312++;
        class111.field1951.method231((byte) 113, arg1);
        if (arg0 != 1) {
            field1317 = 59;
        }
        class118.field2101.method231((byte) 113, arg1);
        class183.field3159.method231((byte) 113, arg1);
    }
}
