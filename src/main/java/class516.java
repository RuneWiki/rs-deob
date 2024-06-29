import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class516 extends class376 {

    @OriginalMember(owner = "client!au", name = "U", descriptor = "Z")
    public boolean field7610 = true;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "[I")
    public static int[] field7592 = new int[32];

    @OriginalMember(owner = "client!au", name = "P", descriptor = "[I")
    public static int[] field7605 = new int[2];

    @OriginalMember(owner = "client!au", name = "T", descriptor = "I")
    public static int field7609 = 1337;

    @OriginalMember(owner = "client!au", name = "V", descriptor = "Lgk;")
    public static class331 field7611;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!au", name = "Q", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!au", name = "S", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "Ll;")
    public static class16 field7597;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "Lgh;")
    public class383 field7601;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "[I")
    public int[] field7589;

    @OriginalMember(owner = "client!au", name = "O", descriptor = "[I")
    private int[] field7604;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "[Ljava/lang/String;")
    private String[] field7598;

    @OriginalMember(owner = "client!au", name = "R", descriptor = "[[I")
    private int[][] field7607;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)Lho;")
    public final class102 method3061(int arg0, int arg1) {
        field7590++;
        if (this.field7604 == null || arg0 < 0 || this.field7604.length < arg0) {
            return null;
        } else {
            int var3 = 48 % ((-arg1 - 37) / 41);
            return class232.method1558(this.field7604[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZI)I")
    public final int method3062(int arg0, boolean arg1, int arg2) {
        field7591++;
        if (arg1) {
            field7611 = null;
        }
        if (this.field7604 == null || arg2 < 0 || this.field7604.length < arg2) {
            return -1;
        } else if (this.field7607[arg2] == null || arg0 < 0 || arg0 > this.field7607[arg2].length) {
            return -1;
        } else {
            return this.field7607[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method3063(int arg0) {
        if (this.field7589 != null) {
            for (int var2 = 0; var2 < this.field7589.length; var2++) {
                this.field7589[var2] = class244.method1606(this.field7589[var2], 32768);
            }
        }
        int var3 = 96 % ((9 - arg0) / 63);
        field7608++;
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method3064(int arg0) {
        field7594++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field7598 == null) {
            return "";
        }
        var2.append(this.field7598[arg0]);
        for (int var3 = 1; var3 < this.field7598.length; var3++) {
            var2.append("...");
            var2.append(this.field7598[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)V")
    public static void method3065(int arg0) {
        field7597 = null;
        field7611 = null;
        field7605 = null;
        field7592 = null;
        if (arg0 < 100) {
            field7611 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B[ILiv;)V")
    public final void method3066(byte arg0, int[] arg1, class65 arg2) {
        field7593++;
        if (arg0 <= 22) {
            field7592 = null;
        }
        if (this.field7604 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field7604.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = this.method3061(var4, 122).field1426;
            if (var5 > 0) {
                arg2.method613(var5, (long) arg1[var4], (byte) 12);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Liv;I)V")
    public final void method3067(class65 arg0, int arg1) {
        if (arg1 != 9536) {
            return;
        }
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                field7595++;
                return;
            }
            this.method3070(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)I")
    public final int method3068(int arg0) {
        field7603++;
        if (arg0 != 0) {
            this.field7604 = null;
        }
        return this.field7604 == null ? 0 : this.field7604.length;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Liv;I)Ljava/lang/String;")
    public final String method3069(class65 arg0, int arg1) {
        field7599++;
        if (arg1 != -127) {
            this.method3064(-72);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field7604 != null) {
            for (int var4 = 0; var4 < this.field7604.length; var4++) {
                var3.append(this.field7598[var4]);
                var3.append(this.field7601.method2332(this.method3061(var4, 6), (byte) -123, this.field7607[var4], arg0.method579(arg1 ^ 0x5FFE, class232.method1558(this.field7604[var4], 0).field1428)));
            }
        }
        var3.append(this.field7598[this.field7598.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Liv;IZ)V")
    private final void method3070(class65 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field7600 = 37;
        }
        field7606++;
        if (arg1 == 1) {
            this.field7598 = class92.method817((byte) -84, arg0.method624((byte) -40), '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method577(255);
            this.field7589 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7589[var5] = arg0.method623((byte) -39);
            }
            return;
        } else if (arg1 == 3) {
            int var6 = arg0.method577(255);
            this.field7607 = new int[var6][];
            this.field7604 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method623((byte) 117);
                class102 var9 = class232.method1558(var8, 0);
                if (var9 != null) {
                    this.field7604[var7] = var8;
                    this.field7607[var7] = new int[var9.field1427];
                    for (int var10 = 0; var10 < var9.field1427; var10++) {
                        this.field7607[var7][var10] = arg0.method623((byte) 121);
                    }
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field7610 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)I")
    public static final int method3071(int arg0, int arg1, int arg2) {
        field7602++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 != 0) {
            method3065(-54);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field7592[var1] = var0 - 1;
            var0 += var0;
        }
        field7611 = new class331("Examine", "Untersuchen", "Examiner", "Examinar");
    }
}
