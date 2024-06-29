import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class74 {

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
    public int[] field771;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "[I")
    public int[] field774;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "[I")
    public int[] field775;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "[[F")
    public float[][] field770;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "Lmk;")
    public static class54 field776 = new class54();

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    public static int field779 = 1;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "[I")
    public static int[] field773;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIBLjava/lang/String;Ljava/lang/String;)V", line = 6)
    public static final void method536(String arg0, String arg1, int arg2, int arg3, byte arg4, String arg5, String arg6) {
        if (arg4 > -14) {
            field773 = null;
        }
        class512.method3028(arg3, null, arg2, arg0, -1, arg1, arg5, 23265, arg6);
        field778++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 21)
    public static void method537(int arg0) {
        if (arg0 != 256) {
            method536(null, null, 103, -19, (byte) -60, null, null);
        }
        field773 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "([I[I[I[[F)V", line = 31)
    public class74(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field771 = arg0;
        this.field774 = arg2;
        this.field775 = arg1;
        this.field770 = arg3;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lbda;Z)V", line = 42)
    public static final void method538(class504 arg0, boolean arg1) {
        field772++;
        if (arg0.field7091 == null && arg0.field7136 == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < arg0.field7091.length; var3++) {
            int var4 = -1;
            if (arg0.field7091 != null) {
                var4 = arg0.field7091[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var10;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    int var9 = var7 & 0x3FFF;
                    var10 = arg0.field4635 - ((var8 - class464.field6624) * 512) - 256;
                    var11 = arg0.field4629 - ((var9 - class181.field2144) * 512) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class151 var12 = (class151) class253.field3052.method1754(!arg1, (long) var4);
                    if (var12 == null) {
                        arg0.method3001(!arg1, var3, -1);
                        continue;
                    }
                    class197 var13 = var12.field1661;
                    var11 = arg0.field4629 - var13.field4629;
                    var10 = arg0.field4635 - var13.field4635;
                } else {
                    int var14 = var4 & 0x7FFF;
                    class183 var15 = class75.field792[var14];
                    if (var15 == null) {
                        arg0.method3001(false, var3, -1);
                        continue;
                    }
                    var11 = arg0.field4629 - var15.field4629;
                    var10 = arg0.field4635 - var15.field4635;
                }
                if (var10 != 0 || var11 != 0) {
                    arg0.method3001(false, var3, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg0.method3001(false, var3, -1)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field7091 = null;
            arg0.field7136 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lfh;I)I", line = 152)
    public static final int method539(class649 arg0, int arg1) {
        field777++;
        String var2 = class98.method686(31734, arg0);
        if (arg1 != 595681774) {
            field776 = null;
        }
        int[] var3 = null;
        if (class657.method3746((byte) 80, arg0.field9270)) {
            var3 = class361.field4643.method912((byte) 1, (int) arg0.field9272).field6258;
        } else if (arg0.field9263 != -1) {
            var3 = class361.field4643.method912((byte) 1, arg0.field9263).field6258;
        } else if (class411.method2523(114, arg0.field9270)) {
            class151 var4 = (class151) class253.field3052.method1754(false, (long) ((int) arg0.field9272));
            if (var4 != null) {
                class197 var5 = var4.field1661;
                class326 var6 = var5.field2293;
                if (var6.field4199 != null) {
                    var6 = var6.method1939(true, class722.field10125);
                }
                if (var6 != null) {
                    var3 = var6.field4221;
                }
            }
        } else if (class59.method455((byte) 38, arg0.field9270)) {
            Object var7 = null;
            class316 var8;
            if (arg0.field9270 == 1003) {
                var8 = class445.field6442.method3972((byte) 124, (int) arg0.field9272);
            } else {
                var8 = class445.field6442.method3972((byte) 104, (int) (arg0.field9272 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field4045 != null) {
                var8 = var8.method1886(class722.field10125, -77);
            }
            if (var8 != null) {
                var3 = var8.field4040;
            }
        }
        if (var3 != null) {
            var2 = var2 + class659.method3756(var3, 84);
        }
        int var9 = class96.field1014.method3139(arg1 ^ 0x238161BD, var2, class126.field1322);
        if (arg0.field9264) {
            var9 += class542.field7795.method503() + 4;
        }
        return var9;
    }
}
