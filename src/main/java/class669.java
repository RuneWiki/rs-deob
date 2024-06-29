import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class669 extends class192 {

    @OriginalMember(owner = "client!or", name = "x", descriptor = "[B")
    public byte[] field9511;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field9514 = new String[] { method4856(method4855("V$\u001b|\u000b")), method4856(method4855("V$\u001b}\u000b")), method4856(method4855("V$\u001bz\u000b")), method4856(method4855("V$\u001b\u007f\u000b")), method4856(method4855("V$\u001b{\u000b")), method4856(method4855("V$\u001b\u0002JW?A\u0000\u000b")), method4856(method4855("W#YR")), method4856(method4855("Bx\u001b\u0010^")) };

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lvn;")
    public static class330 field9506 = new class330(83, 4);

    @OriginalMember(owner = "client!or", name = "A", descriptor = "Lat;")
    public static class398 field9510 = new class398();

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public int field9504;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public int field9505;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public int field9508;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public int field9513;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V")
    public final void method4850(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field9508 = arg4 - arg0;
            this.field9504 = arg0;
            this.field9513 = arg2;
            field9507++;
            int var6 = -73 % ((14 - arg1) / 51);
            this.field9505 = arg3 - arg2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9514[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)Z")
    public final boolean method4851(int arg0, int arg1, byte arg2) {
        try {
            field9509++;
            if (arg2 <= 105) {
                return false;
            } else {
                return arg0 * arg1 <= this.field9511.length;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9514[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static void method4852(int arg0) {
        try {
            if (arg0 != 31342) {
                method4852(66);
            }
            field9510 = null;
            field9506 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9514[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
    public final void method4853(int arg0) {
        try {
            field9503++;
            int var2 = arg0;
            int var3 = this.field9511.length - 8;
            while (var2 < var3) {
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
                var2++;
                this.field9511[var2] = 0;
            }
            while (var2 < this.field9511.length - 1) {
                var2++;
                this.field9511[var2] = 0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9514[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIZII)V")
    public final void method4854(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        try {
            field9512++;
            int var8 = 0;
            if (arg3 != arg6) {
                var8 = (arg0 - arg1 << 16) / (arg6 - arg3);
            }
            int var9 = 0;
            if (arg5 != arg6) {
                var9 = (arg2 - arg0 << 16) / (arg5 - arg6);
            }
            if (arg4) {
                this.method4851(14, -79, (byte) -39);
            }
            int var10 = 0;
            if (arg3 != arg5) {
                var10 = (arg1 - arg2 << 16) / (arg3 - arg5);
            }
            if (arg6 >= arg3 && arg3 <= arg5) {
                if (arg6 < arg5) {
                    arg2 = arg1 <<= 0x10;
                    if (arg3 < 0) {
                        arg2 -= arg3 * var10;
                        arg1 -= arg3 * var8;
                        arg3 = 0;
                    }
                    arg0 <<= 0x10;
                    if (arg6 < 0) {
                        arg0 -= arg6 * var9;
                        arg6 = 0;
                    }
                    if (arg3 != arg6 && var8 > var10 || arg3 == arg6 && var10 > var9) {
                        arg5 -= arg6;
                        arg6 -= arg3;
                        arg3 = this.field9505 * arg3;
                        while (true) {
                            arg6--;
                            if (arg6 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg3);
                                    arg2 += var10;
                                    arg3 += this.field9505;
                                    arg0 += var9;
                                }
                            }
                            class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg3);
                            arg3 += this.field9505;
                            arg1 += var8;
                            arg2 += var10;
                        }
                    } else {
                        arg5 -= arg6;
                        arg6 -= arg3;
                        arg3 = this.field9505 * arg3;
                        while (true) {
                            arg6--;
                            if (arg6 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg3);
                                    arg0 += var9;
                                    arg3 += this.field9505;
                                    arg2 += var10;
                                }
                            }
                            class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg3);
                            arg1 += var8;
                            arg2 += var10;
                            arg3 += this.field9505;
                        }
                    }
                } else {
                    arg0 = arg1 <<= 0x10;
                    arg2 <<= 0x10;
                    if (arg3 < 0) {
                        arg1 -= arg3 * var8;
                        arg0 -= arg3 * var10;
                        arg3 = 0;
                    }
                    if (arg5 < 0) {
                        arg2 -= arg5 * var9;
                        arg5 = 0;
                    }
                    if (arg3 != arg5 && var8 > var10 || arg3 == arg5 && var9 > var8) {
                        arg6 -= arg5;
                        arg5 -= arg3;
                        arg3 = this.field9505 * arg3;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg6--;
                                    if (arg6 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg3);
                                    arg1 += var8;
                                    arg3 += this.field9505;
                                    arg2 += var9;
                                }
                            }
                            class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg3);
                            arg3 += this.field9505;
                            arg0 += var10;
                            arg1 += var8;
                        }
                    } else {
                        arg6 -= arg5;
                        arg5 -= arg3;
                        arg3 = this.field9505 * arg3;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg6--;
                                    if (arg6 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg3);
                                    arg3 += this.field9505;
                                    arg2 += var9;
                                    arg1 += var8;
                                }
                            }
                            class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg3);
                            arg1 += var8;
                            arg0 += var10;
                            arg3 += this.field9505;
                        }
                    }
                }
            } else if (arg5 >= arg6) {
                if (arg3 > arg5) {
                    arg1 = arg0 <<= 0x10;
                    if (arg6 < 0) {
                        arg0 -= arg6 * var9;
                        arg1 -= arg6 * var8;
                        arg6 = 0;
                    }
                    arg2 <<= 0x10;
                    if (arg5 < 0) {
                        arg2 -= arg5 * var10;
                        arg5 = 0;
                    }
                    if ((arg5 == arg6 || var9 <= var8) && (arg5 != arg6 || var10 >= var8)) {
                        arg3 -= arg5;
                        arg5 -= arg6;
                        arg6 = this.field9505 * arg6;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg6);
                                    arg1 += var8;
                                    arg2 += var10;
                                    arg6 += this.field9505;
                                }
                            }
                            class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg6);
                            arg1 += var8;
                            arg6 += this.field9505;
                            arg0 += var9;
                        }
                    } else {
                        arg3 -= arg5;
                        arg5 -= arg6;
                        arg6 = this.field9505 * arg6;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg6);
                                    arg6 += this.field9505;
                                    arg1 += var8;
                                    arg2 += var10;
                                }
                            }
                            class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg6);
                            arg6 += this.field9505;
                            arg0 += var9;
                            arg1 += var8;
                        }
                    }
                } else {
                    arg2 = arg0 <<= 0x10;
                    if (arg6 < 0) {
                        arg0 -= arg6 * var9;
                        arg2 -= arg6 * var8;
                        arg6 = 0;
                    }
                    arg1 <<= 0x10;
                    if (arg3 < 0) {
                        arg1 -= arg3 * var10;
                        arg3 = 0;
                    }
                    if (var9 <= var8) {
                        arg5 -= arg3;
                        arg3 -= arg6;
                        arg6 = this.field9505 * arg6;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg6);
                                    arg0 += var9;
                                    arg1 += var10;
                                    arg6 += this.field9505;
                                }
                            }
                            class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg6);
                            arg2 += var8;
                            arg0 += var9;
                            arg6 += this.field9505;
                        }
                    } else {
                        arg5 -= arg3;
                        arg3 -= arg6;
                        arg6 = this.field9505 * arg6;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg6);
                                    arg1 += var10;
                                    arg0 += var9;
                                    arg6 += this.field9505;
                                }
                            }
                            class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg6);
                            arg0 += var9;
                            arg2 += var8;
                            arg6 += this.field9505;
                        }
                    }
                }
            } else if (arg6 > arg3) {
                arg0 = arg2 <<= 0x10;
                arg1 <<= 0x10;
                if (arg5 < 0) {
                    arg2 -= arg5 * var10;
                    arg0 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg3 < 0) {
                    arg1 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    arg6 -= arg3;
                    arg3 -= arg5;
                    arg5 = this.field9505 * arg5;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg6--;
                                if (arg6 < 0) {
                                    return;
                                }
                                class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg5);
                                arg5 += this.field9505;
                                arg1 += var8;
                                arg0 += var9;
                            }
                        }
                        class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg5);
                        arg0 += var9;
                        arg2 += var10;
                        arg5 += this.field9505;
                    }
                } else {
                    arg6 -= arg3;
                    arg3 -= arg5;
                    arg5 = this.field9505 * arg5;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg6--;
                                if (arg6 < 0) {
                                    return;
                                }
                                class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg5);
                                arg1 += var8;
                                arg0 += var9;
                                arg5 += this.field9505;
                            }
                        }
                        class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg5);
                        arg0 += var9;
                        arg2 += var10;
                        arg5 += this.field9505;
                    }
                }
            } else {
                arg1 = arg2 <<= 0x10;
                if (arg5 < 0) {
                    arg2 -= arg5 * var10;
                    arg1 -= arg5 * var9;
                    arg5 = 0;
                }
                arg0 <<= 0x10;
                if (arg6 < 0) {
                    arg0 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 > var9) {
                    arg3 -= arg6;
                    arg6 -= arg5;
                    arg5 = this.field9505 * arg5;
                    while (true) {
                        arg6--;
                        if (arg6 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg0 >> 16, arg5);
                                arg2 += var10;
                                arg0 += var8;
                                arg5 += this.field9505;
                            }
                        }
                        class467.method3608(arg2 >> 16, (byte) 1, this.field9511, 0, arg1 >> 16, arg5);
                        arg2 += var10;
                        arg1 += var9;
                        arg5 += this.field9505;
                    }
                } else {
                    arg3 -= arg6;
                    arg6 -= arg5;
                    arg5 = this.field9505 * arg5;
                    while (true) {
                        arg6--;
                        if (arg6 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class467.method3608(arg0 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg5);
                                arg5 += this.field9505;
                                arg2 += var10;
                                arg0 += var8;
                            }
                        }
                        class467.method3608(arg1 >> 16, (byte) 1, this.field9511, 0, arg2 >> 16, arg5);
                        arg5 += this.field9505;
                        arg1 += var9;
                        arg2 += var10;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field9514[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lvf;II)V")
    public class669(class159 arg0, int arg1, int arg2) {
        try {
            this.field9511 = new byte[arg1 * arg2];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9514[5] + (arg0 == null ? field9514[6] : field9514[7]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4855(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!or", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4856(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
