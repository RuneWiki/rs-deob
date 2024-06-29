import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class585 {

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    private int field8302 = 65000;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lnh;")
    private class680 field8295 = null;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lnh;")
    private class680 field8304 = null;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    private int field8301;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Z")
    public static boolean field8296 = false;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lsb;")
    public static class305 field8303 = new class305(83, 8);

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Luk;")
    public static class476 field8307;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZI[B)Z")
    private final boolean method3306(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field8299++;
        class680 var6 = this.field8304;
        synchronized (this.field8304) {
            try {
                int var7;
                if (arg2) {
                    if (((long) (arg0 * 6 + 6)) > this.field8295.method3775(false)) {
                        return false;
                    }
                    this.field8295.method3776((byte) 106, (long) (arg0 * 6));
                    this.field8295.method3769(0, 6, class508.field7302, -1);
                    var7 = ((class508.field7302[3] & 0xFF) << 16) + (class508.field7302[4] & 0xFF << 8) + (class508.field7302[5] & 0xFF);
                    if (var7 <= 0 || this.field8304.method3775(false) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field8304.method3775(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class508.field7302[5] = (byte) var7;
                class508.field7302[4] = (byte) (var7 >> 8);
                class508.field7302[3] = (byte) (var7 >> 16);
                class508.field7302[1] = (byte) (arg3 >> 8);
                class508.field7302[2] = (byte) arg3;
                class508.field7302[0] = (byte) (arg3 >> 16);
                this.field8295.method3776((byte) 106, (long) (arg0 * 6));
                this.field8295.method3773(0, class508.field7302, 6, 80);
                int var10 = 0;
                int var11 = 0;
                int var12 = -80 % ((-arg1 - 88) / 37);
                while (arg3 > var10) {
                    int var13 = 0;
                    if (arg2) {
                        label105: {
                            this.field8304.method3776((byte) 106, (long) (var7 * 520));
                            try {
                                this.field8304.method3769(0, 8, class508.field7302, -1);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = (class508.field7302[0] & 0xFF << 8) + (class508.field7302[1] & 0xFF);
                            var13 = (class508.field7302[4] & 0xFF << 16) - (-((class508.field7302[5] & 0xFF) << 8) - (class508.field7302[6] & 0xFF));
                            int var15 = ((class508.field7302[2] & 0xFF) << 8) + (class508.field7302[3] & 0xFF);
                            int var16 = class508.field7302[7] & 0xFF;
                            if (arg0 == var14 && var11 == var15 && this.field8301 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field8304.method3775(false) / 520L) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field8304.method3775(false) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if ((arg3 - var10) <= 512) {
                        var13 = 0;
                    }
                    class508.field7302[3] = (byte) var11;
                    class508.field7302[2] = (byte) (var11 >> 8);
                    class508.field7302[1] = (byte) arg0;
                    class508.field7302[0] = (byte) (arg0 >> 8);
                    class508.field7302[4] = (byte) (var13 >> 16);
                    class508.field7302[6] = (byte) var13;
                    class508.field7302[7] = (byte) this.field8301;
                    class508.field7302[5] = (byte) (var13 >> 8);
                    this.field8304.method3776((byte) 106, (long) (var7 * 520));
                    this.field8304.method3773(0, class508.field7302, 8, -17);
                    int var19 = arg3 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field8304.method3773(var10, arg4, var19, -119);
                    var11++;
                    var7 = var13;
                    var10 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BBII)Z")
    public final boolean method3307(byte[] arg0, byte arg1, int arg2, int arg3) {
        field8298++;
        class680 var5 = this.field8304;
        synchronized (this.field8304) {
            if (arg1 >= -117) {
                this.field8304 = null;
            }
            if (arg3 < 0 || arg3 > this.field8302) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3306(arg2, -26, true, arg3, arg0);
            if (!var6) {
                var6 = this.method3306(arg2, -128, false, arg3, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
    public static final void method3308(int arg0, int arg1) {
        field8306++;
        if (class421.field5601 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class463.field6589 == null) {
                class170.method927(class465.field6648, class445.field6273, class79.field803, -1);
            } else {
                class376.method2178((byte) -59, class445.field6273);
            }
        }
        if (arg0 != 13 && class168.field1884 != null) {
            class168.field1884.method1509(0);
            class168.field1884 = null;
        }
        if (arg0 == 3) {
            class389.method2215(arg1 - 22723, class213.field2598 != class209.field2466);
        }
        if (arg0 == 7) {
            class415.method2334(class246.field3035 != class209.field2466, false);
        }
        if (arg0 == 5) {
            if (class463.field6589 == null) {
                class351.method2081(class79.field803, class465.field6648, -1);
            } else {
                class674.method3724((byte) -30);
            }
        } else if (arg0 == 6) {
            if (class463.field6589 == null) {
                class170.method927(class465.field6648, class445.field6273, class79.field803, -1);
            } else {
                class376.method2178((byte) -127, class445.field6273);
            }
        } else if (arg0 == 9) {
            if (class463.field6589 == null) {
                class170.method927(class465.field6648, class445.field6273, class79.field803, arg1 ^ 0xFFFFA734);
            } else {
                class376.method2178((byte) -109, class445.field6273);
            }
        } else if (arg0 == 12) {
            if (class463.field6589 == null) {
                class351.method2081(class79.field803, class465.field6648, -1);
            } else {
                class674.method3724((byte) -30);
            }
        }
        if (class152.method826((byte) 117, class421.field5601)) {
            class388.field5257.field9837 = 2;
            class662.field9281.field9837 = 2;
            class240.field2973.field9837 = 2;
            class364.field4874.field9837 = 2;
            class483.field6974.field9837 = 2;
            class196.field2269.field9837 = 2;
            class671.field9346.field9837 = 2;
        }
        if (class152.method826((byte) 117, arg0)) {
            class616.field8680 = 1;
            class404.field5407 = 0;
            class361.field4847 = 0;
            class401.field5391 = 1;
            class129.field1448 = 0;
            class275.method1614(true, -31157);
            class388.field5257.field9837 = 1;
            class662.field9281.field9837 = 1;
            class240.field2973.field9837 = 1;
            class364.field4874.field9837 = 1;
            class483.field6974.field9837 = 1;
            class196.field2269.field9837 = 1;
            class671.field9346.field9837 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class285.method1660(-96);
        }
        if (arg1 != 22731) {
            method3308(-113, 99);
        }
        boolean var2 = arg0 == 2 || class441.method2549(arg1 ^ 0xFFFFA755, arg0) || class2.method12(arg0, arg1 - 11976);
        boolean var3 = class421.field5601 == 2 || class441.method2549(-89, class421.field5601) || class2.method12(class421.field5601, 10755);
        if (var2 != var3) {
            if (var2) {
                class331.field4169 = class699.field9802;
                if (class639.field9075.field6767 == 0) {
                    class615.method3421(2, (byte) 125);
                } else {
                    class521.method2957(class536.field7504, -37, 0, class699.field9802, false, class639.field9075.field6767, 2);
                }
                class510.field7323.method892(-108, false);
            } else {
                class615.method3421(2, (byte) 121);
                class510.field7323.method892(arg1 ^ 0xFFFFA758, true);
            }
        }
        if (class152.method826((byte) 117, arg0) || arg0 == 13) {
            class701.field9813.method1011();
        }
        class421.field5601 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8305++;
        return "Cache:" + this.field8301;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)[B")
    public final byte[] method3309(int arg0, int arg1) {
        field8297++;
        class680 var3 = this.field8304;
        synchronized (this.field8304) {
            try {
                if (this.field8295.method3775(false) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field8295.method3776((byte) 106, (long) (arg0 * 6));
                this.field8295.method3769(0, 6, class508.field7302, arg1 + 21014);
                int var5 = (class508.field7302[0] & 0xFF << 16) + (class508.field7302[1] & 0xFF << 8) + (class508.field7302[2] & 0xFF);
                int var6 = (class508.field7302[3] & 0xFF << 16) + (class508.field7302[4] & 0xFF << 8) + (class508.field7302[5] & 0xFF);
                if (var5 < 0 || this.field8302 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field8304.method3775(false) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field8304.method3776((byte) 106, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field8304.method3769(0, var13 + 8, class508.field7302, -1);
                        int var14 = ((class508.field7302[0] & 0xFF) << 8) + (class508.field7302[1] & 0xFF);
                        int var15 = (class508.field7302[2] & 0xFF << 8) + (class508.field7302[3] & 0xFF);
                        int var16 = ((class508.field7302[4] & 0xFF) << 16) + ((class508.field7302[5] & 0xFF) << 8) + (class508.field7302[6] & 0xFF);
                        int var17 = class508.field7302[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field8301 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field8304.method3775(false) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class508.field7302[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg1 == -21015) {
                        return var9;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method3310(int arg0) {
        if (arg0 != 1) {
            field8307 = null;
        }
        field8303 = null;
        field8307 = null;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILnh;Lnh;I)V")
    public class585(int arg0, class680 arg1, class680 arg2, int arg3) {
        this.field8295 = arg2;
        this.field8301 = arg0;
        this.field8304 = arg1;
        this.field8302 = arg3;
    }
}
