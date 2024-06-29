import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class504 extends class334 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Z")
    public boolean field7539 = true;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lqu;")
    public static class219 field7544 = new class219(19, 2);

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field7550 = 1405;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Lbi;")
    public static class104 field7548 = new class104(19, 0);

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Z")
    public static boolean field7552 = false;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "[[I")
    public static int[][] field7553 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Lng;")
    public class274 field7545;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[I")
    public int[] field7540;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
    private int[] field7551;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field7536;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[[I")
    private int[][] field7543;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Lcg;")
    public final class10 method3058(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field7545 = null;
        }
        field7541++;
        return this.field7551 == null || arg0 < 0 || arg0 > this.field7551.length ? null : class122.method767(this.field7551[arg0], (byte) -60);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method3059(int arg0) {
        if (arg0 != -26099) {
            this.field7543 = null;
        }
        field7549++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field7536 == null) {
            return "";
        }
        var2.append(this.field7536[0]);
        for (int var3 = 1; var3 < this.field7536.length; var3++) {
            var2.append("...");
            var2.append(this.field7536[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhw;B)V")
    public final void method3060(class208 arg0, byte arg1) {
        field7546++;
        if (arg1 != -120) {
            this.field7539 = true;
        }
        while (true) {
            int var3 = arg0.method1445(arg1 + 155);
            if (var3 == 0) {
                return;
            }
            this.method3067(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method3061(int arg0) {
        field7544 = null;
        field7553 = null;
        field7548 = null;
        if (arg0 != 0) {
            field7550 = -15;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public final void method3062(byte arg0) {
        if (this.field7540 != null) {
            for (int var2 = 0; var2 < this.field7540.length; var2++) {
                this.field7540[var2] = class410.method2621(this.field7540[var2], 32768);
            }
        }
        field7542++;
        if (arg0 < 124) {
            this.method3067(-65, null, 10);
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)I")
    public final int method3063(int arg0) {
        if (arg0 < 97) {
            this.method3062((byte) -14);
        }
        field7538++;
        return this.field7551 == null ? 0 : this.field7551.length;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLhw;)Ljava/lang/String;")
    public final String method3064(boolean arg0, class208 arg1) {
        field7534++;
        if (arg0) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field7551 != null) {
            for (int var4 = 0; var4 < this.field7551.length; var4++) {
                var3.append(this.field7536[var4]);
                var3.append(this.field7545.method1845((byte) -109, this.field7543[var4], arg1.method1446(101, class122.method767(this.field7551[var4], (byte) -94).field108), this.method3058(var4, 0)));
            }
        }
        var3.append(this.field7536[this.field7536.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    public final int method3065(int arg0, int arg1, int arg2) {
        field7535++;
        if (this.field7551 == null || arg1 < 0 || arg1 > this.field7551.length) {
            return -1;
        } else {
            if (arg0 != 4011) {
                this.field7545 = null;
            }
            return this.field7543[arg1] == null || arg2 < 0 || arg2 > this.field7543[arg1].length ? -1 : this.field7543[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[ILhw;)V")
    public final void method3066(int arg0, int[] arg1, class208 arg2) {
        field7547++;
        if (this.field7551 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != -29699) {
            return;
        }
        while (this.field7551.length > var4) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method3058(var4, 0).field112;
            if (var5 > 0) {
                arg2.method1434(76, var5, (long) arg1[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILhw;I)V")
    private final void method3067(int arg0, class208 arg1, int arg2) {
        if (arg2 != 0) {
            this.field7545 = null;
        }
        field7533++;
        if (arg0 == 1) {
            this.field7536 = class506.method3074((byte) 122, arg1.method1448(65535), '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method1445(77);
            this.field7540 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7540[var5] = arg1.method1455(-3387);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1445(69);
            this.field7543 = new int[var6][];
            this.field7551 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1455(-3387);
                class10 var9 = class122.method767(var8, (byte) -61);
                if (var9 != null) {
                    this.field7551[var7] = var8;
                    this.field7543[var7] = new int[var9.field105];
                    for (int var10 = 0; var10 < var9.field105; var10++) {
                        this.field7543[var7][var10] = arg1.method1455(arg2 - 3387);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field7539 = false;
            return;
        }
    }
}
