import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class146 {

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public int field2080 = -1;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public int field2070 = -1;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    private int field2084 = -1;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field2071 = -1;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "Z")
    public boolean field2088 = true;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    private int field2081 = -1;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public int field2092 = 0;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field2072 = new String[5];

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "Z")
    public boolean field2078 = false;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
    public int field2104 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Z")
    public boolean field2083 = true;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    private int field2105 = -1;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    public int field2103 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cu", name = "P", descriptor = "I")
    private int field2111 = -1;

    @OriginalMember(owner = "client!cu", name = "S", descriptor = "Z")
    public boolean field2114 = true;

    @OriginalMember(owner = "client!cu", name = "R", descriptor = "I")
    public int field2113 = -1;

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "I")
    public int field2108 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public int field2102 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
    private int field2112 = -1;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "[I")
    public static int[] field2086 = new int[1];

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public static int field2093 = -1;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Lwj;")
    public static class270 field2079 = new class270(37, 3);

    @OriginalMember(owner = "client!cu", name = "U", descriptor = "Lqp;")
    public static class466 field2116 = new class466("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!cu", name = "O", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!cu", name = "T", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Lmn;")
    private class247 field2094;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "Lrk;")
    public class25 field2098;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Ljava/lang/String;")
    public String field2082;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "Ljava/lang/String;")
    public String field2097;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "[I")
    public int[] field2090;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lya;ZZ)Ll;", line = 9)
    public final class16 method976(class38 arg0, boolean arg1, boolean arg2) {
        field2085++;
        int var4 = arg1 ? this.field2080 : this.field2113;
        int var5 = arg0.field468 << 29 | var4;
        class16 var6 = (class16) this.field2098.field332.method1073((long) var5, !arg2);
        if (var6 != null) {
            return var6;
        } else if (!this.field2098.field326.method747(var4, (byte) -68)) {
            return null;
        } else if (arg2) {
            class4 var7 = class4.method22(this.field2098.field326, var4, 0);
            if (var7 != null) {
                var6 = arg0.method265(var7, true);
                this.field2098.field332.method1072((long) var5, var6, false);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 50)
    public static final void method977(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class80.field1225[var1] = false;
        }
        if (arg0 <= 4) {
            field2079 = null;
        }
        field2099++;
        class491.field7168 = 1;
        class21.field280 = 0;
        class401.field5886 = -1;
        class325.field4443 = 0;
        class59.field721 = -1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLsi;)V", line = 96)
    public final void method978(byte arg0, class391 arg1) {
        field2076++;
        if (arg0 > -56) {
            this.field2109 = -45;
        }
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                return;
            }
            this.method981(arg1, -1, var3);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)I", line = 119)
    public final int method979(int arg0, int arg1, int arg2) {
        field2087++;
        if (arg0 != 1386) {
            this.method983(53, null, (byte) -106);
        }
        if (this.field2094 == null) {
            return arg1;
        } else {
            class500 var4 = (class500) this.field2094.method1492((long) arg2, 6340);
            return var4 == null ? arg1 : var4.field7369;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 148)
    public final void method980(int arg0) {
        field2091++;
        if (arg0 != -1) {
            this.field2080 = 40;
        }
        if (this.field2090 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2090.length; var2 += 2) {
            if (this.field2104 > this.field2090[var2]) {
                this.field2104 = this.field2090[var2];
            } else if (this.field2108 < this.field2090[var2]) {
                this.field2108 = this.field2090[var2];
            }
            if (this.field2102 > this.field2090[var2 + 1]) {
                this.field2102 = this.field2090[var2 + 1];
            } else if (this.field2090[var2 + 1] > this.field2103) {
                this.field2103 = this.field2090[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lsi;II)V", line = 187)
    private final void method981(class391 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2113 = arg0.method2353((byte) 76);
        } else if (arg2 == 2) {
            this.field2080 = arg0.method2353((byte) 74);
        } else if (arg2 == 3) {
            this.field2082 = arg0.method2347((byte) 55);
        } else if (arg2 == 4) {
            this.field2100 = arg0.method2338(true);
        } else if (arg2 == 5) {
            this.field2071 = arg0.method2338(true);
        } else if (arg2 == 6) {
            this.field2092 = arg0.method2348(arg1 - 1);
        } else if (arg2 == 7) {
            int var12 = arg0.method2348(-2);
            if ((var12 & 0x2) == 2) {
                this.field2078 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field2114 = false;
            }
        } else if (arg2 == 8) {
            this.field2088 = arg0.method2348(-2) == 1;
        } else if (arg2 == 9) {
            this.field2105 = arg0.method2353((byte) 123);
            if (this.field2105 == 65535) {
                this.field2105 = -1;
            }
            this.field2084 = arg0.method2353((byte) 86);
            if (this.field2084 == 65535) {
                this.field2084 = -1;
            }
            this.field2074 = arg0.method2361((byte) -56);
            this.field2089 = arg0.method2361((byte) -56);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field2072[arg2 - 10] = arg0.method2347((byte) -95);
        } else if (arg2 == 15) {
            int var4 = arg0.method2348(-2);
            this.field2090 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2090[var5] = arg0.method2311((byte) -103);
            }
            this.field2109 = arg0.method2361((byte) -56);
            this.field2075 = arg0.method2361((byte) -56);
        } else if (arg2 == 16) {
            this.field2083 = false;
        } else if (arg2 == 17) {
            this.field2097 = arg0.method2347((byte) -103);
        } else if (arg2 == 18) {
            this.field2081 = arg0.method2353((byte) 125);
        } else if (arg2 == 19) {
            this.field2070 = arg0.method2353((byte) 96);
        } else if (arg2 == 20) {
            this.field2111 = arg0.method2353((byte) 113);
            if (this.field2111 == 65535) {
                this.field2111 = -1;
            }
            this.field2112 = arg0.method2353((byte) 90);
            if (this.field2112 == 65535) {
                this.field2112 = -1;
            }
            this.field2110 = arg0.method2361((byte) -56);
            this.field2077 = arg0.method2361((byte) -56);
        } else if (arg2 == 21) {
            this.field2095 = arg0.method2361((byte) -56);
        } else if (arg2 == 22) {
            this.field2115 = arg0.method2361((byte) -56);
        } else if (arg2 == 249) {
            int var6 = arg0.method2348(-2);
            if (this.field2094 == null) {
                int var7 = class508.method3034(var6, true);
                this.field2094 = new class247(var7);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                boolean var9 = arg0.method2348(arg1 ^ 0x1) == 1;
                int var10 = arg0.method2338(true);
                class260 var11;
                if (var9) {
                    var11 = new class450(arg0.method2347((byte) -35));
                } else {
                    var11 = new class500(arg0.method2361((byte) -56));
                }
                this.field2094.method1487(-63, (long) var10, var11);
            }
        }
        if (arg1 != -1) {
            this.field2108 = -95;
        }
        field2106++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lya;B)Ll;", line = 356)
    public final class16 method982(class38 arg0, byte arg1) {
        field2073++;
        class16 var3 = (class16) this.field2098.field332.method1073((long) (arg0.field468 << 29 | this.field2081 | 0x20000), false);
        if (arg1 <= 74) {
            this.field2104 = 91;
        }
        if (var3 != null) {
            return var3;
        }
        this.field2098.field326.method747(this.field2081, (byte) -68);
        class4 var4 = class4.method22(this.field2098.field326, this.field2081, 0);
        if (var4 != null) {
            var3 = arg0.method265(var4, true);
            this.field2098.field332.method1072((long) (this.field2081 | 0x20000 | arg0.field468 << 29), var3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;", line = 385)
    public final String method983(int arg0, String arg1, byte arg2) {
        field2096++;
        int var4 = 35 % ((arg2 + 17) / 56);
        if (this.field2094 == null) {
            return arg1;
        } else {
            class450 var5 = (class450) this.field2094.method1492((long) arg0, 6340);
            return var5 == null ? arg1 : var5.field6619;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 415)
    public static void method984(boolean arg0) {
        field2116 = null;
        field2079 = null;
        field2086 = null;
        if (!arg0) {
            method984(true);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLvk;)Z", line = 458)
    public final boolean method985(byte arg0, class248 arg1) {
        field2101++;
        int var3;
        if (this.field2084 == -1) {
            if (this.field2105 == -1) {
                return true;
            }
            var3 = arg1.method934(this.field2105, -122);
        } else {
            var3 = arg1.method926(this.field2084, -85);
        }
        if (var3 < this.field2074 || this.field2089 < var3) {
            return false;
        }
        boolean var4 = false;
        if (arg0 >= -112) {
            return true;
        }
        int var5;
        if (this.field2112 == -1) {
            if (this.field2111 == -1) {
                return true;
            }
            var5 = arg1.method934(this.field2111, -118);
        } else {
            var5 = arg1.method926(this.field2112, 51);
        }
        return this.field2110 <= var5 && this.field2077 >= var5;
    }
}
