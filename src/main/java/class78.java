import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class78 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
    public static int[] field815 = new int[4];

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    public static int[] field819 = new int[4];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)Lkm;")
    public static final class353 method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 30154) {
            return null;
        }
        field816++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg5 * 986053L ^ (long) arg0 * 475427L ^ (long) arg2 * 97549L ^ (long) arg6 * 67481L ^ (long) arg1 * 32147369L;
        class353 var9 = (class353) class105.field1091.method3538(var7, 0);
        if (var9 == null) {
            class353 var10 = class82.field858.method343(arg6, arg2, arg0, arg5, arg1, arg3);
            class105.field1091.method3537(arg4 ^ 0xFFFF8A74, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method551(int arg0) {
        field819 = null;
        if (arg0 == 15142) {
            field815 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static final void method552(boolean arg0) {
        if (arg0) {
            class638.field9170 = class316.field3973;
            class504.field7120 = class159.field1758;
        } else {
            class638.field9170 = class735.field10270;
            class504.field7120 = class11.field88;
        }
        class723.field10134 = class638.field9170.length;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method553(int arg0, byte[] arg1, int arg2, int arg3) {
        field818++;
        char[] var4 = new char[arg2];
        if (arg3 != -1) {
            method551(95);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class231.field2698[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
    public static final boolean method554(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method550(15, -78, 49, -5, 98, -126, -127);
        }
        field817++;
        return (class212.method1257(arg1, 0, arg0) | class357.method2097(arg0, (byte) -51, arg1) | class197.method1182(arg1, arg0, 106)) & class325.method1934(arg0, arg1, (byte) 110);
    }
}
