import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class10 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "D")
    public static double field197 = -1.0D;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[Lof;")
    public static class201[] field204 = new class201[4];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "B")
    public static byte field203;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lmh;")
    public static class114 field198;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public static final void method93() {
        class40.field623 = 0;
        label191: for (int var0 = 0; var0 < class156.field2968; var0++) {
            class156 var1 = class113.field2038[var0];
            if (class282.field4980 != null) {
                for (int var2 = 0; var2 < class282.field4980.length; var2++) {
                    if (class282.field4980[var2] != -1000000 && (var1.field2948 <= class282.field4980[var2] || var1.field2938 <= class282.field4980[var2]) && (var1.field2961 <= class263.field4662[var2] || var1.field2956 <= class263.field4662[var2]) && (var1.field2961 >= class13.field225[var2] || var1.field2956 >= class13.field225[var2]) && (var1.field2964 <= class18.field295[var2] || var1.field2959 <= class18.field295[var2]) && (var1.field2964 >= class274.field4869[var2] || var1.field2959 >= class274.field4869[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2944 == 1) {
                int var3 = var1.field2952 + class223.field4096 - class267.field4732;
                if (var3 >= 0 && var3 <= class223.field4096 + class223.field4096) {
                    int var4 = var1.field2954 + class223.field4096 - class9.field193;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2946 + class223.field4096 - class9.field193;
                    if (var5 > class223.field4096 + class223.field4096) {
                        var5 = class223.field4096 + class223.field4096;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class93.field1776[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class6.field144 - var1.field2961;
                        if (var7 > 32) {
                            var1.field2947 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2947 = 2;
                            var7 = -var7;
                        }
                        var1.field2963 = (var1.field2964 - class185.field3447 << 8) / var7;
                        var1.field2966 = (var1.field2959 - class185.field3447 << 8) / var7;
                        var1.field2950 = (var1.field2948 - class150.field2847 << 8) / var7;
                        var1.field2943 = (var1.field2938 - class150.field2847 << 8) / var7;
                        class68.field1178[class40.field623++] = var1;
                    }
                }
            } else if (var1.field2944 == 2) {
                int var8 = var1.field2954 + class223.field4096 - class9.field193;
                if (var8 >= 0 && var8 <= class223.field4096 + class223.field4096) {
                    int var9 = var1.field2952 + class223.field4096 - class267.field4732;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2965 + class223.field4096 - class267.field4732;
                    if (var10 > class223.field4096 + class223.field4096) {
                        var10 = class223.field4096 + class223.field4096;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class93.field1776[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class185.field3447 - var1.field2964;
                        if (var12 > 32) {
                            var1.field2947 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2947 = 4;
                            var12 = -var12;
                        }
                        var1.field2941 = (var1.field2961 - class6.field144 << 8) / var12;
                        var1.field2960 = (var1.field2956 - class6.field144 << 8) / var12;
                        var1.field2950 = (var1.field2948 - class150.field2847 << 8) / var12;
                        var1.field2943 = (var1.field2938 - class150.field2847 << 8) / var12;
                        class68.field1178[class40.field623++] = var1;
                    }
                }
            } else if (var1.field2944 == 4) {
                int var13 = var1.field2948 - class150.field2847;
                if (var13 > 128) {
                    int var14 = var1.field2954 + class223.field4096 - class9.field193;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2946 + class223.field4096 - class9.field193;
                    if (var15 > class223.field4096 + class223.field4096) {
                        var15 = class223.field4096 + class223.field4096;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2952 + class223.field4096 - class267.field4732;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2965 + class223.field4096 - class267.field4732;
                        if (var17 > class223.field4096 + class223.field4096) {
                            var17 = class223.field4096 + class223.field4096;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class93.field1776[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2947 = 5;
                            var1.field2941 = (var1.field2961 - class6.field144 << 8) / var13;
                            var1.field2960 = (var1.field2956 - class6.field144 << 8) / var13;
                            var1.field2963 = (var1.field2964 - class185.field3447 << 8) / var13;
                            var1.field2966 = (var1.field2959 - class185.field3447 << 8) / var13;
                            class68.field1178[class40.field623++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method94(int arg0, int arg1) {
        field205++;
        int var2 = -62 / ((-arg0 - 40) / 41);
        if (class133.field2379 == null || arg1 > class133.field2379.length) {
            class133.field2379 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method95(int arg0) {
        field204 = null;
        field198 = null;
        if (arg0 >= -5) {
            field204 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
    public abstract void method96(int arg0, int arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public abstract void method97(int arg0, int arg1, int arg2);
}
