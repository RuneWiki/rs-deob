import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class289 {

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "[I")
    private int[] field4399 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Z")
    public static boolean field4391 = false;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "[I")
    public static int[] field4392 = new int[4096];

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Z")
    public static boolean field4398 = false;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4400 = new String[100];

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "[I")
    public static int[] field4390;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "[I")
    private int[] field4394;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "[S")
    private short[] field4386;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "[S")
    private short[] field4395;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "[S")
    private short[] field4396;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "[S")
    private short[] field4401;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILsc;)[Lod;")
    public static final class411[] method1784(int arg0, class239 arg1) {
        field4406++;
        if (!arg1.method1437(true)) {
            return new class411[0];
        }
        class211 var2 = arg1.method1460((byte) 62);
        while (var2.field3172 == 0) {
            class109.method674((byte) 99, 10L);
        }
        if (arg0 != 16382) {
            method1784(-85, (class239) null);
        }
        if (var2.field3172 == 2) {
            return new class411[0];
        }
        int[] var3 = (int[]) var2.field3175;
        class411[] var4 = new class411[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class411 var6 = new class411();
            var4[var5] = var6;
            var6.field6118 = var3[var5 << 2];
            var6.field6122 = var3[(var5 << 2) + 1];
            var6.field6125 = var3[(var5 << 2) + 2];
            var6.field6123 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
    public final boolean method1785(byte arg0) {
        field4404++;
        if (this.field4394 == null) {
            return true;
        }
        boolean var2 = true;
        class134 var3 = class81.field1081;
        synchronized (class81.field1081) {
            for (int var4 = 0; var4 < this.field4394.length; var4++) {
                if (!class81.field1081.method839(this.field4394[var4], 0, -30600)) {
                    var2 = false;
                }
            }
            if (arg0 > -52) {
                this.field4395 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lef;I)V")
    public final void method1786(class385 arg0, int arg1) {
        int var3 = 101 / ((arg1 - 59) / 37);
        while (true) {
            int var4 = arg0.method2343(255);
            if (var4 == 0) {
                field4397++;
                return;
            }
            this.method1792(var4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Z")
    public final boolean method1787(byte arg0) {
        field4402++;
        if (arg0 != 11) {
            field4391 = true;
        }
        boolean var2 = true;
        class134 var3 = class81.field1081;
        synchronized (class81.field1081) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4399[var4] != -1 && !class81.field1081.method839(this.field4399[var4], 0, -30600)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Ljp;")
    public final class49 method1788(int arg0) {
        field4388++;
        if (this.field4394 == null) {
            return null;
        }
        class49[] var2 = new class49[this.field4394.length];
        class134 var3 = class81.field1081;
        synchronized (class81.field1081) {
            int var4 = arg0;
            while (true) {
                if (var4 >= this.field4394.length) {
                    break;
                }
                var2[var4] = class451.method2775(0, this.field4394[var4], class81.field1081, 18325);
                var4++;
            }
        }
        class49 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class49(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field4386 != null) {
            for (int var6 = 0; var6 < this.field4386.length; var6++) {
                var5.method280(this.field4401[var6], true, this.field4386[var6]);
            }
        }
        if (this.field4396 != null) {
            for (int var7 = 0; var7 < this.field4396.length; var7++) {
                var5.method276(this.field4395[var7], this.field4396[var7], (byte) 86);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
    public static void method1789(boolean arg0) {
        field4392 = null;
        field4400 = null;
        field4390 = null;
        if (arg0) {
            method1789(true);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1790(int arg0, byte arg1) {
        if (arg1 <= 115) {
            return null;
        } else {
            field4389++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Ljp;")
    public final class49 method1791(boolean arg0) {
        field4405++;
        class49[] var2 = new class49[5];
        int var3 = 0;
        class134 var4 = class81.field1081;
        synchronized (class81.field1081) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field4399[var5] != -1) {
                    var2[var3++] = class451.method2775(0, this.field4399[var5], class81.field1081, 18325);
                }
            }
        }
        class49 var6 = new class49(var2, var3);
        if (this.field4386 != null) {
            for (int var7 = 0; var7 < this.field4386.length; var7++) {
                var6.method280(this.field4401[var7], arg0, this.field4386[var7]);
            }
        }
        if (this.field4396 != null) {
            for (int var8 = 0; var8 < this.field4396.length; var8++) {
                var6.method276(this.field4395[var8], this.field4396[var8], (byte) 86);
            }
        }
        return arg0 ? var6 : null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILef;I)V")
    private final void method1792(int arg0, class385 arg1, int arg2) {
        if (arg0 == 1) {
            arg1.method2343(arg2 ^ 0xFF);
        } else if (arg0 == 2) {
            int var4 = arg1.method2343(255);
            this.field4394 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4394[var5] = arg1.method2323(-49);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg1.method2343(255);
                this.field4401 = new short[var6];
                this.field4386 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4386[var7] = (short) arg1.method2323(-92);
                    this.field4401[var7] = (short) arg1.method2323(class339.method2073(arg2, -52));
                }
            } else if (arg0 == 41) {
                int var8 = arg1.method2343(arg2 + 255);
                this.field4395 = new short[var8];
                this.field4396 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4396[var9] = (short) arg1.method2323(-95);
                    this.field4395[var9] = (short) arg1.method2323(-8);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field4399[arg0 - 60] = arg1.method2323(class339.method2073(arg2, -105));
            }
        }
        field4387++;
        if (arg2 != 0) {
            this.method1791(true);
        }
    }
}
