import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class4 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field51 = 0;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
    private boolean field64 = false;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field72 = 0;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "J")
    public long field58;

    // $FF: synthetic field
    @OriginalMember(owner = "client!u", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field73;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[[Lsj;")
    public static class248[][] field71;

    // $FF: synthetic method
    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method27(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILfb;)V", line = 5)
    public final void method20(int arg0, class341 arg1) {
        if (arg0 != -1) {
            this.field55 = 26;
        }
        field66++;
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method23(arg1, (byte) -76, var3);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/awt/Canvas;)Llb;", line = 25)
    public static final class428 method21(int arg0, Canvas arg1) {
        field54++;
        try {
            if (arg0 != 1) {
                method22(-34, -62, -121, (byte) 20, (class298) null, -63, 12, -57, -83);
            }
            Class var2 = Class.forName("tc");
            class428 var3 = (class428) var2.getDeclaredConstructor().newInstance();
            var3.method799(arg1, arg0 ^ 0xFFFFE9B2);
            return var3;
        } catch (Throwable var5) {
            class179 var4 = new class179();
            var4.method799(arg1, arg0 - 5710);
            return var4;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBLtj;IIII)V", line = 59)
    public static final void method22(int arg0, int arg1, int arg2, byte arg3, class298 arg4, int arg5, int arg6, int arg7, int arg8) {
        field62++;
        class56 var9 = (class56) class57.method421(arg1, arg5, arg2);
        if (arg3 >= -124) {
            field71 = null;
        }
        if (var9 != null) {
            class212 var10 = class372.method2447(var9.method116(24186), (byte) 97);
            int var11 = var9.method121(28024) & 0x3;
            int var12 = var9.method122((byte) -120);
            if (var10.field2978 == -1) {
                int var13 = arg0;
                if (var10.field2932 > 0) {
                    var13 = arg6;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method2017(4, (byte) -3, var13, arg7, arg8);
                    } else if (var11 == 1) {
                        arg4.method2016(var13, arg7, 4, 72, arg8);
                    } else if (var11 == 2) {
                        arg4.method2017(4, (byte) -3, var13, arg7 + 3, arg8);
                    } else if (var11 == 3) {
                        arg4.method2016(var13, arg7, 4, 66, arg8 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method2023(1, arg7, arg8, -11682, 1, var13);
                    } else if (var11 == 1) {
                        arg4.method2023(1, arg7 + 3, arg8, -11682, 1, var13);
                    } else if (var11 == 2) {
                        arg4.method2023(1, arg7 + 3, arg8 + 3, -11682, 1, var13);
                    } else if (var11 == 3) {
                        arg4.method2023(1, arg7, arg8 + 3, -11682, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method2016(var13, arg7, 4, 53, arg8);
                    } else if (var11 == 1) {
                        arg4.method2017(4, (byte) -3, var13, arg7 + 3, arg8);
                    } else if (var11 == 2) {
                        arg4.method2016(var13, arg7, 4, 88, arg8 + 3);
                    } else if (var11 == 3) {
                        arg4.method2017(4, (byte) -3, var13, arg7, arg8);
                    }
                }
            } else {
                class409.method2590(var10, arg8, arg7, arg4, var11, 98);
            }
        }
        class56 var14 = (class56) class31.method243(arg1, arg5, arg2, field73 == null ? (field73 = method27("lk")) : field73);
        if (var14 != null) {
            class212 var15 = class372.method2447(var14.method116(24186), (byte) 61);
            int var16 = var14.method121(28024) & 0x3;
            int var17 = var14.method122((byte) -112);
            if (var15.field2978 != -1) {
                class409.method2590(var15, arg8, arg7, arg4, var16, -96);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2932 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method2021((byte) -19, arg7 + 3, arg8, arg7, arg8 + 3, var18);
                } else {
                    arg4.method2021((byte) -33, arg7 + 3, arg8 - -3, arg7, arg8, var18);
                }
            }
        }
        class56 var19 = (class56) class104.method792(arg1, arg5, arg2);
        if (var19 == null) {
            return;
        }
        class212 var20 = class372.method2447(var19.method116(24186), (byte) -110);
        int var21 = var19.method121(28024) & 0x3;
        if (var20.field2978 != -1) {
            class409.method2590(var20, arg8, arg7, arg4, var21, -126);
            return;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfb;BI)V", line = 200)
    private final void method23(class341 arg0, byte arg1, int arg2) {
        field56++;
        int var4 = -57 % ((arg1 - 39) / 47);
        if (arg2 == 1) {
            this.field65 = arg0.method2239(-1076227960);
        } else if (arg2 == 2) {
            arg0.method2233((byte) 104);
        } else if (arg2 == 3) {
            this.field61 = arg0.method2232(-70);
            this.field59 = arg0.method2232(106);
            this.field55 = arg0.method2232(97);
        } else if (arg2 == 4) {
            this.field60 = arg0.method2233((byte) 104);
            this.field50 = arg0.method2232(-57);
        } else if (arg2 == 6) {
            this.field69 = arg0.method2233((byte) 104);
        } else if (arg2 == 8) {
            this.field51 = 1;
        } else if (arg2 == 9) {
            this.field72 = 1;
            return;
        } else if (arg2 == 10) {
            this.field64 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 267)
    public static void method24(int arg0) {
        if (arg0 != 3) {
            method26(38, (byte) -125);
        }
        field71 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 288)
    public final void method25(boolean arg0) {
        field52++;
        if (!arg0) {
            return;
        }
        this.field57 = class240.field3365[this.field65 << 3];
        this.field70 = (int) Math.sqrt((double) (this.field61 * this.field61 + this.field59 * this.field59 + this.field55 * this.field55));
        if (this.field50 == 0) {
            this.field50 = 1;
        }
        if (this.field60 == 0) {
            this.field58 = 2147483647L;
        } else if (this.field60 == 1) {
            this.field58 = (long) (this.field70 * 8 / this.field50);
            this.field58 *= this.field58;
        } else if (this.field60 == 2) {
            this.field58 = (long) (this.field70 * 8 / this.field50);
        }
        if (this.field64) {
            this.field70 *= -1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Luh;", line = 329)
    public static final class414 method26(int arg0, byte arg1) {
        field67++;
        if (arg1 > -123) {
            field68 = -44;
        }
        if (arg0 == 0) {
            if ((double) class200.field2765 == 3.0D) {
                return class86.field1201;
            }
            if ((double) class200.field2765 == 4.0D) {
                return class377.field5518;
            }
            if ((double) class200.field2765 == 6.0D) {
                return class268.field3965;
            }
            if ((double) class200.field2765 >= 8.0D) {
                return class117.field1524;
            }
        } else if (arg0 == 1) {
            if ((double) class200.field2765 == 3.0D) {
                return class268.field3965;
            }
            if ((double) class200.field2765 == 4.0D) {
                return class117.field1524;
            }
            if ((double) class200.field2765 == 6.0D) {
                return class351.field5212;
            }
            if ((double) class200.field2765 >= 8.0D) {
                return class163.field2222;
            }
        } else if (arg0 == 2) {
            if ((double) class200.field2765 == 3.0D) {
                return class351.field5212;
            }
            if ((double) class200.field2765 == 4.0D) {
                return class163.field2222;
            }
            if ((double) class200.field2765 == 6.0D) {
                return class125.field1618;
            }
            if ((double) class200.field2765 >= 8.0D) {
                return class407.field5928;
            }
        }
        return null;
    }
}
