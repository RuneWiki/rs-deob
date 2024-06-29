import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class292 implements class105 {

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    private int field4460 = 50;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Z")
    private boolean field4473 = false;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Llm;")
    private class210 field4453;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Llm;")
    private class210 field4448;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lfe;")
    private class248 field4444;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lfe;")
    private class248 field4472;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[Z")
    private boolean[] field4446;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[Z")
    private boolean[] field4482;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[B")
    private byte[] field4469;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[Z")
    private boolean[] field4449;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[B")
    private byte[] field4451;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[S")
    private short[] field4441;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[Z")
    private boolean[] field4452;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[Z")
    private boolean[] field4458;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "[B")
    private byte[] field4471;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[B")
    private byte[] field4445;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4459 = "Unable to find ";

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4442 = "Use";

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Z")
    public static boolean field4447 = true;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field4466 = new String[8];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)V", line = 6)
    public final void method2040(byte arg0, int arg1) {
        if (arg0 != -8) {
            this.field4448 = (class210) null;
        }
        for (class136 var3 = (class136) this.field4444.method1676(-117); var3 != null; var3 = (class136) this.field4444.method1678(-100001)) {
            if (var3.field2087) {
                var3.method998(true, arg1);
                var3.field2087 = false;
            }
        }
        field4440++;
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(II)Lwb;", line = 32)
    private final class136 method2041(int arg0, int arg1) {
        field4480++;
        class136 var3 = (class136) this.field4444.method1674(0, (long) arg1);
        if (arg0 >= -51) {
            this.method741(-100, true);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4448.method1441(0, (byte) -44, arg1);
        if (var4 == null) {
            return null;
        } else {
            class263 var5 = new class263(var4);
            class136 var6 = new class136(var5);
            this.field4444.method1672(19, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)I", line = 59)
    public final int method739(int arg0, int arg1) {
        if (arg1 != -26067) {
            this.field4441 = (short[]) null;
        }
        field4456++;
        return this.field4441[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 72)
    public final void method737(int arg0, int arg1) {
        field4483++;
        class204.method1397(-108, this.field4469[arg0] & 0xFF, this.field4445[arg0] & 0xFF);
        boolean var3 = false;
        class136 var4 = this.method2041(arg1 ^ 0xFAB, arg0);
        if (var4 != null) {
            var3 = var4.method997(115, this.field4473 || this.field4458[arg0], this, this.field4453);
        }
        if (arg1 != -4090) {
            this.method2040((byte) 83, 67);
        }
        if (!var3) {
            class55 var5 = this.method2050(arg0, arg1 + 4054);
            var5.method364(116);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(ZI)V", line = 111)
    public final void method2042(boolean arg0, int arg1) {
        if (arg1 == 10372) {
            field4468++;
            this.field4473 = arg0;
            this.method2043(83);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 123)
    public final void method2043(int arg0) {
        field4470++;
        this.field4444.method1677(false);
        int var2 = -34 / ((arg0 - 29) / 37);
        if (this.field4472 != null) {
            this.field4472.method1677(false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V", line = 141)
    public static final void method2044(int arg0, int arg1, boolean arg2) {
        field4478++;
        class185.field2763[arg0] = arg1;
        class172 var3 = (class172) class285.field4305.method1320((long) arg0, 13002);
        if (var3 == null) {
            class172 var4 = new class172(class231.method1594(-20375) + 500L);
            class285.field4305.method1319(70, (long) arg0, var4);
        } else {
            var3.field2587 = class231.method1594(-20375) + 500L;
        }
        if (!arg2) {
            field4454 = 17;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(ZI)[I", line = 164)
    public final int[] method738(boolean arg0, int arg1) {
        if (arg0) {
            method2044(57, 17, true);
        }
        field4455++;
        class136 var3 = this.method2041(-125, arg1);
        return var3 == null ? null : var3.method994(this.field4453, this.field4473 || this.field4458[arg1], this, -10415);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(II)I", line = 179)
    public final int method744(int arg0, int arg1) {
        if (arg0 == 255) {
            field4481++;
            return this.field4445[arg1] & 0xFF;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 199)
    public static void method2045(byte arg0) {
        field4466 = null;
        field4442 = null;
        int var1 = -64 % ((arg0 - 20) / 35);
        field4459 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(FII)[I", line = 212)
    public final int[] method742(float arg0, int arg1, int arg2) {
        class136 var4 = this.method2041(-88, arg1);
        field4457++;
        if (arg2 != -2) {
            field4439 = 44;
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field2087 = true;
            return var4.method993(this, this.field4453, this.field4473 || this.field4458[arg1], arg0, true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)I", line = 232)
    public static final int method2046(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4479++;
        if (arg2 != -11) {
            field4442 = (String) null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(II)V", line = 257)
    public final void method2047(int arg0, int arg1) {
        field4475++;
        if (arg0 != -2) {
            return;
        }
        this.field4460 = arg1;
        this.field4444 = new class248(this.field4460);
        if (class117.field1817) {
            this.field4472 = new class248(this.field4460);
        } else {
            this.field4472 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 274)
    public static final void method2048(int arg0) {
        if (arg0 != 9040) {
            method2049(124, (String) null);
        }
        class88.field1301.method2182(false);
        field4476++;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(ZI)Z", line = 289)
    public final boolean method745(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field4463++;
            return this.field4446[arg1];
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(II)I", line = 302)
    public final int method743(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method738(false, -79);
        }
        field4465++;
        return this.field4469[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Z", line = 315)
    public final boolean method741(int arg0, boolean arg1) {
        field4450++;
        if (arg1) {
            this.method744(119, -29);
        }
        return this.field4449[arg0];
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(II)Z", line = 326)
    public final boolean method746(int arg0, int arg1) {
        if (arg0 == 0) {
            field4477++;
            return this.field4482[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)I", line = 348)
    public static final int method2049(int arg0, String arg1) {
        field4443++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 == -1651558971) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + class67.method450(-128, arg1.charAt(var4)) - var3;
            }
            return var3;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Llm;Llm;Llm;IZ)V", line = 445)
    public class292(class210 arg0, class210 arg1, class210 arg2, int arg3, boolean arg4) {
        this.field4460 = arg3;
        this.field4453 = arg2;
        this.field4448 = arg0;
        this.field4473 = arg4;
        this.field4444 = new class248(this.field4460);
        if (class117.field1817) {
            this.field4472 = new class248(this.field4460);
        } else {
            this.field4472 = null;
        }
        class263 var6 = new class263(arg1.method1441(0, (byte) -44, 0));
        int var7 = var6.method1830((byte) -77);
        this.field4446 = new boolean[var7];
        this.field4482 = new boolean[var7];
        this.field4469 = new byte[var7];
        this.field4449 = new boolean[var7];
        this.field4451 = new byte[var7];
        this.field4441 = new short[var7];
        this.field4452 = new boolean[var7];
        this.field4458 = new boolean[var7];
        this.field4471 = new byte[var7];
        this.field4445 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4452[var8] = var6.method1787(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4452[var9]) {
                this.field4482[var9] = var6.method1787(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4452[var10]) {
                this.field4446[var10] = var6.method1787(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4452[var11]) {
                this.field4458[var11] = var6.method1787(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4452[var12]) {
                this.field4449[var12] = var6.method1787(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4452[var13]) {
                this.field4471[var13] = var6.method1810((byte) 122);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4452[var14]) {
                this.field4451[var14] = var6.method1810((byte) 107);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4452[var15]) {
                this.field4445[var15] = var6.method1810((byte) 98);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4452[var16]) {
                this.field4469[var16] = var6.method1810((byte) 112);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4452[var17]) {
                this.field4441[var17] = (short) var6.method1830((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I", line = 381)
    public final int method740(int arg0, byte arg1) {
        field4462++;
        if (arg1 != -99) {
            field4459 = (String) null;
        }
        return this.field4451[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)Z", line = 396)
    public final boolean method736(boolean arg0, int arg1) {
        field4467++;
        class136 var3 = this.method2041(-123, arg1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0) {
                this.field4471 = (byte[]) null;
            }
            return var3.method996((byte) -86, this.field4453, this);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z", line = 412)
    public final boolean method734(int arg0, int arg1) {
        if (arg0 == 0) {
            field4464++;
            return this.field4473 || this.field4458[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(II)Lfn;", line = 428)
    private final class55 method2050(int arg0, int arg1) {
        field4474++;
        class55 var3 = (class55) this.field4472.method1674(0, (long) arg0);
        if (arg1 > -4) {
            return (class55) null;
        } else if (var3 == null) {
            class55 var4 = new class55(this.field4441[arg0] & 0xFFFF);
            this.field4472.method1672(-125, (long) arg0, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I", line = 568)
    public final int method735(byte arg0, int arg1) {
        if (arg0 >= -7) {
            method2044(71, 121, false);
        }
        field4461++;
        return this.field4471[arg1] & 0xFF;
    }
}
