import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class32 {

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "[Lj;")
    private class19[] field377;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lk;")
    public static class21 field376 = class14.method92((byte) 57, "Furnace");

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Lk;")
    public static class21 field380 = class14.method92((byte) 57, "???");

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "I")
    public static int field383 = -1;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Lk;")
    public static class21 field384 = class14.method92((byte) 57, "Estate Agent");

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Lk;")
    public static class21 field381 = class14.method92((byte) 57, "Mace Shop");

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "I")
    public static int field386 = 0;

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "J")
    private long field375;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lj;")
    private class19 field378;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field382;

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "[I")
    public static int[] field385;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "[Lma;")
    public static class26[] field379;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Component;BII)Li;", line = 24)
    public static final class17 method187(Component arg0, byte arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("w");
            class17 var5 = (class17) var4.getDeclaredConstructor().newInstance();
            if (arg1 < 12) {
                method187(null, (byte) -117, -109, 85);
            }
            var5.method98(127, arg0, arg2, arg3);
            return var5;
        } catch (Throwable var8) {
            class24 var7 = new class24();
            var7.method98(127, arg0, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(JBLj;)V", line = 82)
    public final void method188(long arg0, byte arg1, class19 arg2) {
        if (arg2.field241 != null) {
            arg2.method115(true);
        }
        class19 var5 = this.field377[(int) ((long) (this.field388 - 1) & arg0)];
        arg2.field238 = var5;
        if (arg1 > -54) {
            field379 = null;
        }
        arg2.field240 = arg0;
        arg2.field241 = var5.field241;
        arg2.field241.field238 = arg2;
        arg2.field238.field241 = arg2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(JI)Lj;", line = 109)
    public final class19 method189(long arg0, int arg1) {
        this.field375 = arg0;
        class19 var4 = this.field377[(int) ((long) (this.field388 - 1) & arg0)];
        if (arg1 > -90) {
            return (class19) null;
        }
        for (this.field378 = var4.field238; this.field378 != var4; this.field378 = this.field378.field238) {
            if (this.field378.field240 == arg0) {
                class19 var5 = this.field378;
                this.field378 = this.field378.field238;
                return var5;
            }
        }
        this.field378 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)Lj;", line = 138)
    public final class19 method190(byte arg0) {
        if (this.field378 == null) {
            return null;
        }
        class19 var2 = this.field377[(int) (this.field375 & (long) (this.field388 - 1))];
        while (this.field378 != var2) {
            if (this.field378.field240 == this.field375) {
                class19 var3 = this.field378;
                this.field378 = this.field378.field238;
                return var3;
            }
            this.field378 = this.field378.field238;
        }
        this.field378 = null;
        if (arg0 > -94) {
            field379 = null;
        }
        return null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)V", line = 184)
    public static void method191(boolean arg0) {
        field385 = null;
        field384 = null;
        field379 = null;
        field382 = null;
        field381 = null;
        if (arg0) {
            field376 = null;
            field380 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "(I)V", line = 198)
    public class32(int arg0) {
        this.field388 = arg0;
        this.field377 = new class19[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class19 var3 = this.field377[var2] = new class19();
            var3.field241 = var3;
            var3.field238 = var3;
        }
    }
}
