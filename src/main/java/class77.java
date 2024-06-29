import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class77 {

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "B")
    public byte field1075 = 0;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "S")
    public short field1081;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "S")
    public short field1083;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "B")
    public byte field1065;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "B")
    public byte field1073;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
    public static boolean field1057 = false;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1059 = "cyan:";

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "B")
    public byte field1070;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "B")
    public byte field1077;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "B")
    public byte field1084;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "B")
    public byte field1085;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Ldm;")
    public class127 field1078;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Llq;")
    public class236 field1063;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Llq;")
    public class236 field1076;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lai;")
    public class305 field1060;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lpl;")
    public class356 field1064;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lua;")
    public class400 field1067;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "Lua;")
    public class400 field1087;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lon;")
    public class441 field1079;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ldh;")
    public class77 field1061;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "S")
    public short field1086;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
    public boolean field1062;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
    public boolean field1068;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Z")
    public boolean field1082;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[Z")
    public static boolean[] field1080;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([[I[[B[[BILda;[[BZIZILtj;Lda;[[B)V")
    public static final void method613(int[][] arg0, byte[][] arg1, byte[][] arg2, int arg3, class193 arg4, byte[][] arg5, boolean arg6, int arg7, boolean arg8, int arg9, class298 arg10, class193 arg11, byte[][] arg12) {
        if (class397.field5796 == 0 && !class257.field3775) {
            class199.method1314(arg12, arg0, arg9, arg2, arg11, arg8, arg4, 1700470791, arg5, arg1, arg7, arg10, arg3);
        } else {
            class216.method1417(arg2, arg11, arg8, arg9, arg7, arg10, arg3, (byte) -59, arg1, arg0, arg12, arg5, arg4);
        }
        field1074++;
        if (!arg6) {
            field1057 = true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1059 = null;
        field1080 = null;
        if (arg0 != -1) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(III)V")
    public class77(int arg0, int arg1, int arg2) {
        this.field1081 = (short) arg2;
        this.field1083 = (short) arg1;
        this.field1073 = this.field1065 = (byte) arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method615(byte arg0) {
        while (this.field1064 != null) {
            class356 var2 = this.field1064.field5275;
            this.field1064.method2341(262144);
            this.field1064 = var2;
        }
        field1058++;
        this.field1075 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class395.method2542(false, arg1);
        field1069++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        if (arg3 > -89) {
            field1080 = null;
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class157.field1981 <= arg6 && class312.field4602 >= arg6) {
            int[] var15 = class444.field6416[arg6];
            int var16 = class400.method2567(class240.field3368, class136.field1769, (byte) -40, arg5 - arg1);
            int var17 = class400.method2567(class240.field3368, class136.field1769, (byte) -64, arg1 + arg5);
            int var18 = class400.method2567(class240.field3368, class136.field1769, (byte) -6, arg5 - var8);
            int var19 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg5 + var8);
            class351.method2317(false, var18, var15, var16, arg2);
            class351.method2317(false, var19, var15, var18, arg0);
            class351.method2317(false, var17, var15, var19, arg2);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class269.field3989[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (var21 >= class157.field1981 && class312.field4602 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class400.method2567(class240.field3368, class136.field1769, (byte) 20, arg5 + var7);
                        int var23 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg5 - var7);
                        if (class312.field4602 >= var21) {
                            class351.method2317(false, var22, class444.field6416[var21], var23, arg2);
                        }
                        if (class157.field1981 <= var20) {
                            class351.method2317(false, var22, class444.field6416[var20], var23, arg2);
                        }
                    } else {
                        int var24 = class269.field3989[var9];
                        int var25 = class400.method2567(class240.field3368, class136.field1769, (byte) 43, arg5 + var7);
                        int var26 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg5 - var7);
                        int var27 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg5 + var24);
                        int var28 = class400.method2567(class240.field3368, class136.field1769, (byte) -62, arg5 - var24);
                        if (class312.field4602 >= var21) {
                            int[] var29 = class444.field6416[var21];
                            class351.method2317(false, var28, var29, var26, arg2);
                            class351.method2317(false, var27, var29, var28, arg0);
                            class351.method2317(false, var25, var29, var27, arg2);
                        }
                        if (var20 >= class157.field1981) {
                            int[] var30 = class444.field6416[var20];
                            class351.method2317(false, var28, var30, var26, arg2);
                            class351.method2317(false, var27, var30, var28, arg0);
                            class351.method2317(false, var25, var30, var27, arg2);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class157.field1981 <= var32 && var31 <= class312.field4602) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (var33 >= class240.field3368 && class136.field1769 >= var34) {
                    int var35 = class400.method2567(class240.field3368, class136.field1769, (byte) -114, var33);
                    int var36 = class400.method2567(class240.field3368, class136.field1769, (byte) 21, var34);
                    if (var8 <= var7) {
                        if (class312.field4602 >= var32) {
                            class351.method2317(false, var35, class444.field6416[var32], var36, arg2);
                        }
                        if (var31 >= class157.field1981) {
                            class351.method2317(false, var35, class444.field6416[var31], var36, arg2);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class269.field3989[var7];
                        int var38 = class400.method2567(class240.field3368, class136.field1769, (byte) -126, arg5 + var37);
                        int var39 = class400.method2567(class240.field3368, class136.field1769, (byte) -11, arg5 - var37);
                        if (class312.field4602 >= var32) {
                            int[] var40 = class444.field6416[var32];
                            class351.method2317(false, var39, var40, var36, arg2);
                            class351.method2317(false, var38, var40, var39, arg0);
                            class351.method2317(false, var35, var40, var38, arg2);
                        }
                        if (var31 >= class157.field1981) {
                            int[] var41 = class444.field6416[var31];
                            class351.method2317(false, var39, var41, var36, arg2);
                            class351.method2317(false, var38, var41, var39, arg0);
                            class351.method2317(false, var35, var41, var38, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static final void method617(byte arg0) {
        field1071++;
        if (arg0 <= 34) {
            field1072 = 97;
        }
        class116.method850(26091, class126.field1647, (long) class231.field3179);
        if (class233.field3246 != -1) {
            class7.method42(class233.field3246, (byte) -103);
        }
        for (int var1 = 0; var1 < class400.field5854; var1++) {
            if (class33.field536[var1]) {
                class101.field1335[var1] = true;
            }
            class297.field4482[var1] = class33.field536[var1];
            class33.field536[var1] = false;
        }
        class209.field2843 = class231.field3179;
        if (class126.field1647.method479()) {
            class181.field2427 = true;
        }
        class348.field5177 = null;
        if (class233.field3246 != -1) {
            class400.field5854 = 0;
            class297.method2010(true);
        }
        class126.field1647.method472();
        class191.method1272((byte) 59, class38.field571);
        class216.field3021 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method618(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field1066++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class125.field1621 : class93.field1267) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class104 var11 = class208.method1367(-10186, var8);
            if (var11.field1350 && var11.method790(arg0 + 27196).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class47.field711 = -1;
                    class267.field3960 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class47.field711 = var5;
        class290.field4341 = 0;
        class267.field3960 = var4;
        String[] var9 = new String[class47.field711];
        for (int var10 = 0; var10 < class47.field711; var10++) {
            var9[var10] = class208.method1367(-10186, var4[var10]).method790(27196);
        }
        class51.method381(var9, class267.field3960, arg0);
    }
}
