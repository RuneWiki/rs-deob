import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class151 extends class356 {

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public int field1719 = 0;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "[B")
    public static byte[] field1723 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "Z")
    public static boolean field1724 = false;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIB)Z", line = 6)
    public static final boolean method828(int arg0, int arg1, byte arg2) {
        field1721++;
        if (arg2 >= -122) {
            method829(16, 113, 111);
        }
        return ((arg1 & 0x2000) != 0 | class529.method3020(false, arg0, arg1) | class518.method2956(arg1, true, arg0)) & class43.method216(arg1, arg0, 2048);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III)Z", line = 17)
    public static final boolean method829(int arg0, int arg1, int arg2) {
        if (arg1 != -26559) {
            field1723 = null;
        }
        field1720++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLiaa;)Luf;", line = 31)
    public static final class408 method830(byte arg0, class452 arg1) {
        field1718++;
        class352 var2 = class620.method3478(arg1, 36068);
        int var3 = arg1.method2574(-1758460248);
        int var4 = arg1.method2574(arg0 ^ 0x68CFF93E);
        if (arg0 != -106) {
            return null;
        }
        int var5 = arg1.method2574(-1758460248);
        int var6 = arg1.method2574(-1758460248);
        int var7 = arg1.method2574(arg0 ^ 0x68CFF93E);
        int var8 = arg1.method2574(-1758460248);
        return new class408(var2.field4605, var2.field4608, var2.field4610, var2.field4612, var2.field4617, var2.field4607, var2.field4609, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILiaa;)V", line = 58)
    private final void method831(int arg0, int arg1, class452 arg2) {
        if (arg1 == 2) {
            this.field1719 = arg2.method2574(-1758460248);
        }
        if (arg0 >= 51) {
            field1717++;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Liaa;B)V", line = 75)
    public final void method832(class452 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2541(81);
            if (var3 == 0) {
                if (arg1 < 61) {
                    return;
                }
                field1722++;
                return;
            }
            this.method831(107, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V", line = 102)
    public static void method833(int arg0) {
        int var1 = -45 % ((arg0 + 85) / 41);
        field1723 = null;
    }
}
