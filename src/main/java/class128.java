import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class128 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1651 = new Rectangle[100];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "J")
    public static long field1650 = -1L;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[I")
    public static int[] field1656;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1658;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1651[var0] = new Rectangle();
        }
        field1656 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1657 = 0;
        field1659 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 5)
    public static final void method690(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field1652++;
        class194 var5 = class142.method769(arg2 - 6, arg3, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field2526 != null) {
            class425 var6 = new class425();
            var6.field6242 = var5;
            var6.field6228 = arg4;
            var6.field6240 = var5.field2526;
            var6.field6238 = arg0;
            class277.method1523(var6);
        }
        boolean var7 = true;
        if (var5.field2455 > 0) {
            var7 = class330.method1893(var5, (byte) 96);
        }
        if (!var7 || !client.method1410(var5).method1176(arg0 - 1, -108)) {
            return;
        }
        if (arg0 == 1) {
            class143.field1818++;
            class281.field3857.method295(20579, 49);
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(117, arg3);
        }
        if (arg0 == 2) {
            class281.field3857.method295(20579, 109);
            class416.field5987++;
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(126, arg3);
        }
        if (arg0 == 3) {
            class281.field3857.method295(20579, 242);
            class312.field4199++;
            class281.field3857.method1357(arg1, arg2 ^ 0x6CE3563D);
            class281.field3857.method1346(127, arg3);
        }
        if (arg0 == 4) {
            class187.field2360++;
            class281.field3857.method295(arg2 ^ 0x5066, 222);
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(120, arg3);
        }
        if (arg0 == arg2) {
            class281.field3857.method295(20579, 136);
            class99.field1168++;
            class281.field3857.method1357(arg1, arg2 + 1826838067);
            class281.field3857.method1346(123, arg3);
        }
        if (arg0 == 6) {
            class281.field3857.method295(20579, 26);
            class83.field910++;
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(117, arg3);
        }
        if (arg0 == 7) {
            class281.field3857.method295(20579, 130);
            class352.field4930++;
            class281.field3857.method1357(arg1, arg2 + 1826838067);
            class281.field3857.method1346(120, arg3);
        }
        if (arg0 == 8) {
            class312.field4200++;
            class281.field3857.method295(20579, 161);
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(122, arg3);
        }
        if (arg0 == 9) {
            class246.field3333++;
            class281.field3857.method295(20579, 168);
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(127, arg3);
        }
        if (arg0 == 10) {
            class155.field1963++;
            class281.field3857.method295(20579, 250);
            class281.field3857.method1357(arg1, 1826838072);
            class281.field3857.method1346(arg2 + 115, arg3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILam;Lal;)V", line = 132)
    public static final void method691(int arg0, class286 arg1, class369 arg2) {
        if (arg0 > -16) {
            field1651 = null;
        }
        class83.field929 = arg1;
        class333.field4429 = arg2;
        field1655++;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 151)
    public static void method692(byte arg0) {
        if (arg0 >= -48) {
            field1658 = -54;
        }
        field1651 = null;
        field1656 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public abstract void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public abstract void method346(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvm;I)V")
    public abstract void method352(class322 arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Z")
    public abstract boolean method345(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public abstract class321 method355(class322 arg0, boolean arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILvm;)Z")
    public abstract boolean method344(int arg0, int arg1, int arg2, class322 arg3);
}
