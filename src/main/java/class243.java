import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class243 extends class208 {

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Lpk;")
    public class98 field4174 = new class98();

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "Lfj;")
    public class239 field4179 = new class239();

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Li;")
    private class55 field4175;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "[S")
    public static short[] field4176 = new short[256];

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Lv;")
    public static class147 field4169 = new class147(64);

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Leb;")
    public static class230 field4180 = class68.method589(0, "Texturen geladen)3");

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "[B")
    public static byte[] field4182 = new byte[520];

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "Leb;")
    private static class230 field4186 = class68.method589(0, "Loading config )2 ");

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "Leb;")
    public static class230 field4184 = field4186;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "Leb;")
    public static class230 field4181 = class68.method589(0, ")3)3)3");

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "Leb;")
    public static class230 field4187 = class68.method589(0, "M");

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "Z")
    public static boolean field4188 = false;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Lkk;")
    public static class223 field4183;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[Leb;")
    public static class230[] field4166;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "[Lge;")
    public static class69[] field4185;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[[[B")
    public static byte[][][] field4164;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Lck;")
    public final class208 method454() {
        field4170++;
        class183 var1;
        do {
            var1 = (class183) this.field4174.method834((byte) 82);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3207 == null);
        return var1.field3207;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()Lck;")
    public final class208 method437() {
        class183 var1 = (class183) this.field4174.method839(128);
        field4171++;
        if (var1 == null) {
            return null;
        } else if (var1.field3207 == null) {
            return this.method454();
        } else {
            return var1.field3207;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field4179.method464(arg0);
        field4178++;
        for (class183 var2 = (class183) this.field4174.method839(128); var2 != null; var2 = (class183) this.field4174.method834((byte) 82)) {
            if (!this.field4175.method468(var2, (byte) 105)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3185) {
                        this.method1694(var2, var3, -1);
                        var2.field3185 -= var3;
                        break;
                    }
                    this.method1694(var2, var2.field3185, -1);
                    var3 -= var2.field3185;
                } while (!this.field4175.method442((int[]) null, 0, -287933048, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        field4184 = null;
        if (arg0 != -47) {
            return;
        }
        field4166 = null;
        field4187 = null;
        field4176 = null;
        field4182 = null;
        field4186 = null;
        field4180 = null;
        field4181 = null;
        field4164 = null;
        field4169 = null;
        field4183 = null;
        field4185 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Li;Lkk;Lkk;ZLkk;)Z")
    public static final boolean method1693(class55 arg0, class223 arg1, class223 arg2, boolean arg3, class223 arg4) {
        if (arg3) {
            method1697((class230) null, 35, (byte) -69);
        }
        class215.field3723 = arg2;
        field4172++;
        class49.field866 = arg1;
        class55.field968 = arg4;
        class210.field3663 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
    public final int method457() {
        field4168++;
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lma;II)V")
    private final void method1694(class183 arg0, int arg1, int arg2) {
        if ((this.field4175.field988[arg0.field3202] & 0x4) != 0 && arg0.field3210 < 0) {
            int var4 = this.field4175.field989[arg0.field3202] / class55.field1011;
            int var5 = (var4 + 1048575 - arg0.field3204) / var4;
            arg0.field3204 = arg1 * var4 + arg0.field3204 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field4175.field1000[arg0.field3202] == 0) {
                    arg0.field3207 = class64.method564(arg0.field3195, arg0.field3207.method542(), arg0.field3207.method569(), arg0.field3207.method568());
                } else {
                    arg0.field3207 = class64.method564(arg0.field3195, arg0.field3207.method542(), 0, arg0.field3207.method568());
                    this.field4175.method447((byte) 89, arg0, arg0.field3194.field540[arg0.field3186] < 0);
                }
                if (arg0.field3194.field540[arg0.field3186] < 0) {
                    arg0.field3207.method535(-1);
                }
                arg1 = arg0.field3204 / var4;
            }
        }
        arg0.field3207.method464(arg1);
        field4177++;
        if (arg2 != -1) {
            this.method1694((class183) null, 28, -99);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 32 % ((arg1 + 33) / 41);
        int var10 = arg7 - arg6;
        field4162++;
        int var11 = arg0 - arg4;
        int var12 = (arg3 - arg8 << 16) / var11;
        int var13 = (arg2 - arg5 << 16) / var10;
        class79.method655(0, arg8, arg7, arg4, arg5, arg0, arg6, 0, var12, var13, (byte) -76);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        field4165++;
        if (class214.field3716 == 0) {
            return;
        }
        try {
            if (++class210.field3668 > 2000) {
                if (class30.field556 != null) {
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                }
                if (class159.field2852 >= 1) {
                    class146.field2639 = -5;
                    class214.field3716 = 0;
                    return;
                }
                class159.field2852++;
                if (class166.field2932 == class104.field1894) {
                    class166.field2932 = class249.field4427;
                } else {
                    class166.field2932 = class104.field1894;
                }
                class210.field3668 = 0;
                class214.field3716 = 1;
            }
            if (~class214.field3716 == arg0) {
                class53.field909 = class184.field3228.method1024((byte) -65, class112.field2014, class166.field2932);
                class214.field3716 = 2;
            }
            if (class214.field3716 == 2) {
                if (class53.field909.field3421 == 2) {
                    throw new IOException();
                }
                if (class53.field909.field3421 != 1) {
                    return;
                }
                class30.field556 = new class261((Socket) class53.field909.field3423, class184.field3228);
                class53.field909 = null;
                class30.field556.method1817(class153.field2747.field269, 0, arg0 - 12150, class153.field2747.field318);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(-128);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-123);
                }
                int var1 = class30.field556.method1814(0);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(arg0 - 122);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-128);
                }
                if (var1 != 21) {
                    class146.field2639 = var1;
                    class214.field3716 = 0;
                    class30.field556.method1818(arg0);
                    class30.field556 = null;
                    return;
                }
                class214.field3716 = 3;
            }
            if (class214.field3716 == 3) {
                if (class30.field556.method1816(arg0 + 2) < 1) {
                    return;
                }
                class222.field3801 = new class230[class30.field556.method1814(0)];
                class214.field3716 = 4;
            }
            if (class214.field3716 == 4 && class30.field556.method1816(0) >= (class222.field3801.length * 8)) {
                class183.field3182.field318 = 0;
                class30.field556.method1819(class222.field3801.length * 8, 0, class183.field3182.field269, (byte) 124);
                for (int var2 = 0; var2 < class222.field3801.length; var2++) {
                    class222.field3801[var2] = class113.method906(class183.field3182.method150(true), (byte) -93);
                }
                class146.field2639 = 21;
                class214.field3716 = 0;
                class30.field556.method1818(-2);
                class30.field556 = null;
            }
        } catch (IOException var3) {
            if (class30.field556 != null) {
                class30.field556.method1818(-2);
                class30.field556 = null;
            }
            if (class159.field2852 >= 1) {
                class146.field2639 = -4;
                class214.field3716 = 0;
            } else {
                class210.field3668 = 0;
                if (class166.field2932 == class104.field1894) {
                    class166.field2932 = class249.field4427;
                } else {
                    class166.field2932 = class104.field1894;
                }
                class214.field3716 = 1;
                class159.field2852++;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Leb;IB)V")
    public static final void method1697(class230 arg0, int arg1, byte arg2) {
        field4161++;
        class230 var3 = arg0.method1618(arg2 - 23945).method1623(-30947);
        boolean var4 = false;
        if (arg2 != 56) {
            field4184 = null;
        }
        for (int var5 = 0; var5 < class169.field2984; var5++) {
            class260 var6 = class230.field4011[class233.field4042[var5]];
            if (var6 != null && var6.field4620 != null && var6.field4620.method1612((byte) 15, var3)) {
                var4 = true;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var6.field2296[0], var6.field2253[0], 1, arg2 + 47, 0, 0, class56.field1033.field2253[0]);
                if (arg1 == 1) {
                    class153.field2747.method978(arg2 ^ 0xFFFFFFB9, 51);
                    class153.field2747.method181(arg2 - 20109, class233.field4042[var5]);
                    class111.field1990++;
                } else if (arg1 == 4) {
                    class37.field696++;
                    class153.field2747.method978(-125, 213);
                    class153.field2747.method192(class233.field4042[var5], false);
                } else if (arg1 == 5) {
                    class153.field2747.method978(9, 127);
                    class153.field2747.method181(arg2 - 20109, class233.field4042[var5]);
                    class189.field3316++;
                } else if (arg1 == 6) {
                    class24.field465++;
                    class153.field2747.method978(59, 55);
                    class153.field2747.method181(-20053, class233.field4042[var5]);
                } else if (arg1 == 7) {
                    class245.field4277++;
                    class153.field2747.method978(arg2 ^ 0x20, 218);
                    class153.field2747.method186(class233.field4042[var5], (byte) -126);
                }
                break;
            }
        }
        if (!var4) {
            class227.method1565(class89.field1580, (byte) 78, 0, class173.method1267((byte) 59, new class230[] { class149.field2670, var3 }));
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lma;[IIIII)V")
    private final void method1698(class183 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4163++;
        if ((this.field4175.field988[arg0.field3202] & 0x4) != 0 && arg0.field3210 < 0) {
            int var7 = this.field4175.field989[arg0.field3202] / class55.field1011;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3204) / var7;
                if (arg4 < var8) {
                    arg0.field3204 += arg4 * var7;
                    break;
                }
                arg0.field3207.method441(arg1, arg3, var8);
                arg3 += var8;
                arg0.field3204 += var7 * var8 - 1048576;
                arg4 -= var8;
                int var9 = class55.field1011 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class64 var11 = arg0.field3207;
                if (this.field4175.field1000[arg0.field3202] == 0) {
                    arg0.field3207 = class64.method564(arg0.field3195, var11.method542(), var11.method569(), var11.method568());
                } else {
                    arg0.field3207 = class64.method564(arg0.field3195, var11.method542(), 0, var11.method568());
                    this.field4175.method447((byte) 89, arg0, arg0.field3194.field540[arg0.field3186] < 0);
                    arg0.field3207.method552(var9, var11.method569());
                }
                if (arg0.field3194.field540[arg0.field3186] < 0) {
                    arg0.field3207.method535(-1);
                }
                var11.method567(var9);
                var11.method441(arg1, arg3, arg5 - arg3);
                if (var11.method539()) {
                    this.field4179.method1676(var11);
                }
            }
        }
        arg0.field3207.method441(arg1, arg3, arg4);
        if (arg2 >= -121) {
            field4186 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)V")
    public final void method441(int[] arg0, int arg1, int arg2) {
        this.field4179.method441(arg0, arg1, arg2);
        field4173++;
        for (class183 var4 = (class183) this.field4174.method839(128); var4 != null; var4 = (class183) this.field4174.method834((byte) 82)) {
            if (!this.field4175.method468(var4, (byte) 51)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3185) {
                        this.method1698(var4, arg0, -128, var5, var6, var5 + var6);
                        var4.field3185 -= var6;
                        break;
                    }
                    this.method1698(var4, arg0, -124, var5, var4.field3185, var5 + var6);
                    var6 -= var4.field3185;
                    var5 += var4.field3185;
                } while (!this.field4175.method442(arg0, var5, -287933048, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Li;)V")
    public class243(class55 arg0) {
        this.field4175 = arg0;
    }
}
