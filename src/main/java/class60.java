import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 extends class211 {

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    private int field625 = 10;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    private int field634 = 2048;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field638 = new String[] { method442(method441("Fx\u0002Em")), method442(method441("Fx\u0002Jm")), method442(method441("Fx\u0002Lm")), method442(method441("K1\u0002 8")), method442(method441("^j@b")), method442(method441("Fx\u0002Mm")), method442(method441("Fx\u0002Im")), method442(method441("Fx\u0002Hm")), method442(method441("\u001d2\u0012.")), method442(method441("Fx\u0002Km")) };

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Leba;")
    public static class614 field624 = new class614();

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field633 = -1;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "[I")
    private int[] field630;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
    private int[] field632;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    private final void method435(int arg0) {
        try {
            ++field629;
            this.field630 = new int[this.field625 - -1];
            this.field632 = new int[this.field625 + 1];
            int var2 = 0;
            int var3 = 4096 / this.field625;
            int var4 = this.field634 * var3 >> 12;
            for (int var5 = 0; ~var5 > ~this.field625; ++var5) {
                this.field630[var5] = var2;
                this.field632[var5] = var2 - -var4;
                var2 += var3;
            }
            this.field630[this.field625] = arg0;
            this.field632[this.field625] = this.field632[0] + 4096;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field638[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field627 = arg2.method1455((byte) 62);
                    }
                } else {
                    this.field634 = arg2.method1445((byte) 112);
                }
            } else {
                this.field625 = arg2.method1455((byte) 62);
            }
            if (arg0 < 67) {
                field624 = null;
            }
            ++field637;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field638[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field638[3] : field638[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)I")
    public static final int method436(boolean arg0, int arg1) {
        try {
            ++field631;
            if (class151.field1867 == null) {
                return 0;
            } else {
                if (arg1 < 55) {
                    field624 = null;
                }
                if (!arg0 && class613.field8960 != null) {
                    return class151.field1867.length * 2;
                } else {
                    int var2 = 0;
                    for (int var3 = 0; var3 < class151.field1867.length; ++var3) {
                        int var4 = class151.field1867[var3];
                        if (class451.field6617.method3618(var4, 109)) {
                            ++var2;
                        }
                        if (class657.field9488.method3618(var4, 57)) {
                            ++var2;
                        }
                    }
                    return var2;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field638[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            this.method435(4096);
            ++field636;
            if (arg0 != 27132) {
                field624 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field638[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field628;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1];
                if (this.field627 != 0) {
                    for (int var5 = 0; ~class343.field5332 < ~var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class88.field997[var5];
                        int var9 = this.field627;
                        if (~var9 != -2) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = 2048 - -(var8 - -var4 - 4096 >> 1);
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~this.field625 < ~var10; ++var10) {
                            if (~var6 <= ~this.field630[var10] && ~this.field630[var10 + 1] < ~var6) {
                                if (~this.field632[var10] < ~var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field625 > var12; ++var12) {
                        if (~this.field630[var12] >= ~var4 && ~var4 > ~this.field630[var12 + 1]) {
                            if (var4 < this.field632[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class467.method3551(var3, 0, class343.field5332, var11);
                }
            }
            return arg0 != 8217 ? null : var3;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field638[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
    public static final void method438() {
        for (int var0 = class156.field1944; var0 < class501.field7246; ++var0) {
            for (int var1 = 0; var1 < class132.field1543; ++var1) {
                for (int var2 = 0; var2 < class216.field3296; ++var2) {
                    class96 var3 = class734.field10683[var0][var1][var2];
                    if (var3 != null) {
                        class261 var4 = var3.field1082;
                        class261 var5 = var3.field1079;
                        if (var4 != null && var4.method625((byte) 94)) {
                            class674.method4953(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method625((byte) 94)) {
                                class674.method4953(var5, var0, var1, var2, 1, 1);
                                var5.method627(var4, 0, false, 0, 0, 0, class606.field8877);
                                var5.method628(-38);
                            }
                            var4.method628(-38);
                        }
                        for (class681 var6 = var3.field1085; var6 != null; var6 = var6.field9865) {
                            class343 var8 = var6.field9867;
                            if (var8 != null && var8.method625((byte) 94)) {
                                class674.method4953(var8, var0, var1, var2, var8.field5335 - var8.field5330 + 1, var8.field5325 - var8.field5329 + 1);
                                var8.method628(-38);
                            }
                        }
                        class749 var7 = var3.field1081;
                        if (var7 != null && var7.method625((byte) 94)) {
                            class181.method1586(var7, var0, var1, var2);
                            var7.method628(-38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method439(int arg0) {
        try {
            if (arg0 == 1) {
                field624 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field638[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static final void method440(int arg0) {
        try {
            int var1 = 119 % ((arg0 - 33) / 48);
            ++field626;
            if (~class698.field10153 < -1) {
                int var2 = 0;
                for (int var3 = 0; ~var3 > ~class725.field10472.length; ++var3) {
                    if (~class725.field10472[var3].indexOf(field638[8]) != 0) {
                        ++var2;
                        if (~class698.field10153 == ~var2) {
                            class194.field2609 = class725.field10472[var3].substring(2 + class725.field10472[var3].indexOf(">"));
                            return;
                        }
                    }
                }
            } else {
                class194.field2609 = "";
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field638[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method441(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method442(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
