import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class409 {

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[B")
    private byte[] field5613;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5609 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field5614;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Llc;")
    public class630 field5607;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public int[] field5602;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
    public int[] field5603;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
    public int[] field5605;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    public int[] field5606;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
    public int[] field5617;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
    public int[] field5621;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[Llc;")
    public class630[] field5618;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[[B")
    public byte[][] field5610;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[[I")
    public int[][] field5612;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "[[I")
    public int[][] field5616;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method2438(byte arg0) {
        field5611++;
        int[] var1 = new int[class98.field1307.field8493];
        int var2 = 0;
        for (int var3 = 0; var3 < class98.field1307.field8493; var3++) {
            class456 var6 = class98.field1307.method3391(0, var3);
            if (var6.field6515 >= 0 || var6.field6499 >= 0) {
                var1[var2++] = var3;
            }
        }
        int var4 = 17 % ((arg0 - 28) / 32);
        class552.field7723 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class552.field7723[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V")
    private final void method2439(byte[] arg0, byte arg1) {
        field5619++;
        class551 var3 = new class551(class521.method2903(-3874, arg0));
        int var4 = var3.method3045(-127);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5620 = var3.method3048(-4);
        } else {
            this.field5620 = 0;
        }
        int var5 = var3.method3045(-125);
        boolean var6 = (var5 & 0x1) != 0;
        if (arg1 > -67) {
            this.field5603 = null;
        }
        boolean var7 = (var5 & 0x2) != 0;
        this.field5614 = var3.method3090(-71);
        int var8 = 0;
        this.field5602 = new int[this.field5614];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field5614; var10++) {
            this.field5602[var10] = var8 += var3.method3090(-105);
            if (var9 < this.field5602[var10]) {
                var9 = this.field5602[var10];
            }
        }
        this.field5623 = var9 + 1;
        this.field5605 = new int[this.field5623];
        this.field5621 = new int[this.field5623];
        this.field5606 = new int[this.field5623];
        this.field5603 = new int[this.field5623];
        if (var7) {
            this.field5610 = new byte[this.field5623][];
        }
        this.field5616 = new int[this.field5623][];
        if (var6) {
            this.field5617 = new int[this.field5623];
            for (int var11 = 0; var11 < this.field5623; var11++) {
                this.field5617[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field5614; var12++) {
                this.field5617[this.field5602[var12]] = var3.method3048(-4);
            }
            this.field5607 = new class630(this.field5617);
        }
        for (int var13 = 0; var13 < this.field5614; var13++) {
            this.field5603[this.field5602[var13]] = var3.method3048(-4);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field5614; var14++) {
                byte[] var15 = new byte[64];
                var3.method3086(0, var15, true, 64);
                this.field5610[this.field5602[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field5614; var16++) {
            this.field5605[this.field5602[var16]] = var3.method3048(-4);
        }
        for (int var17 = 0; var17 < this.field5614; var17++) {
            this.field5621[this.field5602[var17]] = var3.method3090(-87);
        }
        for (int var18 = 0; var18 < this.field5614; var18++) {
            int var25 = this.field5602[var18];
            int var26 = this.field5621[var25];
            int var27 = 0;
            this.field5616[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field5616[var25][var29] = var27 += var3.method3090(-128);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field5606[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field5616[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field5612 = new int[var9 + 1][];
        this.field5618 = new class630[var9 + 1];
        for (int var19 = 0; var19 < this.field5614; var19++) {
            int var20 = this.field5602[var19];
            int var21 = this.field5621[var20];
            this.field5612[var20] = new int[this.field5606[var20]];
            for (int var22 = 0; var22 < this.field5606[var20]; var22++) {
                this.field5612[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field5616[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field5616[var20][var23];
                }
                this.field5612[var20][var24] = var3.method3048(-4);
            }
            this.field5618[var20] = new class630(this.field5612[var20]);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLth;I)V")
    public static final void method2440(byte arg0, class266 arg1, int arg2) {
        field5608++;
        if (class408.field5600) {
            arg2 = 0;
            class408.field5600 = false;
        }
        if (class436.field5933 == null || !class436.field5933.method1637((byte) -51, arg1)) {
            class436.field5933 = arg1;
            class249.field3129 = class348.method2175(-117);
            class595.field8584 = arg2;
            class57.field751 = arg2;
            if (class57.field751 == 0) {
                class642.method3708(-24507);
            } else {
                class247.field3113 = class251.field3142;
                class463.field6587 = class9.field80;
                class268.field3417 = class21.field302;
                class96.field1291 = class100.field1336;
                class224.field2868 = class510.field7108;
                class513.field7137 = class536.field7480;
                class463.field6596 = class483.field6759;
                class553.field7738 = class250.field3137;
                class135.field1656 = class435.field5911;
                class380.field5316 = class343.field4764;
            }
        }
        if (arg0 > -48) {
            field5609 = -70;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLbi;)V")
    public static final void method2441(boolean arg0, class466 arg1) {
        if (!arg0) {
            field5609 = 109;
        }
        class154.field2006 = arg1;
        field5604++;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI[B)V")
    public class409(byte[] arg0, int arg1, byte[] arg2) {
        this.field5622 = class381.method2317(115, arg0, arg0.length);
        if (this.field5622 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field5613 = class622.method3567(arg0.length, 0, 81, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field5613[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2439(arg0, (byte) -72);
    }
}
