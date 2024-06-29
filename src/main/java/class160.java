import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class160 {

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field1950 = 1;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    private int field1964 = 0;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    private int field1959 = 1;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    private int field1965 = 0;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Loe;")
    private class183 field1968 = new class183();

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    private int field1971 = 0;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "Z")
    private boolean field1975 = true;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
    private boolean field1977 = true;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Z")
    private boolean field1973 = true;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "Z")
    private boolean field1972 = false;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
    private boolean field1976 = true;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "[Lsaa;")
    private class298[] field1978 = new class298[2];

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field1981 = -1;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lkga;")
    private class506 field1947;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lci;")
    private class416 field1967;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lci;")
    private class416 field1953;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "Lci;")
    private class416 field1969;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Loaa;")
    private class261 field1979;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Loaa;")
    private class261 field1980;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "Lsaa;")
    private class298 field1974;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
    private boolean field1962;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
    public static int[] field1952;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)Z")
    public final boolean method1006(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1949++;
        if (arg3 != -120) {
            method1015(-123, -33, 85, null);
        }
        if (this.field1953 == null || this.field1968.method1130((byte) 94)) {
            return false;
        }
        if (this.field1950 != arg0 || this.field1959 != arg1) {
            this.field1950 = arg0;
            this.field1959 = arg1;
            for (class513 var6 = this.field1968.method1132((byte) 31); var6 != this.field1968.field2232; var6 = var6.field7520) {
                ((class237) var6).method1445(this.field1959, false, this.field1950);
            }
            this.field1975 = true;
            this.field1977 = true;
            this.field1973 = true;
        }
        if (!this.method1013(0)) {
            return false;
        }
        this.field1962 = true;
        this.field1964 = arg2;
        this.field1965 = arg4;
        this.field1947.method2953(126, this.field1953);
        this.field1953.method2505(0, false);
        this.field1947.method3004(-this.field1964, this.field1959 + this.field1965 - this.field1947.field7059, true);
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[Lsb;")
    public static final class264[] method1007(int arg0) {
        field1963++;
        return arg0 == -256 ? new class264[] { class500.field6994, class524.field7687, class377.field5068 } : null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public final void method1008(int arg0) {
        field1946++;
        if (!this.field1962) {
            return;
        }
        if (this.field1969 != null) {
            int var2 = 16384;
            this.field1947.method2955(this.field1969, 67);
            this.field1947.method2986((byte) 116, this.field1967);
            this.field1969.method2501(0, 87);
            this.field1967.method2505(0, false);
            if (this.field1972) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1950, this.field1959, 0, 0, this.field1950, this.field1959, var2, 9728);
            this.field1947.method2941(this.field1969, 3);
            this.field1947.method2958(this.field1967, 2);
        }
        this.field1947.method2933((byte) 123);
        this.field1947.method2996(0, true);
        int var3 = -94 / ((-arg0 - 42) / 62);
        this.field1947.method2985(1, -26973);
        this.field1947.method249();
        int var4 = 0;
        int var5 = 1;
        class237 var7;
        for (class237 var6 = (class237) this.field1968.method1132((byte) -98); var6 != null; var6 = var7) {
            var7 = (class237) this.field1968.method1134(8446);
            int var8 = var6.method1442(1);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method1446(this.field1974, var9, this.field1978[var4], (byte) 73);
                if (var7 == null && (var8 - 1) == var9) {
                    this.field1947.method2954(this.field1967, true);
                    this.field1947.method3004(0, 0, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1959);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1964, this.field1965);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1964, this.field1965 + this.field1959);
                    OpenGL.glTexCoord2f((float) this.field1950, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1964 + this.field1950, this.field1965 + this.field1959);
                    OpenGL.glTexCoord2f((float) this.field1950, (float) this.field1959);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1964 + this.field1950, this.field1965);
                    OpenGL.glEnd();
                } else {
                    this.field1967.method2505(var5, false);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1959);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1959);
                    OpenGL.glTexCoord2f((float) this.field1950, (float) this.field1959);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1950, this.field1959);
                    OpenGL.glTexCoord2f((float) this.field1950, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1950, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var6.method1439(-257, var9);
                var5 = var5 + 1 & 0x1;
            }
        }
        this.field1962 = false;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
    public final boolean method1009(int arg0) {
        if (arg0 <= 1) {
            return false;
        } else {
            field1945++;
            return this.field1953 != null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public final void method1010(byte arg0) {
        this.field1979 = null;
        field1966++;
        this.field1953 = this.field1969 = this.field1967 = null;
        if (arg0 <= 124) {
            method1016(22, 111, -103);
        }
        this.field1974 = null;
        this.field1980 = null;
        this.field1978 = null;
        if (!this.field1968.method1130((byte) 69)) {
            for (class513 var2 = this.field1968.method1132((byte) 33); var2 != this.field1968.field2232; var2 = var2.field7520) {
                ((class237) var2).method1447(true);
            }
        }
        this.field1950 = this.field1959 = 1;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    private final void method1011(int arg0) {
        field1970++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class237 var5 = (class237) this.field1968.method1132((byte) -121); var5 != null; var5 = (class237) this.field1968.method1134(8446)) {
            int var9 = var5.method1443(1);
            var4 += var5.method1442(1);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1437((byte) -100);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1981 != var6) {
            this.field1973 = true;
            this.field1981 = var6;
        }
        int var7 = this.field1971 <= 2 ? this.field1971 : 2;
        int var8 = arg0 >= var4 ? var4 : 2;
        if (this.field1972 != var2) {
            this.field1972 = var2;
            this.field1975 = true;
        }
        if (var7 != var8) {
            this.field1977 = this.field1973 = true;
        }
        this.field1971 = var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Luk;B)Z")
    public final boolean method1012(class237 arg0, byte arg1) {
        field1960++;
        if (arg1 != 123) {
            method1015(50, -98, -118, null);
        }
        if (this.field1953 != null) {
            if (arg0.method1441(arg1 - 123) || arg0.method1444((byte) -84)) {
                this.field1968.method1129(arg0, arg1 ^ 0x4007B);
                this.method1011(2);
                if (this.method1013(arg1 - 123)) {
                    if (this.field1950 != -1 && this.field1959 != -1) {
                        arg0.method1445(this.field1959, false, this.field1950);
                    }
                    arg0.field3190 = true;
                    return true;
                }
            }
            this.method1014(arg1 ^ 0xFFFFFFBA, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)Z")
    private final boolean method1013(int arg0) {
        field1961++;
        if (this.field1975) {
            if (this.field1979 != null) {
                this.field1979.method1589(false);
                this.field1979 = null;
            }
            if (this.field1974 != null) {
                this.field1974.method1204(-1);
                this.field1974 = null;
            }
            if (this.field1969 != null) {
                this.field1979 = new class261(this.field1947, 6402, this.field1950, this.field1959, this.field1947.field7257);
            }
            if (this.field1972) {
                this.field1974 = new class298(this.field1947, 34037, 6402, this.field1950, this.field1959);
            } else if (this.field1979 == null) {
                this.field1979 = new class261(this.field1947, 6402, this.field1950, this.field1959);
            }
            this.field1976 = true;
            this.field1977 = true;
            this.field1975 = false;
        }
        if (arg0 != 0) {
            this.method1009(-69);
        }
        if (this.field1973) {
            if (this.field1980 != null) {
                this.field1980.method1589(false);
                this.field1980 = null;
            }
            if (this.field1978[0] != null) {
                this.field1978[0].method1204(-1);
                this.field1978[0] = null;
            }
            if (this.field1978[1] != null) {
                this.field1978[1].method1204(-1);
                this.field1978[1] = null;
            }
            if (this.field1969 != null) {
                this.field1980 = new class261(this.field1947, this.field1981, this.field1950, this.field1959, this.field1947.field7257);
            }
            this.field1978[0] = new class298(this.field1947, 34037, this.field1981, this.field1950, this.field1959);
            this.field1978[1] = this.field1971 > 1 ? new class298(this.field1947, 34037, this.field1981, this.field1950, this.field1959) : null;
            this.field1973 = false;
            this.field1977 = true;
            this.field1976 = true;
        }
        if (this.field1977) {
            if (this.field1969 == null) {
                this.field1947.method2953(arg0 + 114, this.field1967);
                this.field1967.method2502(0, 9136);
                this.field1967.method2502(1, 9136);
                this.field1967.method2502(8, 9136);
                this.field1967.method2495(false, this.field1978[0], 0);
                if (this.field1971 > 1) {
                    this.field1967.method2495(false, this.field1978[1], 1);
                }
                if (this.field1972) {
                    this.field1967.method2495(false, this.field1974, 8);
                } else {
                    this.field1967.method2498(0, this.field1979, 8);
                }
                this.field1947.method2954(this.field1967, true);
            } else {
                this.field1947.method2953(106, this.field1967);
                this.field1967.method2502(0, arg0 + 9136);
                this.field1967.method2502(1, 9136);
                this.field1967.method2502(8, 9136);
                this.field1967.method2495(false, this.field1978[0], 0);
                if (this.field1971 > 1) {
                    this.field1967.method2495(false, this.field1978[1], 1);
                }
                if (this.field1972) {
                    this.field1967.method2495(false, this.field1974, 8);
                }
                this.field1947.method2954(this.field1967, true);
                this.field1947.method2953(105, this.field1969);
                this.field1969.method2502(0, 9136);
                this.field1969.method2502(8, 9136);
                this.field1969.method2498(arg0, this.field1980, 0);
                this.field1969.method2498(0, this.field1979, 8);
                this.field1947.method2954(this.field1969, true);
            }
            this.field1977 = false;
            this.field1976 = true;
        }
        if (this.field1976) {
            this.field1947.method2953(arg0 ^ 0x7E, this.field1953);
            this.field1976 = !this.field1953.method2504(120);
            this.field1947.method2954(this.field1953, true);
        }
        return !this.field1976;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILuk;)V")
    public final void method1014(int arg0, class237 arg1) {
        arg1.field3190 = false;
        field1958++;
        arg1.method1447(true);
        if (arg0 > -53) {
            this.method1008(-46);
        }
        arg1.method3045(true);
        this.method1011(2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILn;)V")
    public static final void method1015(int arg0, int arg1, int arg2, class17 arg3) {
        if (arg3.field403 == 0) {
            arg3.field460 = arg3.field443;
        } else if (arg3.field403 == 1) {
            arg3.field460 = (arg0 - arg3.field414) / 2 + arg3.field443;
        } else if (arg3.field403 == 2) {
            arg3.field460 = arg0 - arg3.field414 - arg3.field443;
        } else if (arg3.field403 == 3) {
            arg3.field460 = arg3.field443 * arg0 >> 14;
        } else if (arg3.field403 == 4) {
            arg3.field460 = (arg0 - arg3.field414) / 2 + (arg3.field443 * arg0 >> 14);
        } else {
            arg3.field460 = arg0 - arg3.field414 - (arg3.field443 * arg0 >> 14);
        }
        if (arg2 != -244) {
            field1957 = -111;
        }
        field1955++;
        if (arg3.field389 == 0) {
            arg3.field351 = arg3.field413;
        } else if (arg3.field389 == 1) {
            arg3.field351 = (arg1 - arg3.field402) / 2 + arg3.field413;
        } else if (arg3.field389 == 2) {
            arg3.field351 = arg1 - arg3.field402 - arg3.field413;
        } else if (arg3.field389 == 3) {
            arg3.field351 = arg3.field413 * arg1 >> 14;
        } else if (arg3.field389 == 4) {
            arg3.field351 = (arg3.field413 * arg1 >> 14) + (arg1 - arg3.field402) / 2;
        } else {
            arg3.field351 = arg1 - arg3.field402 - (arg3.field413 * arg1 >> 14);
        }
        if (!class679.field9734) {
            return;
        }
        if (client.method1659(arg3).field1929 == 0 && arg3.field379 != 0) {
            return;
        }
        if (arg3.field460 < 0) {
            arg3.field460 = 0;
        } else if (arg0 < arg3.field460 + arg3.field414) {
            arg3.field460 = arg0 - arg3.field414;
        }
        if (arg3.field351 < 0) {
            arg3.field351 = 0;
            return;
        }
        if (arg1 < (arg3.field402 + arg3.field351)) {
            arg3.field351 = arg1 - arg3.field402;
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z")
    public static final boolean method1016(int arg0, int arg1, int arg2) {
        field1954++;
        int var3 = 3 % ((-arg2 - 53) / 63);
        return class380.method2201(arg0, 0, arg1) || class541.method3173(arg1, arg0, 55);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII[Ln;IIII)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, class17[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field1956++;
        if (arg2 != 15) {
            field1951 = -41;
        }
        class68.field1045.method292(arg6, arg9, arg0, arg4);
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class17 var11 = arg5[var10];
            if (var11 != null && (var11.field469 == arg8 || arg8 == -1412584499 && class386.field5135 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class631.field9063[class643.field9183].setBounds(var11.field460 + arg1, var11.field351 + arg7, var11.field414, var11.field402);
                    var12 = class643.field9183++;
                } else {
                    var12 = arg3;
                }
                var11.field406 = var12;
                var11.field353 = class543.field7882;
                if (!client.method1660(var11)) {
                    if (var11.field346 != 0) {
                        class626.method3600(2047, var11);
                    }
                    int var13 = var11.field460 + arg1;
                    int var14 = var11.field351 + arg7;
                    int var15 = var11.field437;
                    if (class679.field9734 && (client.method1659(var11).field1929 != 0 || var11.field379 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class386.field5135 == var11) {
                        if (arg8 != -1412584499 && (class418.field5925 == var11.field488 || class28.field616 == var11.field488)) {
                            class54.field873 = arg1;
                            class500.field6991 = arg5;
                            class54.field868 = arg7;
                            continue;
                        }
                        if (class214.field2705 && class504.field7033) {
                            int var16 = class478.field6713.method1349(arg2 ^ 0x3D);
                            int var17 = class478.field6713.method1338(1);
                            int var18 = var16 - class109.field1421;
                            int var19 = var17 - class385.field5121;
                            if (class685.field9784 > var18) {
                                var18 = class685.field9784;
                            }
                            if (class685.field9784 + class441.field6296.field414 < var11.field414 + var18) {
                                var18 = class685.field9784 + class441.field6296.field414 - var11.field414;
                            }
                            if (var19 < class512.field7517) {
                                var19 = class512.field7517;
                            }
                            var13 = var18;
                            if ((var11.field402 + var19) > (class512.field7517 + class441.field6296.field402)) {
                                var19 = class512.field7517 + class441.field6296.field402 - var11.field402;
                            }
                            var14 = var19;
                        }
                        if (class28.field616 == var11.field488) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field379 == 2) {
                        var20 = arg9;
                        var21 = arg4;
                        var22 = arg6;
                        var23 = arg0;
                    } else {
                        int var24 = var11.field414 + var13;
                        int var25 = var14 + var11.field402;
                        if (var11.field379 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = arg9 < var14 ? var14 : arg9;
                        var22 = arg6 >= var13 ? arg6 : var13;
                        var21 = arg4 > var25 ? var25 : arg4;
                        var23 = arg0 > var24 ? var24 : arg0;
                    }
                    if (var23 > var22 && var21 > var20) {
                        if (var11.field346 != 0) {
                            if (class182.field2225 == var11.field346 || class27.field604 == var11.field346) {
                                class430.method2584(var13, var14, var11.field402, var11.field414, (byte) -127, class27.field604 == var11.field346);
                                class89.field1253[var12] = true;
                                class68.field1045.method292(arg6, arg9, arg0, arg4);
                                continue;
                            }
                            if (class55.field875 == var11.field346) {
                                if (var11.method192(class68.field1045, (byte) 95) != null) {
                                    class317.method1849(arg2 - 16);
                                    class445.method2631(var14, var13, arg2 + 113, class68.field1045, var11);
                                    class325.field4339[var12] = true;
                                    class68.field1045.method292(arg6, arg9, arg0, arg4);
                                }
                                continue;
                            }
                            if (class558.field8071 == var11.field346) {
                                if (var11.method192(class68.field1045, (byte) 93) != null) {
                                    class262.method1593(var14, var13, var11, arg2 + 14560);
                                    class325.field4339[var12] = true;
                                    class68.field1045.method292(arg6, arg9, arg0, arg4);
                                }
                                continue;
                            }
                            if (class168.field2055 == var11.field346) {
                                class592.method3433(0, class206.field2483, class68.field1045, var13, var11.field414, var14, var11.field402);
                                class89.field1253[var12] = true;
                                class68.field1045.method292(arg6, arg9, arg0, arg4);
                                continue;
                            }
                            if (class585.field8497 == var11.field346) {
                                class634.method3625(-13226, var11.field402, class68.field1045, var11.field414, var13, var14);
                                class89.field1253[var12] = true;
                                class68.field1045.method292(arg6, arg9, arg0, arg4);
                                continue;
                            }
                            if (class217.field2813 == var11.field346) {
                                if (!class564.field8151 && !class150.field1861) {
                                    continue;
                                }
                                int var26 = var11.field414 + var13;
                                int var27 = var14 + 15;
                                if (class564.field8151) {
                                    int var28 = -256;
                                    if (class307.field4073 < 20) {
                                        var28 = -65536;
                                    }
                                    class657.field9330.method2521(var26, var28, var27, -1, "Fps:" + class307.field4073, -1);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 98304) {
                                        var31 = -65536;
                                        if (class469.field6559) {
                                            class567.method3321((byte) -122);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class175.method1103((byte) 38, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class657.field9330.method2521(var26, var31, var27, -1, "Mem:" + var30 + "k", arg2 - 16);
                                    var27 += 15;
                                    class657.field9330.method2521(var26, -256, var27, -1, "In:" + class164.field2004 + "B/s Out:" + class432.field6203 + "B/s", -1);
                                    var27 += 15;
                                    int var33 = class68.field1045.method214() / 1024;
                                    class657.field9330.method2521(var26, var33 > 65536 ? -65536 : -256, var27, -1, "Offheap:" + var33 + "k", -1);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class335.field4448[var37] != null) {
                                            var34 += class335.field4448[var37].method1308((byte) -90);
                                            var35 += class335.field4448[var37].method1309(100);
                                            var36 += class335.field4448[var37].method1300(18892);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class321.method1866(-28555, true, 2, (long) var39, 0) + "% (" + var38 + "%)";
                                    class242.field3330.method2521(var26, -256, var27, -1, var40, -1);
                                    var27 += 12;
                                }
                                if (class498.field6966 > 0) {
                                    class242.field3330.method2521(var26, -256, var27, -1, "Particles: " + class512.field7507 + " / " + class498.field6966, -1);
                                }
                                var27 += 12;
                                if (class150.field1861) {
                                    class242.field3330.method2521(var26, -256, var27, -1, "Polys: " + class68.field1045.method327() + " Models: " + class68.field1045.method289(), arg2 ^ 0xFFFFFFF0);
                                    var27 += 12;
                                    class242.field3330.method2521(var26, -256, var27, -1, "Ls: " + field1951 + " La: " + class412.field5854 + " NPC: " + class351.field4693 + " Pl: " + class155.field1900, arg2 - 16);
                                    class493.method2868((byte) 95);
                                    var27 += 12;
                                }
                                class89.field1253[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field379 == 0) {
                            if (class333.field4434 == var11.field346 && class68.field1045.method237()) {
                                class68.field1045.method254(var13, var14, var11.field414, var11.field402);
                            }
                            method1017(var23, var13 - var11.field332, 15, var12, var21, arg5, var22, var14 - var11.field480, var11.field465, var20);
                            if (var11.field429 != null) {
                                method1017(var23, var13 - var11.field332, 15, var12, var21, var11.field429, var22, var14 - var11.field480, var11.field465, var20);
                            }
                            class21 var41 = (class21) class113.field1442.method3678((long) var11.field465, -119);
                            if (var41 != null) {
                                class167.method1057(var12, var21, var23, var14, var20, var13, -128, var41.field540, var22);
                            }
                            if (class333.field4434 == var11.field346 && class68.field1045.method237()) {
                                class68.field1045.method227();
                            }
                            class68.field1045.method292(arg6, arg9, arg0, arg4);
                        }
                        if (class404.field5699[var12] || class149.field1835 > 1) {
                            if (var11.field379 == 3) {
                                if (var15 == 0) {
                                    if (var11.field489) {
                                        class68.field1045.method248(var13, var14, var11.field414, var11.field402, var11.field470, 0);
                                    } else {
                                        class68.field1045.method278(var13, var14, var11.field414, var11.field402, var11.field470, 0);
                                    }
                                } else if (var11.field489) {
                                    class68.field1045.method248(var13, var14, var11.field414, var11.field402, var11.field470 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class68.field1045.method278(var13, var14, var11.field414, var11.field402, 255 - (var15 & 0xFF) << 24 | var11.field470 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field379 == 4) {
                                class419 var42 = var11.method201(true, class68.field1045);
                                if (var42 != null) {
                                    int var43 = var11.field470;
                                    String var44 = var11.field476;
                                    if (var11.field412 != -1) {
                                        class238 var45 = class65.field1021.method178(false, var11.field412);
                                        var44 = var45.field3261;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field3268 == 1 || var11.field361 != 1) && var11.field361 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class618.method3534(var11.field361, (byte) 108);
                                        }
                                    }
                                    if (client.field3750 == var11) {
                                        var44 = class424.field6069.method2561(class370.field4980, 0);
                                        var43 = var11.field470;
                                    }
                                    if (class200.field2420) {
                                        class68.field1045.method300(var13, var14, var11.field414 + var13, var14 - -var11.field402);
                                    }
                                    var42.method2526(null, var43 | 255 - (var15 & 0xFF) << 24, var11.field421, null, var11.field402, var44, var11.field354 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field372, (byte) -84, 0, var13, class156.field1902, var11.field414, var11.field467, var14, var11.field383, 0);
                                    if (class200.field2420) {
                                        class68.field1045.method292(arg6, arg9, arg0, arg4);
                                    }
                                } else if (class131.field1670) {
                                    class314.method1836(var11, false);
                                }
                            } else if (var11.field379 == 5) {
                                if (var11.field483 >= 0) {
                                    var11.method203(class415.field5873, (byte) 120, class32.field653).method2919(-22269, var11.field402, 0, class68.field1045, var13, 0, var11.field327 << 3, var14, var11.field414, var11.field478 << 3);
                                } else {
                                    class701 var46;
                                    if (var11.field412 == -1) {
                                        var46 = var11.method204(class68.field1045, false);
                                    } else {
                                        class569 var47 = var11.field364 ? class206.field2472.field8824 : null;
                                        var46 = class65.field1021.method189(var47, var11.field361, class68.field1045, var11.field324 | 0xFF000000, var11.field486, var11.field357, arg2 ^ 0x62, var11.field412);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method896();
                                        int var49 = var46.method901();
                                        int var50 = (var11.field470 == 0 ? 16777215 : var11.field470 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field368) {
                                            class68.field1045.method300(var13, var14, var13 + var11.field414, var11.field402 + var14);
                                            if (var11.field387 != 0) {
                                                int var51 = (var48 + var11.field414 - 1) / var48;
                                                int var52 = (var49 + var11.field402 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field470 == 0) {
                                                            var46.method3927((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field387);
                                                        } else {
                                                            var46.method3928((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field387, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field470 == 0 && var15 == 0) {
                                                var46.method3923(var13, var14, var11.field414, var11.field402);
                                            } else {
                                                var46.method898(var13, var14, var11.field414, var11.field402, 0, var50, 1);
                                            }
                                            class68.field1045.method292(arg6, arg9, arg0, arg4);
                                        } else if (var11.field470 == 0 && var15 == 0) {
                                            if (var11.field387 != 0) {
                                                var46.method3927((float) var11.field414 / 2.0F + (float) var13, (float) var11.field402 / 2.0F + (float) var14, var11.field414 * 4096 / var48, var11.field387);
                                            } else if (var11.field414 == var48 && var11.field402 == var49) {
                                                var46.method3924(var13, var14);
                                            } else {
                                                var46.method3925(var13, var14, var11.field414, var11.field402);
                                            }
                                        } else if (var11.field387 != 0) {
                                            var46.method3928((float) var11.field414 / 2.0F + (float) var13, (float) var11.field402 / 2.0F + (float) var14, var11.field414 * 4096 / var48, var11.field387, 0, var50, 1);
                                        } else if (var11.field414 == var48 && var11.field402 == var49) {
                                            var46.method3(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method3932(var13, var14, var11.field414, var11.field402, 0, var50, 1);
                                        }
                                    } else if (class131.field1670) {
                                        class314.method1836(var11, false);
                                    }
                                }
                            } else if (var11.field379 == 6) {
                                class232.method1416(-1);
                                class55 var55 = null;
                                int var56 = 0;
                                if (var11.field412 != -1) {
                                    class238 var57 = class65.field1021.method178(false, var11.field412);
                                    if (var57 != null) {
                                        class238 var58 = var57.method1449(var11.field361, true);
                                        class282 var59 = var11.field382 == -1 ? null : class195.field2367.method3273(var11.field382, 0);
                                        class569 var60 = var11.field364 ? class206.field2472.field8824 : null;
                                        var55 = var58.method1456(var11.field444, class68.field1045, var11.field415, var60, var11.field385, var59, arg2 - 15, 2048, 1);
                                        if (var55 == null) {
                                            class314.method1836(var11, false);
                                        } else {
                                            var56 = -var55.method65() >> 1;
                                        }
                                    }
                                } else if (var11.field433 == 5) {
                                    int var61 = var11.field342;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class613 var62 = class184.field2252[var61];
                                        class282 var63 = var11.field382 == -1 ? null : class195.field2367.method3273(var11.field382, 0);
                                        if (var62 != null && (class63.field1016 == var61 || class361.method2061(0, var62.field8801) == var11.field447)) {
                                            var55 = var62.field8824.method3333(2048, var11.field415, var63, null, 0, var11.field385, 0, true, class332.field4418, class195.field2367, 0, null, -1, class206.field2477, arg2 ^ 0xFFFFFFFE, class68.field1045, var11.field444, class65.field1021, class410.field5804, class616.field8848, null);
                                        }
                                    }
                                } else if (var11.field433 == 8 || var11.field433 == 9) {
                                    class122 var65 = class673.method3829(1, false, var11.field342);
                                    class282 var66 = var11.field382 == -1 ? null : class195.field2367.method3273(var11.field382, 0);
                                    if (var65 != null) {
                                        class569 var67 = var11.field364 ? class206.field2472.field8824 : null;
                                        var55 = var65.method854(var11.field385, var11.field447, var11.field433 == 9, var11.field444, var67, class68.field1045, 2048, var11.field415, var66, arg2 ^ 0x7F);
                                    }
                                } else if (var11.field382 == -1) {
                                    var55 = var11.method205(class332.field4418, true, -1, -1, class410.field5804, null, class616.field8848, class68.field1045, 2048, class195.field2367, class206.field2477, class206.field2472.field8824, class65.field1021, 0);
                                    if (var55 == null && class131.field1670) {
                                        class314.method1836(var11, false);
                                    }
                                } else {
                                    class282 var64 = class195.field2367.method3273(var11.field382, 0);
                                    var55 = var11.method205(class332.field4418, true, var11.field444, var11.field415, class410.field5804, var64, class616.field8848, class68.field1045, 2048, class195.field2367, class206.field2477, class206.field2472.field8824, class65.field1021, var11.field385);
                                    if (var55 == null && class131.field1670) {
                                        class314.method1836(var11, false);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field399 > 0) {
                                        var68 = (var11.field414 << 9) / var11.field399;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field329 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field402 << 9) / var11.field329;
                                    }
                                    int var70 = var11.field414 / 2 + var13;
                                    int var71 = var11.field402 / 2 + var14;
                                    if (!var11.field459) {
                                        var70 += var11.field365 * var68 >> 9;
                                        var71 += var11.field457 * var69 >> 9;
                                    }
                                    class230.field2999.method710();
                                    class68.field1045.method262(class230.field2999);
                                    class68.field1045.method301(var70, var71, var68, var69);
                                    class68.field1045.method246();
                                    if (var11.field390) {
                                        class68.field1045.method309(false);
                                    }
                                    if (var11.field459) {
                                        class521.field7627.method721(var11.field408);
                                        class521.field7627.method714(var11.field454);
                                        class521.field7627.method718(var11.field474);
                                        class521.field7627.method723(var11.field365, var11.field457, var11.field416);
                                    } else {
                                        int var72 = (var11.field446 << 2) * class395.field5579[var11.field408 << 3] >> 14;
                                        int var73 = (var11.field446 << 2) * class395.field5582[var11.field408 << 3] >> 14;
                                        class521.field7627.method722(-var11.field474 << 3);
                                        class521.field7627.method714(var11.field454 << 3);
                                        class521.field7627.method723(var11.field380 << 2, (var11.field398 << 2) + var56 + var72, var73 - -(var11.field398 << 2));
                                        class521.field7627.method713(var11.field408 << 3);
                                    }
                                    var11.method206(var55, class521.field7627, class543.field7882, class68.field1045, -103);
                                    if (class200.field2420) {
                                        class68.field1045.method300(var13, var14, var13 + var11.field414, var11.field402 + var14);
                                    }
                                    if (var11.field459) {
                                        if (var11.field358) {
                                            var55.method122(class521.field7627, null, var11.field446, 1);
                                        } else {
                                            var55.method67(class521.field7627, null, 1);
                                            if (var11.field377 != null) {
                                                class68.field1045.method228(var11.field377.method3866());
                                            }
                                        }
                                    } else if (var11.field358) {
                                        var55.method122(class521.field7627, null, var11.field446 << 2, 1);
                                    } else {
                                        var55.method67(class521.field7627, null, 1);
                                        if (var11.field377 != null) {
                                            class68.field1045.method228(var11.field377.method3866());
                                        }
                                    }
                                    if (class200.field2420) {
                                        class68.field1045.method292(arg6, arg9, arg0, arg4);
                                    }
                                    if (var11.field390) {
                                        class68.field1045.method309(true);
                                    }
                                }
                            } else if (var11.field379 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field434) {
                                    var74 = var13 + var11.field414;
                                    var75 = var13;
                                    var76 = var11.field402 + var14;
                                    var77 = var14;
                                } else {
                                    var77 = var11.field402 + var14;
                                    var76 = var14;
                                    var75 = var13;
                                    var74 = var11.field414 + var13;
                                }
                                if (var11.field352 == 1) {
                                    class68.field1045.method259(var75, var76, var74, var77, var11.field470, 0);
                                } else {
                                    class68.field1045.method326(var75, var76, var74, var77, var11.field470, var11.field352, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static void method1018(boolean arg0) {
        if (arg0) {
            field1957 = 100;
        }
        field1952 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lkga;)V")
    public class160(class506 arg0) {
        this.field1947 = arg0;
        if (this.field1947.field7397 && this.field1947.field7355) {
            this.field1953 = this.field1967 = new class416(this.field1947);
            if (this.field1947.field7257 > 1 && this.field1947.field7390 && this.field1947.field7339) {
                this.field1953 = this.field1969 = new class416(this.field1947);
                return;
            }
        }
    }
}
