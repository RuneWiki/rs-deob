import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class29 {

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "[Lw;")
    private class34[] field340;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "Ll;")
    public static class21 field337 = class28.method185(-20839, "Cookery Shop");

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Lp;")
    public static class27 field342 = new class27();

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "Ll;")
    public static class21 field343 = class28.method185(-20839, "Altar");

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Ll;")
    public static class21 field345 = class28.method185(-20839, "Dairy Churn");

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Ll;")
    public static class21 field347 = class28.method185(-20839, "Skirt Shop");

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "I")
    public static int field346 = -1;

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "J")
    private long field339;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lw;")
    private class34 field338;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[I")
    public static int[] field344;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)Lw;", line = 30)
    public final class34 method186(byte arg0) {
        if (this.field338 == null) {
            return null;
        }
        int var2 = -38 % ((-arg0 - 56) / 32);
        class34 var3 = this.field340[(int) (this.field339 & (long) (this.field341 - 1))];
        while (this.field338 != var3) {
            if (this.field338.field388 == this.field339) {
                class34 var4 = this.field338;
                this.field338 = this.field338.field384;
                return var4;
            }
            this.field338 = this.field338.field384;
        }
        this.field338 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BJ)Lw;", line = 63)
    public final class34 method187(byte arg0, long arg1) {
        this.field339 = arg1;
        if (arg0 != -61) {
            this.method187((byte) -17, -31L);
        }
        class34 var4 = this.field340[(int) ((long) (this.field341 - 1) & arg1)];
        for (this.field338 = var4.field384; this.field338 != var4; this.field338 = this.field338.field384) {
            if (this.field338.field388 == arg1) {
                class34 var5 = this.field338;
                this.field338 = this.field338.field384;
                return var5;
            }
        }
        this.field338 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V", line = 92)
    public static final void method188(boolean arg0) {
        class34.field389 = null;
        field344 = null;
        if (arg0) {
            class30.field355 = null;
            class18.field161 = null;
            class2.field12 = null;
            class31.field359 = null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IJLw;)V", line = 110)
    public final void method189(int arg0, long arg1, class34 arg2) {
        int var5 = -116 / ((arg0 + 13) / 39);
        if (arg2.field395 != null) {
            arg2.method209(17417);
        }
        class34 var6 = this.field340[(int) ((long) (this.field341 - 1) & arg1)];
        arg2.field395 = var6.field395;
        arg2.field384 = var6;
        arg2.field395.field384 = arg2;
        arg2.field384.field395 = arg2;
        arg2.field388 = arg1;
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "(I)V", line = 131)
    public class29(int arg0) {
        this.field341 = arg0;
        this.field340 = new class34[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class34 var3 = this.field340[var2] = new class34();
            var3.field384 = var3;
            var3.field395 = var3;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 161)
    public static void method190(int arg0) {
        field344 = null;
        field337 = null;
        if (arg0 >= -79) {
            field345 = null;
        }
        field345 = null;
        field347 = null;
        field342 = null;
        field343 = null;
    }
}
