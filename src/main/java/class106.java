import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class106 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1654 = 0;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field1659 = -1;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field1663 = -1;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
    public static boolean field1665 = true;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "J")
    public long field1668;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lfg;")
    public static class12 field1661;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lcc;")
    public static class222 field1666;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lnh;")
    public class55 field1664;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
    public static int[] field1662;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)Z")
    public static final boolean method803(byte[] arg0, int arg1) {
        field1652++;
        class31 var2 = new class31(arg0);
        int var3 = var2.method265(-97);
        if (~var3 != arg1) {
            return false;
        }
        boolean var4 = var2.method265(-88) == 1;
        if (var4) {
            class234.method1604(7875, var2);
        }
        class283.method1912(var2, 55);
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1662 = null;
        field1666 = null;
        if (arg0 != 25) {
            method804(-38);
        }
        field1661 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lcc;I)Z")
    public static final boolean method805(class222 arg0, int arg1) {
        field1667++;
        if (arg1 != 20574) {
            return false;
        } else if (arg0.field3421 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg0.field3421.length; var2++) {
                int var3 = class210.method1467((byte) -103, var2, arg0);
                int var4 = arg0.field3521[var2];
                if (arg0.field3421[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field3421[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg0.field3421[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
    public static final void method806(byte arg0, boolean arg1) {
        class102.method778(-9546);
        field1653++;
        if (class23.field382 != 30 && class23.field382 != 25 || arg0 < 73) {
            return;
        }
        class63.field997++;
        if (class63.field997 < 50 && !arg1) {
            return;
        }
        class63.field997 = 0;
        if (!class7.field121 && class301.field4848 != null) {
            class240.field3826.method1762(188, true);
            try {
                class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 124);
                class240.field3826.field541 = 0;
            } catch (IOException var2) {
                class7.field121 = true;
            }
            class7.field109++;
        }
        class102.method778(-9546);
    }
}
