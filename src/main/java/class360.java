import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class360 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    private int[] field5256 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lmga;")
    public static class739 field5258 = new class739(74, 7);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lwh;")
    public class158 field5266;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    private int[] field5255;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[S")
    private short[] field5252;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
    private short[] field5261;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[S")
    private short[] field5262;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[S")
    private short[] field5269;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljp;I)V")
    public final void method2257(class376 arg0, int arg1) {
        field5264++;
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.field5256 = null;
                    return;
                }
            }
            this.method2258((byte) -30, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILjp;)V")
    private final void method2258(byte arg0, int arg1, class376 arg2) {
        if (arg1 == 1) {
            arg2.method2398(arg0 - 1372747226);
        } else if (arg1 == 2) {
            int var4 = arg2.method2398(-1372747256);
            this.field5255 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5255[var5] = arg2.method2359(class471.method2773(arg0, 29));
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var8 = arg2.method2398(-1372747256);
                this.field5261 = new short[var8];
                this.field5269 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5269[var9] = (short) arg2.method2359(-1);
                    this.field5261[var9] = (short) arg2.method2359(-1);
                }
            } else if (arg1 == 41) {
                int var6 = arg2.method2398(-1372747256);
                this.field5262 = new short[var6];
                this.field5252 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5252[var7] = (short) arg2.method2359(-1);
                    this.field5262[var7] = (short) arg2.method2359(-1);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field5256[arg1 - 60] = arg2.method2359(arg0 + 29);
            }
        }
        if (arg0 != -30) {
            this.field5256 = null;
        }
        field5254++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public final boolean method2259(int arg0) {
        field5263++;
        if (this.field5255 == null) {
            return true;
        }
        boolean var2 = true;
        class333 var3 = this.field5266.field2184;
        synchronized (this.field5266.field2184) {
            if (arg0 <= 42) {
                this.field5269 = null;
            }
            for (int var4 = 0; var4 < this.field5255.length; var4++) {
                if (!this.field5266.field2184.method2120(-5241, 0, this.field5255[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method2260(int arg0) {
        if (arg0 != 29323) {
            field5268 = -69;
        }
        field5258 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public static final int method2261(int arg0) {
        int var1 = -29 % ((-arg0 - 19) / 56);
        field5257++;
        if ((double) class375.field5422 == 3.0D) {
            return 37;
        } else if ((double) class375.field5422 == 4.0D) {
            return 50;
        } else if ((double) class375.field5422 == 6.0D) {
            return 75;
        } else if ((double) class375.field5422 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIZ)V")
    public static final void method2262(byte arg0, int arg1, boolean arg2) {
        field5253++;
        class166 var3 = class389.method2461((byte) 61, arg1, arg2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != 3) {
            field5267 = 103;
        }
        while (var4 < var3.field2240.length) {
            var3.field2240[var4] = -1;
            var3.field2237[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Lgfa;")
    public final class782 method2263(int arg0) {
        field5259++;
        class782[] var2 = new class782[5];
        if (arg0 != -13439) {
            this.field5252 = null;
        }
        int var3 = 0;
        class333 var4 = this.field5266.field2184;
        synchronized (this.field5266.field2184) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field5256[var5] != -1) {
                    var2[var3++] = class558.method3142(2085750768, this.field5266.field2184, this.field5256[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field10787 < 13) {
                var2[var6].method4317(17496, 2);
            }
        }
        class782 var7 = new class782(var2, var3);
        if (this.field5269 != null) {
            for (int var8 = 0; var8 < this.field5269.length; var8++) {
                var7.method4335(this.field5261[var8], this.field5269[var8], false);
            }
        }
        if (this.field5252 != null) {
            for (int var9 = 0; var9 < this.field5252.length; var9++) {
                var7.method4323(this.field5262[var9], this.field5252[var9], -8378);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
    public final boolean method2264(boolean arg0) {
        field5260++;
        boolean var2 = arg0;
        class333 var3 = this.field5266.field2184;
        synchronized (this.field5266.field2184) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field5256[var4] != -1 && !this.field5266.field2184.method2120(-5241, 0, this.field5256[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Lgfa;")
    public final class782 method2265(boolean arg0) {
        field5265++;
        if (this.field5255 == null) {
            return null;
        }
        class782[] var2 = new class782[this.field5255.length];
        class333 var3 = this.field5266.field2184;
        synchronized (this.field5266.field2184) {
            int var4 = 0;
            while (true) {
                if (this.field5255.length <= var4) {
                    break;
                }
                var2[var4] = class558.method3142(2085750768, this.field5266.field2184, this.field5255[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field5255.length; var5++) {
            if (var2[var5].field10787 < 13) {
                var2[var5].method4317(17496, 2);
            }
        }
        if (!arg0) {
            this.field5252 = null;
        }
        class782 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class782(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field5269 != null) {
            for (int var7 = 0; var7 < this.field5269.length; var7++) {
                var6.method4335(this.field5261[var7], this.field5269[var7], false);
            }
        }
        if (this.field5252 != null) {
            for (int var8 = 0; var8 < this.field5252.length; var8++) {
                var6.method4323(this.field5262[var8], this.field5252[var8], -8378);
            }
        }
        return var6;
    }
}
