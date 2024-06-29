import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class292 extends class34 {

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lke;")
    private class256 field5044 = class8.field122;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[J")
    public static long[] field5038 = new long[256];

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static volatile int field5048;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "[Lke;")
    public static class256[] field5051;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "[I")
    public static int[] field5058;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "[Lke;")
    public static class256[] field5055;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "Z")
    public static boolean field5056;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lwb;")
    public static class132 field5057;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Lrj;")
    public class254 field5035;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Lrj;")
    private class254 field5053;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "[I")
    public static int[] field5049;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[B)[B", line = 11)
    public static final byte[] method2022(boolean arg0, byte[] arg1) {
        if (arg0) {
            method2023(-91);
        }
        field5039++;
        class41 var2 = new class41(arg1);
        int var3 = var2.method357(arg0);
        int var4 = var2.method327(4);
        if (var4 < 0 || !(class14.field193 == 0 || var4 <= class14.field193)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method353(var4, var5, true, 0);
            return var5;
        } else {
            int var6 = var2.method327(4);
            if (var6 < 0 || !(class14.field193 == 0 || var6 <= class14.field193)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class81.method601(var7, var6, arg1, var4, 9);
            } else {
                class180.field3188.method1475(var2, (byte) -50, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V", line = 76)
    public static void method2023(int arg0) {
        field5055 = null;
        field5049 = null;
        field5051 = null;
        if (arg0 != -3) {
            field5056 = true;
        }
        field5058 = null;
        field5038 = null;
        field5057 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I", line = 95)
    public final int method2024(int arg0, int arg1) {
        field5046++;
        if (this.field5035 == null) {
            return this.field5041;
        }
        if (arg1 != 10288) {
            this.method2032(-9);
        }
        class6 var3 = (class6) this.field5035.method1744((byte) 126, (long) arg0);
        return var3 == null ? this.field5041 : var3.field94;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lke;I)Z", line = 116)
    public final boolean method2025(class256 arg0, int arg1) {
        field5042++;
        if (this.field5035 == null) {
            return false;
        } else if (arg1 == 1) {
            if (this.field5053 == null) {
                this.method2028(arg1 + 101);
            }
            for (class229 var3 = (class229) this.field5053.method1744((byte) 123, arg0.method1792(false)); var3 != null; var3 = (class229) this.field5053.method1746((byte) 9)) {
                if (var3.field3927.method1806(false, arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Z", line = 144)
    public final boolean method2026(int arg0, byte arg1) {
        field5045++;
        int var3 = -120 / ((arg1 + 3) / 53);
        if (this.field5035 == null) {
            return false;
        }
        if (this.field5053 == null) {
            this.method2032(-122);
        }
        class6 var4 = (class6) this.field5053.method1744((byte) 125, (long) arg0);
        return var4 != null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLra;)V", line = 170)
    public final void method2027(boolean arg0, class41 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                field5032++;
                return;
            }
            this.method2033(arg1, var3, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V", line = 197)
    private final void method2028(int arg0) {
        if (arg0 <= 44) {
            return;
        }
        field5036++;
        this.field5053 = new class254(this.field5035.method1747(39));
        for (class14 var2 = (class14) this.field5035.method1743(true); var2 != null; var2 = (class14) this.field5035.method1742((byte) 73)) {
            class229 var3 = new class229(var2.field184, (int) var2.field2895);
            this.field5053.method1749(true, var3, var2.field184.method1792(false));
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5038[var0] = var1;
        }
        field5048 = 0;
        field5052 = 0;
        field5051 = new class256[100];
        field5058 = new int[4096];
        field5059 = 0;
        field5055 = new class256[100];
        field5056 = false;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lke;", line = 225)
    public final class256 method2029(int arg0, int arg1) {
        field5040++;
        if (this.field5035 == null) {
            return this.field5044;
        }
        if (arg1 != -64) {
            field5059 = 69;
        }
        class14 var3 = (class14) this.field5035.method1744((byte) 126, (long) arg0);
        return var3 == null ? this.field5044 : var3.field184;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)V", line = 254)
    public static final void method2030(int arg0, int arg1, int arg2) {
        field5033++;
        int var3 = -33 % ((arg1 - 9) / 39);
        class77 var4 = class156.method1158(6, false, arg2);
        var4.method584(22992);
        var4.field1455 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V", line = 267)
    public static final void method2031(int arg0) {
        field5034++;
        int var1 = 0;
        if (arg0 != 255) {
            return;
        }
        while (class23.field312 > var1) {
            int var10002 = class78.field1467[var1]--;
            if (class78.field1467[var1] >= -10) {
                label93: {
                    class306 var2 = class54.field984[var1];
                    if (var2 == null) {
                        var2 = class306.method2131(class96.field1702, class34.field530[var1], 0);
                        if (var2 == null) {
                            break label93;
                        }
                        class78.field1467[var1] += var2.method2130();
                        class54.field984[var1] = var2;
                    }
                    if (class78.field1467[var1] < 0) {
                        label96: {
                            int var9;
                            if (class135.field2345[var1] == 0) {
                                var9 = class29.field422;
                            } else {
                                int var3 = class135.field2345[var1] >> 16 & 0xFF;
                                int var4 = var3 * 128 + 64 - class121.field2124.field1192;
                                int var5 = (class135.field2345[var1] & 0xFF) * 128;
                                if (var4 < 0) {
                                    var4 = -var4;
                                }
                                int var6 = class135.field2345[var1] >> 8 & 0xFF;
                                int var7 = var6 * 128 + 64 - class121.field2124.field1197;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var4 + var7 - 128;
                                if (var8 > var5) {
                                    class78.field1467[var1] = -100;
                                    break label96;
                                }
                                if (var8 < 0) {
                                    var8 = 0;
                                }
                                var9 = (var5 - var8) * class70.field1292 / var5;
                            }
                            if (var9 > 0) {
                                class268 var10 = var2.method2132().method1858(class290.field5025);
                                class133 var11 = class133.method951(var10, 100, var9);
                                var11.method926(class105.field1875[var1] - 1);
                                class197.field3603.method2235(var11);
                            }
                            class78.field1467[var1] = -100;
                        }
                    }
                }
            } else {
                class23.field312--;
                for (int var12 = var1; var12 < class23.field312; var12++) {
                    class34.field530[var12] = class34.field530[var12 + 1];
                    class54.field984[var12] = class54.field984[var12 + 1];
                    class105.field1875[var12] = class105.field1875[var12 + 1];
                    class78.field1467[var12] = class78.field1467[var12 + 1];
                    class135.field2345[var12] = class135.field2345[var12 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class250.field4242 && !class85.method625(true)) {
            if (class38.field694 != 0 && class250.field4248 != -1) {
                class183.method1342(class21.field277, true, false, class250.field4248, 0, class38.field694);
            }
            class250.field4242 = false;
        } else if (class38.field694 != 0 && class250.field4248 != -1 && !class85.method625(true)) {
            class307.field5293++;
            class308.field5322.method1599(161, (byte) -122);
            class308.field5322.method365((byte) -32, class250.field4248);
            class250.field4248 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V", line = 396)
    private final void method2032(int arg0) {
        if (arg0 > -20) {
            method2023(-111);
        }
        this.field5053 = new class254(this.field5035.method1747(35));
        field5043++;
        for (class6 var2 = (class6) this.field5035.method1743(true); var2 != null; var2 = (class6) this.field5035.method1742((byte) 90)) {
            class6 var3 = new class6((int) var2.field2895);
            this.field5053.method1749(true, var3, (long) var2.field94);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lra;IB)V", line = 418)
    private final void method2033(class41 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field5037 = arg0.method357(false);
        } else if (arg1 == 2) {
            this.field5047 = arg0.method357(false);
        } else if (arg1 == 3) {
            this.field5044 = arg0.method313((byte) 54);
        } else if (arg1 == 4) {
            this.field5041 = arg0.method327(arg2 ^ 0xFFFFFF88);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method346(-16);
            this.field5035 = new class254(class124.method859((byte) -128, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method327(4);
                class163 var7;
                if (arg1 == 5) {
                    var7 = new class14(arg0.method313((byte) 54));
                } else {
                    var7 = new class6(arg0.method327(4));
                }
                this.field5035.method1749(true, var7, (long) var6);
            }
        }
        if (arg2 != -116) {
            field5056 = false;
        }
        field5054++;
    }
}
