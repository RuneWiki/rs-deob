import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class557 extends class408 {

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "Ljava/lang/String;")
    public String field7941;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "Z")
    public static boolean field7949;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "[C")
    public char[] field7944;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "[C")
    public char[] field7951;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "[I")
    public int[] field7947;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
    public int[] field7950;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IC)I")
    public final int method3244(int arg0, char arg1) {
        field7939++;
        if (this.field7947 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field7947.length; var3++) {
            if (this.field7944[var3] == arg1) {
                return this.field7947[var3];
            }
        }
        if (arg0 != -3) {
            this.field7950 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(CI)I")
    public final int method3245(char arg0, int arg1) {
        field7940++;
        if (this.field7950 == null) {
            return -1;
        } else if (arg1 == -4845) {
            for (int var3 = 0; var3 < this.field7950.length; var3++) {
                if (this.field7951[var3] == arg0) {
                    return this.field7950[var3];
                }
            }
            return -1;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILrg;)V")
    public final void method3246(int arg0, class645 arg1) {
        field7943++;
        if (arg0 <= 15) {
            method3250(-21);
        }
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                return;
            }
            this.method3249(var3, arg1, -20984);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
    public static final void method3247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7942++;
        int var5 = class566.field8046;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class566.field8046 = 2;
            class657.field9205 = arg4;
            class435.field6466 = arg0;
            class322.field4595 = arg3;
            class85.field1220 = arg1;
        } else if (var5 == 2) {
            if (class657.field9205 < arg4) {
                class657.field9205 = arg4;
            }
            if (arg3 < class322.field4595) {
                class322.field4595 = arg3;
            }
            if (class435.field6466 > arg0) {
                class435.field6466 = arg0;
            }
            if (class85.field1220 < arg1) {
                class85.field1220 = arg1;
            }
        } else if (arg2 != 0) {
            field7949 = false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public static final void method3248(byte arg0) {
        if (arg0 != -23) {
            field7949 = false;
        }
        field7948++;
        class150 var1 = class676.method3885(1000, 15, 0);
        var1.method1115(true);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILrg;I)V")
    private final void method3249(int arg0, class645 arg1, int arg2) {
        if (arg2 != -20984) {
            this.method3244(-68, 'I');
        }
        if (arg0 == 1) {
            this.field7941 = arg1.method3752(arg2 ^ 0x51F6);
        } else if (arg0 == 2) {
            int var7 = arg1.method3745(arg2 ^ 0x495E);
            this.field7944 = new char[var7];
            this.field7947 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7947[var8] = arg1.method3712((byte) -117);
                byte var9 = arg1.method3743(true);
                this.field7944[var8] = var9 == 0 ? 0 : class33.method166(false, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method3745(-6314);
            this.field7950 = new int[var4];
            this.field7951 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7950[var5] = arg1.method3712((byte) 35);
                byte var6 = arg1.method3743(true);
                this.field7951[var5] = var6 == 0 ? 0 : class33.method166(false, var6);
            }
        }
        field7946++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static final void method3250(int arg0) {
        class509.field7252 = arg0;
        for (int var1 = 0; var1 < class34.field356; var1++) {
            for (int var2 = 0; var2 < class565.field8040; var2++) {
                if (class80.field1136[arg0][var1][var2] == null) {
                    class80.field1136[arg0][var1][var2] = new class186(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)V")
    public final void method3251(int arg0) {
        field7945++;
        int var2 = -28 / ((arg0 + 44) / 34);
        if (this.field7950 != null) {
            for (int var3 = 0; var3 < this.field7950.length; var3++) {
                this.field7950[var3] = class625.method3600(this.field7950[var3], 32768);
            }
        }
        if (this.field7947 != null) {
            for (int var4 = 0; var4 < this.field7947.length; var4++) {
                this.field7947[var4] = class625.method3600(this.field7947[var4], 32768);
            }
        }
    }
}
