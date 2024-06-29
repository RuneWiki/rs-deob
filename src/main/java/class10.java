import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 {

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "[Lm;")
    private class25[] field102;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ls;")
    public static class34 field100 = class9.method35("Hunter Training", 220);

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ls;")
    public static class34 field99 = class9.method35("Dungeon", 220);

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Ls;")
    public static class34 field101 = class9.method35("(U", 220);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Ls;")
    public static class34 field97 = class9.method35("null", 220);

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "J")
    private long field104;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Lm;")
    private class25 field105;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field103;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJ)Lm;", line = 10)
    public final class25 method38(int arg0, long arg1) {
        this.field104 = arg1;
        if (arg0 > -50) {
            return (class25) null;
        }
        class25 var4 = this.field102[(int) (arg1 & (long) (this.field98 - 1))];
        for (this.field105 = var4.field255; this.field105 != var4; this.field105 = this.field105.field255) {
            if (this.field105.field265 == arg1) {
                class25 var5 = this.field105;
                this.field105 = this.field105.field255;
                return var5;
            }
        }
        this.field105 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lg;", line = 40)
    public static final class13 method39(Throwable arg0, String arg1) {
        class13 var2;
        if (arg0 instanceof class13) {
            var2 = (class13) arg0;
            var2.field124 = var2.field124 + ' ' + arg1;
        } else {
            var2 = new class13(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)Lm;", line = 69)
    public final class25 method40(int arg0) {
        if (this.field105 == null) {
            return null;
        }
        class25 var2 = this.field102[(int) ((long) (this.field98 - 1) & this.field104)];
        int var3 = -40 % ((arg0 - 70) / 39);
        while (this.field105 != var2) {
            if (this.field105.field265 == this.field104) {
                class25 var4 = this.field105;
                this.field105 = this.field105.field255;
                return var4;
            }
            this.field105 = this.field105.field255;
        }
        this.field105 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILm;J)V", line = 99)
    public final void method41(int arg0, class25 arg1, long arg2) {
        if (arg1.field257 != null) {
            arg1.method134(0);
        }
        class25 var5 = this.field102[(int) ((long) (this.field98 + arg0) & arg2)];
        arg1.field257 = var5.field257;
        arg1.field255 = var5;
        arg1.field265 = arg2;
        arg1.field257.field255 = arg1;
        arg1.field255.field257 = arg1;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V", line = 139)
    public static void method42(int arg0) {
        if (arg0 != 32) {
            method42(-18);
        }
        field103 = null;
        field99 = null;
        field97 = null;
        field100 = null;
        field101 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(I)V", line = 159)
    public class10(int arg0) {
        this.field98 = arg0;
        this.field102 = new class25[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class25 var3 = this.field102[var2] = new class25();
            var3.field255 = var3;
            var3.field257 = var3;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/awt/Component;BI)Lla;", line = 184)
    public static final class24 method43(int arg0, Component arg1, byte arg2, int arg3) {
        if (arg2 >= -109) {
            field103 = null;
        }
        try {
            Class var4 = Class.forName("ma");
            class24 var5 = (class24) var4.getDeclaredConstructor().newInstance();
            var5.method49(arg1, arg3, 93, arg0);
            return var5;
        } catch (Throwable var8) {
            class12 var7 = new class12();
            var7.method49(arg1, arg3, -92, arg0);
            return var7;
        }
    }
}
