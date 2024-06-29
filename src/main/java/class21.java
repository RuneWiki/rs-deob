import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class class21 extends class459 {

    @OriginalMember(owner = "client!qia", name = "w", descriptor = "Lnba;")
    public class314 field209;

    @OriginalMember(owner = "client!qia", name = "v", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!qia", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field212 = new String[] { method142(method141("5_\u0017;")), method142(method141(" \u0004Uy2")), method142(method141("*C\u001ays2D\u0012#qs")), method142(method141("*C\u001ay\u000bs")), method142(method141("*C\u001ay\ns")) };

    @OriginalMember(owner = "client!qia", name = "y", descriptor = "Lhl;")
    public static class556 field207 = new class556(68, 8);

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "Liha;")
    public static class29 field210 = new class29(8);

    @OriginalMember(owner = "client!qia", name = "x", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method137(int arg0, boolean arg1) {
        try {
            if (arg1 && class770.field11258 != null) {
                class516.field7630 = class770.field11258.field455;
            } else {
                class516.field7630 = -1;
            }
            field208++;
            class728.field10663 = null;
            class672.field9539 = 0;
            class770.field11258 = null;
            class239.field3684 = null;
            class770.method5560();
            class770.field11260.method3224(false);
            class770.field11267 = null;
            class696.field10030 = null;
            class328.field5385 = null;
            class499.field7486 = null;
            class628.field9045 = null;
            class94.field1366 = null;
            class116.field1695 = -1;
            class634.field9105 = null;
            class197.field3135 = null;
            class786.field11498 = null;
            class618.field8929 = null;
            class62.field822 = -1;
            if (class770.field11257 != null) {
                class770.field11257.method2324((byte) 15);
                class770.field11257.method2327(64, 128, 35);
            }
            if (class770.field11254 != null) {
                class770.field11254.method3729(64, false, 64);
            }
            if (class770.field11255 != null) {
                class770.field11255.method3997(500, 64);
            }
            class581.field8375.method719(64, (byte) 19);
            if (arg0 != 8) {
                method137(-6, false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field212[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lnba;I)V", line = 68)
    public class21(class314 arg0, int arg1) {
        try {
            this.field209 = arg0;
            this.field211 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field212[2] + (arg0 == null ? field212[0] : field212[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 77)
    public static void method140(int arg0) {
        try {
            field210 = null;
            if (arg0 == 64) {
                field207 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field212[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)Z")
    public abstract boolean method138(byte arg0);

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method139(boolean arg0);

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method141(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method142(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
