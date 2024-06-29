import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class193 extends class197 {

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    private int field3408 = 4096;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field3403 = 4096;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    private int field3412 = 4096;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Loh;")
    public static class258 field3406 = class153.method1046("; Expires=", 103);

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "Loh;")
    private static class258 field3415 = class153.method1046(" has logged out)3", 109);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Loh;")
    public static class258 field3401 = field3415;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Ljava/util/Random;")
    public static Random field3407 = new Random();

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lgb;")
    public static class213 field3414;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "Lgb;")
    public static class213 field3418;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "[I")
    public static int[] field3405;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILva;I)V", line = 15)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3408 = arg1.method1615(4);
        } else if (arg2 == 1) {
            this.field3412 = arg1.method1615(arg0 ^ 0xFFFFE096);
        } else if (arg2 == 2) {
            this.field3403 = arg1.method1615(arg0 ^ 0xFFFFE0F2);
        }
        if (arg0 != 7955) {
            field3411 = 19;
        }
        field3409++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)I", line = 51)
    public static final int method1300(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3404++;
        if (arg2 != 16342) {
            return 28;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)V", line = 78)
    public static void method1301(byte arg0) {
        field3414 = null;
        field3415 = null;
        int var1 = -15 % ((arg0 + 11) / 58);
        field3418 = null;
        field3406 = null;
        field3401 = null;
        field3407 = null;
        field3405 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I", line = 95)
    public final int[][] method101(int arg0, byte arg1) {
        int var3 = 90 % ((1 - arg1) / 37);
        field3402++;
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var5 = this.method1322(0, arg0, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var5[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class190.field3362; var12++) {
                int var13 = var6[var12];
                int var14 = var10[var12];
                int var15 = var7[var12];
                if (var14 == var15 && var13 == var15) {
                    var9[var12] = this.field3408 * var14 >> 12;
                    var8[var12] = this.field3412 * var15 >> 12;
                    var11[var12] = this.field3403 * var13 >> 12;
                } else {
                    var9[var12] = this.field3408;
                    var8[var12] = this.field3412;
                    var11[var12] = this.field3403;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 159)
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)V", line = 180)
    public static final void method1302(byte arg0) {
        field3416++;
        int var1 = -104 / ((arg0 - 24) / 58);
        class253.field4350.method1161(-63);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILec;)V", line = 199)
    public static final void method1303(int arg0, class42 arg1) {
        field3417++;
        class250.method1697(arg0, arg0 - 202704, arg1);
    }
}
