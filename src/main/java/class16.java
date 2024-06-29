import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class16 extends class206 {

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lmh;")
    public static class62 field136 = class201.method1405(true, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lmh;")
    public static class62 field141 = class201.method1405(true, "<col=ffffff>");

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static volatile int field150 = -1;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[I")
    public int[] field138;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
    public int[] field140;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[Lga;")
    public class147[] field145;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "[Lga;")
    public class147[] field147;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[[[B")
    public byte[][][] field142;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field148++;
        int var8 = arg0 - arg4;
        int var9 = arg4 + arg5;
        int var10 = arg7 - arg4;
        int var11 = arg2 + arg4;
        for (int var12 = arg2; var12 < var11; var12++) {
            class271.method1861(arg3, true, class282.field4817[var12], arg7, arg5);
        }
        int var13 = 67 % ((arg1 - 28) / 57);
        for (int var14 = arg0; var14 > var8; var14--) {
            class271.method1861(arg3, true, class282.field4817[var14], arg7, arg5);
        }
        for (int var15 = var11; var15 <= var8; var15++) {
            int[] var16 = class282.field4817[var15];
            class271.method1861(arg3, true, var16, var9, arg5);
            class271.method1861(arg6, true, var16, var10, var9);
            class271.method1861(arg3, true, var16, arg7, var10);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([Lmh;IIB)Lmh;", line = 50)
    public static final class62 method61(class62[] arg0, int arg1, int arg2, byte arg3) {
        field135++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class173.field2788;
            }
            var4 += arg0[arg1 + var5].field893;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg3 > -59) {
            field141 = (class62) null;
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            class62 var9 = arg0[arg1 + var8];
            class231.method1635(var9.field906, 0, var6, var7, var9.field893);
            var7 += var9.field893;
        }
        class62 var10 = new class62();
        var10.field893 = var4;
        var10.field906 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 95)
    public static void method62(byte arg0) {
        field136 = null;
        field141 = null;
        if (arg0 <= 22) {
            method63((class62) null, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lmh;B)V", line = 128)
    public static final void method63(class62 arg0, byte arg1) {
        field146++;
        class309.method2102(-94);
        if (arg1 != 9) {
            method63((class62) null, (byte) 64);
        }
        class186.method1308(-1, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIII)V", line = 141)
    public static final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg1 && arg3 == arg9 && arg4 == arg6 && arg2 == arg5) {
            class247.method1721((byte) 121, arg1, arg8, arg5, arg6, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg9 * 3;
            int var12 = arg0 * 3;
            int var13 = arg3 * 3;
            int var14 = arg9;
            int var15 = arg1 * 3;
            int var16 = arg2 * 3;
            int var17 = arg4 * 3;
            int var18 = var12 + arg6 - arg1 - var17;
            int var19 = var13 - var11;
            int var20 = var12 - var15;
            int var21 = var13 + arg5 - arg9 - var16;
            int var22 = var16 - var13 - (-var11 + var13);
            int var23 = var17 - (var12 + var12 - var15);
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var26;
                int var29 = var22 * var25;
                int var30 = var23 * var25;
                int var31 = var19 * var24;
                int var32 = var20 * var24;
                int var33 = (var28 + var29 + var31 >> 12) + arg9;
                int var34 = arg1 + (var27 + var30 + var32 >> 12);
                class247.method1721((byte) 64, var10, arg8, var33, var34, var14);
                var14 = var33;
                var10 = var34;
            }
        }
        field144++;
        if (arg7 > -9) {
            field141 = (class62) null;
        }
    }
}
