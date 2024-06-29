import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class637 implements class178 {

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lvp;")
    private class190 field8747;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "[Laaa;")
    private class617[] field8753;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[I")
    public static int[] field8748 = new int[4];

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
    public static boolean field8754 = false;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field8757 = 0;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lej;")
    public static class124 field8756 = new class124(76, 4);

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field8760 = 0;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Lwea;")
    public static class158 field8758;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lha;")
    private class59 field8751;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Z")
    private boolean field8752;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)V", line = 3)
    public static void method3621(int arg0) {
        if (arg0 == 76) {
            field8748 = null;
            field8758 = null;
            field8756 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)V", line = 15)
    public static final void method3622(int arg0) {
        field8744++;
        if (arg0 <= -55) {
            class618.field8423 = new class324(class497.field6895.method2936(class607.field8336, 544), "", class130.field2184, 1004, -1, 0L, 0, 0, true, false, 0L, true);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 28)
    public final void method562(int arg0) {
        field8745++;
        if (class272.field3822 != this.field8751) {
            this.field8751 = class272.field3822;
            this.field8752 = true;
        }
        this.field8751.method220(0);
        class617[] var2 = this.field8753;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class617 var4 = var2[var3];
            if (var4 != null) {
                var4.method1474(10286);
            }
        }
        if (arg0 <= 84) {
            this.method558((byte) 2, 40L);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V", line = 61)
    public final void method566(boolean arg0, int arg1) {
        field8759++;
        boolean var3 = true;
        class617[] var4 = this.field8753;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class617 var6 = var4[var5];
            if (var6 != null) {
                var6.method1475((byte) -49, var3 || this.field8752);
            }
        }
        if (arg1 > -69) {
            method3621(-38);
        }
        this.field8752 = false;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 94)
    public final void method563(int arg0) {
        field8749++;
        if (arg0 != -9719) {
            field8756 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I", line = 114)
    public final int method557(byte arg0) {
        field8750++;
        if (arg0 != -58) {
            this.method566(false, -122);
        }
        return this.field8747.field2828;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)Loga;", line = 127)
    public static final class474 method3623(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5567;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BJ)Z", line = 137)
    public final boolean method558(byte arg0, long arg1) {
        field8746++;
        if (arg0 < 30) {
            method3623(-81, 10, -115);
        }
        return class554.method3190(-97) >= (arg1 + ((long) this.field8747.field2831));
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lvp;Lmia;)V", line = 150)
    public class637(class190 arg0, class62 arg1) {
        this.field8747 = arg0;
        this.field8753 = new class617[this.field8747.field2829.length];
        for (int var3 = 0; var3 < this.field8753.length; var3++) {
            this.field8753[var3] = arg1.method657(true, this.field8747.field2829[var3]);
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)I", line = 168)
    public final int method560(int arg0) {
        if (arg0 != -19079) {
            this.method566(false, 116);
        }
        field8755++;
        int var2 = 0;
        class617[] var3 = this.field8753;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class617 var5 = var3[var4];
            if (var5 == null || var5.method1470((byte) -121)) {
                var2++;
            }
        }
        return var2 * 100 / this.field8753.length;
    }
}
