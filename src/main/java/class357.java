import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class357 {

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public int field5213;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Z")
    public static boolean field5215 = false;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Lqp;")
    public static class466 field5214 = new class466("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[Z")
    public static boolean[] field5216;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method2136(int arg0) {
        field5216 = null;
        field5214 = null;
        if (arg0 != -1) {
            method2136(-117);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIBII)V")
    public static final void method2137(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5208++;
        int var6 = class46.method425(true, arg4, class224.field3193, class417.field6057);
        int var7 = class46.method425(true, arg5, class224.field3193, class417.field6057);
        if (arg3 < 31) {
            return;
        }
        int var8 = class46.method425(true, arg2, class76.field1021, class424.field6204);
        int var9 = class46.method425(true, arg1, class76.field1021, class424.field6204);
        for (int var10 = var6; var10 <= var7; var10++) {
            class210.method1300(var8, class437.field6400[var10], (byte) 123, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5207++;
        for (int var6 = arg4; var6 <= arg3; var6++) {
            for (int var7 = arg2; var7 <= arg5; var7++) {
                if (class300.field4132[var6][var7] == arg1 && class351.field5160[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg0 == 14869) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5210++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static final void method2139(byte arg0) {
        if (arg0 >= -127) {
            field5214 = null;
        }
        field5211++;
        int var1 = (int) ((double) class527.field7799 * 34.46D);
        int var2 = var1 << 0;
        if (class269.field3721.method273()) {
            var2 += 128;
        }
        class269.field3721.method311(50, var2);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5212++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg0 - arg3;
        int var13 = arg7 * arg7;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((arg1 + var21) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class437.field6400[arg2];
        class210.method1300(arg5 - arg7, var39, (byte) 125, arg5 - var11, arg6);
        class210.method1300(arg5 - var11, var39, (byte) 75, arg5 + var11, arg4);
        class210.method1300(arg5 + var11, var39, (byte) 126, arg5 + arg7, arg6);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class210.method1300(var44, class437.field6400[var41], (byte) 82, var46, arg6);
                class210.method1300(var46, class437.field6400[var41], (byte) 108, var45, arg4);
                class210.method1300(var45, class437.field6400[var41], (byte) 113, var43, arg6);
                class210.method1300(var44, class437.field6400[var42], (byte) 87, var46, arg6);
                class210.method1300(var46, class437.field6400[var42], (byte) 126, var45, arg4);
                class210.method1300(var45, class437.field6400[var42], (byte) 80, var43, arg6);
            } else {
                class210.method1300(var44, class437.field6400[var41], (byte) 73, var43, arg6);
                class210.method1300(var44, class437.field6400[var42], (byte) 113, var43, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class357(String arg0, int arg1) {
        this.field5213 = arg1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)S")
    public static final short method2141(int arg0, int arg1) {
        field5209++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = 44 % ((arg1 - 24) / 37);
        int var7 = var4 + var5;
        int var8;
        if (var7 == 0) {
            var8 = var5 << 1;
        } else {
            var8 = (var5 << 8) / var7;
        }
        return (short) (var8 >> 4 << 7 | var2 << 10 | var7);
    }
}
