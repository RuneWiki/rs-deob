import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class49 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lon;")
    private class80 field742 = null;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
    private boolean field751;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Z")
    private boolean field755;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lwn;")
    private class31 field759;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Ldg;")
    public static class346 field754 = new class346();

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Z")
    public static boolean field778 = false;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Ljava/lang/Object;")
    private Object[] field744;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field768;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z", line = 5)
    public final boolean method429(int arg0, int arg1, int arg2) {
        field756++;
        if (!this.method434(arg0, arg1, -1)) {
            return false;
        } else if (this.field768[arg1] != null && this.field768[arg1][arg0] != null) {
            return true;
        } else if (arg2 != 104) {
            return false;
        } else if (this.field744[arg1] == null) {
            this.method456(arg1, arg2 - 2522);
            return this.field744[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)[I", line = 31)
    public final int[] method430(int arg0, byte arg1) {
        field774++;
        if (arg1 >= -16) {
            this.method432(71, false);
        }
        if (!this.method449(arg0, 53)) {
            return null;
        }
        int[] var3 = this.field742.field1302[arg0];
        if (var3 == null) {
            var3 = new int[this.field742.field1310[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method431(boolean arg0) {
        if (class218.field3632 != null && class218.field3632.field2036 + 64 - (class218.field3632.method987(3047) * 64) >> 7 == class338.field5408 && class218.field3632.field1985 - (class218.field3632.method987(3047) * 64 - 64) >> 7 == class332.field5287) {
            class338.field5408 = 0;
        }
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < 104) {
            for (int var2 = 0; var2 < 104; var2++) {
                class332.field5284[var1][var2] = 0;
            }
            var1++;
        }
        field761++;
        for (int var3 = 0; var3 < class291.field4664; var3++) {
            class205 var4 = class135.field2359[class119.field2064[var3]];
            if (var4 != null) {
                var4.field1954 = false;
            }
        }
        for (int var5 = 0; var5 < class191.field3200; var5++) {
            class278 var6 = class320.field5071[class33.field468[var5]];
            if (var6 != null) {
                var6.field1954 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)Z", line = 123)
    public final boolean method432(int arg0, boolean arg1) {
        field767++;
        if (arg1) {
            this.field751 = false;
        }
        if (!this.method444((byte) -54)) {
            return false;
        } else if (this.field742.field1311.length == 1) {
            return this.method429(arg0, 0, 104);
        } else if (!this.method449(arg0, 51)) {
            return false;
        } else if (this.field742.field1311[arg0] == 1) {
            return this.method429(0, arg0, 104);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 151)
    public final int method433(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method436((int[]) null, -51, -21);
        }
        field738++;
        if (this.method444((byte) -119)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field742.field1314.method1993(1, class28.method253(-1, var3));
            return this.method439(100, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z", line = 168)
    private final boolean method434(int arg0, int arg1, int arg2) {
        field747++;
        if (!this.method444((byte) -125)) {
            return false;
        } else if (~arg1 <= arg2 && arg0 >= 0 && this.field742.field1311.length > arg1 && arg0 < this.field742.field1311[arg1]) {
            return true;
        } else if (class198.field3390) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 190)
    public final boolean method435(int arg0, String arg1, String arg2) {
        field770++;
        if (!this.method444((byte) 113)) {
            return false;
        }
        if (arg0 != -7286) {
            this.method441(false, -6, -113);
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field742.field1314.method1993(1, class28.method253(-1, var4));
        if (this.method449(var6, 48)) {
            int var7 = this.field742.field1307[var6].method1993(1, class28.method253(-1, var5));
            return this.method429(var7, var6, 104);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)Z", line = 215)
    private final boolean method436(int[] arg0, int arg1, int arg2) {
        field776++;
        if (!this.method449(arg1, 106)) {
            return false;
        } else if (arg2 != -12036) {
            return true;
        } else if (this.field744[arg1] == null) {
            return false;
        } else {
            int var4 = this.field742.field1310[arg1];
            int[] var5 = this.field742.field1302[arg1];
            boolean var6 = true;
            if (this.field768[arg1] == null) {
                this.field768[arg1] = new Object[this.field742.field1311[arg1]];
            }
            Object[] var7 = this.field768[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class247.method1736(true, this.field744[arg1], 15997);
                class336 var11 = new class336(var10);
                var11.method2360(false, 5, arg0, var11.field5342.length);
            } else {
                var10 = class247.method1736(false, this.field744[arg1], 15997);
            }
            byte[] var12;
            try {
                var12 = class147.method1173((byte) 97, var10);
            } catch (RuntimeException var31) {
                throw class140.method1140(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class37.method323(arg2 + 12036, var10, var10.length) + "," + class37.method323(0, var10, var10.length - 2) + "," + this.field742.field1301[arg1] + "," + this.field742.field1320);
            }
            if (this.field755) {
                this.field744[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var4 * var15 * 4;
                int[] var17 = new int[var4];
                class336 var18 = new class336(var12);
                var18.field5353 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var18.method2338((byte) 117);
                        var17[var21] += var20;
                        if (var5 == null) {
                        }
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field5353 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method2338((byte) 79);
                        class345.method2417(var12, var24, var22[var27], var17[var27], var26);
                        var17[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field751) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class346.method2430(-128, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field751) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class346.method2430(arg2 + 11908, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 408)
    public final int method437(byte arg0, String arg1) {
        field758++;
        if (!this.method444((byte) -63)) {
            return -1;
        } else if (arg0 == -33) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field742.field1314.method1993(arg0 ^ 0xFFFFFFDE, class28.method253(-1, var3));
            return this.method449(var4, arg0 ^ 0xFFFFFFC0) ? var4 : -1;
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 435)
    public final void method438(int arg0, String arg1) {
        field739++;
        if (this.method444((byte) 72)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field742.field1314.method1993(1, class28.method253(arg0, var3));
            this.method447((byte) -33, var4);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 452)
    private final int method439(int arg0, int arg1) {
        field765++;
        if (!this.method449(arg1, 114)) {
            return 0;
        } else if (this.field744[arg1] == null) {
            return arg0 == 100 ? this.field759.method285(-104, arg1) : 107;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I", line = 469)
    public final int method440(byte arg0) {
        field777++;
        if (!this.method444((byte) -128)) {
            return 0;
        }
        if (arg0 != 11) {
            field754 = (class346) null;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field744.length; var4++) {
            if (this.field742.field1310[var4] > 0) {
                var2 += 100;
                var3 += this.method439(100, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII)[B", line = 511)
    public final byte[] method441(boolean arg0, int arg1, int arg2) {
        field753++;
        return arg0 ? (byte[]) null : this.method451(arg1, arg2, false, (int[]) null);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lwn;ZZ)V", line = 924)
    public class49(class31 arg0, boolean arg1, boolean arg2) {
        this.field751 = arg2;
        this.field755 = arg1;
        this.field759 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)[B", line = 531)
    public final byte[] method442(int arg0, int arg1, boolean arg2) {
        field749++;
        if (!this.method434(arg0, arg1, -1)) {
            return null;
        }
        if (this.field768[arg1] == null || this.field768[arg1][arg0] == null) {
            boolean var4 = this.method436((int[]) null, arg1, -12036);
            if (!var4) {
                this.method456(arg1, -2418);
                boolean var5 = this.method436((int[]) null, arg1, -12036);
                if (!var5) {
                    return null;
                }
            }
        }
        if (!arg2) {
            this.field759 = (class31) null;
        }
        return class247.method1736(false, this.field768[arg1][arg0], 15997);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I", line = 569)
    public final int method443(int arg0) {
        field741++;
        if (arg0 != -2065) {
            field778 = true;
        }
        if (!this.method444((byte) 127)) {
            throw new IllegalStateException("");
        }
        return this.field742.field1320;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z", line = 585)
    private final boolean method444(byte arg0) {
        int var2 = 69 % ((arg0 - 4) / 42);
        field740++;
        if (this.field742 == null) {
            this.field742 = this.field759.method289(255);
            if (this.field742 == null) {
                return false;
            }
            this.field768 = new Object[this.field742.field1300][];
            this.field744 = new Object[this.field742.field1300];
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V", line = 612)
    public final void method445(int arg0, int arg1) {
        int var3 = -112 % ((24 - arg1) / 50);
        field745++;
        if (this.method449(arg0, 127) && this.field768 != null) {
            this.field768[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 628)
    public final boolean method446(String arg0, int arg1) {
        field772++;
        if (this.method444((byte) -110)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field742.field1314.method1993(1, class28.method253(arg1 - 1, var3));
            return arg1 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V", line = 650)
    private final void method447(byte arg0, int arg1) {
        this.field759.method286((byte) 54, arg1);
        if (arg0 > -19) {
            this.method454(-86);
        }
        field743++;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)Z", line = 663)
    public final boolean method448(int arg0, int arg1) {
        field748++;
        if (!this.method449(arg0, 116)) {
            return false;
        } else if (this.field744[arg0] == null) {
            this.method456(arg0, arg1 - 5556);
            if (this.field744[arg0] == null) {
                if (arg1 != 3138) {
                    this.field742 = (class80) null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)Z", line = 686)
    private final boolean method449(int arg0, int arg1) {
        if (arg1 <= 25) {
            this.method438(59, (String) null);
        }
        field750++;
        if (!this.method444((byte) 117)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field742.field1311.length && this.field742.field1311[arg0] != 0) {
            return true;
        } else if (class198.field3390) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BZZ)V", line = 710)
    public final void method450(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -37) {
            this.method433((String) null, 116);
        }
        field762++;
        if (!this.method444((byte) -117)) {
            return;
        }
        if (arg2) {
            this.field742.field1314 = null;
            this.field742.field1306 = null;
        }
        if (arg1) {
            this.field742.field1305 = (int[][]) null;
            this.field742.field1307 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ[I)[B", line = 735)
    public final byte[] method451(int arg0, int arg1, boolean arg2, int[] arg3) {
        field760++;
        if (!this.method434(arg1, arg0, -1)) {
            return null;
        }
        if (this.field768[arg0] == null || this.field768[arg0][arg1] == null) {
            boolean var5 = this.method436(arg3, arg0, -12036);
            if (!var5) {
                this.method456(arg0, -2418);
                boolean var6 = this.method436(arg3, arg0, -12036);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class247.method1736(arg2, this.field768[arg0][arg1], 15997);
        if (this.field751) {
            this.field768[arg0][arg1] = null;
            if (this.field742.field1311[arg0] == 1) {
                this.field768[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 775)
    public static void method452(int arg0) {
        if (arg0 == 3135) {
            field754 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I", line = 787)
    public final int method453(int arg0) {
        if (arg0 != 24190) {
            this.method460((String) null, 59);
        }
        field746++;
        return this.method444((byte) 126) ? this.field742.field1311.length : -1;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V", line = 802)
    public final void method454(int arg0) {
        if (this.field768 != null) {
            for (int var2 = 0; var2 < this.field768.length; var2++) {
                this.field768[var2] = null;
            }
        }
        field752++;
        if (arg0 != 0) {
            field778 = true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IZ)I", line = 828)
    public final int method455(int arg0, boolean arg1) {
        if (!arg1) {
            method452(-94);
        }
        field773++;
        return this.method449(arg0, 65) ? this.field742.field1311[arg0] : 0;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)V", line = 845)
    private final void method456(int arg0, int arg1) {
        if (this.field755) {
            this.field744[arg0] = this.field759.method287(arg0, (byte) 126);
        } else {
            this.field744[arg0] = class346.method2430(arg1 + 2293, false, this.field759.method287(arg0, (byte) -99));
        }
        field769++;
        if (arg1 != -2418) {
            this.field768 = (Object[][]) ((Object[][]) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 865)
    public final byte[] method457(String arg0, int arg1, String arg2) {
        field771++;
        if (!this.method444((byte) -41)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg1 != 0) {
            field778 = false;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field742.field1314.method1993(arg1 ^ 0x1, class28.method253(-1, var4));
        if (this.method449(var6, 110)) {
            int var7 = this.field742.field1307[var6].method1993(1, class28.method253(-1, var5));
            return this.method441(false, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)Z", line = 893)
    public final boolean method458(int arg0) {
        field775++;
        if (!this.method444((byte) 121)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field742.field1303.length; var3++) {
            int var4 = this.field742.field1303[var3];
            if (this.field744[var4] == null) {
                this.method456(var4, -2418);
                if (this.field744[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)[B", line = 940)
    public final byte[] method459(int arg0, int arg1) {
        field757++;
        if (!this.method444((byte) -89)) {
            return null;
        } else if (this.field742.field1311.length == 1) {
            return this.method441(false, 0, arg0);
        } else {
            if (arg1 != -1) {
                this.field768 = (Object[][]) ((Object[][]) null);
            }
            if (!this.method449(arg0, 122)) {
                return null;
            } else if (this.field742.field1311[arg0] == 1) {
                return this.method441(false, arg0, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 970)
    public final boolean method460(String arg0, int arg1) {
        field764++;
        if (!this.method444((byte) -95)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 62) {
            this.method454(67);
        }
        int var4 = this.field742.field1314.method1993(1, class28.method253(-1, var3));
        return this.method448(var4, 3138);
    }
}
