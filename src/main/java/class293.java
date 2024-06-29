import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class293 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljr;")
    public class112 field4099 = new class112(20);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Ljr;")
    private class112 field4112 = new class112(64);

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lin;")
    public class91 field4110;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lin;")
    private class91 field4103;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lqv;")
    public static class447 field4101 = new class447();

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lad;")
    public static class426 field4105 = new class426(0, 1);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4109 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "B")
    public static byte field4108;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 13)
    public final void method1916(int arg0) {
        field4100++;
        class112 var2 = this.field4112;
        synchronized (this.field4112) {
            this.field4112.method996(-103);
        }
        class112 var3 = this.field4099;
        synchronized (this.field4099) {
            if (arg0 <= 42) {
                this.method1916(36);
            }
            this.field4099.method996(-126);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z", line = 29)
    public static final boolean method1917(byte arg0, int arg1, int arg2) {
        field4106++;
        if (arg0 > -65) {
            return false;
        } else {
            return (arg1 & 0xC580) != 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILkda;)V", line = 41)
    public static final void method1918(boolean arg0, int arg1, class390 arg2) {
        field4104++;
        class399 var3 = arg2.method2445((byte) 72);
        if (arg2.field5745 == 0) {
            arg2.field5752 = 0;
            class309.field4289 = -1;
            class422.field6094 = 0;
            return;
        }
        if (~arg2.field5712 != arg1 && arg2.field5644 == 0) {
            class691 var4 = class456.field6436.method1021(arg2.field5712, arg1 + 7);
            if (arg2.field5748 > 0 && var4.field9352 == 0) {
                class309.field4289 = -1;
                class422.field6094 = 0;
                arg2.field5752++;
                return;
            }
            if (arg2.field5748 <= 0 && var4.field9335 == 0) {
                class422.field6094 = 0;
                class309.field4289 = -1;
                arg2.field5752++;
                return;
            }
        }
        if (arg2.field5695 != -1 && arg2.field5651 <= class641.field8810) {
            class654 var5 = class104.field1840.method3016((byte) 118, arg2.field5695);
            if (var5.field8964 && var5.field8980 != -1) {
                class691 var6 = class456.field6436.method1021(var5.field8980, 7);
                if (arg2.field5748 > 0 && var6.field9352 == 0) {
                    class422.field6094 = 0;
                    arg2.field5752++;
                    class309.field4289 = -1;
                    return;
                }
                if (arg2.field5748 <= 0 && var6.field9335 == 0) {
                    class309.field4289 = -1;
                    class422.field6094 = 0;
                    arg2.field5752++;
                    return;
                }
            }
        }
        if (arg2.field5695 != -1 && class641.field8810 >= arg2.field5651) {
            class654 var7 = class104.field1840.method3016((byte) 98, arg2.field5695);
            if (var7.field8964 && var7.field8980 != -1) {
                class691 var8 = class456.field6436.method1021(var7.field8980, arg1 ^ 0x7);
                if (arg2.field5748 > 0 && var8.field9352 == 0) {
                    class422.field6094 = 0;
                    arg2.field5752++;
                    class309.field4289 = -1;
                    return;
                }
                if (arg2.field5748 <= 0 && var8.field9335 == 0) {
                    class309.field4289 = -1;
                    class422.field6094 = 0;
                    arg2.field5752++;
                    return;
                }
            }
        }
        int var9 = arg2.field5922;
        int var10 = arg2.field5933;
        int var11 = arg2.field5746[arg2.field5745 - 1] * 512 + arg2.method2457((byte) 117) * 256;
        int var12 = arg2.field5743[arg2.field5745 - 1] * 512 + (arg2.method2457((byte) 72) * 256);
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var10 < var12) {
                    arg2.method2461((byte) 49, 6144);
                } else if (var10 > var12) {
                    arg2.method2461((byte) 49, 2048);
                } else {
                    arg2.method2461((byte) 49, 4096);
                }
            } else if (var12 > var10) {
                arg2.method2461((byte) 49, 8192);
            } else if (var12 < var10) {
                arg2.method2461((byte) 49, 0);
            }
        } else if (var12 > var10) {
            arg2.method2461((byte) 49, 10240);
        } else if (var10 > var12) {
            arg2.method2461((byte) 49, 14336);
        } else {
            arg2.method2461((byte) 49, 12288);
        }
        byte var13 = arg2.field5747[arg2.field5745 - 1];
        if (!arg0 && var11 - var9 > 1024 || (var11 - var9) < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg2.field5933 = var12;
            arg2.field5922 = var11;
            arg2.method2456((byte) -108, arg2.field5708, false);
            class309.field4289 = -1;
            arg2.field5745--;
            if (arg2.field5748 > 0) {
                arg2.field5748--;
            }
            class422.field6094 = 0;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class9) {
            var15 = ((class9) arg2).field126.field4648;
        }
        if (var15) {
            int var16 = arg2.field5708 - arg2.field5643.field3338;
            if (var16 != 0 && arg2.field5701 == -1 && arg2.field5736 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg2.field5745 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg2.field5745 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg2.field5745 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg2.field5745 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field5752 > 0 && arg2.field5745 > 1) {
            var14 = 32;
            arg2.field5752--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class422.field6094 = 0;
        if (var3.field5889 != -1) {
            int var17 = var14 << 9;
            if (arg2.field5745 == 1) {
                int var18 = arg2.field5751 * arg2.field5751;
                int var19 = (var11 >= arg2.field5922 ? var11 - arg2.field5922 : -var11 + arg2.field5922) << 9;
                int var20 = (arg2.field5933 <= var12 ? var12 - arg2.field5933 : -var12 + arg2.field5933) << 9;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field5889 * 2 * var21;
                if (var18 > var22) {
                    arg2.field5751 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field5751 -= var3.field5889;
                    if (arg2.field5751 < 0) {
                        arg2.field5751 = 0;
                    }
                } else if (arg2.field5751 < var17) {
                    arg2.field5751 += var3.field5889;
                    if (arg2.field5751 > var17) {
                        arg2.field5751 = var17;
                    }
                }
            } else if (var17 > arg2.field5751) {
                arg2.field5751 += var3.field5889;
                if (var17 < arg2.field5751) {
                    arg2.field5751 = var17;
                }
            } else if (arg2.field5751 > 0) {
                arg2.field5751 -= var3.field5889;
                if (arg2.field5751 < 0) {
                    arg2.field5751 = 0;
                }
            }
            var14 = arg2.field5751 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class309.field4289 = -1;
        } else {
            if (var9 < var11) {
                class422.field6094 |= 0x4;
                arg2.field5922 += var14;
                if (var11 < arg2.field5922) {
                    arg2.field5922 = var11;
                }
            } else if (var11 < var9) {
                class422.field6094 |= 0x8;
                arg2.field5922 -= var14;
                if (arg2.field5922 < var11) {
                    arg2.field5922 = var11;
                }
            }
            if (var14 >= 32) {
                class309.field4289 = 2;
            } else {
                class309.field4289 = var13;
            }
            if (var12 > var10) {
                class422.field6094 |= 0x1;
                arg2.field5933 += var14;
                if (arg2.field5933 > var12) {
                    arg2.field5933 = var12;
                }
            } else if (var12 < var10) {
                class422.field6094 |= 0x2;
                arg2.field5933 -= var14;
                if (var12 > arg2.field5933) {
                    arg2.field5933 = var12;
                }
            }
        }
        if (arg2.field5922 == var11 && arg2.field5933 == var12) {
            if (arg2.field5748 > 0) {
                arg2.field5748--;
            }
            arg2.field5745--;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lia;", line = 377)
    public final class589 method1919(int arg0, int arg1) {
        field4111++;
        class112 var3 = this.field4112;
        class589 var4;
        synchronized (this.field4112) {
            var4 = (class589) this.field4112.method992((long) arg1, arg0 - 148);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field4103;
        byte[] var6;
        synchronized (this.field4103) {
            var6 = this.field4103.method863(-1860, arg0, arg1);
        }
        class589 var7 = new class589();
        var7.field8038 = this;
        if (var6 != null) {
            var7.method3365(arg0 ^ 0xFFFFFFAA, new class215(var6));
        }
        class112 var8 = this.field4112;
        synchronized (this.field4112) {
            this.field4112.method991(var7, (long) arg1, (byte) -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 408)
    public final void method1920(int arg0) {
        class112 var2 = this.field4112;
        synchronized (this.field4112) {
            this.field4112.method999(arg0);
        }
        field4102++;
        class112 var3 = this.field4099;
        synchronized (this.field4099) {
            this.field4099.method999(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 423)
    public final void method1921(int arg0, int arg1) {
        field4107++;
        class112 var3 = this.field4112;
        synchronized (this.field4112) {
            this.field4112.method987(2, arg0);
            if (arg1 >= -22) {
                this.field4110 = null;
            }
        }
        class112 var4 = this.field4099;
        synchronized (this.field4099) {
            this.field4099.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 440)
    public static void method1922(int arg0) {
        field4101 = null;
        field4105 = null;
        if (arg0 != 11868) {
            field4109 = -94;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V", line = 471)
    public class293(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field4110 = arg3;
        this.field4103 = arg2;
        this.field4103.method860(0, 46);
    }
}
