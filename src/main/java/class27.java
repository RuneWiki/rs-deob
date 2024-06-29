import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class27 extends class71 {

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lst;")
    public static class335 field344 = new class335(26, 11);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "S")
    public static short field348 = 32767;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Luu;")
    public static class237 field350;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method155(int arg0) {
        field342++;
        if (class332.field4707.field4774.method1242(0) == 0 && class96.field1331 != class622.field8328) {
            class581.method3376(class48.field727, class338.field4749, arg0 ^ 0xFFFF9039, 11, false);
        } else if (arg0 == -28615) {
            class482.method2936(class129.field1802, -128);
            if (class96.field1331 != class352.field5093) {
                class572.method3353(-44);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZC)B", line = 27)
    public static final byte method156(boolean arg0, char arg1) {
        field346++;
        if (!arg0) {
            field344 = null;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([SI)[S", line = 154)
    public static final short[] method157(short[] arg0, int arg1) {
        field343++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1 == 29563) {
            class245.method1652(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 171)
    public static final String method158(String arg0, int arg1) {
        field345++;
        String var2 = class331.method2123(0, class702.method3963(arg0, 17521));
        int var3 = 125 % ((45 - arg1) / 43);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLuv;)V", line = 188)
    public static final void method159(byte arg0, class755 arg1) {
        if (class430.field6016 == arg1.field10534) {
            class669.field9236[arg1.field10476] = true;
        }
        field351++;
        if (arg0 != -105) {
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 205)
    public static void method160(byte arg0) {
        field350 = null;
        field344 = null;
        if (arg0 != -108) {
            field348 = -85;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 221)
    public class27() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V", line = 224)
    public class27(int arg0) {
        this.field347 = arg0;
    }
}
