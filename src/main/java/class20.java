import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 {

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "[Lpa;")
    private class30[] field189;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "Ld;")
    public static class7 field192 = class37.method242("Requesting", 1333943984);

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "Ld;")
    public static class7 field194 = class37.method242("Crafting Shop", 1333943984);

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "I")
    public static volatile int field195 = -1;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "I")
    public static volatile int field193 = 0;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "Ld;")
    public static class7 field197 = class37.method242("Makeover Mage", 1333943984);

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "Ld;")
    public static class7 field199 = class37.method242("Hunter Training", 1333943984);

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "J")
    private long field188;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Lpa;")
    private class30 field191;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field190;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lpa;JI)V", line = 5)
    public final void method137(class30 arg0, long arg1, int arg2) {
        if (arg0.field447 != null) {
            arg0.method214(1);
        }
        class30 var5 = this.field189[(int) (arg1 & (long) (this.field198 - 1))];
        arg0.field447 = var5.field447;
        arg0.field446 = var5;
        arg0.field447.field446 = arg0;
        if (arg2 != -9435) {
            this.method137(null, -74L, -47);
        }
        arg0.field444 = arg1;
        arg0.field446.field447 = arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)Lpa;", line = 55)
    public final class30 method138(int arg0) {
        if (this.field191 == null) {
            return null;
        }
        class30 var2 = this.field189[(int) (this.field188 & (long) (this.field198 + arg0))];
        while (this.field191 != var2) {
            if (this.field191.field444 == this.field188) {
                class30 var3 = this.field191;
                this.field191 = this.field191.field446;
                return var3;
            }
            this.field191 = this.field191.field446;
        }
        this.field191 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)V", line = 83)
    public static void method139(int arg0) {
        field192 = null;
        field197 = null;
        field190 = null;
        field194 = null;
        int var1 = 55 % ((43 - arg0) / 53);
        field199 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(JI)Lpa;", line = 108)
    public final class30 method140(long arg0, int arg1) {
        this.field188 = arg0;
        class30 var4 = this.field189[(int) ((long) (this.field198 - arg1) & arg0)];
        for (this.field191 = var4.field446; this.field191 != var4; this.field191 = this.field191.field446) {
            if (this.field191.field444 == arg0) {
                class30 var5 = this.field191;
                this.field191 = this.field191.field446;
                return var5;
            }
        }
        this.field191 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(I)V", line = 143)
    public class20(int arg0) {
        this.field189 = new class30[arg0];
        this.field198 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class30 var3 = this.field189[var2] = new class30();
            var3.field446 = var3;
            var3.field447 = var3;
        }
    }
}
