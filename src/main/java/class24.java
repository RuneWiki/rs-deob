import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 extends class191 {

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "[I")
    public static int[] field680 = new int[50];

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "[S")
    public static short[] field685 = new short[256];

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "B")
    public byte field687;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lgg;")
    public static class188 field686;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lsi;")
    public class194 field688;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Lue;")
    public static class86 field683;

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "Lue;")
    public static class86 field692;

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "Lue;")
    public static class86 field693;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "[Lw;")
    public static class141[] field681;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "[Lw;")
    public static class141[] field684;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "[Lbb;")
    public static class88[] field689;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Ltd;")
    public static final class70 method176(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field27; ++var4) {
                class70 var5 = var3.field37[var4];
                if ((var5.field1408 >> 29 & 3L) == 2L && var5.field1405 == arg1 && var5.field1403 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static void method177(int arg0) {
        field684 = null;
        field680 = null;
        field686 = null;
        field689 = null;
        field693 = null;
        field683 = null;
        field685 = null;
        if (arg0 < 114) {
            method176(125, -88, -9);
        }
        field692 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)I")
    public static final int method178(int arg0, int arg1, int arg2) {
        int var3 = -128 + class233.method1564(arg1 + 45365, arg2 + 91923, (byte) -128, arg0) - (-(-128 + class233.method1564(arg1 - -10294, arg2 + 37821, (byte) -125, 2) >> 1) + -(class233.method1564(arg1, arg2, (byte) -128, 1) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        ++field691;
        if (var4 >= 10) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)[B")
    public final byte[] method179(int arg0) {
        if (arg0 != 1) {
            field680 = null;
        }
        ++field679;
        if (!super.field3427 && this.field688.field3497 >= this.field688.field3469.length + -this.field687) {
            return this.field688.field3469;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(B)I")
    public final int method180(byte arg0) {
        if (arg0 != -109) {
            return -102;
        } else {
            ++field694;
            return this.field688 == null ? 0 : this.field688.field3497 * 100 / (this.field688.field3469.length + -this.field687);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;IILtj;I)Lci;")
    public static final class234 method181(Component arg0, int arg1, int arg2, class262 arg3, int arg4) {
        ++field682;
        if (class198.field3580 == 0) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && ~arg2 > -3) {
            if (arg1 != 256) {
                return null;
            } else {
                if (~arg4 > -257) {
                    arg4 = 256;
                }
                try {
                    class234 var5 = (class234) Class.forName("ak").newInstance();
                    var5.field4085 = new int[256 * (!class137.field2526 ? 1 : 2)];
                    var5.field4113 = arg4;
                    var5.method540(arg0);
                    var5.field4106 = (-1024 & arg4) + 1024;
                    if (var5.field4106 > 16384) {
                        var5.field4106 = 16384;
                    }
                    var5.method544(var5.field4106);
                    if (~class20.field462 < -1 && class220.field3900 == null) {
                        class220.field3900 = new class142();
                        class220.field3900.field2592 = arg3;
                        arg3.method1724((byte) 94, class20.field462, class220.field3900);
                    }
                    if (class220.field3900 != null) {
                        if (class220.field3900.field2594[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class220.field3900.field2594[arg2] = var5;
                    }
                    return var5;
                } catch (Throwable var8) {
                    try {
                        class80 var6 = new class80(arg3, arg2);
                        var6.field4113 = arg4;
                        var6.field4085 = new int[256 * (class137.field2526 ? 2 : 1)];
                        var6.method540(arg0);
                        var6.field4106 = 16384;
                        var6.method544(var6.field4106);
                        if (class20.field462 > 0 && class220.field3900 == null) {
                            class220.field3900 = new class142();
                            class220.field3900.field2592 = arg3;
                            arg3.method1724((byte) -20, class20.field462, class220.field3900);
                        }
                        if (class220.field3900 != null) {
                            if (class220.field3900.field2594[arg2] != null) {
                                throw new IllegalArgumentException();
                            }
                            class220.field3900.field2594[arg2] = var6;
                        }
                        return var6;
                    } catch (Throwable var7) {
                        return new class234();
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
