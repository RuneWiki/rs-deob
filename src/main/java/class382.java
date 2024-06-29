import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class382 {

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public int field5559;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
    public boolean field5574;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Z")
    public boolean field5565;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "[S")
    public short[] field5561;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    private int field5564;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public int field5563;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5575 = new String[] { method3017(method3016("QG|-\u0004")), method3017(method3016("QA>\u0002")), method3017(method3016("D\u001a|@Q")), method3017(method3016("QG|REQ]&P\u0004")), method3017(method3016("QG|,\u0004")), method3017(method3016("QG|/\u0004")), method3017(method3016("QG|*\u0004")), method3017(method3016("QG|+\u0004")) };

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Llf;")
    public static class260 field5572 = new class260(11, 8);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    private int field5566;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    private int field5568;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lta;")
    public class330 field5573;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZZ)V")
    public final void method3011(int arg0, boolean arg1, boolean arg2) {
        try {
            field5570++;
            int var4;
            if (arg2) {
                var4 = 2048;
            } else {
                int var5 = this.field5564 + (this.field5562 * arg0 / 50) & 0x7FF;
                int var6 = this.field5568;
                if (var6 == 1) {
                    var4 = (class487.field7151[var5 << 3] >> 4) + 1024;
                } else if (var6 == 3) {
                    var4 = class272.field3866[var5] >> 1;
                } else if (var6 == 4) {
                    var4 = var5 >> 10 << 11;
                } else if (var6 == 2) {
                    var4 = var5;
                } else if (var6 == 5) {
                    var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
                } else {
                    var4 = 2048;
                }
            }
            this.field5573.method2598((float) ((this.field5571 * var4 >> 11) + this.field5566) / 2048.0F, -6546);
            if (!arg1) {
                this.method3011(21, true, false);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5575[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    private final void method3012(byte arg0) {
        try {
            int var2 = this.field5563;
            if (var2 == 2) {
                this.field5566 = 0;
                this.field5571 = 2048;
                this.field5568 = 1;
                this.field5562 = 2048;
            } else if (var2 == 3) {
                this.field5566 = 0;
                this.field5568 = 1;
                this.field5571 = 2048;
                this.field5562 = 4096;
            } else if (var2 == 4) {
                this.field5571 = 2048;
                this.field5568 = 4;
                this.field5562 = 2048;
                this.field5566 = 0;
            } else if (var2 == 5) {
                this.field5571 = 2048;
                this.field5562 = 8192;
                this.field5568 = 4;
                this.field5566 = 0;
            } else if (var2 == 12) {
                this.field5562 = 2048;
                this.field5571 = 2048;
                this.field5566 = 0;
                this.field5568 = 2;
            } else if (var2 == 13) {
                this.field5568 = 2;
                this.field5562 = 8192;
                this.field5566 = 0;
                this.field5571 = 2048;
            } else if (var2 == 10) {
                this.field5566 = 1536;
                this.field5562 = 2048;
                this.field5568 = 3;
                this.field5571 = 512;
            } else if (var2 == 11) {
                this.field5571 = 512;
                this.field5568 = 3;
                this.field5562 = 4096;
                this.field5566 = 1536;
            } else if (var2 == 6) {
                this.field5571 = 768;
                this.field5566 = 1280;
                this.field5568 = 3;
                this.field5562 = 2048;
            } else if (var2 == 7) {
                this.field5568 = 3;
                this.field5562 = 4096;
                this.field5566 = 1280;
                this.field5571 = 768;
            } else if (var2 == 8) {
                this.field5568 = 3;
                this.field5571 = 1024;
                this.field5562 = 2048;
                this.field5566 = 1024;
            } else if (var2 == 9) {
                this.field5566 = 1024;
                this.field5568 = 3;
                this.field5571 = 1024;
                this.field5562 = 4096;
            } else if (var2 == 14) {
                this.field5562 = 2048;
                this.field5571 = 768;
                this.field5568 = 1;
                this.field5566 = 1280;
            } else if (var2 == 15) {
                this.field5568 = 1;
                this.field5562 = 4096;
                this.field5571 = 512;
                this.field5566 = 1536;
            } else if (var2 == 16) {
                this.field5568 = 1;
                this.field5562 = 8192;
                this.field5571 = 256;
                this.field5566 = 1792;
            } else {
                this.field5566 = 0;
                this.field5568 = 0;
                this.field5571 = 2048;
                this.field5562 = 2048;
            }
            if (arg0 > -32) {
                this.method3011(94, false, false);
            }
            field5560++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5575[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILha;BIIII)V")
    private final void method3013(int arg0, class18 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field5567++;
            this.field5573 = arg1.method142(arg5, arg4, arg3, arg0, arg6, 1.0F);
            int var8 = -15 % ((-arg2 - 30) / 34);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5575[4] + arg0 + ',' + (arg1 == null ? field5575[1] : field5575[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public static void method3014(boolean arg0) {
        try {
            field5572 = null;
            if (arg0) {
                method3014(true);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5575[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
    public final void method3015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field5569++;
            this.field5562 = arg2;
            this.field5571 = arg4;
            this.field5566 = arg1;
            this.field5568 = arg0;
            if (arg3 != 2) {
                this.method3011(108, true, true);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5575[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    protected class382() {
        try {
            if (class272.field3866 == null) {
                class467.method3587((byte) 41);
            }
            this.method3012((byte) -48);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5575[3] + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lha;Ljc;I)V")
    public class382(class18 arg0, class711 arg1, int arg2) {
        try {
            if (class272.field3866 == null) {
                class467.method3587((byte) 41);
            }
            this.field5559 = arg1.method5128(0);
            this.field5574 = (this.field5559 & 0x8) != 0;
            this.field5565 = (this.field5559 & 0x10) != 0;
            this.field5559 &= 0x7;
            int var4 = arg1.method5116((byte) -120) << arg2;
            int var5 = arg1.method5116((byte) -107) << arg2;
            int var6 = arg1.method5116((byte) -117) << arg2;
            int var7 = arg1.method5128(0);
            int var8 = var7 * 2 + 1;
            this.field5561 = new short[var8];
            for (int var9 = 0; var9 < this.field5561.length; var9++) {
                short var10 = (short) arg1.method5116((byte) -111);
                int var11 = var10 >>> 8;
                if (var8 <= var11) {
                    var11 = var8 - 1;
                }
                int var12 = var10 & 0xFF;
                if (var8 - var11 < var12) {
                    var12 = var8 - var11;
                }
                this.field5561[var9] = (short) class10.method71(var11 << 8, var12);
            }
            int var13 = (var7 << class179.field2328) + class157.field2000;
            int var14 = class360.field5233 == null ? class552.field8055[class750.method5429(-71, arg1.method5116((byte) -122)) & 0xFFFF] : class360.field5233[arg1.method5116((byte) -117)];
            int var15 = arg1.method5128(0);
            this.field5564 = var15 & 0xE0 << 3;
            this.field5563 = var15 & 0x1F;
            if (this.field5563 != 31) {
                this.method3012((byte) -87);
            }
            this.method3013(var13, arg0, (byte) 22, var5, var6, var4, var14);
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field5575[3] + (arg0 == null ? field5575[1] : field5575[2]) + ',' + (arg1 == null ? field5575[1] : field5575[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3016(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3017(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
