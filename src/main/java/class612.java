import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class612 {

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lds;")
    private class375 field8613 = null;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lur;")
    private class393 field8585;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
    private boolean field8598;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public int field8600;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "[[I")
    public static int[][] field8606 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[Ljava/lang/Object;")
    private Object[] field8597;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field8582;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 4)
    public final boolean method3339(String arg0, int arg1, String arg2) {
        field8601++;
        if (!this.method3360(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field8613.field4730.method1445(class300.method1663(var4, -13319), 106);
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field8613.field4731[var6].method1445(class300.method1663(var5, -13319), 119);
        if (arg1 < 7) {
            this.field8598 = true;
        }
        return var7 >= 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I", line = 32)
    public final int method3340(int arg0) {
        field8611++;
        if (arg0 != 6) {
            return -16;
        } else if (this.method3360(false)) {
            return this.field8613.field4734;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 47)
    public final int method3341(String arg0, int arg1) {
        field8614++;
        int var3 = 4 % ((arg1 + 9) / 42);
        if (this.method3360(false)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field8613.field4730.method1445(class300.method1663(var4, -13319), 99);
            return this.method3367(-1, var5) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I", line = 68)
    public final int method3342(byte arg0) {
        field8592++;
        if (arg0 == -107) {
            return this.method3360(false) ? this.field8613.field4722.length : -1;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZB)V", line = 86)
    public final void method3343(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 < 8) {
            field8606 = null;
        }
        field8577++;
        if (!this.method3360(false)) {
            return;
        }
        if (arg0) {
            this.field8613.field4733 = null;
            this.field8613.field4730 = null;
        }
        if (arg1) {
            this.field8613.field4727 = null;
            this.field8613.field4731 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[B", line = 120)
    public final byte[] method3344(int arg0, int arg1) {
        field8588++;
        if (!this.method3360(false)) {
            return null;
        }
        if (arg0 < 91) {
            this.method3367(-2, 54);
        }
        if (this.field8613.field4722.length == 1) {
            return this.method3365(arg1, 42, 0);
        } else if (!this.method3367(-1, arg1)) {
            return null;
        } else if (this.field8613.field4722[arg1] == 1) {
            return this.method3365(0, -118, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 147)
    public final byte[] method3345(int arg0, String arg1, String arg2) {
        field8608++;
        if (!this.method3360(false)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field8613.field4730.method1445(class300.method1663(var4, -13319), 122);
        if (!this.method3367(-1, var6)) {
            return null;
        }
        if (arg0 < 57) {
            field8581 = -82;
        }
        int var7 = this.field8613.field4731[var6].method1445(class300.method1663(var5, -13319), 99);
        return this.method3365(var7, 36, var6);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)I", line = 177)
    public final int method3346(byte arg0, int arg1) {
        field8595++;
        if (!this.method3360(false)) {
            return -1;
        }
        int var3 = this.field8613.field4730.method1445(arg1, 101);
        if (this.method3367(-1, var3)) {
            return arg0 == -126 ? var3 : 104;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 203)
    public final void method3347(String arg0, byte arg1) {
        if (arg1 != 54) {
            return;
        }
        field8617++;
        if (this.method3360(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field8613.field4730.method1445(class300.method1663(var3, -13319), 111);
            this.method3371(-107, var4);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V", line = 221)
    public final void method3348(int arg0, int arg1) {
        field8599++;
        if (arg0 != 16) {
            this.method3346((byte) 8, -75);
        }
        if (this.method3367(-1, arg1) && this.field8582 != null) {
            this.field8582[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)I", line = 244)
    public final int method3349(int arg0, boolean arg1) {
        field8590++;
        if (!arg1) {
            field8606 = null;
        }
        return this.method3367(-1, arg0) ? this.field8613.field4722[arg0] : 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z", line = 265)
    public final boolean method3350(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        }
        field8587++;
        if (!this.method3367(-1, arg1)) {
            return false;
        } else if (this.field8597[arg1] == null) {
            this.method3354(arg1, 0);
            return this.field8597[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 290)
    private final boolean method3351(String arg0, String arg1, int arg2) {
        field8584++;
        if (!this.method3360(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 != 2) {
            field8581 = 33;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field8613.field4730.method1445(class300.method1663(var4, -13319), 102);
        if (this.method3367(arg2 ^ 0xFFFFFFFD, var6)) {
            int var7 = this.field8613.field4731[var6].method1445(class300.method1663(var5, -13319), 120);
            return this.method3370(var7, (byte) 108, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 316)
    public final int method3352(String arg0, int arg1) {
        field8616++;
        if (!this.method3360(false)) {
            return 0;
        }
        if (arg1 < 46) {
            this.field8597 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field8613.field4730.method1445(class300.method1663(var3, -13319), 108);
        return this.method3358(63, var4);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)[I", line = 335)
    public final int[] method3353(int arg0, int arg1) {
        field8596++;
        if (!this.method3367(-1, arg0)) {
            return null;
        }
        int[] var3 = this.field8613.field4723[arg0];
        if (var3 == null) {
            var3 = new int[this.field8613.field4737[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return arg1 > -109 ? null : var3;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(II)V", line = 369)
    private final void method3354(int arg0, int arg1) {
        if (this.field8598) {
            this.field8597[arg0] = this.field8585.method1747(arg0, 750);
        } else {
            this.field8597[arg0] = class57.method357(-137, this.field8585.method1747(arg0, 750), false);
        }
        if (arg1 == 0) {
            field8610++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 384)
    public final void method3355(int arg0) {
        field8607++;
        if (this.field8582 != null) {
            for (int var2 = 0; var2 < this.field8582.length; var2++) {
                this.field8582[var2] = null;
            }
        }
        if (arg0 != -27756) {
            field8606 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z", line = 406)
    public final boolean method3356(int arg0) {
        field8583++;
        if (arg0 != 28528) {
            this.method3356(-102);
        }
        if (!this.method3360(false)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field8613.field4726.length; var3++) {
            int var4 = this.field8613.field4726[var3];
            if (this.field8597[var4] == null) {
                this.method3354(var4, 0);
                if (this.field8597[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I", line = 442)
    public final int method3357(boolean arg0) {
        field8576++;
        if (!this.method3360(arg0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field8597.length; var4++) {
            if (this.field8613.field4737[var4] > 0) {
                var3 += this.method3358(80, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(II)I", line = 477)
    private final int method3358(int arg0, int arg1) {
        field8618++;
        if (!this.method3367(-1, arg1)) {
            return 0;
        } else if (this.field8597[arg1] == null) {
            if (arg0 < 6) {
                this.field8585 = null;
            }
            return this.field8585.method1748(95, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 496)
    public static void method3359(int arg0) {
        if (arg0 != 0) {
            method3363(true);
        }
        field8606 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)Z", line = 506)
    private final boolean method3360(boolean arg0) {
        if (arg0) {
            this.method3370(107, (byte) -90, -53);
        }
        field8579++;
        if (this.field8613 == null) {
            this.field8613 = this.field8585.method1743((byte) -14);
            if (this.field8613 == null) {
                return false;
            }
            this.field8582 = new Object[this.field8613.field4725][];
            this.field8597 = new Object[this.field8613.field4725];
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 530)
    public final void method3361(byte arg0) {
        if (this.field8597 != null) {
            for (int var2 = 0; var2 < this.field8597.length; var2++) {
                this.field8597[var2] = null;
            }
        }
        int var3 = 51 / ((-arg0 - 35) / 32);
        field8594++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 551)
    public final boolean method3362(boolean arg0, String arg1) {
        field8593++;
        if (!this.method3360(arg0)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            this.field8597 = null;
        }
        int var4 = this.field8613.field4730.method1445(class300.method1663(var3, -13319), 111);
        return this.method3350(false, var4);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)Z", line = 569)
    public static final boolean method3363(boolean arg0) {
        field8604++;
        class329 var1 = class1.field7.field541.field4196;
        if (var1 == null || class1.field7.field541 == var1) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            class145 var2 = (class145) var1;
            if (var2.field1873 >= 2000) {
                var2.field1873 -= 2000;
            }
            return var2.field1873 == 1011;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Z", line = 595)
    private final boolean method3364(int arg0, int arg1, int arg2) {
        if (arg1 < 74) {
            field8581 = 63;
        }
        field8580++;
        if (!this.method3360(false)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field8613.field4722.length && this.field8613.field4722[arg0] > arg2) {
            return true;
        } else if (class84.field1189) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)[B", line = 623)
    public final byte[] method3365(int arg0, int arg1, int arg2) {
        field8591++;
        int var4 = 16 % ((-arg1 - 54) / 48);
        return this.method3366(arg0, null, (byte) 116, arg2);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IBI)[B", line = 635)
    public final byte[] method3366(int arg0, int[] arg1, byte arg2, int arg3) {
        field8578++;
        if (!this.method3364(arg3, 91, arg0)) {
            return null;
        }
        if (arg2 <= 90) {
            this.field8600 = 72;
        }
        if (this.field8582[arg3] == null || this.field8582[arg3][arg0] == null) {
            boolean var5 = this.method3372(arg0, arg1, arg3, (byte) 84);
            if (!var5) {
                this.method3354(arg3, 0);
                boolean var6 = this.method3372(arg0, arg1, arg3, (byte) -128);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class542.method2924(-7374, false, this.field8582[arg3][arg0]);
        if (this.field8600 == 1) {
            this.field8582[arg3][arg0] = null;
            if (this.field8613.field4722[arg3] == 1) {
                this.field8582[arg3] = null;
            }
        } else if (this.field8600 == 2) {
            this.field8582[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(II)Z", line = 696)
    private final boolean method3367(int arg0, int arg1) {
        field8615++;
        if (!this.method3360(false)) {
            return false;
        } else if (arg0 >= ~arg1 && this.field8613.field4722.length > arg1 && this.field8613.field4722[arg1] != 0) {
            return true;
        } else if (class84.field1189) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(II)Z", line = 716)
    public final boolean method3368(int arg0, int arg1) {
        field8612++;
        if (!this.method3360(false)) {
            return false;
        }
        if (arg0 != 1912) {
            this.method3358(-79, -112);
        }
        if (this.field8613.field4722.length == 1) {
            return this.method3370(arg1, (byte) 98, 0);
        } else if (!this.method3367(-1, arg1)) {
            return false;
        } else if (this.field8613.field4722[arg1] == 1) {
            return this.method3370(0, (byte) 67, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 745)
    public final boolean method3369(int arg0, String arg1) {
        field8589++;
        int var3 = this.method3341("", arg0 - 31903);
        if (var3 == -1) {
            return arg0 == 31850 ? this.method3351("", arg1, arg0 ^ 0x7C68) : true;
        } else {
            return this.method3351(arg1, "", 2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z", line = 761)
    public final boolean method3370(int arg0, byte arg1, int arg2) {
        if (arg1 <= 61) {
            field8606 = null;
        }
        field8605++;
        if (!this.method3364(arg2, 96, arg0)) {
            return false;
        } else if (this.field8582[arg2] != null && this.field8582[arg2][arg0] != null) {
            return true;
        } else if (this.field8597[arg2] == null) {
            this.method3354(arg2, 0);
            return this.field8597[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "(II)V", line = 787)
    private final void method3371(int arg0, int arg1) {
        field8609++;
        this.field8585.method1745(59, arg1);
        if (arg0 > -8) {
            this.method3373(null, false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIB)Z", line = 799)
    private final boolean method3372(int arg0, int[] arg1, int arg2, byte arg3) {
        field8586++;
        if (!this.method3367(-1, arg2)) {
            return false;
        }
        int var5 = -49 % ((arg3 + 13) / 43);
        if (this.field8597[arg2] == null) {
            return false;
        }
        int var6 = this.field8613.field4737[arg2];
        int[] var7 = this.field8613.field4723[arg2];
        if (this.field8582[arg2] == null) {
            this.field8582[arg2] = new Object[this.field8613.field4722[arg2]];
        }
        Object[] var8 = this.field8582[arg2];
        boolean var9 = true;
        for (int var10 = 0; var10 < var6; var10++) {
            int var11;
            if (var7 == null) {
                var11 = var10;
            } else {
                var11 = var7[var10];
            }
            if (var8[var11] == null) {
                var9 = false;
                break;
            }
        }
        if (var9) {
            return true;
        }
        byte[] var12;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var12 = class542.method2924(-7374, false, this.field8597[arg2]);
        } else {
            var12 = class542.method2924(-7374, true, this.field8597[arg2]);
            class630 var13 = new class630(var12);
            var13.method3496(var13.field8804.length, arg1, -957401312, 5);
        }
        byte[] var14;
        try {
            var14 = class568.method3132(0, var12);
        } catch (RuntimeException var50) {
            throw class589.method3242(var50, "T3 - " + (arg1 != null) + "," + arg2 + "," + var12.length + "," + class528.method2871(var12, (byte) -95, var12.length) + "," + class528.method2871(var12, (byte) -95, var12.length - 2) + "," + this.field8613.field4735[arg2] + "," + this.field8613.field4734);
        }
        if (this.field8598) {
            this.field8597[arg2] = null;
        }
        if (var6 <= 1) {
            int var16;
            if (var7 == null) {
                var16 = 0;
            } else {
                var16 = var7[0];
            }
            if (this.field8600 == 0) {
                var8[var16] = class57.method357(-137, var14, false);
            } else {
                var8[var16] = var14;
            }
        } else if (this.field8600 == 2) {
            int var33 = var14.length;
            int var52 = var33 - 1;
            int var34 = var14[var52] & 0xFF;
            int var35 = var52 - var34 * 4 * var6;
            class630 var36 = new class630(var14);
            int var37 = 0;
            int var38 = 0;
            var36.field8812 = var35;
            for (int var39 = 0; var39 < var34; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var6; var41++) {
                    var40 += var36.method3483(123);
                    int var42;
                    if (var7 == null) {
                        var42 = var41;
                    } else {
                        var42 = var7[var41];
                    }
                    if (arg0 == var42) {
                        var37 += var40;
                        var38 = var42;
                    }
                }
            }
            if (var37 == 0) {
                return true;
            }
            byte[] var43 = new byte[var37];
            int var44 = 0;
            var36.field8812 = var35;
            int var45 = 0;
            for (int var46 = 0; var46 < var34; var46++) {
                int var47 = 0;
                for (int var48 = 0; var48 < var6; var48++) {
                    var47 += var36.method3483(98);
                    int var49;
                    if (var7 == null) {
                        var49 = var48;
                    } else {
                        var49 = var7[var48];
                    }
                    if (arg0 == var49) {
                        class293.method1645(var14, var45, var43, var44, var47);
                        var44 += var47;
                    }
                    var45 += var47;
                }
            }
            var8[var38] = var43;
        } else {
            int var17 = var14.length;
            int var51 = var17 - 1;
            int var18 = var14[var51] & 0xFF;
            int var19 = var51 - var6 * var18 * 4;
            class630 var20 = new class630(var14);
            int[] var21 = new int[var6];
            var20.field8812 = var19;
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = 0;
                for (int var24 = 0; var24 < var6; var24++) {
                    var23 += var20.method3483(60);
                    var21[var24] += var23;
                }
            }
            byte[][] var25 = new byte[var6][];
            for (int var26 = 0; var26 < var6; var26++) {
                var25[var26] = new byte[var21[var26]];
                var21[var26] = 0;
            }
            var20.field8812 = var19;
            int var27 = 0;
            for (int var28 = 0; var28 < var18; var28++) {
                int var29 = 0;
                for (int var30 = 0; var30 < var6; var30++) {
                    var29 += var20.method3483(74);
                    class293.method1645(var14, var27, var25[var30], var21[var30], var29);
                    var21[var30] += var29;
                    var27 += var29;
                }
            }
            for (int var31 = 0; var31 < var6; var31++) {
                int var32;
                if (var7 == null) {
                    var32 = var31;
                } else {
                    var32 = var7[var31];
                }
                if (this.field8600 == 0) {
                    var8[var32] = class57.method357(-137, var25[var31], false);
                } else {
                    var8[var32] = var25[var31];
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 1085)
    public final boolean method3373(String arg0, boolean arg1) {
        field8602++;
        if (!this.method3360(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (!arg1) {
            field8581 = -111;
        }
        int var4 = this.field8613.field4730.method1445(class300.method1663(var3, -13319), 105);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lur;ZI)V", line = 1141)
    public class612(class393 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field8585 = arg0;
        this.field8598 = arg1;
        this.field8600 = arg2;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 1117)
    public static final void method3374(int arg0) {
        field8603++;
        int var1 = class596.field8384;
        int[] var2 = class354.field4521;
        for (int var3 = arg0; var3 < var1; var3++) {
            class514 var4 = class351.field4490[var2[var3]];
            if (var4 != null) {
                class422.method2243(var4, var4.method2785(arg0 - 1), 0);
            }
        }
    }
}
