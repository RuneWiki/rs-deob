import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class544 {

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lew;")
    private class516 field7624 = null;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
    private boolean field7627;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public int field7650;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lal;")
    private class108 field7621;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lke;")
    public static class622 field7640 = new class622(58, 0);

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Lrm;")
    public static class428 field7649 = new class428();

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Lem;")
    public static class234 field7646;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[Ljava/lang/Object;")
    private Object[] field7637;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7638;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method3126(byte arg0, String arg1, String arg2) {
        field7617++;
        int var4 = 87 / ((-arg0 - 33) / 61);
        if (!this.method3159(false)) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        String var6 = arg2.toLowerCase();
        int var7 = this.field7624.field7380.method2385(-128, class463.method2746(var5, false));
        if (this.method3146((byte) 113, var7)) {
            int var8 = this.field7624.field7373[var7].method2385(-128, class463.method2746(var6, false));
            return this.method3150(var8, -117, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)Z")
    private final boolean method3127(byte arg0, int arg1, int arg2) {
        field7643++;
        if (arg0 != -128) {
            return false;
        } else if (!this.method3159(false)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field7624.field7368.length > arg1 && this.field7624.field7368[arg1] > arg2) {
            return true;
        } else if (class373.field5371) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method3128(int arg0) {
        field7649 = null;
        if (arg0 != -1) {
            field7646 = null;
        }
        field7646 = null;
        field7640 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method3129(int arg0) {
        if (arg0 != 0) {
            field7651 = -70;
        }
        if (this.field7637 != null) {
            for (int var2 = 0; var2 < this.field7637.length; var2++) {
                this.field7637[var2] = null;
            }
        }
        field7615++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method3130(String arg0, boolean arg1) {
        field7618++;
        if (arg1) {
            return true;
        } else {
            int var3 = this.method3134(0, "");
            return var3 == -1 ? this.method3151("", arg0, 255) : this.method3151(arg0, "", 255);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
    public final boolean method3131(int arg0, int arg1) {
        field7639++;
        if (!this.method3159(false)) {
            return false;
        } else if (this.field7624.field7368.length == 1) {
            return this.method3135(-1, arg1, 0);
        } else if (this.method3146((byte) 125, arg1)) {
            int var3 = 124 / ((26 - arg0) / 63);
            if (this.field7624.field7368[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method3135(-1, 0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
    public final boolean method3132(boolean arg0) {
        field7654++;
        if (!this.method3159(!arg0)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field7624.field7377.length; var3++) {
            int var4 = this.field7624.field7377[var3];
            if (this.field7637[var4] == null) {
                this.method3152(false, var4);
                if (this.field7637[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method3133(String arg0, boolean arg1) {
        field7631++;
        if (!this.method3159(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field7624.field7380.method2385(-127, class463.method2746(var3, false));
        if (!arg1) {
            this.method3126((byte) 21, null, null);
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method3134(int arg0, String arg1) {
        field7634++;
        if (!this.method3159(false)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field7624.field7380.method2385(-128, class463.method2746(var3, false));
        if (this.method3146((byte) 102, var4)) {
            if (arg0 != 0) {
                this.field7621 = null;
            }
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
    public final boolean method3135(int arg0, int arg1, int arg2) {
        field7628++;
        if (!this.method3127((byte) -128, arg2, arg1)) {
            return false;
        } else if (arg0 != -1) {
            return true;
        } else if (this.field7638[arg2] != null && this.field7638[arg2][arg1] != null) {
            return true;
        } else if (this.field7637[arg2] == null) {
            this.method3152(false, arg2);
            return this.field7637[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
    public final int method3136(boolean arg0) {
        field7642++;
        return this.method3159(arg0) ? this.field7624.field7368.length : -1;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final void method3137(int arg0) {
        if (this.field7638 != null) {
            for (int var2 = 0; var2 < this.field7638.length; var2++) {
                this.field7638[var2] = null;
            }
        }
        field7626++;
        int var3 = -53 % ((-arg0 - 33) / 48);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method3138(byte arg0, String arg1) {
        field7641++;
        if (!this.method3159(false)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field7624.field7380.method2385(-125, class463.method2746(var3, false));
        this.method3143(var4, false);
        if (arg0 != 3) {
            this.method3153(66, (byte) -45, 10, null);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[I")
    public final int[] method3139(int arg0, int arg1) {
        field7625++;
        if (!this.method3146((byte) 106, arg1)) {
            return null;
        }
        int[] var3 = this.field7624.field7366[arg1];
        if (var3 == null) {
            var3 = new int[this.field7624.field7367[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (arg0 != -1) {
            this.method3148(-6, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z")
    public final boolean method3140(int arg0, byte arg1) {
        field7645++;
        if (!this.method3146((byte) 102, arg0)) {
            return false;
        }
        if (arg1 >= -48) {
            this.field7637 = null;
        }
        if (this.field7637[arg0] == null) {
            this.method3152(false, arg0);
            return this.field7637[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
    public final void method3141(int arg0, int arg1) {
        field7644++;
        if (arg1 != 22675) {
            this.method3157(-123);
        }
        if (this.method3146((byte) 102, arg0) && this.field7638 != null) {
            this.field7638[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIII)[B")
    public final byte[] method3142(int[] arg0, int arg1, int arg2, int arg3) {
        field7622++;
        if (!this.method3127((byte) -128, arg3, arg2)) {
            return null;
        }
        if (this.field7638[arg3] == null || this.field7638[arg3][arg2] == null) {
            boolean var5 = this.method3153(arg3, (byte) 127, arg2, arg0);
            if (!var5) {
                this.method3152(false, arg3);
                boolean var6 = this.method3153(arg3, (byte) 102, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class650.method3723(false, (byte) 81, this.field7638[arg3][arg2]);
        if (~this.field7650 == arg1) {
            this.field7638[arg3][arg2] = null;
            if (this.field7624.field7368[arg3] == 1) {
                this.field7638[arg3] = null;
            }
        } else if (this.field7650 == 2) {
            this.field7638[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
    private final void method3143(int arg0, boolean arg1) {
        if (arg1) {
            this.method3144(106, 61);
        }
        field7629++;
        this.field7621.method730(arg0, !arg1);
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)I")
    private final int method3144(int arg0, int arg1) {
        field7619++;
        if (arg1 != 0) {
            this.method3139(-61, -52);
        }
        if (this.method3146((byte) 108, arg0)) {
            return this.field7637[arg0] == null ? this.field7621.method726((byte) -85, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIZ)V")
    public final void method3145(boolean arg0, int arg1, boolean arg2) {
        field7612++;
        if (arg1 != -5823) {
            this.field7638 = null;
        }
        if (!this.method3159(false)) {
            return;
        }
        if (arg2) {
            this.field7624.field7380 = null;
            this.field7624.field7388 = null;
        }
        if (arg0) {
            this.field7624.field7373 = null;
            this.field7624.field7370 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
    private final boolean method3146(byte arg0, int arg1) {
        field7616++;
        if (!this.method3159(false)) {
            return false;
        }
        if (arg0 < 88) {
            this.method3143(-42, true);
        }
        if (arg1 >= 0 && this.field7624.field7368.length > arg1 && this.field7624.field7368[arg1] != 0) {
            return true;
        } else if (class373.field5371) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)I")
    public final int method3147(int arg0, int arg1) {
        field7613++;
        int var3 = -27 / ((-arg1 - 3) / 34);
        return this.method3146((byte) 118, arg0) ? this.field7624.field7368[arg0] : 0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method3148(int arg0, String arg1) {
        field7648++;
        if (this.method3159(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = -57 % ((arg0 - 57) / 51);
            int var5 = this.field7624.field7380.method2385(-124, class463.method2746(var3, false));
            return this.method3144(var5, 0);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(II)[B")
    public final byte[] method3149(int arg0, int arg1) {
        field7652++;
        if (!this.method3159(false)) {
            return null;
        }
        if (arg1 > -86) {
            field7649 = null;
        }
        if (this.field7624.field7368.length == 1) {
            return this.method3150(arg0, -102, 0);
        } else if (!this.method3146((byte) 96, arg0)) {
            return null;
        } else if (this.field7624.field7368[arg0] == 1) {
            return this.method3150(0, 110, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)[B")
    public final byte[] method3150(int arg0, int arg1, int arg2) {
        int var4 = -121 / ((arg1 + 26) / 40);
        field7636++;
        return this.method3142(null, -2, arg0, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method3151(String arg0, String arg1, int arg2) {
        field7632++;
        if (!this.method3159(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 != 255) {
            return true;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field7624.field7380.method2385(-128, class463.method2746(var4, false));
        if (this.method3146((byte) 111, var6)) {
            int var7 = this.field7624.field7373[var6].method2385(arg2 - 382, class463.method2746(var5, false));
            return this.method3135(-1, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    private final void method3152(boolean arg0, int arg1) {
        field7635++;
        if (this.field7627) {
            this.field7637[arg1] = this.field7621.method727(arg1, (byte) 2);
        } else {
            this.field7637[arg1] = class687.method3876(this.field7621.method727(arg1, (byte) 2), false, -137);
        }
        if (arg0) {
            field7649 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI[I)Z")
    private final boolean method3153(int arg0, byte arg1, int arg2, int[] arg3) {
        field7620++;
        if (!this.method3146((byte) 100, arg0)) {
            return false;
        }
        if (arg1 < 76) {
            this.method3142(null, 122, 114, -92);
        }
        if (this.field7637[arg0] == null) {
            return false;
        }
        int var5 = this.field7624.field7367[arg0];
        int[] var6 = this.field7624.field7366[arg0];
        if (this.field7638[arg0] == null) {
            this.field7638[arg0] = new Object[this.field7624.field7368[arg0]];
        }
        Object[] var7 = this.field7638[arg0];
        boolean var8 = true;
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
        if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
            var11 = class650.method3723(true, (byte) 74, this.field7637[arg0]);
            class120 var12 = new class120(var11);
            var12.method892(var12.field1556.length, -329930267, arg3, 5);
        } else {
            var11 = class650.method3723(false, (byte) 91, this.field7637[arg0]);
        }
        byte[] var13;
        try {
            var13 = class264.method1740(var11, (byte) 94);
        } catch (RuntimeException var49) {
            throw class581.method3378(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class459.method2739((byte) 98, var11, var11.length) + "," + class459.method2739((byte) 120, var11, var11.length - 2) + "," + this.field7624.field7379[arg0] + "," + this.field7624.field7372);
        }
        if (this.field7627) {
            this.field7637[arg0] = null;
        }
        if (var5 <= 1) {
            int var15;
            if (var6 == null) {
                var15 = 0;
            } else {
                var15 = var6[0];
            }
            if (this.field7650 == 0) {
                var7[var15] = class687.method3876(var13, false, -137);
            } else {
                var7[var15] = var13;
            }
        } else if (this.field7650 == 2) {
            int var32 = var13.length;
            int var51 = var32 - 1;
            int var33 = var13[var51] & 0xFF;
            int var34 = var51 - var33 * 4 * var5;
            class120 var35 = new class120(var13);
            int var36 = 0;
            int var37 = 0;
            var35.field1521 = var34;
            for (int var38 = 0; var38 < var33; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var5; var40++) {
                    var39 += var35.method871(23995);
                    int var41;
                    if (var6 == null) {
                        var41 = var40;
                    } else {
                        var41 = var6[var40];
                    }
                    if (arg2 == var41) {
                        var36 += var39;
                        var37 = var41;
                    }
                }
            }
            if (var36 == 0) {
                return true;
            }
            byte[] var42 = new byte[var36];
            int var43 = 0;
            var35.field1521 = var34;
            int var44 = 0;
            for (int var45 = 0; var45 < var33; var45++) {
                int var46 = 0;
                for (int var47 = 0; var47 < var5; var47++) {
                    var46 += var35.method871(23995);
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (arg2 == var48) {
                        class42.method288(var13, var44, var42, var43, var46);
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
            int var18 = var50 - var17 * 4 * var5;
            class120 var19 = new class120(var13);
            int[] var20 = new int[var5];
            var19.field1521 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var5; var23++) {
                    var22 += var19.method871(23995);
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var5][];
            for (int var25 = 0; var25 < var5; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field1521 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var5; var29++) {
                    var28 += var19.method871(23995);
                    class42.method288(var13, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var5; var30++) {
                int var31;
                if (var6 == null) {
                    var31 = var30;
                } else {
                    var31 = var6[var30];
                }
                if (this.field7650 == 0) {
                    var7[var31] = class687.method3876(var24[var30], false, -137);
                } else {
                    var7[var31] = var24[var30];
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method3154(String arg0, String arg1, byte arg2) {
        field7653++;
        if (!this.method3159(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (arg2 <= 9) {
            this.field7621 = null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field7624.field7380.method2385(-128, class463.method2746(var4, false));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field7624.field7373[var6].method2385(-125, class463.method2746(var5, false));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)I")
    public final int method3155(int arg0) {
        field7633++;
        if (!this.method3159(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7637.length; var4++) {
            if (this.field7624.field7367[var4] > 0) {
                var3 += this.method3144(var4, 0);
                var2 += 100;
            }
        }
        if (arg0 >= -68) {
            this.method3142(null, 37, 112, 53);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3156(byte arg0, String arg1) {
        field7630++;
        int var3 = -10 / ((arg0 + 4) / 41);
        if (this.method3159(false)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field7624.field7380.method2385(-128, class463.method2746(var4, false));
            return this.method3140(var5, (byte) -58);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
    public final int method3157(int arg0) {
        field7611++;
        if (!this.method3159(false)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 3) {
            this.method3135(-52, 43, -18);
        }
        return this.field7624.field7372;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)I")
    public final int method3158(boolean arg0, int arg1) {
        field7623++;
        if (!this.method3159(false)) {
            return -1;
        } else if (arg0) {
            int var3 = this.field7624.field7380.method2385(-125, arg1);
            return this.method3146((byte) 117, var3) ? var3 : -1;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)Z")
    private final boolean method3159(boolean arg0) {
        field7614++;
        if (arg0) {
            return true;
        }
        if (this.field7624 == null) {
            this.field7624 = this.field7621.method729((byte) 121);
            if (this.field7624 == null) {
                return false;
            }
            this.field7638 = new Object[this.field7624.field7383][];
            this.field7637 = new Object[this.field7624.field7383];
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lal;ZI)V")
    public class544(class108 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7627 = arg1;
        this.field7650 = arg2;
        this.field7621 = arg0;
    }
}
