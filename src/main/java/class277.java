import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class277 {

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "F")
    public float field3919 = 0.25F;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "F")
    public float field3920 = 1.0F;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "F")
    public float field3921 = 1.0F;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "F")
    public float field3917;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "F")
    public float field3908;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lpca;")
    public class774 field3910;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "F")
    public float field3911;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lsn;")
    public class369 field3907;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3922 = new String[] { method2264(method2263("X=?\u001a{G$e\u0018:")), method2264(method2263("X=?c:")), method2264(method2263("Rc?\bo")), method2264(method2263("X=?g:")), method2264(method2263("G8}J")), method2264(method2263("X=?`:")), method2264(method2263("X=?b:")), method2264(method2263("X=?d:")), method2264(method2263("X=?e:")) };

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lsb;")
    public static class261 field3909 = new class261(138, 6);

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLjc;)V", line = 5)
    public final void method2257(byte arg0, class711 arg1) {
        try {
            if (arg0 == -124) {
                this.field3920 = (float) (arg1.method5128(0) * 8) / 255.0F;
                field3918++;
                this.field3919 = (float) (arg1.method5128(0) * 8) / 255.0F;
                this.field3921 = (float) (arg1.method5128(0) * 8) / 255.0F;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3922[8] + arg0 + ',' + (arg1 == null ? field3922[4] : field3922[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqp;B)Z", line = 18)
    public final boolean method2258(class277 arg0, byte arg1) {
        try {
            if (arg1 != -54) {
                this.method2259(-71, null);
            }
            field3903++;
            return this.field3904 == arg0.field3904 && this.field3917 == arg0.field3917 && this.field3911 == arg0.field3911 && this.field3908 == arg0.field3908 && this.field3919 == arg0.field3919 && this.field3920 == arg0.field3920 && this.field3921 == arg0.field3921 && this.field3906 == arg0.field3906 && this.field3902 == arg0.field3902 && this.field3907 == arg0.field3907 && this.field3910 == arg0.field3910;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3922[3] + (arg0 == null ? field3922[4] : field3922[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(ILjc;)V", line = 33)
    public final void method2259(int arg0, class711 arg1) {
        try {
            field3916++;
            int var3 = arg1.method5116((byte) -120);
            int var4 = arg1.method5087((byte) -26);
            int var5 = 104 / ((10 - arg0) / 44);
            int var6 = arg1.method5087((byte) -26);
            int var7 = arg1.method5087((byte) -26);
            int var8 = arg1.method5116((byte) -107);
            class682.field9575 = var8;
            this.field3910 = class237.method1963(var6, var7, var3, (byte) 78, var4);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3922[7] + arg0 + ',' + (arg1 == null ? field3922[4] : field3922[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIIIII)I", line = 62)
    public static final int method2260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var11 = arg6 & 0x3;
            field3905++;
            if ((arg5 & 0x1) == 1) {
                int var7 = arg3;
                arg3 = arg4;
                arg4 = var7;
            }
            if (var11 == 0) {
                return arg2;
            } else if (var11 == 1) {
                return 1 - (arg3 - (7 - arg0));
            } else {
                int var8 = -74 % ((arg1 - 36) / 58);
                return var11 == 2 ? 1 + 7 - arg4 - arg2 : arg0;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3922[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 96)
    public static void method2261(int arg0) {
        try {
            if (arg0 <= 21) {
                method2261(-63);
            }
            field3909 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3922[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjc;)V", line = 109)
    public final void method2262(int arg0, class711 arg1) {
        try {
            field3913++;
            int var3 = arg1.method5128(0);
            if (class451.field6612.field9127.method5475(3) == 1 && class727.field10423.method198() > 0) {
                if ((var3 & 0x1) == 0) {
                    this.field3904 = class459.field6676;
                } else {
                    this.field3904 = arg1.method5113(18443);
                }
                if ((var3 & 0x2) == 0) {
                    this.field3917 = 1.1523438F;
                } else {
                    this.field3917 = (float) arg1.method5116((byte) -106) / 256.0F;
                }
                if ((var3 & 0x4) == 0) {
                    this.field3911 = 0.69921875F;
                } else {
                    this.field3911 = (float) arg1.method5116((byte) -114) / 256.0F;
                }
                if ((var3 & 0x8) == 0) {
                    this.field3908 = 1.2F;
                } else {
                    this.field3908 = (float) arg1.method5116((byte) -105) / 256.0F;
                }
            } else {
                if ((var3 & 0x1) != 0) {
                    arg1.method5113(18443);
                }
                if ((var3 & 0x2) != 0) {
                    arg1.method5116((byte) -126);
                }
                if ((var3 & 0x4) != 0) {
                    arg1.method5116((byte) -116);
                }
                if ((var3 & 0x8) != 0) {
                    arg1.method5116((byte) -122);
                }
                this.field3904 = class459.field6676;
                this.field3908 = 1.2F;
                this.field3917 = 1.1523438F;
                this.field3911 = 0.69921875F;
            }
            if ((var3 & 0x10) == 0) {
                this.field3915 = -50;
                this.field3912 = -60;
                this.field3914 = -50;
            } else {
                this.field3914 = arg1.method5087((byte) -26);
                this.field3912 = arg1.method5087((byte) -26);
                this.field3915 = arg1.method5087((byte) -26);
            }
            if ((var3 & 0x20) == 0) {
                this.field3906 = class532.field7708;
            } else {
                this.field3906 = arg1.method5113(18443);
            }
            if ((var3 & 0x40) == 0) {
                this.field3902 = 0;
            } else {
                this.field3902 = arg1.method5116((byte) -110);
            }
            if (arg0 <= 60) {
                this.method2258(null, (byte) -94);
            }
            if ((var3 & 0x80) == 0) {
                this.field3907 = class167.field2143;
            } else {
                int var4 = arg1.method5116((byte) -119);
                int var5 = arg1.method5116((byte) -126);
                int var6 = arg1.method5116((byte) -128);
                int var7 = arg1.method5116((byte) -125);
                int var8 = arg1.method5116((byte) -109);
                int var9 = arg1.method5116((byte) -105);
                this.field3907 = class679.method4878(var4, var9, var8, var5, 104, var7, var6);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3922[5] + arg0 + ',' + (arg1 == null ? field3922[4] : field3922[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 221)
    public class277() {
        try {
            this.field3917 = 1.1523438F;
            this.field3915 = -50;
            this.field3902 = 0;
            this.field3908 = 1.2F;
            this.field3910 = class340.field4955;
            this.field3904 = class459.field6676;
            this.field3911 = 0.69921875F;
            this.field3912 = -60;
            this.field3907 = class167.field2143;
            this.field3914 = -50;
            this.field3906 = class532.field7708;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3922[0] + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljc;)V", line = 238)
    public class277(class711 arg0) {
        try {
            this.method2262(106, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3922[0] + (arg0 == null ? field3922[4] : field3922[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
