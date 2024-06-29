import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class347 extends class107 {

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "Z")
    public boolean field4871;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Z")
    public boolean field4868;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "[S")
    public short[] field4860;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field4863 = 0;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "Z")
    public static boolean field4870 = false;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    private int field4869;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lfh;")
    public static final class389 method2222(int arg0, int arg1) {
        ++field4856;
        class190 var2 = class236.field3212;
        class389 var3;
        synchronized (class236.field3212) {
            var3 = (class389) class236.field3212.method1246((byte) -68, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class48.field733.method1920(class210.method1366(arg0, (byte) -128), false, class232.method1461(arg0, true));
            class389 var5 = new class389();
            var5.field5709 = arg0;
            if (var4 != null) {
                var5.method2548(new class371(var4), arg1 + 5170);
            }
            var5.method2540(arg1 ^ 18563);
            if (~var5.field5711 != 0) {
                var5.method2549(method2222(var5.field5711, 18682), method2222(var5.field5717, arg1), 82);
            }
            if (var5.field5654 != -1) {
                var5.method2547(0, method2222(var5.field5654, 18682), method2222(var5.field5670, 18682));
            }
            if (!class192.field2667 && var5.field5662) {
                var5.field5698 = false;
                var5.field5710 = class31.field492;
                var5.field5728 = null;
                var5.field5721 = 0;
                var5.field5720 = class441.field6378;
                var5.field5722 = class24.field328;
            }
            class190 var6 = class236.field3212;
            synchronized (class236.field3212) {
                if (arg1 != 18682) {
                    return null;
                } else {
                    class236.field3212.method1247((long) arg0, (byte) -78, var5);
                    return var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lrg;B)Lrg;")
    public static final class383 method2223(class383 arg0, byte arg1) {
        ++field4858;
        if (arg1 != 123) {
            method2222(85, -78);
        }
        class383 var2 = client.method1115(arg0);
        if (var2 == null) {
            var2 = arg0.field5508;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)V")
    public static final void method2224(int arg0, int arg1, int arg2, int arg3) {
        ++field4862;
        int var4 = class276.field3750 * arg1 >> 8;
        int var5 = -57 % ((-2 - arg3) / 41);
        if (~var4 != -1 && ~arg2 != 0) {
            class108.method729(false, false, class169.field2412, arg2, var4, 0);
            class1.field12 = true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
    private final void method2225(int arg0) {
        if (arg0 < 78) {
            this.field4866 = -88;
        }
        int var2 = this.field4867;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (~var2 != -13) {
                            if (~var2 != -14) {
                                if (~var2 != -11) {
                                    if (var2 != 11) {
                                        if (~var2 != -7) {
                                            if (var2 != 7) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (~var2 != -16) {
                                                                if (var2 == 16) {
                                                                    this.field4865 = 256;
                                                                    this.field4861 = 1792;
                                                                    this.field4866 = 1;
                                                                    this.field4869 = 8192;
                                                                } else {
                                                                    this.field4869 = 2048;
                                                                    this.field4861 = 0;
                                                                    this.field4866 = 0;
                                                                    this.field4865 = 2048;
                                                                }
                                                            } else {
                                                                this.field4861 = 1536;
                                                                this.field4869 = 4096;
                                                                this.field4865 = 512;
                                                                this.field4866 = 1;
                                                            }
                                                        } else {
                                                            this.field4865 = 768;
                                                            this.field4861 = 1280;
                                                            this.field4866 = 1;
                                                            this.field4869 = 2048;
                                                        }
                                                    } else {
                                                        this.field4866 = 3;
                                                        this.field4865 = 1024;
                                                        this.field4869 = 4096;
                                                        this.field4861 = 1024;
                                                    }
                                                } else {
                                                    this.field4861 = 1024;
                                                    this.field4866 = 3;
                                                    this.field4869 = 2048;
                                                    this.field4865 = 1024;
                                                }
                                            } else {
                                                this.field4869 = 4096;
                                                this.field4861 = 1280;
                                                this.field4865 = 768;
                                                this.field4866 = 3;
                                            }
                                        } else {
                                            this.field4861 = 1280;
                                            this.field4866 = 3;
                                            this.field4865 = 768;
                                            this.field4869 = 2048;
                                        }
                                    } else {
                                        this.field4865 = 512;
                                        this.field4861 = 1536;
                                        this.field4866 = 3;
                                        this.field4869 = 4096;
                                    }
                                } else {
                                    this.field4866 = 3;
                                    this.field4865 = 512;
                                    this.field4869 = 2048;
                                    this.field4861 = 1536;
                                }
                            } else {
                                this.field4861 = 0;
                                this.field4866 = 2;
                                this.field4865 = 2048;
                                this.field4869 = 8192;
                            }
                        } else {
                            this.field4866 = 2;
                            this.field4861 = 0;
                            this.field4865 = 2048;
                            this.field4869 = 2048;
                        }
                    } else {
                        this.field4865 = 2048;
                        this.field4869 = 8192;
                        this.field4861 = 0;
                        this.field4866 = 4;
                    }
                } else {
                    this.field4861 = 0;
                    this.field4865 = 2048;
                    this.field4869 = 2048;
                    this.field4866 = 4;
                }
            } else {
                this.field4861 = 0;
                this.field4866 = 1;
                this.field4865 = 2048;
                this.field4869 = 4096;
            }
        } else {
            this.field4869 = 2048;
            this.field4865 = 2048;
            this.field4861 = 0;
            this.field4866 = 1;
        }
        ++field4873;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V")
    public final void method2226(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field4866 = arg0;
        ++field4874;
        this.field4865 = arg3;
        if (arg2 != 17) {
            this.field4868 = true;
        }
        this.field4861 = arg1;
        this.field4869 = arg4;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I")
    public static final int method2227(int arg0, int arg1) {
        ++field4864;
        int var2 = 107 % ((arg0 - 63) / 44);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIZ)V")
    public final void method2228(byte arg0, int arg1, boolean arg2) {
        if (arg0 == 72) {
            ++field4859;
            int var4;
            if (arg2) {
                var4 = 2048;
            } else {
                int var5 = 2047 & this.field4869 * arg1 / 50 + this.field4872;
                int var6 = this.field4866;
                if (~var6 != -2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -3) {
                                if (~var6 == -6) {
                                    var4 = (var5 < 1024 ? var5 : -var5 + 2048) << 1;
                                } else {
                                    var4 = 2048;
                                }
                            } else {
                                var4 = var5;
                            }
                        } else {
                            var4 = var5 >> 10 << 11;
                        }
                    } else {
                        var4 = class229.field3058[var5] >> 1;
                    }
                } else {
                    var4 = (class362.field5083[var5 << 3] >> 5) + 1024;
                }
            }
            super.field1594 = (float) ((this.field4865 * var4 >> 11) + this.field4861) / 2048.0F;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    protected class347() {
        if (class229.field3058 == null) {
            class107.method724(8);
        }
        this.method2225(115);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Leb;)V")
    public class347(class371 arg0) {
        if (class229.field3058 == null) {
            class107.method724(8);
        }
        this.field4857 = arg0.method2429(0);
        this.field4871 = ~(16 & this.field4857) != -1;
        this.field4868 = ~(this.field4857 & 8) != -1;
        this.field4857 &= 7;
        super.field1583 = arg0.method2403((byte) 74);
        super.field1591 = arg0.method2403((byte) 101);
        super.field1588 = arg0.method2403((byte) 49);
        super.field1584 = arg0.method2429(0);
        int var2 = super.field1584 * 2 + 1;
        this.field4860 = new short[var2];
        for (int var3 = 0; var3 < this.field4860.length; ++var3) {
            short var5 = (short) arg0.method2403((byte) 109);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (var7 > -var6 + var2) {
                var7 = var2 - var6;
            }
            this.field4860[var3] = (short) class311.method1970(var6 << 8, var7);
        }
        super.field1584 = (super.field1584 << 7) + 64;
        if (class176.field2483 == null) {
            super.field1587 = class293.field4057[65535 & class77.method549(arg0.method2403((byte) 43), 127)];
        } else {
            super.field1587 = class176.field2483[arg0.method2403((byte) 94)];
        }
        int var4 = arg0.method2429(0);
        this.field4872 = (224 & var4) << 3;
        this.field4867 = var4 & 31;
        if (this.field4867 != 31) {
            this.method2225(116);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lqj;I)V")
    public static final void method2229(class296 arg0, int arg1) {
        class280.field3833 = arg0;
        ++field4855;
        if (arg1 != 224) {
            field4870 = false;
        }
    }
}
