import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class32 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    private int field434 = 4;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    private int field438 = 0;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[S")
    private short[] field440 = new short[512];

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field447 = 4;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    private int field448 = 4;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    private int field449 = 4;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field443 = new String[100];

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lhc;")
    public static class368 field446 = new class368("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field445;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field450;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[S")
    private short[] field433;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method302(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I", line = 6)
    private static final int method290(byte arg0, int arg1) {
        field442++;
        int var2 = -44 % ((37 - arg0) / 38);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIII)V", line = 17)
    public final void method292(byte arg0, int arg1, int arg2, int arg3) {
        field435++;
        if (arg0 != -31) {
            this.method299(true);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method291(109);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field447; var14++) {
                        int var15 = this.field433[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field448 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field434 * var15 >> 12;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = this.field449 * var15 >> 12;
                        int var22 = this.field448 * var18;
                        int var23 = this.field449 * var20;
                        int var24 = this.field434 * var16;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var26 < var17) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var32 < var21) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var19 <= var29) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39 = var31 & 0xFF;
                        short var40 = this.field440[var39];
                        short var41 = this.field440[var35];
                        int var42 = var37 - 4096;
                        int var43 = class399.field5528[var38];
                        int var44 = class399.field5528[var37];
                        int var45 = var38 - 4096;
                        int var46 = class399.field5528[var34];
                        int var47 = var34 - 4096;
                        short var48 = this.field440[var30 + var41];
                        short var49 = this.field440[var36 + var40];
                        short var50 = this.field440[var30 + var40];
                        short var51 = this.field440[var36 + var41];
                        int var52 = class131.method981(var34, var38, this.field440[var27 + var50], var37, -13631);
                        int var53 = class131.method981(var34, var38, this.field440[var33 + var50], var42, arg0 ^ 0x3520);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class131.method981(var34, var45, this.field440[var27 + var49], var37, arg0 ^ 0x3520);
                        int var56 = class131.method981(var34, var45, this.field440[var33 + var49], var42, -13631);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class131.method981(var47, var38, this.field440[var27 + var48], var37, -13631);
                        int var59 = var54 + ((var57 - var54) * var43 >> 12);
                        int var60 = class131.method981(var47, var38, this.field440[var33 + var48], var42, -13631);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class131.method981(var47, var45, this.field440[var27 + var51], var37, -13631);
                        int var63 = class131.method981(var47, var45, this.field440[var33 + var51], var42, -13631);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method293(((var65 - var59) * var46 >> 12) + var59, var14, true);
                    }
                    this.method299(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIII)V", line = 499)
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field438 = arg0;
        this.field447 = arg1;
        this.field448 = arg2;
        this.field449 = arg4;
        this.field434 = arg3;
        this.method297(-3);
        this.method301((byte) -5);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 193)
    public static void method294(int arg0) {
        field446 = null;
        if (arg0 == 3075) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 204)
    public static final void method295(int arg0, String arg1, boolean arg2) {
        field439++;
        boolean var3 = false;
        if (!arg2) {
            return;
        }
        for (int var4 = 0; var4 < class11.field86; var4++) {
            class423 var5 = class87.field1227[class18.field243[var4]];
            if (var5 != null && var5.field5869 != null && var5.field5869.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class65.field887++;
                    class88.field1232.method1151(108, (byte) 96);
                    class88.field1232.method2262(0, -122);
                    class88.field1232.method2275(121, class18.field243[var4]);
                } else if (arg0 == 4) {
                    class128.field1945++;
                    class88.field1232.method1151(64, (byte) 87);
                    class88.field1232.method2267(class18.field243[var4], (byte) -103);
                    class88.field1232.method2260(0, (byte) 87);
                } else if (arg0 == 5) {
                    class218.field3057++;
                    class88.field1232.method1151(185, (byte) -97);
                    class88.field1232.method2279((byte) -112, class18.field243[var4]);
                    class88.field1232.method2262(0, -108);
                } else if (arg0 == 6) {
                    class418.field5788++;
                    class88.field1232.method1151(233, (byte) -55);
                    class88.field1232.method2280(0, 1537846408);
                    class88.field1232.method2286(class18.field243[var4], -65);
                } else if (arg0 == 7) {
                    class88.field1232.method1151(167, (byte) 111);
                    class159.field2261++;
                    class88.field1232.method2286(class18.field243[var4], -65);
                    class88.field1232.method2250(false, 0);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            client.method1640(119, class280.field3807.method2313((byte) -70, class445.field6241) + arg1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V", line = 287)
    public static final void method296(int arg0, byte arg1, int arg2) {
        if (arg1 <= -60) {
            field445++;
            class26 var3 = class217.method1445(true, arg0, 1);
            var3.method158(28194);
            var3.field341 = arg2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 305)
    private final void method297(int arg0) {
        field444++;
        this.field433 = new short[this.field447];
        for (int var2 = 0; var2 < this.field447; var2++) {
            this.field433[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -3) {
            method294(-46);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lbm;ILea;IIIII)V", line = 325)
    public static final void method298(class325 arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -10581) {
            return;
        }
        field436++;
        class223 var8 = null;
        if (arg4 == 0) {
            var8 = (class223) class243.method1587(arg3, arg7, arg6);
        }
        if (arg4 == 1) {
            var8 = (class223) class85.method680(arg3, arg7, arg6);
        }
        if (arg4 == 2) {
            var8 = (class223) class95.method734(arg3, arg7, arg6, field450 == null ? (field450 = method302("iq")) : field450);
        }
        if (arg4 == 3) {
            var8 = (class223) class111.method852(arg3, arg7, arg6);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method695(898);
        int var10 = var8.method709(30030);
        class447 var11 = class133.method996((byte) -19, var8.method711(true));
        if (var11.method2767(14533)) {
            class37.method319(arg7, arg3, arg6, 86, var11);
        }
        if (var8.method706(true)) {
            var8.method704(-29096, arg2);
        }
        if (arg4 == 0) {
            class85.method683(arg3, arg7, arg6);
            if (var11.field6337 != 0) {
                arg0.method1975(var9, !var11.field6283, arg6, var11.field6292, var10, arg7, (byte) 97);
                return;
            }
        } else if (arg4 == 1) {
            class217.method1441(arg3, arg7, arg6);
        } else if (arg4 == 2) {
            class241.method1565(arg3, arg7, arg6, field450 == null ? (field450 = method302("iq")) : field450);
            if (var11.field6337 != 0 && (arg7 + var11.field6330) < class11.field107 && (var11.field6330 + arg6) < class264.field3620 && (var11.field6322 + arg7) < class11.field107 && (var11.field6322 + arg6) < class264.field3620) {
                arg0.method1991(var11.field6292, -1, arg6, !var11.field6283, var10, var11.field6322, arg7, var11.field6330);
                return;
            }
            return;
        } else if (arg4 == 3) {
            class394.method2450(arg3, arg7, arg6);
            if (var11.field6337 == 1) {
                arg0.method1980(arg6, arg7, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lga;", line = 422)
    public static final class279 method300(int arg0, int arg1) {
        field441++;
        if (arg0 >= -37) {
            field446 = null;
        }
        class408 var2 = class144.field2105;
        class279 var3;
        synchronized (class144.field2105) {
            var3 = (class279) class144.field2105.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class29.field408.method1926(0, method290((byte) -18, arg1), class188.method1306(106, arg1));
        class279 var5 = new class279();
        if (var4 != null) {
            var5.method1757((byte) 127, new class366(var4));
        }
        class408 var6 = class144.field2105;
        synchronized (class144.field2105) {
            class144.field2105.method2527(99, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 451)
    private final void method301(byte arg0) {
        if (arg0 != -5) {
            return;
        }
        field437++;
        Random var2 = new Random((long) this.field438);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field440[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class92.method724(var2, var5, 110);
            short var7 = this.field440[var6];
            this.field440[var6] = this.field440[var5];
            this.field440[var5] = this.field440[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public abstract void method291(int arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZ)V")
    public abstract void method293(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public abstract void method299(boolean arg0);
}
