import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class281 extends class147 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[Z")
    public static boolean[][] field4090 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field4095 = 1;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lec;")
    public static class40 field4092 = new class40("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Lsd;")
    public static class74 field4096 = new class74(93, -1);

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
    public static int[] field4097 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1763(boolean arg0) {
        field4092 = null;
        field4090 = null;
        field4096 = null;
        field4097 = null;
        if (!arg0) {
            method1770(67, 11, 8, (byte) -41, true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z", line = 16)
    public final boolean method1764(int arg0, byte arg1) {
        field4085++;
        if (arg1 < 108) {
            return true;
        } else {
            return (this.field4087 >> arg0 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method1765(int arg0) {
        field4091++;
        if (arg0 != -14793) {
            field4095 = -92;
        }
        return (this.field4087 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z", line = 43)
    public final boolean method1766(byte arg0) {
        field4086++;
        if (arg0 == 36) {
            return (this.field4087 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILoj;ILvf;)V", line = 55)
    public static final void method1767(int arg0, int arg1, class280 arg2, int arg3, class166 arg4) {
        class118.field1467.method813(0);
        field4083++;
        if (class187.field2525) {
            return;
        }
        for (class21 var5 = (class21) arg4.method802((byte) 112); var5 != null; var5 = (class21) arg4.method806((byte) 104)) {
            class334 var6 = class429.field6187.method1898(36, var5.field295);
            if (class300.method1888(true, var6)) {
                boolean var7 = class481.method2839(var6, false, arg1, var5, arg3, arg2);
                if (var7) {
                    class351.method2126(var6, (byte) 83, arg2, var5);
                }
            }
        }
        if (arg0 <= 17) {
            method1763(false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I", line = 90)
    public final int method1768(int arg0) {
        if (arg0 != -30065) {
            this.method1764(89, (byte) -84);
        }
        field4088++;
        return class230.method1271(this.field4087, 16384);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)I", line = 106)
    public final int method1769(byte arg0) {
        field4084++;
        if (arg0 < 56) {
            field4090 = null;
        }
        return (this.field4087 & 0x1DE792) >> 18;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIBZ)V", line = 117)
    public static final void method1770(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (class375.field5347 == 0) {
            class137.method649(arg3 + 76, false);
        } else {
            class445.field6336 = class375.field5347;
            class331.method2015((byte) -128, 0);
        }
        field4093++;
        class353.field5072 = arg4;
        class215.field2963 = arg1;
        class340.field4881 = arg2;
        if (arg3 != 18) {
            method1763(true);
        }
        class429.method2565(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z", line = 139)
    public final boolean method1771(int arg0) {
        field4089++;
        if (arg0 != 0) {
            method1763(true);
        }
        return (this.field4087 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V", line = 162)
    public class281(int arg0, int arg1) {
        this.field4094 = arg1;
        this.field4087 = arg0;
    }
}
