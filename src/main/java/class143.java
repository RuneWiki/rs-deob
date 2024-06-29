import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class143 extends class78 {

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public int field2259 = 0;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lea;")
    public static class204 field2250 = new class204();

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field2254 = 128;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2258 = "Members object";

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field2256 = -1;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Z")
    public static boolean field2261 = false;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Z")
    public static boolean field2252;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "[I")
    public static int[] field2253;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "[S")
    public static short[] field2257;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILpe;B)V", line = 5)
    private final void method1089(int arg0, class101 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field2259 = arg1.method731(false);
        }
        field2251++;
        if (arg2 != 56) {
            field2257 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIILdg;IJ)Z", line = 20)
    public static final boolean method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class320 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class128.method960(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lob;B)V", line = 41)
    public static final void method1091(class292 arg0, byte arg1) {
        if (class33.field549 == arg0.field4591) {
            class30.field502[arg0.field4593] = true;
        }
        if (arg1 >= 35) {
            field2260++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsd;B)V", line = 57)
    public static final void method1092(class27 arg0, byte arg1) {
        if (arg1 == 25) {
            field2249++;
            class230.field3656 = arg0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILpe;)V", line = 86)
    public final void method1093(int arg0, class101 arg1) {
        field2255++;
        while (true) {
            int var3 = arg1.method741(75);
            if (var3 == 0) {
                if (arg0 != 24484) {
                    field2256 = -52;
                }
                return;
            }
            this.method1089(var3, arg1, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V", line = 120)
    public static void method1094(int arg0) {
        if (arg0 != 9676) {
            field2252 = true;
        }
        field2250 = null;
        field2258 = null;
        field2253 = null;
        field2257 = null;
    }
}
