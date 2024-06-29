import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 extends class196 {

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Z")
    public boolean field121 = true;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lhb;")
    public static class318 field113 = new class318(64);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Z")
    public static boolean field128 = false;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "[I")
    private int[] field111;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[I")
    public int[] field116;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "[Lle;")
    public static class127[] field114;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "[Ljava/lang/String;")
    private String[] field118;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "[[I")
    private int[][] field123;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILlm;I)Lpj;", line = 6)
    public static final class59 method52(int arg0, int arg1, class210 arg2, int arg3) {
        if (arg0 != 0) {
            field113 = (class318) null;
        }
        field106++;
        return class249.method1680(arg3, arg2, arg1, (byte) -83) ? class318.method2183(8410) : null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)I", line = 22)
    public final int method53(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.field111 = (int[]) null;
        }
        field108++;
        if (this.field111 == null || arg1 < 0 || arg1 > this.field111.length) {
            return -1;
        } else if (this.field123[arg1] == null || arg0 < 0 || arg0 > this.field123[arg1].length) {
            return -1;
        } else {
            return this.field123[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 45)
    public static final String method54(String arg0, byte arg1, String arg2, String arg3) {
        field110++;
        int var4 = arg0.indexOf(arg3);
        if (arg1 >= -71) {
            method65((byte) 85);
        }
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
            var4 = arg0.indexOf(arg3, arg2.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILre;[I)V", line = 63)
    public final void method55(int arg0, class263 arg1, int[] arg2) {
        field120++;
        if (arg0 != -11849) {
            this.method66((class263) null, false);
        }
        if (this.field111 == null) {
            return;
        }
        for (int var4 = 0; this.field111.length > var4 && var4 < arg2.length; var4++) {
            int var5 = class255.field3871[this.method59((byte) 122, var4)];
            if (var5 > 0) {
                arg1.method1827((long) arg2[var4], var5, -115);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 92)
    public final void method56(int arg0) {
        field129++;
        if (this.field116 != null) {
            for (int var2 = 0; var2 < this.field116.length; var2++) {
                this.field116[var2] = class140.method1009(this.field116[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field123 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 117)
    public static final void method57(int arg0) {
        if (class168.field2517 != null) {
            class168.field2517.method1138(-16726864);
            class168.field2517 = null;
        }
        field126++;
        class241.method1634(arg0 ^ 0x51);
        class249.method1679();
        for (int var1 = 0; var1 < 4; var1++) {
            class325.field4896[var1].method1303((byte) -75);
        }
        class198.method1363(-1, false);
        System.gc();
        class84.method587(2, (byte) -60);
        class146.field2205 = false;
        class195.field2943 = -1;
        class48.method328(128, true);
        class302.field4613 = 0;
        class217.field3309 = 0;
        class296.field4534 = false;
        class66.field859 = arg0;
        class189.field2807 = 0;
        for (int var2 = 0; var2 < class294.field4497.length; var2++) {
            class294.field4497[var2] = null;
        }
        class56.field706 = 0;
        class172.field2577 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class241.field3592[var3] = null;
            class295.field4526[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class187.field2788[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class149.field2246[var5][var6][var7] = null;
                }
            }
        }
        class296.method2068((byte) -61);
        class125.field1967 = 0;
        class56.method368(-1892);
        class150.method1084(-28967, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 206)
    public static final void method58(int arg0, int arg1, String arg2, String arg3, String arg4) {
        field107++;
        class189.method1289(arg1, arg3, arg2, (byte) -95, arg4, arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)I", line = 225)
    public final int method59(byte arg0, int arg1) {
        field122++;
        int var3 = 83 % ((26 - arg0) / 47);
        return this.field111 == null || arg1 < 0 || this.field111.length < arg1 ? -1 : this.field111[arg1];
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 244)
    public static void method60(byte arg0) {
        if (arg0 != -25) {
            method65((byte) -38);
        }
        field114 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 255)
    public final String method61(boolean arg0) {
        if (arg0) {
            return (String) null;
        }
        StringBuffer var2 = new StringBuffer(80);
        field112++;
        if (this.field118 == null) {
            return "";
        }
        var2.append(this.field118[0]);
        for (int var3 = 1; var3 < this.field118.length; var3++) {
            var2.append("...");
            var2.append(this.field118[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILre;Z)V", line = 283)
    private final void method62(int arg0, class263 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field118 = class257.method1745(arg1.method1801(-30054), (byte) 93, '<');
        } else if (arg0 == 2) {
            int var8 = arg1.method1787(false);
            this.field116 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field116[var9] = arg1.method1830((byte) -77);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1787(false);
            this.field123 = new int[var4][];
            this.field111 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1830((byte) -77);
                this.field111[var5] = var6;
                this.field123[var5] = new int[class147.field2217[var6]];
                for (int var7 = 0; var7 < class147.field2217[var6]; var7++) {
                    this.field123[var5][var7] = arg1.method1830((byte) -77);
                }
            }
        } else if (arg0 == 4) {
            this.field121 = false;
        }
        if (arg2) {
            method54((String) null, (byte) -49, (String) null, (String) null);
        }
        field125++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lre;Z)Ljava/lang/String;", line = 348)
    public final String method63(class263 arg0, boolean arg1) {
        field115++;
        if (!arg1) {
            this.field116 = (int[]) null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field111 != null) {
            for (int var4 = 0; var4 < this.field111.length; var4++) {
                var3.append(this.field118[var4]);
                var3.append(class268.method1883(this.field111[var4], this.field123[var4], arg0.method1809(-303770904, class325.field4894[this.field111[var4]]), (byte) 95));
            }
        }
        var3.append(this.field118[this.field118.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I", line = 388)
    public final int method64(boolean arg0) {
        field109++;
        if (!arg0) {
            method54((String) null, (byte) 9, (String) null, (String) null);
        }
        return this.field111 == null ? 0 : this.field111.length;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 414)
    public static final void method65(byte arg0) {
        field124++;
        int var1 = class114.field1750.field1566 + class9.field79;
        if (arg0 > -114) {
            field113 = (class318) null;
        }
        int var2 = class223.field3397 + class114.field1750.field1505;
        if ((class271.field4155 - var1) < -500 || class271.field4155 - var1 > 500 || class160.field2402 - var2 < -500 || (class160.field2402 - var2) > 500) {
            class271.field4155 = var1;
            class160.field2402 = var2;
        }
        if (class160.field2402 != var2) {
            class160.field2402 += (var2 - class160.field2402) / 16;
        }
        if (class271.field4155 != var1) {
            class271.field4155 += (var1 - class271.field4155) / 16;
        }
        if (class131.field2025) {
            for (int var3 = 0; var3 < class9.field84; var3++) {
                int var4 = class64.field842[var3];
                if (var4 == 98) {
                    class234.field3525 = class234.field3525 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class234.field3525 = class234.field3525 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class284.field4297 = class284.field4297 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class284.field4297 = class284.field4297 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class120.field1879[96]) {
                class216.field3266 += (-class216.field3266 - 24) / 2;
            } else if (class120.field1879[97]) {
                class216.field3266 += (24 - class216.field3266) / 2;
            } else {
                class216.field3266 /= 2;
            }
            class284.field4297 += class216.field3266 / 2;
            if (class120.field1879[98]) {
                class106.field1656 += (12 - class106.field1656) / 2;
            } else if (class120.field1879[99]) {
                class106.field1656 += (-class106.field1656 - 12) / 2;
            } else {
                class106.field1656 /= 2;
            }
            class234.field3525 += class106.field1656 / 2;
        }
        class272.method1924(-4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lre;Z)V", line = 500)
    public final void method66(class263 arg0, boolean arg1) {
        field127++;
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                if (arg1) {
                    method52(-72, 104, (class210) null, -30);
                }
                return;
            }
            this.method62(var3, arg0, false);
        }
    }
}
