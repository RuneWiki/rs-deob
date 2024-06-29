import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    private int[] field794 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[I")
    public static int[] field792 = new int[2048];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lwe;")
    public class374 field800;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
    private int[] field804;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[S")
    private short[] field790;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[S")
    private short[] field797;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[S")
    private short[] field798;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[S")
    private short[] field803;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILie;)V", line = 5)
    public final void method680(int arg0, class6 arg1) {
        if (arg0 != -1) {
            this.method684((byte) -3);
        }
        field802++;
        while (true) {
            int var3 = arg1.method70(arg0 - 9058);
            if (var3 == 0) {
                return;
            }
            this.method683(arg1, (byte) -110, var3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Luo;", line = 28)
    public final class534 method681(byte arg0) {
        field795++;
        if (arg0 != -21) {
            this.field794 = null;
        }
        class534[] var2 = new class534[5];
        int var3 = 0;
        class97 var4 = this.field800.field5850;
        synchronized (this.field800.field5850) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field794[var5] != -1) {
                    var2[var3++] = class243.method1736(this.field794[var5], 0, 6392, this.field800.field5850);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7772 < 13) {
                var2[var6].method3244(44, 2);
            }
        }
        class534 var7 = new class534(var2, var3);
        if (this.field798 != null) {
            for (int var8 = 0; var8 < this.field798.length; var8++) {
                var7.method3239(2711, this.field798[var8], this.field803[var8]);
            }
        }
        if (this.field797 != null) {
            for (int var9 = 0; var9 < this.field797.length; var9++) {
                var7.method3237(this.field790[var9], this.field797[var9], 0);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 98)
    public static void method682(byte arg0) {
        field792 = null;
        if (arg0 > -36) {
            method685(null, null, -15, null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lie;BI)V", line = 108)
    private final void method683(class6 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method70(-9059);
        } else if (arg2 == 2) {
            int var8 = arg0.method70(-9059);
            this.field804 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field804[var9] = arg0.method67(12021);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method70(-9059);
                this.field798 = new short[var6];
                this.field803 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field798[var7] = (short) arg0.method67(12021);
                    this.field803[var7] = (short) arg0.method67(12021);
                }
            } else if (arg2 == 41) {
                int var4 = arg0.method70(-9059);
                this.field790 = new short[var4];
                this.field797 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field797[var5] = (short) arg0.method67(12021);
                    this.field790[var5] = (short) arg0.method67(12021);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field794[arg2 - 60] = arg0.method67(12021);
            }
        }
        field791++;
        if (arg1 >= -85) {
            this.field804 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)Z", line = 192)
    public final boolean method684(byte arg0) {
        field799++;
        boolean var2 = true;
        if (arg0 != 70) {
            return true;
        }
        class97 var3 = this.field800.field5850;
        synchronized (this.field800.field5850) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field794[var4] != -1 && !this.field800.field5850.method931(arg0 - 71, this.field794[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 220)
    public static final String method685(String arg0, String arg1, int arg2, String arg3) {
        field796++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, var4 + arg0.length())) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg1.length() + var4);
        }
        if (arg2 != 0) {
            field805 = -33;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z", line = 240)
    public final boolean method686(int arg0) {
        field793++;
        if (this.field804 == null) {
            return true;
        }
        boolean var2 = true;
        class97 var3 = this.field800.field5850;
        synchronized (this.field800.field5850) {
            for (int var4 = arg0; var4 < this.field804.length; var4++) {
                if (!this.field800.field5850.method931(-1, this.field804[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Luo;", line = 274)
    public final class534 method687(int arg0) {
        field801++;
        if (this.field804 == null) {
            return null;
        }
        class534[] var2 = new class534[this.field804.length];
        class97 var3 = this.field800.field5850;
        synchronized (this.field800.field5850) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field804.length) {
                    break;
                }
                var2[var4] = class243.method1736(this.field804[var4], 0, 6392, this.field800.field5850);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field804.length; var5++) {
            if (var2[var5].field7772 < 13) {
                var2[var5].method3244(44, 2);
            }
        }
        class534 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class534(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field798 != null) {
            for (int var7 = 0; var7 < this.field798.length; var7++) {
                var6.method3239(2711, this.field798[var7], this.field803[var7]);
            }
        }
        if (this.field797 != null) {
            for (int var8 = 0; var8 < this.field797.length; var8++) {
                var6.method3237(this.field790[var8], this.field797[var8], 0);
            }
        }
        return var6;
    }
}
