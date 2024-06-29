import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class224 {

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "[I")
    private int[] field3291 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "[C")
    public static char[] field3288 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "Ljv;")
    public static class773 field3278 = new class773();

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "Z")
    public static boolean field3297 = false;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "F")
    public static float field3293;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "Lep;")
    public class498 field3282;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "Lgga;")
    public static class513 field3296;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "[I")
    private int[] field3289;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "[S")
    private short[] field3279;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "[S")
    private short[] field3283;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "[S")
    private short[] field3285;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "[S")
    private short[] field3286;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1531(byte arg0, int arg1) {
        field3281++;
        class371 var2 = class490.method2867((byte) -98, 12, (long) arg1);
        if (arg0 != -69) {
            method1534(-89);
        }
        var2.method2215(4);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)Lida;", line = 18)
    public final class678 method1532(boolean arg0) {
        field3295++;
        class678[] var2 = new class678[5];
        if (arg0) {
            return null;
        }
        int var3 = 0;
        class513 var4 = this.field3282.field6847;
        synchronized (this.field3282.field6847) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3291[var5] != -1) {
                    var2[var3++] = class157.method1211(-5, this.field3282.field6847, 0, this.field3291[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field9567 < 13) {
                var2[var6].method3805(1, 2);
            }
        }
        class678 var7 = new class678(var2, var3);
        if (this.field3285 != null) {
            for (int var8 = 0; var8 < this.field3285.length; var8++) {
                var7.method3811(0, this.field3285[var8], this.field3283[var8]);
            }
        }
        if (this.field3286 != null) {
            for (int var9 = 0; var9 < this.field3286.length; var9++) {
                var7.method3807(this.field3279[var9], this.field3286[var9], (byte) 124);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)Z", line = 91)
    public final boolean method1533(boolean arg0) {
        field3280++;
        boolean var2 = arg0;
        class513 var3 = this.field3282.field6847;
        synchronized (this.field3282.field6847) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3291[var4] != -1 && !this.field3282.field6847.method2987(this.field3291[var4], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 116)
    public static void method1534(int arg0) {
        field3296 = null;
        field3288 = null;
        field3278 = null;
        if (arg0 != 107) {
            method1531((byte) -4, -15);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILol;I)V", line = 131)
    private final void method1535(int arg0, class431 arg1, int arg2) {
        field3284++;
        if (arg2 != -3) {
            field3288 = null;
        }
        if (arg0 == 1) {
            arg1.method2557(arg2 + 14932);
        } else if (arg0 == 2) {
            int var8 = arg1.method2557(arg2 ^ 0xFFFFC5AC);
            this.field3289 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3289[var9] = arg1.method2565((byte) -125);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg1.method2557(14929);
                this.field3285 = new short[var4];
                this.field3283 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3285[var5] = (short) arg1.method2565((byte) -124);
                    this.field3283[var5] = (short) arg1.method2565((byte) -93);
                }
                return;
            }
            if (arg0 == 41) {
                int var6 = arg1.method2557(arg2 + 14932);
                this.field3286 = new short[var6];
                this.field3279 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3286[var7] = (short) arg1.method2565((byte) -96);
                    this.field3279[var7] = (short) arg1.method2565((byte) -127);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3291[arg0 - 60] = arg1.method2565((byte) -85);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Lida;", line = 216)
    public final class678 method1536(int arg0) {
        field3294++;
        if (this.field3289 == null) {
            return null;
        }
        class678[] var2 = new class678[this.field3289.length];
        class513 var3 = this.field3282.field6847;
        synchronized (this.field3282.field6847) {
            int var4 = 0;
            while (true) {
                if (this.field3289.length <= var4) {
                    break;
                }
                var2[var4] = class157.method1211(-5, this.field3282.field6847, 0, this.field3289[var4]);
                var4++;
            }
        }
        if (arg0 < 4) {
            return null;
        }
        for (int var5 = 0; var5 < this.field3289.length; var5++) {
            if (var2[var5].field9567 < 13) {
                var2[var5].method3805(1, 2);
            }
        }
        class678 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class678(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3285 != null) {
            for (int var7 = 0; var7 < this.field3285.length; var7++) {
                var6.method3811(0, this.field3285[var7], this.field3283[var7]);
            }
        }
        if (this.field3286 != null) {
            for (int var8 = 0; var8 < this.field3286.length; var8++) {
                var6.method3807(this.field3279[var8], this.field3286[var8], (byte) 124);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lol;I)V", line = 306)
    public final void method1537(class431 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                field3290++;
                return;
            }
            this.method1535(var3, arg0, -3);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z", line = 337)
    public final boolean method1538(byte arg0) {
        field3287++;
        if (this.field3289 == null) {
            return true;
        }
        if (arg0 > -6) {
            this.method1537(null, -118);
        }
        boolean var2 = true;
        class513 var3 = this.field3282.field6847;
        synchronized (this.field3282.field6847) {
            for (int var4 = 0; var4 < this.field3289.length; var4++) {
                if (!this.field3282.field6847.method2987(this.field3289[var4], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
