import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class176 {

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "Lvj;")
    private class116 field2641 = null;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
    private boolean field2629;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Ldg;")
    private class141 field2622;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Z")
    private boolean field2627;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field2614 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
    public static boolean field2608 = false;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field2633;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2636;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "[[Z")
    public static boolean[][] field2648;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
    public final boolean method1147(int arg0, int arg1) {
        field2638++;
        if (!this.method1173(1)) {
            return false;
        } else if (this.field2641.field1801.length == 1) {
            return this.method1175(arg0, 0, (byte) -35);
        } else if (!this.method1149(arg0, -917)) {
            return false;
        } else if (this.field2641.field1801[arg0] == 1) {
            return this.method1175(0, arg0, (byte) -35);
        } else {
            if (arg1 >= -44) {
                field2648 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
    private final boolean method1148(int arg0, int arg1, int arg2) {
        field2644++;
        if (!this.method1173(1)) {
            return false;
        } else if (arg0 >= ~arg1 && arg2 >= 0 && this.field2641.field1801.length > arg1 && this.field2641.field1801[arg1] > arg2) {
            return true;
        } else if (class224.field3527) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Z")
    private final boolean method1149(int arg0, int arg1) {
        field2624++;
        if (!this.method1173(1)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2641.field1801.length && this.field2641.field1801[arg0] != 0) {
            if (arg1 != -917) {
                this.method1148(90, 120, -23);
            }
            return true;
        } else if (class224.field3527) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method1150(int arg0) {
        if (arg0 > -71) {
            this.field2641 = null;
        }
        field2610++;
        if (this.field2636 != null) {
            for (int var2 = 0; var2 < this.field2636.length; var2++) {
                this.field2636[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)Z")
    public final boolean method1151(int arg0, int arg1) {
        field2637++;
        if (arg1 <= 59) {
            method1171(30);
        }
        if (!this.method1149(arg0, -917)) {
            return false;
        } else if (this.field2633[arg0] == null) {
            this.method1179(-120, arg0);
            return this.field2633[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)[B")
    public final byte[] method1152(int arg0, int arg1) {
        field2632++;
        if (!this.method1173(1)) {
            return null;
        } else if (this.field2641.field1801.length == 1) {
            return this.method1163(0, arg1, 48);
        } else if (!this.method1149(arg1, -917)) {
            return null;
        } else if (this.field2641.field1801[arg1] == 1) {
            return this.method1163(arg1, 0, 48);
        } else if (arg0 == -4897) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(II)I")
    private final int method1153(int arg0, int arg1) {
        field2630++;
        if (!this.method1149(arg1, -917)) {
            return 0;
        } else if (this.field2633[arg1] == null) {
            if (arg0 != -20247) {
                this.method1149(61, 88);
            }
            return this.field2622.method978(9214, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1154(int arg0, byte arg1, int arg2) {
        field2612++;
        if (arg1 != -79) {
            this.method1149(106, 127);
        }
        if (!this.method1148(arg1 + 78, arg2, arg0)) {
            return null;
        }
        if (this.field2636[arg2] == null || this.field2636[arg2][arg0] == null) {
            boolean var4 = this.method1174((byte) 122, (int[]) null, arg2);
            if (!var4) {
                this.method1179(87, arg2);
                boolean var5 = this.method1174((byte) 124, (int[]) null, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        return class245.method1658((byte) -123, this.field2636[arg2][arg0], false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1155(String arg0, int arg1) {
        field2643++;
        if (!this.method1173(1)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 21089) {
            this.method1149(56, 96);
        }
        int var4 = this.field2641.field1816.method1794(-74, class289.method1947(-27930, var3));
        return this.method1153(-20247, var4);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    private final void method1156(int arg0, byte arg1) {
        field2647++;
        this.field2622.method971(false, arg0);
        if (arg1 != -31) {
            field2642 = -122;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[I")
    public final int[] method1157(int arg0, boolean arg1) {
        field2645++;
        if (arg1) {
            this.field2627 = true;
        }
        if (!this.method1149(arg0, -917)) {
            return null;
        }
        int[] var3 = this.field2641.field1806[arg0];
        if (var3 == null) {
            var3 = new int[this.field2641.field1802[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1158(int arg0, String arg1) {
        field2640++;
        if (arg0 != 27772) {
            this.field2629 = true;
        }
        if (this.method1173(1)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2641.field1816.method1794(-112, class289.method1947(-27930, var3));
            return this.method1151(var4, 120);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[IB)[B")
    public final byte[] method1159(int arg0, int arg1, int[] arg2, byte arg3) {
        field2623++;
        if (!this.method1148(-1, arg1, arg0)) {
            return null;
        }
        if (arg3 >= -56) {
            this.method1150(-127);
        }
        if (this.field2636[arg1] == null || this.field2636[arg1][arg0] == null) {
            boolean var5 = this.method1174((byte) 126, arg2, arg1);
            if (!var5) {
                this.method1179(-90, arg1);
                boolean var6 = this.method1174((byte) 124, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class245.method1658((byte) -120, this.field2636[arg1][arg0], false);
        if (this.field2629) {
            this.field2636[arg1][arg0] = null;
            if (this.field2641.field1801[arg1] == 1) {
                this.field2636[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
    public final byte[] method1160(String arg0, boolean arg1, String arg2) {
        field2639++;
        if (!this.method1173(1)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (!arg1) {
            this.method1179(25, 60);
        }
        int var6 = this.field2641.field1816.method1794(-90, class289.method1947(-27930, var4));
        if (this.method1149(var6, -917)) {
            int var7 = this.field2641.field1814[var6].method1794(-91, class289.method1947(-27930, var5));
            return this.method1163(var6, var7, 48);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
    public final int method1161(int arg0) {
        field2628++;
        if (arg0 != 100) {
            this.method1162((byte) -14, (String) null, (String) null);
        }
        if (!this.method1173(1)) {
            throw new IllegalStateException("");
        }
        return this.field2641.field1797;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1162(byte arg0, String arg1, String arg2) {
        field2620++;
        if (!this.method1173(1)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg0 < 27) {
            return false;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field2641.field1816.method1794(-105, class289.method1947(-27930, var4));
        if (this.method1149(var6, -917)) {
            int var7 = this.field2641.field1814[var6].method1794(-80, class289.method1947(-27930, var5));
            return this.method1175(var7, var6, (byte) -35);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)[B")
    public final byte[] method1163(int arg0, int arg1, int arg2) {
        if (arg2 != 48) {
            this.field2629 = true;
        }
        field2615++;
        return this.method1159(arg1, arg0, (int[]) null, (byte) -107);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZZZ)V")
    public final void method1164(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            this.method1155((String) null, -56);
        }
        field2631++;
        if (!this.method1173(1)) {
            return;
        }
        if (arg2) {
            this.field2641.field1794 = null;
            this.field2641.field1816 = null;
        }
        if (arg0) {
            this.field2641.field1812 = null;
            this.field2641.field1814 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(II)I")
    public final int method1165(int arg0, int arg1) {
        field2625++;
        if (this.method1149(arg1, -917)) {
            return arg0 == 3 ? this.field2641.field1801[arg1] : -103;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILtd;I)V")
    public static final void method1166(int arg0, int arg1, int arg2, class73 arg3, int arg4) {
        field2619++;
        for (class144 var5 = (class144) class286.field4493.method1010(122); var5 != null; var5 = (class144) class286.field4493.method1008((byte) 88)) {
            if (var5.field2250 == arg2 && arg0 * 128 == var5.field2242 && (arg4 * 128) == var5.field2241 && var5.field2228.field1209 == arg3.field1209) {
                if (var5.field2233 != null) {
                    class39.field661.method718(var5.field2233);
                    var5.field2233 = null;
                }
                if (var5.field2237 != null) {
                    class39.field661.method718(var5.field2237);
                    var5.field2237 = null;
                }
                var5.method693(-97);
                return;
            }
        }
        if (arg1 != 21801) {
            method1171(-42);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
    public final int method1167(int arg0) {
        field2635++;
        if (this.method1173(1)) {
            return arg0 >= -121 ? -73 : this.field2641.field1801.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1168(int arg0, String arg1) {
        field2616++;
        if (!this.method1173(arg0 - 20344)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == 20345) {
            int var4 = this.field2641.field1816.method1794(arg0 - 20396, class289.method1947(-27930, var3));
            return this.method1149(var4, -917) ? var4 : -1;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method1169(String arg0, int arg1) {
        if (arg1 >= -71) {
            this.method1162((byte) 21, (String) null, (String) null);
        }
        field2609++;
        if (this.method1173(1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2641.field1816.method1794(-72, class289.method1947(-27930, var3));
            this.method1156(var4, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1170(int arg0, String arg1) {
        field2621++;
        if (this.method1173(1)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2641.field1816.method1794(-72, class289.method1947(-27930, var3));
            return arg0 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static void method1171(int arg0) {
        if (arg0 == 1) {
            field2648 = null;
            field2614 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
    public final int method1172(int arg0) {
        field2617++;
        if (!this.method1173(1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2633.length; var4++) {
            if (this.field2641.field1802[var4] > 0) {
                var3 += this.method1153(-20247, var4);
                var2 += 100;
            }
        }
        if (arg0 <= 3) {
            this.field2633 = null;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
    private final boolean method1173(int arg0) {
        if (arg0 != 1) {
            return true;
        }
        field2618++;
        if (this.field2641 == null) {
            this.field2641 = this.field2622.method975(-115);
            if (this.field2641 == null) {
                return false;
            }
            this.field2633 = new Object[this.field2641.field1795];
            this.field2636 = new Object[this.field2641.field1795][];
        }
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B[II)Z")
    private final boolean method1174(byte arg0, int[] arg1, int arg2) {
        field2634++;
        if (!this.method1149(arg2, -917)) {
            return false;
        } else if (this.field2633[arg2] == null) {
            return false;
        } else {
            int var4 = this.field2641.field1802[arg2];
            int[] var5 = this.field2641.field1806[arg2];
            boolean var6 = true;
            if (this.field2636[arg2] == null) {
                this.field2636[arg2] = new Object[this.field2641.field1801[arg2]];
            }
            Object[] var7 = this.field2636[arg2];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class245.method1658((byte) -123, this.field2633[arg2], false);
            } else {
                var10 = class245.method1658((byte) -125, this.field2633[arg2], true);
                class37 var11 = new class37(var10);
                var11.method308(false, var11.field583.length, arg1, 5);
            }
            byte[] var12;
            try {
                if (arg0 <= 119) {
                    field2648 = null;
                }
                var12 = class241.method1630(var10, (byte) 89);
            } catch (RuntimeException var31) {
                throw class88.method702(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class76.method604(var10.length, 0, var10) + "," + class76.method604(var10.length - 2, 0, var10) + "," + this.field2641.field1809[arg2] + "," + this.field2641.field1797);
            }
            if (this.field2627) {
                this.field2633[arg2] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field2629) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class206.method1379(false, (byte) 5, var12);
                }
            } else {
                int[] var15 = new int[var4];
                int var16 = var12.length;
                int var32 = var16 - 1;
                int var17 = var12[var32] & 0xFF;
                int var18 = var32 - var4 * var17 * 4;
                class37 var19 = new class37(var12);
                var19.field588 = var18;
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var19.method307(-56);
                        var15[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var15[var24]];
                    var15[var24] = 0;
                }
                var19.field588 = var18;
                int var25 = 0;
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method307(-123);
                        class236.method1588(var12, var25, var23[var28], var15[var28], var27);
                        var25 += var27;
                        var15[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field2629) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class206.method1379(false, (byte) 5, var23[var29]);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIB)Z")
    public final boolean method1175(int arg0, int arg1, byte arg2) {
        field2646++;
        if (!this.method1148(-1, arg1, arg0)) {
            return false;
        } else if (arg2 != -35) {
            return false;
        } else if (this.field2636[arg1] != null && this.field2636[arg1][arg0] != null) {
            return true;
        } else if (this.field2633[arg1] == null) {
            this.method1179(-114, arg1);
            return this.field2633[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
    public final boolean method1176(byte arg0) {
        field2611++;
        if (!this.method1173(1)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 22 % ((14 - arg0) / 33);
        for (int var4 = 0; var4 < this.field2641.field1813.length; var4++) {
            int var5 = this.field2641.field1813[var4];
            if (this.field2633[var5] == null) {
                this.method1179(122, var5);
                if (this.field2633[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(II)V")
    public final void method1177(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1159(53, 91, (int[]) null, (byte) -35);
        }
        field2613++;
        if (this.method1149(arg1, -917) && this.field2636 != null) {
            this.field2636[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZZJ)Ljava/lang/String;")
    public static final String method1178(int arg0, int arg1, boolean arg2, boolean arg3, long arg4) {
        if (!arg2) {
            field2608 = true;
        }
        field2626++;
        char var6 = ',';
        char var7 = '.';
        StringBuffer var8 = new StringBuffer(26);
        boolean var9 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var9 = true;
        }
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var8.append((char) (var11 + 48 - (int) arg4 * 10));
            }
            var8.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var8.append((char) (var13 + 48 - (int) arg4 * 10));
            if (arg4 == 0L) {
                if (var9) {
                    var8.append('-');
                }
                return var8.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var8.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(II)V")
    private final void method1179(int arg0, int arg1) {
        field2649++;
        if (this.field2627) {
            this.field2633[arg1] = this.field2622.method973(arg1, (byte) 87);
        } else {
            this.field2633[arg1] = class206.method1379(false, (byte) 5, this.field2622.method973(arg1, (byte) -73));
        }
        int var3 = -106 % ((arg0 - 32) / 40);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ldg;ZZ)V")
    public class176(class141 arg0, boolean arg1, boolean arg2) {
        this.field2629 = arg2;
        this.field2622 = arg0;
        this.field2627 = arg1;
    }
}
