import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class87 {

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Ljd;")
    public static class86 field1732 = class122.method868("<)4col>", true);

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Z")
    public static boolean field1721 = false;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[S")
    public static short[] field1728 = new short[] { 11, 23, 15, 22, 41, 25, 45, 47 };

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "[I")
    public static int[] field1735 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lbj;")
    public static class151 field1725;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lbj;")
    public static class151 field1727;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[[[B")
    public static byte[][][] field1734;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lbj;I)V")
    public static final void method635(class151 arg0, int arg1) {
        class177.field3204 = arg0;
        field1720++;
        class124.field2407 = class177.field3204.method1075(16, -124);
        if (arg1 != 1) {
            method641((byte) 11, (class86[]) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
    public final boolean method636(int arg0) {
        field1717++;
        if (arg0 == 0) {
            return (this.field1733 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 != -1) {
            field1727 = null;
        }
        field1729++;
        if (arg2 >= arg5) {
            return;
        }
        int var7 = (arg2 + arg5) / 2;
        class239 var8 = class209.field3783[var7];
        class209.field3783[var7] = class209.field3783[arg5];
        class209.field3783[arg5] = var8;
        int var9 = arg2;
        for (int var10 = arg2; var10 < arg5; var10++) {
            if (class207.method1472(arg4, arg3, arg6, var8, 1, arg0, class209.field3783[var10]) <= 0) {
                class239 var11 = class209.field3783[var10];
                class209.field3783[var10] = class209.field3783[var9];
                class209.field3783[var9++] = var11;
            }
        }
        class209.field3783[arg5] = class209.field3783[var9];
        class209.field3783[var9] = var8;
        method637(arg0, -1, arg2, arg3, arg4, var9 - 1, arg6);
        method637(arg0, arg1, var9 + 1, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method638(byte arg0) {
        if (arg0 <= 81) {
            method635((class151) null, 105);
        }
        field1724++;
        return (this.field1733 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1727 = null;
        field1734 = null;
        field1735 = null;
        field1725 = null;
        field1732 = null;
        int var1 = 56 % ((-arg0 - 56) / 61);
        field1728 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILbj;I)Lmk;")
    public static final class101 method640(boolean arg0, int arg1, class151 arg2, int arg3) {
        field1723++;
        if (arg0) {
            method639(-11);
        }
        return class163.method1181(arg2, arg3, 10475, arg1) ? class219.method1540((byte) -101) : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B[Ljd;)[Ljd;")
    public static final class86[] method641(byte arg0, class86[] arg1) {
        if (arg0 < 111) {
            method639(61);
        }
        field1719++;
        class86[] var2 = new class86[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class109.method783(2, new class86[] { class4.method26(false, var3), class38.field900 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class109.method783(2, new class86[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)Z")
    public final boolean method642(byte arg0) {
        field1731++;
        if (arg0 != 48) {
            this.method642((byte) -114);
        }
        return (this.field1733 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method643(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1726++;
        int var8 = class171.method1221(class56.field1143, class50.field1050, 21419, arg6);
        int var9 = class171.method1221(class56.field1143, class50.field1050, 21419, arg3);
        int var10 = class171.method1221(class129.field2473, class49.field1044, 21419, arg0);
        int var11 = class171.method1221(class129.field2473, class49.field1044, 21419, arg2);
        int var12 = class171.method1221(class56.field1143, class50.field1050, 21419, arg4 + arg6);
        int var13 = class171.method1221(class56.field1143, class50.field1050, 21419, arg3 - arg4);
        for (int var14 = var8; var14 < var12; var14++) {
            class56.method412(arg5, (byte) -126, var11, class249.field4420[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class56.method412(arg5, (byte) -102, var11, class249.field4420[var15], var10);
        }
        int var16 = class171.method1221(class129.field2473, class49.field1044, 21419, arg0 + arg4);
        int var17 = class171.method1221(class129.field2473, class49.field1044, 21419, arg2 - arg4);
        if (arg1 > -119) {
            method641((byte) -62, (class86[]) null);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class249.field4420[var18];
            class56.method412(arg5, (byte) -114, var16, var19, var10);
            class56.method412(arg7, (byte) -93, var17, var19, var16);
            class56.method412(arg5, (byte) -116, var11, var19, var17);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
    public final boolean method644(int arg0) {
        if (arg0 != 4) {
            method640(false, 33, (class151) null, 60);
        }
        field1718++;
        return (this.field1733 & 0x4) != 0;
    }
}
