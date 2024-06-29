import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class299 {

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Ljr;")
    private class112 field4190 = new class112(256);

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lqo;")
    private class22 field4184;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Ld;")
    private class152 field4188;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[[[I")
    public static int[][][] field4185;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public final void method1952(byte arg0) {
        field4189++;
        this.field4190.method999(0);
        if (arg0 != -110) {
            this.field4190 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(CZ)B")
    public static final byte method1953(char arg0, boolean arg1) {
        field4183++;
        if (arg1) {
            method1953((char) 65505, false);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILea;)Z")
    public static final boolean method1954(int arg0, int arg1, class546 arg2) {
        field4187++;
        class528.field7304.method770(arg2.field7524[arg0], arg2.field7528[arg0], arg2.field7521[arg0], class705.field9567);
        int var3 = class705.field9567[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field7531[arg0] = (short) (class705.field9567[0] * class205.field2958 / var3 + class239.field3495);
            arg2.field7520[arg0] = (short) (class705.field9567[arg1] * class492.field6809 / var3 + class665.field9084);
            arg2.field7525[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static final void method1955(int arg0) {
        int var1 = 22 / ((-arg0 - 2) / 52);
        field4181++;
        for (int var2 = 0; var2 < 100; var2++) {
            class286.field3995[var2] = true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Ltp;")
    public final class533 method1956(int arg0, int arg1) {
        field4186++;
        Object var3 = this.field4190.method992((long) arg0, -127);
        if (var3 != null) {
            return (class533) var3;
        } else if (this.field4188.method1181(-7953, arg0)) {
            class739 var4 = this.field4188.method1180(arg0, -6662);
            int var5 = var4.field9941 ? 64 : this.field4184.field534;
            class533 var7;
            if (var4.field9960 && this.field4184.method328()) {
                float[] var6 = this.field4188.method1178(var5, 0.7F, false, -30824, var5, arg0);
                var7 = new class533(this.field4184, 3553, 34842, var5, var5, var4.field9947 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field9942 != 2 && class296.method1944((byte) 4, var4.field9955)) {
                    var8 = this.field4188.method1182(true, arg0, 0.7F, var5, var5, arg1 - 196);
                } else {
                    var8 = this.field4188.method1183(-21540, var5, 0.7F, arg0, false, var5);
                }
                var7 = new class533(this.field4184, 3553, 6408, var5, var5, var4.field9947 != 0, var8, 0, 0, false);
            }
            var7.method3067(var4.field9957, var4.field9959, 10243);
            if (arg1 != 256) {
                method1955(22);
            }
            this.field4190.method991(var7, (long) arg0, (byte) -114);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public static void method1957(int arg0) {
        field4185 = null;
        if (arg0 != -1401) {
            field4185 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public final void method1958(int arg0) {
        if (arg0 == 8218) {
            field4182++;
            this.field4190.method987(2, 5);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lqo;Ld;)V")
    public class299(class22 arg0, class152 arg1) {
        this.field4184 = arg0;
        this.field4188 = arg1;
    }
}
