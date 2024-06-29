import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class437 extends class115 {

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field6365;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "Ljava/lang/String;")
    public static String field6363 = " has logged out.";

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "Ljava/lang/String;")
    public static String field6361 = "M";

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
    public static int field6371 = 0;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[BLjava/lang/String;ZII)I")
    public static final int method2735(int arg0, byte[] arg1, String arg2, boolean arg3, int arg4, int arg5) {
        field6366++;
        if (!arg3) {
            return 51;
        }
        int var6 = arg5 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(Z)V")
    public static void method2736(boolean arg0) {
        field6361 = null;
        field6363 = null;
        if (!arg0) {
            field6364 = -7;
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I")
    public static final int method2737(int arg0) {
        field6368++;
        if (arg0 != -28015) {
            field6364 = 33;
        }
        return 15;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        if (!arg0) {
            this.field6365 = null;
        }
        field6362++;
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V")
    public static final void method2738(int arg0, boolean arg1) {
        class354.field5032 = arg0;
        field6370++;
        class18 var2 = class58.field923;
        synchronized (class58.field923) {
            if (!arg1) {
                field6363 = null;
            }
            class58.field923.method106((byte) -104);
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method980(int arg0) {
        if (arg0 != 8216) {
            method2739(-121, (String) null);
        }
        field6367++;
        return this.field6365;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class437(Object arg0) {
        this.field6365 = arg0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2739(int arg0, String arg1) {
        field6369++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != 37) {
            method2737(112);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
