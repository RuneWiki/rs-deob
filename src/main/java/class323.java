import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class323 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field5008 = 0;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field5014 = 1190717;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field5016 = -1;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
    public boolean field5017 = false;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Z")
    public boolean field5011 = true;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field5021 = -1;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field5013 = 128;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field5022 = 8;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public int field5025 = 16;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Z")
    public boolean field5026 = true;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[I")
    public static int[] field5020 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field5023 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILpe;Z)V", line = 6)
    public final void method2204(int arg0, class101 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field5010++;
        while (true) {
            int var4 = arg1.method741(30);
            if (var4 == 0) {
                return;
            }
            this.method2210(arg0, false, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ[Lob;III)V", line = 26)
    public static final void method2205(int arg0, boolean arg1, class292[] arg2, int arg3, int arg4, int arg5) {
        field5015++;
        if (arg4 != 8596) {
            field5020 = (int[]) null;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class292 var7 = arg2[var6];
            if (var7 != null && var7.field4587 == arg0) {
                class320.method2197(arg5, var7, arg3, arg1, -127);
                class156.method1176(arg3, arg5, var7, 0);
                if (var7.field4505 > var7.field4533 - var7.field4608) {
                    var7.field4505 = var7.field4533 - var7.field4608;
                }
                if (var7.field4505 < 0) {
                    var7.field4505 = 0;
                }
                if (var7.field4578 > (var7.field4465 - var7.field4499)) {
                    var7.field4578 = var7.field4465 - var7.field4499;
                }
                if (var7.field4578 < 0) {
                    var7.field4578 = 0;
                }
                if (var7.field4490 == 0) {
                    class314.method2162(arg1, false, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 74)
    public static final void method2206(int arg0, int arg1) {
        field5019++;
        class303.field4758.method1828(arg1, (byte) -126);
        if (arg0 > -113) {
            method2211(-47);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 92)
    public static final void method2207(long[] arg0, Object[] arg1, byte arg2) {
        field5018++;
        class82.method595(arg0, 0, arg1, arg0.length - 1, -38);
        int var3 = -75 % ((arg2 + 33) / 60);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 102)
    public static void method2208(byte arg0) {
        if (arg0 != -102) {
            field5023 = -69;
        }
        field5020 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 120)
    public static final byte[] method2209(boolean arg0, String arg1) {
        field5012++;
        if (arg0) {
            field5009 = -108;
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZLpe;I)V", line = 261)
    private final void method2210(int arg0, boolean arg1, class101 arg2, int arg3) {
        if (arg3 == 1) {
            this.field5008 = class111.method850(arg2.method776(-1574267376), 32);
        } else if (arg3 == 2) {
            this.field5016 = arg2.method741(88);
        } else if (arg3 == 3) {
            this.field5016 = arg2.method731(false);
            if (this.field5016 == 65535) {
                this.field5016 = -1;
            }
        } else if (arg3 == 5) {
            this.field5026 = false;
        } else if (arg3 == 7) {
            this.field5021 = class111.method850(arg2.method776(-1574267376), 66);
        } else if (arg3 == 8) {
            class137.field2178 = arg0;
        } else if (arg3 == 9) {
            this.field5013 = arg2.method731(arg1);
        } else if (arg3 == 10) {
            this.field5011 = false;
        } else if (arg3 == 11) {
            this.field5022 = arg2.method741(72);
        } else if (arg3 == 12) {
            this.field5017 = true;
        } else if (arg3 == 13) {
            this.field5014 = arg2.method776(-1574267376);
        } else if (arg3 == 14) {
            this.field5025 = arg2.method741(14);
        }
        field5024++;
        if (arg1) {
            method2211(90);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 337)
    public static final void method2211(int arg0) {
        field5007++;
        if (class98.field1622 > 0) {
            class31.method218(115);
            return;
        }
        class267.field4140 = class127.field2032;
        class127.field2032 = null;
        if (arg0 != -1) {
            method2208((byte) -19);
        }
        class320.method2196(40, 0);
    }
}
