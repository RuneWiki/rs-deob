import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class208 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public static int[] field3226 = new int[200];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Lmm;", line = 22)
    public final class256 method1388(byte arg0) {
        class256 var2 = (class256) class205.field3200.method1989((long) this.field3231, (byte) 121);
        field3229++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 95) {
            class256 var3 = class8.method48(class249.field4054, 0, this.field3231, (byte) 39);
            if (var3 != null) {
                class205.field3200.method1978((byte) -87, var3, (long) this.field3231);
            }
            return var3;
        } else {
            return (class256) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLfe;)V", line = 46)
    public static final void method1389(byte arg0, class241 arg1) {
        field3227++;
        class236 var2 = arg1.method1656(false);
        arg1.field3901 = var2.field3751;
        if (arg0 >= -5) {
            field3226 = (int[]) null;
        }
        if (arg1.field3959 == 0) {
            arg1.field3967 = 0;
            return;
        }
        if (arg1.field3908 != -1 && arg1.field3971 == 0) {
            class249 var3 = client.method1731(arg1.field3908, (byte) -20);
            if (arg1.field3954 > 0 && var3.field4071 == 0) {
                arg1.field3967++;
                return;
            }
            if (arg1.field3954 <= 0 && var3.field4050 == 0) {
                arg1.field3967++;
                return;
            }
        }
        int var4 = arg1.field3962;
        int var5 = arg1.field3972;
        int var6 = arg1.field3904[arg1.field3959 - 1] * 128 + (arg1.method1078((byte) 114) * 64);
        int var7 = arg1.field3890[arg1.field3959 - 1] * 128 + (arg1.method1078((byte) 114) * 64);
        if ((var6 - var4) > 256 || var6 - var4 < -256 || (var7 - var5) > 256 || var7 - var5 < -256) {
            arg1.field3962 = var6;
            arg1.field3972 = var7;
            return;
        }
        if (var6 <= var4) {
            if (var4 <= var6) {
                if (var7 > var5) {
                    arg1.field3946 = 1024;
                } else if (var5 > var7) {
                    arg1.field3946 = 0;
                }
            } else if (var7 > var5) {
                arg1.field3946 = 768;
            } else if (var7 < var5) {
                arg1.field3946 = 256;
            } else {
                arg1.field3946 = 512;
            }
        } else if (var7 > var5) {
            arg1.field3946 = 1280;
        } else if (var5 > var7) {
            arg1.field3946 = 1792;
        } else {
            arg1.field3946 = 1536;
        }
        int var8 = arg1.field3946 - arg1.field3922 & 0x7FF;
        int var9 = var2.field3776;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        boolean var10 = true;
        byte var11 = 1;
        if (var8 >= -256 && var8 <= 256) {
            var9 = var2.field3768;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = var2.field3747;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = var2.field3777;
        }
        int var12 = 4;
        if (var9 == -1) {
            var9 = var2.field3768;
        }
        arg1.field3901 = var9;
        if (arg1 instanceof class324) {
            var10 = ((class324) arg1).field5565.field2910;
        }
        if (var10) {
            if (arg1.field3946 != arg1.field3922 && arg1.field3909 == -1 && arg1.field3916 != 0) {
                var12 = 2;
            }
            if (arg1.field3959 > 2) {
                var12 = 6;
            }
            if (arg1.field3959 > 3) {
                var12 = 8;
            }
            if (arg1.field3967 > 0 && arg1.field3959 > 1) {
                var12 = 8;
                arg1.field3967--;
            }
        } else {
            if (arg1.field3959 > 1) {
                var12 = 6;
            }
            if (arg1.field3959 > 2) {
                var12 = 8;
            }
            if (arg1.field3967 > 0 && arg1.field3959 > 1) {
                arg1.field3967--;
                var12 = 8;
            }
        }
        if (arg1.field3932[arg1.field3959 - 1] == 2) {
            var12 <<= 0x1;
            var11 = 2;
        } else if (arg1.field3932[arg1.field3959 - 1] == 0) {
            var11 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var2.field3780 == -1) {
            if (var2.field3786 != -1 && var11 == 0) {
                if (arg1.field3901 == var2.field3776 && var2.field3756 != -1) {
                    arg1.field3901 = var2.field3756;
                } else if (arg1.field3901 == var2.field3777 && var2.field3794 != -1) {
                    arg1.field3901 = var2.field3794;
                } else if (arg1.field3901 == var2.field3747 && var2.field3765 != -1) {
                    arg1.field3901 = var2.field3765;
                } else {
                    arg1.field3901 = var2.field3786;
                }
            }
        } else if (arg1.field3901 == var2.field3776 && var2.field3773 != -1) {
            arg1.field3901 = var2.field3773;
        } else if (arg1.field3901 == var2.field3777 && var2.field3757 != -1) {
            arg1.field3901 = var2.field3757;
        } else if (arg1.field3901 == var2.field3747 && var2.field3760 != -1) {
            arg1.field3901 = var2.field3760;
        } else {
            arg1.field3901 = var2.field3780;
        }
        if (var2.field3742 != -1) {
            int var13 = var12 << 7;
            if (arg1.field3959 == 1) {
                int var14 = (var6 >= arg1.field3962 ? var6 - arg1.field3962 : -var6 + arg1.field3962) << 7;
                int var15 = arg1.field3893 * arg1.field3893;
                int var16 = (var7 < arg1.field3972 ? arg1.field3972 - var7 : -arg1.field3972 + var7) << 7;
                int var17 = var14 > var16 ? var14 : var16;
                int var18 = var2.field3742 * 2 * var17;
                if (var18 < var15) {
                    arg1.field3893 /= 2;
                } else if (var17 < (var15 / 2)) {
                    arg1.field3893 -= var2.field3742;
                    if (arg1.field3893 < 0) {
                        arg1.field3893 = 0;
                    }
                } else if (arg1.field3893 < var13) {
                    arg1.field3893 += var2.field3742;
                    if (arg1.field3893 > var13) {
                        arg1.field3893 = var13;
                    }
                }
            } else if (var13 > arg1.field3893) {
                arg1.field3893 += var2.field3742;
                if (var13 < arg1.field3893) {
                    arg1.field3893 = var13;
                }
            } else if (arg1.field3893 > 0) {
                arg1.field3893 -= var2.field3742;
                if (arg1.field3893 < 0) {
                    arg1.field3893 = 0;
                }
            }
            var12 = arg1.field3893 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var4 < var6) {
            arg1.field3962 += var12;
            if (var6 < arg1.field3962) {
                arg1.field3962 = var6;
            }
        } else if (var4 > var6) {
            arg1.field3962 -= var12;
            if (var6 > arg1.field3962) {
                arg1.field3962 = var6;
            }
        }
        if (var5 < var7) {
            arg1.field3972 += var12;
            if (arg1.field3972 > var7) {
                arg1.field3972 = var7;
            }
        } else if (var7 < var5) {
            arg1.field3972 -= var12;
            if (var7 > arg1.field3972) {
                arg1.field3972 = var7;
            }
        }
        if (arg1.field3962 == var6 && arg1.field3972 == var7) {
            arg1.field3959--;
            if (arg1.field3954 > 0) {
                arg1.field3954--;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 378)
    public static void method1390(byte arg0) {
        field3226 = null;
        if (arg0 != -118) {
            field3226 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwa;IB)V", line = 390)
    public final void method1391(class82 arg0, int arg1, byte arg2) {
        field3230++;
        if (arg2 < 75) {
            this.method1391((class82) null, -111, (byte) 47);
        }
        while (true) {
            int var4 = arg0.method642((byte) -89);
            if (var4 == 0) {
                return;
            }
            this.method1392(-18426, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILwa;)V", line = 411)
    private final void method1392(int arg0, int arg1, int arg2, class82 arg3) {
        if (arg0 != -18426) {
            this.field3225 = -82;
        }
        if (arg2 == 1) {
            this.field3231 = arg3.method576(1);
        } else if (arg2 == 2) {
            this.field3225 = arg3.method642((byte) -80);
            this.field3223 = arg3.method642((byte) -109);
        }
        field3228++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I", line = 435)
    public static final int method1393(int arg0, byte arg1) {
        int var2 = 91 / ((arg1 - 28) / 39);
        int var3 = arg0 & 0x3F;
        int var4 = (arg0 & 0xD9) >> 6;
        field3233++;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I", line = 487)
    public static final int method1394(int arg0) {
        field3232++;
        if (arg0 != 6098) {
            method1389((byte) -98, (class241) null);
        }
        return 2;
    }
}
