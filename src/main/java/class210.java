import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class210 {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    private int[] field3430 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lgo;")
    public static class445[] field3428 = new class445[0];

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    public static int[] field3437 = new int[2048];

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3435 = new String[100];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lmg;")
    public class103 field3434;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lc;")
    public static class125 field3431;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    private int[] field3425;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[S")
    private short[] field3429;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[S")
    private short[] field3432;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[S")
    private short[] field3433;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[S")
    private short[] field3438;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLhp;)V", line = 7)
    public final void method1452(boolean arg0, class217 arg1) {
        while (true) {
            int var3 = arg1.method1515((byte) 125);
            if (var3 == 0) {
                if (arg0) {
                    this.field3430 = null;
                }
                field3422++;
                return;
            }
            this.method1459((byte) -48, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Ltp;", line = 28)
    public final class374 method1453(byte arg0) {
        field3426++;
        if (this.field3425 == null) {
            return null;
        }
        class374[] var2 = new class374[this.field3425.length];
        class406 var3 = this.field3434.field1478;
        synchronized (this.field3434.field1478) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field3425.length) {
                    break;
                }
                var2[var4] = class356.method2233(this.field3425[var4], (byte) -71, 0, this.field3434.field1478);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3425.length; var5++) {
            if (var2[var5].field5596 < 13) {
                var2[var5].method2350((byte) -10, 0);
            }
        }
        class374 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class374(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3429 != null) {
            for (int var7 = 0; var7 < this.field3429.length; var7++) {
                var6.method2340(this.field3438[var7], this.field3429[var7], 0);
            }
        }
        if (arg0 <= 115) {
            field3431 = null;
        }
        if (this.field3433 != null) {
            for (int var8 = 0; var8 < this.field3433.length; var8++) {
                var6.method2346(this.field3432[var8], false, this.field3433[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z", line = 101)
    public final boolean method1454(int arg0) {
        field3423++;
        if (this.field3425 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -3938) {
            this.method1454(-68);
        }
        class406 var3 = this.field3434.field1478;
        synchronized (this.field3434.field1478) {
            for (int var4 = 0; var4 < this.field3425.length; var4++) {
                if (!this.field3434.field1478.method2549(0, true, this.field3425[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Z", line = 128)
    public final boolean method1455(byte arg0) {
        field3424++;
        boolean var2 = true;
        class406 var3 = this.field3434.field1478;
        synchronized (this.field3434.field1478) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3430[var4] != -1 && !this.field3434.field1478.method2549(0, true, this.field3430[var4])) {
                    var2 = false;
                }
            }
            if (arg0 != 50) {
                this.method1452(false, null);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V", line = 160)
    public static void method1456(byte arg0) {
        field3435 = null;
        field3428 = null;
        field3437 = null;
        int var1 = -97 / ((arg0 + 39) / 52);
        field3431 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Ltp;", line = 172)
    public final class374 method1457(int arg0) {
        field3427++;
        class374[] var2 = new class374[5];
        int var3 = 0;
        class406 var4 = this.field3434.field1478;
        synchronized (this.field3434.field1478) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3430[var5] != -1) {
                    var2[var3++] = class356.method2233(this.field3430[var5], (byte) -71, 0, this.field3434.field1478);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field5596 < 13) {
                var2[var6].method2350((byte) -10, 0);
            }
        }
        class374 var7 = new class374(var2, var3);
        if (this.field3429 != null) {
            for (int var8 = 0; var8 < this.field3429.length; var8++) {
                var7.method2340(this.field3438[var8], this.field3429[var8], 0);
            }
        }
        if (this.field3433 != null) {
            for (int var9 = 0; var9 < this.field3433.length; var9++) {
                var7.method2346(this.field3432[var9], false, this.field3433[var9]);
            }
        }
        if (arg0 != 101) {
            this.field3430 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(CI)C", line = 245)
    public static final char method1458(char arg0, int arg1) {
        field3439++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 != -2) {
                method1458((char) 65465, 97);
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILhp;)V", line = 293)
    private final void method1459(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 1) {
            arg2.method1515((byte) 122);
        } else if (arg1 == 2) {
            int var8 = arg2.method1515((byte) 124);
            this.field3425 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3425[var9] = arg2.method1511(-71);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg2.method1515((byte) 125);
                this.field3429 = new short[var4];
                this.field3438 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3429[var5] = (short) arg2.method1511(-113);
                    this.field3438[var5] = (short) arg2.method1511(-105);
                }
            } else if (arg1 == 41) {
                int var6 = arg2.method1515((byte) 127);
                this.field3432 = new short[var6];
                this.field3433 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3433[var7] = (short) arg2.method1511(class425.method2656(arg0, 11));
                    this.field3432[var7] = (short) arg2.method1511(class425.method2656(arg0, 77));
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field3430[arg1 - 60] = arg2.method1511(-38);
            }
        }
        if (arg0 != -48) {
            field3437 = null;
        }
        field3436++;
    }
}
