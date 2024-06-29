import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class375 implements class105 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Ltda;")
    public class666 field6088;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
    public boolean field6082;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public int field6081;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public int field6091;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public int field6087;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public int field6075;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Ljk;")
    public class662 field6090;

    @OriginalMember(owner = "client!du", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6092 = new String[] { method3092(method3091(",\u00032*x")), method3092(method3091("3X2G-")), method3092(method3091(",\u00032U9&\u001fhWx")), method3092(method3091("&\u0003p\u0005")), method3092(method3091(",\u00032,x")), method3092(method3091("rV")), method3092(method3091(",\u00032+x")), method3092(method3091(",\u00032-x")), method3092(method3091(",\u00032(x")) };

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[[I")
    public static int[][] field6083 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 6)
    public static void method3087(int arg0) {
        try {
            field6083 = null;
            if (arg0 != 2217) {
                method3087(64);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6092[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Lwh;", line = 21)
    public final class155 method989(boolean arg0) {
        try {
            field6079++;
            if (arg0) {
                method3090(false, null);
            }
            return class365.field5944;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6092[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)Z", line = 36)
    public static final boolean method3088(int arg0) {
        try {
            if (arg0 != 16) {
                method3087(-58);
            }
            field6089++;
            boolean var1 = true;
            if (class721.field10567 == null) {
                if (class550.field8065.method595(arg0 - 18, class128.field1842)) {
                    class721.field10567 = class174.method1609(class550.field8065, class128.field1842);
                } else {
                    var1 = false;
                }
            }
            if (class347.field5632 == null) {
                if (class550.field8065.method595(-2, class751.field11064)) {
                    class347.field5632 = class174.method1609(class550.field8065, class751.field11064);
                } else {
                    var1 = false;
                }
            }
            if (class43.field480 == null) {
                if (class550.field8065.method595(arg0 ^ 0xFFFFFFEE, class232.field3593)) {
                    class43.field480 = class174.method1609(class550.field8065, class232.field3593);
                } else {
                    var1 = false;
                }
            }
            if (class734.field10764 == null) {
                if (class242.field3745.method595(arg0 - 18, class671.field9528)) {
                    class734.field10764 = class570.method4197(class242.field3745, (byte) 99, class671.field9528);
                } else {
                    var1 = false;
                }
            }
            if (class397.field6288 == null) {
                if (class550.field8065.method595(-2, class671.field9528)) {
                    class397.field6288 = class174.method1603(class550.field8065, class671.field9528);
                } else {
                    var1 = false;
                }
            }
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6092[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 108)
    public static final String[] method3089(int arg0, String[] arg1) {
        try {
            field6078++;
            String[] var2 = new String[5];
            if (arg0 <= 14) {
                field6083 = null;
            }
            for (int var3 = 0; var3 < 5; var3++) {
                var2[var3] = var3 + field6092[5];
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = var2[var3] + arg1[var3];
                }
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6092[4] + arg0 + ',' + (arg1 == null ? field6092[3] : field6092[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLvf;)V", line = 134)
    public static final void method3090(boolean arg0, class159 arg1) {
        try {
            if (arg0) {
                field6076++;
                if (class587.field8504 == null) {
                    class317 var2 = new class317();
                    byte[] var3 = var2.method2725(-1, 16, 128, 128);
                    class587.field8504 = class277.method2374(var3, 1, false);
                }
                if (class521.field7698 == null) {
                    class343 var4 = new class343();
                    byte[] var5 = var4.method2881(128, 16, (byte) -76, 128);
                    class521.field7698 = class277.method2374(var5, 1, false);
                }
                class382 var6 = arg1.field2393;
                if (var6.method3125(7) && class363.field5938 == null) {
                    byte[] var7 = class774.method5574(false, 0.6F, 4.0F, new class479(419684), 4.0F, 16, 128, 128, 16.0F, 8, 0.5F);
                    class363.field5938 = class277.method2374(var7, 1, false);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6092[7] + arg0 + ',' + (arg1 == null ? field6092[3] : field6092[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILjk;Ltda;IIIIIIIZ)V", line = 180)
    public class375(int arg0, class662 arg1, class666 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        try {
            this.field6088 = arg2;
            this.field6082 = arg10;
            this.field6077 = arg9;
            this.field6081 = arg6;
            this.field6091 = arg5;
            this.field6084 = arg8;
            this.field6087 = arg7;
            this.field6086 = arg0;
            this.field6075 = arg4;
            this.field6085 = arg3;
            this.field6090 = arg1;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6092[2] + arg0 + ',' + (arg1 == null ? field6092[3] : field6092[1]) + ',' + (arg2 == null ? field6092[3] : field6092[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!du", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3091(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!du", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3092(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
