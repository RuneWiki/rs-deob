import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class205 {

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    private int[] field3013 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lke;")
    public static class622 field3011 = new class622(79, -2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lds;")
    public class16 field3003;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    private int[] field3007;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
    private short[] field3005;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[S")
    private short[] field3008;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
    private short[] field3012;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[S")
    private short[] field3021;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[[B")
    public static byte[][] field3018;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lha;JI)V", line = 7)
    public static final void method1471(class66 arg0, long arg1, int arg2) {
        class109.field1315 = arg2;
        class207.field3028 = class428.field6016;
        field3010++;
        class569.field8056 = 0;
        class428.field6016 = 0;
        long var4 = class109.method731(104);
        for (class24 var6 = (class24) class497.field7071.method2033(0); var6 != null; var6 = (class24) class497.field7071.method2025((byte) -88)) {
            if (var6.method187(arg0, arg1)) {
                class569.field8056++;
            }
        }
        if (class177.field2686 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class497.field7071.method2027(-105) + ", running: " + class569.field8056);
            System.out.println("Emitters: " + class109.field1315 + " Particles: " + class428.field6016 + ". Time taken: " + (class109.method731(68) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lhm;", line = 47)
    public final class229 method1472(byte arg0) {
        field3004++;
        if (this.field3007 == null) {
            return null;
        }
        class229[] var2 = new class229[this.field3007.length];
        class544 var3 = this.field3003.field264;
        synchronized (this.field3003.field264) {
            int var4 = 0;
            while (true) {
                if (this.field3007.length <= var4) {
                    break;
                }
                var2[var4] = class364.method2276(this.field3003.field264, (byte) -46, this.field3007[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3007.length; var5++) {
            if (var2[var5].field3292 < 13) {
                var2[var5].method1583(28395, 2);
            }
        }
        if (arg0 > -100) {
            field3011 = null;
        }
        class229 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class229(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3021 != null) {
            for (int var7 = 0; var7 < this.field3021.length; var7++) {
                var6.method1579((byte) 4, this.field3008[var7], this.field3021[var7]);
            }
        }
        if (this.field3012 != null) {
            for (int var8 = 0; var8 < this.field3012.length; var8++) {
                var6.method1594(this.field3005[var8], 127, this.field3012[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILrv;I)V", line = 122)
    private final void method1473(int arg0, class120 arg1, int arg2) {
        if (arg2 != -28340) {
            this.method1477(10);
        }
        if (arg0 == 1) {
            arg1.method842(arg2 + 30724);
        } else if (arg0 == 2) {
            int var8 = arg1.method842(arg2 ^ 0xFFFF981C);
            this.field3007 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3007[var9] = arg1.method898((byte) -116);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg1.method842(2384);
                this.field3008 = new short[var6];
                this.field3021 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3021[var7] = (short) arg1.method898((byte) -113);
                    this.field3008[var7] = (short) arg1.method898((byte) -108);
                }
            } else if (arg0 == 41) {
                int var4 = arg1.method842(arg2 ^ 0xFFFF981C);
                this.field3005 = new short[var4];
                this.field3012 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3012[var5] = (short) arg1.method898((byte) -113);
                    this.field3005[var5] = (short) arg1.method898((byte) -114);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3013[arg0 - 60] = arg1.method898((byte) -88);
            }
        }
        field3006++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)Z", line = 211)
    public static final boolean method1474(int arg0, byte arg1) {
        field3014++;
        if (arg1 > -96) {
            return false;
        } else {
            return arg0 == 0 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z", line = 222)
    public final boolean method1475(byte arg0) {
        field3009++;
        if (arg0 != 114) {
            this.field3008 = null;
        }
        boolean var2 = true;
        class544 var3 = this.field3003.field264;
        synchronized (this.field3003.field264) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3013[var4] != -1 && !this.field3003.field264.method3135(arg0 - 115, 0, this.field3013[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 255)
    public static void method1476(byte arg0) {
        field3011 = null;
        field3018 = null;
        if (arg0 != -117) {
            field3018 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z", line = 274)
    public final boolean method1477(int arg0) {
        field3015++;
        if (this.field3007 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= -110) {
            return true;
        }
        class544 var3 = this.field3003.field264;
        synchronized (this.field3003.field264) {
            for (int var4 = 0; var4 < this.field3007.length; var4++) {
                if (!this.field3003.field264.method3135(-1, 0, this.field3007[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lrv;I)V", line = 303)
    public final void method1478(class120 arg0, int arg1) {
        if (arg1 >= -2) {
            return;
        }
        field3016++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method1473(var3, arg0, -28340);
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Lhm;", line = 325)
    public final class229 method1479(byte arg0) {
        if (arg0 != 54) {
            method1476((byte) -85);
        }
        field3017++;
        class229[] var2 = new class229[5];
        int var3 = 0;
        class544 var4 = this.field3003.field264;
        synchronized (this.field3003.field264) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3013[var5] != -1) {
                    var2[var3++] = class364.method2276(this.field3003.field264, (byte) -46, this.field3013[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3292 < 13) {
                var2[var6].method1583(arg0 ^ 0x6EDD, 2);
            }
        }
        class229 var7 = new class229(var2, var3);
        if (this.field3021 != null) {
            for (int var8 = 0; var8 < this.field3021.length; var8++) {
                var7.method1579((byte) 101, this.field3008[var8], this.field3021[var8]);
            }
        }
        if (this.field3012 != null) {
            for (int var9 = 0; var9 < this.field3012.length; var9++) {
                var7.method1594(this.field3005[var9], 115, this.field3012[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIB)Z", line = 394)
    public static final boolean method1480(int arg0, int arg1, byte arg2) {
        field3019++;
        return arg2 >= -19 ? true : class324.method2109(false, arg0, arg1) & class76.method591(arg1, arg0, (byte) 47);
    }
}
