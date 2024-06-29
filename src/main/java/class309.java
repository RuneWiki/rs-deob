import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class309 extends class152 {

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    private int field5237 = 4096;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    private int field5236 = 16;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    private int field5241 = 0;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    private int field5240 = 0;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    private int field5245 = 2000;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lce;")
    public static class126 field5234 = class206.method1445(-7923, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "Z")
    public static boolean field5242 = false;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Lce;")
    public static class126 field5243 = class206.method1445(-7923, "Sprites geladen)3");

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "[I")
    public static int[] field5246 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "Lcc;")
    public static class313 field5239;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V", line = 5)
    public final void method2(byte arg0) {
        class158.method1159(-115);
        field5238++;
        int var2 = -67 % ((2 - arg0) / 37);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)[I", line = 18)
    public final int[] method6(boolean arg0, int arg1) {
        field5244++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = this.field5237 >> 1;
            int[][] var5 = this.field2776.method1796((byte) 123);
            Random var6 = new Random((long) this.field5241);
            for (int var7 = 0; var7 < this.field5245; var7++) {
                int var8 = this.field5237 <= 0 ? this.field5240 : this.field5240 + class244.method1675(var6, (byte) 110, this.field5237) - var4;
                int var9 = (var8 & 0xFF6) >> 4;
                int var10 = class244.method1675(var6, (byte) 110, class244.field4133);
                int var11 = class244.method1675(var6, (byte) 110, class143.field2599);
                int var12 = (class270.field4554[var9] * this.field5236 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class24.field344[var9] * this.field5236 >> 12) + var11;
                int var15 = var14 - var11;
                if (var13 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var13 < var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var11;
                        var11 = var14;
                        var14 = var19;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var14 - var11;
                    int var23 = 1024 - (class244.method1675(var6, (byte) 110, 4096) >> 2);
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var24 = var12 - var10;
                    int var25 = var11 >= var14 ? -1 : 1;
                    int var26 = -var24 / 2;
                    int var27 = 2048 / var24;
                    for (int var28 = var10; var28 < var12; var28++) {
                        int var29 = (var28 - var10) * var27 + var23 + 1024;
                        int var30 = var28 & class321.field5490;
                        int var31 = var21 & class314.field5378;
                        var26 += var22;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var26 > 0) {
                            var21 += var25;
                            var26 -= var24;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            field5243 = (class126) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILja;IJIIII)Z", line = 151)
    public static final boolean method2110(int arg0, int arg1, int arg2, int arg3, class114 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class231.method1575(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfh;I)V", line = 165)
    public static final void method2111(class282 arg0, int arg1) {
        class172.method1253(arg1, true, arg0);
        field5235++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 179)
    public class309() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 186)
    public static final void method2112(boolean arg0) {
        if (arg0) {
            class297.field4940 = class307.field5211;
            class264.field4396 = class177.field3122;
            class89.field1398 = class25.field359;
        } else {
            class297.field4940 = class293.field4860;
            class264.field4396 = class320.field5486;
            class89.field1398 = class319.field5461;
        }
        class228.field3848 = class297.field4940.length;
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V", line = 230)
    public static void method2113(int arg0) {
        field5239 = null;
        if (arg0 == 742) {
            field5234 = null;
            field5243 = null;
            field5246 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V", line = 248)
    public static final void method2114(int arg0) {
        for (int var1 = -1; var1 < class239.field4036; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class166.field2958[var1];
            }
            class301 var3 = class85.field1352[var2];
            if (var3 != null && var3.field2456 > 0) {
                var3.field2456--;
                if (var3.field2456 == 0) {
                    var3.field2446 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class30.field425; var4++) {
            int var5 = class279.field4639[var4];
            class89 var6 = class199.field3391[var5];
            if (var6 != null && var6.field2456 > 0) {
                var6.field2456--;
                if (var6.field2456 == 0) {
                    var6.field2446 = null;
                }
            }
        }
        if (arg0 != 1024) {
            field5242 = true;
        }
        field5247++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILbb;)V", line = 306)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            return;
        }
        if (arg1 == 0) {
            this.field5241 = arg2.method948(arg0 ^ 0xFFFFFF89);
        } else if (arg1 == 1) {
            this.field5245 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field5236 = arg2.method948(-122);
        } else if (arg1 == 3) {
            this.field5240 = arg2.method942(true);
        } else if (arg1 == 4) {
            this.field5237 = arg2.method942(true);
        }
        field5233++;
    }
}
