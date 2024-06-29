import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class242 extends class317 {

    @OriginalMember(owner = "client!af", name = "P", descriptor = "[S")
    private short[] field3453 = new short[257];

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    private int field3465 = 0;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field3451 = -1;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "[I")
    public static int[] field3461 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lkm;")
    public static class133 field3462;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
    private int[] field3449;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[I")
    private int[] field3454;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "[[I")
    private int[][] field3452;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "[[[B")
    public static byte[][][] field3458;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)Lco;", line = 5)
    public static final class280 method1657(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2875; var4++) {
            class280 var5 = var3.field2896[var4];
            if ((var5.field4203 >> 29 & 0x3L) == 2L && var5.field4204 == arg1 && var5.field4200 == arg2) {
                class237.method1633(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V", line = 31)
    private final void method1658(byte arg0) {
        field3455++;
        int var2 = this.field3465;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field3452.length - 1) && this.field3452[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3452[var5 - 1];
                int[] var7 = this.field3452[var5];
                int var8 = this.method1664(var5 - 2, (byte) -92)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = this.method1664(var5 + 1, (byte) -69)[1];
                int var12 = var9 - var8;
                int var13 = var10 + var11 - var8 - var9;
                int var14 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var16 = var14 * var14 >> 12;
                int var17 = var8 - var10 - var13;
                int var18 = (var13 * var14 >> 12) * var16 >> 12;
                int var19 = var12 * var14 >> 12;
                int var20 = var16 * var17 >> 12;
                int var21 = var10 + var19 + var18 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3453[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3452.length - 1) > var24 && var23 >= this.field3452[var24][0]; var24++) {
                }
                int[] var25 = this.field3452[var24 - 1];
                int[] var26 = this.field3452[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class257.field3805[(var27 & 0x1FE4) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3453[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; this.field3452.length - 1 > var33 && this.field3452[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field3452[var33 - 1];
                int[] var35 = this.field3452[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + var35[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3453[var31] = (short) var38;
            }
        }
        if (arg0 != -4) {
            field3461 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 213)
    public static final void method1659(int arg0, String arg1, int arg2) {
        field3457++;
        int var3 = 126 / ((81 - arg0) / 38);
        class143 var4 = class163.method1176((byte) 112, arg2, 3);
        var4.method1032((byte) 120);
        var4.field1949 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcg;II)V", line = 229)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = 102 / ((-arg1 - 17) / 40);
        field3459++;
        if (arg2 != 0) {
            return;
        }
        this.field3465 = arg0.method2219(16448);
        this.field3452 = new int[arg0.method2219(16448)][2];
        for (int var5 = 0; var5 < this.field3452.length; var5++) {
            this.field3452[var5][0] = arg0.method2220((byte) 62);
            this.field3452[var5][1] = arg0.method2220((byte) 112);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 256)
    public final void method546(int arg0) {
        if (this.field3452 == null) {
            this.field3452 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3448++;
        if (this.field3452.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3465 == 2) {
            this.method1660(-113);
        }
        if (arg0 == -21522) {
            class98.method714((byte) -64);
            this.method1658((byte) -4);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V", line = 280)
    private final void method1660(int arg0) {
        int[] var2 = this.field3452[0];
        field3450++;
        int[] var3 = this.field3452[this.field3452.length - 2];
        int[] var4 = this.field3452[1];
        int[] var5 = this.field3452[this.field3452.length - 1];
        this.field3449 = new int[] { var3[0] + var3[0] - var5[0], -var5[1] - (-var3[1] - var3[1]) };
        if (arg0 > -63) {
            field3462 = (class133) null;
        }
        this.field3454 = new int[] { var2[0] - (var4[0] - var2[0]), var2[1] - -var2[1] - var4[1] };
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[I", line = 302)
    public final int[] method140(int arg0, int arg1) {
        field3466++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -97);
        if (arg0 != 542) {
            return (int[]) null;
        }
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3453[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 346)
    public class242() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfi;", line = 354)
    public static final class74 method1661(Throwable arg0, String arg1) {
        field3456++;
        class74 var2;
        if (arg0 instanceof class74) {
            var2 = (class74) arg0;
            var2.field1026 = var2.field1026 + ' ' + arg1;
        } else {
            var2 = new class74(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Z", line = 377)
    public static final boolean method1662(int arg0, byte arg1) {
        class259 var2 = class125.method901(true, arg0);
        field3464++;
        if (var2 == null) {
            return false;
        } else if (class80.field1151 == 1 || class80.field1151 == 2 || class6.field46 == 2) {
            class252.field3611 = var2.field3817;
            class199.field2838 = var2.field3814;
            if (class6.field46 != 0) {
                class103.field1411 = class199.field2838 + 50000;
                class54.field726 = class199.field2838 + 40000;
                class129.field1780 = class54.field726;
            }
            return true;
        } else {
            String var3 = "";
            if (class6.field46 != 0) {
                var3 = ":" + (var2.field3814 + 7000);
            }
            String var4 = "";
            if (arg1 < 111) {
                return true;
            }
            if (class165.field2262 != null) {
                var4 = "/p=" + class165.field2262;
            }
            String var5 = "http://" + var2.field3817 + var3 + "/l=" + class202.field2874 + "/a=" + class169.field2297 + var4 + "/j" + (class333.field5034 ? "1" : "0") + ",o" + (class153.field2116 ? "1" : "0") + ",a2,m" + (class39.field446 ? "1" : "0");
            try {
                class329.field4968.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILlb;ZZIII)Lpn;", line = 433)
    public static final class170 method1663(int arg0, class64 arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = (arg6 << 19) + (arg4 << 17) + arg0 + (arg2 ? 65536 : 0);
        field3447++;
        long var9 = (long) var7 * 3849834839L + (long) arg5 * 3147483667L;
        class170 var11 = (class170) class333.field5014.method716(var9, false);
        if (var11 != null) {
            return var11;
        }
        class184.field2542 = false;
        class170 var12 = class151.method1097(arg2, arg0, arg6, arg1, false, arg5, arg4, arg3, (byte) -100);
        if (var12 != null && !class184.field2542) {
            class333.field5014.method721(var9, var12, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[I", line = 454)
    private final int[] method1664(int arg0, byte arg1) {
        field3463++;
        if (arg1 > -67) {
            return (int[]) null;
        } else if (arg0 < 0) {
            return this.field3454;
        } else if (arg0 < this.field3452.length) {
            return this.field3452[arg0];
        } else {
            return this.field3449;
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(B)V", line = 477)
    public static void method1665(byte arg0) {
        if (arg0 <= 62) {
            field3460 = 57;
        }
        field3462 = null;
        field3458 = (byte[][][]) null;
        field3461 = null;
    }
}
