import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class168 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field2153 = 0;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Ldfa;")
    private class477 field2149;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2154 = new String[] { method1417(method1416("x&\u0015x\u000f")), method1417(method1416("f?WU")), method1417(method1416("sd\u0015\u0017Z")), method1417(method1416("x&\u0015z\u000f")), method1417(method1416("x&\u0015{\u000f")), method1417(method1416("x&\u0015}\u000f")), method1417(method1416("x&\u0015\u0005Nf#O\u0007\u000f")) };

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lwb;")
    private class578 field2147;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1412(int arg0, int arg1, boolean arg2) {
        try {
            field2150++;
            if (arg2) {
                method1412(-47, 60, false);
            }
            return (arg1 & 0x21) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2154[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lwb;")
    public final class578 method1413(int arg0) {
        try {
            field2151++;
            this.field2153 = arg0;
            return this.method1414(13009);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2154[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lwb;")
    public final class578 method1414(int arg0) {
        try {
            field2148++;
            if (arg0 != 13009) {
                this.method1413(80);
            }
            if (this.field2153 > 0 && this.field2149.field7038[this.field2153 - 1] != this.field2147) {
                class578 var2 = this.field2147;
                this.field2147 = var2.field8373;
                return var2;
            }
            while (this.field2149.field7031 > this.field2153) {
                class578 var3 = this.field2149.field7038[this.field2153++].field8373;
                if (this.field2149.field7038[this.field2153 - 1] != var3) {
                    this.field2147 = var3.field8373;
                    return var3;
                }
            }
            return null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2154[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILlga;JIZII)V")
    public static final void method1415(int arg0, int arg1, class47 arg2, long arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            class238.field3445 = null;
            class443.field6543 = arg6;
            class511.field7507 = arg7;
            class430.field6242 = arg2;
            class11.field150 = arg0;
            if (arg4 == -11707) {
                class329.field4492 = arg3;
                class189.field2517 = arg5;
                field2152++;
                class760.field10848 = arg1;
                class385.field5631 = 1;
                class713.field10110 = 10000;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2154[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2154[1] : field2154[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class168() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ldfa;)V")
    public class168(class477 arg0) {
        try {
            this.field2149 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2154[6] + (arg0 == null ? field2154[1] : field2154[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1416(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1417(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
