import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class221 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[I")
    public static int[] field3597 = new int[3];

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[J")
    public static long[] field3606 = new long[1000];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljl;")
    public static class332 field3587 = new class332(50);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Ldi;")
    public class226 field3602;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[I")
    public int[] field3590;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public int[] field3592;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
    public static int[] field3595;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[I")
    public int[] field3600;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
    public int[] field3601;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
    public int[] field3605;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
    public int[] field3608;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[Ldi;")
    public class226[] field3603;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[[I")
    public int[][] field3588;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[[I")
    public int[][] field3599;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 4)
    public static void method1650(int arg0) {
        if (arg0 != -29060) {
            method1650(-86);
        }
        field3587 = null;
        field3597 = null;
        field3595 = null;
        field3606 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B)V", line = 45)
    private final void method1651(int arg0, byte[] arg1) {
        field3594++;
        class227 var3 = new class227(class130.method1000(9, arg1));
        int var4 = var3.method1720((byte) -50);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3593 = var3.method1715((byte) 113);
        } else {
            this.field3593 = 0;
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method1720((byte) -53);
        this.field3598 = var3.method1765(true);
        this.field3608 = new int[this.field3598];
        for (int var8 = 0; var8 < this.field3598; var8++) {
            this.field3608[var8] = var6 += var3.method1765(true);
            if (var5 < this.field3608[var8]) {
                var5 = this.field3608[var8];
            }
        }
        this.field3589 = var5 - arg0;
        this.field3590 = new int[this.field3589];
        this.field3601 = new int[this.field3589];
        this.field3592 = new int[this.field3589];
        this.field3599 = new int[this.field3589][];
        this.field3605 = new int[this.field3589];
        if (var7 != 0) {
            this.field3600 = new int[this.field3589];
            for (int var9 = 0; var9 < this.field3589; var9++) {
                this.field3600[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3598; var10++) {
                this.field3600[this.field3608[var10]] = var3.method1715((byte) -116);
            }
            this.field3602 = new class226(this.field3600);
        }
        for (int var11 = 0; var11 < this.field3598; var11++) {
            this.field3601[this.field3608[var11]] = var3.method1715((byte) -116);
        }
        for (int var12 = 0; var12 < this.field3598; var12++) {
            this.field3590[this.field3608[var12]] = var3.method1715((byte) 46);
        }
        for (int var13 = 0; var13 < this.field3598; var13++) {
            this.field3605[this.field3608[var13]] = var3.method1765(true);
        }
        for (int var14 = 0; var14 < this.field3598; var14++) {
            int var15 = 0;
            int var16 = this.field3608[var14];
            int var17 = this.field3605[var16];
            int var18 = -1;
            this.field3599[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field3599[var16][var19] = var15 += var3.method1765(true);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field3592[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field3599[var16] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field3588 = new int[var5 + 1][];
        this.field3603 = new class226[var5 + 1];
        for (int var21 = 0; var21 < this.field3598; var21++) {
            int var22 = this.field3608[var21];
            int var23 = this.field3605[var22];
            this.field3588[var22] = new int[this.field3592[var22]];
            for (int var24 = 0; var24 < this.field3592[var22]; var24++) {
                this.field3588[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3599[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3599[var22][var25];
                }
                this.field3588[var22][var26] = var3.method1715((byte) -110);
            }
            this.field3603[var22] = new class226(this.field3588[var22]);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([BI)V", line = 228)
    public class221(byte[] arg0, int arg1) {
        this.field3604 = class57.method477(arg0.length, arg0, false);
        if (this.field3604 != arg1) {
            throw new RuntimeException();
        }
        this.method1651(-1, arg0);
    }
}
