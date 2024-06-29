import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class276 {

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public int field4198 = 8;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field4203 = 16777215;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4192 = -1;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lrc;")
    public static class9 field4201 = new class9(20);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lwj;")
    public static class130 field4204;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
    public boolean field4189;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4200;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILqi;I)V")
    public final void method1781(int arg0, class216 arg1, int arg2) {
        if (arg2 > -45) {
            field4205 = -46;
        }
        field4191++;
        while (true) {
            int var4 = arg1.method1407(124);
            if (var4 == 0) {
                return;
            }
            this.method1784(-20724, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1782(int arg0, String arg1) {
        field4190++;
        int var2 = class288.method1932(arg0, arg1);
        return var2 == -1 ? "" : class138.method902(class200.field2840.field2229[var2], " ", (byte) -120, "<br>");
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BIB)Ljava/lang/String;")
    public static final String method1783(int arg0, byte[] arg1, int arg2, byte arg3) {
        field4199++;
        int var4 = 0;
        char[] var5 = new char[arg0];
        int var6 = 0;
        if (arg3 != 52) {
            method1786(26, 126, (byte) -127, 67, -51);
        }
        while (arg0 > var6) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class120.field1715[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
            var6++;
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILqi;II)V")
    private final void method1784(int arg0, class216 arg1, int arg2, int arg3) {
        if (arg0 != -20724) {
            method1786(99, 41, (byte) -4, -11, 23);
        }
        if (arg3 == 1) {
            this.field4198 = arg1.method1380(true);
        } else if (arg3 == 2) {
            this.field4189 = true;
        } else if (arg3 == 3) {
            this.field4202 = arg1.method1357((byte) 50);
            this.field4197 = arg1.method1357((byte) 50);
            this.field4196 = arg1.method1357((byte) 50);
        } else if (arg3 == 4) {
            this.field4194 = arg1.method1407(arg0 + 20839);
        } else if (arg3 == 5) {
            this.field4193 = arg1.method1380(true);
        } else if (arg3 == 6) {
            this.field4203 = arg1.method1382(-57);
        }
        field4195++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        if (arg0 != 1) {
            method1783(101, (byte[]) null, -70, (byte) 34);
        }
        field4204 = null;
        field4201 = null;
        field4200 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBII)V")
    public static final void method1786(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class94 var5 = (class94) class224.field3161.method1895((long) arg0, arg2 ^ 0xFFFFFFE2);
        field4188++;
        if (var5 == null) {
            var5 = new class94();
            class224.field3161.method1894(-1, var5, (long) arg0);
        }
        if (var5.field1260.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field1260.length; var8++) {
                var6[var8] = var5.field1260[var8];
                var7[var8] = var5.field1255[var8];
            }
            for (int var9 = var5.field1260.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1255 = var7;
            var5.field1260 = var6;
        }
        var5.field1260[arg3] = arg4;
        var5.field1255[arg3] = arg1;
        if (arg2 != 118) {
            method1782(7, (String) null);
        }
    }
}
