import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class267 extends class15 {

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field4522 = 0;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "Z")
    public static boolean field4526 = false;

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    public static int field4529 = 0;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Loa;")
    public static class302 field4519 = new class302(0, 0);

    @OriginalMember(owner = "client!tl", name = "bb", descriptor = "Z")
    public static boolean field4534 = false;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "Lce;")
    public class126 field4523;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "[I")
    public int[] field4521;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "[I")
    public int[] field4527;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "[Lce;")
    public class126[] field4525;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "[Lsi;")
    public class237[] field4531;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Lwd;I)V", line = 7)
    public static final void method1803(int arg0, class112[] arg1, int arg2) {
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class112 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1780 == 0) {
                    if (var4.field1810 != null) {
                        method1803(0, var4.field1810, arg2);
                    }
                    class65 var5 = (class65) class16.field222.method1631(false, (long) var4.field1833);
                    if (var5 != null) {
                        class266.method1793(arg2, false, var5.field1097);
                    }
                }
                if (arg2 == 0 && var4.field1828 != null) {
                    class282 var6 = new class282();
                    var6.field4697 = var4;
                    var6.field4699 = var4.field1828;
                    class309.method2111(var6, 200000);
                }
                if (arg2 == 1 && var4.field1792 != null) {
                    if (var4.field1875 >= 0) {
                        class112 var7 = class252.method1706(5157, var4.field1833);
                        if (var7 == null || var7.field1810 == null || var7.field1810.length <= var4.field1875 || var7.field1810[var4.field1875] != var4) {
                            continue;
                        }
                    }
                    class282 var8 = new class282();
                    var8.field4699 = var4.field1792;
                    var8.field4697 = var4;
                    class309.method2111(var8, 200000);
                }
            }
        }
        field4533++;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 92)
    public static void method1804(int arg0) {
        field4519 = null;
        if (arg0 != 23047) {
            method1805((class126) null, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lce;B)V", line = 102)
    public static final void method1805(class126 arg0, byte arg1) {
        class23.field321 = arg0;
        field4518++;
        if (class161.field2907.field2705 == null) {
            return;
        }
        try {
            class126 var2 = class9.field111.method880((byte) -106, class161.field2907.field2705);
            class126 var3 = class137.field2386.method880((byte) -83, class161.field2907.field2705);
            class126 var4 = class12.method69(new class126[] { var2, class16.field226, arg0, class102.field1637, var3 }, (byte) 123);
            if (arg1 > -112) {
                return;
            }
            class126 var5;
            if (arg0.method878((byte) 33) == 0) {
                var5 = class12.method69(new class126[] { var4, class290.field4807 }, (byte) 121);
            } else {
                var5 = class12.method69(new class126[] { var4, class90.field1420, class273.method1832(class261.method1765(16299) + 94608000000L, 10), class63.field1071, class98.method665(94608000L, 91) }, (byte) 117);
            }
            class12.method69(new class126[] { class213.field3625, var5, class4.field27 }, (byte) 120).method851(class161.field2907.field2705, (byte) 119);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)I", line = 147)
    public static final int method1806(byte arg0) {
        int var1 = 16 / ((30 - arg0) / 56);
        field4517++;
        return class98.field1587;
    }
}
