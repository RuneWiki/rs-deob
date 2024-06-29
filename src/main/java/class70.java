import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class70 extends class364 implements class171 {

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "B")
    private byte field857;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "S")
    private short field856;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "Z")
    private boolean field868;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "Z")
    private boolean field862;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "B")
    private byte field869;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "B")
    private byte field867;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "Z")
    private boolean field851;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "Lgi;")
    private class416 field846;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "Lge;")
    private class386 field865;

    @OriginalMember(owner = "client!rm", name = "db", descriptor = "Lcq;")
    public static class72 field872 = new class72(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!rm", name = "gb", descriptor = "[[B")
    public static byte[][] field875 = new byte[1000][];

    @OriginalMember(owner = "client!rm", name = "eb", descriptor = "[S")
    public static short[] field873 = new short[256];

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!rm", name = "cb", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!rm", name = "fb", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I", line = 4)
    public final int method409(int arg0) {
        ++field855;
        if (arg0 != -50) {
            field872 = null;
        }
        return this.field856 & 65535;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILuo;)Lge;", line = 17)
    private final class386 method410(int arg0, int arg1, class118 arg2) {
        ++field849;
        if (this.field865 != null && ~arg2.method721(this.field865.method1465(), arg1) == -1) {
            return this.field865;
        } else {
            if (arg0 <= 16) {
                field874 = 70;
            }
            class52 var4 = this.method413(-115, arg2, arg1, false);
            return var4 == null ? null : var4.field610;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Luo;B)V", line = 39)
    public final void method411(class118 arg0, byte arg1) {
        ++field861;
        Object var3 = null;
        class416 var5;
        if (this.field846 == null && this.field851) {
            class52 var4 = this.method413(arg1 + -144, arg0, 131072, true);
            var5 = var4 != null ? var4.field611 : null;
        } else {
            var5 = this.field846;
            this.field846 = null;
        }
        if (var5 != null) {
            class183.method1139(var5, this.field869, super.field4948, super.field4953, (boolean[]) null);
        }
        if (arg1 != 88) {
            this.field846 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z", line = 66)
    public final boolean method412(int arg0) {
        ++field858;
        return arg0 != 18942 ? false : this.field851;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILuo;IZ)Lcb;", line = 78)
    private final class52 method413(int arg0, class118 arg1, int arg2, boolean arg3) {
        ++field848;
        class446 var5 = class380.method2361(this.field856 & 65535, -29012);
        if (arg0 > -34) {
            this.field846 = null;
        }
        class279 var6;
        class279 var7;
        if (!this.field862) {
            if (~this.field869 <= -4) {
                var6 = null;
            } else {
                var6 = class219.field2709[this.field869 - -1];
            }
            var7 = class219.field2709[this.field869];
        } else {
            var7 = class75.field915[this.field869];
            var6 = class219.field2709[0];
        }
        return var5.method2774(var6, this.field857, super.field4944, super.field4953, super.field4948, false, var7, this.field867, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Luo;Lnd;IIIIZIIIII)V", line = 108)
    public class70(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class447.method2777(arg11, arg10, 5));
        super.field4953 = (short) arg5;
        this.field857 = (byte) arg11;
        this.field856 = (short) arg1.field6209;
        super.field4948 = (short) arg3;
        this.field868 = arg1.field6235 != 0 && !arg6;
        this.field862 = arg6;
        this.field869 = (byte) arg2;
        this.field867 = (byte) arg10;
        this.field851 = arg0.method708() && arg1.field6210 && !this.field862 && ~class333.field4548 != -1;
        class52 var13 = this.method413(-121, arg0, 1024, this.field851);
        if (var13 != null) {
            this.field846 = var13.field611;
            this.field865 = var13.field610;
        }
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I", line = 138)
    public final int method414(int arg0) {
        if (arg0 != 4096) {
            field874 = -108;
        }
        ++field852;
        return this.field865 != null ? this.field865.method1458() : 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)Lhr;", line = 149)
    public static final class391 method415(int arg0, int arg1, boolean arg2) {
        if (arg0 != Integer.MIN_VALUE) {
            return null;
        } else {
            ++field871;
            long var3 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg1);
            return (class391) class219.field2697.method2218(1, var3);
        }
    }

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "(I)V", line = 163)
    public static void method416(int arg0) {
        field875 = null;
        field873 = null;
        if (arg0 == -13886) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I", line = 178)
    public final int method417(byte arg0) {
        if (arg0 != -116) {
            return -105;
        } else {
            ++field853;
            return this.field857;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 189)
    public static final void method418(boolean arg0) {
        if (!arg0) {
            ++field859;
            class225.field2845.method2298(0);
            class298.field3973.method2298(0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Luo;II)Lge;", line = 201)
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        if (arg1 != -20264) {
            this.field862 = false;
        }
        ++field863;
        return this.method410(arg1 + 20306, arg2, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I", line = 215)
    public final int method420(byte arg0) {
        ++field850;
        int var2 = 51 % ((arg0 - -21) / 44);
        return this.field867;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Luo;IIZ)Z", line = 226)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field860;
        class386 var5 = this.method410(104, 65536, arg0);
        if (!arg3) {
            return false;
        } else if (var5 != null) {
            class450 var6 = arg0.method742();
            var6.method929(super.field4948, super.field4944, super.field4953);
            return var5.method1474(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lfe;)V", line = 254)
    public static final void method421(class133 arg0) {
        for (int var1 = arg0.field1512; var1 <= arg0.field1510; ++var1) {
            for (int var2 = arg0.field1518; var2 <= arg0.field1517; ++var2) {
                class316 var3 = class347.field4722[arg0.field1528][var1][var2];
                if (var3 != null) {
                    class272 var4 = var3.field4256;
                    class272 var5 = null;
                    while (var4 != null) {
                        if (var4.field3512 == arg0) {
                            if (var5 != null) {
                                var5.field3514 = var4.field3514;
                            } else {
                                var3.field4256 = var4.field3514;
                            }
                            var4.method1715(54);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field3514;
                    }
                    var3.field4264 = 0;
                    for (class272 var6 = var3.field4256; var6 != null; var6 = var6.field3514) {
                        var3.field4264 = (byte) (var3.field4264 | var6.field3510);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Luo;B)V", line = 305)
    public final void method422(class118 arg0, byte arg1) {
        ++field854;
        Object var3 = null;
        class416 var5;
        if (this.field846 == null && this.field851) {
            class52 var4 = this.method413(-111, arg0, 131072, true);
            var5 = var4 != null ? var4.field611 : null;
        } else {
            var5 = this.field846;
            this.field846 = null;
        }
        if (arg1 != -7) {
            field872 = null;
        }
        if (var5 != null) {
            class434.method2649(var5, this.field869, super.field4948, super.field4953, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 334)
    public final void method423(int arg0) {
        if (arg0 != 22486) {
            field875 = null;
        }
        if (this.field865 != null) {
            this.field865.method1454();
        }
        ++field864;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)I", line = 349)
    public static final int method424(byte arg0, int arg1, int arg2) {
        ++field866;
        if (arg2 != 1 && ~arg2 != -4) {
            if (arg0 != 35) {
                field872 = null;
            }
            return class222.field2774[3 & arg1];
        } else {
            return class295.field3940[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLuo;)V", line = 364)
    public final void method138(byte arg0, class118 arg1) {
        ++field870;
        if (arg0 < 78) {
            this.method420((byte) 97);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(Luo;B)Lkj;", line = 375)
    public final class175 method130(class118 arg0, byte arg1) {
        ++field847;
        if (this.field865 == null) {
            return null;
        } else {
            class450 var3 = arg0.method742();
            int var4 = 4 % ((11 - arg1) / 37);
            var3.method929(super.field4949 + super.field4948, super.field4944, super.field4953 + super.field4942);
            class175 var5 = null;
            if (this.field868) {
                var5 = class68.method392((byte) -23, 1);
            }
            this.field865.method1441(var3, var5 != null ? var5.field2030[0] : null, 0);
            return var5;
        }
    }
}
