import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class46 {

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Z")
    public static boolean field750 = false;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Lfg;")
    public static class18 field747 = new class18(64);

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "Z")
    public static boolean field752 = false;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Lun;")
    public static class317 field753 = new class317();

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Z")
    public static boolean field754 = false;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLjava/lang/String;)I", line = 7)
    public static final int method374(byte arg0, String arg1) {
        field745++;
        if (arg0 > -45) {
            return 6;
        } else if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class284.field4255; var2++) {
                if (arg1.equalsIgnoreCase(class164.field2473[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 39)
    public static final void method375(int arg0) {
        field746++;
        int var1 = -32 % ((22 - arg0) / 54);
        for (class278 var2 = (class278) class276.field4153.method157((byte) -125); var2 != null; var2 = (class278) class276.field4153.method145(-108)) {
            if (class383.method2429(var2.field4182, 1512)) {
                class193.method1488(-2034, var2);
            }
        }
        if (class389.field5591 == 1) {
            class84.field1365 = false;
            class253.method1834(class32.field452, class305.field4451, false, class169.field2512, class63.field1024);
            return;
        }
        class253.method1834(class32.field452, class305.field4451, false, class169.field2512, class63.field1024);
        int var3 = class150.field2295.method1448(class391.field5712, -20814);
        for (class278 var4 = (class278) class276.field4153.method157((byte) -125); var4 != null; var4 = (class278) class276.field4153.method145(73)) {
            int var5 = class144.method1137(108, var4);
            if (var5 > var3) {
                var3 = var5;
            }
        }
        class305.field4451 = (class369.field5242 ? 26 : 22) + class389.field5591 * 16;
        class32.field452 = var3 + 8;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 87)
    public static void method376(boolean arg0) {
        if (arg0) {
            method378(-97);
        }
        field753 = null;
        field747 = null;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 103)
    public static final void method377(int arg0) {
        class18 var1 = class219.field3253;
        synchronized (class219.field3253) {
            int var2 = -43 / ((-arg0 - 32) / 62);
            class219.field3253.method112(0);
        }
        field749++;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 116)
    public static final void method378(int arg0) {
        if (arg0 <= 67) {
            field753 = null;
        }
        class349.field4961.method112(0);
        field748++;
        class264.field3974.method112(0);
    }
}
