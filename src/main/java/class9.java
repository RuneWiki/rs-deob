import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class9 {

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Z")
    public boolean field105 = false;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field109 = -1;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Z")
    public boolean field112 = false;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public int field114 = 64;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public int field113 = 1;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field111 = 64;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public int field116 = 2;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field118 = new String[] { method66(method65("trK&P")), method66(method65("trK$P")), method66(method65("ms\t\t")), method66(method65("x(KK\u0005")), method66(method65("trK'P")) };

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "[I")
    public static int[] field108 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lmv;")
    public static class125 field110 = new class125(66, 7);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "[I")
    public static int[] field115 = new int[1];

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "[[Lvo;")
    public static class782[][] field117;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V", line = 3)
    public static void method62(boolean arg0) {
        try {
            field108 = null;
            field110 = null;
            field115 = null;
            if (!arg0) {
                field117 = null;
            }
            field117 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field118[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZLjc;)V", line = 28)
    private final void method63(int arg0, int arg1, boolean arg2, class711 arg3) {
        try {
            field107++;
            if (!arg2) {
                method62(false);
            }
            if (arg1 == 1) {
                this.field109 = arg3.method5116((byte) -126);
                if (this.field109 == 65535) {
                    this.field109 = -1;
                }
            } else if (arg1 == 2) {
                this.field111 = arg3.method5116((byte) -111) + 1;
                this.field114 = arg3.method5116((byte) -117) + 1;
            } else if (arg1 == 3) {
                arg3.method5125((byte) 99);
            } else if (arg1 == 4) {
                this.field116 = arg3.method5128(0);
            } else if (arg1 == 5) {
                this.field113 = arg3.method5128(0);
            } else if (arg1 == 6) {
                this.field105 = true;
            } else if (arg1 == 7) {
                this.field112 = true;
                return;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field118[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field118[2] : field118[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljc;BI)V", line = 85)
    public final void method64(class711 arg0, byte arg1, int arg2) {
        try {
            int var4 = 41 / ((29 - arg1) / 58);
            while (true) {
                int var5 = arg0.method5128(0);
                if (var5 == 0) {
                    field106++;
                    return;
                }
                this.method63(arg2, var5, true, arg0);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field118[4] + (arg0 == null ? field118[2] : field118[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method65(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method66(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
