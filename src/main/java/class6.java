import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class6 extends class92 {

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Z")
    public boolean field45;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "Z")
    public boolean field51;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[S")
    public short[] field60;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[J")
    public static long[] field42 = new long[32];

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field49 = -1;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "[Lhn;")
    public static class57[] field56 = new class57[128];

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lwo;")
    public static class285 field41;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Lwo;")
    public static class285 field58;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V", line = 3)
    public static final void method21(byte arg0) {
        ++field55;
        if (arg0 < 46) {
            field58 = null;
        }
        class365 var1 = class414.field5683;
        synchronized (class414.field5683) {
            class414.field5683.method2290(13831);
        }
        class365 var2 = class264.field3384;
        synchronized (class264.field3384) {
            class264.field3384.method2290(13831);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZZ)V", line = 23)
    public final void method22(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.field52 = 67;
        }
        ++field40;
        int var6;
        if (!arg2) {
            int var4 = 2047 & this.field53 - -(this.field48 * arg0 / 50);
            int var5 = this.field39;
            if (var5 != 1) {
                if (~var5 != -4) {
                    if (~var5 != -5) {
                        if (~var5 != -3) {
                            if (~var5 == -6) {
                                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
                            } else {
                                var6 = 2048;
                            }
                        } else {
                            var6 = var4;
                        }
                    } else {
                        var6 = var4 >> 10 << 11;
                    }
                } else {
                    var6 = class28.field316[var4] >> 1;
                }
            } else {
                var6 = (class363.field4927[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field1075 = (float) ((this.field43 * var6 >> 11) + this.field57) / 2048.0F;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V", line = 101)
    public static final void method23(byte arg0) {
        if (arg0 == -58) {
            if (!class267.field3454.method761()) {
                class373.method2338(114, class20.field220);
            } else {
                class394.method2442(arg0 + 66);
                class267.field3454.method693(class357.field4845);
                class11.method53(arg0 + 16084);
            }
            ++field59;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 131)
    public static final String[] method24(String[] arg0, int arg1) {
        ++field54;
        String[] var2 = new String[5];
        int var3 = -82 % ((arg1 - 86) / 40);
        for (int var4 = 0; var4 < 5; ++var4) {
            var2[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var2[var4] = var2[var4] + arg0[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 158)
    private final void method25(int arg0) {
        ++field46;
        int var2 = this.field47;
        if (var2 != 2) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (var2 != 13) {
                                if (~var2 != -11) {
                                    if (var2 != 11) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (~var2 != -9) {
                                                    if (var2 != 9) {
                                                        if (~var2 != -15) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field48 = 8192;
                                                                    this.field43 = 256;
                                                                    this.field57 = 1792;
                                                                    this.field39 = 1;
                                                                } else {
                                                                    this.field43 = 2048;
                                                                    this.field48 = 2048;
                                                                    this.field39 = 0;
                                                                    this.field57 = 0;
                                                                }
                                                            } else {
                                                                this.field39 = 1;
                                                                this.field43 = 512;
                                                                this.field57 = 1536;
                                                                this.field48 = 4096;
                                                            }
                                                        } else {
                                                            this.field43 = 768;
                                                            this.field57 = 1280;
                                                            this.field48 = 2048;
                                                            this.field39 = 1;
                                                        }
                                                    } else {
                                                        this.field43 = 1024;
                                                        this.field57 = 1024;
                                                        this.field48 = 4096;
                                                        this.field39 = 3;
                                                    }
                                                } else {
                                                    this.field57 = 1024;
                                                    this.field48 = 2048;
                                                    this.field39 = 3;
                                                    this.field43 = 1024;
                                                }
                                            } else {
                                                this.field57 = 1280;
                                                this.field48 = 4096;
                                                this.field39 = 3;
                                                this.field43 = 768;
                                            }
                                        } else {
                                            this.field43 = 768;
                                            this.field48 = 2048;
                                            this.field57 = 1280;
                                            this.field39 = 3;
                                        }
                                    } else {
                                        this.field57 = 1536;
                                        this.field48 = 4096;
                                        this.field39 = 3;
                                        this.field43 = 512;
                                    }
                                } else {
                                    this.field57 = 1536;
                                    this.field48 = 2048;
                                    this.field39 = 3;
                                    this.field43 = 512;
                                }
                            } else {
                                this.field57 = 0;
                                this.field43 = 2048;
                                this.field48 = 8192;
                                this.field39 = 2;
                            }
                        } else {
                            this.field48 = 2048;
                            this.field43 = 2048;
                            this.field57 = 0;
                            this.field39 = 2;
                        }
                    } else {
                        this.field57 = 0;
                        this.field43 = 2048;
                        this.field48 = 8192;
                        this.field39 = 4;
                    }
                } else {
                    this.field57 = 0;
                    this.field48 = 2048;
                    this.field39 = 4;
                    this.field43 = 2048;
                }
            } else {
                this.field39 = 1;
                this.field57 = 0;
                this.field48 = 4096;
                this.field43 = 2048;
            }
        } else {
            this.field48 = 2048;
            this.field39 = 1;
            this.field57 = 0;
            this.field43 = 2048;
        }
        if (arg0 >= -31) {
            this.method25(-18);
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V", line = 359)
    public static void method26(byte arg0) {
        if (arg0 < 111) {
            field41 = null;
        }
        field42 = null;
        field58 = null;
        field56 = null;
        field41 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V", line = 390)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field48 = arg0;
        this.field39 = arg2;
        this.field43 = arg1;
        ++field44;
        this.field57 = arg3;
        if (arg4 > -46) {
            method21((byte) 80);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Llh;", line = 406)
    public static final class89 method28(int arg0, int arg1) {
        ++field50;
        class365 var2 = class287.field3780;
        class89 var3;
        synchronized (class287.field3780) {
            var3 = (class89) class287.field3780.method2295((long) arg0, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class234.field3082.method1794(5860, 3, arg0);
            class89 var5 = new class89();
            if (var4 != null) {
                var5.method557(new class242(var4), 103);
            }
            class365 var6 = class287.field3780;
            synchronized (class287.field3780) {
                class287.field3780.method2294(var5, (byte) 21, (long) arg0);
            }
            if (arg1 < 100) {
                field58 = null;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 432)
    protected class6() {
        if (class28.field316 == null) {
            class101.method608((byte) -85);
        }
        this.method25(-87);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lbg;)V", line = 443)
    public class6(class242 arg0) {
        if (class28.field316 == null) {
            class101.method608((byte) -96);
        }
        this.field52 = arg0.method1563(-128);
        this.field45 = ~(16 & this.field52) != -1;
        this.field51 = ~(this.field52 & 8) != -1;
        this.field52 &= 7;
        super.field1073 = arg0.method1587((byte) -102);
        super.field1071 = arg0.method1587((byte) -102);
        super.field1072 = arg0.method1587((byte) -102);
        super.field1076 = arg0.method1563(-128);
        int var2 = super.field1076 * 2 + 1;
        this.field60 = new short[var2];
        for (int var3 = 0; ~this.field60.length < ~var3; ++var3) {
            short var5 = (short) arg0.method1587((byte) -102);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (var7 > -var6 + var2) {
                var7 = -var6 + var2;
            }
            this.field60[var3] = (short) class213.method1307(var6 << 8, var7);
        }
        super.field1076 = (super.field1076 << 7) + 64;
        if (class318.field4284 != null) {
            super.field1078 = class318.field4284[arg0.method1587((byte) -102)];
        } else {
            super.field1078 = class212.field2589[class80.method507(-82, arg0.method1587((byte) -102)) & 65535];
        }
        int var4 = arg0.method1563(-128);
        this.field53 = 1792 & var4 << 3;
        this.field47 = 31 & var4;
        if (~this.field47 != -32) {
            this.method25(-73);
        }
    }
}
