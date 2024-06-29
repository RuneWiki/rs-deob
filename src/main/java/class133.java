import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class133 extends class189 {

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    private int field2880 = 1;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
    private int field2883 = 204;

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "I")
    private int field2889 = 1;

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "Lgg;")
    public static class63 field2887 = class116.method911(43, "Okay");

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "Lid;")
    public static class78 field2885 = new class78(8);

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "Lgg;")
    public static class63 field2890 = class116.method911(43, "<col=80ff00>");

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2883 = arg2.method46((byte) 65);
                }
            } else {
                this.field2889 = arg2.method64(31790);
            }
        } else {
            this.field2880 = arg2.method64(31790);
        }
        if (arg1 <= 32) {
            this.field2880 = -78;
        }
        ++field2881;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2887 = null;
        field2885 = null;
        if (arg0 != 8) {
            field2885 = null;
        }
        field2890 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILgg;Lff;)Lgg;")
    public static final class63 method972(int arg0, class63 arg1, class54 arg2) {
        ++field2888;
        if (arg1.method585(126, class134.field2905) != -1) {
            label62: while (true) {
                int var3 = arg1.method585(-14, class134.field2896);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method585(121, class13.field301);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method585(-13, class85.field2031);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg1.method585(124, class139.field2976);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method585(-64, class84.field1986);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.method585(126, class111.field2491);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class63 var9 = class151.field3175;
                                                        if (class109.field2454 != null) {
                                                            var9 = class114.method902(class109.field2454.field2062, (byte) 102);
                                                            try {
                                                                if (class109.field2454.field2060 != null) {
                                                                    byte[] var10 = ((String) class109.field2454.field2060).getBytes("ISO-8859-1");
                                                                    var9 = class129.method958(var10, 0, var10.length, 106);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class89.method772((byte) 54, new class63[] { arg1.method596(0, var8, -68), var9, arg1.method592(false, var8 + 4) });
                                                    }
                                                }
                                                arg1 = class89.method772((byte) 56, new class63[] { arg1.method596(0, var7, -115), class117.method916((byte) -110, class5.method85(4, (byte) 124, arg2)), arg1.method592(false, var7 + 2) });
                                            }
                                        }
                                        arg1 = class89.method772((byte) 94, new class63[] { arg1.method596(0, var6, -106), class117.method916((byte) 47, class5.method85(3, (byte) 122, arg2)), arg1.method592(false, var6 + 2) });
                                    }
                                }
                                arg1 = class89.method772((byte) 28, new class63[] { arg1.method596(0, var5, -68), class117.method916((byte) -53, class5.method85(2, (byte) 110, arg2)), arg1.method592(false, var5 + 2) });
                            }
                        }
                        arg1 = class89.method772((byte) 81, new class63[] { arg1.method596(0, var4, -57), class117.method916((byte) -81, class5.method85(1, (byte) 116, arg2)), arg1.method592(false, var4 - -2) });
                    }
                }
                arg1 = class89.method772((byte) 36, new class63[] { arg1.method596(0, var3, -98), class117.method916((byte) 123, class5.method85(0, (byte) 92, arg2)), arg1.method592(false, var3 + 2) });
            }
        }
        if (arg0 <= 3) {
            method971(-73);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2886;
        if (arg0 != 0) {
            this.field2880 = 51;
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -83);
        if (super.field3825.field1840) {
            for (int var4 = 0; ~var4 > ~class54.field1430; ++var4) {
                int var5 = class35.field825[var4];
                int var6 = var5 % (4096 / this.field2880) * this.field2880;
                int var7 = this.field2880 * var5 >> 12;
                int var8 = class21.field496[arg1];
                int var9 = this.field2889 * var8 >> 12;
                int var10 = var8 % (4096 / this.field2889) * this.field2889;
                if (this.field2883 > var10) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2883 < ~var6) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var6 > ~this.field2883) {
                    int var11;
                    for (var11 = var7 - var9; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        if (arg0 > 3) {
            ++field2882;
            class206.field4058.method282((byte) -92);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)I")
    public static final int method974(int arg0, int arg1, int arg2) {
        ++field2884;
        if (arg0 != 1780980831) {
            return 39;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg1 + -var3;
        }
    }
}
