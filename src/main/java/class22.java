import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 extends class152 {

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field289 = 204;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    private int field304 = 409;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    private int field287 = 1024;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    private int field298 = 8;

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "I")
    private int field309 = 1024;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    private int field303 = 4;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    private int field302 = 81;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "[I")
    public static int[] field310 = new int[2];

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "[I")
    public static int[] field312 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "Lv;")
    public static class248 field313 = null;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "Lce;")
    public static class126 field314 = class206.method1445(-7923, ": ");

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "[I")
    private int[] field288;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "[[I")
    private int[][] field291;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "[[I")
    private int[][] field301;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 313)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V", line = 21)
    public static final void method106(byte arg0) {
        field294++;
        if (arg0 >= 20) {
            class84.field1343.method1185(1);
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V", line = 33)
    public static void method107(byte arg0) {
        field313 = null;
        field312 = null;
        if (arg0 != -26) {
            method109(-15);
        }
        field314 = null;
        field310 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)[I", line = 51)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            this.field304 = -98;
        }
        field308++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = 0;
            int var5;
            for (var5 = class122.field2038[arg1] + this.field305; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field298 && this.field288[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = this.field288[var4 - 1];
            int var8 = var4 - 1;
            int var9 = this.field288[var4];
            if (var5 > var7 + this.field311 && var5 < var9 - this.field311) {
                for (int var10 = 0; var10 < class244.field4133; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field287 : -this.field287;
                    int var13;
                    for (var13 = (this.field297 * var12 >> 12) + class29.field406[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field303 > var11 && this.field291[var8][var11] <= var13) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field291[var8][var11];
                    int var16 = this.field291[var8][var14];
                    if ((this.field311 + var16) < var13 && var15 - this.field311 > var13) {
                        var3[var10] = this.field301[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class230.method1565(var3, 0, class244.field4133, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 156)
    private final void method108(int arg0) {
        field299++;
        Random var2 = new Random((long) this.field298);
        this.field296 = 4096 / this.field298;
        this.field301 = new int[this.field298][this.field303];
        this.field311 = this.field302 / 2;
        this.field288 = new int[this.field298 + 1];
        this.field288[0] = 0;
        int var3 = this.field296 / 2;
        this.field297 = 4096 / this.field303;
        this.field291 = new int[this.field298][this.field303 + 1];
        int var4 = this.field297 / 2;
        int var5 = 96 / ((-arg0 - 24) / 50);
        for (int var6 = 0; var6 < this.field298; var6++) {
            if (var6 > 0) {
                int var7 = this.field296;
                int var8 = (class244.method1675(var2, (byte) 110, 4096) - 2048) * this.field289 >> 12;
                int var9 = (var3 * var8 >> 12) + var7;
                this.field288[var6] = this.field288[var6 - 1] + var9;
            }
            this.field291[var6][0] = 0;
            for (int var10 = 0; var10 < this.field303; var10++) {
                if (var10 > 0) {
                    int var11 = this.field297;
                    int var12 = (class244.method1675(var2, (byte) 110, 4096) - 2048) * this.field304 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field291[var6][var10] = this.field291[var6][var10 - 1] + var13;
                }
                this.field301[var6][var10] = this.field309 <= 0 ? 4096 : 4096 - class244.method1675(var2, (byte) 110, this.field309);
            }
            this.field291[var6][this.field303] = 4096;
        }
        this.field288[this.field298] = 4096;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILbb;)V", line = 218)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            return;
        }
        if (arg1 == 0) {
            this.field303 = arg2.method948(-122);
        } else if (arg1 == 1) {
            this.field298 = arg2.method948(-124);
        } else if (arg1 == 2) {
            this.field304 = arg2.method942(true);
        } else if (arg1 == 3) {
            this.field289 = arg2.method942(true);
        } else if (arg1 == 4) {
            this.field287 = arg2.method942(true);
        } else if (arg1 == 5) {
            this.field305 = arg2.method942(true);
        } else if (arg1 == 6) {
            this.field302 = arg2.method942(true);
        } else if (arg1 == 7) {
            this.field309 = arg2.method942(true);
        }
        field306++;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V", line = 323)
    public final void method2(byte arg0) {
        field292++;
        int var2 = 117 % ((arg0 - 2) / 37);
        this.method108(86);
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Z", line = 335)
    public static final boolean method109(int arg0) {
        field295++;
        if (class56.field846) {
            return true;
        } else if (arg0 == 4096) {
            return class91.field1424;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V", line = 381)
    public static final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field293++;
        if (arg6 != -8) {
            return;
        }
        if (arg4 >= class321.field5489 && class52.field795 >= arg5 && class197.field3372 <= arg3 && arg2 <= class194.field3302) {
            class165.method1210(arg7, arg3, -85, arg0, arg1, arg5, arg2, arg4);
        } else {
            class252.method1704(arg2, arg4, arg7, arg5, arg0, arg1, (byte) 82, arg3);
        }
    }
}
