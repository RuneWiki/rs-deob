import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class251 extends class403 {

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
    public boolean field3348 = true;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
    public static int[] field3342 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Z")
    public static volatile boolean field3346 = true;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lgd;")
    public static class206 field3339 = new class206(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lml;")
    public static class241 field3359;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
    private int[] field3344;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public int[] field3356;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field3343;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "[[I")
    private int[][] field3355;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILbt;I)V", line = 3)
    private final void method1401(int arg0, class32 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3343 = class490.method2852(0, '<', arg1.method195(arg0 - 89));
        } else if (arg2 == 2) {
            int var4 = arg1.method201((byte) -117);
            this.field3356 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3356[var5] = arg1.method215((byte) 98);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method201((byte) -109);
            this.field3344 = new int[var6];
            this.field3355 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method215((byte) 125);
                this.field3344[var7] = var8;
                this.field3355[var7] = new int[class297.field3984[var8]];
                for (int var9 = 0; var9 < class297.field3984[var8]; var9++) {
                    this.field3355[var7][var9] = arg1.method215((byte) 113);
                }
            }
        } else if (arg2 == 4) {
            this.field3348 = false;
        }
        field3340++;
        if (arg0 != -1) {
            this.method1407(-57, -123, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V", line = 77)
    public static void method1402(byte arg0) {
        field3339 = null;
        field3359 = null;
        field3342 = null;
        if (arg0 != -18) {
            field3346 = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 89)
    public final int method1403(int arg0, int arg1) {
        field3347++;
        if (arg0 != 0) {
            this.method1411((byte) 93);
        }
        return this.field3344 == null || arg1 < 0 || this.field3344.length < arg1 ? -1 : this.field3344[arg1];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbt;I[I)V", line = 104)
    public final void method1404(class32 arg0, int arg1, int[] arg2) {
        int var4 = -66 / ((-arg1 - 35) / 60);
        field3357++;
        if (this.field3344 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3344.length; var5++) {
            if (arg2.length <= var5) {
                return;
            }
            int var6 = class456.field6189[this.method1403(0, var5)];
            if (var6 > 0) {
                arg0.method193(65280, var6, (long) arg2[var5]);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BC)Z", line = 130)
    public static final boolean method1405(byte arg0, char arg1) {
        if (arg0 > -33) {
            field3359 = null;
        }
        field3341++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLbt;)V", line = 141)
    public final void method1406(byte arg0, class32 arg1) {
        while (true) {
            int var3 = arg1.method201((byte) -127);
            if (var3 == 0) {
                if (arg0 <= 74) {
                    return;
                }
                field3354++;
                return;
            }
            this.method1401(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I", line = 165)
    public final int method1407(int arg0, int arg1, byte arg2) {
        field3351++;
        if (this.field3344 == null || arg0 < 0 || this.field3344.length < arg0) {
            return -1;
        } else {
            if (arg2 <= 117) {
                method1405((byte) 97, 'a');
            }
            return this.field3355[arg0] == null || arg1 < 0 || arg1 > this.field3355[arg0].length ? -1 : this.field3355[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)Ljava/lang/String;", line = 187)
    public final String method1408(byte arg0) {
        field3352++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3343 == null) {
            return "";
        }
        var2.append(this.field3343[0]);
        if (arg0 != 63) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3343.length; var3++) {
            var2.append("...");
            var2.append(this.field3343[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbt;B)Ljava/lang/String;", line = 230)
    public final String method1409(class32 arg0, byte arg1) {
        field3349++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3344 != null) {
            for (int var4 = 0; var4 < this.field3344.length; var4++) {
                var3.append(this.field3343[var4]);
                var3.append(class410.method2462(-256, this.field3355[var4], this.field3344[var4], arg0.method246(false, class309.field4089[this.field3344[var4]])));
            }
        }
        if (arg1 == -24) {
            var3.append(this.field3343[this.field3343.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)I", line = 259)
    public final int method1410(byte arg0) {
        field3350++;
        if (this.field3344 == null) {
            return 0;
        } else {
            if (arg0 > -10) {
                this.field3344 = null;
            }
            return this.field3344.length;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(B)V", line = 276)
    public final void method1411(byte arg0) {
        if (arg0 >= -8) {
            field3339 = null;
        }
        if (this.field3356 != null) {
            for (int var2 = 0; var2 < this.field3356.length; var2++) {
                this.field3356[var2] = class21.method133(this.field3356[var2], 32768);
            }
        }
        field3358++;
    }
}
