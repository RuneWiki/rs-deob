import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class155 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lvl;")
    private class13[] field2515;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2514 = -1;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "J")
    private long field2516;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lvl;")
    private class13 field2517;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JB)Lvl;", line = 4)
    public final class13 method1190(long arg0, byte arg1) {
        this.field2516 = arg0;
        field2512++;
        class13 var4 = this.field2515[(int) ((long) (this.field2511 - 1) & arg0)];
        for (this.field2517 = var4.field241; this.field2517 != var4; this.field2517 = this.field2517.field241) {
            if (this.field2517.field235 == arg0) {
                class13 var5 = this.field2517;
                this.field2517 = this.field2517.field241;
                return var5;
            }
        }
        if (arg1 <= 0) {
            this.field2517 = null;
        }
        this.field2517 = null;
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lvl;IJ)V", line = 34)
    public final void method1191(class13 arg0, int arg1, long arg2) {
        field2510++;
        if (arg1 != -8098) {
            this.field2517 = null;
        }
        if (arg0.field238 != null) {
            arg0.method115(true);
        }
        class13 var5 = this.field2515[(int) (arg2 & (long) (this.field2511 - 1))];
        arg0.field238 = var5.field238;
        arg0.field241 = var5;
        arg0.field238.field241 = arg0;
        arg0.field241.field238 = arg0;
        arg0.field235 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V", line = 72)
    public class155(int arg0) {
        this.field2515 = new class13[arg0];
        this.field2511 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class13 var3 = this.field2515[var2] = new class13();
            var3.field241 = var3;
            var3.field238 = var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Lvl;", line = 99)
    public final class13 method1192(boolean arg0) {
        field2518++;
        if (this.field2517 == null) {
            return null;
        } else if (arg0) {
            class13 var2 = this.field2515[(int) (this.field2516 & (long) (this.field2511 - 1))];
            while (this.field2517 != var2) {
                if (this.field2517.field235 == this.field2516) {
                    class13 var3 = this.field2517;
                    this.field2517 = this.field2517.field241;
                    return var3;
                }
                this.field2517 = this.field2517.field241;
            }
            this.field2517 = null;
            return null;
        } else {
            return null;
        }
    }
}
