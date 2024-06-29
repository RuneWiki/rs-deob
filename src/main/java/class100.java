import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class100 {

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "Lbe;")
    public class38 field1463 = null;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "[Lkia;")
    public class649[] field1466 = null;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "Lbe;")
    public class38 field1468 = null;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "[Lkia;")
    public class649[] field1470 = null;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "Lbe;")
    public class38 field1471 = null;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "Z")
    public boolean field1469;

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1472 = new String[] { method951(method950("s\t\u0010iG+")), method951(method950("s\t\u0010iE+")), method951(method950("s\t\u0010iF+")), method951(method950("s\t\u0010i8j\u000e\u00183:+")), method951(method950("m\u0015\u001d+")), method951(method950("xN_iy")) };

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field1460 = 13156520;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "Lme;")
    public static class204 field1465;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "[I")
    public static int[] field1467;

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lvf;)V", line = 83)
    public class100(class159 arg0) {
        try {
            this.field1469 = arg0.field2533;
            class375.method3090(true, arg0);
            if (this.field1469) {
                byte[] var6 = class297.method2559(true, class587.field8504, false);
                this.field1471 = new class38(arg0, 6410, 128, 128, 16, var6, 6410);
                byte[] var7 = class297.method2559(true, class521.field7698, false);
                this.field1468 = new class38(arg0, 6410, 128, 128, 16, var7, 6410);
                class382 var8 = arg0.field2393;
                if (var8.method3125(7)) {
                    byte[] var9 = class297.method2559(true, class363.field5938, false);
                    this.field1463 = new class38(arg0, 6408, 128, 128, 16);
                    class38 var10 = new class38(arg0, 6409, 128, 128, 16, var9, 6409);
                    if (var8.method3124(false, 2.0F, var10, this.field1463)) {
                        this.field1463.method1971(9984);
                    } else {
                        this.field1463.method1970((byte) -54);
                        this.field1463 = null;
                    }
                    var10.method1970((byte) -54);
                }
            } else {
                this.field1466 = new class649[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var3 = class466.method3602(var2 * 128 * 128 * 2, class587.field8504, 32768, (byte) 51);
                    this.field1466[var2] = new class649(arg0, 3553, 6410, 128, 128, true, var3, 6410, false);
                }
                this.field1470 = new class649[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var5 = class466.method3602(var4 * 2 * 16384, class521.field7698, 32768, (byte) 51);
                    this.field1470[var4] = new class649(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field1472[3] + (arg0 == null ? field1472[4] : field1472[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 14)
    public static final void method947(int arg0) {
        try {
            field1464++;
            if (class317.field5179 == null) {
                class788 var1 = new class788();
                byte[] var2 = var1.method5661(-1, 16, 128, 128);
                class317.field5179 = class277.method2374(var2, 1, false);
            }
            if (arg0 != 18724) {
                method947(47);
            }
            if (class52.field640 == null) {
                class488 var3 = new class488();
                byte[] var4 = var3.method3707(128, 16, (byte) -80, 128);
                class52.field640 = class277.method2374(var4, 1, false);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1472[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V", line = 50)
    public static void method948(boolean arg0) {
        try {
            field1465 = null;
            field1467 = null;
            if (!arg0) {
                method947(-97);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1472[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(CB)Z", line = 63)
    public static final boolean method949(char arg0, byte arg1) {
        try {
            int var2 = -104 % ((53 - arg1) / 48);
            field1461++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1472[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method950(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method951(char[] arg0) {
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
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
