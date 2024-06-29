import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 implements class36 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lwh;")
    private class546 field173 = new class546(128);

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
    private int[] field184 = new int[class624.field8643.field5927];

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
    public int[] field180 = new int[class624.field8643.field5927];

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[Z")
    public static boolean[] field174 = new boolean[100];

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/lang/String;")
    public static String field183 = null;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
    public final void method86(int arg0, int arg1, byte arg2) {
        this.field184[arg0] = arg1;
        int var4 = 68 / ((76 - arg2) / 43);
        field179++;
        class678 var5 = (class678) this.field173.method3057(1, (long) arg0);
        if (var5 == null) {
            class678 var6 = new class678(4611686018427387905L);
            this.field173.method3061(123, (long) arg0, var6);
        } else if (var5.field9635 != 4611686018427387905L) {
            var5.field9635 = class529.method2982((byte) -69) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public final void method87(int arg0, int arg1, int arg2) {
        field185++;
        this.field180[arg1] = arg2;
        class678 var4 = (class678) this.field173.method3057(1, (long) arg1);
        if (arg0 != 23222) {
            this.method91(true, true);
        }
        if (var4 == null) {
            class678 var5 = new class678(class529.method2982((byte) -69) + 500L);
            this.field173.method3061(127, (long) arg1, var5);
        } else {
            var4.field9635 = class529.method2982((byte) -69) + 500L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field183 = null;
        field174 = null;
        if (arg0 != -8) {
            method88((byte) -2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method89(int arg0) {
        field182++;
        for (int var2 = 0; var2 < class624.field8643.field5927; var2++) {
            class76 var4 = class624.field8643.method2525(var2, 16);
            if (var4 != null && var4.field896 == 0) {
                this.field184[var2] = 0;
                this.field180[var2] = 0;
            }
        }
        int var3 = 56 % ((-arg0 - 68) / 54);
        this.field173 = new class546(128);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
    public final int method90(int arg0, int arg1) {
        field181++;
        class211 var3 = class632.field8745.method2755(arg1 ^ 0xFFFF995B, arg0);
        if (arg1 != 27158) {
            this.method91(true, false);
        }
        int var4 = var3.field2806;
        int var5 = var3.field2804;
        int var6 = var3.field2805;
        int var7 = class509.field7019[var6 - var5];
        return this.field180[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)I")
    public final int method91(boolean arg0, boolean arg1) {
        field176++;
        long var3 = class529.method2982((byte) -69);
        class678 var5 = arg0 ? (class678) this.field173.method3053((byte) 114) : (class678) this.field173.method3056(18113);
        if (!arg1) {
            return 99;
        }
        while (var5 != null) {
            if (var3 > (var5.field9635 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field9635 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field545;
                    this.field180[var6] = this.field184[var6];
                    var5.method242(true);
                    return var6;
                }
                var5.method242(true);
            }
            var5 = (class678) this.field173.method3056(18113);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
    public final void method92(int arg0, byte arg1, int arg2) {
        field177++;
        class211 var4 = class632.field8745.method2755(-3251, arg2);
        int var5 = var4.field2806;
        int var6 = var4.field2804;
        int var7 = var4.field2805;
        if (arg1 != -35) {
            field183 = null;
        }
        int var8 = class509.field7019[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method87(23222, var5, arg0 << var6 & var9 | this.field180[var5] & ~var9);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)I")
    public final int method93(byte arg0, int arg1) {
        if (arg0 == 104) {
            field178++;
            return this.field180[arg1];
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        field175++;
        class211 var4 = class632.field8745.method2755(-3251, arg2);
        int var5 = var4.field2806;
        int var6 = var4.field2804;
        int var7 = var4.field2805;
        int var8 = class509.field7019[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method86(var5, arg1 << var6 & var9 | this.field184[var5] & ~var9, (byte) 31);
        if (arg0 != 0) {
            this.field180 = null;
        }
    }
}
