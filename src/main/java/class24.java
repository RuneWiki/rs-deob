import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 {

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lrr;")
    private class199 field422 = new class199();

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lsf;")
    private class143 field415;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field436 = null;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lqj;")
    public static class238 field420;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lqa;")
    public static class243 field432;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lnr;")
    public static class437 field417;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lro;I)Z", line = 3)
    public static final boolean method201(class249 arg0, int arg1) {
        if (arg1 != -5241) {
            return true;
        }
        field424++;
        if (arg0.field3608 == 205) {
            class26.field474 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/Object;J)V", line = 25)
    public final void method202(boolean arg0, Object arg1, long arg2) {
        field423++;
        this.method203(-65, arg2);
        if (!arg0) {
            this.field413 = 98;
        }
        if (this.field413 == 0) {
            class263 var5 = (class263) this.field422.method1243((byte) 67);
            var5.method2574((byte) 114);
            var5.method1439(-29183);
        } else {
            this.field413--;
        }
        class72 var6 = new class72(arg1);
        this.field415.method956(false, arg2, var6);
        this.field422.method1244(var6, -26);
        var6.field3305 = 0L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V", line = 61)
    private final void method203(int arg0, long arg1) {
        field411++;
        if (arg0 >= -9) {
            method216((String) null, -51);
        }
        class263 var4 = (class263) this.field415.method954(59, arg1);
        if (var4 != null) {
            var4.method2574((byte) 119);
            var4.method1439(-29183);
            this.field413++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 81)
    public final void method204(byte arg0) {
        if (arg0 != 56) {
            this.field422 = null;
        }
        field416++;
        for (class263 var2 = (class263) this.field422.method1252(arg0 ^ 0xFFFFFF83); var2 != null; var2 = (class263) this.field422.method1249(-86)) {
            if (var2.method451(-110)) {
                var2.method2574((byte) 118);
                var2.method1439(arg0 - 29239);
                this.field413++;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 108)
    public static final void method205(byte arg0) {
        if (arg0 > -51) {
            field432 = null;
        }
        for (int var1 = -1; var1 < class153.field2004; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class66.field943[var1];
            }
            class194 var6 = class125.field1664[var5];
            if (var6 != null && var6.field251 > 0) {
                var6.field251--;
                if (var6.field251 == 0) {
                    var6.field255 = null;
                }
            }
        }
        field412++;
        for (int var2 = 0; var2 < class191.field2662; var2++) {
            int var3 = class416.field6202[var2];
            class129 var4 = class23.field408[var3];
            if (var4 != null && var4.field251 > 0) {
                var4.field251--;
                if (var4.field251 == 0) {
                    var4.field255 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 167)
    public final Object method206(int arg0) {
        field414++;
        class263 var2 = (class263) this.field415.method953(arg0 ^ arg0);
        while (var2 != null) {
            Object var3 = var2.method447(27816);
            if (var3 != null) {
                return var3;
            }
            class263 var4 = var2;
            var2 = (class263) this.field415.method951(0);
            var4.method2574((byte) 117);
            var4.method1439(-29183);
            this.field413++;
        }
        return null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 195)
    public final int method207(int arg0) {
        field435++;
        int var2 = -51 % ((arg0 + 89) / 33);
        int var3 = 0;
        for (class263 var4 = (class263) this.field422.method1252(-70); var4 != null; var4 = (class263) this.field422.method1249(-72)) {
            if (!var4.method451(-120)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 219)
    public static final void method208(byte arg0) {
        field421++;
        if (arg0 != -122) {
            field427 = -124;
        }
        class11.field128.method212(-71);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IJ)Ljava/lang/Object;", line = 239)
    public final Object method209(int arg0, long arg1) {
        field430++;
        class263 var4 = (class263) this.field415.method954(-82, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 < 117) {
            this.method215(-41, -10);
        }
        Object var5 = var4.method447(27816);
        if (var5 == null) {
            var4.method2574((byte) 115);
            var4.method1439(-29183);
            this.field413++;
            return null;
        }
        if (var4.method451(-117)) {
            class72 var6 = new class72(var5);
            this.field415.method956(false, var4.field5903, var6);
            this.field422.method1244(var6, -26);
            var6.field3305 = 0L;
            var4.method2574((byte) 124);
            var4.method1439(-29183);
        } else {
            this.field422.method1244(var4, -26);
            var4.field3305 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I", line = 283)
    public final int method210(int arg0) {
        if (arg0 == -1) {
            field426++;
            return this.field413;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)C", line = 297)
    public static final char method211(int arg0, byte arg1) {
        if (arg0 < 32) {
            field427 = 119;
        }
        field429++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class263.field3829[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 327)
    public final void method212(int arg0) {
        field418++;
        this.field422.method1246((byte) -127);
        this.field415.method952(-58);
        if (arg0 > -56) {
            this.method212(-77);
        }
        this.field413 = this.field431;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 340)
    public final Object method213(int arg0) {
        if (arg0 != -128) {
            return null;
        }
        field433++;
        class263 var2 = (class263) this.field415.method951(0);
        while (var2 != null) {
            Object var3 = var2.method447(27816);
            if (var3 != null) {
                return var3;
            }
            class263 var4 = var2;
            var2 = (class263) this.field415.method951(0);
            var4.method2574((byte) 126);
            var4.method1439(-29183);
            this.field413++;
        }
        return null;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I", line = 376)
    public final int method214(int arg0) {
        if (arg0 <= 69) {
            this.field415 = null;
        }
        field434++;
        return this.field431;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 390)
    public final void method215(int arg0, int arg1) {
        field419++;
        if (arg0 != 0) {
            this.method207(15);
        }
        if (class395.field5939 == null) {
            return;
        }
        for (class263 var3 = (class263) this.field422.method1252(-39); var3 != null; var3 = (class263) this.field422.method1249(-65)) {
            if (var3.method451(arg0 - 118)) {
                if (var3.method447(arg0 ^ 0x6CA8) == null) {
                    var3.method2574((byte) 120);
                    var3.method1439(arg0 ^ 0xFFFF8E01);
                    this.field413++;
                }
            } else if ((long) arg1 < ++var3.field3305) {
                class263 var4 = class395.field5939.method823(var3, arg0 - 116);
                this.field415.method956(false, var3.field5903, var4);
                class451.method2819(127, var3, var4);
                var3.method2574((byte) 115);
                var3.method1439(-29183);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 440)
    public static final boolean method216(String arg0, int arg1) {
        field425++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class244.field3409; var2++) {
            if (arg0.equalsIgnoreCase(class374.field5640[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class214.field3052[var2])) {
                return true;
            }
        }
        if (arg1 >= -70) {
            method208((byte) -73);
        }
        return false;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V", line = 470)
    public static void method217(byte arg0) {
        field417 = null;
        field420 = null;
        if (arg0 <= 84) {
            field427 = -46;
        }
        field436 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V", line = 490)
    public class24(int arg0) {
        this.field431 = arg0;
        this.field413 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field415 = new class143(var2);
    }
}
