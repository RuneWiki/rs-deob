import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class191 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lpea;")
    private class665 field2818 = new class665();

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lpw;")
    private class649 field2822 = new class649();

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field2819;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Loj;")
    private class346 field2821;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lbf;")
    public static class492 field2813 = new class492();

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 4)
    public static final byte[] method1263(int arg0, String arg1) {
        field2814++;
        if (arg0 != 22008) {
            method1263(3, null);
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 152)
    public final void method1264(int arg0) {
        this.field2822.method3616(-129);
        field2817++;
        this.field2821.method2060(0);
        this.field2818 = new class665();
        this.field2819 = this.field2820;
        int var2 = -49 / ((arg0 - 2) / 53);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZJLpea;)V", line = 165)
    public final void method1265(boolean arg0, long arg1, class665 arg2) {
        if (this.field2819 == 0) {
            class665 var5 = this.field2822.method3613(-127);
            var5.method2971(1);
            var5.method3691((byte) -119);
            if (this.field2818 == var5) {
                class665 var6 = this.field2822.method3613(-122);
                var6.method2971(1);
                var6.method3691((byte) -119);
            }
        } else {
            this.field2819--;
        }
        field2816++;
        this.field2821.method2063(arg1, 1, arg2);
        if (arg0) {
            this.field2822 = null;
        }
        this.field2822.method3615(-31531, arg2);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 198)
    public static void method1266(int arg0) {
        int var1 = -19 / ((arg0 + 42) / 35);
        field2813 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)Lpea;", line = 207)
    public final class665 method1267(byte arg0, long arg1) {
        int var4 = -17 % ((-arg0 - 35) / 55);
        field2815++;
        class665 var5 = (class665) this.field2821.method2061(-17305, arg1);
        if (var5 != null) {
            this.field2822.method3615(-31531, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V", line = 251)
    public class191(int arg0) {
        this.field2819 = arg0;
        this.field2820 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2821 = new class346(var2);
    }
}
