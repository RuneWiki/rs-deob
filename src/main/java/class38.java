import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class38 extends class404 {

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    private int field510 = 0;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    private int field508 = 1;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    private int field514 = 0;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "[I")
    public static int[] field516;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
    public static int[] field512;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "[[B")
    public static byte[][] field517;

    static {
        new class423("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field516 = new int[99];
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field516[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method90(int arg0, int arg1) {
        ++field505;
        int[] var3 = super.field5870.method372(arg1, (byte) 5);
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class431.field6348 < ~var6; ++var6) {
                int var7 = class167.field2594[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field510 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field508 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field508;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field514 == 0) {
                    var12 = class486.field7407[(4095 & var12) >> 4] + 4096 >> 1;
                } else if (this.field514 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 >= -47) {
            this.field510 = -55;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)V", line = 72)
    public static final void method208(int arg0, int arg1) {
        class252.field3852 = new int[arg0];
        class158.field2493 = new int[arg0];
        class248.field3802 = new int[arg0];
        if (arg1 != 1) {
            field516 = null;
        }
        class96.field1707 = new int[arg0];
        ++field507;
        class197.field3100 = new int[arg0];
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILjava/lang/Object;)[B", line = 88)
    public static final byte[] method209(int arg0, int arg1, int arg2, Object arg3) {
        ++field504;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class98.method739(arg1, arg2, 85, var4);
        } else if (arg3 instanceof class22) {
            class22 var5 = (class22) arg3;
            return var5.method111(false, arg1, arg2);
        } else {
            int var6 = -111 / ((79 - arg0) / 43);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([[[BIIIIIILqq;IIBII)V", line = 119)
    public static final void method210(byte[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class318 arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        ++field509;
        if (arg2 != 0 && arg3 != 0) {
            if (~arg2 == -10) {
                arg2 = 1;
                arg1 = arg1 + 1 & 3;
            }
            if (arg10 <= 71) {
                method214((byte) -101);
            }
            if (~arg2 == -11) {
                arg1 = arg1 + 3 & 3;
                arg2 = 1;
            }
            if (arg2 == 11) {
                arg2 = 8;
                arg1 = 3 & arg1 + 3;
            }
            arg7.method1939(arg12, arg5, arg9, arg11, arg6, arg8, arg0[arg2 - 1][arg1], arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 153)
    public final void method211(int arg0) {
        ++field513;
        if (arg0 == -3) {
            class331.method2053(false);
        }
    }

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "(I)I", line = 165)
    public static final int method212(int arg0) {
        int var1 = 49 % ((arg0 - -26) / 33);
        ++field511;
        return 2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 177)
    public static final String method213(int arg0, long arg1) {
        ++field506;
        if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class334.field4986[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(arg0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 224)
    public static void method214(byte arg0) {
        field512 = null;
        int var1 = 36 / ((-24 - arg0) / 57);
        field517 = null;
        field516 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 239)
    public class38() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILha;I)V", line = 247)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            this.method87(103, (class40) null, 65);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field508 = arg1.method257((byte) 108);
                }
            } else {
                this.field514 = arg1.method257((byte) 78);
            }
        } else {
            this.field510 = arg1.method257((byte) 88);
        }
        ++field515;
    }
}
