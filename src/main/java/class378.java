import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class378 {

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field5637;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
    public static boolean field5635 = false;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lao;")
    public static class188 field5631 = new class188(60, 2);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[F")
    public static float[] field5643 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field5639;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lqk;")
    public class14 field5629;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lhh;")
    public static class84 field5646;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[I")
    public int[] field5633;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public int[] field5634;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    public int[] field5636;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
    public int[] field5638;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
    public int[] field5640;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
    public int[] field5645;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[Lqk;")
    public class14[] field5641;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[[I")
    public int[][] field5628;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[[I")
    public int[][] field5630;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method2398(byte arg0) {
        field5643 = null;
        field5631 = null;
        if (arg0 == 26) {
            field5646 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIII)V")
    public static final void method2399(byte arg0, int arg1, int arg2, int arg3) {
        field5642++;
        if (arg0 <= 42) {
            field5631 = null;
        }
        class434 var4 = class483.method2888(arg1, 127, 9);
        var4.method2632((byte) 81);
        var4.field6310 = arg2;
        var4.field6314 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BB)V")
    private final void method2400(byte[] arg0, byte arg1) {
        field5647++;
        class303 var3 = new class303(class401.method2494(arg1 ^ 0x5D, arg0));
        int var4 = var3.method1918((byte) -118);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5644 = var3.method1870(arg1 ^ 0x8C0DA613);
        } else {
            this.field5644 = 0;
        }
        int var5 = var3.method1918((byte) -125);
        this.field5632 = var3.method1868(0);
        int var6 = 0;
        int var7 = -1;
        this.field5640 = new int[this.field5632];
        for (int var8 = 0; var8 < this.field5632; var8++) {
            this.field5640[var8] = var6 += var3.method1868(0);
            if (this.field5640[var8] > var7) {
                var7 = this.field5640[var8];
            }
        }
        this.field5639 = var7 + 1;
        this.field5634 = new int[this.field5639];
        this.field5638 = new int[this.field5639];
        this.field5628 = new int[this.field5639][];
        this.field5645 = new int[this.field5639];
        this.field5636 = new int[this.field5639];
        if (var5 != 0) {
            this.field5633 = new int[this.field5639];
            for (int var9 = 0; var9 < this.field5639; var9++) {
                this.field5633[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5632; var10++) {
                this.field5633[this.field5640[var10]] = var3.method1870(-1945262512);
            }
            this.field5629 = new class14(this.field5633);
        }
        for (int var11 = 0; var11 < this.field5632; var11++) {
            this.field5645[this.field5640[var11]] = var3.method1870(-1945262512);
        }
        if (arg1 != 67) {
            this.field5634 = null;
        }
        for (int var12 = 0; var12 < this.field5632; var12++) {
            this.field5636[this.field5640[var12]] = var3.method1870(arg1 - 1945262579);
        }
        for (int var13 = 0; var13 < this.field5632; var13++) {
            this.field5634[this.field5640[var13]] = var3.method1868(class113.method838(arg1, 67));
        }
        for (int var14 = 0; var14 < this.field5632; var14++) {
            int var21 = this.field5640[var14];
            int var22 = 0;
            int var23 = this.field5634[var21];
            int var24 = -1;
            this.field5628[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field5628[var21][var25] = var22 += var3.method1868(0);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field5638[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field5628[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5641 = new class14[var7 + 1];
        this.field5630 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field5632; var15++) {
            int var16 = this.field5640[var15];
            int var17 = this.field5634[var16];
            this.field5630[var16] = new int[this.field5638[var16]];
            for (int var18 = 0; var18 < this.field5638[var16]; var18++) {
                this.field5630[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field5628[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field5628[var16][var19];
                }
                this.field5630[var16][var20] = var3.method1870(-1945262512);
            }
            this.field5641[var16] = new class14(this.field5630[var16]);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BI)V")
    public class378(byte[] arg0, int arg1) {
        this.field5637 = class430.method2616(arg0, (byte) -66, arg0.length);
        if (this.field5637 != arg1) {
            throw new RuntimeException();
        }
        this.method2400(arg0, (byte) 67);
    }
}
