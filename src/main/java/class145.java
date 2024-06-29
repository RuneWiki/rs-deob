import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class145 extends class326 {

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    private int field2288 = 0;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    private int field2292 = 4096;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field2285 = 1;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field2294 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "Lug;")
    public static class253 field2293;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "[Lg;")
    public static class68[] field2291;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "[[Z")
    public static boolean[][] field2286;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZLvl;)V", line = 19)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field2288 = arg2.method39((byte) 71);
        } else if (arg0 == 1) {
            this.field2292 = arg2.method39((byte) 39);
        } else if (arg0 == 2) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (arg1) {
            field2294 = (String[]) null;
        }
        field2295++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)[[I", line = 59)
    public final int[][] method253(int arg0, byte arg1) {
        int[][] var3 = this.field5104.method2365((byte) 86, arg0);
        int var4 = 61 / ((arg1 - 60) / 51);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class166.field2731; var12++) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (this.field2288 > var13) {
                    var9[var12] = this.field2288;
                } else if (this.field2292 >= var13) {
                    var9[var12] = var13;
                } else {
                    var9[var12] = this.field2292;
                }
                if (var15 < this.field2288) {
                    var10[var12] = this.field2288;
                } else if (var15 > this.field2292) {
                    var10[var12] = this.field2292;
                } else {
                    var10[var12] = var15;
                }
                if (this.field2288 > var14) {
                    var11[var12] = this.field2288;
                } else if (this.field2292 >= var14) {
                    var11[var12] = var14;
                } else {
                    var11[var12] = this.field2292;
                }
            }
        }
        field2289++;
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)[I", line = 132)
    public final int[] method103(int arg0, int arg1) {
        field2290++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 > -25) {
            field2293 = (class253) null;
        }
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                int var6 = var4[var5];
                if (this.field2288 > var6) {
                    var3[var5] = this.field2288;
                } else if (var6 <= this.field2292) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field2292;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(B)V", line = 176)
    public static void method1074(byte arg0) {
        if (arg0 >= -69) {
            method1075(-23, 62, -66);
        }
        field2294 = null;
        field2286 = (boolean[][]) null;
        field2291 = null;
        field2293 = null;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(III)J", line = 198)
    public static final long method1075(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null || var3.field1788 == null ? 0L : var3.field1788.field2200;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 205)
    public class145() {
        super(1, false);
    }
}
