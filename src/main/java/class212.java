import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class212 {

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    private int field3642 = -1;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    private int field3647 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lbb;")
    private class90 field3638 = new class90();

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Z")
    public boolean field3655 = false;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    private int field3641;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    private int field3650;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "[Lj;")
    private class164[] field3652;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[[I")
    private int[][] field3640;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lp;")
    public static class280 field3637 = class18.method140((byte) -123, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lp;")
    public static class280 field3651 = class18.method140((byte) -121, "gleiten:");

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lsb;")
    public static class221 field3654 = new class221(4);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lak;")
    public static class137 field3646;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[I")
    public final int[] method1417(byte arg0, int arg1) {
        if (arg0 <= 63) {
            this.method1422(119);
        }
        field3643++;
        if (this.field3650 == this.field3641) {
            this.field3655 = this.field3652[arg1] == null;
            this.field3652[arg1] = class275.field4771;
            return this.field3640[arg1];
        } else if (this.field3650 == 1) {
            this.field3655 = this.field3642 != arg1;
            this.field3642 = arg1;
            return this.field3640[0];
        } else {
            class164 var3 = this.field3652[arg1];
            if (var3 == null) {
                this.field3655 = true;
                if (this.field3647 < this.field3650) {
                    var3 = new class164(arg1, this.field3647);
                    this.field3647++;
                } else {
                    class164 var4 = (class164) this.field3638.method646((byte) 22);
                    var3 = new class164(arg1, var4.field2882);
                    this.field3652[var4.field2879] = null;
                    var4.method1146(26159);
                }
                this.field3652[arg1] = var3;
            } else {
                this.field3655 = false;
            }
            this.field3638.method645(-126, var3);
            return this.field3640[var3.field2882];
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method1418(boolean arg0) {
        field3651 = null;
        field3637 = null;
        field3646 = null;
        field3654 = null;
        if (!arg0) {
            method1421(-62, 53);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public static final void method1419(boolean arg0, int arg1) {
        for (class161 var2 = class167.field2924.method142(true); var2 != null; var2 = class167.field2924.method143((byte) -123)) {
            if ((var2.field2827 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1146(26159);
            }
        }
        if (arg0) {
            field3654 = null;
        }
        field3644++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)[[I")
    public final int[][] method1420(int arg0) {
        field3645++;
        if (this.field3650 != this.field3641) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3650; var2++) {
            this.field3652[var2] = class275.field4771;
        }
        return this.field3640;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public static final void method1421(int arg0, int arg1) {
        class248.field4343.method1478(arg0, 84);
        field3649++;
        class245.field4305.method1478(arg0, 81);
        class30.field566.method1478(arg0, 77);
        int var2 = -48 % ((49 - arg1) / 60);
        class261.field4616.method1478(arg0, 82);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method1422(int arg0) {
        field3653++;
        int var2 = 0;
        if (arg0 != -179236862) {
            this.field3647 = 45;
        }
        while (this.field3650 > var2) {
            this.field3640[var2] = null;
            var2++;
        }
        this.field3652 = null;
        this.field3640 = null;
        this.field3638.method639(95);
        this.field3638 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB[B)Z")
    public static final boolean method1423(int arg0, int arg1, byte arg2, byte[] arg3) {
        boolean var4 = true;
        field3639++;
        class25 var5 = new class25(arg3);
        if (arg2 > -91) {
            return false;
        }
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method190(32767);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var12;
                class130 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method210(65536);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method189((byte) -103);
                                    }
                                    int var10 = var5.method210(65536);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method189((byte) -103) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg1 + var13;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class32.method277((byte) -63, var6);
                } while (var12 == 22 && !class12.field252 && var16.field2302 == 0 && var16.field2281 != 1 && !var16.field2248);
                var9 = true;
                if (!var16.method903(1)) {
                    class123.field2160++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
    public class212(int arg0, int arg1, int arg2) {
        this.field3641 = arg1;
        this.field3650 = arg0;
        this.field3652 = new class164[this.field3641];
        this.field3640 = new int[this.field3650][arg2];
    }
}
