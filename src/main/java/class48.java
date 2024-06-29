import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class48 extends class449 {

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
    public int[] field723 = new int[] { -1 };

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    public int[] field725 = new int[1];

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "[Z")
    public static boolean[] field730;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lch;")
    public static class151 field728;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lrc;")
    public static class108 field732;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I[IIIZ)J")
    private final long method481(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        field727++;
        long[] var6 = class481.field6808;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg2 ^ var9) & 0xFFL)];
        if (arg3 <= 44) {
            field730 = null;
        }
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg4 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method482(int arg0) {
        field730 = null;
        field732 = null;
        if (arg0 != -6737) {
            method482(127);
        }
        field728 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnl;Lnl;I)V")
    public static final void method483(class435 arg0, class435 arg1, int arg2) {
        if (arg2 == -1) {
            field729++;
            class22.field253 = arg0;
            class125.field1699 = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        if (arg0 < 107) {
            field730 = null;
        }
        field726++;
        class111.field1549 = null;
        class317.field4492 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILqp;IILtj;IZLvc;)Ln;")
    public final class468 method485(int arg0, int arg1, int arg2, class303 arg3, int arg4, int arg5, class424 arg6, int arg7, boolean arg8, class89 arg9) {
        field724++;
        class468 var11 = null;
        int var12 = arg1;
        class389 var13 = null;
        if (arg5 != -1) {
            var13 = class382.field5247.method1773(arg5, arg7 ^ 0xFFFFA00B);
        }
        int[] var14 = this.field723;
        if (var13 != null && var13.field5377 != null) {
            var14 = new int[var13.field5377.length];
            for (int var15 = 0; var15 < var13.field5377.length; var15++) {
                int var16 = var13.field5377[var15];
                if (var16 >= 0 && this.field723.length > var16) {
                    var14[var15] = this.field723[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class135 var23 = null;
        class135 var24 = null;
        if (arg3 != null) {
            var12 = arg1 | 0x20;
            int var25 = arg3.field4286[arg4];
            int var26 = var25 >>> 16;
            var23 = class386.field5289.method1855(-121, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method998(var20, (byte) -125);
                var17 |= var23.method999(0, var20);
                var19 |= arg3.field4281;
            }
            if ((arg3.field4300 || class439.field6230) && arg0 != -1 && arg3.field4286.length > arg0) {
                var22 = arg3.field4283[arg4];
                int var27 = arg3.field4286[arg0];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class386.field5289.method1855(arg7 ^ 0x57, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method998(var21, (byte) -125);
                    var17 |= var24.method999(0, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method481(arg6 == null ? null : arg6.field5864, var14, arg5, 52, arg8);
        if (class289.field4105 != null) {
            var11 = (class468) class289.field4105.method2113(0, var29);
        }
        if (var11 == null || arg9.method362(var11.method1574(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method355(var12, var11.method1574());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class373.field5128.method1644(var14[var33], 84).method1113(false, arg8)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class430[] var34 = new class430[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class373.field5128.method1644(var14[var35], 108).method1119(false, arg8);
                }
            }
            if (var13 != null && var13.field5354 != null) {
                for (int var36 = 0; var36 < var13.field5354.length; var36++) {
                    if (var13.field5354[var36] != null && var34[var36] != null) {
                        int var37 = var13.field5354[var36][0];
                        int var38 = var13.field5354[var36][1];
                        int var39 = var13.field5354[var36][2];
                        int var40 = var13.field5354[var36][3];
                        int var41 = var13.field5354[var36][4];
                        int var42 = var13.field5354[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method2580(var42, arg7 ^ 0x5, var41, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method2579(var38, var39, (byte) 117, var37);
                        }
                    }
                }
            }
            class430 var43 = new class430(var34, var34.length);
            if (arg6 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg9.method327(var43, var31, class436.field6210, 64, 850);
            if (arg6 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg6.field5864[var44] < class53.field785[var44].length) {
                        var11.method1615(class336.field4675[var44], class53.field785[var44][arg6.field5864[var44]]);
                    }
                    if (class301.field4258[var44].length > arg6.field5864[var44]) {
                        var11.method1615(class343.field4740[var44], class301.field4258[var44][arg6.field5864[var44]]);
                    }
                }
            }
            if (class289.field4105 != null) {
                var11.method1588(var12);
                class289.field4105.method2116(var29, (byte) -55, var11);
            }
        }
        if (arg3 == null || var23 == null) {
            return var11;
        }
        class468 var45 = var11.method1600((byte) 1, var12, true);
        if (arg7 == 5) {
            var45.method2790(var21, arg3.field4281, var20, var24, var22, arg7 - 6, var23, 0, arg2 - 1);
            return var45;
        } else {
            return null;
        }
    }

    static {
        new class151((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field730 = new boolean[8];
        field728 = new class151("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");
        field732 = new class108(61, 3);
    }
}
