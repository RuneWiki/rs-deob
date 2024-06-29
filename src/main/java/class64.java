import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class64 extends class16 {

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Z")
    public boolean field960;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
    public short[] field953;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "[Ld;")
    public static class9[] field962 = new class9[4];

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field966 = new Random();

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
    public static int[] field967 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 18)
    private final void method560(byte arg0) {
        ++field955;
        if (arg0 >= 72) {
            int var2 = this.field965;
            if (var2 != 2) {
                if (var2 != 3) {
                    if (var2 != 4) {
                        if (~var2 != -6) {
                            if (var2 != 12) {
                                if (~var2 != -14) {
                                    if (~var2 != -11) {
                                        if (var2 != 11) {
                                            if (~var2 != -7) {
                                                if (~var2 != -8) {
                                                    if (~var2 != -9) {
                                                        if (var2 != 9) {
                                                            if (~var2 != -15) {
                                                                if (var2 != 15) {
                                                                    if (~var2 == -17) {
                                                                        this.field952 = 256;
                                                                        this.field956 = 1792;
                                                                        this.field958 = 1;
                                                                        this.field954 = 8192;
                                                                    } else {
                                                                        this.field958 = 0;
                                                                        this.field956 = 0;
                                                                        this.field952 = 2048;
                                                                        this.field954 = 2048;
                                                                    }
                                                                } else {
                                                                    this.field954 = 4096;
                                                                    this.field958 = 1;
                                                                    this.field952 = 512;
                                                                    this.field956 = 1536;
                                                                }
                                                            } else {
                                                                this.field952 = 768;
                                                                this.field954 = 2048;
                                                                this.field956 = 1280;
                                                                this.field958 = 1;
                                                            }
                                                        } else {
                                                            this.field954 = 4096;
                                                            this.field958 = 3;
                                                            this.field952 = 1024;
                                                            this.field956 = 1024;
                                                        }
                                                    } else {
                                                        this.field958 = 3;
                                                        this.field956 = 1024;
                                                        this.field952 = 1024;
                                                        this.field954 = 2048;
                                                    }
                                                } else {
                                                    this.field952 = 768;
                                                    this.field956 = 1280;
                                                    this.field954 = 4096;
                                                    this.field958 = 3;
                                                }
                                            } else {
                                                this.field956 = 1280;
                                                this.field958 = 3;
                                                this.field952 = 768;
                                                this.field954 = 2048;
                                            }
                                        } else {
                                            this.field954 = 4096;
                                            this.field958 = 3;
                                            this.field952 = 512;
                                            this.field956 = 1536;
                                        }
                                    } else {
                                        this.field956 = 1536;
                                        this.field958 = 3;
                                        this.field952 = 512;
                                        this.field954 = 2048;
                                    }
                                } else {
                                    this.field952 = 2048;
                                    this.field954 = 8192;
                                    this.field958 = 2;
                                    this.field956 = 0;
                                }
                            } else {
                                this.field954 = 2048;
                                this.field956 = 0;
                                this.field958 = 2;
                                this.field952 = 2048;
                            }
                        } else {
                            this.field952 = 2048;
                            this.field954 = 8192;
                            this.field956 = 0;
                            this.field958 = 4;
                        }
                    } else {
                        this.field956 = 0;
                        this.field954 = 2048;
                        this.field958 = 4;
                        this.field952 = 2048;
                    }
                } else {
                    this.field952 = 2048;
                    this.field954 = 4096;
                    this.field958 = 1;
                    this.field956 = 0;
                }
            } else {
                this.field952 = 2048;
                this.field954 = 2048;
                this.field956 = 0;
                this.field958 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 218)
    public static void method561(int arg0) {
        field967 = null;
        field962 = null;
        if (arg0 != 65535) {
            field964 = 96;
        }
        field966 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZB)V", line = 230)
    public final void method562(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 79) {
            this.method562(-123, false, (byte) 21);
        }
        ++field959;
        int var6;
        if (!arg1) {
            int var4 = 2047 & this.field963 - -(this.field954 * arg0 / 50);
            int var5 = this.field958;
            if (var5 != 1) {
                if (~var5 != -4) {
                    if (~var5 != -5) {
                        if (~var5 != -3) {
                            if (var5 == 5) {
                                var6 = (var4 >= 1024 ? -var4 + 2048 : var4) << 1;
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
                    var6 = class118.field1537[var4] >> 1;
                }
            } else {
                var6 = (class240.field3364[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field270 = (float) (this.field956 - -(this.field952 * var6 >> 11)) / 2048.0F;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V", line = 305)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field952 = arg2;
        this.field956 = arg1;
        if (arg0 != 4) {
            this.field960 = true;
        }
        ++field961;
        this.field958 = arg4;
        this.field954 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 341)
    protected class64() {
        if (class118.field1537 == null) {
            class92.method743((byte) 98);
        }
        this.method560((byte) 127);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfb;)V", line = 352)
    public class64(class341 arg0) {
        if (class118.field1537 == null) {
            class92.method743((byte) 81);
        }
        this.field957 = arg0.method2233((byte) 104);
        this.field968 = (8 & this.field957) != 0;
        this.field960 = (this.field957 & 16) != 0;
        this.field957 &= 7;
        super.field264 = arg0.method2239(-1076227960);
        super.field269 = arg0.method2239(-1076227960);
        super.field272 = arg0.method2239(-1076227960);
        super.field263 = arg0.method2233((byte) 104);
        int var2 = super.field263 * 2 - -1;
        this.field953 = new short[var2];
        for (int var3 = 0; var3 < this.field953.length; ++var3) {
            short var5 = (short) arg0.method2239(-1076227960);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (~var7 < ~(var2 - var6)) {
                var7 = -var6 + var2;
            }
            this.field953[var3] = (short) class258.method1708(var7, var6 << 8);
        }
        super.field263 = (super.field263 << 7) - -64;
        if (class422.field6127 != null) {
            super.field268 = class422.field6127[arg0.method2239(-1076227960)];
        } else {
            super.field268 = class72.field1019[class357.method2347((byte) 87, arg0.method2239(-1076227960)) & 65535];
        }
        int var4 = arg0.method2233((byte) 104);
        this.field965 = 31 & var4;
        this.field963 = 1792 & var4 << 3;
        if (this.field965 != 31) {
            this.method560((byte) 116);
        }
    }
}
