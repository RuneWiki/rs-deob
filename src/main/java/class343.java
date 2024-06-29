import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class343 extends class420 {

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "B")
    public byte field5328;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "Z")
    public boolean field5333;

    @OriginalMember(owner = "client!vv", name = "E", descriptor = "S")
    public short field5335;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "S")
    public short field5325;

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "S")
    public short field5330;

    @OriginalMember(owner = "client!vv", name = "C", descriptor = "S")
    public short field5329;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field5336 = new String[] { method2846(method2845("&|\u0010~o")), method2846(method2845("+$\u0010\u0002:")), method2846(method2845(">\u007fR@")), method2846(method2845("&|\u0010mo")), method2846(method2845("&|\u0010a\u0005x")), method2846(method2845("&|\u0010\u0010.>cJ\u0012o")), method2846(method2845("&|\u0010oo")), method2846(method2845("&|\u0010no")) };

    @OriginalMember(owner = "client!vv", name = "G", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5324 = new Hashtable();

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!vv", name = "F", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!vv", name = "D", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "(I)V", line = 3)
    public void method1904(int arg0) {
        try {
            if (arg0 != 310992073) {
                this.field5335 = -4;
            }
            ++field5327;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5336[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([Luf;Z)I", line = 14)
    public final int method630(class471[] arg0, boolean arg1) {
        try {
            ++field5326;
            int var3 = 0;
            label138: for (int var4 = this.field5330; this.field5335 >= var4; ++var4) {
                label136: for (int var5 = this.field5329; this.field5325 >= var5; ++var5) {
                    long var6 = class546.field8158[super.field6200][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label131: while (true) {
                            if (var8 > 48L) {
                                continue label136;
                            }
                            int var10 = (int) (65535L & var6 >>> (int) var8);
                            if (~var10 >= -1) {
                                continue label136;
                            }
                            class643 var11 = class96.field1076[var10 + -1];
                            for (int var12 = 0; var3 > var12; ++var12) {
                                if (arg0[var12] == var11.field9313) {
                                    var8 += 16L;
                                    continue label131;
                                }
                            }
                            arg0[var3++] = var11.field9313;
                            if (var3 == 4) {
                                break label138;
                            }
                            var8 += 16L;
                        }
                    }
                }
            }
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (!arg1) {
                this.field5325 = 63;
            }
            if (this.field5328 != 0) {
                int var14 = this.field5330 - class247.field3811;
                int var15 = -class5.field52 + this.field5329;
                int var16;
                short var17;
                short var18;
                int var19;
                if (~this.field5328 == -2) {
                    if (~var14 > ~var15) {
                        var16 = this.field5329 + -1;
                        var17 = this.field5330;
                        var18 = this.field5329;
                        var19 = this.field5330 + 1;
                    } else {
                        var19 = this.field5330 + -1;
                        var17 = this.field5330;
                        var18 = this.field5329;
                        var16 = this.field5329 + 1;
                    }
                } else if (-var14 < var15) {
                    var16 = this.field5329 + -1;
                    var19 = this.field5330 + -1;
                    var17 = this.field5330;
                    var18 = this.field5329;
                } else {
                    var19 = this.field5330 - -1;
                    var17 = this.field5330;
                    var16 = this.field5329 + 1;
                    var18 = this.field5329;
                }
                label101: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class546.field8158[super.field6200][var17][var16];
                    while (var21 != 0L) {
                        class643 var23 = class96.field1076[(int) ((65535L & var21) - 1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var23.field9313) {
                            continue label101;
                        }
                    }
                    long var24 = class546.field8158[super.field6200][var19][var18];
                    while (var24 != 0L) {
                        class643 var26 = class96.field1076[(int) ((65535L & var24) + -1L)];
                        var24 >>>= 16;
                        if (arg0[var20] == var26.field9313) {
                            continue label101;
                        }
                    }
                    for (int var27 = var20; ~var27 > ~(var3 + -1); ++var27) {
                        arg0[var27] = arg0[var27 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field5336[3] + (arg0 != null ? field5336[1] : field5336[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "(I)V", line = 187)
    public static void method2844(int arg0) {
        try {
            field5324 = null;
            if (arg0 != 32596) {
                field5332 = -56;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5336[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(ILha;)Z", line = 201)
    public final boolean method631(int arg0, class66 arg1) {
        try {
            ++field5334;
            if (arg0 != -10204) {
                this.field5333 = false;
            }
            return class172.method1525(super.field6205, this.field5330, this.field5329, -47, this.field5325, this.method1086(arg1, arg0 ^ -10173), this.field5335);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5336[7] + arg0 + ',' + (arg1 != null ? field5336[1] : field5336[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "(I)Z", line = 213)
    public final boolean method629(int arg0) {
        try {
            ++field5331;
            if (arg0 != 0) {
                return true;
            } else {
                for (int var2 = this.field5330; ~var2 >= ~this.field5335; ++var2) {
                    for (int var3 = this.field5329; var3 <= this.field5325; ++var3) {
                        int var4 = var2 - class247.field3811 + class396.field5921;
                        if (var4 >= 0 && ~var4 > ~class91.field1038.length) {
                            int var5 = -class5.field52 + var3 - -class396.field5921;
                            if (~var5 <= -1 && ~var5 > ~class91.field1038.length && class91.field1038[var4][var5]) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5336[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 260)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        try {
            super.field6200 = (byte) arg0;
            this.field5328 = arg10;
            this.field5333 = arg9;
            super.field6199 = arg3;
            this.field5335 = (short) arg6;
            super.field6205 = (byte) arg1;
            this.field5325 = (short) arg8;
            this.field5330 = (short) arg5;
            this.field5329 = (short) arg7;
            super.field6197 = arg2;
            super.field6211 = arg4;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5336[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2845(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2846(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
