import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class227 extends class367 {

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Z")
    public boolean field2974;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Z")
    public boolean field2986;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "[S")
    public short[] field2983;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "[I")
    public static int[] field2979 = new int[1000];

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "F")
    public static float field2977;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Lvj;")
    public static class177 field2978;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Ln;")
    public static class25 field2988;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Llm;")
    public static class347 field2975;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[B")
    public static byte[] field2985;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method1314(boolean arg0) {
        field2988 = null;
        field2985 = null;
        if (!arg0) {
            field2978 = null;
            field2975 = null;
            field2979 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBI)V")
    public final void method1315(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == 17) {
            this.field2982 = arg2;
            ++field2991;
            this.field2993 = arg4;
            this.field2992 = arg1;
            this.field2994 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Llm;ILlm;)V")
    public static final void method1316(class347 arg0, int arg1, class347 arg2) {
        class126.field1766 = arg2;
        if (arg1 == 1280) {
            ++field2984;
            class388.field5602 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    private final void method1317(int arg0) {
        ++field2976;
        int var2 = this.field2989;
        if (var2 != 2) {
            if (var2 != 3) {
                if (var2 != 4) {
                    if (var2 != 5) {
                        if (~var2 != -13) {
                            if (var2 != 13) {
                                if (var2 != 10) {
                                    if (var2 != 11) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (~var2 != -9) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field2982 = 1792;
                                                                    this.field2994 = 8192;
                                                                    this.field2992 = 1;
                                                                    this.field2993 = 256;
                                                                } else {
                                                                    this.field2993 = 2048;
                                                                    this.field2982 = 0;
                                                                    this.field2994 = 2048;
                                                                    this.field2992 = 0;
                                                                }
                                                            } else {
                                                                this.field2982 = 1536;
                                                                this.field2993 = 512;
                                                                this.field2994 = 4096;
                                                                this.field2992 = 1;
                                                            }
                                                        } else {
                                                            this.field2993 = 768;
                                                            this.field2994 = 2048;
                                                            this.field2992 = 1;
                                                            this.field2982 = 1280;
                                                        }
                                                    } else {
                                                        this.field2993 = 1024;
                                                        this.field2994 = 4096;
                                                        this.field2992 = 3;
                                                        this.field2982 = 1024;
                                                    }
                                                } else {
                                                    this.field2993 = 1024;
                                                    this.field2992 = 3;
                                                    this.field2994 = 2048;
                                                    this.field2982 = 1024;
                                                }
                                            } else {
                                                this.field2993 = 768;
                                                this.field2992 = 3;
                                                this.field2982 = 1280;
                                                this.field2994 = 4096;
                                            }
                                        } else {
                                            this.field2993 = 768;
                                            this.field2982 = 1280;
                                            this.field2994 = 2048;
                                            this.field2992 = 3;
                                        }
                                    } else {
                                        this.field2982 = 1536;
                                        this.field2994 = 4096;
                                        this.field2993 = 512;
                                        this.field2992 = 3;
                                    }
                                } else {
                                    this.field2982 = 1536;
                                    this.field2992 = 3;
                                    this.field2994 = 2048;
                                    this.field2993 = 512;
                                }
                            } else {
                                this.field2994 = 8192;
                                this.field2982 = 0;
                                this.field2993 = 2048;
                                this.field2992 = 2;
                            }
                        } else {
                            this.field2993 = 2048;
                            this.field2994 = 2048;
                            this.field2992 = 2;
                            this.field2982 = 0;
                        }
                    } else {
                        this.field2993 = 2048;
                        this.field2994 = 8192;
                        this.field2982 = 0;
                        this.field2992 = 4;
                    }
                } else {
                    this.field2982 = 0;
                    this.field2993 = 2048;
                    this.field2994 = 2048;
                    this.field2992 = 4;
                }
            } else {
                this.field2993 = 2048;
                this.field2994 = 4096;
                this.field2992 = 1;
                this.field2982 = 0;
            }
        } else {
            this.field2992 = 1;
            this.field2994 = 2048;
            this.field2982 = 0;
            this.field2993 = 2048;
        }
        if (arg0 != 504) {
            this.method1317(-78);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
    public final void method1318(boolean arg0, int arg1, int arg2) {
        if (arg2 != -1922) {
            method1314(false);
        }
        ++field2990;
        int var6;
        if (!arg0) {
            int var4 = 2047 & this.field2994 * arg1 / 50 + this.field2980;
            int var5 = this.field2992;
            if (var5 != 1) {
                if (var5 != 3) {
                    if (var5 != 4) {
                        if (var5 != 2) {
                            if (var5 == 5) {
                                var6 = (~var4 <= -1025 ? -var4 + 2048 : var4) << 1;
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
                    var6 = class27.field381[var4] >> 1;
                }
            } else {
                var6 = (class117.field1644[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field5299 = (float) ((this.field2993 * var6 >> 11) + this.field2982) / 2048.0F;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    protected class227() {
        if (class27.field381 == null) {
            class7.method51((byte) 75);
        }
        this.method1317(504);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lnj;)V")
    public class227(class228 arg0) {
        if (class27.field381 == null) {
            class7.method51((byte) 75);
        }
        this.field2987 = arg0.method1348(-90);
        this.field2974 = (8 & this.field2987) != 0;
        this.field2986 = ~(16 & this.field2987) != -1;
        this.field2987 &= 7;
        super.field5308 = arg0.method1343(255);
        super.field5310 = arg0.method1343(255);
        super.field5307 = arg0.method1343(255);
        super.field5303 = arg0.method1348(-126);
        int var2 = super.field5303 * 2 + 1;
        this.field2983 = new short[var2];
        for (int var3 = 0; ~this.field2983.length < ~var3; ++var3) {
            short var5 = (short) arg0.method1343(255);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (var7 > -var6 + var2) {
                var7 = -var6 + var2;
            }
            this.field2983[var3] = (short) class351.method2313(var7, var6 << 8);
        }
        super.field5303 = (super.field5303 << 7) + 64;
        if (class291.field4168 == null) {
            super.field5309 = class349.field5050[class62.method434(arg0.method1343(255), 2194) & 65535];
        } else {
            super.field5309 = class291.field4168[arg0.method1343(255)];
        }
        int var4 = arg0.method1348(-117);
        this.field2980 = (var4 & 224) << 3;
        this.field2989 = var4 & 31;
        if (this.field2989 != 31) {
            this.method1317(504);
        }
    }
}
