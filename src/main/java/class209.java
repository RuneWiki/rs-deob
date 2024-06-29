import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class209 {

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    private int field2971 = 0;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "[Ltq;")
    public class513[] field2959;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public static int field2970 = -1;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public static int field2974 = 1407;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "Lju;")
    public static class102 field2956 = new class102(66, 3);

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "Lbfa;")
    public static class574 field2975 = new class574();

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "Lqk;")
    public static class148 field2977 = new class148(27, -1);

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "J")
    private long field2962;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "Ltq;")
    private class513 field2961;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "Ltq;")
    private class513 field2973;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "[Lcw;")
    public static class21[] field2979;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I", line = 5)
    public final int method1379(boolean arg0) {
        if (!arg0) {
            field2978 = -59;
        }
        field2958++;
        return this.field2955;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIILc;)V", line = 18)
    public static final void method1380(int arg0, int arg1, int arg2, class50 arg3) {
        class38 var4 = class617.method3623(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field532 = arg3;
        int var5 = class52.field741 == class435.field5969 ? 1 : 0;
        if (arg3.method277(3)) {
            if (arg3.method283((byte) -59)) {
                class160.field2206[var5][class352.field4548[var5]++] = arg3;
                return;
            }
            class261.field3566[var5][class269.field3635[var5]++] = arg3;
            class380.field5357 = true;
            return;
        }
        class140.field1931[var5][class609.field8671[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZJ)Ltq;", line = 46)
    public final class513 method1381(boolean arg0, long arg1) {
        field2972++;
        this.field2962 = arg1;
        class513 var4 = this.field2959[(int) ((long) (this.field2955 - 1) & arg1)];
        this.field2961 = var4.field7165;
        if (!arg0) {
            method1386(false);
        }
        while (this.field2961 != var4) {
            if (this.field2961.field7166 == arg1) {
                class513 var5 = this.field2961;
                this.field2961 = this.field2961.field7165;
                return var5;
            }
            this.field2961 = this.field2961.field7165;
        }
        this.field2961 = null;
        return null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Ltq;", line = 76)
    public final class513 method1382(int arg0) {
        this.field2971 = 0;
        if (arg0 != 27901) {
            method1389(null, 55, -124);
        }
        field2965++;
        return this.method1383(false);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Z)Ltq;", line = 94)
    public final class513 method1383(boolean arg0) {
        field2960++;
        if (arg0) {
            return null;
        } else if (this.field2971 <= 0 || this.field2959[this.field2971 - 1] == this.field2973) {
            while (this.field2971 < this.field2955) {
                class513 var3 = this.field2959[this.field2971++].field7165;
                if (this.field2959[this.field2971 - 1] != var3) {
                    this.field2973 = var3.field7165;
                    return var3;
                }
            }
            return null;
        } else {
            class513 var2 = this.field2973;
            this.field2973 = var2.field7165;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Ltq;)I", line = 128)
    public final int method1384(int arg0, class513[] arg1) {
        field2966++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field2955; var4++) {
            class513 var5 = this.field2959[var4];
            for (class513 var6 = var5.field7165; var6 != var5; var6 = var6.field7165) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 158)
    public final void method1385(byte arg0) {
        if (arg0 != -97) {
            return;
        }
        for (int var2 = 0; var2 < this.field2955; var2++) {
            class513 var3 = this.field2959[var2];
            while (true) {
                class513 var4 = var3.field7165;
                if (var3 == var4) {
                    break;
                }
                var4.method3065(arg0 - 17266);
            }
        }
        field2957++;
        this.field2961 = null;
        this.field2973 = null;
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(Z)V", line = 191)
    public static void method1386(boolean arg0) {
        if (arg0) {
            field2977 = null;
        }
        field2979 = null;
        field2975 = null;
        field2977 = null;
        field2956 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ltq;JB)V", line = 207)
    public final void method1387(class513 arg0, long arg1, byte arg2) {
        if (arg0.field7164 != null) {
            arg0.method3065(-17363);
        }
        field2968++;
        class513 var5 = this.field2959[(int) (arg1 & (long) (this.field2955 - 1))];
        arg0.field7164 = var5.field7164;
        arg0.field7165 = var5;
        if (arg2 > -102) {
            this.method1387(null, -68L, (byte) -47);
        }
        arg0.field7164.field7165 = arg0;
        arg0.field7166 = arg1;
        arg0.field7165.field7164 = arg0;
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(Z)I", line = 228)
    public final int method1388(boolean arg0) {
        field2963++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2955; var3++) {
            class513 var4 = this.field2959[var3];
            for (class513 var5 = var4.field7165; var5 != var4; var5 = var5.field7165) {
                var2++;
            }
        }
        if (arg0) {
            field2977 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lig;II)V", line = 263)
    public static final void method1389(class674[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class674 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9491;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9491 < (var7 & 0x1) + var6) {
                class674 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1389(arg0, arg1, var4 - 1);
        method1389(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(I)V", line = 301)
    public class209(int arg0) {
        this.field2959 = new class513[arg0];
        this.field2955 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class513 var3 = this.field2959[var2] = new class513();
            var3.field7165 = var3;
            var3.field7164 = var3;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V", line = 329)
    public static final void method1390(int arg0, byte arg1) {
        class538 var2 = class585.field8426;
        synchronized (class585.field8426) {
            int var3 = -126 % ((arg1 + 7) / 53);
            class585.field8426.method3204((byte) -89, arg0);
        }
        field2964++;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)Ltq;", line = 343)
    public final class513 method1391(int arg0) {
        field2967++;
        if (this.field2961 == null) {
            return null;
        }
        class513 var2 = this.field2959[(int) (this.field2962 & (long) (this.field2955 + arg0))];
        while (this.field2961 != var2) {
            if (this.field2961.field7166 == this.field2962) {
                class513 var3 = this.field2961;
                this.field2961 = this.field2961.field7165;
                return var3;
            }
            this.field2961 = this.field2961.field7165;
        }
        this.field2961 = null;
        return null;
    }
}
