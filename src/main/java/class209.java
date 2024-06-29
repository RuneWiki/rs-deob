import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class209 extends class285 {

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    private int field3431 = 4096;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    private int field3436 = 0;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "[I")
    public static int[] field3429 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3433 = "white:";

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "[I")
    public static int[] field3437 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field3434 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "Lak;")
    public static class172 field3439;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[[I", line = 13)
    public final int[][] method62(byte arg0, int arg1) {
        field3428++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) 100, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var13 < this.field3436) {
                    var10[var11] = this.field3436;
                } else if (var13 > this.field3431) {
                    var10[var11] = this.field3431;
                } else {
                    var10[var11] = var13;
                }
                if (this.field3436 > var12) {
                    var8[var11] = this.field3436;
                } else if (var12 > this.field3431) {
                    var8[var11] = this.field3431;
                } else {
                    var8[var11] = var12;
                }
                if (var14 < this.field3436) {
                    var9[var11] = this.field3436;
                } else if (var14 <= this.field3431) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field3431;
                }
            }
        }
        return arg0 <= 121 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjj;I)V", line = 101)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3436 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field3431 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field4572 = arg1.method286((byte) -70) == 1;
        }
        if (!arg0) {
            field3437 = (int[]) null;
        }
        field3435++;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 269)
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)V", line = 141)
    public static void method1514(byte arg0) {
        field3437 = null;
        if (arg0 != -34) {
            field3437 = (int[]) null;
        }
        field3434 = null;
        field3439 = null;
        field3433 = null;
        field3429 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[I", line = 158)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            field3439 = (class172) null;
        }
        int[] var3 = this.field4573.method1116(106, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 124, arg1);
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3436) {
                    var3[var5] = this.field3436;
                } else if (this.field3431 < var6) {
                    var3[var5] = this.field3431;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        field3438++;
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z[Ljava/lang/String;II)Ljava/lang/String;", line = 201)
    public static final String method1515(boolean arg0, String[] arg1, int arg2, int arg3) {
        field3432++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            if (!arg0) {
                field3439 = (class172) null;
            }
            for (int var7 = arg3; var7 < var5; var7++) {
                String var8 = arg1[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg3; var10 < var5; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)V", line = 278)
    public static final void method1516(byte arg0, int arg1) {
        class344 var2 = class110.method759(6, arg1, false);
        var2.method2384(-27354);
        field3430++;
        if (arg0 < 101) {
            field3429 = (int[]) null;
        }
    }
}
