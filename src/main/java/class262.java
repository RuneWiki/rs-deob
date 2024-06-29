import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class262 extends class171 {

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[Ljh;")
    public class262[] field4351;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "Z")
    public boolean field4365;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Lok;")
    public static class146 field4349 = class235.method1724(-12908, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Lok;")
    public static class146 field4361 = class235.method1724(-12908, "<img=0>");

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Llc;")
    public static class160 field4345 = new class160();

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "[I")
    public static int[] field4366 = new int[256];

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Log;")
    public class199 field4350;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Lvm;")
    public class73 field4347;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "[I")
    public static int[] field4348;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I", line = 6)
    public int method1891(int arg0) {
        if (arg0 < 99) {
            method1892((byte) -56);
        }
        field4355++;
        return -1;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 18)
    public static void method1892(byte arg0) {
        field4349 = null;
        field4348 = null;
        field4361 = null;
        field4345 = null;
        field4366 = null;
        if (arg0 != 49) {
            method1898(40, 18, -24, -43, 100, -95);
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V", line = 37)
    public void method630(byte arg0) {
        if (this.field4365) {
            this.field4350.method1528((byte) -114);
            this.field4350 = null;
        } else {
            this.field4347.method539((byte) 126);
            this.field4347 = null;
        }
        if (arg0 > -56) {
            this.method43(-119);
        }
        field4364++;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V", line = 65)
    public void method43(int arg0) {
        field4344++;
        if (arg0 != -2) {
            this.field4350 = (class199) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lwe;II)V", line = 75)
    public void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            this.field4356 = -70;
        }
        field4357++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)[[I", line = 95)
    public final int[][] method1893(int arg0, int arg1, int arg2) {
        field4353++;
        int var4 = 72 % ((arg2 - 57) / 38);
        if (this.field4351[arg0].field4365) {
            int[] var5 = this.field4351[arg0].method38(arg1, (byte) -125);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4351[arg0].method87(7, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Lok;", line = 134)
    public static final class146 method1894(int arg0, boolean arg1) {
        field4360++;
        if (arg1) {
            return (class146) null;
        } else if (arg0 < 999999999) {
            return class82.method585(14744, arg0);
        } else {
            return class218.field3600;
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I", line = 148)
    public int method626(int arg0) {
        field4359++;
        return arg0 == 1 ? -1 : -97;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)[I", line = 160)
    public final int[] method1895(int arg0, int arg1, int arg2) {
        field4352++;
        if (arg0 == 7) {
            return this.field4351[arg1].field4365 ? this.field4351[arg1].method38(arg2, (byte) -94) : this.field4351[arg1].method87(7, arg2)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B[B)Lhe;", line = 183)
    public static final class90 method1896(byte arg0, byte[] arg1) {
        if (arg0 != -27) {
            method1896((byte) -123, (byte[]) null);
        }
        field4346++;
        if (arg1 == null) {
            return null;
        } else {
            class90 var2 = new class90(arg1, class226.field3776, class23.field424, class238.field3967, class150.field2562, class17.field353);
            class301.method2122((byte) 0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)V", line = 208)
    public final void method1897(int arg0, int arg1, boolean arg2) {
        field4363++;
        if (!arg2) {
            return;
        }
        int var4 = this.field4356 == 255 ? arg1 : this.field4356;
        if (this.field4365) {
            this.field4350 = new class199(var4, arg1, arg0);
        } else {
            this.field4347 = new class73(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)Z", line = 237)
    public static final boolean method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class293.field4979[arg0][var8][var9] == -class40.field725) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class174.field2914[arg0][arg1][arg3] + arg5;
            if (!class112.method755(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class112.method755(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class112.method755(var10, var12, var14)) {
                return false;
            } else if (class112.method755(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class26.method173(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class112.method755(var6 + 1, class174.field2914[arg0][arg1][arg3] + arg5, var7 + 1) && class112.method755(var6 + 128 - 1, class174.field2914[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class112.method755(var6 + 128 - 1, class174.field2914[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class112.method755(var6 + 1, class174.field2914[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[I", line = 302)
    public int[] method38(int arg0, byte arg1) {
        field4362++;
        if (arg1 >= -85) {
            field4366 = (int[]) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I", line = 313)
    public int[][] method87(int arg0, int arg1) {
        if (arg0 == 7) {
            field4358++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IZ)V", line = 332)
    public class262(int arg0, boolean arg1) {
        this.field4351 = new class262[arg0];
        this.field4365 = arg1;
    }
}
