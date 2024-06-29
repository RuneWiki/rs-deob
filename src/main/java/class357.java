import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class357 extends class114 {

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lbl;")
    public class467 field5504;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field5502 = 0;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "[Laa;")
    public static class341[] field5500;

    static {
        new class446(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(CLjava/lang/String;I)I", line = 5)
    public static final int method2287(char arg0, String arg1, int arg2) {
        field5503++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        if (arg2 != -15414) {
            method2292((byte) -8, -85, 109, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 37)
    public static final void method2288(byte arg0) {
        field5501++;
        if (arg0 != 121 || class373.field5676) {
            return;
        }
        class508.field7475 = true;
        class373.field5676 = true;
        if (class203.field2716.field1180) {
            class53.field744 = ((int) class53.field744 + 191 & 0xFFFFFF80);
        } else {
            class138.field1845 += (24.0F - class138.field1845) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V", line = 61)
    public static void method2289(byte arg0) {
        if (arg0 != 124) {
            method2289((byte) -126);
        }
        field5500 = null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lbl;)V", line = 71)
    public class357(class467 arg0) {
        this.field5504 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IC)C", line = 79)
    public static final char method2290(int arg0, char arg1) {
        field5505++;
        if (arg0 != 21820) {
            method2289((byte) -1);
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lga;I)Lga;", line = 476)
    public static final class282 method2291(class282 arg0, int arg1) {
        field5499++;
        if (arg0.field4122 != arg1) {
            return class21.method194(arg1 - 107, arg0.field4122);
        }
        int var2 = arg0.field4029 >>> 16;
        class353 var3 = new class353(class312.field4570);
        for (class436 var4 = (class436) var3.method2265(0); var4 != null; var4 = (class436) var3.method2269(~arg1)) {
            if (var4.field6598 == var2) {
                return class21.method194(-116, (int) var4.field35);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII[B)[B", line = 513)
    public static final byte[] method2292(byte arg0, int arg1, int arg2, byte[] arg3) {
        field5506++;
        if (arg0 != -70) {
            method2290(-104, '6');
        }
        byte[] var4 = new byte[arg1];
        class192.method1299(arg3, arg2, var4, 0, arg1);
        return var4;
    }
}
