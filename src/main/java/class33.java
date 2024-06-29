import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class33 extends class308 {

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
    public boolean field503 = true;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field501 = 0;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "[I")
    public static int[] field513 = new int[50];

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "[I")
    private int[] field506;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "[I")
    public int[] field509;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "[Ljava/lang/String;")
    private String[] field508;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "[[I")
    private int[][] field500;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I", line = 5)
    public final int method271(byte arg0, int arg1) {
        field494++;
        if (arg0 == 66) {
            return this.field506 == null || arg1 < 0 || this.field506.length < arg1 ? -1 : this.field506[arg1];
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Laf;IBZLaf;)I", line = 21)
    public static final int method272(class201 arg0, int arg1, byte arg2, boolean arg3, class201 arg4) {
        field504++;
        if (arg2 != 77) {
            return 117;
        } else if (arg1 == 1) {
            int var5 = arg0.field3151;
            int var6 = arg4.field3151;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class311.method2169(arg4.method1376((byte) 120).field5004, arg0.method1376((byte) 120).field5004, (byte) -121, class334.field5418);
        } else if (arg1 == 3) {
            if (arg0.field3092.equals("-")) {
                if (arg4.field3092.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3092.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class311.method2169(arg4.field3092, arg0.field3092, (byte) -122, class334.field5418);
            }
        } else if (arg1 == 4) {
            return arg0.method1404((byte) -20) ? (arg4.method1404((byte) -20) ? 0 : 1) : (arg4.method1404((byte) -20) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg0.method1408(arg2 - 20839) ? (arg4.method1408(arg2 ^ 0xFFFFAEAB) ? 0 : 1) : (arg4.method1408(arg2 ^ 0xFFFFAEAB) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg0.method1405((byte) -111) ? (arg4.method1405((byte) -89) ? 0 : 1) : (arg4.method1405((byte) -51) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg0.method1409(8) ? (arg4.method1409(arg2 - 69) ? 0 : 1) : (arg4.method1409(8) ? -1 : 0);
        } else {
            return arg0.field3097 - arg4.field3097;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIJ)Z", line = 93)
    public static final boolean method273(int arg0, int arg1, int arg2, long arg3) {
        class50 var5 = class264.field4230[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field732 != null && var5.field732.field4069 == arg3) {
            return true;
        } else if (var5.field747 != null && var5.field747.field3128 == arg3) {
            return true;
        } else if (var5.field733 != null && var5.field733.field1237 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field735; var6++) {
                if (var5.field752[var6].field4076 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfh;B)V", line = 122)
    public final void method274(class313 arg0, byte arg1) {
        field499++;
        int var3 = 20 / ((arg1 - 43) / 35);
        while (true) {
            int var4 = arg0.method2224(-120);
            if (var4 == 0) {
                return;
            }
            this.method277(var4, arg0, 121);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLfh;[I)V", line = 142)
    public final void method275(boolean arg0, class313 arg1, int[] arg2) {
        field492++;
        if (!arg0 || this.field506 == null) {
            return;
        }
        for (int var4 = 0; this.field506.length > var4 && arg2.length > var4; var4++) {
            int var5 = class261.field4121[this.method271((byte) 66, var4)];
            if (var5 > 0) {
                arg1.method2218(122, (long) arg2[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)Lme;", line = 169)
    public static final class82 method276(int arg0, byte[] arg1) {
        field497++;
        if (arg1 == null) {
            return null;
        }
        class82 var2 = new class82(arg1, class18.field228, class28.field419, class322.field5289, class94.field1379, class105.field1522);
        if (arg0 == 25149) {
            class167.method1164(false);
            return var2;
        } else {
            return (class82) null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILfh;I)V", line = 191)
    private final void method277(int arg0, class313 arg1, int arg2) {
        if (arg0 == 1) {
            this.field508 = class68.method479(5, '<', arg1.method2198(-430));
        } else if (arg0 == 2) {
            int var8 = arg1.method2224(-127);
            this.field509 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field509[var9] = arg1.method2250(-1613178296);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method2224(-123);
            this.field500 = new int[var4][];
            this.field506 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2250(-1613178296);
                this.field506[var5] = var6;
                this.field500[var5] = new int[class186.field2899[var6]];
                for (int var7 = 0; var7 < class186.field2899[var6]; var7++) {
                    this.field500[var5][var7] = arg1.method2250(-1613178296);
                }
            }
        } else if (arg0 == 4) {
            this.field503 = false;
        }
        if (arg2 < 11) {
            field501 = 86;
        }
        field498++;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Ljava/lang/String;", line = 259)
    public final String method278(byte arg0) {
        field510++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field508 == null) {
            return "";
        }
        var2.append(this.field508[0]);
        if (arg0 < 7) {
            this.method274((class313) null, (byte) -120);
        }
        for (int var3 = 1; var3 < this.field508.length; var3++) {
            var2.append("...");
            var2.append(this.field508[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(ZI)V", line = 315)
    public static final void method279(boolean arg0, int arg1) {
        field495++;
        class236.field3735 = arg1;
        class32.field488 = -1;
        class179.field2785 = -1;
        if (arg0) {
            class300.method2110(arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfh;I)Ljava/lang/String;", line = 330)
    public final String method280(class313 arg0, int arg1) {
        if (arg1 != 1) {
            this.method274((class313) null, (byte) -91);
        }
        field491++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field506 != null) {
            for (int var4 = 0; var4 < this.field506.length; var4++) {
                var3.append(this.field508[var4]);
                var3.append(class315.method2261(arg0.method2197(13105, class262.field4133[this.field506[var4]]), this.field500[var4], this.field506[var4], 255));
            }
        }
        var3.append(this.field508[this.field508.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I", line = 366)
    public final int method281(int arg0) {
        field502++;
        if (arg0 != 0) {
            field505 = 56;
        }
        return this.field506 == null ? 0 : this.field506.length;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(III)I", line = 383)
    public final int method282(int arg0, int arg1, int arg2) {
        field507++;
        if (this.field506 == null || arg0 < 0 || this.field506.length < arg0) {
            return -1;
        } else if (this.field500[arg0] == null || arg1 < 0 || arg1 > this.field500[arg0].length) {
            return -1;
        } else if (arg2 == -1) {
            return this.field500[arg0][arg1];
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V", line = 401)
    public static void method283(byte arg0) {
        field513 = null;
        if (arg0 != -23) {
            field501 = -53;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)V", line = 411)
    public final void method284(byte arg0) {
        if (this.field509 != null) {
            for (int var2 = 0; var2 < this.field509.length; var2++) {
                this.field509[var2] = class167.method1160(this.field509[var2], 32768);
            }
        }
        field496++;
        int var3 = 34 % ((arg0 - 66) / 52);
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V", line = 435)
    public static final void method285(byte arg0) {
        field511++;
        int var1 = class71.field1096.length;
        if (arg0 <= 104) {
            method283((byte) 102);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class71.field1096[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class352.field5607; var4++) {
                    if (class83.field1196[var4] == class150.field2404[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class83.field1196[class352.field5607] = class150.field2404[var2];
                    var3 = class352.field5607++;
                }
                class313 var5 = new class313(class71.field1096[var2]);
                int var6 = 0;
                while (var5.field5137 < class71.field1096[var2].length && var6 < 511 && class294.field4892 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2250(-1613178296);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class150.field2404[var2] >> 8) * 64 + var10 - class215.field3313;
                    int var12 = var8 & 0x3F;
                    int var13 = (class150.field2404[var2] & 0xFF) * 64 + var12 - class150.field2420;
                    class139 var14 = class38.method307(var5.method2250(-1613178296), 0);
                    if (class329.field5377[var7] == null && (var14.field2206 & 0x1) > 0 && class119.field1760 == var9 && var11 >= 0 && (var14.field2220 + var11) < 104 && var13 >= 0 && var14.field2220 + var13 < 104) {
                        class329.field5377[var7] = new class233();
                        class233 var15 = class329.field5377[var7];
                        class243.field3843[class294.field4892++] = var7;
                        var15.field4743 = class58.field875;
                        var15.method1610(-14884, var14);
                        var15.method2028((byte) 42, var15.field3702.field2220);
                        var15.field4780 = var15.field4778 = class236.field3739[var15.field3702.field2214];
                        var15.field4732 = var15.field3702.field2228;
                        if (var15.field4732 == 0) {
                            var15.field4778 = 0;
                        }
                        var15.field4722 = var15.field3702.field2202;
                        var15.method2030(var13, true, 29313, var11, var15.method312(-107));
                    }
                }
            }
        }
    }
}
