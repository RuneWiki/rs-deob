import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class12 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    private int field163 = 128;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
    public boolean field164 = false;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field167 = 128;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    private int field173 = 0;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
    public boolean field161 = false;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    private int field182 = 0;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public int field178 = -1;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lpn;")
    public static class72 field171 = new class72(63, 2);

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lvf;")
    public static class166 field177 = new class166();

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Ljc;")
    public class414 field165;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "Lg;")
    public static class470 field179;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Laj;")
    public static class77 field180;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "[S")
    private short[] field166;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "[S")
    private short[] field168;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "[S")
    private short[] field172;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "[S")
    private short[] field175;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILvt;)V")
    public final void method90(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -124);
            if (var3 == 0) {
                field176++;
                int var4 = 20 % ((22 - arg0) / 40);
                return;
            }
            this.method94(var3, -2, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
    public static final void method91(int arg0, int arg1, int arg2) {
        int var3 = -53 / ((arg2 + 27) / 42);
        int var4 = class224.field3102 * arg1 >> 8;
        field170++;
        if (arg0 == -1 && !class60.field756) {
            class134.method637(1);
        } else if (arg0 != -1 && (class46.field593 != arg0 || !class176.method864(100)) && var4 != 0 && !class60.field756) {
            class45.method235(false, var4, arg0, class93.field1162, -47, 2, 0);
        }
        class46.field593 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILdd;IILoj;)Lqh;")
    public final class352 method92(int arg0, int arg1, int arg2, class229 arg3, int arg4, int arg5, class280 arg6) {
        field162++;
        int var8 = arg5;
        class207 var9 = this.field178 == -1 || arg2 == -1 ? null : arg3.method1267(-79, this.field178);
        if (var9 != null) {
            var8 = arg5 | var9.method1143(false, arg2, -1632205712, arg4);
        }
        if (this.field167 != 128) {
            var8 |= 0x2;
        }
        if (this.field163 != 128 || this.field182 != 0) {
            var8 |= 0x5;
        }
        if (arg0 != 4370) {
            this.field182 = 63;
        }
        class210 var10 = this.field165.field5909;
        class352 var11;
        synchronized (this.field165.field5909) {
            var11 = (class352) this.field165.field5909.method1163((byte) 123, (long) (this.field181 |= arg6.field4075 << 29));
        }
        if (var11 == null || arg6.method1473(var11.method1719(), var8) != 0) {
            if (var11 != null) {
                var8 = arg6.method1443(var8, var11.method1719());
            }
            int var12 = var8;
            if (this.field175 != null) {
                var12 = var8 | 0x2000;
            }
            if (this.field172 != null) {
                var12 |= 0x4000;
            }
            class10 var13 = class85.method430(0, this.field165.field5897, -91, this.field169);
            if (var13 == null) {
                return null;
            }
            var11 = arg6.method1346(var13, var12, this.field165.field5912, this.field160 + 64, this.field173 + 850);
            if (this.field175 != null) {
                for (int var14 = 0; var14 < this.field175.length; var14++) {
                    var11.method1747(this.field175[var14], this.field166[var14]);
                }
            }
            if (this.field172 != null) {
                for (int var15 = 0; var15 < this.field172.length; var15++) {
                    var11.method1728(this.field172[var15], this.field168[var15]);
                }
            }
            var11.method1732(var8);
            class210 var16 = this.field165.field5909;
            synchronized (this.field165.field5909) {
                this.field165.field5909.method1172((long) (this.field181 |= arg6.field4075 << 29), 1, var11);
            }
        }
        class352 var17 = var9 == null ? var11.method1749((byte) 2, var8, true) : var9.method1149((byte) 2, arg4, var11, 4991, arg2, 0, var8, arg1);
        if (this.field163 != 128 || this.field167 != 128) {
            var17.method1692(this.field163, this.field167, this.field163);
        }
        if (this.field182 != 0) {
            if (this.field182 == 90) {
                var17.method1743(4096);
            }
            if (this.field182 == 180) {
                var17.method1743(8192);
            }
            if (this.field182 == 270) {
                var17.method1743(12288);
            }
        }
        var17.method1732(arg5);
        return var17;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field180 = null;
        field179 = null;
        if (arg0 != 6958) {
            method93(-127);
        }
        field177 = null;
        field171 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILvt;)V")
    private final void method94(int arg0, int arg1, class179 arg2) {
        field174++;
        if (~arg0 == arg1) {
            this.field169 = arg2.method916(21933);
        } else if (arg0 == 2) {
            this.field178 = arg2.method916(21933);
        } else if (arg0 == 4) {
            this.field163 = arg2.method916(21933);
        } else if (arg0 == 5) {
            this.field167 = arg2.method916(arg1 ^ 0xFFFFAA53);
        } else if (arg0 == 6) {
            this.field182 = arg2.method916(21933);
        } else if (arg0 == 7) {
            this.field160 = arg2.method895((byte) -121);
        } else if (arg0 == 8) {
            this.field173 = arg2.method895((byte) -123);
        } else if (arg0 == 9) {
            this.field161 = true;
        } else if (arg0 == 10) {
            this.field164 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method895((byte) -107);
            this.field166 = new short[var6];
            this.field175 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field175[var7] = (short) arg2.method916(arg1 + 21935);
                this.field166[var7] = (short) arg2.method916(arg1 + 21935);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method895((byte) -111);
            this.field172 = new short[var4];
            this.field168 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field172[var5] = (short) arg2.method916(21933);
                this.field168[var5] = (short) arg2.method916(class293.method1843(arg1, -21933));
            }
            return;
        }
    }

    static {
        new class40("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field183 = 0;
    }
}
