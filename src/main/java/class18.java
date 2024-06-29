import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class18 extends class209 {

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Lrf;")
    public class45 field202;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Luf;")
    public static class168 field207 = class148.method1019(-1720, "Welt");

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Lk;")
    public static class36 field203 = new class36(64);

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[[I")
    public static int[][] field213 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "[I")
    public static int[] field212 = new int[32];

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "Luf;")
    private static class168 field210 = class148.method1019(-1720, "Ok");

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "Luf;")
    public static class168 field214 = field210;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "[I")
    public static int[] field211 = new int[256];

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "Ldk;")
    public static class241 field209;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ldk;Ldk;I)V", line = 10)
    public static final void method81(class241 arg0, class241 arg1, int arg2) {
        if (arg2 != 1) {
            method85(-72, -53);
        }
        class287.field4839 = arg0;
        field205++;
        class110.field1722 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 32)
    public static void method82(int arg0) {
        field207 = null;
        field210 = null;
        field203 = null;
        field211 = null;
        field212 = null;
        field213 = (int[][]) null;
        field214 = null;
        if (arg0 != 1) {
            field207 = (class168) null;
        }
        field209 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lrf;)V", line = 47)
    public class18(class45 arg0) {
        this.field202 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z", line = 56)
    public static final boolean method83(byte arg0, int arg1) {
        field208++;
        if (class151.field2351[arg1]) {
            return true;
        } else if (class288.field4852.method1632((byte) 63, arg1)) {
            int var2 = class288.field4852.method1633(-62, arg1);
            if (var2 == 0) {
                class151.field2351[arg1] = true;
                return true;
            }
            if (class272.field4582[arg1] == null) {
                class272.field4582[arg1] = new class242[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class272.field4582[arg1][var3] == null) {
                    byte[] var4 = class288.field4852.method1647(arg1, (byte) 120, var3);
                    if (var4 != null) {
                        class272.field4582[arg1][var3] = new class242();
                        class272.field4582[arg1][var3].field3996 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class272.field4582[arg1][var3].method1667(26906, new class153(var4));
                        } else {
                            class272.field4582[arg1][var3].method1668((byte) 0, new class153(var4));
                        }
                    }
                }
            }
            class151.field2351[arg1] = true;
            if (arg0 >= -49) {
                field203 = (class36) null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z", line = 120)
    public static final boolean method84(int arg0, int arg1, int arg2) {
        int var3 = class144.field2216[arg0][arg1][arg2];
        if (-class238.field3842 == var3) {
            return false;
        } else if (class238.field3842 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class174.method1258(var4 + 1, class227.field3686[arg0][arg1][arg2], var5 + 1) && class174.method1258(var4 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg2], var5 + 1) && class174.method1258(var4 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class174.method1258(var4 + 1, class227.field3686[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class144.field2216[arg0][arg1][arg2] = class238.field3842;
                return true;
            } else {
                class144.field2216[arg0][arg1][arg2] = -class238.field3842;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 150)
    public static final void method85(int arg0, int arg1) {
        if (arg0 != 1) {
            field214 = (class168) null;
        }
        class221.field3591.method1428(arg1, 29946);
        field206++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZI)I", line = 161)
    public static final int method86(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field204++;
        if (var4 == 0) {
            return arg1;
        }
        if (!arg2) {
            method85(-41, 73);
        }
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }
}
