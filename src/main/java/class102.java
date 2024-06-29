import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class102 extends class270 {

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "Lmh;")
    public static class62 field1677 = class201.method1405(true, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "Lmh;")
    public static class62 field1675 = class201.method1405(true, "Ausw-=hlen");

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "Lmh;")
    private static class62 field1676 = class201.method1405(true, "Attack");

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "Lmh;")
    private static class62 field1683 = class201.method1405(true, "yellow:");

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "Lmh;")
    public static class62 field1678 = field1683;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "Lmh;")
    public static class62 field1679 = field1676;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "Lmh;")
    public static class62 field1682 = field1683;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "Lmh;")
    public static class62 field1685 = class201.method1405(true, "Benutzen");

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    public static int field1689 = -1;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "Lsk;")
    public static class199 field1688 = new class199(4);

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "Lmh;")
    public static class62 field1690 = class201.method1405(true, "settings");

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmi;II)V", line = 7)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        field1686++;
        int var4 = 15 % ((-arg2 - 8) / 53);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/Object;Lgi;)V", line = 22)
    public static final void method807(int arg0, Object arg1, class285 arg2) {
        field1681++;
        if (arg2.field4885 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field4885.peekEvent() != null; var3++) {
            class99.method792(-1, 1L);
        }
        if (arg0 != 24777) {
            method808(-62, false, -89);
        }
        if (arg1 != null) {
            arg2.field4885.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)I", line = 67)
    public static final int method808(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method808(3, true, 55);
        }
        class272 var3 = (class272) class222.field3829.method311((byte) 114, (long) arg2);
        field1684++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field4627.length) {
            return var3.field4627[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)[[I", line = 88)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            field1679 = (class62) null;
        }
        field1680++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                var7[var11] = 4096 - var8[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(B)V", line = 133)
    public static final void method809(byte arg0) {
        if (arg0 != 97) {
            field1683 = (class62) null;
        }
        for (int var1 = 0; var1 < class71.field1084; var1++) {
            class200 var2 = class110.method843((byte) -76, var1);
            if (var2 != null && var2.field3377 == 0) {
                class24.field275[var1] = 0;
                class222.field3877[var1] = 0;
            }
        }
        class269.field4567 = new class49(16);
        field1672++;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 165)
    public static void method810(int arg0) {
        field1678 = null;
        field1688 = null;
        field1690 = null;
        field1676 = null;
        field1683 = null;
        if (arg0 < 75) {
            method811((byte) 63, (class285) null);
        }
        field1677 = null;
        field1679 = null;
        field1682 = null;
        field1685 = null;
        field1675 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I", line = 194)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            field1687 = -14;
        }
        field1671++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLgi;)[Llc;", line = 237)
    public static final class304[] method811(byte arg0, class285 arg1) {
        field1674++;
        int var2 = 29 / ((arg0 + 3) / 39);
        if (!arg1.method1941(3)) {
            return new class304[0];
        }
        class147 var3 = arg1.method1942(-39);
        while (var3.field2322 == 0) {
            class99.method792(-1, 10L);
        }
        if (var3.field2322 == 2) {
            return new class304[0];
        }
        int[] var4 = (int[]) ((int[]) var3.field2323);
        class304[] var5 = new class304[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class304 var7 = new class304();
            var5[var6] = var7;
            var7.field5226 = var4[var6 << 2];
            var7.field5233 = var4[(var6 << 2) + 1];
            var7.field5224 = var4[(var6 << 2) + 2];
            var7.field5234 = var4[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 286)
    public class102() {
        super(1, false);
    }
}
