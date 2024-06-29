import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class204 extends class103 {

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lda;")
    public static class275 field3465 = class255.method1672(100, "details");

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "Lma;")
    public static class105 field3470;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "Lfd;")
    public static class229 field3468;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
    public int[] field3462;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    public int[] field3467;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "[I")
    public int[] field3472;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[Llg;")
    public class266[] field3463;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "[Llg;")
    public class266[] field3469;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "[[[B")
    public byte[][][] field3473;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1330(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3466++;
        int var7 = 0;
        class82.method535(arg2, 1152);
        int var8 = arg2 - arg1;
        int var9 = arg2;
        int var10 = -arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg3 != 116) {
            method1331(31);
        }
        int var15 = arg4 - var8;
        int[] var16 = class19.field280[arg5];
        int var17 = arg4 + var8;
        class36.method216(var16, arg4 - arg2, arg6, -115, var15);
        class36.method216(var16, var15, arg0, -118, var17);
        class36.method216(var16, var17, arg6, arg3 ^ 0xFFFFFFF2, arg2 + arg4);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class124.field2218[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            var10 += var13;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class19.field280[arg5 + var9];
                    int[] var19 = class19.field280[arg5 - var9];
                    int var20 = class124.field2218[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class36.method216(var18, var22, arg6, arg3 - 235, var24);
                    class36.method216(var18, var24, arg0, arg3 - 236, var23);
                    class36.method216(var18, var23, arg6, -114, var21);
                    class36.method216(var19, var22, arg6, -118, var24);
                    class36.method216(var19, var24, arg0, -128, var23);
                    class36.method216(var19, var23, arg6, arg3 ^ 0xFFFFFFF5, var21);
                } else {
                    int[] var25 = class19.field280[arg5 + var9];
                    int[] var26 = class19.field280[arg5 - var9];
                    int var27 = arg4 - var7;
                    int var28 = arg4 + var7;
                    class36.method216(var25, var27, arg6, -119, var28);
                    class36.method216(var26, var27, arg6, -127, var28);
                }
            }
            int var29 = arg4 + var9;
            int[] var30 = class19.field280[arg5 - var7];
            int[] var31 = class19.field280[arg5 + var7];
            int var32 = arg4 - var9;
            if (var8 > var7) {
                int var33 = var7 <= var11 ? var11 : class124.field2218[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class36.method216(var31, var32, arg6, -119, var35);
                class36.method216(var31, var35, arg0, -116, var34);
                class36.method216(var31, var34, arg6, arg3 ^ 0xFFFFFFFC, var29);
                class36.method216(var30, var32, arg6, -115, var35);
                class36.method216(var30, var35, arg0, arg3 ^ 0xFFFFFFF4, var34);
                class36.method216(var30, var34, arg6, -114, var29);
            } else {
                class36.method216(var31, var32, arg6, arg3 ^ 0xFFFFFFF3, var29);
                class36.method216(var30, var32, arg6, -115, var29);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field3465 = null;
        field3468 = null;
        if (arg0 != 0) {
            method1331(-38);
        }
        field3470 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Lfd;BI)V")
    public static final void method1332(class229[] arg0, byte arg1, int arg2) {
        field3464++;
        int var3 = 0;
        if (arg1 > -80) {
            field3461 = 17;
        }
        while (arg0.length > var3) {
            class229 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3858 == 0) {
                    if (var4.field3942 != null) {
                        method1332(var4.field3942, (byte) -100, arg2);
                    }
                    class112 var5 = (class112) class267.field4633.method1871(0, (long) var4.field3879);
                    if (var5 != null) {
                        class37.method222(arg2, var5.field1977, (byte) -42);
                    }
                }
                if (arg2 == 0 && var4.field3975 != null) {
                    class99 var6 = new class99();
                    var6.field1678 = var4.field3975;
                    var6.field1677 = var4;
                    class177.method1192(var6, 200000);
                }
                if (arg2 == 1 && var4.field4013 != null) {
                    label62: {
                        if (var4.field3943 >= 0) {
                            class229 var7 = class261.method1709(var4.field3879, -90);
                            if (var7 == null || var7.field3942 == null || var7.field3942.length <= var4.field3943 || var7.field3942[var4.field3943] != var4) {
                                break label62;
                            }
                        }
                        class99 var8 = new class99();
                        var8.field1677 = var4;
                        var8.field1678 = var4.field4013;
                        class177.method1192(var8, 200000);
                    }
                }
            }
            var3++;
        }
    }
}
