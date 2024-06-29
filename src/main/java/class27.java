import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 {

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "[Lp;")
    private class29[] field354;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Lj;")
    public static class17 field351 = class30.method190(-118, "Quest Start");

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Lj;")
    public static class17 field356 = class30.method190(-103, "Overview");

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "Lj;")
    public static class17 field357 = class30.method190(-128, "Requesting ");

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lj;")
    public static class17 field353 = class30.method190(-126, "Estate Agent");

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "Lj;")
    public static class17 field360 = class30.method190(-125, "Switch to ");

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lj;")
    public static class17 field349 = class30.method190(-100, "Amulet Shop");

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "Lj;")
    public static class17 field361 = class30.method190(-116, "Fishing Shop");

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "J")
    private long field359;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Lp;")
    private class29 field355;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[I")
    public static int[] field350;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)Lp;", line = 9)
    public final class29 method178(int arg0) {
        if (this.field355 == null) {
            return null;
        }
        class29 var2 = this.field354[(int) (this.field359 & (long) (this.field358 + arg0))];
        while (this.field355 != var2) {
            if (this.field355.field377 == this.field359) {
                class29 var3 = this.field355;
                this.field355 = this.field355.field383;
                return var3;
            }
            this.field355 = this.field355.field383;
        }
        this.field355 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 39)
    public static void method179(byte arg0) {
        field353 = null;
        if (arg0 != 19) {
            return;
        }
        field356 = null;
        field361 = null;
        field360 = null;
        field357 = null;
        field350 = null;
        field351 = null;
        field349 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BLp;J)V", line = 75)
    public final void method180(byte arg0, class29 arg1, long arg2) {
        int var5 = 65 / ((arg0 + 83) / 32);
        if (arg1.field374 != null) {
            arg1.method186(false);
        }
        class29 var6 = this.field354[(int) (arg2 & (long) (this.field358 - 1))];
        arg1.field377 = arg2;
        arg1.field383 = var6;
        arg1.field374 = var6.field374;
        arg1.field374.field383 = arg1;
        arg1.field383.field374 = arg1;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(JB)Lp;", line = 104)
    public final class29 method181(long arg0, byte arg1) {
        this.field359 = arg0;
        if (arg1 > -102) {
            this.method181(-4L, (byte) 106);
        }
        class29 var4 = this.field354[(int) (arg0 & (long) (this.field358 - 1))];
        for (this.field355 = var4.field383; this.field355 != var4; this.field355 = this.field355.field383) {
            if (this.field355.field377 == arg0) {
                class29 var5 = this.field355;
                this.field355 = this.field355.field383;
                return var5;
            }
        }
        this.field355 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(I)V", line = 174)
    public class27(int arg0) {
        this.field358 = arg0;
        this.field354 = new class29[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class29 var3 = this.field354[var2] = new class29();
            var3.field383 = var3;
            var3.field374 = var3;
        }
    }
}
