import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class360 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    private int field5624 = 0;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    private int field5631 = -1;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lll;")
    private class54 field5636 = new class54();

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Z")
    public boolean field5637 = false;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    private int field5628;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[Lol;")
    private class97[] field5623;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field5619;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[[I")
    private int[][] field5626;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
    public static boolean field5621 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    public static int[] field5618 = new int[4096];

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    public static boolean field5625;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field5638;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lfh;")
    public static class140 field5629;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lld;")
    public static class207 field5630;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)[[I", line = 8)
    public final int[][] method2501(int arg0) {
        field5620++;
        if (this.field5628 != this.field5619) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -1) {
            method2503(true, -5, 125, 45, (class96) null, -90);
        }
        for (int var2 = 0; var2 < this.field5619; var2++) {
            this.field5623[var2] = class247.field3599;
        }
        return this.field5626;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I", line = 31)
    public final int[] method2502(int arg0, int arg1) {
        field5622++;
        int var3 = -125 / ((8 - arg1) / 62);
        if (this.field5628 == this.field5619) {
            this.field5637 = this.field5623[arg0] == null;
            this.field5623[arg0] = class247.field3599;
            return this.field5626[arg0];
        } else if (this.field5619 == 1) {
            this.field5637 = this.field5631 != arg0;
            this.field5631 = arg0;
            return this.field5626[0];
        } else {
            class97 var4 = this.field5623[arg0];
            if (var4 == null) {
                this.field5637 = true;
                if (this.field5619 > this.field5624) {
                    var4 = new class97(arg0, this.field5624);
                    this.field5624++;
                } else {
                    class97 var5 = (class97) this.field5636.method416((byte) 113);
                    var4 = new class97(arg0, var5.field1276);
                    this.field5623[var5.field1279] = null;
                    var5.method179((byte) 51);
                }
                this.field5623[arg0] = var4;
            } else {
                this.field5637 = false;
            }
            this.field5636.method410(var4, (byte) -98);
            return this.field5626[var4.field1276];
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILgn;I)V", line = 100)
    public static final void method2503(boolean arg0, int arg1, int arg2, int arg3, class96 arg4, int arg5) {
        field5635++;
        if (arg4.field1256 == -1 && arg4.field1252 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class204.field2843 * arg4.field1273 >> 8;
        if (arg2 > arg4.field1258) {
            var6 += arg2 - arg4.field1258;
        } else if (arg4.field1268 > arg2) {
            var6 += arg4.field1268 - arg2;
        }
        if (arg5 > arg4.field1251) {
            var6 += arg5 - arg4.field1251;
        } else if (arg4.field1253 > arg5) {
            var6 += arg4.field1253 - arg5;
        }
        if (arg4.field1267 == 0 || arg4.field1267 < (var6 - 64) || class204.field2843 == 0 || arg4.field1272 != arg1) {
            if (arg4.field1260 != null) {
                class186.field2548.method2246(arg4.field1260);
                arg4.field1260 = null;
            }
            if (arg4.field1247 != null) {
                class186.field2548.method2246(arg4.field1247);
                arg4.field1247 = null;
            }
        } else if (!arg0) {
            var6 -= 64;
            if (var6 < 0) {
                var6 = 0;
            }
            int var8 = (arg4.field1267 - var6) * var7 / arg4.field1267;
            if (arg4.field1260 != null) {
                arg4.field1260.method825(var8);
            } else if (arg4.field1256 >= 0) {
                class269 var9 = class269.method1838(class17.field213, arg4.field1256, 0);
                if (var9 != null) {
                    class168 var10 = var9.method1839().method1249(class183.field2497);
                    class113 var11 = class113.method833(var10, 100, var8);
                    var11.method807(-1);
                    class186.field2548.method2250(var11);
                    arg4.field1260 = var11;
                }
            }
            if (arg4.field1247 != null) {
                arg4.field1247.method825(var8);
                if (!arg4.field1247.method177((byte) -102)) {
                    arg4.field1247 = null;
                }
            } else if (arg4.field1252 != null && (arg4.field1270 -= arg3) <= 0) {
                int var12 = (int) ((double) arg4.field1252.length * Math.random());
                class269 var13 = class269.method1838(class17.field213, arg4.field1252[var12], 0);
                if (var13 != null) {
                    class168 var14 = var13.method1839().method1249(class183.field2497);
                    class113 var15 = class113.method833(var14, 100, var8);
                    var15.method807(0);
                    class186.field2548.method2250(var15);
                    arg4.field1270 = (int) (Math.random() * (double) (arg4.field1257 - arg4.field1261)) + arg4.field1261;
                    arg4.field1247 = var15;
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5618[var0] = class119.method869(var0, 14005);
        }
        field5625 = false;
        field5632 = 0;
        field5627 = 1;
        field5638 = new int[2500];
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 252)
    public static void method2504(int arg0) {
        field5630 = null;
        field5629 = null;
        field5618 = null;
        int var1 = -96 / ((39 - arg0) / 56);
        field5638 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 265)
    public final void method2505(byte arg0) {
        field5633++;
        for (int var2 = 0; var2 < this.field5619; var2++) {
            this.field5626[var2] = null;
        }
        if (arg0 != -49) {
            this.method2505((byte) 102);
        }
        this.field5626 = (int[][]) null;
        this.field5623 = null;
        this.field5636.method409(1986850152);
        this.field5636 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V", line = 317)
    public class360(int arg0, int arg1, int arg2) {
        this.field5628 = arg1;
        this.field5623 = new class97[this.field5628];
        this.field5619 = arg0;
        this.field5626 = new int[this.field5619][arg2];
    }
}
