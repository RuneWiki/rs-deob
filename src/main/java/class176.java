import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class176 extends class156 {

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lli;")
    public class191 field3154 = new class191();

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lhc;")
    public class151 field3164 = new class151();

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lne;")
    private class206 field3155;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
    public static boolean field3144 = false;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
    public static int[] field3151 = new int[100];

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Llc;")
    public static class143 field3163 = class66.method374(" ", -1);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3146 = -1;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Lli;")
    public static class191 field3166 = new class191();

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lgf;")
    public static class7 field3150;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    public static final void method1156(byte arg0, int arg1) {
        field3162++;
        class39.field667.method835(1, arg1);
        if (arg0 < 79) {
            field3167 = 76;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method993() {
        field3161++;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()Laf;")
    public final class156 method1004() {
        field3147++;
        class159 var1 = (class159) this.field3154.method1294(false);
        if (var1 == null) {
            return null;
        } else if (var1.field2875 == null) {
            return this.method994();
        } else {
            return var1.field2875;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final void method996(int arg0) {
        field3156++;
        this.field3164.method996(arg0);
        for (class159 var2 = (class159) this.field3154.method1294(false); var2 != null; var2 = (class159) this.field3154.method1292((byte) 85)) {
            if (!this.field3155.method1413(0, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2882 >= var3) {
                        this.method1161((byte) 127, var3, var2);
                        var2.field2882 -= var3;
                        break;
                    }
                    this.method1161((byte) 117, var2.field2882, var2);
                    var3 -= var2.field2882;
                } while (!this.field3155.method1439((byte) 118, 0, var2, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lq;B)V")
    public static final void method1157(class81 arg0, byte arg1) {
        class84 var2 = null;
        class182.field3257 = 3;
        field3148++;
        class235.method1585(true, (byte) 108);
        class49.field966 = true;
        class285.field5009 = true;
        class283.field4985 = true;
        class240.field4332 = 127;
        class74.field1385 = 0;
        class75.field1400 = 0;
        class44.field896 = true;
        class43.field847 = true;
        class240.field4333 = true;
        class88.field1594 = true;
        class225.field4083 = true;
        class127.field2244 = 0;
        class155.field2795 = 0;
        class116.field2070 = true;
        class32.field551 = 2;
        class58.field1117 = 127;
        class211.field3926 = 255;
        class189.field3418 = true;
        class212.field3944 = true;
        class125.method761(2);
        class51.field1019 = false;
        class63.field1185 = false;
        class35.field615 = 0;
        class120.field2126 = 0;
        try {
            class181 var3 = arg0.method456("runescape", true);
            while (var3.field3241 == 0) {
                class61.method347(1L, 1);
            }
            if (var3.field3241 == 1) {
                int var4 = 0;
                var2 = (class84) var3.field3239;
                byte[] var5 = new byte[(int) var2.method483(-1)];
                while (var5.length > var4) {
                    int var6 = var2.method480(var4, var5, 0, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class189.method1226(-106, new class190(var5));
            }
            int var7 = 7 % ((-arg1 - 37) / 57);
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method482(-1);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[ILpj;III)V")
    private final void method1158(int arg0, int[] arg1, class159 arg2, int arg3, int arg4, int arg5) {
        field3160++;
        if ((this.field3155.field3755[arg2.field2889] & 0x4) != arg5 && arg2.field2866 < 0) {
            int var7 = this.field3155.field3734[arg2.field2889] / class190.field3494;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2865) / var7;
                if (var8 > arg0) {
                    arg2.field2865 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg2.field2875.method995(arg1, arg3, var8);
                int var9 = class190.field3494 / 100;
                arg3 += var8;
                arg2.field2865 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class288 var11 = arg2.field2875;
                if (this.field3155.field3753[arg2.field2889] == 0) {
                    arg2.field2875 = class288.method1886(arg2.field2893, var11.method1918(), var11.method1895(), var11.method1913());
                } else {
                    arg2.field2875 = class288.method1886(arg2.field2893, var11.method1918(), 0, var11.method1913());
                    this.field3155.method1436(arg2.field2884.field1281[arg2.field2867] < 0, (byte) 33, arg2);
                    arg2.field2875.method1894(var9, var11.method1895());
                }
                if (arg2.field2884.field1281[arg2.field2867] < 0) {
                    arg2.field2875.method1883(-1);
                }
                var11.method1884(var9);
                var11.method995(arg1, arg3, arg4 - arg3);
                if (var11.method1899()) {
                    this.field3164.method998(var11);
                }
            }
        }
        arg2.field2875.method995(arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public static final void method1159(int arg0, int arg1) {
        class120 var2 = class7.field122[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class120 var4 = class7.field122[var3][arg0][arg1] = class7.field122[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2135--;
                for (int var5 = 0; var5 < var4.field2134; var5++) {
                    class211 var6 = var4.field2144[var5];
                    if ((var6.field3928 >> 29 & 0x3L) == 2L && var6.field3931 == arg0 && var6.field3919 == arg1) {
                        var6.field3915--;
                    }
                }
            }
        }
        if (class7.field122[0][arg0][arg1] == null) {
            class7.field122[0][arg0][arg1] = new class120(0, arg0, arg1);
        }
        class7.field122[0][arg0][arg1].field2119 = var2;
        class7.field122[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Laf;")
    public final class156 method994() {
        field3145++;
        class159 var1;
        do {
            var1 = (class159) this.field3154.method1292((byte) 70);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2875 == null);
        return var1.field2875;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILdl;I)V")
    public static final void method1160(byte arg0, int arg1, class32 arg2, int arg3) {
        field3152++;
        int var4 = 113 % ((-arg0 - 33) / 38);
        if (arg2.field4131 == arg1 && arg1 != -1) {
            class104 var5 = class164.method1081(arg1, -21331);
            int var6 = var5.field1842;
            if (var6 == 1) {
                arg2.field4166 = 0;
                arg2.field4109 = 0;
                arg2.field4156 = arg3;
                arg2.field4153 = 0;
                class274.method1805(var5, arg2.field4153, arg2.field4108, arg2.field4178, class229.field4195 == arg2, (byte) -66);
            }
            if (var6 == 2) {
                arg2.field4109 = 0;
                return;
            }
        } else if (arg1 == -1 || arg2.field4131 == -1 || class164.method1081(arg1, -21331).field1845 >= class164.method1081(arg2.field4131, -21331).field1845) {
            arg2.field4109 = 0;
            arg2.field4166 = 0;
            arg2.field4138 = arg2.field4145;
            arg2.field4156 = arg3;
            arg2.field4153 = 0;
            arg2.field4131 = arg1;
            if (arg2.field4131 != -1) {
                class274.method1805(class164.method1081(arg2.field4131, -21331), arg2.field4153, arg2.field4108, arg2.field4178, class229.field4195 == arg2, (byte) -66);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILpj;)V")
    private final void method1161(byte arg0, int arg1, class159 arg2) {
        if (arg0 <= 114) {
            this.method1158(-106, (int[]) null, (class159) null, -94, 8, -51);
        }
        field3157++;
        if ((this.field3155.field3755[arg2.field2889] & 0x4) != 0 && arg2.field2866 < 0) {
            int var4 = this.field3155.field3734[arg2.field2889] / class190.field3494;
            int var5 = (var4 + 1048575 - arg2.field2865) / var4;
            arg2.field2865 = arg2.field2865 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field3155.field3753[arg2.field2889] == 0) {
                    arg2.field2875 = class288.method1886(arg2.field2893, arg2.field2875.method1918(), arg2.field2875.method1895(), arg2.field2875.method1913());
                } else {
                    arg2.field2875 = class288.method1886(arg2.field2893, arg2.field2875.method1918(), 0, arg2.field2875.method1913());
                    this.field3155.method1436(arg2.field2884.field1281[arg2.field2867] < 0, (byte) 127, arg2);
                }
                if (arg2.field2884.field1281[arg2.field2867] < 0) {
                    arg2.field2875.method1883(-1);
                }
                arg1 = arg2.field2865 / var4;
            }
        }
        arg2.field2875.method996(arg1);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field3150 = null;
        field3163 = null;
        field3151 = null;
        if (arg0 != 0) {
            method1162(-124);
        }
        field3166 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lne;)V")
    public class176(class206 arg0) {
        this.field3155 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)V")
    public final void method995(int[] arg0, int arg1, int arg2) {
        field3158++;
        this.field3164.method995(arg0, arg1, arg2);
        for (class159 var4 = (class159) this.field3154.method1294(false); var4 != null; var4 = (class159) this.field3154.method1292((byte) 73)) {
            if (!this.field3155.method1413(0, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2882 >= var6) {
                        this.method1158(var6, arg0, var4, var5, var5 + var6, 0);
                        var4.field2882 -= var6;
                        break;
                    }
                    this.method1158(var4.field2882, arg0, var4, var5, var5 + var6, 0);
                    var6 -= var4.field2882;
                    var5 += var4.field2882;
                } while (!this.field3155.method1439((byte) 118, var5, var4, var6, arg0));
            }
        }
    }
}
