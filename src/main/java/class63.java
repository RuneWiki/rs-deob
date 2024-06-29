import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class45 {

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "[S")
    private short[] field1648 = new short[6];

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public int field1651 = -1;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "[I")
    private int[] field1649 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "[S")
    private short[] field1640 = new short[6];

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Z")
    public boolean field1644 = false;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Lkd;")
    public static class73 field1645 = class126.method1070((byte) -66, "leuchten2:");

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Ljb;")
    public static class64 field1647 = new class64(64);

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "Lkd;")
    private static class73 field1659 = class126.method1070((byte) -66, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "Lkd;")
    public static class73 field1658 = class126.method1070((byte) -66, "p12_full");

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lkd;")
    public static class73 field1657 = field1659;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lua;")
    public static class137 field1660;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "Lde;")
    public static class27 field1656;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)Lje;")
    public final class67 method523(byte arg0) {
        field1639++;
        if (this.field1653 == null) {
            return null;
        }
        class67[] var2 = new class67[this.field1653.length];
        if (arg0 >= -73) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1653.length; var3++) {
            var2[var3] = class67.method562(class36.field1005, this.field1653[var3], 0);
        }
        class67 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class67(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1640[var5] != 0; var5++) {
            var4.method569(this.field1640[var5], this.field1648[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        field1655++;
        if (this.field1653 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1653.length; var3++) {
            if (!class36.field1005.method909(this.field1653[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqc;I)V")
    public final void method525(class114 arg0, int arg1) {
        field1654++;
        while (true) {
            int var3 = arg0.method957((byte) 19);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field1663 = 126;
                    return;
                }
            }
            this.method528(var3, arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Z")
    public final boolean method526(int arg0) {
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1649[var3] != -1 && !class36.field1005.method909(this.field1649[var3], 0, 0)) {
                var2 = false;
            }
        }
        field1642++;
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZB)V")
    public static final void method527(boolean arg0, byte arg1) {
        class92.method771((byte) 50);
        if (arg1 != 80) {
            method531(76);
        }
        field1643++;
        class122.field3117++;
        if (class122.field3117 < 50 && !arg0) {
            return;
        }
        class122.field3117 = 0;
        if (class25.field728 || class31.field862 == null) {
            return;
        }
        class121.field3079.method1215(-93, 150);
        try {
            class31.field862.method1143(5000, 0, class121.field3079.field2880, class121.field3079.field2816);
            class121.field3079.field2816 = 0;
        } catch (IOException var2) {
            class25.field728 = true;
        }
        class137.field3433++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILqc;B)V")
    private final void method528(int arg0, class114 arg1, byte arg2) {
        field1652++;
        if (arg0 == 1) {
            this.field1651 = arg1.method957((byte) 52);
        } else if (arg0 == 2) {
            int var4 = arg1.method957((byte) 54);
            this.field1653 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1653[var5] = arg1.method944((byte) 116);
            }
        } else if (arg0 == 3) {
            this.field1644 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field1640[arg0 - 40] = (short) arg1.method944((byte) 115);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field1648[arg0 - 50] = (short) arg1.method944((byte) 122);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1649[arg0 - 60] = arg1.method944((byte) 117);
        }
        int var6 = -62 % ((arg2 + 62) / 58);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1657 = null;
        field1660 = null;
        field1656 = null;
        field1647 = null;
        if (arg0 != -27026) {
            method529(110);
        }
        field1658 = null;
        field1659 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Lje;")
    public final class67 method530(byte arg0) {
        field1650++;
        class67[] var2 = new class67[5];
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -64) {
            field1662 = 56;
        }
        while (var4 < 5) {
            if (this.field1649[var4] != -1) {
                var2[var3++] = class67.method562(class36.field1005, this.field1649[var4], 0);
            }
            var4++;
        }
        class67 var5 = new class67(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1640[var6] != 0; var6++) {
            var5.method569(this.field1640[var6], this.field1648[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static final void method531(int arg0) {
        class70.field1768 = new class131(32);
        if (arg0 != 0) {
            method529(-109);
        }
        field1641++;
    }
}
