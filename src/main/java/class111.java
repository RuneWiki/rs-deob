import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class111 extends class203 {

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    private final int field1936;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    private final int field1938;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    private final int field1939;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    private final int field1933;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Ljd;")
    public static class85 field1937 = class221.method1499(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -68);

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lwe;")
    public static class15 field1935 = new class15();

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Ljd;")
    public static class85 field1944 = class221.method1499("3D)2Softwarebibliothek gestartet)3", (byte) 88);

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field1943 = 0;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "[Lme;")
    public static class213[] field1946 = new class213[5000];

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Z")
    public static volatile boolean field1948 = true;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "Ljf;")
    public static class62 field1947;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public final void method739(int arg0, int arg1, int arg2) {
        if (arg0 != 20241) {
            method758((byte) -128);
        }
        ++field1950;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method757(byte arg0) {
        field1947 = null;
        field1937 = null;
        if (arg0 == -72) {
            field1946 = null;
            field1935 = null;
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static final void method758(byte arg0) {
        ++field1940;
        if (arg0 > -46) {
            field1948 = false;
        }
        class6.field74.method1262(17244);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIIIII)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1936 = arg1;
        this.field1938 = arg0;
        this.field1939 = arg3;
        this.field1933 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z")
    public static final boolean method759(byte arg0) {
        ++field1932;
        if (~class268.field4765 != -1) {
            try {
                class39.field610.method580(true, class107.field1882.field1478);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 > -91) {
            field1946 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)V")
    public final void method744(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1938 * arg2 >> 12;
        ++field1942;
        int var5 = this.field1936 * arg1 >> 12;
        if (!arg0) {
            method758((byte) 39);
        }
        int var6 = this.field1933 * arg2 >> 12;
        int var7 = this.field1939 * arg1 >> 12;
        class142.method936(super.field3536, super.field3539, var7, super.field3550, (byte) 99, var6, var4, var5);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)V")
    public final void method742(int arg0, byte arg1, int arg2) {
        ++field1931;
        int var4 = this.field1939 * arg0 >> 12;
        int var5 = this.field1933 * arg2 >> 12;
        if (arg1 != -53) {
            this.method742(78, (byte) -110, -108);
        }
        int var6 = this.field1936 * arg0 >> 12;
        int var7 = this.field1938 * arg2 >> 12;
        class86.method642(super.field3536, var4, var5, var7, 123, var6);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILvb;)V")
    public static final void method760(int arg0, class58 arg1) {
        ++field1949;
        if (~arg1.field1033 != -1) {
            if (arg1.field1007 != -1 && arg1.field1007 < 32768) {
                class17 var2 = class194.field3320[arg1.field1007];
                if (var2 != null) {
                    int var3 = -var2.field1042 + arg1.field1042;
                    int var4 = -var2.field1027 + arg1.field1027;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg1.field1047 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (~arg1.field1007 <= -32769) {
                int var5 = arg1.field1007 + -32768;
                if (class213.field3748 == var5) {
                    var5 = 2047;
                }
                class44 var6 = class249.field4291[var5];
                if (var6 != null) {
                    int var7 = -var6.field1027 + arg1.field1027;
                    int var8 = arg1.field1042 - var6.field1042;
                    if (var8 != 0 || var7 != 0) {
                        arg1.field1047 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1038 != 0 || arg1.field1046 != 0) && (arg1.field1030 == 0 || ~arg1.field1029 < -1)) {
                int var9 = arg1.field1042 + -64 + 64 * arg1.method311((byte) -30) - (-class244.field4172 + -class244.field4172 + arg1.field1038) * 64;
                int var10 = arg1.field1027 - -((arg1.method311((byte) 72) + -1) * 64) + -((-class213.field3742 + -class213.field3742 + arg1.field1046) * 64);
                if (var9 != 0 || var10 != 0) {
                    arg1.field1047 = (int) (325.949D * Math.atan2((double) var9, (double) var10)) & 2047;
                }
                arg1.field1038 = 0;
                arg1.field1046 = 0;
            }
            if (arg0 != 14047) {
                method760(23, (class58) null);
            }
            int var11 = 2047 & -arg1.field1036 + arg1.field1047;
            if (~var11 == -1) {
                arg1.field1005 = 0;
            } else {
                ++arg1.field1005;
                if (var11 <= 1024) {
                    arg1.field1036 += arg1.field1033;
                    boolean var12 = true;
                    if (~arg1.field1033 < ~var11 || ~var11 < ~(2048 - arg1.field1033)) {
                        var12 = false;
                        arg1.field1036 = arg1.field1047;
                    }
                    if (~arg1.field1057 == ~arg1.field1014 && (~arg1.field1005 < -26 || var12)) {
                        if (~arg1.field1049 != 0) {
                            arg1.field1057 = arg1.field1049;
                        } else {
                            arg1.field1057 = arg1.field1011;
                        }
                    }
                } else {
                    boolean var13 = true;
                    arg1.field1036 -= arg1.field1033;
                    if (~var11 > ~arg1.field1033 || -arg1.field1033 + 2048 < var11) {
                        var13 = false;
                        arg1.field1036 = arg1.field1047;
                    }
                    if (~arg1.field1057 == ~arg1.field1014 && (arg1.field1005 > 25 || var13)) {
                        if (~arg1.field1013 == 0) {
                            arg1.field1057 = arg1.field1011;
                        } else {
                            arg1.field1057 = arg1.field1013;
                        }
                    }
                }
                arg1.field1036 &= 2047;
            }
        }
    }
}
