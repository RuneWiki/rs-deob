import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class21 extends class262 {

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    private int field395 = 32768;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "Llc;")
    public static class160 field401 = new class160();

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "[I")
    public static int[] field405 = new int[500];

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "[Lje;")
    public static class70[] field406;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[Lr;ZII)V", line = 12)
    public static final void method149(int arg0, int arg1, class264[] arg2, boolean arg3, int arg4, int arg5) {
        field393++;
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class264 var7 = arg2[var6];
            if (var7 != null && var7.field4497 == arg0) {
                class147.method1134(arg3, var7, -6, arg1, arg4);
                class267.method1943(arg1, (byte) -100, arg4, var7);
                if (var7.field4490 - var7.field4393 < var7.field4430) {
                    var7.field4430 = var7.field4490 - var7.field4393;
                }
                if (var7.field4377 > (var7.field4513 - var7.field4381)) {
                    var7.field4377 = var7.field4513 - var7.field4381;
                }
                if (var7.field4430 < 0) {
                    var7.field4430 = 0;
                }
                if (var7.field4377 < 0) {
                    var7.field4377 = 0;
                }
                if (var7.field4536 == 0) {
                    class183.method1444(25096, arg3, var7);
                }
            }
        }
        if (arg5 != 255) {
            field401 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)Z", line = 60)
    public static final boolean method150(int arg0, int arg1) {
        field392++;
        if (arg0 == 0) {
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V", line = 71)
    public static final void method151(byte arg0) {
        field399++;
        if (arg0 <= 108) {
            field401 = (class160) null;
        }
        class39.field688.method791(8);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z", line = 88)
    public static final boolean method152(byte arg0, int arg1) {
        field402++;
        if (arg0 >= -75) {
            method149(-58, -72, (class264[]) null, true, -124, -30);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)I", line = 111)
    public static final int method153(int arg0, int arg1, int arg2, int arg3) {
        field398++;
        if (arg0 > -116) {
            return 85;
        } else if (arg1 >= arg2) {
            return (arg1 > arg3 ? arg3 : arg1);
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 138)
    public class21() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V", line = 127)
    public static void method154(byte arg0) {
        if (arg0 != 1) {
            field401 = (class160) null;
        }
        field405 = null;
        field406 = null;
        field401 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[[I", line = 147)
    public final int[][] method87(int arg0, int arg1) {
        field404++;
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (arg0 != 7) {
            method149(-93, 82, (class264[]) null, false, 71, -59);
        }
        if (this.field4347.field1202) {
            int[] var4 = this.method1895(7, 1, arg1);
            int[] var5 = this.method1895(7, 2, arg1);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class98.field1598; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field395 >> 12;
                int var12 = class15.field309[var10] * var11 >> 12;
                int var13 = var9 + (var12 >> 12) & class218.field3595;
                int var14 = class260.field4324[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg1 & class259.field4297;
                int[][] var16 = this.method1893(0, var15, 8);
                var8[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var6[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lwe;II)V", line = 206)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            return;
        }
        if (arg2 == 0) {
            this.field395 = arg0.method379(-2) << 4;
        } else if (arg2 == 1) {
            this.field4365 = arg0.method368(arg1 ^ 0xFFFFF792) == 1;
        }
        field397++;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V", line = 241)
    public final void method43(int arg0) {
        class73.method543((byte) -100);
        field403++;
        if (arg0 != -2) {
            field406 = (class70[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[I", line = 252)
    public final int[] method38(int arg0, byte arg1) {
        field396++;
        if (arg1 >= -85) {
            field405 = (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 118);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 1, arg0);
            int[] var5 = this.method1895(7, 2, arg0);
            for (int var6 = 0; var6 < class98.field1598; var6++) {
                int var7 = var5[var6] * this.field395 >> 12;
                int var8 = (var4[var6] & 0xFF0) >> 4;
                int var9 = class15.field309[var8] * var7 >> 12;
                int var10 = class260.field4324[var8] * var7 >> 12;
                int var11 = class218.field3595 & (var9 >> 12) + var6;
                int var12 = class259.field4297 & (var10 >> 12) + arg0;
                int[] var13 = this.method1895(7, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
