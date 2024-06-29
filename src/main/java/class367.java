import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class367 {

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Ld;")
    private class102 field5541;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lvf;")
    private class103 field5544;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lrp;")
    private class298 field5546;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Liv;")
    public static class64 field5537 = new class64(56, 4);

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lgr;")
    public static class296 field5543 = new class296(9, 7);

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Lef;")
    public static class335 field5547 = new class335(4, 1, 1, 1);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lcu;")
    private class145 field5538;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "Luu;")
    public static class187 field5545;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lao;")
    public static class188 field5550;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[Lbk;")
    private class253[] field5540;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILjava/lang/Class;)Lnu;", line = 6)
    public static final class417 method2294(int arg0, int arg1, int arg2, Class arg3) {
        class429 var4 = class380.field5761[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class166 var5 = var4.field6364; var5 != null; var5 = var5.field2572) {
            class417 var6 = var5.field2576;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6231 == arg1 && var6.field6238 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILsk;Lsk;)Lbk;", line = 45)
    public final class253 method2295(byte arg0, int arg1, class438 arg2, class438 arg3) {
        field5548++;
        if (arg0 != 55) {
            this.method2297((byte) -75);
        }
        return this.method2298(arg1, true, (byte) 109, arg2, arg3);
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lvf;Ld;)V", line = 56)
    public class367(class103 arg0, class102 arg1) {
        this.field5541 = arg1;
        this.field5544 = arg0;
        if (!this.field5544.method772(-21)) {
            this.field5546 = this.field5544.method773(255, (byte) 0, 1, true, 255);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z", line = 68)
    public final boolean method2296(int arg0) {
        field5539++;
        if (this.field5538 != null) {
            return true;
        }
        if (arg0 < 40) {
            this.method2297((byte) 44);
        }
        if (this.field5546 == null) {
            if (this.field5544.method772(-21)) {
                return false;
            }
            this.field5546 = this.field5544.method773(255, (byte) 0, 1, true, 255);
        }
        if (this.field5546.field4053) {
            return false;
        } else {
            this.field5538 = new class145(this.field5546.method1445((byte) 120));
            this.field5540 = new class253[(this.field5538.field2270.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 98)
    public final void method2297(byte arg0) {
        field5549++;
        if (this.field5540 == null || arg0 <= 118) {
            return;
        }
        for (int var2 = 0; var2 < this.field5540.length; var2++) {
            if (this.field5540[var2] != null) {
                this.field5540[var2].method1623(-1);
            }
        }
        for (int var3 = 0; var3 < this.field5540.length; var3++) {
            if (this.field5540[var3] != null) {
                this.field5540[var3].method1625(1276117928);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZBLsk;Lsk;)Lbk;", line = 135)
    private final class253 method2298(int arg0, boolean arg1, byte arg2, class438 arg3, class438 arg4) {
        field5542++;
        if (this.field5538 == null) {
            throw new RuntimeException();
        }
        this.field5538.field2289 = arg0 * 8 + 5;
        if (this.field5538.field2289 >= this.field5538.field2270.length) {
            throw new RuntimeException();
        } else if (this.field5540[arg0] == null) {
            int var6 = this.field5538.method1070(-32387);
            if (arg2 < 43) {
                field5550 = null;
            }
            int var7 = this.field5538.method1070(-32387);
            class253 var8 = new class253(arg0, arg4, arg3, this.field5544, this.field5541, var6, var7, arg1);
            this.field5540[arg0] = var8;
            return var8;
        } else {
            return this.field5540[arg0];
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 177)
    public static void method2299(int arg0) {
        field5550 = null;
        field5545 = null;
        if (arg0 == 11239) {
            field5537 = null;
            field5543 = null;
            field5547 = null;
        }
    }
}
