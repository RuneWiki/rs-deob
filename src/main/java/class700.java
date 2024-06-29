import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class700 {

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9799 = new String[] { method5043(method5042("B!\u0014\u001d\n")), method5043(method5042("O6V0")), method5043(method5042("Zm\u0014r_")), method5043(method5042("B!\u0014\u001e\n")), method5043(method5042("B!\u0014(Mr7H5LFk")) };

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ljk;")
    public static class178 field9796;

    @OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field9798++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9799[4] + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method5040(byte arg0) {
        try {
            field9796 = null;
            if (arg0 <= 117) {
                field9795 = -24;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9799[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lvo;BI)V")
    public static final void method5041(class782[] arg0, byte arg1, int arg2) {
        try {
            for (int var3 = 0; var3 < arg0.length; var3++) {
                class782 var4 = arg0[var3];
                if (var4 != null) {
                    if (var4.field11291 == 0) {
                        if (var4.field11290 != null) {
                            method5041(var4.field11290, (byte) -120, arg2);
                        }
                        class509 var5 = (class509) class104.field1375.method3693(false, (long) var4.field11158);
                        if (var5 != null) {
                            class149.method1270(arg2, var5.field7472, -22202);
                        }
                    }
                    if (arg2 == 0 && var4.field11211 != null) {
                        class618 var6 = new class618();
                        var6.field8805 = var4;
                        var6.field8812 = var4.field11211;
                        class158.method1334(var6);
                    }
                    if (arg2 == 1 && var4.field11154 != null) {
                        if (var4.field11206 >= 0) {
                            class782 var7 = class435.method3389(var4.field11158, (byte) -119);
                            if (var7 == null || var7.field11148 == null || var7.field11148.length <= var4.field11206 || var7.field11148[var4.field11206] != var4) {
                                continue;
                            }
                        }
                        class618 var8 = new class618();
                        var8.field8812 = var4.field11154;
                        var8.field8805 = var4;
                        class158.method1334(var8);
                    }
                }
            }
            field9797++;
            if (arg1 != -120) {
                method5041(null, (byte) 44, 110);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9799[0] + (arg0 == null ? field9799[1] : field9799[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5042(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5043(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
