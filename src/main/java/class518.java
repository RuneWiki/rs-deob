import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class518 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field7314;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lbu;")
    public static class21 field7312;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Ldc;")
    public static class5 field7313;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 3)
    public static final byte[] method3119(byte arg0, String arg1) {
        int var2 = 50 / ((75 - arg0) / 42);
        field7316++;
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (!(var6 <= '\u0000' || var6 >= '\u0080') || !(var6 < ' ' || var6 > 'ÿ')) {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;", line = 146)
    public final String toString() {
        field7311++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 154)
    public static void method3120(boolean arg0) {
        field7313 = null;
        field7312 = null;
        if (!arg0) {
            field7313 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V", line = 164)
    public class518(int arg0, int arg1) {
        this.field7314 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLha;)V", line = 176)
    public static final void method3121(byte arg0, class65 arg1) {
        field7315++;
        if (class524.field7398 == class210.field3250.field5755 || class767.field10562 == null) {
            return;
        }
        if (class306.method1979(arg1, (byte) -33, class210.field3250.field5755)) {
            class524.field7398 = class210.field3250.field5755;
        }
        if (arg0 > -8) {
            method3119((byte) -73, null);
        }
    }
}
