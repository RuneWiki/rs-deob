import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class141 extends class65 {

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field2202 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public int field2204 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public int field2207 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public int field2205 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public int field2206 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field2203 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public int field2208 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public int field2209 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Liba;")
    public class302 field2201;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Lfe;")
    public static class636 field2199 = new class636("WIP", 2);

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "[I")
    public static int[] field2212 = new int[3];

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "[I")
    public static int[] field2210 = new int[500];

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Liba;)V", line = 160)
    public class141(class302 arg0) {
        this.field2201 = arg0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lov;IIIII)V", line = 17)
    public static final void method1101(class668 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class386.field5782 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class42.field727) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class54.field870 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class114 var14 = class488.field7062[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class211.field3511[var11].method2160(-100, var13, var12) + class211.field3511[var11].method2160(-124, var13, var12 + 1) + class211.field3511[var11].method2160(-111, var13 + 1, var12) + class211.field3511[var11].method2160(-84, var13 + 1, var12 + 1)) / 4 - (class211.field3511[arg1].method2160(-104, arg3, arg2) + class211.field3511[arg1].method2160(-75, arg3, arg2 + 1) + class211.field3511[arg1].method2160(-92, arg3 + 1, arg2) + class211.field3511[arg1].method2160(-126, arg3 + 1, arg2 + 1)) / 4;
                                    class194 var16 = var14.field1762;
                                    class194 var17 = var14.field1764;
                                    if (var16 != null && var16.method92(2)) {
                                        arg0.method104(false, (var12 - arg2) * class382.field5732 + (1 - arg4) * class581.field8224, class478.field6933, var16, var15, (var13 - arg3) * class382.field5732 + (1 - arg5) * class581.field8224, var6);
                                    }
                                    if (var17 != null && var17.method92(2)) {
                                        arg0.method104(false, (var12 - arg2) * class382.field5732 + (1 - arg4) * class581.field8224, class478.field6933, var17, var15, (var13 - arg3) * class382.field5732 + (1 - arg5) * class581.field8224, var6);
                                    }
                                    for (class291 var18 = var14.field1772; var18 != null; var18 = var18.field4479) {
                                        class559 var19 = var18.field4482;
                                        if (var19 != null && var19.method92(2) && (var19.field7927 == var12 || var7 == var12) && (var19.field7930 == var13 || var9 == var13)) {
                                            int var20 = var19.field7931 + 1 - var19.field7927;
                                            int var21 = var19.field7934 + 1 - var19.field7930;
                                            arg0.method104(false, (var19.field7927 - arg2) * class382.field5732 + (var20 - arg4) * class581.field8224, class478.field6933, var19, var15, (var19.field7930 - arg3) * class382.field5732 + (var21 - arg5) * class581.field8224, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z", line = 126)
    public final boolean method1102(int arg0, int arg1, int arg2) {
        field2200++;
        if (arg1 >= this.field2207 && this.field2203 >= arg1 && arg0 >= this.field2209 && arg0 <= this.field2205) {
            return true;
        } else {
            int var4 = -16 / ((32 - arg2) / 32);
            return arg1 >= this.field2206 && this.field2208 >= arg1 && arg0 >= this.field2202 && arg0 <= this.field2204;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 143)
    public static void method1103(int arg0) {
        if (arg0 != 1) {
            method1101(null, 50, 4, -67, 38, -71);
        }
        field2212 = null;
        field2210 = null;
        field2199 = null;
    }
}
