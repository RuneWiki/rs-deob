import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class45 {

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "[S")
    private short[] field3084 = new short[6];

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    private int field3087 = 0;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "[S")
    private short[] field3081 = new short[6];

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    private int field3097 = 0;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    private int field3088 = 128;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "I")
    public int field3104 = -1;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    private int field3099 = 0;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field3085 = 128;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lkd;")
    public static class73 field3098 = class126.method1070((byte) -66, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "Lkd;")
    public static class73 field3090 = class126.method1070((byte) -66, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lkd;")
    private static class73 field3083 = class126.method1070((byte) -66, "Players");

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lkd;")
    public static class73 field3102 = null;

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lkd;")
    public static class73 field3105 = field3083;

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "Lkd;")
    private static class73 field3109 = class126.method1070((byte) -66, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lkd;")
    public static class73 field3095 = field3109;

    @OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lkd;")
    private static class73 field3111 = class126.method1070((byte) -66, "Select a world");

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "Lkd;")
    public static class73 field3108 = field3111;

    @OriginalMember(owner = "client!rc", name = "zb", descriptor = "Lkd;")
    private static class73 field3113 = class126.method1070((byte) -66, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lkd;")
    public static class73 field3094 = field3113;

    @OriginalMember(owner = "client!rc", name = "wb", descriptor = "Lkd;")
    public static class73 field3110 = class126.method1070((byte) -66, "headicons_hint");

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lwb;")
    public static class150 field3079 = new class150(5000);

    @OriginalMember(owner = "client!rc", name = "Ab", descriptor = "Lkd;")
    public static class73 field3114 = class126.method1070((byte) -66, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!rc", name = "yb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lua;")
    public static class137 field3101;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lqc;I)V")
    public final void method1034(class114 arg0, int arg1) {
        field3080++;
        while (true) {
            int var3 = arg0.method957((byte) 107);
            if (var3 == 0) {
                if (arg1 == 128) {
                    return;
                } else {
                    method1040((byte) 104);
                    return;
                }
            }
            this.method1038((byte) 114, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)I")
    public static final int method1035(int arg0, int arg1, byte arg2) {
        field3092++;
        long var3 = (long) ((arg0 << 16) + arg1);
        if (class81.field2044 != null && class81.field2044.field3522 == var3) {
            return arg2 < 63 ? -113 : class66.field1704.field2816 * 99 / (class66.field1704.field2880.length - class81.field2044.field3127) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Z")
    public static final boolean method1036(int arg0) {
        field3096++;
        if (arg0 == -1) {
            return class26.field754 == 0 ? class86.field2181.method1003(true) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Lna;")
    public final class91 method1037(byte arg0, int arg1) {
        if (arg0 > -100) {
            method1036(-110);
        }
        field3112++;
        class91 var3 = (class91) class51.field1379.method538(0, (long) this.field3091);
        if (var3 == null) {
            class67 var4 = class67.method562(class57.field1514, this.field3106, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field3081[0] != 0) {
                    var4.method569(this.field3081[var5], this.field3084[var5]);
                }
            }
            var3 = var4.method566(this.field3099 + 64, this.field3087 + 850, -30, -50, -30);
            class51.field1379.method542(var3, -901, (long) this.field3091);
        }
        class91 var6;
        if (this.field3104 == -1 || arg1 == -1) {
            var6 = var3.method763(true);
        } else {
            var6 = class94.method782(-24669, this.field3104).method284((byte) -56, var3, arg1);
        }
        if (this.field3085 != 128 || this.field3088 != 128) {
            var6.method767(this.field3085, this.field3088, this.field3085);
        }
        if (this.field3097 != 0) {
            if (this.field3097 == 90) {
                var6.method758();
            }
            if (this.field3097 == 180) {
                var6.method758();
                var6.method758();
            }
            if (this.field3097 == 270) {
                var6.method758();
                var6.method758();
                var6.method758();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLqc;I)V")
    private final void method1038(byte arg0, class114 arg1, int arg2) {
        field3100++;
        if (arg2 == 1) {
            this.field3106 = arg1.method944((byte) 113);
        } else if (arg2 == 2) {
            this.field3104 = arg1.method944((byte) 111);
        } else if (arg2 == 4) {
            this.field3085 = arg1.method944((byte) 118);
        } else if (arg2 == 5) {
            this.field3088 = arg1.method944((byte) 120);
        } else if (arg2 == 6) {
            this.field3097 = arg1.method944((byte) 115);
        } else if (arg2 == 7) {
            this.field3099 = arg1.method957((byte) 77);
        } else if (arg2 == 8) {
            this.field3087 = arg1.method957((byte) 12);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field3081[arg2 - 40] = (short) arg1.method944((byte) 124);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field3084[arg2 - 50] = (short) arg1.method944((byte) 109);
        }
        int var4 = 124 % ((22 - arg0) / 34);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lkd;Lqc;I)I")
    public static final int method1039(class73 arg0, class114 arg1, int arg2) {
        field3103++;
        int var3 = arg1.field2816;
        arg1.method969(-71, arg0.field1880);
        arg1.field2816 += class54.field1445.method1080(arg0.field1880, arg0.field1858, arg1.field2880, 256, arg2, arg1.field2816);
        return arg1.field2816 - var3;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field3114 = null;
        field3113 = null;
        field3111 = null;
        field3102 = null;
        field3079 = null;
        field3110 = null;
        field3098 = null;
        field3095 = null;
        field3108 = null;
        int var1 = 99 % ((50 - arg0) / 53);
        field3090 = null;
        field3101 = null;
        field3105 = null;
        field3109 = null;
        field3083 = null;
        field3094 = null;
    }
}
