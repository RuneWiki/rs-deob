import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 {

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private int field629 = 32;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "J")
    private long field625 = class4.method31((byte) 47);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "Z")
    private boolean field637 = true;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    private int field639 = 0;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    private int field643 = 0;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[Lli;")
    private class129[] field648 = new class129[8];

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    private int field647 = 0;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "[Lli;")
    private class129[] field641 = new class129[8];

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "J")
    private long field645 = 0L;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "J")
    private long field646 = 0L;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lkh;")
    public static class117 field621 = class224.method1450((byte) 116, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public static int[] field616 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[Lkh;")
    public static class117[] field612 = new class117[500];

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Z")
    public static boolean field624 = true;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
    public static int[] field628 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lli;")
    private class129 field627;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[I")
    public int[] field636;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLli;)V")
    public final synchronized void method212(boolean arg0, class129 arg1) {
        if (!arg0) {
            this.method216();
        }
        this.field627 = arg1;
        field615++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public void method213() throws Exception {
        field631++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method214(int arg0) {
        field623++;
        class78.field1482.method410((byte) 71);
        int var1 = -24 / ((arg0 - 58) / 38);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public final synchronized void method215(byte arg0) {
        field622++;
        if (class187.field3350 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class187.field3350.field3921[var3] == this) {
                    class187.field3350.field3921[var3] = null;
                }
                if (class187.field3350.field3921[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class187.field3350.field3917 = true;
                while (class187.field3350.field3920) {
                    class165.method1167(-22942, 50L);
                }
                class187.field3350 = null;
            }
        }
        if (arg0 <= -46) {
            this.method216();
            this.field636 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public void method216() {
        field633++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public final void method217(byte arg0) {
        this.field637 = true;
        if (arg0 != 33) {
            this.method212(true, null);
        }
        field630++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    private final void method218(int arg0, int arg1) {
        this.field639 -= arg1;
        if (this.field639 < 0) {
            this.field639 = 0;
        }
        if (arg0 != 31153) {
            this.method225(null, -27, 67);
        }
        field634++;
        if (this.field627 != null) {
            this.field627.method347(arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    public final synchronized void method219(byte arg0) {
        field610++;
        if (this.field636 == null) {
            return;
        }
        int var2 = 51 % ((59 - arg0) / 55);
        long var3 = class4.method31((byte) 47);
        try {
            if (this.field646 != 0L) {
                if (var3 < this.field646) {
                    return;
                }
                this.method228(this.field640);
                this.field646 = 0L;
                this.field637 = true;
            }
            int var5 = this.method221();
            if (this.field643 - var5 > this.field642) {
                this.field642 = this.field643 - var5;
            }
            int var6 = this.field644 + this.field638;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field640) {
                this.field640 += 1024;
                var5 = 0;
                if (this.field640 > 16384) {
                    this.field640 = 16384;
                }
                this.method216();
                this.method228(this.field640);
                if (var6 + 256 > this.field640) {
                    var6 = this.field640 - 256;
                    this.field638 = var6 - this.field644;
                }
                this.field637 = true;
            }
            while (var5 < var6) {
                var5 += 256;
                this.method227(this.field636, 256);
                this.method213();
            }
            if (this.field645 < var3) {
                if (this.field637) {
                    this.field637 = false;
                } else if (this.field642 == 0 && this.field647 == 0) {
                    this.method216();
                    this.field646 = var3 + 2000L;
                    return;
                } else {
                    this.field638 = Math.min(this.field647, this.field642);
                    this.field647 = this.field642;
                }
                this.field645 = var3 + 2000L;
                this.field642 = 0;
            }
            this.field643 = var5;
        } catch (Exception var8) {
            this.method216();
            this.field646 = var3 + 2000L;
        }
        try {
            if (this.field625 + 500000L < var3) {
                var3 = this.field625;
            }
            while (this.field625 + 5000L < var3) {
                this.method218(31153, 256);
                this.field625 += 256000 / class214.field3883;
            }
        } catch (Exception var7) {
            this.field625 = var3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lkh;I)Z")
    public static final boolean method220(class117 arg0, int arg1) {
        field626++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class151.field2744; var2++) {
            if (arg0.method789(class68.field1301[var2], -118)) {
                return true;
            }
        }
        return arg0.method789(class93.field1712.field1141, -102);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
    public int method221() throws Exception {
        field618++;
        return this.field640;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public static final void method222(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method222(-80, -11, -62);
        }
        if (class115.field2146 != arg0) {
            class70.field1350 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class70.field1350[var3] = (var3 << 12) / arg0;
            }
            class115.field2146 = arg0;
            class3.field27 = arg0 == 64 ? 2048 : 4096;
            class34.field801 = arg0 - 1;
        }
        field613++;
        if (class57.field1185 == arg2) {
            return;
        }
        if (class115.field2146 == arg2) {
            class143.field2583 = class70.field1350;
        } else {
            class143.field2583 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class143.field2583[var4] = (var4 << 12) / arg2;
            }
        }
        class101.field1839 = arg2 - 1;
        class57.field1185 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method223(Component arg0) throws Exception {
        field614++;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public void method224() throws Exception {
        field611++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lli;II)V")
    private final void method225(class129 arg0, int arg1, int arg2) {
        int var4 = arg1 >> 5;
        if (arg2 > -114) {
            method229(-3);
        }
        class129 var5 = this.field641[var4];
        field619++;
        if (var5 == null) {
            this.field648[var4] = arg0;
        } else {
            var5.field2380 = arg0;
        }
        this.field641[var4] = arg0;
        arg0.field2381 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final synchronized void method226(int arg0) {
        this.field637 = true;
        try {
            this.method224();
            if (arg0 != 2000) {
                this.field640 = -36;
            }
        } catch (Exception var2) {
            this.method216();
            this.field646 = class4.method31((byte) 47) + 2000L;
        }
        field617++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([II)V")
    private final void method227(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class66.field1271) {
            var3 = arg1 << 1;
        }
        class2.method7(arg0, 0, var3);
        this.field639 -= arg1;
        if (this.field627 != null && this.field639 <= 0) {
            this.field639 += class214.field3883 >> 4;
            class157.method1112(-17921, this.field627);
            this.method225(this.field627, this.field627.method881(), -119);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class129 var10 = null;
                        class129 var11 = this.field648[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class152 var12 = var11.field2382;
                                if (var12 == null || var12.field2753 <= var8) {
                                    var11.field2383 = true;
                                    int var13 = var11.method348();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2753 += var13;
                                    }
                                    if (var4 >= this.field629) {
                                        break label107;
                                    }
                                    class129 var14 = var11.method344();
                                    if (var14 != null) {
                                        int var15 = var11.field2381;
                                        while (var14 != null) {
                                            this.method225(var14, var15 * var14.method881() >> 8, -117);
                                            var14 = var11.method345();
                                        }
                                    }
                                    class129 var16 = var11.field2380;
                                    var11.field2380 = null;
                                    if (var10 == null) {
                                        this.field648[var7] = var16;
                                    } else {
                                        var10.field2380 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field641[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2380;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class129 var18 = this.field648[var17];
                this.field648[var17] = this.field641[var17] = null;
                while (var18 != null) {
                    class129 var19 = var18.field2380;
                    var18.field2380 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field639 < 0) {
            this.field639 = 0;
        }
        if (this.field627 != null) {
            this.field627.method341(arg0, 0, arg1);
        }
        this.field625 = class4.method31((byte) 47);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public void method228(int arg0) throws Exception {
        field632++;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method229(int arg0) {
        field616 = null;
        field621 = null;
        field612 = null;
        if (arg0 != 0) {
            field628 = null;
        }
        field628 = null;
    }
}
