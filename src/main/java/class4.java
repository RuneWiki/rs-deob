import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public int field66 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public int field68 = 0;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lsd;")
    private static class166 field69 = class135.method935("Please wait 1 minute and try again)3", 0);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lsd;")
    public static class166 field62 = field69;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lsd;")
    public static class166 field81 = field69;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lsd;")
    private static class166 field74 = class135.method935("Examine", 0);

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lsd;")
    public static class166 field79 = field74;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lnh;")
    public static class125 field80 = new class125();

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lsd;")
    public static class166 field86 = class135.method935("nav", 0);

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lsd;")
    public static class166 field87 = class135.method935(" <col=ffffff>", 0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Led;")
    public class42 field63;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lf;")
    public static class47 field72;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Z")
    public static boolean field88;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILre;BIII)V")
    public static final void method24(int arg0, class158 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field75++;
        if (arg1 == null || arg2 != 14) {
            return;
        }
        int var6 = client.field515 + class132.field2590 & 0x7FF;
        int var7 = arg0 * arg0 + arg4 * arg4;
        if (var7 > 6400) {
            return;
        }
        int var8 = class40.field717[var6];
        int var9 = var8 * 256 / (class193.field3731 + 256);
        int var10 = class40.field719[var6];
        int var11 = var10 * 256 / (class193.field3731 + 256);
        int var12 = arg4 * var9 + arg0 * var11 >> 16;
        int var13 = arg4 * var11 - arg0 * var9 >> 16;
        if (var7 <= 2500) {
            arg1.method1055(arg5 + var12 + 94 + 4 - arg1.field3013 / 2, -var13 + 83 + -4 + arg3 + -(arg1.field3011 / 2));
        } else {
            arg1.method1067(class95.field1832, arg5 + var12 + 4 + 94 - arg1.field3013 / 2, -(arg1.field3011 / 2) + -4 + 83 + -var13 + arg3);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lf;Lf;Lf;B)V")
    public static final void method25(class47 arg0, class47 arg1, class47 arg2, byte arg3) {
        if (arg3 == -52) {
            class178.field3375 = arg2;
            class61.field1241 = arg1;
            class203.field4010 = arg0;
            field67++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method26(int arg0) {
        field80 = null;
        if (arg0 != -30683) {
            method27(18, -111, -104, (byte) -65, 47, 24, 72, 38, 118);
        }
        field79 = null;
        field62 = null;
        field86 = null;
        field72 = null;
        field69 = null;
        field74 = null;
        field87 = null;
        field81 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method27(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field71++;
        if (class169.method1169(arg1, 0)) {
            if (arg3 != -73) {
                method25(null, null, null, (byte) 43);
            }
            class69.field1405 = null;
            class57.method485(arg7, arg6, arg4, class63.field1309[arg1], (byte) -111, arg8, -1, arg5, arg2, arg0);
            if (class69.field1405 != null) {
                class57.method485(arg7, arg6, class14.field247, class69.field1405, (byte) -94, arg8, -1412584499, class178.field3373, arg2, arg0);
                class69.field1405 = null;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class30.field556[var9] = true;
            }
        } else {
            class30.field556[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public static final void method28(int arg0, int arg1, int arg2) {
        field78++;
        class195 var3 = class180.method1215(arg2, (byte) 116);
        int var4 = var3.field3864;
        int var5 = var3.field3863;
        int var6 = var3.field3870;
        int var7 = class206.field4047[var6 - var5];
        if (arg1 < arg0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class91.field1785[var4] = class6.method42(class22.method151(var8, arg1 << var5), class22.method151(~var8, class91.field1785[var4]));
    }
}
