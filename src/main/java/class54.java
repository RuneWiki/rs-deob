import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class54 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Z")
    public static boolean field796 = false;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[[B")
    public static byte[][] field798 = new byte[1000][];

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[[I")
    public static int[][] field800 = new int[128][128];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lhh;")
    public static class84 field801;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -1) {
            return;
        }
        field799++;
        if (arg1 == arg6) {
            class29.method246(arg1, arg7, arg5, arg0, (byte) 125, arg2, arg4);
        } else if (arg5 - arg1 >= class322.field4945 && (arg5 + arg1) <= class145.field2134 && arg4 - arg6 >= class229.field3347 && arg4 + arg6 <= class156.field2366) {
            class519.method3068(arg6, arg1, arg2, arg7, arg4, arg0, false, arg5);
        } else {
            class410.method2535(arg2, arg1, arg0, arg4, arg3 ^ 0xFFFFFF8F, arg7, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z", line = 36)
    public static final boolean method391(int arg0) {
        if (arg0 == 1) {
            field802++;
            return class43.field655 == 0 ? class23.field420.method2102(8759) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZLjava/lang/String;Loa;)V", line = 52)
    public static final void method392(byte arg0, boolean arg1, String arg2, class488 arg3) {
        field797++;
        int var4 = 108 / ((arg0 - 79) / 34);
        byte var5 = 4;
        int var6 = var5 + 6;
        int var7 = var5 + 6;
        int var8 = class42.field639.method101(null, arg2, 250, 0);
        int var9 = class42.field639.method97(250, arg2, 24619, null) * 13;
        class394.field5821.method471(var6 - var5, -var5 + var7, var8 + var5 + var5, var5 + var9 + var5, -16777216, 0);
        class394.field5821.method516(var6 - var5, -var5 + var7, var5 + var8 + var5, var5 + var9 + var5, -1, 0);
        arg3.method2915(null, 1, var8, var9, null, -1, (byte) -119, 0, null, 0, arg2, 0, var6, 1, -1, var7);
        class346.method2246(var7 - var5, -var5 + var6, (byte) -93, var5 + var8 + var5, var5 + var5 + var9);
        if (arg1) {
            class394.field5821.method521();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method393(boolean arg0) {
        class205.field2957 = null;
        class436.field6341 = null;
        class402.field5901 = null;
        class342.field5219 = null;
        class57.field829 = null;
        field793++;
        class113.field1797 = null;
        class267.field3856 = null;
        class364.field5482 = null;
        if (arg0) {
            return;
        }
        class86.field1431 = null;
        class55.field808 = null;
        class18.field283 = null;
        class317.field4545 = null;
        class526.field7731 = null;
        class125.field1923 = null;
        class507.field7414 = null;
        class122.field1911 = null;
        class319.field4561 = null;
        class74.field1239 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I", line = 118)
    public static final int method394(int arg0, int arg1, byte arg2) {
        if (arg2 != 27) {
            method394(70, 95, (byte) 121);
        }
        field795++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 145)
    public static void method395(int arg0) {
        if (arg0 != -27336) {
            method393(false);
        }
        field800 = null;
        field801 = null;
        field798 = null;
    }
}
