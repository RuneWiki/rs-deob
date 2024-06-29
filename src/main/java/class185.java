import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class185 extends class766 {

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "[B")
    public byte[] field2802;

    @OriginalMember(owner = "client!cha", name = "s", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!cha", name = "r", descriptor = "Lin;")
    public static class380 field2806 = new class380(116, 12);

    @OriginalMember(owner = "client!cha", name = "t", descriptor = "Lhk;")
    public static class153 field2808 = new class153(7, 0, 1, 1);

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!cha", name = "p", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!cha", name = "q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILjava/lang/String;IZI[B)I", line = 5)
    public static final int method1336(int arg0, String arg1, int arg2, boolean arg3, int arg4, byte[] arg5) {
        field2803++;
        int var6 = arg4 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg2 + var7] = -97;
            } else {
                arg5[arg2 + var7] = 63;
            }
        }
        if (arg3) {
            method1340(null, (byte) -114);
        }
        return var6;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 141)
    public static final void method1337(Object[] arg0, int arg1, long[] arg2) {
        field2804++;
        class69.method675(arg2.length + arg1, (byte) 49, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V", line = 150)
    public static void method1338(byte arg0) {
        if (arg0 > -116) {
            method1339(116, -102, 78);
        }
        field2806 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V", line = 162)
    public static final void method1339(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class347.method2117(var3.field2593);
        class347.method2117(var3.field2600);
        if (var3.field2593 != null) {
            var3.field2593 = null;
        }
        if (var3.field2600 != null) {
            var3.field2600 = null;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 179)
    public static final int method1340(String arg0, byte arg1) {
        field2805++;
        if (arg1 <= 12) {
            method1336(40, null, -62, true, 53, null);
        }
        return class436.method2601(true, arg0, 10, 6408);
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([B)V", line = 189)
    public class185(byte[] arg0) {
        this.field2802 = arg0;
    }
}
