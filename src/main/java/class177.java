import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class177 {

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lia;")
    private class320 field2790 = new class320();

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lmm;")
    private class43 field2797 = new class43();

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    private int field2798;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lcn;")
    private class37 field2796;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[Lnc;")
    public static class171[] field2795 = new class171[2048];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2794 = "Select";

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public static int[] field2789 = new int[14];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "F")
    public static float field2785;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lkl;", line = 4)
    public static final class280 method1378(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class280 var4 = var3.field5065;
            var3.field5065 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1379(int arg0) {
        class81.field1169 = new class37(32);
        if (arg0 < -74) {
            field2783++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 29)
    public static void method1380(byte arg0) {
        field2795 = null;
        field2789 = null;
        field2794 = null;
        if (arg0 > -5) {
            field2795 = (class171[]) null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 41)
    public final void method1381(int arg0) {
        field2787++;
        this.field2797.method440(1906703368);
        if (arg0 >= -100) {
            method1378(-84, -8, -40);
        }
        this.field2796.method374(15975);
        this.field2790 = new class320();
        this.field2799 = this.field2798;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 56)
    public static final void method1382(int arg0) {
        field2792++;
        if (class261.field4005) {
            return;
        }
        if (class278.field4292) {
            class279.field4312 = (float) ((int) class279.field4312 + 47 & 0xFFFFFFF0);
        } else {
            class121.field1935 += (12.0F - class121.field1935) / 2.0F;
        }
        if (arg0 == -16) {
            class261.field4005 = true;
            class78.field1138 = true;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lwk;", line = 87)
    public final class172 method1383(int arg0) {
        field2784++;
        return arg0 == -10647 ? this.field2796.method371(-19139) : (class172) null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Lwk;", line = 98)
    public final class172 method1384(boolean arg0) {
        if (arg0) {
            field2793++;
            return this.field2796.method378((byte) -69);
        } else {
            return (class172) null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lia;BJ)V", line = 114)
    public final void method1385(class320 arg0, byte arg1, long arg2) {
        if (arg1 != -30) {
            return;
        }
        if (this.field2799 == 0) {
            class320 var5 = this.field2797.method445(arg1 + 32);
            var5.method1357(947647010);
            var5.method2262((byte) -102);
            if (this.field2790 == var5) {
                class320 var6 = this.field2797.method445(2);
                var6.method1357(947647010);
                var6.method2262((byte) -102);
            }
        } else {
            this.field2799--;
        }
        this.field2796.method375(arg0, arg2, -117);
        field2791++;
        this.field2797.method438(true, arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)Lia;", line = 149)
    public final class320 method1386(int arg0, long arg1) {
        field2788++;
        class320 var4 = (class320) this.field2796.method370((byte) -120, arg1);
        if (arg0 != -1) {
            this.method1386(73, -36L);
        }
        if (var4 != null) {
            this.field2797.method438(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 172)
    public static final void method1387(byte arg0) {
        class326.field5007.method656(0);
        field2786++;
        class353.field5639.method656(0);
        if (arg0 >= -20) {
            field2795 = (class171[]) null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V", line = 212)
    public class177(int arg0) {
        this.field2799 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2796 = new class37(var2);
    }
}
