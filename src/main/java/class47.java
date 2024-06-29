import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 {

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    private int[] field676 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lni;")
    public static class367 field664 = new class367(48, 8);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Laj;")
    public class208 field670;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    private int[] field671;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[S")
    private short[] field669;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[S")
    private short[] field675;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[S")
    private short[] field677;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[S")
    private short[] field678;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lnd;")
    public final class387 method362(int arg0) {
        field665++;
        if (this.field671 == null) {
            return null;
        }
        class387[] var2 = new class387[this.field671.length];
        class191 var3 = this.field670.field2879;
        synchronized (this.field670.field2879) {
            int var4 = 0;
            while (true) {
                if (this.field671.length <= var4) {
                    if (arg0 != -5861) {
                        this.field671 = null;
                    }
                    break;
                }
                var2[var4] = class261.method1690(0, this.field670.field2879, this.field671[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field671.length; var5++) {
            if (var2[var5].field5887 < 13) {
                var2[var5].method2419(0, (byte) -123);
            }
        }
        class387 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class387(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field678 != null) {
            for (int var7 = 0; var7 < this.field678.length; var7++) {
                var6.method2425(this.field669[var7], this.field678[var7], true);
            }
        }
        if (this.field675 != null) {
            for (int var8 = 0; var8 < this.field675.length; var8++) {
                var6.method2431(this.field675[var8], (byte) -68, this.field677[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lnd;")
    public final class387 method363(byte arg0) {
        field672++;
        class387[] var2 = new class387[5];
        int var3 = 0;
        class191 var4 = this.field670.field2879;
        synchronized (this.field670.field2879) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field676[var5] != -1) {
                    var2[var3++] = class261.method1690(0, this.field670.field2879, this.field676[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field5887 < 13) {
                var2[var6].method2419(0, (byte) -128);
            }
        }
        if (arg0 >= -127) {
            return null;
        }
        class387 var7 = new class387(var2, var3);
        if (this.field678 != null) {
            for (int var8 = 0; var8 < this.field678.length; var8++) {
                var7.method2425(this.field669[var8], this.field678[var8], true);
            }
        }
        if (this.field675 != null) {
            for (int var9 = 0; var9 < this.field675.length; var9++) {
                var7.method2431(this.field675[var9], (byte) -68, this.field677[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
    public final boolean method364(boolean arg0) {
        field667++;
        boolean var2 = true;
        class191 var3 = this.field670.field2879;
        synchronized (this.field670.field2879) {
            int var4 = 0;
            if (arg0) {
                return false;
            }
            while (var4 < 5) {
                if (this.field676[var4] != -1 && !this.field670.field2879.method1271(0, this.field676[var4], -15606)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method365(int arg0) {
        field664 = null;
        if (arg0 <= 6) {
            field664 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILnj;B)V")
    private final void method366(int arg0, class164 arg1, byte arg2) {
        if (arg2 != 106) {
            method365(-124);
        }
        if (arg0 == 1) {
            arg1.method1087(false);
        } else if (arg0 == 2) {
            int var8 = arg1.method1087(false);
            this.field671 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field671[var9] = arg1.method1074(-635989152);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg1.method1087(false);
                this.field669 = new short[var4];
                this.field678 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field678[var5] = (short) arg1.method1074(-635989152);
                    this.field669[var5] = (short) arg1.method1074(arg2 - 635989258);
                }
            } else if (arg0 == 41) {
                int var6 = arg1.method1087(false);
                this.field675 = new short[var6];
                this.field677 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field675[var7] = (short) arg1.method1074(-635989152);
                    this.field677[var7] = (short) arg1.method1074(-635989152);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field676[arg0 - 60] = arg1.method1074(-635989152);
            }
        }
        field680++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method367(int arg0, boolean arg1, String arg2) {
        field666++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        if (arg0 != -15557) {
            return;
        }
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class321.field4650.field1981 : class321.field4650.field1985) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class182 var11 = class321.field4650.method993(-57, var8);
            if (var11.field2468 && var11.method1230(-126).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class92.field1365 = -1;
                    class66.field943 = null;
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
        class92.field1365 = var5;
        class66.field943 = var4;
        class48.field693 = 0;
        String[] var9 = new String[class92.field1365];
        for (int var10 = 0; var10 < class92.field1365; var10++) {
            var9[var10] = class321.field4650.method993(-108, var4[var10]).method1230(-108);
        }
        class168.method1135(var9, false, class66.field943);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static final void method368(byte arg0) {
        if (arg0 != -106) {
            method365(-47);
        }
        field673++;
        class367.field5621 = 0;
        class131.field1769.method450((byte) 73);
        class131.field1769.method453((byte) 105, class458.field6862);
        class367.field5621++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lnj;B)V")
    public final void method369(class164 arg0, byte arg1) {
        field668++;
        if (arg1 > -72) {
            this.method364(false);
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method366(var3, arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Z")
    public final boolean method370(int arg0) {
        field679++;
        if (this.field671 == null) {
            return true;
        }
        boolean var2 = true;
        class191 var3 = this.field670.field2879;
        synchronized (this.field670.field2879) {
            if (arg0 >= -12) {
                return false;
            }
            for (int var5 = 0; var5 < this.field671.length; var5++) {
                if (!this.field670.field2879.method1271(0, this.field671[var5], -15606)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
