import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class508 {

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Lwf;")
    private class117 field7216 = new class117(16);

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Lkda;")
    private class328 field7218;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Z")
    public static boolean field7214;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lh;")
    public static class572 field7213;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lkda;")
    public static class328 field7219;

    static {
        new class572("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field7214 = true;
        field7213 = new class572("flash3:", "blinken3:", "clignotant3:", "brilho3:");
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)Lf;", line = 3)
    private final class644 method3017(byte arg0, int arg1) {
        field7220++;
        class117 var3 = this.field7216;
        class644 var4;
        synchronized (this.field7216) {
            var4 = (class644) this.field7216.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 13) {
            this.field7218 = null;
        }
        class328 var5 = this.field7218;
        byte[] var6;
        synchronized (this.field7218) {
            var6 = this.field7218.method1966(arg1, 29, true);
        }
        class644 var7 = new class644();
        if (var6 != null) {
            var7.method3721((byte) 18, new class148(var6));
        }
        class117 var8 = this.field7216;
        synchronized (this.field7216) {
            this.field7216.method835((byte) 123, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 33)
    public final void method3018(int arg0) {
        if (arg0 != 8929) {
            field7214 = true;
        }
        field7217++;
        class117 var2 = this.field7216;
        synchronized (this.field7216) {
            this.field7216.method846(0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILrl;IIB)Lfj;", line = 48)
    public final class564 method3019(int arg0, int arg1, class617 arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 115) {
            method3022(68, -123, -16);
        }
        field7221++;
        class382[] var7 = null;
        class644 var8 = this.method3017((byte) 13, arg0);
        if (var8.field9378 != null) {
            var7 = new class382[var8.field9378.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class369 var10 = arg2.method3615(var8.field9378[var9], true);
                var7[var9] = new class382(var10.field5083, var10.field5089, var10.field5090, var10.field5081, var10.field5085, var10.field5084, var10.field5086, var10.field5094);
            }
        }
        return new class564(var8.field9382, var7, var8.field9375, arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 85)
    public final void method3020(int arg0) {
        class117 var2 = this.field7216;
        synchronized (this.field7216) {
            this.field7216.method837(126);
            if (arg0 >= -126) {
                field7219 = null;
            }
        }
        field7211++;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)I", line = 99)
    public static final int method3021(int arg0, int arg1) {
        field7215++;
        int var2 = 86 % ((67 - arg1) / 34);
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z", line = 109)
    public static final boolean method3022(int arg0, int arg1, int arg2) {
        field7222++;
        if (arg2 > -1) {
            method3021(-122, 15);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V", line = 139)
    public final void method3023(int arg0, int arg1) {
        field7209++;
        class117 var3 = this.field7216;
        synchronized (this.field7216) {
            this.field7216.method834(arg0, 0);
            int var4 = -15 / ((60 - arg1) / 45);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIII)V", line = 154)
    public static final void method3024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7210++;
        if (class100.field1452 >= arg3 && arg1 >= class3.field25) {
            boolean var6;
            if (arg5 < class14.field136) {
                var6 = false;
                arg5 = class14.field136;
            } else if (class130.field1801 >= arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class130.field1801;
            }
            boolean var7;
            if (class14.field136 > arg4) {
                arg4 = class14.field136;
                var7 = false;
            } else if (class130.field1801 >= arg4) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class130.field1801;
            }
            if (arg3 >= class3.field25) {
                class140.method969(arg5, 15888, arg0, arg4, class604.field8993[arg3++]);
            } else {
                arg3 = class3.field25;
            }
            if (class100.field1452 < arg1) {
                arg1 = class100.field1452;
            } else {
                class140.method969(arg5, arg2 ^ 0xFFF1CE10, arg0, arg4, class604.field8993[arg1--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg1; var8++) {
                    int[] var9 = class604.field8993[var8];
                    var9[arg5] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg1; var10++) {
                    class604.field8993[var10][arg5] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg1; var11++) {
                    class604.field8993[var11][arg4] = arg0;
                }
            }
        }
        if (arg2 != -921600) {
            field7214 = false;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbt;ILkda;)V", line = 259)
    public class508(class39 arg0, int arg1, class328 arg2) {
        this.field7218 = arg2;
        this.field7218.method1975(28, 29);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI[BI)Ljava/lang/String;", line = 275)
    public static final String method3025(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > -96) {
            return null;
        }
        field7212++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1 + arg3;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 >= 224) {
                    if (var8 >= 240) {
                        if (var8 >= 244) {
                            throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                        }
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    if (var7 + 2 >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg2[var7] & 0xFF;
                    if (var9 >= 128 && var9 <= 191) {
                        var7++;
                        int var10 = arg2[var7] & 0xFF;
                        if (var10 >= 128 && var10 <= 191) {
                            var4[var5++] = (char) class473.method2847(class37.method245(var10, -129), class473.method2847(class37.method245(var9 << 6, -8256), class37.method245(-921600, var8 << 12)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if ((var7 + 1) < var6) {
                    var7++;
                    int var11 = arg2[var7] & 0xFF;
                    if (var11 < 128 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class473.method2847(class37.method245(-129, var11), class37.method245(-193, var8) << 6);
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 357)
    public static void method3026(byte arg0) {
        field7213 = null;
        field7219 = null;
        if (arg0 < 63) {
            method3026((byte) 45);
        }
    }
}
