import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class255 {

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "Z")
    public boolean field646 = false;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "Ljj;")
    private class103 field624;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Z")
    private boolean field637;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "Z")
    private boolean field640;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "[I")
    public static int[] field629 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Leb;")
    public static class230 field634 = class68.method589(0, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[B")
    public static byte[] field638 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "Leb;")
    public static class230 field643 = class68.method589(0, "gleiten:");

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[Lnd;")
    public static class250[] field621 = new class250[4];

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "Leb;")
    public static class230 field645 = class68.method589(0, "blinken2:");

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Leb;")
    private static class230 field636 = class68.method589(0, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "Leb;")
    public static class230 field647 = class68.method589(0, "Wordpack geladen)3");

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Leb;")
    public static class230 field633 = field636;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "F")
    private float field631;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!va", name = "ob", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Lkk;")
    public static class223 field622;

    @OriginalMember(owner = "client!va", name = "pb", descriptor = "[I")
    private int[] field649;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field621 = null;
        field638 = null;
        field634 = null;
        field633 = null;
        field636 = null;
        field647 = null;
        int var1 = -82 / ((76 - arg0) / 39);
        field643 = null;
        field629 = null;
        field622 = null;
        field645 = null;
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field628++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILkk;Lnb;)Z")
    public final boolean method311(int arg0, class223 arg1, class199 arg2) {
        field635++;
        if (arg0 != 4) {
            this.method314((byte) 18, -61);
        }
        return this.field624.method866(arg2, arg1, -1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkk;ZBLnb;)[I")
    public final int[] method312(class223 arg0, boolean arg1, byte arg2, class199 arg3) {
        field630++;
        if (arg2 > -127) {
            this.method314((byte) 60, 92);
        }
        if (this.field624.method866(arg3, arg0, -1)) {
            int var5 = arg1 ? 64 : 128;
            return this.field624.method869(false, 1.0D, var5, arg0, true, var5, arg3, this.field640);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public static final void method313(int arg0) {
        field648++;
        if (arg0 <= -107) {
            class209.field3651.method1124(0);
            class227.field3921.method1124(0);
            class15.field337.method1124(0);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
    public final void method314(byte arg0, int arg1) {
        field642++;
        if (this.field649 == null) {
            return;
        }
        if (this.field623 != 0 || this.field625 != 0) {
            if (class114.field2047 == null || this.field649.length > class114.field2047.length) {
                class114.field2047 = new int[this.field649.length];
            }
            int var3 = this.field649.length;
            int var4 = this.field625 * arg1;
            int var5 = this.field649.length == 4096 ? 64 : 128;
            int var6 = var5 - 1;
            int var7 = arg1 * var5 * this.field623;
            int var8 = var3 - 1;
            for (int var9 = 0; var9 < var3; var9 += var5) {
                int var11 = var8 & var9 + var7;
                for (int var12 = 0; var12 < var5; var12++) {
                    int var13 = var9 + var12;
                    int var14 = (var6 & var4 + var12) + var11;
                    class114.field2047[var13] = this.field649[var14];
                }
            }
            int[] var10 = this.field649;
            this.field649 = class114.field2047;
            class114.field2047 = var10;
        }
        if (arg0 != 124) {
            this.method317(-0.49660727F, (class199) null, true, -100, (class223) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Leb;ILkk;)Loj;")
    public static final class156 method315(class230 arg0, int arg1, class223 arg2) {
        field644++;
        if (arg1 <= 114) {
            method313(51);
        }
        int var3 = arg2.method1521(8994, arg0);
        if (var3 == -1) {
            return new class156(0);
        }
        int[] var4 = arg2.method1535(var3, (byte) 84);
        class156 var5 = new class156(var4.length);
        for (int var6 = 0; var6 < var5.field2775; var6++) {
            class14 var7 = new class14(arg2.method1546(var4[var6], (byte) -100, var3));
            var5.field2777[var6] = var7.method171((byte) 79);
            var5.field2792[var6] = var7.method198(false);
            var5.field2782[var6] = (short) var7.method161(4);
            var5.field2780[var6] = (short) var7.method161(4);
            var5.field2776[var6] = var7.method187((byte) 61);
        }
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBI)V")
    public static final void method316(int arg0, byte arg1, int arg2) {
        class135.field2431++;
        field627++;
        if (arg1 != 15) {
            method315((class230) null, -98, (class223) null);
        }
        class153.field2747.method978(119, 27);
        class153.field2747.method192(arg2, false);
        class153.field2747.method165(arg0, 1380186760);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FLnb;ZILkk;)[I")
    public final int[] method317(float arg0, class199 arg1, boolean arg2, int arg3, class223 arg4) {
        if (arg3 != 2) {
            this.method314((byte) -76, 113);
        }
        field632++;
        if (this.field649 == null || this.field631 != arg0) {
            if (!this.field624.method866(arg1, arg4, -1)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field649 = this.field624.method869(true, (double) arg0, var6, arg4, true, var6, arg1, this.field640);
            this.field631 = arg0;
            if (this.field637) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field649[var13];
                        var7[var34] += class189.method1350(255, var35 >> 16);
                        var9[var34] += class189.method1350(var35, 65382) >> 8;
                        var8[var34] += class189.method1350(var35, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var24 += var7[var21];
                        var23 += var8[var21];
                        var22 += var9[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        var21--;
                        int var31 = var22 / 9;
                        var25--;
                        int var32 = var23 / 9;
                        int var33 = var24 / 9;
                        var19--;
                        var10[var19] = class177.method1290(class177.method1290(var33 << 16, var31 << 8), var32);
                        var24 += var7[var21] - var7[var25];
                        var23 += var8[var21] - var8[var25];
                        var22 += var9[var21] - var9[var25];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field649[var13];
                        var14--;
                        int var30 = this.field649[var14];
                        var7[var28] += -(class189.method1350(16723952, var30) >> 16) + class189.method1350(255, var29 >> 16);
                        var9[var28] += class189.method1350(var29 >> 8, 255) - (class189.method1350(65535, var30) >> 8);
                        var8[var28] += -class189.method1350(255, var30) + class189.method1350(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field649 = var10;
            }
        }
        return this.field649;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lfk;)V")
    public class34(class14 arg0) {
        this.field624 = new class103(arg0);
        this.field637 = arg0.method200(255) == 1;
        this.field640 = arg0.method200(255) == 1;
        arg0.method200(255);
        arg0.method200(255);
        int var2 = arg0.method200(255) & 0x3;
        this.field625 = arg0.method198(false);
        this.field623 = arg0.method198(false);
        arg0.method200(255);
        arg0.method200(255);
    }
}
