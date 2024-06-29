import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class class232 extends class568 {

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "Z")
    public boolean field3605;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "[Lnt;")
    public class232[] field3595;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field3608 = new String[] { method2027(method2026("BdGU\r")), method2027(method2026("BdG_\r")), method2027(method2026("BdG LBy\u001d\"\r")), method2027(method2026("BdGT\r")), method2027(method2026("BdGK\r")), method2027(method2026("BdG[\r")), method2027(method2026("BdGJ\r")), method2027(method2026("BdGN\r")), method2027(method2026("BdG]d\u0004")), method2027(method2026("BdG^\r")), method2027(method2026("xx\u0000o\u0005C`\fnDXy\u0006r\u0005H\u007f\fo\u0005B\u007f\u001d<MMf\f<D\fs\u0006pJYbIsPX`\u001ch")), method2027(method2026("W>G2X")), method2027(method2026("Be\u0005p")), method2027(method2026("BdGY\r")), method2027(method2026("BdGI\r")), method2027(method2026("xx\u0000o\u0005C`\fnDXy\u0006r\u0005H\u007f\fo\u0005B\u007f\u001d<MMf\f<D\f}\u0006rJOx\u001bsHI0\u0006iQ\\e\u001d")), method2027(method2026("BdGP\r")) };

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field3598 = -1;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Ltba;")
    public class170 field3599;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "Lmf;")
    public class442 field3601;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIII)I", line = 3)
    public static final int method2018(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            field3587++;
            class454 var4 = class173.method1596(arg0, arg2 + 13395, arg3);
            if (var4 == null) {
                return 0;
            } else if (arg1 == -1) {
                return 0;
            } else {
                int var5 = 0;
                int var6 = 0;
                if (arg2 != 115) {
                    return 82;
                }
                while (var4.field7013.length > var6) {
                    if (var4.field7018[var6] == arg1) {
                        var5 += var4.field7013[var6];
                    }
                    var6++;
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3608[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)I", line = 38)
    public int method2019(int arg0) {
        try {
            field3590++;
            int var2 = -123 % ((arg0 + 45) / 58);
            return -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)V", line = 50)
    public void method2020(int arg0, int arg1, int arg2) {
        try {
            field3591++;
            int var4 = this.field3597 == 255 ? arg0 : this.field3597;
            if (this.field3605) {
                this.field3601 = new class442(var4, arg0, arg2);
            } else {
                this.field3599 = new class170(var4, arg0, arg2);
            }
            if (arg1 >= -67) {
                this.method2024(-81);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3608[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(CIB)C", line = 73)
    public static final char method2021(char arg0, int arg1, byte arg2) {
        try {
            field3606++;
            if (arg0 >= 'À' && arg0 <= 'ÿ') {
                if (arg0 >= 'À' && arg0 <= 'Æ') {
                    return 'A';
                }
                if (arg0 == 'Ç') {
                    return 'C';
                }
                if (arg0 >= 'È' && arg0 <= 'Ë') {
                    return 'E';
                }
                if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                    return 'I';
                }
                if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                    return 'O';
                }
                if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                    return 'U';
                }
                if (arg0 == 'Ý') {
                    return 'Y';
                }
                if (arg0 == 'ß') {
                    return 's';
                }
                if (arg0 >= 'à' && arg0 <= 'æ') {
                    return 'a';
                }
                if (arg0 == 'ç') {
                    return 'c';
                }
                if (arg0 >= 'è' && arg0 <= 'ë') {
                    return 'e';
                }
                if (arg0 >= 'ì' && arg0 <= 'ï') {
                    return 'i';
                }
                if (arg0 >= 'ò' && arg0 <= 'ö') {
                    return 'o';
                }
                if (arg0 >= 'ù' && arg0 <= 'ü') {
                    return 'u';
                }
                if (arg0 == 'ý' || arg0 == 'ÿ') {
                    return 'y';
                }
            }
            if (arg0 == 'Œ') {
                return 'O';
            } else if (arg0 == 'œ') {
                return 'o';
            } else if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                if (arg2 <= 56) {
                    method2021((char) 65458, 114, (byte) 99);
                }
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)[I", line = 157)
    public final int[] method2022(int arg0, int arg1, int arg2) {
        try {
            field3592++;
            if (arg2 != 0) {
                this.method122(122, 89);
            }
            return this.field3595[arg1].field3605 ? this.field3595[arg1].method66(arg0, (byte) 123) : this.field3595[arg1].method122(-3093, arg0)[0];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3608[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[[I", line = 183)
    public int[][] method122(int arg0, int arg1) {
        try {
            if (arg0 == -3093) {
                field3596++;
                throw new IllegalStateException(field3608[10]);
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BII)[[I", line = 194)
    public final int[][] method2023(byte arg0, int arg1, int arg2) {
        try {
            field3594++;
            if (arg0 <= 90) {
                this.field3599 = null;
            }
            if (this.field3595[arg2].field3605) {
                int[] var4 = this.field3595[arg2].method66(arg1, (byte) 123);
                return new int[][] { var4, var4, var4 };
            } else {
                return this.field3595[arg2].method122(-3093, arg1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3608[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[I", line = 230)
    public int[] method66(int arg0, byte arg1) {
        try {
            field3600++;
            if (arg1 != 123) {
                this.method67((byte) -113);
            }
            throw new IllegalStateException(field3608[15]);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V", line = 258)
    public void method2024(int arg0) {
        try {
            if (this.field3605) {
                this.field3601.method3463((byte) 116);
                this.field3601 = null;
            } else {
                this.field3599.method1578((byte) 97);
                this.field3599 = null;
            }
            field3602++;
            if (arg0 != 12968) {
                this.field3601 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3608[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 283)
    public void method67(byte arg0) {
        try {
            field3588++;
            int var2 = -98 % ((arg0 - 73) / 34);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILwq;I)V", line = 293)
    public void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 <= 96) {
                field3598 = 66;
            }
            field3603++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3608[13] + arg0 + ',' + (arg1 == null ? field3608[12] : field3608[11]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I", line = 304)
    public int method2025(int arg0) {
        try {
            field3604++;
            return arg0 == -9801 ? -1 : -64;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3608[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IZ)V", line = 320)
    public class232(int arg0, boolean arg1) {
        try {
            this.field3605 = arg1;
            this.field3595 = new class232[arg0];
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3608[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2026(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2027(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
