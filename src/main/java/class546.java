import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class546 extends class143 {

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "Z")
    public boolean field8021 = true;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "Z")
    public static boolean field8016 = false;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "Lmea;")
    public class357 field8020;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "Lfa;")
    public static class615 field8012;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "[I")
    private int[] field8006;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "[I")
    public int[] field8014;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field8011;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "[[I")
    private int[][] field8017;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "[[Z")
    public static boolean[][] field8009;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3198(boolean arg0) {
        if (arg0) {
            method3205(75, (byte) 50);
        }
        field8012 = null;
        field8009 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I", line = 17)
    public final int method3199(int arg0, byte arg1, int arg2) {
        field8022++;
        if (this.field8006 == null || arg2 < 0 || this.field8006.length < arg2) {
            return -1;
        } else {
            int var4 = -33 % ((-arg1 - 52) / 56);
            return this.field8017[arg2] == null || arg0 < 0 || arg0 > this.field8017[arg2].length ? -1 : this.field8017[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILek;I)V", line = 36)
    private final void method3200(int arg0, class465 arg1, int arg2) {
        if (arg0 == 1) {
            this.field8011 = class6.method26(arg1.method2717(true), (byte) 108, '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method2705(arg2 - 101);
            this.field8014 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8014[var5] = arg1.method2755((byte) -65);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method2705(-40);
            this.field8006 = new int[var6];
            this.field8017 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method2755((byte) -60);
                class303 var9 = class482.method2822((byte) 126, var8);
                if (var9 != null) {
                    this.field8006[var7] = var8;
                    this.field8017[var7] = new int[var9.field4249];
                    for (int var10 = 0; var10 < var9.field4249; var10++) {
                        this.field8017[var7][var10] = arg1.method2755((byte) -79);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field8021 = false;
        }
        field8007++;
        if (arg2 != 60) {
            method3198(true);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)I", line = 110)
    public final int method3201(boolean arg0) {
        field8013++;
        if (arg0) {
            this.method3200(-96, null, -26);
        }
        return this.field8006 == null ? 0 : this.field8006.length;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 126)
    public final void method3202(byte arg0) {
        field8018++;
        int var2 = 107 / ((77 - arg0) / 39);
        if (this.field8014 != null) {
            for (int var3 = 0; var3 < this.field8014.length; var3++) {
                this.field8014[var3] = class460.method2676(this.field8014[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lek;I)V", line = 146)
    public final void method3203(class465 arg0, int arg1) {
        field8015++;
        while (true) {
            int var3 = arg0.method2705(arg1 ^ 0x5C);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field8009 = null;
                    return;
                }
            }
            this.method3200(var3, arg0, 60);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Ldc;", line = 168)
    public final class303 method3204(int arg0, int arg1) {
        if (arg1 <= 59) {
            return null;
        } else {
            field8019++;
            return this.field8006 == null || arg0 < 0 || arg0 > this.field8006.length ? null : class482.method2822((byte) 114, this.field8006[arg0]);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Luea;", line = 188)
    public static final class256 method3205(int arg0, byte arg1) {
        int var2 = -46 % ((-arg1 - 66) / 58);
        field8023++;
        class256[] var3 = class435.method2552((byte) -101);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class256 var5 = var3[var4];
            if (var5.field3695 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILek;[I)V", line = 214)
    public final void method3206(int arg0, class465 arg1, int[] arg2) {
        field8024++;
        if (this.field8006 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != 3264) {
            this.method3201(true);
        }
        while (var4 < this.field8006.length) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = this.method3204(var4, arg0 - 3168).field4245;
            if (var5 > 0) {
                arg1.method2748(var5, (long) arg2[var4], (byte) 48);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(B)Ljava/lang/String;", line = 245)
    public final String method3207(byte arg0) {
        if (arg0 != 93) {
            this.field8014 = null;
        }
        field8008++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field8011 == null) {
            return "";
        }
        var2.append(this.field8011[0]);
        for (int var3 = 1; var3 < this.field8011.length; var3++) {
            var2.append("...");
            var2.append(this.field8011[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLek;)Ljava/lang/String;", line = 273)
    public final String method3208(boolean arg0, class465 arg1) {
        field8025++;
        if (arg0) {
            this.method3204(-1, -104);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field8006 != null) {
            for (int var4 = 0; var4 < this.field8006.length; var4++) {
                var3.append(this.field8011[var4]);
                var3.append(this.field8020.method2156(arg1.method2715(class482.method2822((byte) 99, this.field8006[var4]).field4243, 2), this.field8017[var4], !arg0, this.method3204(var4, 121)));
            }
        }
        var3.append(this.field8011[this.field8011.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(JZIZIILvo;I)V", line = 305)
    public static final void method3209(long arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, class345 arg6, int arg7) {
        field8010++;
        class345.field4882 = arg5;
        class568.field8311 = 1;
        class309.field4295 = arg7;
        if (arg3) {
            field8012 = null;
        }
        class484.field6903 = null;
        class277.field3927 = arg1;
        class224.field3358 = arg0;
        class586.field8566 = arg6;
        class183.field2891 = arg2;
        class434.field6249 = 10000;
        class160.field2599 = arg4;
    }
}
