import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class124 {

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Lge;")
    public static class47 field792 = new class47(50);

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lr;")
    public static class118 field795 = class153.method1136(85, "");

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lef;")
    public static class35 field797 = new class35(8);

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "B")
    public byte field788;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Ljf;")
    public class68 field785;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "[Ln;")
    public static class90[] field794;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Z")
    public static final boolean method261(int arg0, byte arg1) {
        field783++;
        if (arg0 < 32) {
            return false;
        }
        int var2 = -8 / ((-arg1 - 46) / 40);
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILr;B)V")
    public static final void method262(int arg0, class118 arg1, byte arg2) {
        field793++;
        class118 var3 = arg1.method928(30330).method903(arg2 - 18);
        boolean var4 = false;
        int var5 = 0;
        if (arg2 != 56) {
            return;
        }
        while (var5 < class105.field2425) {
            class132 var6 = class108.field2526[class73.field1685[var5]];
            if (var6 != null && var6.field2996 != null && var6.field2996.method911(var3, 14934)) {
                class81.method674(0, class89.field2150.field710[0], (byte) -79, var6.field710[0], var6.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                if (arg0 == 1) {
                    class146.field3255++;
                    class1.field22.method722(213, (byte) -125);
                    class1.field22.method841(class73.field1685[var5], arg2 - 124);
                } else if (arg0 == 4) {
                    class141.field3199++;
                    class1.field22.method722(103, (byte) -124);
                    class1.field22.method841(class73.field1685[var5], -61);
                } else if (arg0 == 6) {
                    class1.field22.method722(228, (byte) 115);
                    class1.field22.method841(class73.field1685[var5], -63);
                    class127.field2905++;
                } else if (arg0 == 7) {
                    class1.field22.method722(107, (byte) 16);
                    class1.field22.method808(1624265448, class73.field1685[var5]);
                    class110.field2534++;
                }
                var4 = true;
                break;
            }
            var5++;
        }
        if (!var4) {
            class103.method786(class110.field2567, class144.method1066(true, new class118[] { class65.field1499, var3 }), 0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public static final void method263(byte arg0) {
        int var1 = class53.field1253.method725(8, 8);
        field787++;
        int var2 = 121 / ((40 - arg0) / 61);
        if (var1 < class105.field2425) {
            for (int var3 = var1; var3 < class105.field2425; var3++) {
                class2.field37[class83.field1994++] = class73.field1685[var3];
            }
        }
        if (var1 > class105.field2425) {
            throw new RuntimeException("gppov1");
        }
        class105.field2425 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class73.field1685[var4];
            class132 var6 = class108.field2526[var5];
            int var7 = class53.field1253.method725(8, 1);
            if (var7 == 0) {
                class73.field1685[class105.field2425++] = var5;
                var6.field742 = class65.field1479;
            } else {
                int var8 = class53.field1253.method725(8, 2);
                if (var8 == 0) {
                    class73.field1685[class105.field2425++] = var5;
                    var6.field742 = class65.field1479;
                    class157.field3628[class92.field2216++] = var5;
                } else if (var8 == 1) {
                    class73.field1685[class105.field2425++] = var5;
                    var6.field742 = class65.field1479;
                    int var9 = class53.field1253.method725(8, 3);
                    var6.method257((byte) -18, false, var9);
                    int var10 = class53.field1253.method725(8, 1);
                    if (var10 == 1) {
                        class157.field3628[class92.field2216++] = var5;
                    }
                } else if (var8 == 2) {
                    class73.field1685[class105.field2425++] = var5;
                    var6.field742 = class65.field1479;
                    int var11 = class53.field1253.method725(8, 3);
                    var6.method257((byte) -18, true, var11);
                    int var12 = class53.field1253.method725(8, 3);
                    var6.method257((byte) -18, true, var12);
                    int var13 = class53.field1253.method725(8, 1);
                    if (var13 == 1) {
                        class157.field3628[class92.field2216++] = var5;
                    }
                } else if (var8 == 3) {
                    class2.field37[class83.field1994++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lvf;IIILjava/awt/Component;)Lgb;")
    public static final class45 method264(class152 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field789++;
        if (class85.field2084 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class45 var5 = (class45) Class.forName("cc").getDeclaredConstructor().newInstance();
                var5.field1060 = new int[(class41.field972 ? 2 : 1) * 256];
                var5.field1092 = arg2;
                var5.method172(arg4);
                var5.field1095 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field1095 > 16384) {
                    var5.field1095 = 16384;
                }
                var5.method171(var5.field1095);
                if (class136.field3087 > 0 && class68.field1586 == null) {
                    class68.field1586 = new class139();
                    class68.field1586.field3174 = arg0;
                    arg0.method1128(-17306, class68.field1586, class136.field3087);
                }
                if (class68.field1586 != null) {
                    if (class68.field1586.field3175[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class68.field1586.field3175[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class93 var6 = new class93(arg0, arg3);
                    var6.field1092 = arg2;
                    var6.field1060 = new int[(class41.field972 ? 2 : 1) * 256];
                    var6.method172(arg4);
                    if (arg1 < 82) {
                        return null;
                    }
                    var6.field1095 = 16384;
                    var6.method171(var6.field1095);
                    if (class136.field3087 > 0 && class68.field1586 == null) {
                        class68.field1586 = new class139();
                        class68.field1586.field3174 = arg0;
                        arg0.method1128(-17306, class68.field1586, class136.field3087);
                    }
                    if (class68.field1586 != null) {
                        if (class68.field1586.field3175[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class68.field1586.field3175[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class45();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lsc;IIIII[BIII)V")
    public static final void method265(class128[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        field791++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg5 + var15 > 0 && arg5 + var15 < 103) {
                    arg0[arg8].field2958[arg1 + var10][arg5 + var15] = class79.method669(arg0[arg8].field2958[arg1 + var10][arg5 + var15], -16777217);
                }
            }
        }
        if (arg9 < 46) {
            method264(null, -7, 56, -36, null);
        }
        class105 var11 = new class105(arg6);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 == var12 && var13 >= arg7 && var13 < arg7 + 8 && arg4 <= var14 && var14 < arg4 + 8) {
                        class140.method1049(var11, arg3, 0, arg8, arg1 + class113.method878(arg3, var13 & 0x7, var14 & 0x7, 71), arg5 + class130.method1011(var14 & 0x7, (byte) 126, arg3, var13 & 0x7), 29571, 0);
                    } else {
                        class140.method1049(var11, 0, 0, 0, -1, -1, 29571, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)I")
    public static final int method266(byte arg0, int arg1, int arg2, int arg3) {
        field790++;
        if ((class33.field830[arg1][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class33.field830[1][arg2][arg3] & 0x2) == 0) {
            int var4 = 43 / ((44 - arg0) / 50);
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        field795 = null;
        if (!arg0) {
            field794 = null;
            field797 = null;
            field792 = null;
        }
    }
}
