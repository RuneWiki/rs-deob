import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class142 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Loc;")
    private static class99 field3503 = class48.method402((byte) -104, "Walk here");

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Loc;")
    public static class99 field3510 = field3503;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Loc;")
    private static class99 field3502 = class48.method402((byte) -104, "glow2:");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Loc;")
    public static class99 field3500 = class48.method402((byte) -104, "mapfunction");

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Loc;")
    public static class99 field3518 = class48.method402((byte) -104, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Loc;")
    public static class99 field3506 = class48.method402((byte) -104, "leuchten2:");

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Loc;")
    public static class99 field3516 = class48.method402((byte) -104, "mapscene");

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Loc;")
    public static class99 field3520 = class48.method402((byte) -104, " )2>");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Loc;")
    public static class99 field3508 = field3502;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Loc;")
    public static class99 field3515 = class48.method402((byte) -104, "Einloggen");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Loc;")
    public static class99 field3504 = field3502;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Loc;")
    public static class99 field3519 = class48.method402((byte) -104, "scape main");

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[I")
    public static int[] field3513 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Lpc;")
    public static class105 field3521;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3507;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        field3503 = null;
        field3513 = null;
        field3504 = null;
        field3508 = null;
        field3515 = null;
        field3520 = null;
        if (arg0 != 0) {
            field3506 = null;
        }
        field3502 = null;
        field3519 = null;
        field3506 = null;
        field3507 = null;
        field3521 = null;
        field3518 = null;
        field3510 = null;
        field3500 = null;
        field3516 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ[B)I")
    public static final int method1160(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field3511++;
        int var4 = -1;
        if (arg2) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                var4 = var4 >>> 8 ^ class110.field2728[(var4 ^ arg3[var5]) & 0xFF];
            }
            return ~var4;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)[Ljc;")
    public static final class64[] method1161(int arg0) {
        field3514++;
        class64[] var1 = new class64[field3501];
        for (int var2 = arg0; var2 < field3501; var2++) {
            class64 var3 = var1[var2] = new class64();
            var3.field1685 = class81.field1999;
            var3.field1683 = class47.field1150;
            var3.field1682 = class5.field96[var2];
            var3.field1684 = class74.field1887[var2];
            var3.field1687 = class95.field2319[var2];
            var3.field1681 = class119.field2929[var2];
            int var4 = var3.field1687 * var3.field1681;
            byte[] var5 = class86.field2142[var2];
            var3.field1686 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field1686[var6] = class21.field508[class17.method171(var5[var6], 255)];
            }
        }
        class89.method746(arg0 + 124);
        return var1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1162(int arg0, Component arg1) {
        field3509++;
        arg1.addMouseListener(class45.field1070);
        arg1.addMouseMotionListener(class45.field1070);
        if (arg0 != 0) {
            method1161(23);
        }
        arg1.addFocusListener(class45.field1070);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lle;")
    public static final class81 method1163(int arg0, int arg1) {
        field3522++;
        class81 var2 = (class81) class125.field2991.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -105) {
            method1163(63, 22);
        }
        byte[] var3 = class9.field235.method903(12, (byte) -128, arg1);
        class81 var4 = new class81();
        if (var3 != null) {
            var4.method696(-1, new class57(var3));
        }
        var4.method706(31);
        class125.field2991.method993((byte) 100, (long) arg1, var4);
        return var4;
    }
}
