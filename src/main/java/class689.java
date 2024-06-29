import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class689 extends class768 {

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field9950 = new String[] { method5018(method5017("\u001d+i|")), method5018(method5017("O9q.")), method5018(method5017("O2q.")), method5018(method5017("\bp+>\u0004")), method5018(method5017("\u0000(+SQ")), method5018(method5017("\u0000(+QQ")), method5018(method5017("\u0000(+RQ")), method5018(method5017("\u0000(+UQ")), method5018(method5017("\u0000(+TQ")) };

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "[Lcl;")
    public static class277[] field9943 = new class277[6];

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "B")
    public byte field9945;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public int field9944;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "Lwq;")
    public class176 field9947;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field9941;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(Z)I", line = 3)
    public final int method4226(boolean arg0) {
        try {
            if (!arg0) {
                method5014(-18, 43, 90, -109, 74);
            }
            ++field9942;
            return this.field9947 == null ? 0 : this.field9947.field2799 * 100 / (this.field9947.field2805.length + -this.field9945);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9950[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method5014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field9946;
            class27.field289 = arg4;
            class74.field1065 = arg1;
            class13.field157 = arg2;
            class658.field9407 = arg3;
            if (arg0 != -26998) {
                field9941 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9950[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(Z)V", line = 38)
    public static void method5015(boolean arg0) {
        try {
            if (arg0) {
                method5016(16, (String) null);
            }
            field9943 = null;
            field9941 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9950[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)[B", line = 53)
    public final byte[] method4228(boolean arg0) {
        try {
            if (!arg0) {
                return null;
            } else {
                ++field9948;
                if (!super.field11246 && this.field9947.field2799 >= this.field9947.field2805.length + -this.field9945) {
                    return this.field9947.field2805;
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9950[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 72)
    public static final String method5016(int arg0, String arg1) {
        try {
            ++field9949;
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                char var5 = arg1.charAt(var4);
                if (~var5 == -61 || ~var5 == -63) {
                    var3 += 3;
                }
            }
            StringBuffer var6 = new StringBuffer(var2 + var3);
            for (int var7 = 0; var7 < var2; ++var7) {
                char var8 = arg1.charAt(var7);
                if (~var8 != -61) {
                    if (~var8 == -63) {
                        var6.append(field9950[1]);
                    } else {
                        var6.append(var8);
                    }
                } else {
                    var6.append(field9950[2]);
                }
            }
            if (arg0 != -61) {
                field9943 = null;
            }
            return var6.toString();
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9950[4] + arg0 + ',' + (arg1 != null ? field9950[3] : field9950[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5017(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 121);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5018(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
