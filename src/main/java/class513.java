import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class513 implements class69 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    private int field7532 = -1;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[Lpt;")
    private class377[] field7540 = new class377[9];

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    private int field7544 = 0;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lml;")
    private class194 field7524;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field7546 = new String[] { method3930(method3929("__>\u001at")), method3930(method3929("L\u0013>d!")), method3930(method3929("J\u0004|X")), method3930(method3929("L\u0013>y!")), method3930(method3929("L\u0013>}!")), method3930(method3929("L\u0013>{!")), method3930(method3929("L\u0013>e!")), method3930(method3929("L\u0013>s!")), method3930(method3929("L\u0013>g!")), method3930(method3929("L\u0013>R`J\u0010|]sAY")), method3930(method3929("L\u0013>w!")), method3930(method3929("L\u0013>`!")), method3930(method3929("L\u0013>|!")), method3930(method3929("L\u0013>\u007f!")), method3930(method3929("L\u0013>v!")), method3930(method3929("L\u0013>f!")), method3930(method3929("L\u0013>~!")), method3930(method3929("L\u0013>p!")), method3930(method3929("L\u0013>x!")), method3930(method3929("L\u0013>u!")), method3930(method3929("L\u0013>q!")), method3930(method3929("L\u0013>r!")), method3930(method3929("L\u0013>\b`J\u0018d\n!")), method3930(method3929("L\u0013>z!")) };

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    private int field7522;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    private int field7534;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    private int field7536;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field7523;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLbp;II)V")
    private final void method3915(boolean arg0, class117 arg1, int arg2, int arg3) {
        try {
            field7539++;
            if (this.field7532 == -1) {
                throw new RuntimeException();
            } else if (!arg0) {
                int var5 = 0x1 << arg2;
                if ((this.field7522 & ~var5) == 0) {
                    this.field7536 = arg1.field1485;
                    this.field7534 = arg1.field1482;
                } else if (this.field7536 != arg1.field1485 || this.field7534 != arg1.field1482) {
                    throw new RuntimeException();
                }
                arg1.method1066(arg3, (byte) -56, class270.field3828[arg2], this.field7532);
                this.field7540[arg2] = arg1;
                this.field7522 |= var5;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7546[13] + arg0 + ',' + (arg1 == null ? field7546[2] : field7546[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)I")
    public static final int method3916(byte arg0, int arg1, int arg2) {
        try {
            field7520++;
            if (arg0 <= 125) {
                method3921((byte) -79, -41);
            }
            return arg2 == 1 || arg2 == 3 ? class682.field9574[arg1 & 0x3] : class113.field1466[arg1 & 0x3];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.field7524.method1645(this.field7535, 1028);
            field7533++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7546[9] + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public final void method713(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36160, 0);
            field7545++;
            this.field7544 &= 0xFFFFFFFB;
            this.field7532 = this.method3925(false);
            int var2 = 116 / ((arg0 - 62) / 38);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)I")
    public static final int method3917(byte arg0) {
        try {
            field7542++;
            if (arg0 != -67) {
                method3917((byte) -18);
            }
            int var1 = class201.field2963.method5398(27577);
            if (var1 < class758.field10827.length - 1) {
                class201.field2963 = class758.field10827[var1 + 1];
            }
            return 100;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lgfa;III)V")
    public final void method3918(class112 arg0, int arg1, int arg2, int arg3) {
        try {
            this.method3919(arg3, 0, arg0, (byte) 50, arg1);
            if (arg2 >= -42) {
                this.method3928(null, -45, -28);
            }
            field7541++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7546[1] + (arg0 == null ? field7546[2] : field7546[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILgfa;BI)V")
    private final void method3919(int arg0, int arg1, class112 arg2, byte arg3, int arg4) {
        try {
            field7543++;
            if (this.field7532 == -1) {
                throw new RuntimeException();
            }
            int var6 = 0x1 << arg0;
            if ((~var6 & this.field7522) == 0) {
                this.field7534 = arg2.field1448;
                this.field7536 = arg2.field1448;
            } else if (this.field7536 != arg2.field1448 || this.field7534 != arg2.field1448) {
                throw new RuntimeException();
            }
            arg2.method1046(this.field7532, arg1, class270.field3828[arg0], false, arg4);
            this.field7540[arg0] = arg2;
            if (arg3 < 39) {
                this.field7535 = -70;
            }
            this.field7522 |= var6;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7546[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7546[2] : field7546[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method716(int arg0) {
        try {
            if (arg0 != 15302) {
                this.method3919(28, -8, null, (byte) -79, 67);
            }
            OpenGL.glBindFramebufferEXT(36009, 0);
            field7526++;
            this.field7544 &= 0xFFFFFFFD;
            this.field7532 = this.method3925(false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public static void method3920(int arg0) {
        try {
            if (arg0 != -5088) {
                method3920(-25);
            }
            field7523 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7546[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method712(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36008, this.field7535);
            field7529++;
            this.field7544 |= 0x1;
            this.field7532 = this.method3925(false);
            if (arg0 != -8119) {
                this.method716(-98);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public static final void method3921(byte arg0, int arg1) {
        try {
            field7531++;
            if (arg0 != -67) {
                method3916((byte) 45, -60, -98);
            }
            class294 var2 = class146.method1261((long) arg1, -101, 17);
            var2.method2376(arg0 + 23);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljt;II)V")
    public final void method3922(class487 arg0, int arg1, int arg2) {
        try {
            field7525++;
            if (this.field7532 == -1) {
                throw new RuntimeException();
            }
            int var4 = arg2 << arg1;
            if ((~var4 & this.field7522) == 0) {
                this.field7536 = arg0.field7149;
                this.field7534 = arg0.field7145;
            } else if (this.field7536 != arg0.field7149 || this.field7534 != arg0.field7145) {
                throw new RuntimeException();
            }
            arg0.method3753(this.field7532, class270.field3828[arg1], true);
            this.field7540[arg1] = arg0;
            this.field7522 |= var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7546[4] + (arg0 == null ? field7546[2] : field7546[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Z")
    public final boolean method3923(boolean arg0) {
        try {
            field7530++;
            if (!arg0) {
                this.method3928(null, -3, -114);
            }
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7532);
            return var2 == 36053;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method715(byte arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36009, this.field7535);
            field7517++;
            this.field7544 |= 0x2;
            if (arg0 != -113) {
                this.field7522 = -62;
            }
            this.field7532 = this.method3925(false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method714(byte arg0) {
        try {
            field7519++;
            OpenGL.glBindFramebufferEXT(36008, 0);
            if (arg0 > -56) {
                this.method3923(false);
            }
            this.field7544 &= 0xFFFFFFFE;
            this.field7532 = this.method3925(false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    public final void method3924(int arg0, int arg1) {
        try {
            field7521++;
            if (this.field7532 == -1) {
                throw new RuntimeException();
            }
            if (arg0 != 1) {
                this.field7536 = -103;
            }
            OpenGL.glDrawBuffer(class270.field3828[arg1]);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)I")
    private final int method3925(boolean arg0) {
        try {
            field7528++;
            if ((this.field7544 & 0x4) != 0) {
                return 36160;
            } else if ((this.field7544 & 0x2) != 0) {
                return 36009;
            } else if (arg0) {
                return -8;
            } else if ((this.field7544 & 0x1) == 0) {
                return -1;
            } else {
                return 36008;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
    public final void method3926(int arg0, byte arg1) {
        try {
            if (this.field7540[arg0] != null) {
                this.field7540[arg0].method992(arg1 - 79);
            }
            field7518++;
            this.field7522 &= ~(0x1 << arg0);
            this.field7540[arg0] = null;
            if (arg1 != 78) {
                method3917((byte) -31);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7546[23] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public final void method3927(int arg0, int arg1) {
        try {
            int var3 = 99 % ((arg0 + 21) / 60);
            field7537++;
            if (this.field7532 == -1) {
                throw new RuntimeException();
            }
            OpenGL.glReadBuffer(class270.field3828[arg1]);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7546[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lml;)V")
    public class513(class194 arg0) {
        try {
            if (!arg0.field2806) {
                throw new IllegalStateException("");
            }
            this.field7524 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class54.field746, 0);
            this.field7535 = class54.field746[0];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[22] + (arg0 == null ? field7546[2] : field7546[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbp;II)V")
    public final void method3928(class117 arg0, int arg1, int arg2) {
        try {
            field7538++;
            this.method3915(false, arg0, arg2, arg1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7546[6] + (arg0 == null ? field7546[2] : field7546[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public final void method717(byte arg0) {
        try {
            if (arg0 <= 42) {
                method3916((byte) -119, 95, -97);
            }
            OpenGL.glBindFramebufferEXT(36160, this.field7535);
            field7527++;
            this.field7544 |= 0x4;
            this.field7532 = this.method3925(false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7546[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3929(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3930(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
