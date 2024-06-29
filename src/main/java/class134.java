import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class134 extends class8 {

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "Z")
    private boolean field2862 = false;

    @OriginalMember(owner = "client!o", name = "Gb", descriptor = "Z")
    private volatile boolean field2877 = false;

    @OriginalMember(owner = "client!o", name = "Lb", descriptor = "I")
    private int field2882 = -1;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "Lhb;")
    private class72 field2857;

    @OriginalMember(owner = "client!o", name = "Jb", descriptor = "I")
    private int field2880;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "Lhb;")
    private class72 field2856;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "Ldd;")
    public static class35 field2864 = class180.method1196((byte) -7, "");

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "Ldd;")
    public static class35 field2855 = field2864;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "Ldd;")
    public static class35 field2866 = class180.method1196((byte) 127, "null");

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "Ldd;")
    public static class35 field2867 = field2864;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "Ldd;")
    public static class35 field2858 = field2864;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Ldd;")
    public static class35 field2850 = class180.method1196((byte) -45, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "Ldd;")
    public static class35 field2851 = class180.method1196((byte) 127, "headicons_pk");

    @OriginalMember(owner = "client!o", name = "Bb", descriptor = "Ldd;")
    public static class35 field2872 = class180.method1196((byte) 127, ")1");

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!o", name = "Cb", descriptor = "Ldd;")
    public static class35 field2873 = field2864;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Ldd;")
    public static class35 field2849 = field2864;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "Ldd;")
    public static class35 field2852 = field2864;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!o", name = "Db", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!o", name = "Eb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!o", name = "Fb", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!o", name = "Ib", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "Lo;")
    public static class134 field2871;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "Lag;")
    public static class8 field2863;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[Z")
    private volatile boolean[] field2854;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBIZ[B)V")
    public final void method913(boolean arg0, byte arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field2878;
        if (arg3) {
            if (this.field2877) {
                throw new RuntimeException();
            }
            if (this.field2856 != null) {
                class118.method847(this.field2880, this.field2856, (byte) -116, arg4);
            }
            this.method64(false, arg4);
            this.method919((byte) 80);
        } else {
            arg4[arg4.length + -2] = (byte) (super.field145[arg2] >> 8);
            arg4[arg4.length - 1] = (byte) super.field145[arg2];
            if (this.field2857 != null) {
                class118.method847(arg2, this.field2857, (byte) -116, arg4);
                this.field2854[arg2] = true;
            }
            if (arg0) {
                super.field126[arg2] = class49.method442(37, false, arg4);
            }
        }
        if (arg1 < 33) {
            this.method59(-11, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I")
    public final int method914(int arg0) {
        ++field2874;
        if (this.field2877) {
            return 100;
        } else if (super.field126 != null) {
            return 99;
        } else {
            int var2 = class50.method443(this.field2880, 24289, arg0);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(IB)V")
    public final void method59(int arg0, byte arg1) {
        ++field2879;
        if (this.method42(arg0, 0)) {
            if (arg1 == 76) {
                class38.method374(1476680528, arg0, this.field2880);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)V")
    public final void method46(int arg0, int arg1) {
        ++field2881;
        if (this.method42(arg1, 0)) {
            if (arg0 == 255) {
                if (this.field2857 != null && this.field2854 != null && this.field2854[arg1]) {
                    class174.method1158(this, arg1, this.field2857, (byte) -74);
                } else {
                    class57.method501(arg1, (byte) 2, super.field129[arg1], this.field2880, true, (byte) 95, this);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
    public final int method53(int arg0, int arg1) {
        ++field2860;
        if (!this.method42(arg1, 0)) {
            return 0;
        } else {
            if (arg0 != 2) {
                field2850 = null;
            }
            if (super.field126[arg1] != null) {
                return 100;
            } else {
                return this.field2854[arg1] ? 100 : class50.method443(arg1, 24289, this.field2880);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILhb;ZI[B)V")
    public final void method915(int arg0, class72 arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field2861;
        if (arg0 >= -12) {
            this.field2882 = 72;
        }
        if (this.field2856 == arg1) {
            if (this.field2877) {
                throw new RuntimeException();
            } else if (arg4 == null) {
                class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
            } else {
                class166.field3362.reset();
                class166.field3362.update(arg4, 0, arg4.length);
                int var6 = (int) class166.field3362.getValue();
                if (~this.field2876 != ~var6) {
                    class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
                } else {
                    class26 var7;
                    try {
                        var7 = new class26(class121.method866((byte) -123, arg4));
                    } catch (RuntimeException var12) {
                        class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
                        return;
                    }
                    int var8 = var7.method221(-111);
                    if (var8 != 5 && ~var8 != -7) {
                        class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
                    } else {
                        int var9 = 0;
                        if (~var8 <= -7) {
                            var9 = var7.method240(8);
                        }
                        if (this.field2865 != var9) {
                            class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
                        } else {
                            this.method64(false, arg4);
                            this.method919((byte) 80);
                        }
                    }
                }
            }
        } else {
            if (!arg2 && this.field2882 == arg3) {
                this.field2877 = true;
            }
            if (arg4 != null && arg4.length > 2) {
                class166.field3362.reset();
                class166.field3362.update(arg4, 0, arg4.length + -2);
                int var10 = (int) class166.field3362.getValue();
                int var11 = (65280 & arg4[arg4.length + -2] << 8) + (arg4[arg4.length + -1] & 255);
                if (~super.field129[arg3] == ~var10 && super.field145[arg3] == var11) {
                    this.field2854[arg3] = true;
                    if (arg2) {
                        super.field126[arg3] = class49.method442(37, false, arg4);
                    }
                } else {
                    this.field2854[arg3] = false;
                    if (this.field2862 || arg2) {
                        class57.method501(arg3, (byte) 2, super.field129[arg3], this.field2880, arg2, (byte) 95, this);
                    }
                }
            } else {
                this.field2854[arg3] = false;
                if (this.field2862 || arg2) {
                    class57.method501(arg3, (byte) 2, super.field129[arg3], this.field2880, arg2, (byte) 95, this);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public static void method916(int arg0) {
        if (arg0 == 0) {
            field2867 = null;
            field2858 = null;
            field2855 = null;
            field2873 = null;
            field2849 = null;
            field2852 = null;
            field2866 = null;
            field2863 = null;
            field2851 = null;
            field2872 = null;
            field2871 = null;
            field2850 = null;
            field2864 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)V")
    public final void method917(int arg0, byte arg1, int arg2) {
        ++field2870;
        this.field2865 = arg2;
        this.field2876 = arg0;
        if (arg1 <= 78) {
            field2852 = null;
        }
        if (this.field2856 != null) {
            class174.method1158(this, this.field2880, this.field2856, (byte) -101);
        } else {
            class57.method501(this.field2880, (byte) 0, this.field2876, 255, true, (byte) 95, this);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lhb;Lhb;IZZZ)V")
    public class134(class72 arg0, class72 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2857 = arg0;
        this.field2862 = arg5;
        this.field2880 = arg2;
        this.field2856 = arg1;
        class4.method26(this, this.field2880, false);
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(II)V")
    public static final void method918(int arg0, int arg1) {
        if (~arg1 == 0 && !class181.field3697) {
            class19.method168((byte) -114);
        } else if (~arg1 != 0 && (class205.field4077 != arg1 || !class13.method117(109)) && class69.field1670 != 0 && !class181.field3697) {
            class157.method1052(0, 2, class69.field1670, false, arg1, true, class162.field3293);
        }
        if (arg0 != -31901) {
            method916(41);
        }
        class205.field4077 = arg1;
        ++field2869;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    private final void method919(byte arg0) {
        this.field2854 = new boolean[super.field126.length];
        for (int var2 = 0; this.field2854.length > var2; ++var2) {
            this.field2854[var2] = false;
        }
        ++field2875;
        if (arg0 != 80) {
            field2851 = null;
        }
        if (this.field2857 == null) {
            this.field2877 = true;
        } else {
            this.field2882 = -1;
            for (int var3 = 0; this.field2854.length > var3; ++var3) {
                if (super.field159[var3] > 0) {
                    class73.method582(var3, this, arg0 + -203, this.field2857);
                    this.field2882 = var3;
                }
            }
            if (~this.field2882 == 0) {
                this.field2877 = true;
            }
        }
    }
}
