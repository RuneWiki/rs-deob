import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class102 {

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static volatile int field1705 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    public static int[] field1694 = new int[200];

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lda;")
    public static class275 field1704 = class255.method1672(121, "::clientjs5drop");

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lda;")
    public static class275 field1700 = class255.method1672(99, "leuchten1:");

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method729(int arg0) {
        field1693++;
        int var1 = -107 / ((arg0 - 77) / 37);
        if (class91.field1548 != null) {
            class90 var2 = class91.field1548;
            synchronized (class91.field1548) {
                class91.field1548 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method730(int arg0) {
        if (arg0 == 16777215) {
            class143.field2511.method987((byte) 54);
            field1699++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZILda;)V")
    public static final void method731(boolean arg0, int arg1, class275 arg2) {
        byte var3 = 4;
        field1706++;
        int var4 = var3 + 6;
        int var5 = class99.field1666.method129(arg2, 250);
        int var6 = class99.field1666.method108(arg2, 250) * 13;
        int var7 = var3 + 6;
        int var8 = -107 % ((41 - arg1) / 45);
        class47.method299(var4 - var3, -var3 + var7, var3 + var5 + var3, var6 - -var3 - -var3, 0);
        class47.method298(var4 - var3, -var3 + var7, var3 + var5 + var3, var3 + var6 + var3, 16777215);
        class99.field1666.method131(arg2, var4, var7, var5, var6, 16777215, -1, 1, 1, 0);
        method733(var3 + var6 + var3, var4 - var3, var3 + var5 + var3, (byte) -77, var7 - var3);
        if (!arg0) {
            class192.method1260(-29, var7, var6, var5, var4);
            return;
        }
        try {
            Graphics var9 = class93.field1601.getGraphics();
            class240.field4215.method1018(0, 0, (byte) 104, var9);
        } catch (Exception var10) {
            class93.field1601.repaint();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZZI)V")
    public static final void method732(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class228.method1475(0, (byte) -27, arg4, arg2, arg0, arg3, class148.field2582.length - 1);
        field1697++;
        int var5 = -96 / ((43 - arg1) / 39);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class102() {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIBI)V")
    public static final void method733(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 0;
        if (arg3 != -77) {
            method734(-56);
        }
        while (var5 < class123.field2203) {
            if (arg1 < (class114.field2015[var5] + class114.field2021[var5]) && class114.field2015[var5] < (arg1 + arg2) && class38.field627[var5] + class211.field3571[var5] > arg4 && arg4 + arg0 > class38.field627[var5]) {
                class200.field3418[var5] = true;
            }
            var5++;
        }
        field1695++;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lfh;)V")
    public class102(class102 arg0) {
        this.field1703 = arg0.field1703;
        this.field1702 = arg0.field1702;
        this.field1692 = arg0.field1692;
        this.field1696 = arg0.field1696;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method734(int arg0) {
        if (arg0 != 200) {
            method730(91);
        }
        field1704 = null;
        field1700 = null;
        field1694 = null;
    }
}
