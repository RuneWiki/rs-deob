import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class625 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[I")
    private int[] field8513 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field8511 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field8506 = 0;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "F")
    public static float field8499;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "F")
    public static float field8505;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lwl;")
    public class30 field8498;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
    private int[] field8512;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[S")
    private short[] field8500;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[S")
    private short[] field8502;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[S")
    private short[] field8503;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[S")
    private short[] field8508;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lrf;", line = 8)
    public final class238 method3413(int arg0) {
        field8504++;
        class238[] var2 = new class238[5];
        int var3 = 0;
        class159 var4 = this.field8498.field299;
        synchronized (this.field8498.field299) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (arg0 <= 22) {
                        this.field8498 = null;
                    }
                    break;
                }
                if (this.field8513[var5] != -1) {
                    var2[var3++] = class646.method3591(this.field8498.field299, this.field8513[var5], 0, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3136 < 13) {
                var2[var6].method1474(2, (byte) 22);
            }
        }
        class238 var7 = new class238(var2, var3);
        if (this.field8502 != null) {
            for (int var8 = 0; var8 < this.field8502.length; var8++) {
                var7.method1471(this.field8508[var8], (byte) -62, this.field8502[var8]);
            }
        }
        if (this.field8500 != null) {
            for (int var9 = 0; var9 < this.field8500.length; var9++) {
                var7.method1472(this.field8503[var9], this.field8500[var9], true);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Z", line = 76)
    public final boolean method3414(int arg0) {
        field8510++;
        if (this.field8512 == null) {
            return true;
        }
        boolean var2 = true;
        class159 var3 = this.field8498.field299;
        synchronized (this.field8498.field299) {
            for (int var4 = arg0; var4 < this.field8512.length; var4++) {
                if (!this.field8498.field299.method1081((byte) 103, this.field8512[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLdga;)V", line = 112)
    public final void method3415(boolean arg0, class138 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method957((byte) -82);
            if (var3 == 0) {
                field8507++;
                return;
            }
            this.method3418(arg1, var3, 104);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lrf;", line = 136)
    public final class238 method3416(boolean arg0) {
        field8509++;
        if (this.field8512 == null) {
            return null;
        }
        class238[] var2 = new class238[this.field8512.length];
        class159 var3 = this.field8498.field299;
        synchronized (this.field8498.field299) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field8512.length) {
                    break;
                }
                var2[var4] = class646.method3591(this.field8498.field299, this.field8512[var4], 0, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field8512.length; var5++) {
            if (var2[var5].field3136 < 13) {
                var2[var5].method1474(2, (byte) 69);
            }
        }
        if (arg0) {
            this.method3418(null, 65, -76);
        }
        class238 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class238(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field8502 != null) {
            for (int var7 = 0; var7 < this.field8502.length; var7++) {
                var6.method1471(this.field8508[var7], (byte) -62, this.field8502[var7]);
            }
        }
        if (this.field8500 != null) {
            for (int var8 = 0; var8 < this.field8500.length; var8++) {
                var6.method1472(this.field8503[var8], this.field8500[var8], true);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Z", line = 216)
    public final boolean method3417(int arg0) {
        field8501++;
        if (arg0 >= -106) {
            field8506 = -42;
        }
        boolean var2 = true;
        class159 var3 = this.field8498.field299;
        synchronized (this.field8498.field299) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field8513[var4] != -1 && !this.field8498.field299.method1081((byte) 76, this.field8513[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldga;II)V", line = 249)
    private final void method3418(class138 arg0, int arg1, int arg2) {
        field8514++;
        if (arg1 == 1) {
            arg0.method957((byte) -93);
        } else if (arg1 == 2) {
            int var8 = arg0.method957((byte) -104);
            this.field8512 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field8512[var9] = arg0.method922((byte) -116);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg0.method957((byte) -114);
                this.field8508 = new short[var4];
                this.field8502 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8502[var5] = (short) arg0.method922((byte) -119);
                    this.field8508[var5] = (short) arg0.method922((byte) -116);
                }
            } else if (arg1 == 41) {
                int var6 = arg0.method957((byte) -72);
                this.field8503 = new short[var6];
                this.field8500 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8500[var7] = (short) arg0.method922((byte) -113);
                    this.field8503[var7] = (short) arg0.method922((byte) -115);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field8513[arg1 - 60] = arg0.method922((byte) -114);
            }
        }
        int var10 = -22 % ((arg2 + 23) / 47);
    }
}
