import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Z")
    public boolean field210;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field212 = new String[] { method112(method111("\u0001\u00069Fn")), method112(method111("\u0001\u00069?/\f\u000ec=n")), method112(method111("\u0001\u00069Bn")), method112(method111("\u0001\u00069Gn")), method112(method111("\u0001\u00069An")), method112(method111("\u0001\u00069@n")) };

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[S")
    public static short[] field205 = new short[256];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Luba;")
    public class517 field202;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Luba;")
    public class517 field206;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lss;")
    public static class724 field203;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
    public boolean field211;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method106(byte arg0) {
        try {
            if (arg0 <= -124) {
                class326.field4453.method3690((byte) 116);
                field204++;
                class290.field4097.method3936((byte) 106);
                class713.field10085.method3936((byte) -119);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field212[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Z)V")
    public class16(boolean arg0) {
        try {
            this.field210 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field212[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method107(int arg0) {
        try {
            if (arg0 == 2) {
                field203 = null;
                field205 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field212[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Z")
    public final boolean method108(boolean arg0) {
        try {
            if (!arg0) {
                method106((byte) 80);
            }
            field209++;
            return this.field211 && !this.field210;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field212[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method109(int arg0) {
        try {
            field208++;
            if (arg0 < -78) {
                if (this.field206 != null) {
                    this.field206.method2342(true);
                }
                this.field211 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field212[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)B")
    public static final byte method110(int arg0, int arg1, int arg2) {
        try {
            field207++;
            if (arg1 == 9) {
                return (byte) ((arg2 & arg0) == 0 ? 1 : 2);
            } else {
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field212[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method111(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method112(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
