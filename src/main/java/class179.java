import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class179 extends class116 {

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lda;")
    private static class275 field3073 = class255.method1672(94, "glow2:");

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lda;")
    public static class275 field3076 = field3073;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field3082 = 0;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lda;")
    public static class275 field3086 = field3073;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lda;")
    public static class275 field3083 = class255.method1672(101, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILfb;II)V")
    public static final void method1202(int arg0, class109 arg1, int arg2, int arg3) {
        if (arg2 != -2695) {
            field3083 = null;
        }
        if (arg1.field1776 == arg3 && arg3 != -1) {
            class215 var4 = class201.method1321(arg2 + 2823, arg3);
            int var5 = var4.field3671;
            if (var5 == 1) {
                arg1.field1749 = arg0;
                arg1.field1740 = 0;
                arg1.field1780 = 0;
                arg1.field1744 = 0;
                class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1740, var4);
            }
            if (var5 == 2) {
                arg1.field1744 = 0;
            }
        } else if (arg3 == -1 || arg1.field1776 == -1 || class201.method1321(128, arg3).field3662 >= class201.method1321(128, arg1.field1776).field3662) {
            arg1.field1781 = arg1.field1791;
            arg1.field1740 = 0;
            arg1.field1780 = 0;
            arg1.field1776 = arg3;
            arg1.field1744 = 0;
            arg1.field1749 = arg0;
            if (arg1.field1776 != -1) {
                class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, arg1.field1740, class201.method1321(arg2 ^ 0xFFFFF5F9, arg1.field1776));
            }
        }
        field3081++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public abstract void method717(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        if (arg0 < -2) {
            field3083 = null;
            field3076 = null;
            field3086 = null;
            field3073 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public final void method1204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3074++;
        int var6 = this.field3079 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field3080 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method718(var8, var6, var9, var7, arg0, arg4);
        if (arg1 > -5) {
            this.method1204(3, -46, -127, -100, 96);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
    public abstract void method1205(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIII)V")
    public abstract void method721(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    public static final void method1206(byte arg0) {
        class173.field3005 = new class229[class96.field1638.method773(true)][];
        class52.field867 = new boolean[class96.field1638.method773(true)];
        field3077++;
        if (arg0 <= 19) {
            method1203((byte) -100);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
    public abstract void method728(int arg0, int arg1);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public abstract void method719(int arg0, int arg1);
}
