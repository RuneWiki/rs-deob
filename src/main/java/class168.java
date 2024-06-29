import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class168 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Z")
    public boolean field2974 = false;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field2975 = 0;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    private int field2981 = 128;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field2976 = -1;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    private int field2993 = 128;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    private int field2987 = 0;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    private int field2998 = 0;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[[I")
    public static int[][] field2979 = new int[104][104];

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lce;")
    public static class126 field2978 = class206.method1445(-7923, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    public static int[] field2990 = new int[1000];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lml;")
    public static class160 field2997 = new class160(50);

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Lce;")
    public static class126 field3001 = class206.method1445(-7923, ")1");

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lcc;")
    public static class313 field2999;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lcc;")
    public static class313 field3000;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[S")
    private short[] field2980;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[S")
    private short[] field2983;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[S")
    private short[] field2984;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[S")
    private short[] field2995;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Lwi;", line = 11)
    public final class196 method1224(byte arg0, int arg1) {
        field2996++;
        int var3 = 58 % ((arg0 + 38) / 55);
        class196 var4 = (class196) class41.field659.method1173(-19839, (long) this.field2988);
        if (var4 == null) {
            class146 var5 = class146.method1078(class21.field277, this.field2991, 0);
            if (var5 == null) {
                return null;
            }
            if (this.field2984 != null) {
                for (int var6 = 0; var6 < this.field2984.length; var6++) {
                    var5.method1086(this.field2984[var6], this.field2995[var6]);
                }
            }
            if (this.field2983 != null) {
                for (int var7 = 0; var7 < this.field2983.length; var7++) {
                    var5.method1060(this.field2983[var7], this.field2980[var7]);
                }
            }
            var4 = var5.method1073(this.field2987 + 64, 850 - -this.field2975, -30, -50, -30);
            class41.field659.method1179(var4, (long) this.field2988, (byte) -72);
        }
        class196 var8;
        if (this.field2976 == -1 || arg1 == -1) {
            var8 = var4.method226(true, true);
        } else {
            var8 = class110.method721(-126, this.field2976).method1949(7, var4, arg1);
        }
        if (this.field2981 != 128 || this.field2993 != 128) {
            var8.method231(this.field2981, this.field2993, this.field2981);
        }
        if (this.field2998 != 0) {
            if (this.field2998 == 90) {
                var8.method235();
            }
            if (this.field2998 == 180) {
                var8.method239();
            }
            if (this.field2998 == 270) {
                var8.method216();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I", line = 84)
    public static final int method1225(int arg0, int arg1) {
        if (arg0 != 1922) {
            field3001 = (class126) null;
        }
        field2986++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z", line = 106)
    public static final boolean method1226(int arg0, int arg1) {
        field2982++;
        int var2 = 47 / ((-arg1 - 64) / 50);
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIBI)I", line = 129)
    public static final int method1227(int arg0, int arg1, byte arg2, int arg3) {
        field2985++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (arg2 <= 49) {
            return 46;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V", line = 168)
    public static final void method1228(int arg0, byte arg1) {
        if (arg1 <= 70) {
            field2979 = (int[][]) ((int[][]) null);
        }
        field2992++;
        class189.field3244.method1175(true, arg0);
        class167.field2967.method1175(true, arg0);
        class170.field3019.method1175(true, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbb;IB)V", line = 197)
    private final void method1229(class134 arg0, int arg1, byte arg2) {
        if (arg2 != 121) {
            method1227(-17, 61, (byte) 98, 108);
        }
        field2994++;
        if (arg1 == 1) {
            this.field2991 = arg0.method942(true);
        } else if (arg1 == 2) {
            this.field2976 = arg0.method942(true);
        } else if (arg1 == 4) {
            this.field2981 = arg0.method942(true);
        } else if (arg1 == 5) {
            this.field2993 = arg0.method942(true);
        } else if (arg1 == 6) {
            this.field2998 = arg0.method942(true);
        } else if (arg1 == 7) {
            this.field2987 = arg0.method948(-121);
        } else if (arg1 == 8) {
            this.field2975 = arg0.method948(-125);
        } else if (arg1 == 9) {
            this.field2974 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method948(arg2 - 249);
            this.field2995 = new short[var6];
            this.field2984 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2984[var7] = (short) arg0.method942(true);
                this.field2995[var7] = (short) arg0.method942(true);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method948(arg2 ^ 0xFFFFFFF8);
            this.field2980 = new short[var4];
            this.field2983 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2983[var5] = (short) arg0.method942(true);
                this.field2980[var5] = (short) arg0.method942(true);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbb;B)V", line = 292)
    public final void method1230(class134 arg0, byte arg1) {
        if (arg1 != 109) {
            field3001 = (class126) null;
        }
        while (true) {
            int var3 = arg0.method948(-125);
            if (var3 == 0) {
                field2989++;
                return;
            }
            this.method1229(arg0, var3, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 321)
    public static void method1231(int arg0) {
        if (arg0 != 48) {
            method1226(-10, 64);
        }
        field3001 = null;
        field2997 = null;
        field2999 = null;
        field3000 = null;
        field2979 = (int[][]) null;
        field2990 = null;
        field2978 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZI)I", line = 348)
    public static final int method1232(int arg0, boolean arg1, int arg2) {
        int var3 = 0;
        field2973++;
        if (arg1) {
            return -13;
        }
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
