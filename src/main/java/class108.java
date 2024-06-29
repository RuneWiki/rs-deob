import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class108 extends class187 {

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1670 = "Loading...";

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Ljh;")
    public static class207 field1674 = null;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "F")
    public static float field1662;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 5)
    public static final long method723(String arg0, int arg1) {
        field1656++;
        long var2 = 0L;
        if (arg1 >= -5) {
            return 98L;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Z", line = 49)
    public final boolean method724(byte arg0, int arg1) {
        field1663++;
        if (arg0 < 96) {
            this.field1661 = -46;
        }
        return (this.field1664 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z", line = 60)
    public final boolean method725(byte arg0) {
        if (arg0 > -18) {
            return false;
        } else {
            field1671++;
            return ((this.field1664 & 0x21E7346B) >> 29) != 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)Z", line = 73)
    public final boolean method726(byte arg0) {
        field1673++;
        if (arg0 == 99) {
            return (this.field1664 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIIII)I", line = 86)
    public static final int method727(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1666++;
        if (!arg0) {
            field1672 = -112;
        }
        int var5 = 65536 - class12.field127[arg3 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILwf;)V", line = 104)
    public static final void method728(int arg0, class306 arg1) {
        class315.field4963 = arg1;
        if (arg0 != 17642) {
            field1672 = -70;
        }
        field1669++;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)Z", line = 117)
    public final boolean method729(int arg0) {
        field1660++;
        if (arg0 == -1) {
            return (this.field1664 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)Z", line = 133)
    public final boolean method730(boolean arg0) {
        field1667++;
        if (arg0) {
            return (this.field1664 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(Z)Z", line = 144)
    public final boolean method731(boolean arg0) {
        if (!arg0) {
            field1662 = -1.484693F;
        }
        field1668++;
        return (this.field1664 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I", line = 160)
    public final int method732(int arg0) {
        if (arg0 == 8494) {
            field1659++;
            return this.field1664 >> 18 & 0x7;
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I", line = 171)
    public final int method733(int arg0) {
        if (arg0 == -162680420) {
            field1657++;
            return class212.method1419((byte) -90, this.field1664);
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V", line = 181)
    public class108(int arg0, int arg1) {
        this.field1664 = arg0;
        this.field1661 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)Z", line = 193)
    public final boolean method734(int arg0) {
        field1665++;
        if (arg0 == 18546) {
            return (this.field1664 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 204)
    public static void method735(byte arg0) {
        if (arg0 >= 126) {
            field1670 = null;
            field1674 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V", line = 217)
    public static final void method736(int arg0, int arg1, int arg2) {
        field1658++;
        if (arg1 != 0) {
            method736(-124, -80, -122);
        }
        class75 var3 = class204.method1371(13, 7, arg2);
        var3.method524((byte) 57);
        var3.field1122 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Z", line = 242)
    public final boolean method737(byte arg0) {
        field1675++;
        if (arg0 > -17) {
            return false;
        } else {
            return (this.field1664 >> 30 & 0x1) != 0;
        }
    }
}
