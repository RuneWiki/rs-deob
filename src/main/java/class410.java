import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class410 extends class418 {

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    private int field6209;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private int field6208;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    private int field6213;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    private int field6204;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    private int field6202;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    private int field6212;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field6201;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field6199 = 0;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
    public static boolean field6203 = false;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public final void method1301(int arg0, int arg1, int arg2) {
        int var4 = 50 % ((-67 - arg0) / 57);
        ++field6206;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)V")
    public final void method1300(byte arg0, int arg1, int arg2) {
        ++field6200;
        if (arg0 <= 12) {
            this.method1300((byte) -92, 31, 119);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method2539(byte arg0, String arg1) {
        ++field6207;
        long var2 = 0L;
        if (arg0 != 12) {
            method2539((byte) 59, (String) null);
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 + -65);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var2 += (long) (var6 + 1 + -97);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (var6 + -21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZI)V")
    public final void method1302(int arg0, boolean arg1, int arg2) {
        ++field6205;
        int var4 = this.field6209 * arg0 >> 12;
        int var5 = this.field6213 * arg2 >> 12;
        int var6 = this.field6204 * arg0 >> 12;
        int var7 = this.field6211 * arg2 >> 12;
        int var8 = this.field6202 * arg0 >> 12;
        if (!arg1) {
            int var9 = this.field6212 * arg2 >> 12;
            int var10 = this.field6208 * arg0 >> 12;
            int var11 = this.field6201 * arg2 >> 12;
            class111.method928(var4, var7, var5, var11, var9, -124, super.field6297, var6, var10, var8);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6209 = arg0;
        this.field6208 = arg6;
        this.field6213 = arg1;
        this.field6211 = arg3;
        this.field6204 = arg2;
        this.field6202 = arg4;
        this.field6212 = arg5;
        this.field6201 = arg7;
    }
}
