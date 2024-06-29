import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class144 {

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    private int field74 = 0;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    private int field80 = 2000;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    private int field81 = 0;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    private int field88 = 16;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    private int field92 = 4096;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field78 = 0;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Ljava/lang/String;")
    public static String field86 = null;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "[I")
    public static int[] field87 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "[I")
    public static int[] field85 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "[J")
    public static long[] field72 = new long[500];

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "Lbc;")
    public static class282 field75;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "[[[Lab;")
    public static class133[][][] field94;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field77;
        if (arg2 != 20630) {
            field85 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field92 = arg1.method1380(true);
                        }
                    } else {
                        this.field74 = arg1.method1380(true);
                    }
                } else {
                    this.field88 = arg1.method1407(arg2 ^ 20713);
                }
            } else {
                this.field80 = arg1.method1380(true);
            }
        } else {
            this.field81 = arg1.method1407(124);
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field89;
        if (arg0 > -109) {
            this.method9(-8, (class216) null, 56);
        }
        class175.method1131((byte) -126);
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static final void method32(int arg0) {
        ++field83;
        if (class282.field4282 != null) {
            class282.field4282.method834((byte) -95);
        }
        if (class73.field878 != null) {
            class73.field878.method834((byte) -95);
        }
        if (arg0 < 7) {
            method38(-98);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqi;B)Lwg;")
    public static final class23 method33(class216 arg0, byte arg1) {
        ++field93;
        class23 var2 = new class23();
        var2.field277 = arg0.method1380(true);
        if (arg1 != 108) {
            field78 = -115;
        }
        var2.field285 = class20.method123(32767, var2.field277);
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IZI)Laf;")
    public static final class66 method34(int arg0, boolean arg1, int arg2) {
        class66 var3 = (class66) class246.field3578.method1895((long) arg2 | (long) arg0 << 32, -125);
        ++field91;
        if (!arg1) {
            method35(82);
        }
        if (var3 == null) {
            var3 = new class66(arg0, arg2);
            class246.field3578.method1894(-1, var3, var3.field4489);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
    public static final void method35(int arg0) {
        ++field90;
        class296.field4684.method942(arg0 ^ -18943);
        if (arg0 != 71) {
            field75 = null;
        }
        class296.field4676 = 1;
        class117.field1645 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V")
    public static final void method36(int arg0, int arg1) {
        ++field95;
        class66 var2 = method34(arg0, true, arg1);
        var2.method410(117);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field76;
        if (arg1 != 255) {
            method38(-82);
        }
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = this.field92 >> 1;
            int[][] var5 = super.field2069.method424(13793);
            Random var6 = new Random((long) this.field81);
            for (int var7 = 0; var7 < this.field80; ++var7) {
                int var8 = ~this.field92 < -1 ? this.field74 + class198.method1277((byte) 37, this.field92, var6) + -var4 : this.field74;
                int var9 = (var8 & 4091) >> 4;
                int var10 = class198.method1277((byte) 37, class104.field1411, var6);
                int var11 = class198.method1277((byte) 37, class257.field3727, var6);
                int var12 = (class9.field135[var9] * this.field88 >> 12) + var10;
                int var13 = (class287.field4477[var9] * this.field88 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = -var11 + var13;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                        var10 = var11;
                        var11 = var17;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = -var10 + var12;
                    int var22 = var11;
                    int var23 = -var11 + var13;
                    int var24 = -var21 / 2;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var25 = -(class198.method1277((byte) 37, 4096, var6) >> 2) + 1024;
                    int var26 = 2048 / var21;
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var24 += var23;
                        int var29 = class166.field2391 & var22;
                        int var30 = var28 & class112.field1487;
                        int var31 = var25 + 1024 - -((var28 - var10) * var26);
                        if (var16) {
                            var5[var29][var30] = var31;
                        } else {
                            var5[var30][var29] = var31;
                        }
                        if (var24 > 0) {
                            var22 += var27;
                            var24 += -var21;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method37(short[] arg0, String[] arg1, int arg2) {
        ++field73;
        if (arg2 < -52) {
            class38.method239((byte) 96, 0, arg1, arg0, arg1.length + -1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)V")
    public static final void method38(int arg0) {
        if (arg0 != -25444) {
            field85 = null;
        }
        class150.field2185 = false;
        class20.field247 = -3;
        ++field82;
        class240.field3484 = 1;
        class125.field1796 = -1;
        class63.field744 = 0;
        class37.field422 = 0;
        class238.field3427 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)V")
    public static void method39(int arg0) {
        field87 = null;
        field85 = null;
        field72 = null;
        field86 = null;
        field75 = null;
        field94 = null;
        if (arg0 >= -59) {
            field79 = -7;
        }
    }
}
