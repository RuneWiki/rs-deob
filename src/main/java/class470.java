import java.awt.Frame;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class470 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lup;")
    private class479 field6592 = null;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Z")
    private boolean field6616;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lla;")
    private class157 field6606;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field6602;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field6610 = 20;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Z")
    public static boolean field6631 = false;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lpn;")
    public static class72 field6604 = new class72(9, 2);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "[I")
    public static int[] field6629;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[Ljava/lang/Object;")
    private Object[] field6608;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6623;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
    public final int method2747(byte arg0, int arg1) {
        field6615++;
        if (!this.method2759(0)) {
            return -1;
        }
        if (arg0 > -59) {
            field6629 = null;
        }
        int var3 = this.field6592.field6788.method210(arg1, 0);
        return this.method2767(-34, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
    public final boolean method2748(byte arg0) {
        field6605++;
        if (!this.method2759(0)) {
            return false;
        }
        boolean var2 = true;
        int var3 = -105 % ((-arg0 - 2) / 59);
        for (int var4 = 0; var4 < this.field6592.field6771.length; var4++) {
            int var5 = this.field6592.field6771[var4];
            if (this.field6608[var5] == null) {
                this.method2775(var5, -102);
                if (this.field6608[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Z")
    public final boolean method2749(int arg0, int arg1, int arg2) {
        field6601++;
        if (!this.method2776(arg2, -15810, arg0)) {
            return false;
        }
        if (arg1 != 18406) {
            field6610 = -53;
        }
        if (this.field6623[arg2] != null && this.field6623[arg2][arg0] != null) {
            return true;
        } else if (this.field6608[arg2] == null) {
            this.method2775(arg2, -96);
            return this.field6608[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)V")
    private final void method2750(byte arg0, int arg1) {
        field6607++;
        if (arg0 != -38) {
            this.method2778(-79, (byte) -23);
        }
        this.field6606.method760(255, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
    public final void method2751(int arg0, byte arg1) {
        field6599++;
        int var3 = 37 % ((29 - arg1) / 38);
        if (this.method2767(106, arg0) && this.field6623 != null) {
            this.field6623[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final void method2752(boolean arg0) {
        field6625++;
        if (arg0) {
            this.field6602 = 91;
        }
        if (this.field6608 != null) {
            for (int var2 = 0; var2 < this.field6608.length; var2++) {
                this.field6608[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method2753(String arg0, byte arg1, String arg2) {
        field6613++;
        if (!this.method2759(0)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field6592.field6788.method210(class257.method1583(var4, (byte) 60), 0);
        if (!this.method2767(100, var6)) {
            return null;
        } else if (arg1 >= -36) {
            return null;
        } else {
            int var7 = this.field6592.field6778[var6].method210(class257.method1583(var5, (byte) 60), 0);
            return this.method2768(-20472, var7, var6);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method2754(int arg0) {
        field6604 = null;
        field6629 = null;
        if (arg0 > -103) {
            method2771(-53, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
    public final int method2755(int arg0, int arg1) {
        field6633++;
        if (arg0 > -76) {
            this.method2769(34);
        }
        return this.method2767(94, arg1) ? this.field6592.field6780[arg1] : 0;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
    public final int method2756(boolean arg0) {
        field6618++;
        if (this.method2759(0)) {
            return arg0 ? this.field6592.field6780.length : -74;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
    public final int method2757(byte arg0) {
        field6620++;
        if (!this.method2759(0)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 112) {
            this.field6592 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6608.length; var4++) {
            if (this.field6592.field6787[var4] > 0) {
                var3 += this.method2760(arg0 + 8, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
    public final boolean method2758(int arg0, int arg1) {
        field6595++;
        if (!this.method2759(arg1 + 1)) {
            return false;
        } else if (this.field6592.field6780.length == 1) {
            return this.method2749(arg0, arg1 + 18407, 0);
        } else {
            if (arg1 != -1) {
                this.method2770(-87);
            }
            if (!this.method2767(100, arg0)) {
                return false;
            } else if (this.field6592.field6780[arg0] == 1) {
                return this.method2749(0, 18406, arg0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
    private final boolean method2759(int arg0) {
        field6590++;
        if (arg0 != 0) {
            this.field6602 = -102;
        }
        if (this.field6592 == null) {
            this.field6592 = this.field6606.method758((byte) -34);
            if (this.field6592 == null) {
                return false;
            }
            this.field6608 = new Object[this.field6592.field6783];
            this.field6623 = new Object[this.field6592.field6783][];
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)I")
    private final int method2760(int arg0, int arg1) {
        field6627++;
        if (!this.method2767(-66, arg1)) {
            return 0;
        } else if (this.field6608[arg1] == null) {
            if (arg0 <= 97) {
                this.field6623 = null;
            }
            return this.field6606.method756(125, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2761(int arg0, String arg1) {
        field6597++;
        if (this.method2759(arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6592.field6788.method210(class257.method1583(var3, (byte) 60), arg0);
            return this.method2767(110, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIIII)V")
    public static final void method2762(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6614++;
        if (arg0 != 75) {
            method2781((byte) 25, '-');
        }
        for (int var5 = 0; var5 < class358.field5172; var5++) {
            Rectangle var6 = class18.field235[var5];
            if (var6.x + var6.width > arg4 && var6.x < arg1 + arg4 && var6.y + var6.height > arg2 && var6.y < (arg2 + arg3)) {
                class217.field2994[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2763(String arg0, int arg1) {
        field6596++;
        if (arg1 != 3) {
            this.field6606 = null;
        }
        if (this.method2759(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6592.field6788.method210(class257.method1583(var3, (byte) 60), 0);
            return this.method2778(var4, (byte) -111);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method2764(String arg0, String arg1, int arg2) {
        field6624++;
        if (!this.method2759(arg2 ^ 0x153)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        if (arg2 != 339) {
            return true;
        }
        int var6 = this.field6592.field6788.method210(class257.method1583(var4, (byte) 60), arg2 ^ 0x153);
        if (this.method2767(-34, var6)) {
            int var7 = this.field6592.field6778[var6].method210(class257.method1583(var5, (byte) 60), 0);
            return this.method2749(var7, 18406, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(II)[I")
    public final int[] method2765(int arg0, int arg1) {
        field6612++;
        if (!this.method2767(arg1 + 116, arg0)) {
            return null;
        }
        int[] var3 = this.field6592.field6775[arg0];
        if (arg1 != 0) {
            field6629 = null;
        }
        if (var3 == null) {
            var3 = new int[this.field6592.field6787[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLkd;Ljava/awt/Frame;)V")
    public static final void method2766(byte arg0, class355 arg1, Frame arg2) {
        field6621++;
        while (true) {
            class405 var3 = arg1.method2172(arg2, -126);
            while (var3.field5759 == 0) {
                class85.method433(10L, 110);
            }
            if (var3.field5759 == 1) {
                arg2.setVisible(false);
                if (arg0 != -102) {
                    field6631 = false;
                }
                arg2.dispose();
                return;
            }
            class85.method433(100L, -85);
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(II)Z")
    private final boolean method2767(int arg0, int arg1) {
        field6598++;
        if (!this.method2759(0)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field6592.field6780.length && this.field6592.field6780[arg1] != 0) {
            int var3 = -10 / ((50 - arg0) / 41);
            return true;
        } else if (class275.field3916) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)[B")
    public final byte[] method2768(int arg0, int arg1, int arg2) {
        field6626++;
        if (arg0 != -20472) {
            this.method2778(76, (byte) 56);
        }
        return this.method2772(arg1, arg2, (int[]) null, (byte) 127);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public final void method2769(int arg0) {
        if (arg0 != 21354) {
            this.field6623 = null;
        }
        field6630++;
        if (this.field6623 != null) {
            for (int var2 = 0; var2 < this.field6623.length; var2++) {
                this.field6623[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
    public final int method2770(int arg0) {
        field6617++;
        if (!this.method2759(arg0)) {
            throw new IllegalStateException("");
        }
        return this.field6592.field6784;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V")
    public static final void method2771(int arg0, byte arg1) {
        field6619++;
        if (arg1 != -26) {
            method2771(117, (byte) 33);
        }
        class401.field5720 = 3;
        class413.field5878 = 100;
        class224.field3108 = -1;
        class118.field1461 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[IB)[B")
    public final byte[] method2772(int arg0, int arg1, int[] arg2, byte arg3) {
        field6609++;
        if (arg3 < 121) {
            this.method2763((String) null, -20);
        }
        if (!this.method2776(arg1, -15810, arg0)) {
            return null;
        }
        if (this.field6623[arg1] == null || this.field6623[arg1][arg0] == null) {
            boolean var5 = this.method2777(arg0, arg1, arg2, true);
            if (!var5) {
                this.method2775(arg1, -27);
                boolean var6 = this.method2777(arg0, arg1, arg2, true);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class170.method828(false, this.field6623[arg1][arg0], -115);
        if (this.field6602 == 1) {
            this.field6623[arg1][arg0] = null;
            if (this.field6592.field6780[arg1] == 1) {
                this.field6623[arg1] = null;
            }
        } else if (this.field6602 == 2) {
            this.field6623[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2773(String arg0, int arg1) {
        field6600++;
        if (this.method2759(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6592.field6788.method210(class257.method1583(var3, (byte) 60), ~arg1);
            return arg1 >= ~var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Ljava/lang/String;I)V")
    public final void method2774(String arg0, int arg1) {
        field6593++;
        if (this.method2759(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6592.field6788.method210(class257.method1583(var3, (byte) 60), arg1 ^ arg1);
            this.method2750((byte) -38, var4);
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(II)V")
    private final void method2775(int arg0, int arg1) {
        if (this.field6616) {
            this.field6608[arg0] = this.field6606.method759(arg0, -28677);
        } else {
            this.field6608[arg0] = class160.method772(-30710, this.field6606.method759(arg0, -28677), false);
        }
        field6634++;
        if (arg1 >= -25) {
            field6610 = 94;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(III)Z")
    private final boolean method2776(int arg0, int arg1, int arg2) {
        if (arg1 != -15810) {
            this.field6606 = null;
        }
        field6591++;
        if (!this.method2759(0)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field6592.field6780.length && this.field6592.field6780[arg0] > arg2) {
            return true;
        } else if (class275.field3916) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[IZ)Z")
    private final boolean method2777(int arg0, int arg1, int[] arg2, boolean arg3) {
        field6603++;
        if (!this.method2767(-69, arg1)) {
            return false;
        } else if (this.field6608[arg1] == null) {
            return false;
        } else {
            int var5 = this.field6592.field6787[arg1];
            int[] var6 = this.field6592.field6775[arg1];
            if (this.field6623[arg1] == null) {
                this.field6623[arg1] = new Object[this.field6592.field6780[arg1]];
            }
            Object[] var7 = this.field6623[arg1];
            boolean var8 = arg3;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class170.method828(false, this.field6608[arg1], -90);
            } else {
                var11 = class170.method828(true, this.field6608[arg1], -88);
                class179 var12 = new class179(var11);
                var12.method901(5, var12.field2159.length, arg2, 329252867);
            }
            byte[] var13;
            try {
                var13 = class79.method398(var11, (byte) 95);
            } catch (RuntimeException var49) {
                throw class337.method2041(var49, "T3 - " + (arg2 != null) + "," + arg1 + "," + var11.length + "," + class218.method1223((byte) -70, var11.length, var11) + "," + class218.method1223((byte) -101, var11.length - 2, var11) + "," + this.field6592.field6777[arg1] + "," + this.field6592.field6784);
            }
            if (this.field6616) {
                this.field6608[arg1] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6602 == 0) {
                    var7[var15] = class160.method772(-30710, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6602 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class179 var35 = new class179(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field2206 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method939((byte) -70);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg0 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field2206 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method939((byte) 65);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg0 == var48) {
                            class268.method1625(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class179 var19 = new class179(var13);
                int[] var20 = new int[var5];
                var19.field2206 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method939((byte) 42);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field2206 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method939((byte) 126);
                        class268.method1625(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field6602 == 0) {
                        var7[var31] = class160.method772(-30710, var24[var30], false);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(IB)Z")
    public final boolean method2778(int arg0, byte arg1) {
        field6589++;
        if (!this.method2767(117, arg0)) {
            return false;
        }
        if (arg1 != -111) {
            field6604 = null;
        }
        if (this.field6608[arg0] == null) {
            this.method2775(arg0, arg1 + 46);
            return this.field6608[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(II)[B")
    public final byte[] method2779(int arg0, int arg1) {
        field6632++;
        if (!this.method2759(0)) {
            return null;
        } else if (this.field6592.field6780.length == 1) {
            return this.method2768(-20472, arg1, 0);
        } else if (!this.method2767(-80, arg1)) {
            return null;
        } else if (this.field6592.field6780[arg1] == arg0) {
            return this.method2768(-20472, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZI)V")
    public final void method2780(boolean arg0, boolean arg1, int arg2) {
        field6622++;
        if (!this.method2759(0) || arg2 >= -114) {
            return;
        }
        if (arg1) {
            this.field6592.field6782 = null;
            this.field6592.field6778 = null;
        }
        if (arg0) {
            this.field6592.field6774 = null;
            this.field6592.field6788 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lla;ZI)V")
    public class470(class157 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6616 = arg1;
        this.field6606 = arg0;
        this.field6602 = arg2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BC)B")
    public static final byte method2781(byte arg0, char arg1) {
        if (arg0 != -42) {
            field6631 = false;
        }
        field6611++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(Ljava/lang/String;I)I")
    public final int method2782(String arg0, int arg1) {
        field6594++;
        if (this.method2759(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6592.field6788.method210(class257.method1583(var3, (byte) 60), arg1);
            return this.method2760(111, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method2783(boolean arg0, byte arg1, String arg2) {
        field6628++;
        class78.field936.field6602 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class422.field6096.field219; var6++) {
            class385 var9 = class422.field6096.method121(var6, -1);
            if ((!arg0 || var9.field5487) && var9.field5473 == -1 && var9.field5474 == -1 && var9.field5518 == 0 && var9.field5469.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class31.field386 = null;
                    class324.field4675 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class62.field770 = 0;
        class31.field386 = var4;
        class324.field4675 = var5;
        String[] var7 = new String[class324.field4675];
        for (int var8 = 0; var8 < class324.field4675; var8++) {
            var7[var8] = class422.field6096.method121(var4[var8], arg1 - 41).field5469;
        }
        class18.method123(arg1 - 28912, class31.field386, var7);
        class78.field936.method2769(arg1 ^ 0x5342);
        class78.field936.field6602 = 2;
        if (arg1 != 40) {
            field6610 = 112;
        }
    }
}
