import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class544 {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    private int[] field7791 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
    public static boolean field7786 = false;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Z")
    public static boolean field7795 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lsg;")
    public class361 field7784;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
    private int[] field7796;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[S")
    private short[] field7792;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[S")
    private short[] field7793;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[S")
    private short[] field7794;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "[S")
    private short[] field7797;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lqda;")
    public final class90 method3083(byte arg0) {
        field7785++;
        class90[] var2 = new class90[5];
        int var3 = 0;
        if (arg0 > -9) {
            this.method3088((byte) 81, null);
        }
        class303 var4 = this.field7784.field4711;
        synchronized (this.field7784.field4711) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field7791[var5] != -1) {
                    var2[var3++] = class189.method1098(this.field7791[var5], 0, 1, this.field7784.field4711);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field984 < 13) {
                var2[var6].method561(2, 1);
            }
        }
        class90 var7 = new class90(var2, var3);
        if (this.field7792 != null) {
            for (int var8 = 0; var8 < this.field7792.length; var8++) {
                var7.method560((byte) 97, this.field7792[var8], this.field7793[var8]);
            }
        }
        if (this.field7797 != null) {
            for (int var9 = 0; var9 < this.field7797.length; var9++) {
                var7.method571(0, this.field7794[var9], this.field7797[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Z")
    public final boolean method3084(int arg0) {
        field7789++;
        if (this.field7796 == null) {
            return true;
        }
        boolean var2 = true;
        class303 var3 = this.field7784.field4711;
        synchronized (this.field7784.field4711) {
            for (int var4 = arg0; var4 < this.field7796.length; var4++) {
                if (!this.field7784.field4711.method1739(this.field7796[var4], 0, -2)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
    public final boolean method3085(boolean arg0) {
        field7798++;
        boolean var2 = true;
        class303 var3 = this.field7784.field4711;
        synchronized (this.field7784.field4711) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field7791[var4] != -1 && !this.field7784.field4711.method1739(this.field7791[var4], 0, -2)) {
                    var2 = false;
                }
            }
            if (arg0) {
                this.field7797 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLiaa;I)V")
    private final void method3086(boolean arg0, class452 arg1, int arg2) {
        if (arg2 == 1) {
            arg1.method2541(100);
        } else if (arg2 == 2) {
            int var4 = arg1.method2541(112);
            this.field7796 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7796[var5] = arg1.method2574(-1758460248);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var8 = arg1.method2541(89);
                this.field7793 = new short[var8];
                this.field7792 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field7792[var9] = (short) arg1.method2574(-1758460248);
                    this.field7793[var9] = (short) arg1.method2574(-1758460248);
                }
            } else if (arg2 == 41) {
                int var6 = arg1.method2541(58);
                this.field7794 = new short[var6];
                this.field7797 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7797[var7] = (short) arg1.method2574(-1758460248);
                    this.field7794[var7] = (short) arg1.method2574(-1758460248);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field7791[arg2 - 60] = arg1.method2574(-1758460248);
            }
        }
        field7787++;
        if (!arg0) {
            this.method3088((byte) 120, null);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lqda;")
    public final class90 method3087(byte arg0) {
        field7790++;
        if (this.field7796 == null) {
            return null;
        }
        class90[] var2 = new class90[this.field7796.length];
        class303 var3 = this.field7784.field4711;
        synchronized (this.field7784.field4711) {
            int var4 = 0;
            while (true) {
                if (this.field7796.length <= var4) {
                    break;
                }
                var2[var4] = class189.method1098(this.field7796[var4], 0, 1, this.field7784.field4711);
                var4++;
            }
        }
        if (arg0 <= 117) {
            this.field7791 = null;
        }
        for (int var5 = 0; var5 < this.field7796.length; var5++) {
            if (var2[var5].field984 < 13) {
                var2[var5].method561(2, 1);
            }
        }
        class90 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class90(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field7792 != null) {
            for (int var7 = 0; var7 < this.field7792.length; var7++) {
                var6.method560((byte) 102, this.field7792[var7], this.field7793[var7]);
            }
        }
        if (this.field7797 != null) {
            for (int var8 = 0; var8 < this.field7797.length; var8++) {
                var6.method571(0, this.field7794[var8], this.field7797[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLiaa;)V")
    public final void method3088(byte arg0, class452 arg1) {
        int var3 = 52 / ((-arg0 - 37) / 49);
        while (true) {
            int var4 = arg1.method2541(47);
            if (var4 == 0) {
                field7788++;
                return;
            }
            this.method3086(true, arg1, var4);
        }
    }
}
