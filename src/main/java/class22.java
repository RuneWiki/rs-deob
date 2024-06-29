import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "La;")
    public static class1 field634 = new class1();

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lrd;")
    private static class117 field637 = class95.method812("Connection timed out)3", (byte) 8);

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lrd;")
    public static class117 field647 = null;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lrd;")
    public static class117 field646 = field637;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field642 = 78;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lrd;")
    public static class117 field643 = class95.method812("scape main", (byte) 8);

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lrd;")
    private static class117 field645 = class95.method812(" more options", (byte) 8);

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lrd;")
    public static class117 field651 = class95.method812("Freunde)2Server)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lrd;")
    private static class117 field652 = class95.method812("Password: ", (byte) 8);

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lrd;")
    public static class117 field650 = class95.method812("null", (byte) 8);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lrd;")
    public static class117 field640 = field645;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lrd;")
    public static class117 field649 = class95.method812("backbase1", (byte) 8);

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lrd;")
    public static class117 field653 = field652;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Laa;")
    public static class2 field648 = new class2(4096);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BJ)V")
    public static final void method247(byte arg0, long arg1) {
        field641++;
        try {
            if (arg0 == -85) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public static final void method248(int arg0, int arg1, int arg2, int arg3) {
        class144 var4 = class84.method761(arg2, arg1, arg0);
        field635++;
        if (var4 != null && var4.field3430 != null) {
            class118.method980((byte) 87, var4.field3430, var4, 0, 0, null, 0);
        }
        class105.field2630 = arg0;
        class84.field2201 = arg3;
        class46.field1292 = true;
        class46.field1306 = arg2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lod;")
    public static final class99 method249(int arg0) {
        if (arg0 != 0) {
            method250(false, null);
        }
        field644++;
        try {
            return (class99) Class.forName("pb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLwa;)[I")
    public static final int[] method250(boolean arg0, class144 arg1) {
        field636++;
        int var2 = arg1.field3441 >> 16;
        if (!arg0) {
            field650 = null;
        }
        if (!class40.method463(-119, var2)) {
            return null;
        }
        int var3 = arg1.field3536;
        int var4 = arg1.field3423;
        int var5 = arg1.field3509;
        while (var5 != -1) {
            class144 var7 = class77.field2090[var2][var5 & 0xFFFF];
            var4 += var7.field3423 - var7.field3543;
            var5 = var7.field3509;
            var3 += var7.field3536 - var7.field3457;
        }
        return new int[] { var3, var4 };
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILdc;)V")
    public static final void method251(int arg0, int arg1, class25 arg2) {
        if (class85.field2236 < arg2.field729) {
            class117.method940(true, arg2);
        } else if (class85.field2236 <= arg2.field730) {
            class121.method992(arg2, false);
        } else {
            class66.method661(2, arg2);
        }
        if (arg2.field717 < 128 || arg2.field751 < 128 || arg2.field717 >= 13184 || arg2.field751 >= 13184) {
            arg2.field751 = arg2.field708[0] * 128 + arg2.field689 * 64;
            arg2.field732 = -1;
            arg2.field730 = 0;
            arg2.field717 = arg2.field739[0] * 128 + arg2.field689 * 64;
            arg2.field703 = -1;
            arg2.field729 = 0;
            arg2.method263(arg0 - 113);
        }
        field639++;
        if (arg0 != 0) {
            return;
        }
        if (class144.field3516 == arg2 && (arg2.field717 < 1536 || arg2.field751 < 1536 || arg2.field717 >= 11776 || arg2.field751 >= 11776)) {
            arg2.field730 = 0;
            arg2.field717 = arg2.field739[0] * 128 + arg2.field689 * 64;
            arg2.field729 = 0;
            arg2.field732 = -1;
            arg2.field751 = arg2.field708[0] * 128 + arg2.field689 * 64;
            arg2.field703 = -1;
            arg2.method263(-16);
        }
        class67.method666(-120, arg2);
        class140.method1124((byte) -93, arg2);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method252(int arg0) {
        field637 = null;
        field652 = null;
        field649 = null;
        field640 = null;
        field643 = null;
        if (arg0 != 0) {
            field634 = null;
        }
        field650 = null;
        field647 = null;
        field634 = null;
        field646 = null;
        field645 = null;
        field651 = null;
        field648 = null;
        field653 = null;
    }
}
