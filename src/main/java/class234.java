import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class234 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lce;")
    public static class126 field3948 = class206.method1445(-7923, "::");

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lce;")
    public static class126 field3950 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field3954 = -1;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Luc;")
    public static class14 field3955 = new class14(0, 0);

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[Z")
    public static boolean[] field3956 = new boolean[100];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lcc;")
    public static class313 field3952;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method1591(boolean arg0) {
        class23.field333++;
        field3949++;
        class103.field1645.method1238(39, 99);
        for (class65 var1 = (class65) class16.field222.method1630((byte) 56); var1 != null; var1 = (class65) class16.field222.method1632(-53)) {
            if (var1.field1099 == 0) {
                class257.method1744(var1, 1819444368, true);
            }
        }
        if (!arg0) {
            field3956 = (boolean[]) null;
        }
        if (class64.field1084 != null) {
            class23.method114(class64.field1084, (byte) 94);
            class64.field1084 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1592(byte arg0) {
        field3947++;
        int var1 = class317.field5430 >> 7;
        class144.field2618 &= 0x7FF;
        if (class292.field4832 < 128) {
            class292.field4832 = 128;
        }
        int var2 = class119.field1999 >> 7;
        if (class292.field4832 > 383) {
            class292.field4832 = 383;
        }
        int var3 = class174.method1265(class119.field1999, 8100, class131.field2250, class317.field5430);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class131.field2250;
                    if (var7 < 3 && (class301.field4992[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class85.field1353[var7][var5][var6] & 0xFF) * 8 + var3 - class264.field4396[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class195.field3353) {
            class195.field3353 += (var9 - class195.field3353) / 24;
        } else if (class195.field3353 > var9) {
            class195.field3353 += (var9 - class195.field3353) / 80;
        }
        if (arg0 > -75) {
            method1591(false);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 122)
    public static void method1593(int arg0) {
        field3948 = null;
        field3956 = null;
        field3955 = null;
        int var1 = 44 / ((arg0 + 80) / 38);
        field3950 = null;
        field3952 = null;
    }
}
