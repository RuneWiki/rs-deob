import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class122 extends class182 {

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "[Ln;")
    public class142[] field2291;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lkh;")
    public static class117 field2290 = class224.method1450((byte) -11, "Welt");

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Lkh;")
    public static class117 field2292 = class224.method1450((byte) -105, "cookiehost");

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lkh;")
    public static class117 field2296 = class224.method1450((byte) 14, " )2> ");

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lkh;")
    private static class117 field2294 = class224.method1450((byte) -7, "Take");

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Lkh;")
    public static class117 field2288 = field2294;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "J")
    public static long field2286;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
    public static int[] field2287;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public static final void method853(boolean arg0, int arg1) {
        class70.field1342 = arg0;
        field2293++;
        if (arg1 != -1) {
            return;
        }
        if (!class70.field1342) {
            int var25 = (class30.field722 - class18.field511.field2643) / 16;
            class165.field2981 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class165.field2981[var26][var37] = class18.field511.method1008(-124);
                }
            }
            int var27 = class18.field511.method1004(255);
            int var28 = class18.field511.method988(arg1 + 93);
            int var29 = class18.field511.method1049((byte) 122);
            int var30 = class18.field511.method1033(-128);
            boolean var31 = false;
            if ((var29 / 8 == 48 || var29 / 8 == 49) && (var27 / 8) == 48) {
                var31 = true;
            }
            if (var29 / 8 == 48 && var27 / 8 == 148) {
                var31 = true;
            }
            int var32 = class18.field511.method1049((byte) 109);
            class179.field3241 = new int[var25];
            class196.field3504 = new int[var25];
            class13.field412 = new byte[var25][];
            class216.field3936 = new int[var25];
            class30.field718 = new byte[var25][];
            int var33 = 0;
            for (int var34 = (var29 - 6) / 8; var34 <= (var29 + 6) / 8; var34++) {
                for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var31 && (var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || var34 == 49 && var35 == 47)) {
                        class216.field3936[var33] = var36;
                        class179.field3241[var33] = -1;
                        class196.field3504[var33] = -1;
                    } else {
                        class216.field3936[var33] = var36;
                        class179.field3241[var33] = class78.field1486.method84(class36.method316((byte) -34, new class117[] { class11.field380, class42.method358(var34, (byte) 34), class181.field3266, class42.method358(var35, (byte) 34) }), 1491);
                        class196.field3504[var33] = class78.field1486.method84(class36.method316((byte) -34, new class117[] { class92.field1699, class42.method358(var34, (byte) 34), class181.field3266, class42.method358(var35, (byte) 34) }), 1491);
                    }
                    var33++;
                }
            }
            class77.method543(var32, 48, var27, var28, var29, var30);
            return;
        }
        int var2 = class18.field511.method998(127);
        int var3 = class18.field511.method1019((byte) -124);
        int var4 = class18.field511.method988(50);
        class18.field511.method395((byte) -103);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class18.field511.method396(1, (byte) -9);
                    if (var24 == 1) {
                        class163.field2972[var5][var22][var23] = class18.field511.method396(26, (byte) -9);
                    } else {
                        class163.field2972[var5][var22][var23] = -1;
                    }
                }
            }
        }
        class18.field511.method397(80);
        int var6 = (class30.field722 - class18.field511.field2643) / 16;
        class165.field2981 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class165.field2981[var7][var21] = class18.field511.method1018(-1068451600);
            }
        }
        int var8 = class18.field511.method1019((byte) 88);
        int var9 = class18.field511.method1049((byte) 115);
        class196.field3504 = new int[var6];
        class179.field3241 = new int[var6];
        class216.field3936 = new int[var6];
        class30.field718 = new byte[var6][];
        class13.field412 = new byte[var6][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class163.field2972[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class216.field3936[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            int var19 = var17 >> 8 & 0xFF;
                            class216.field3936[var10] = var17;
                            int var20 = var17 & 0xFF;
                            class179.field3241[var10] = class78.field1486.method84(class36.method316((byte) -34, new class117[] { class11.field380, class42.method358(var19, (byte) 34), class181.field3266, class42.method358(var20, (byte) 34) }), arg1 + 1492);
                            class196.field3504[var10] = class78.field1486.method84(class36.method316((byte) -34, new class117[] { class92.field1699, class42.method358(var19, (byte) 34), class181.field3266, class42.method358(var20, (byte) 34) }), 1491);
                            var10++;
                        }
                    }
                }
            }
        }
        class77.method543(var4, arg1 ^ 0xFFFFFFE5, var9, var8, var3, var2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLai;Lai;II)Llb;")
    public static final class122 method854(boolean arg0, class10 arg1, class10 arg2, int arg3, int arg4) {
        field2289++;
        int[] var5 = arg1.method106(arg3, true);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg1.method113(arg3, -109, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method113(0, -115, var9);
                } else {
                    var10 = arg2.method113(var9, arg4 - 16766504, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            if (arg4 == 16766395) {
                return new class122(arg1, arg2, arg3, arg0);
            } else {
                return null;
            }
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method855(int arg0) {
        field2294 = null;
        field2292 = null;
        if (arg0 != 1) {
            method853(false, 58);
        }
        field2290 = null;
        field2288 = null;
        field2296 = null;
        field2287 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Z")
    public final boolean method856(int arg0, byte arg1) {
        if (arg1 == 65) {
            field2295++;
            return this.field2291[arg0].field2568;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lai;Lai;IZ)V")
    private class122(class10 arg0, class10 arg1, int arg2, boolean arg3) {
        class36 var5 = new class36();
        int var6 = arg0.method108(arg2, 0);
        this.field2291 = new class142[var6];
        int[] var7 = arg0.method106(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method104(-121, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class24 var11 = null;
            for (class24 var12 = (class24) var5.method314((byte) -26); var12 != null; var12 = (class24) var5.method320(0)) {
                if (var12.field608 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method113(0, -120, var10);
                } else {
                    var13 = arg1.method113(var10, -123, 0);
                }
                var11 = new class24(var10, var13);
                var5.method325(115, var11);
            }
            this.field2291[var7[var8]] = new class142(var9, var11);
        }
    }
}
