import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class163 extends class37 {

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    private int field3305 = 1;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    private int field3300 = 0;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    private int field3308 = 0;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Ldd;")
    private static class35 field3311 = class180.method1196((byte) -67, "Loaded interfaces");

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Ldd;")
    private static class35 field3310 = class180.method1196((byte) -62, "purple:");

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Ldd;")
    public static class35 field3298 = field3311;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Ldd;")
    public static class35 field3312 = class180.method1196((byte) -64, "(R");

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "Ldd;")
    public static class35 field3302 = field3310;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Ldd;")
    public static class35 field3309 = field3310;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lfd;")
    public static class55 field3303;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[[Lfd;")
    public static class55[][] field3299;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)V")
    public static final void method1079(long arg0, int arg1) {
        ++field3314;
        if ((long) arg1 != arg0) {
            ++class130.field2796;
            class1.field11.method659(49, true);
            class1.field11.method239((byte) 114, arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field3313;
        class75.method591(4096);
        if (arg0) {
            this.field3308 = -29;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field3305 = arg2.method221(-127);
                }
            } else {
                this.field3300 = arg2.method221(arg1 ^ -78);
            }
        } else {
            this.field3308 = arg2.method221(-81);
        }
        ++field3307;
        if (arg1 != 1) {
            field3298 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(BI)V")
    public static final void method1080(byte arg0, int arg1) {
        ++field3306;
        class170.method1110((byte) 82);
        class25.method212(4168);
        if (arg0 <= 97) {
            method1082(14, (byte) -9);
        }
        int var2 = class111.method814(-126, arg1).field597;
        if (~var2 != -1) {
            int var3 = class115.field2557[arg1];
            if (var2 == 1) {
                class49.field1080 = var3;
                if (class49.field1080 == 1) {
                    class11.method78(0.9F);
                }
                if (class49.field1080 == 2) {
                    class11.method78(0.8F);
                }
                if (class49.field1080 == 3) {
                    class11.method78(0.7F);
                }
                if (class49.field1080 == 4) {
                    class11.method78(0.6F);
                }
                class90.method660((byte) 77);
            }
            if (~var2 == -4) {
                short var4 = 0;
                if (~var3 == -1) {
                    var4 = 255;
                }
                if (~var3 == -2) {
                    var4 = 192;
                }
                if (~var3 == -3) {
                    var4 = 128;
                }
                if (~var3 == -4) {
                    var4 = 64;
                }
                if (~var3 == -5) {
                    var4 = 0;
                }
                if (class69.field1670 != var4) {
                    if (~class69.field1670 == -1 && class205.field4077 != -1) {
                        class19.method173(class162.field3293, false, class205.field4077, (byte) 80, 0, var4);
                        class181.field3697 = false;
                    } else if (var4 != 0) {
                        class173.method1138(var4, false);
                    } else {
                        class19.method168((byte) -102);
                        class181.field3697 = false;
                    }
                    class69.field1670 = var4;
                }
            }
            if (~var2 == -11) {
                if (~var3 == -1) {
                    class25.field507 = 127;
                }
                if (var3 == 1) {
                    class25.field507 = 96;
                }
                if (~var3 == -3) {
                    class25.field507 = 64;
                }
                if (var3 == 3) {
                    class25.field507 = 32;
                }
                if (~var3 == -5) {
                    class25.field507 = 0;
                }
            }
            if (var2 == 4) {
                if (var3 == 0) {
                    class196.field3897 = 127;
                }
                if (~var3 == -2) {
                    class196.field3897 = 96;
                }
                if (var3 == 2) {
                    class196.field3897 = 64;
                }
                if (~var3 == -4) {
                    class196.field3897 = 32;
                }
                if (~var3 == -5) {
                    class196.field3897 = 0;
                }
            }
            if (~var2 == -6) {
                class210.field4161 = var3;
            }
            if (var2 == 9) {
                class110.field2433 = var3;
            }
            if (var2 == 6) {
                class61.field1505 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field3312 = null;
        field3299 = null;
        field3302 = null;
        if (arg0 != 2048) {
            field3299 = null;
        }
        field3310 = null;
        field3303 = null;
        field3311 = null;
        field3298 = null;
        field3309 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1082(int arg0, byte arg1) {
        ++field3301;
        if (~arg0 > -1) {
            return false;
        } else {
            int var2 = class165.field3340[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            if (var2 == 1007) {
                return true;
            } else {
                return arg1 != 46;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            field3303 = null;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        ++field3304;
        if (super.field816.field3661) {
            int var4 = class22.field450[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class72.field1719 > var6; ++var6) {
                int var7 = class118.field2622[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field3308 != -1) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) (var9 / 4096)) * 4096.0D);
                    var11 = (int) ((double) (this.field3305 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field3305;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field3300 == 0) {
                    var12 = class51.field1155[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field3300 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
