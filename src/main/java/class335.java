import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class335 extends class128 {

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Llb;")
    public static class224 field5171 = new class224(16);

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Llc;")
    public static class175 field5175;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Loh;")
    public static class18 field5174;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "[Log;")
    private class218[] field5169;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lp;II)V", line = 4)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field5169 = new class218[arg0.method661(-1)];
            for (int var4 = 0; var4 < this.field5169.length; var4++) {
                int var5 = arg0.method661(-1);
                if (var5 == 0) {
                    this.field5169[var4] = class231.method1628(arg0, -127);
                } else if (var5 == 1) {
                    this.field5169[var4] = class10.method55(false, arg0);
                } else if (var5 == 2) {
                    this.field5169[var4] = class159.method1053(arg0, 1);
                } else if (var5 == 3) {
                    this.field5169[var4] = class329.method2273(arg0, 24776);
                }
            }
        } else if (arg1 == 1) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        field5167++;
        if (arg2 >= -85) {
            field5174 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 75)
    public class335() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([[II)V", line = 80)
    private final void method2306(int[][] arg0, int arg1) {
        field5172++;
        int var3 = class10.field141;
        int var4 = class322.field4940;
        if (arg1 != 21856) {
            return;
        }
        class337.method2320(arg0, arg1 - 21740);
        class36.method215(class237.field3486, 0, class244.field3664, 0, 4096);
        if (this.field5169 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field5169.length; var5++) {
            class218 var6 = this.field5169[var5];
            int var7 = var6.field3065;
            int var8 = var6.field3071;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method881((byte) 108, var3, var4);
                } else {
                    var6.method884(var3, var4, false);
                }
            } else if (var8 >= 0) {
                var6.method882(var4, var3, 4);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I", line = 134)
    public final int[][] method102(int arg0, int arg1) {
        field5165++;
        if (arg1 != 5110) {
            this.method107((class107) null, -97, 30);
        }
        int[][] var3 = this.field1755.method875(54, arg0);
        if (this.field1755.field1815) {
            int var4 = class322.field4940;
            int var5 = class10.field141;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field1755.method876(true);
            this.method2306(var6, 21856);
            for (int var8 = 0; var8 < class322.field4940; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class10.field141; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class229.method1613(4080, var15 << 4);
                    var12[var14] = class229.method1613(4080, var15 >> 4);
                    var11[var14] = class229.method1613(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 192)
    public static void method2307(byte arg0) {
        field5171 = null;
        field5175 = null;
        field5174 = null;
        int var1 = 29 % ((arg0 - 52) / 45);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)[I", line = 212)
    public final int[] method126(byte arg0, int arg1) {
        field5166++;
        if (arg0 <= 100) {
            field5175 = (class175) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            this.method2306(this.field1748.method894(false), 21856);
        }
        return var3;
    }
}
