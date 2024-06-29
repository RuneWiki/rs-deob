import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lcc;")
    public static class209 field1024 = class95.method669(86, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[I")
    public static int[] field1032 = new int[500];

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Z")
    public static boolean field1022 = true;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field1023;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Z")
    public static final boolean method392(int arg0, int arg1) {
        if (arg0 != 1) {
            field1028 = -117;
        }
        field1030++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1027++;
        int var7 = 38 % ((arg5 + 58) / 38);
        int var8 = class257.method1787(class102.field1957, arg6, 28, class155.field2847);
        int var9 = class257.method1787(class102.field1957, arg2, 28, class155.field2847);
        int var10 = class257.method1787(class262.field4723, arg4, 28, class230.field4184);
        int var11 = class257.method1787(class262.field4723, arg1, 28, class230.field4184);
        int var12 = class257.method1787(class102.field1957, arg0 + arg6, 28, class155.field2847);
        int var13 = class257.method1787(class102.field1957, arg2 - arg0, 28, class155.field2847);
        for (int var14 = var8; var14 < var12; var14++) {
            class176.method1215(var10, arg3, class252.field4543[var14], var11, (byte) -28);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class176.method1215(var10, arg3, class252.field4543[var15], var11, (byte) 114);
        }
        int var16 = class257.method1787(class262.field4723, arg0 + arg4, 28, class230.field4184);
        int var17 = class257.method1787(class262.field4723, arg1 - arg0, 28, class230.field4184);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class252.field4543[var18];
            class176.method1215(var10, arg3, var19, var16, (byte) -37);
            class176.method1215(var17, arg3, var19, var11, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)I")
    public static final int method394(int arg0, int arg1) {
        field1033++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else {
            if (arg1 != -28394) {
                method397(81, -113);
            }
            return arg0 == 140 ? 156 : arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field1023 = null;
        field1032 = null;
        if (arg0 != -67) {
            method394(-86, 2);
        }
        field1024 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ltf;Lcc;B)I")
    public static final int method396(class106 arg0, class209 arg1, byte arg2) {
        if (arg2 != 108) {
            method395((byte) -120);
        }
        field1029++;
        int var3 = arg0.field2085;
        arg0.method765(true, arg1.field3811);
        arg0.field2085 += class61.field1216.method1650(arg0.field2085, arg1.field3811, arg0.field2108, 0, arg1.field3786, (byte) 70);
        return arg0.field2085 - var3;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)Lcc;")
    public static final class209 method397(int arg0, int arg1) {
        if (arg1 == -193) {
            field1026++;
            return arg0 < 999999999 ? class66.method485(arg0, (byte) 56) : class187.field3382;
        } else {
            return null;
        }
    }
}
