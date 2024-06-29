import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class87 extends class493 {

    @OriginalMember(owner = "client!vga", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!vga", name = "o", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!vga", name = "p", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!vga", name = "q", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 < -75) {
            ++field1191;
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) {
        if (arg0 != -2) {
            method631(13);
        }
        super.field6720.method2163((byte) -62, false);
        ++field1197;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILbl;)V")
    public final void method629(int arg0, int arg1, class649 arg2) {
        super.field6720.method2148(arg2, 63);
        ++field1198;
        super.field6720.method2153(arg1, (byte) -118);
        if (arg0 != 6) {
            this.method629(-90, 37, (class649) null);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(CIB)C")
    public static final char method630(char arg0, int arg1, byte arg2) {
        if (arg2 > -66) {
            return '|';
        } else {
            ++field1194;
            if (arg0 >= 192 && ~arg0 >= -256) {
                if (~arg0 <= -193 && ~arg0 >= -199) {
                    return 'A';
                }
                if (arg0 == 199) {
                    return 'C';
                }
                if (arg0 >= 200 && arg0 <= 203) {
                    return 'E';
                }
                if (~arg0 <= -205 && arg0 <= 207) {
                    return 'I';
                }
                if (~arg0 <= -211 && ~arg0 >= -215) {
                    return 'O';
                }
                if (arg0 >= 217 && ~arg0 >= -221) {
                    return 'U';
                }
                if (~arg0 == -222) {
                    return 'Y';
                }
                if (~arg0 == -224) {
                    return 's';
                }
                if (arg0 >= 224 && arg0 <= 230) {
                    return 'a';
                }
                if (arg0 == 231) {
                    return 'c';
                }
                if (~arg0 <= -233 && arg0 <= 235) {
                    return 'e';
                }
                if (arg0 >= 236 && arg0 <= 239) {
                    return 'i';
                }
                if (~arg0 <= -243 && arg0 <= 246) {
                    return 'o';
                }
                if (~arg0 <= -250 && ~arg0 >= -253) {
                    return 'u';
                }
                if (arg0 == 253 || ~arg0 == -256) {
                    return 'y';
                }
            }
            if (~arg0 == -339) {
                return 'O';
            } else if (~arg0 == -340) {
                return 'o';
            } else if (~arg0 == -377) {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "(I)V")
    public static final void method631(int arg0) {
        ++field1199;
        int var1 = class427.field6032;
        int[] var2 = class619.field8682;
        for (int var3 = 0; var3 < var1; ++var3) {
            class83 var9 = class361.field4793[var2[var3]];
            if (var9 != null && ~var9.field836 < -1) {
                --var9.field836;
                if (~var9.field836 == -1) {
                    var9.field822 = null;
                }
            }
        }
        for (int var4 = 0; class84.field1169 > var4; ++var4) {
            long var5 = (long) class665.field9261[var4];
            class706 var7 = (class706) class681.field9475.method2552(var5, -1);
            if (var7 != null) {
                class215 var8 = var7.field9890;
                if (var8.field836 > 0) {
                    --var8.field836;
                    if (~var8.field836 == -1) {
                        var8.field822 = null;
                    }
                }
            }
        }
        if (arg0 != -256) {
            method631(98);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V")
    public final void method632(int arg0, boolean arg1) {
        ++field1193;
        if (arg0 < 93) {
            field1201 = 111;
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(IZ)V")
    public final void method633(int arg0, boolean arg1) {
        if (arg0 != 69) {
            this.method628(77);
        }
        super.field6720.method2163((byte) -93, true);
        ++field1192;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)Z")
    public final boolean method634(byte arg0) {
        ++field1196;
        return arg0 == 27;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Luv;)V")
    public class87(class367 arg0) {
        super(arg0);
    }
}
