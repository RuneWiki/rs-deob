import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class175 extends class17 {

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "Z")
    private boolean field3191 = true;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
    private int field3195 = 4096;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "Lsf;")
    public static class108 field3194 = class140.method973(255, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "Lci;")
    public static class203 field3192 = new class203(5000);

    @OriginalMember(owner = "client!hg", name = "hb", descriptor = "Lca;")
    public static class98 field3197 = null;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!hg", name = "gb", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!hg", name = "ib", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V", line = 5)
    public static void method1240(byte arg0) {
        field3192 = null;
        field3197 = null;
        field3194 = null;
        if (arg0 >= -95) {
            field3194 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lik;I)Z", line = 21)
    public static final boolean method1241(class262 arg0, int arg1) {
        field3198++;
        if (arg0.method1861(class154.field2767, 108)) {
            return true;
        } else {
            if (arg1 != 18228) {
                field3197 = (class98) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[[I", line = 42)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            method1242(-44, -68, 101, -118, (class290) null, -41L, (class290) null, (class290) null);
        }
        int[][] var3 = this.field224.method2081(arg1, -66);
        field3196++;
        if (this.field224.field5106) {
            int[] var4 = this.method124(85, 0, arg1 - 1 & class219.field3899);
            int[] var5 = this.method124(73, 0, arg1);
            int[] var6 = this.method124(105, 0, class219.field3899 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class116.field2008; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field3195;
                int var12 = (var5[class249.field4327 & var10 + 1] - var5[var10 - 1 & class249.field4327]) * this.field3195;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 - (-var15 - 4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                }
                if (this.field3191) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var9[var10] = var19;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLrm;I)V", line = 132)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3195 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field3191 = arg1.method1731(true) == 1;
        }
        field3193++;
        if (arg0 != -114) {
            method1240((byte) 66);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILma;JLma;Lma;)V", line = 161)
    public static final void method1242(int arg0, int arg1, int arg2, int arg3, class290 arg4, long arg5, class290 arg6, class290 arg7) {
        class220 var9 = new class220();
        var9.field3908 = arg4;
        var9.field3907 = arg1 * 128 + 64;
        var9.field3920 = arg2 * 128 + 64;
        var9.field3909 = arg3;
        var9.field3922 = arg5;
        var9.field3918 = arg6;
        var9.field3914 = arg7;
        int var10 = 0;
        class74 var11 = class99.field1759[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1119; var12++) {
                class326 var13 = var11.field1118[var12];
                if ((var13.field5563 & 0x400000L) == 4194304L) {
                    int var14 = var13.field5570.method95();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3912 = -var10;
        if (class99.field1759[arg0][arg1][arg2] == null) {
            class99.field1759[arg0][arg1][arg2] = new class74(arg0, arg1, arg2);
        }
        class99.field1759[arg0][arg1][arg2].field1124 = var9;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 208)
    public class175() {
        super(1, false);
    }
}
