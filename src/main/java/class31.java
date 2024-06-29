import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class31 {

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
    private int[] field475 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "J")
    public static long field470 = 0L;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lkl;")
    public static class100 field473;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Ldm;")
    public class508 field482;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field467;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    private int[] field479;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[S")
    private short[] field466;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[S")
    private short[] field468;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "[S")
    private short[] field476;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[S")
    private short[] field483;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 5)
    public static void method224(int arg0) {
        field467 = null;
        field473 = null;
        if (arg0 != -6) {
            field467 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILtl;)V", line = 16)
    public final void method225(int arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field481++;
                if (arg0 != 28109) {
                    this.method231((byte) -23);
                    return;
                }
                return;
            }
            this.method228(108, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Lro;", line = 44)
    public final class192 method226(int arg0) {
        field477++;
        class192[] var2 = new class192[5];
        int var3 = 0;
        class438 var4 = this.field482.field7554;
        synchronized (this.field482.field7554) {
            if (arg0 >= -106) {
                this.method229(false);
            }
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field475[var5] != -1) {
                    var2[var3++] = class143.method956(this.field475[var5], this.field482.field7554, 0, 22953);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2694 < 13) {
                var2[var6].method1348(true, 0);
            }
        }
        class192 var7 = new class192(var2, var3);
        if (this.field483 != null) {
            for (int var8 = 0; var8 < this.field483.length; var8++) {
                var7.method1343((byte) -48, this.field483[var8], this.field468[var8]);
            }
        }
        if (this.field476 != null) {
            for (int var9 = 0; var9 < this.field476.length; var9++) {
                var7.method1347(this.field466[var9], (byte) 78, this.field476[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Lro;", line = 113)
    public final class192 method227(int arg0) {
        field480++;
        if (this.field479 == null) {
            return null;
        }
        class192[] var2 = new class192[this.field479.length];
        class438 var3 = this.field482.field7554;
        synchronized (this.field482.field7554) {
            int var4 = 0;
            while (true) {
                if (this.field479.length <= var4) {
                    break;
                }
                var2[var4] = class143.method956(this.field479[var4], this.field482.field7554, 0, 22953);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field479.length; var5++) {
            if (var2[var5].field2694 < 13) {
                var2[var5].method1348(true, 0);
            }
        }
        class192 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class192(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field483 != null) {
            for (int var7 = 0; var7 < this.field483.length; var7++) {
                var6.method1343((byte) -48, this.field483[var7], this.field468[var7]);
            }
        }
        if (this.field476 != null) {
            for (int var8 = 0; var8 < this.field476.length; var8++) {
                var6.method1347(this.field466[var8], (byte) 78, this.field476[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILtl;)V", line = 184)
    private final void method228(int arg0, int arg1, class91 arg2) {
        if (arg0 < 14) {
            this.field482 = null;
        }
        if (arg1 == 1) {
            arg2.method618((byte) 100);
        } else if (arg1 == 2) {
            int var8 = arg2.method618((byte) 100);
            this.field479 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field479[var9] = arg2.method631(10494);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method618((byte) 100);
                this.field468 = new short[var6];
                this.field483 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field483[var7] = (short) arg2.method631(10494);
                    this.field468[var7] = (short) arg2.method631(10494);
                }
            } else if (arg1 == 41) {
                int var4 = arg2.method618((byte) 100);
                this.field466 = new short[var4];
                this.field476 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field476[var5] = (short) arg2.method631(10494);
                    this.field466[var5] = (short) arg2.method631(10494);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field475[arg1 - 60] = arg2.method631(10494);
            }
        }
        field469++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z", line = 269)
    public final boolean method229(boolean arg0) {
        field472++;
        if (arg0) {
            return false;
        }
        boolean var2 = true;
        class438 var3 = this.field482.field7554;
        synchronized (this.field482.field7554) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field475[var4] != -1 && !this.field482.field7554.method2647(42, this.field475[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(CI)Z", line = 310)
    public static final boolean method230(char arg0, int arg1) {
        field474++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class102.field1460;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return arg1 >= -95;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z", line = 360)
    public final boolean method231(byte arg0) {
        if (arg0 > -6) {
            return false;
        }
        field478++;
        if (this.field479 == null) {
            return true;
        }
        boolean var2 = true;
        class438 var3 = this.field482.field7554;
        synchronized (this.field482.field7554) {
            for (int var4 = 0; var4 < this.field479.length; var4++) {
                if (!this.field482.field7554.method2647(61, this.field479[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
