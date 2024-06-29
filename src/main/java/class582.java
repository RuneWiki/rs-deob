import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class582 extends class194 {

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "[B")
    public byte[] field8609;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field8620 = new String[] { method4360(method4359("q\t\u001c[l")), method4360(method4359("q\t\u001cZl")), method4360(method4359("q\t\u001c^l")), method4360(method4359("q\t\u001c\\l")), method4360(method4359("q\t\u001cXl")), method4360(method4359("q\t\u001c]l")), method4360(method4359("q\t\u001cYl")), method4360(method4359("y\u0015^{")), method4360(method4359("q\t\u001c+-y\tF)l")), method4360(method4359("lN\u001c99")) };

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field8619 = 0;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public int field8606;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public int field8607;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public int field8610;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public int field8613;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method4352(int arg0, int arg1, int arg2, int arg3) {
        try {
            field8611++;
            class313 var4 = class196.method1670((long) arg2, 11, -95);
            if (arg1 <= 24) {
                field8614 = -39;
            }
            var4.method2636((byte) -91);
            var4.field4958 = arg0;
            var4.field4951 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8620[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V", line = 18)
    public final void method4353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field8607 = arg1;
            field8612++;
            this.field8610 = arg2 - arg1;
            this.field8613 = arg4;
            this.field8606 = arg0 - arg4;
            int var6 = -39 % ((26 - arg3) / 39);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8620[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIBII)V", line = 35)
    public final void method4354(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        try {
            if (arg4 > -40) {
                field8614 = -95;
            }
            field8616++;
            int var8 = 0;
            if (arg0 != arg3) {
                var8 = (arg6 - arg5 << 16) / (arg0 - arg3);
            }
            int var9 = 0;
            if (arg0 != arg2) {
                var9 = (arg1 - arg6 << 16) / (arg2 - arg0);
            }
            int var10 = 0;
            if (arg2 != arg3) {
                var10 = (arg5 - arg1 << 16) / (arg3 - arg2);
            }
            if (arg3 <= arg0 && arg2 >= arg3) {
                if (arg0 >= arg2) {
                    arg6 = arg5 <<= 0x10;
                    if (arg3 < 0) {
                        arg5 -= arg3 * var8;
                        arg6 -= arg3 * var10;
                        arg3 = 0;
                    }
                    arg1 <<= 0x10;
                    if (arg2 < 0) {
                        arg1 -= arg2 * var9;
                        arg2 = 0;
                    }
                    if (arg2 != arg3 && var8 > var10 || arg2 == arg3 && var8 < var9) {
                        arg0 -= arg2;
                        arg2 -= arg3;
                        arg3 = this.field8610 * arg3;
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg1 >> 16, (byte) 122, arg5 >> 16, this.field8609, arg3);
                                    arg1 += var9;
                                    arg5 += var8;
                                    arg3 += this.field8610;
                                }
                            }
                            class262.method2200(0, arg6 >> 16, (byte) -103, arg5 >> 16, this.field8609, arg3);
                            arg6 += var10;
                            arg3 += this.field8610;
                            arg5 += var8;
                        }
                    } else {
                        arg0 -= arg2;
                        arg2 -= arg3;
                        arg3 = this.field8610 * arg3;
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg5 >> 16, (byte) -87, arg1 >> 16, this.field8609, arg3);
                                    arg5 += var8;
                                    arg3 += this.field8610;
                                    arg1 += var9;
                                }
                            }
                            class262.method2200(0, arg5 >> 16, (byte) 106, arg6 >> 16, this.field8609, arg3);
                            arg5 += var8;
                            arg3 += this.field8610;
                            arg6 += var10;
                        }
                    }
                } else {
                    arg1 = arg5 <<= 0x10;
                    arg6 <<= 0x10;
                    if (arg3 < 0) {
                        arg1 -= arg3 * var10;
                        arg5 -= arg3 * var8;
                        arg3 = 0;
                    }
                    if (arg0 < 0) {
                        arg6 -= arg0 * var9;
                        arg0 = 0;
                    }
                    if (arg0 != arg3 && var10 < var8 || arg0 == arg3 && var9 < var10) {
                        arg2 -= arg0;
                        arg0 -= arg3;
                        arg3 = this.field8610 * arg3;
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg1 >> 16, (byte) 96, arg6 >> 16, this.field8609, arg3);
                                    arg6 += var9;
                                    arg1 += var10;
                                    arg3 += this.field8610;
                                }
                            }
                            class262.method2200(0, arg1 >> 16, (byte) -24, arg5 >> 16, this.field8609, arg3);
                            arg1 += var10;
                            arg5 += var8;
                            arg3 += this.field8610;
                        }
                    } else {
                        arg2 -= arg0;
                        arg0 -= arg3;
                        arg3 = this.field8610 * arg3;
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg6 >> 16, (byte) -24, arg1 >> 16, this.field8609, arg3);
                                    arg1 += var10;
                                    arg6 += var9;
                                    arg3 += this.field8610;
                                }
                            }
                            class262.method2200(0, arg5 >> 16, (byte) -43, arg1 >> 16, this.field8609, arg3);
                            arg5 += var8;
                            arg3 += this.field8610;
                            arg1 += var10;
                        }
                    }
                }
            } else if (arg0 > arg2) {
                if (arg3 >= arg0) {
                    arg5 = arg1 <<= 0x10;
                    arg6 <<= 0x10;
                    if (arg2 < 0) {
                        arg1 -= arg2 * var10;
                        arg5 -= arg2 * var9;
                        arg2 = 0;
                    }
                    if (arg0 < 0) {
                        arg6 -= arg0 * var8;
                        arg0 = 0;
                    }
                    if (var9 < var10) {
                        arg3 -= arg0;
                        arg0 -= arg2;
                        arg2 = this.field8610 * arg2;
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg6 >> 16, (byte) 107, arg1 >> 16, this.field8609, arg2);
                                    arg6 += var8;
                                    arg1 += var10;
                                    arg2 += this.field8610;
                                }
                            }
                            class262.method2200(0, arg5 >> 16, (byte) -78, arg1 >> 16, this.field8609, arg2);
                            arg5 += var9;
                            arg1 += var10;
                            arg2 += this.field8610;
                        }
                    } else {
                        arg3 -= arg0;
                        arg0 -= arg2;
                        arg2 = this.field8610 * arg2;
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg1 >> 16, (byte) 101, arg6 >> 16, this.field8609, arg2);
                                    arg6 += var8;
                                    arg1 += var10;
                                    arg2 += this.field8610;
                                }
                            }
                            class262.method2200(0, arg1 >> 16, (byte) -78, arg5 >> 16, this.field8609, arg2);
                            arg5 += var9;
                            arg2 += this.field8610;
                            arg1 += var10;
                        }
                    }
                } else {
                    arg6 = arg1 <<= 0x10;
                    if (arg2 < 0) {
                        arg6 -= arg2 * var9;
                        arg1 -= arg2 * var10;
                        arg2 = 0;
                    }
                    arg5 <<= 0x10;
                    if (arg3 < 0) {
                        arg5 -= arg3 * var8;
                        arg3 = 0;
                    }
                    if (var9 >= var10) {
                        arg0 -= arg3;
                        arg3 -= arg2;
                        arg2 = this.field8610 * arg2;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg5 >> 16, (byte) 95, arg6 >> 16, this.field8609, arg2);
                                    arg2 += this.field8610;
                                    arg5 += var8;
                                    arg6 += var9;
                                }
                            }
                            class262.method2200(0, arg1 >> 16, (byte) 123, arg6 >> 16, this.field8609, arg2);
                            arg6 += var9;
                            arg2 += this.field8610;
                            arg1 += var10;
                        }
                    } else {
                        arg0 -= arg3;
                        arg3 -= arg2;
                        arg2 = this.field8610 * arg2;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    class262.method2200(0, arg6 >> 16, (byte) 114, arg5 >> 16, this.field8609, arg2);
                                    arg5 += var8;
                                    arg2 += this.field8610;
                                    arg6 += var9;
                                }
                            }
                            class262.method2200(0, arg6 >> 16, (byte) 114, arg1 >> 16, this.field8609, arg2);
                            arg2 += this.field8610;
                            arg6 += var9;
                            arg1 += var10;
                        }
                    }
                }
            } else if (arg3 <= arg2) {
                arg1 = arg6 <<= 0x10;
                arg5 <<= 0x10;
                if (arg0 < 0) {
                    arg1 -= arg0 * var8;
                    arg6 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    arg5 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 >= var9) {
                    arg2 -= arg3;
                    arg3 -= arg0;
                    arg0 = this.field8610 * arg0;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg2--;
                                if (arg2 < 0) {
                                    return;
                                }
                                class262.method2200(0, arg6 >> 16, (byte) -74, arg5 >> 16, this.field8609, arg0);
                                arg6 += var9;
                                arg5 += var10;
                                arg0 += this.field8610;
                            }
                        }
                        class262.method2200(0, arg6 >> 16, (byte) 96, arg1 >> 16, this.field8609, arg0);
                        arg6 += var9;
                        arg1 += var8;
                        arg0 += this.field8610;
                    }
                } else {
                    arg2 -= arg3;
                    arg3 -= arg0;
                    arg0 = this.field8610 * arg0;
                    while (true) {
                        arg3--;
                        if (arg3 < 0) {
                            while (true) {
                                arg2--;
                                if (arg2 < 0) {
                                    return;
                                }
                                class262.method2200(0, arg5 >> 16, (byte) 125, arg6 >> 16, this.field8609, arg0);
                                arg0 += this.field8610;
                                arg5 += var10;
                                arg6 += var9;
                            }
                        }
                        class262.method2200(0, arg1 >> 16, (byte) -128, arg6 >> 16, this.field8609, arg0);
                        arg1 += var8;
                        arg0 += this.field8610;
                        arg6 += var9;
                    }
                }
            } else {
                arg5 = arg6 <<= 0x10;
                arg1 <<= 0x10;
                if (arg0 < 0) {
                    arg6 -= arg0 * var9;
                    arg5 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg2 < 0) {
                    arg1 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var8 < var9 || arg0 == arg2 && var10 < var8) {
                    arg3 -= arg2;
                    arg2 -= arg0;
                    arg0 = this.field8610 * arg0;
                    while (true) {
                        arg2--;
                        if (arg2 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class262.method2200(0, arg5 >> 16, (byte) 109, arg1 >> 16, this.field8609, arg0);
                                arg0 += this.field8610;
                                arg5 += var8;
                                arg1 += var10;
                            }
                        }
                        class262.method2200(0, arg5 >> 16, (byte) -60, arg6 >> 16, this.field8609, arg0);
                        arg6 += var9;
                        arg5 += var8;
                        arg0 += this.field8610;
                    }
                } else {
                    arg3 -= arg2;
                    arg2 -= arg0;
                    arg0 = this.field8610 * arg0;
                    while (true) {
                        arg2--;
                        if (arg2 < 0) {
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    return;
                                }
                                class262.method2200(0, arg1 >> 16, (byte) -122, arg5 >> 16, this.field8609, arg0);
                                arg1 += var10;
                                arg0 += this.field8610;
                                arg5 += var8;
                            }
                        }
                        class262.method2200(0, arg6 >> 16, (byte) 124, arg5 >> 16, this.field8609, arg0);
                        arg0 += this.field8610;
                        arg5 += var8;
                        arg6 += var9;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8620[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZI)V", line = 475)
    public static final void method4355(int arg0, int arg1, boolean arg2, int arg3) {
        try {
            field8618++;
            if (arg0 < 8000 || arg0 > 48000) {
                throw new IllegalArgumentException();
            } else if (arg3 == 1358790352) {
                class686.field9950 = arg1;
                class247.field3844 = arg2;
                class598.field8803 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8620[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V", line = 492)
    public final void method4356(byte arg0) {
        try {
            field8615++;
            int var2 = -1;
            if (arg0 != 124) {
                this.field8607 = -89;
            }
            int var3 = this.field8609.length - 8;
            while (var3 > var2) {
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
                var2++;
                this.field8609[var2] = 0;
            }
            while (this.field8609.length - 1 > var2) {
                var2++;
                this.field8609[var2] = 0;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8620[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z", line = 533)
    public static final boolean method4357(int arg0, int arg1, int arg2) {
        try {
            field8617++;
            if (arg2 == 11) {
                arg2 = 10;
            }
            if (arg0 != 7696) {
                field8619 = 81;
            }
            class198 var3 = class417.field6144.method3030(0, arg1);
            if (arg2 >= 5 && arg2 <= 8) {
                arg2 = 4;
            }
            return var3.method1778(arg2, false);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8620[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)Z", line = 553)
    public final boolean method4358(byte arg0, int arg1, int arg2) {
        try {
            field8608++;
            if (arg0 != 26) {
                this.field8606 = 111;
            }
            return this.field8609.length >= arg1 * arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8620[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lffa;II)V", line = 568)
    public class582(class197 arg0, int arg1, int arg2) {
        try {
            this.field8609 = new byte[arg1 * arg2];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8620[8] + (arg0 == null ? field8620[7] : field8620[9]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4359(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4360(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
