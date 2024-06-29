import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class96 implements class655 {

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Ltca;")
    public class545 field1468;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lvea;")
    public class305 field1467;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Ljava/lang/String;")
    public String field1475;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
    public static int[] field1478 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Z")
    public static boolean field1479 = false;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Lvg;")
    public static class622 field1470 = new class622(24, 8);

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[I")
    public static int[] field1480 = new int[1];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIII)I")
    public static final int method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1476++;
        if (class178.field2480 == null) {
            return 0;
        }
        if (arg3 < 3) {
            label102: {
                int var6 = arg2 >> 9;
                int var7 = arg1 >> 9;
                if (arg4 >= 0 && arg0 >= 0 && arg4 <= (class72.field1144 - 1) && arg0 <= (class668.field9444 - 1)) {
                    if (var6 >= 1 && var7 >= 1 && (class72.field1144 - 1) >= var6 && class668.field9444 - 1 >= var7) {
                        boolean var8 = (class317.field4622[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
                        if ((arg2 & 0x1FF) == 0) {
                            boolean var9 = (class317.field4622[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                            boolean var10 = (class317.field4622[1][var6][arg1 >> 9] & 0x2) != 0;
                            if (var9 != var10) {
                                var8 = (class317.field4622[1][arg4][arg0] & 0x2) != 0;
                            }
                        }
                        if ((arg1 & 0x1FF) == 0) {
                            boolean var11 = (class317.field4622[1][arg2 >> 9][var7 - 1] & 0x2) != 0;
                            boolean var12 = (class317.field4622[1][arg2 >> 9][var7] & 0x2) != 0;
                            if (var11 != var12) {
                                var8 = (class317.field4622[1][arg4][arg0] & 0x2) != 0;
                            }
                        }
                        if (var8) {
                            arg3++;
                        }
                        break label102;
                    }
                    return 0;
                }
                return 0;
            }
        }
        if (arg5 != 12228) {
            field1478 = null;
        }
        return class178.field2480[arg3].method3824(arg2, arg5 ^ 0x2FB7, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        field1461++;
        int var2 = -81 / ((arg0 + 89) / 34);
        return class538.field7897;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1470 = null;
        field1478 = null;
        field1480 = null;
        int var1 = -74 % ((68 - arg0) / 33);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Ltca;Lvea;IIIIIIIIII)V")
    public class96(String arg0, class545 arg1, class305 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field1468 = arg1;
        this.field1462 = arg6;
        this.field1463 = arg10;
        this.field1473 = arg9;
        this.field1477 = arg7;
        this.field1467 = arg2;
        this.field1475 = arg0;
        this.field1464 = arg8;
        this.field1469 = arg4;
        this.field1472 = arg12;
        this.field1474 = arg5;
        this.field1466 = arg3;
        this.field1465 = arg11;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I")
    public static final int method601(int arg0) {
        if (arg0 != 100) {
            return -115;
        }
        field1471++;
        int var1 = class205.field2797.method3331((byte) 56);
        if (var1 < class80.field1292.length - 1) {
            class205.field2797 = class80.field1292[var1 + 1];
        }
        return 100;
    }
}
