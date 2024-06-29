import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class230 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
    public static int[] field3658 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3654 = 0;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
    public static int[] field3661 = new int[100];

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "J")
    public static long field3663 = 0L;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lli;")
    public class219 field3662;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lsd;")
    public static class27 field3656;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
    public int[] field3653;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 10)
    public static final String method1663(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 128) {
            return (String) null;
        }
        field3657++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class8.field123[var7 - 128];
                    if (var8 == '\u0000') {
                        continue;
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 56)
    public static void method1664(byte arg0) {
        field3661 = null;
        field3656 = null;
        field3658 = null;
        if (arg0 != 69) {
            field3656 = (class27) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)I", line = 76)
    public static final int method1665(byte arg0) {
        field3652++;
        if (class248.field3836 == 0) {
            return 0;
        } else if (arg0 == -117) {
            return class54.field858[class248.field3836].method852();
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lob;II)V", line = 92)
    public static final void method1666(class292[] arg0, int arg1, int arg2) {
        if (arg2 >= -13) {
            method1666((class292[]) null, 108, 70);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class292 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4490 == 0) {
                    if (var4.field4553 != null) {
                        method1666(var4.field4553, arg1, -121);
                    }
                    class224 var5 = (class224) class268.field4148.method833(false, (long) var4.field4531);
                    if (var5 != null) {
                        class108.method824(arg1, (byte) -32, var5.field3596);
                    }
                }
                if (arg1 == 0 && var4.field4574 != null) {
                    class88 var6 = new class88();
                    var6.field1357 = var4;
                    var6.field1340 = var4.field4574;
                    class228.method1656(var6, (byte) -70);
                }
                if (arg1 == 1 && var4.field4595 != null) {
                    if (var4.field4536 >= 0) {
                        class292 var7 = class215.method1555((byte) -48, var4.field4531);
                        if (var7 == null || var7.field4553 == null || var7.field4553.length <= var4.field4536 || var7.field4553[var4.field4536] != var4) {
                            continue;
                        }
                    }
                    class88 var8 = new class88();
                    var8.field1340 = var4.field4595;
                    var8.field1357 = var4;
                    class228.method1656(var8, (byte) -50);
                }
            }
        }
        field3655++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 165)
    public static final void method1667(int arg0, int arg1) {
        field3660++;
        class16.field303.method1828(arg0, (byte) -128);
        if (arg1 != -9230) {
            field3663 = 63L;
        }
    }
}
