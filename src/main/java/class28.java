import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class28 {

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "[Lq;")
    private class31[] field411;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Lea;")
    public static class10 field403 = class3.method8("Candle Shop", 110);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lea;")
    public static class10 field406 = class3.method8("Enter place name to find", 120);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Lea;")
    public static class10 field410 = class3.method8("Achievement Start", 92);

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "J")
    public static long field407;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "J")
    private long field408;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Lq;")
    private class31 field409;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)Lq;", line = 8)
    public final class31 method210(int arg0) {
        if (this.field409 == null) {
            return null;
        }
        class31 var2 = this.field411[(int) (this.field408 & (long) (this.field405 + arg0))];
        while (this.field409 != var2) {
            if (this.field409.field426 == this.field408) {
                class31 var3 = this.field409;
                this.field409 = this.field409.field423;
                return var3;
            }
            this.field409 = this.field409.field423;
        }
        this.field409 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)V", line = 41)
    public static final void method211(int arg0) {
        if (arg0 < -9 && class8.field61 != null) {
            class1 var1 = class8.field61;
            synchronized (class8.field61) {
                class8.field61 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Lq;ZJ)V", line = 63)
    public final void method212(class31 arg0, boolean arg1, long arg2) {
        if (arg0.field434 != null) {
            arg0.method222(101);
        }
        class31 var5 = this.field411[(int) (arg2 & (long) (this.field405 - 1))];
        arg0.field426 = arg2;
        arg0.field434 = var5.field434;
        arg0.field423 = var5;
        if (!arg1) {
            arg0.field434.field423 = arg0;
            arg0.field423.field434 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IJ)Lq;", line = 87)
    public final class31 method213(int arg0, long arg1) {
        this.field408 = arg1;
        if (arg0 != -29249) {
            this.method210(14);
        }
        class31 var4 = this.field411[(int) (arg1 & (long) (this.field405 - 1))];
        for (this.field409 = var4.field423; this.field409 != var4; this.field409 = this.field409.field423) {
            if (this.field409.field426 == arg1) {
                class31 var5 = this.field409;
                this.field409 = this.field409.field423;
                return var5;
            }
        }
        this.field409 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 149)
    public static void method214(byte arg0) {
        field403 = null;
        field406 = null;
        field410 = null;
        if (arg0 != 78) {
            field410 = null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(I)V", line = 167)
    public class28(int arg0) {
        this.field411 = new class31[arg0];
        this.field405 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class31 var3 = this.field411[var2] = new class31();
            var3.field434 = var3;
            var3.field423 = var3;
        }
    }
}
