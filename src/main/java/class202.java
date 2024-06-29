import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class202 extends class529 {

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
    public boolean field3071;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[Lsd;")
    public class202[] field3065;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lbi;")
    public static class104 field3080;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "J")
    public static long field3078;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Lhm;")
    public class166 field3081;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Ltd;")
    public class379 field3064;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
    public static final boolean method1373(int arg0, int arg1, int arg2) {
        if (arg1 == -21682) {
            field3073++;
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public void method51(int arg0) {
        field3062++;
        int var2 = -2 / ((arg0 - 80) / 46);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
    public int method1145(int arg0) {
        field3068++;
        if (arg0 != 0) {
            this.method1382(42, -124, 40);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method1374(boolean arg0) {
        field3080 = null;
        if (!arg0) {
            field3078 = -29L;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILma;II)V")
    public static final void method1375(int arg0, int arg1, class454 arg2, int arg3, int arg4) {
        field3074++;
        long var5 = (long) (arg3 << 28 | arg4 << 14 | arg1);
        class257 var7 = (class257) class328.field5157.method1122((byte) 59, var5);
        if (var7 == null) {
            class257 var8 = new class257();
            class328.field5157.method1127(var8, (byte) 123, var5);
            var8.field4153.method2124(arg2, (byte) 87);
            return;
        }
        class196 var9 = class337.field5262.method2077((byte) -65, arg2.field7033);
        int var10 = var9.field3020;
        if (var9.field2973 == 1) {
            var10 = (arg2.field7025 + 1) * var10;
        }
        if (arg0 != -6407) {
            return;
        }
        for (class454 var11 = (class454) var7.field4153.method2123(arg0 + 6287); var11 != null; var11 = (class454) var7.field4153.method2126((byte) 61)) {
            class196 var12 = class337.field5262.method2077((byte) -65, var11.field7033);
            int var13 = var12.field3020;
            if (var12.field2973 == 1) {
                var13 = (var11.field7025 + 1) * var13;
            }
            if (var10 > var13) {
                class523.method3124(var11, arg0 + 6406, arg2);
                return;
            }
        }
        var7.field4153.method2124(arg2, (byte) 96);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)[I")
    public final int[] method1376(int arg0, int arg1, int arg2) {
        field3070++;
        if (arg0 != 1046794076) {
            method1381(-3, 24);
        }
        return this.field3065[arg1].field3071 ? this.field3065[arg1].method41(arg2, true) : this.field3065[arg1].method44(arg0 ^ 0xC19B30A3, arg2)[0];
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static final void method1377(boolean arg0) {
        if (arg0) {
            class217.field3699 = class165.field2386;
            class53.field732 = class103.field1520;
        } else {
            class217.field3699 = class513.field7614;
            class53.field732 = class244.field3956;
        }
        class297.field4675 = class217.field3699.length;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)I")
    public int method1378(boolean arg0) {
        field3069++;
        return arg0 ? -1 : -2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILkj;IIIBI)V")
    public static final void method1379(int arg0, class55 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3075++;
        if (arg5 >= -83) {
            method1375(-21, -122, null, -69, 102);
        }
        class238.method1670(arg1.field6417, arg0, 0, arg1.field6410, arg4, arg6, arg1.field6419, arg3, -7, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static final void method1380(int arg0) {
        field3082++;
        class339.field5293 = null;
        class170.field2487 = null;
        class96.field1399 = null;
        class378.field5800 = null;
        class541.field7907 = null;
        class171.field2494 = false;
        if (arg0 != -1433) {
            method1379(-106, null, 0, -25, 31, (byte) -69, 71);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public int[][] method44(int arg0, int arg1) {
        field3072++;
        if (arg0 == -1) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public void method1147(byte arg0) {
        if (arg0 > -63) {
            return;
        }
        if (this.field3071) {
            this.field3064.method2449(true);
            this.field3064 = null;
        } else {
            this.field3081.method1052(-12722);
            this.field3081 = null;
        }
        field3076++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lhw;BI)V")
    public void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -118 % ((arg1 + 46) / 50);
        field3077++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)[I")
    public int[] method41(int arg0, boolean arg1) {
        if (arg1) {
            field3084++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
    public static final int method1381(int arg0, int arg1) {
        field3067++;
        if (arg0 != -32842) {
            return -101;
        } else if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IZ)V")
    public class202(int arg0, boolean arg1) {
        this.field3071 = arg1;
        this.field3065 = new class202[arg0];
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)[[I")
    public final int[][] method1382(int arg0, int arg1, int arg2) {
        field3083++;
        int var4 = -8 % ((-arg2 - 30) / 48);
        if (this.field3065[arg0].field3071) {
            int[] var5 = this.field3065[arg0].method41(arg1, true);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field3065[arg0].method44(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)V")
    public void method1142(int arg0, int arg1, int arg2) {
        field3063++;
        int var4 = this.field3066 == 255 ? arg1 : this.field3066;
        int var5 = 60 % ((arg0 + 16) / 58);
        if (this.field3071) {
            this.field3064 = new class379(var4, arg1, arg2);
        } else {
            this.field3081 = new class166(var4, arg1, arg2);
        }
    }

    static {
        new class213("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3079 = 500;
        field3080 = new class104(80, 5);
    }
}
