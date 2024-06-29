import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class64 extends class129 {

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public int field1690 = 1000;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Lmc;")
    public static class75 field1682 = class30.method234(true, "null");

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "Lmc;")
    public static class75 field1693 = class30.method234(true, "runes");

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lmc;")
    public static class75 field1688 = null;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lmc;")
    private static class75 field1692 = class30.method234(true, "Connecting to friendserver");

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lmc;")
    private static class75 field1694 = class30.method234(true, "Enter message to send to ");

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lmc;")
    public static class75 field1689 = field1692;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "Lmc;")
    public static class75 field1683 = field1694;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "[I")
    public static int[] field1696 = new int[4000];

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lmc;")
    public static class75 field1700 = class30.method234(true, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "[I")
    public static int[] field1702 = new int[5];

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "Lmc;")
    public static class75 field1701 = class30.method234(true, ":");

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "Laa;")
    public static class2 field1698;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "Lja;")
    public static class55 field1686;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "Loe;")
    public static class89 field1699;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "[Laa;")
    public static class2[] field1685;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 17)
    public static void method560(byte arg0) {
        field1698 = null;
        field1692 = null;
        field1689 = null;
        field1686 = null;
        field1685 = null;
        field1693 = null;
        field1702 = null;
        field1701 = null;
        field1688 = null;
        field1696 = null;
        field1694 = null;
        field1682 = null;
        field1683 = null;
        if (arg0 != -119) {
            method564(18, 6);
        }
        field1699 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Lpc;", line = 48)
    public class93 method561(boolean arg0) {
        field1697++;
        if (arg0) {
            method560((byte) 103);
        }
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BZIII)V", line = 98)
    public static final void method562(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1691++;
        if (class37.field887 == null) {
            return;
        }
        if (arg4 < 16) {
            method560((byte) -16);
        }
        if (class91.field2233 >= 0) {
            arg2 -= 20;
            if (arg2 < 1) {
                arg2 = 1;
            }
            class74.field1848 = arg2;
            if (class91.field2233 == 0) {
                class68.field1728 = 0;
            } else {
                int var5 = class104.method858((byte) -44, class91.field2233);
                int var6 = var5 - class31.field697;
                class68.field1728 = (var6 + class68.field1728 + 3600 - 1) / class68.field1728;
            }
            class55.field1390 = arg0;
            class59.field1535 = arg1;
            class43.field1035 = arg3;
        } else if (class74.field1848 == 0) {
            class1.method1(arg1, (byte) -125, arg3, arg0);
        } else {
            class55.field1390 = arg0;
            class43.field1035 = arg3;
            class59.field1535 = arg1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Lj;", line = 150)
    public static final class54 method563(int arg0) {
        int var1 = 37 % ((arg0 - 25) / 37);
        field1687++;
        class54 var2 = new class54(class43.field1031, class100.field2592, class36.field880, class85.field2109, class118.field2924);
        class41.method317(7);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Lob;", line = 163)
    public static final class86 method564(int arg0, int arg1) {
        field1681++;
        if (arg0 < 32) {
            return null;
        }
        class86 var2 = (class86) class41.field992.method559((long) arg1, -117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1747.method436(arg1, 5, 13);
        class86 var4 = new class86();
        var4.field2113 = arg1;
        if (var3 != null) {
            var4.method719(new class61(var3), 82);
        }
        class41.field992.method558((long) arg1, var4, 304);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILp;I)V", line = 191)
    public static final void method565(int arg0, class90 arg1, int arg2) {
        field1695++;
        if (arg0 != -29172) {
            method562(null, false, 5, 56, -86);
        }
        if (class82.field2042 == null) {
            class107.method879(255, 0, 255, true, arg0 + 29141, (byte) 0, null);
            class21.field416[arg2] = arg1;
        } else {
            class82.field2042.field1556 = arg2 * 4 + 5;
            int var3 = class82.field2042.method496((byte) 122);
            arg1.method745(0, var3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V", line = 225)
    public void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class93 var10 = this.method561(false);
        field1684++;
        if (var10 != null) {
            this.field1690 = var10.field1690;
            var10.method566(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
