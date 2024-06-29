import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class124 extends class217 {

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/lang/String;")
    public String field1960;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static volatile int field1959 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "J")
    public static long field1963 = 0L;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1965 = 0;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1966 = 2301979;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[[[I")
    public static int[][][] field1961;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 17)
    public static final String method945(boolean arg0, long arg1) {
        field1964++;
        class11.field113.setTime(new Date(arg1));
        int var3 = class11.field113.get(7);
        int var4 = class11.field113.get(5);
        int var5 = class11.field113.get(2);
        int var6 = class11.field113.get(1);
        int var7 = class11.field113.get(11);
        int var8 = class11.field113.get(12);
        if (arg0) {
            return (String) null;
        } else {
            int var9 = class11.field113.get(13);
            return class177.field2657[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class133.field2100[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/lang/String;B[B)I", line = 47)
    public static final int method946(int arg0, int arg1, int arg2, String arg3, byte arg4, byte[] arg5) {
        int var6 = arg1 - arg2;
        if (arg4 != 60) {
            return 74;
        }
        field1958++;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg0 + var7] = -97;
            } else {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var8, 16) + " in CharSequence");
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 180)
    public class124() {
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V", line = 184)
    public static void method947(byte arg0) {
        field1961 = (int[][][]) null;
        if (arg0 != -100) {
            method945(false, 2L);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V", line = 199)
    public static final void method948(byte arg0) {
        class126.field1996.method1428(10935);
        if (arg0 != 41) {
            field1959 = -113;
        }
        field1962++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 213)
    public class124(String arg0, int arg1) {
        this.field1960 = arg0;
    }
}
