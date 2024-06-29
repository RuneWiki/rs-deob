import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lmga;")
    private class666 field535 = new class666(64);

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lmga;")
    public class666 field554 = new class666(50);

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lmga;")
    public class666 field555 = new class666(5);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lbi;")
    public class449 field536;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lpca;")
    public class671 field548;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Z")
    public boolean field539;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lbi;")
    private class449 field538;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lcu;")
    public static class206 field547 = new class206(65, 3);

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lxa;")
    public static class468 field550;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Ljava/awt/Font;")
    public static Font field552;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lci;")
    public final class419 method277(int arg0, byte arg1) {
        field549++;
        class666 var3 = this.field535;
        class419 var4;
        synchronized (this.field535) {
            var4 = (class419) this.field535.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field538;
        byte[] var6;
        synchronized (this.field538) {
            var6 = this.field538.method2537(false, class709.method3904(arg0, 508080135), class669.method3757((byte) -101, arg0));
        }
        class419 var7 = new class419();
        var7.field5741 = this;
        var7.field5725 = arg0;
        if (arg1 != -52) {
            this.method288((byte) -54);
        }
        if (var6 != null) {
            var7.method2393(new class335(var6), -1);
        }
        var7.method2392(-1);
        class666 var8 = this.field535;
        synchronized (this.field535) {
            this.field535.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILrba;)V")
    public static final void method278(int arg0, class402 arg1) {
        class319.field4368.method3265(arg1, (byte) -68);
        field534++;
        arg1.field5349 = arg1.field5354.field4619;
        arg1.field5354.field4619 = arg0;
        class249.field3451 += arg1.field5349;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        class666 var2 = this.field535;
        synchronized (this.field535) {
            this.field535.method3748(arg0 - 27574);
            if (arg0 != 27580) {
                field551 = 91;
            }
        }
        field540++;
        class666 var3 = this.field554;
        synchronized (this.field554) {
            this.field554.method3748(arg0 - 27574);
        }
        class666 var4 = this.field555;
        synchronized (this.field555) {
            this.field555.method3748(arg0 - 27574);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
    public final void method280(boolean arg0, int arg1) {
        field545++;
        if (this.field539 != arg0) {
            this.field539 = arg0;
            this.method288((byte) 48);
            int var3 = -51 % ((-arg1 - 46) / 32);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvj;II)V")
    public static final void method281(class411 arg0, int arg1, int arg2) {
        if (arg2 != 5255) {
            method283((byte) 94);
        }
        if (arg0.field5576 != null) {
            int var3 = arg0.field5576[arg1 + 1];
            if (arg0.field5575 != var3) {
                arg0.field5641 = arg0.field5642;
                arg0.field5575 = var3;
                arg0.field5606 = 1;
                arg0.field5623 = 0;
                arg0.field5554 = 0;
                arg0.field5629 = 0;
                if (arg0.field5575 != -1) {
                    class373.method2199(arg0.field8609, arg0.field8620, (byte) 103, arg0.field8612, arg0.field5623, class636.field8570.method231(arg0.field5575, arg2 ^ 0xFFFFC68B), class199.field2897 == arg0);
                }
            }
        }
        field543++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
    public final void method282(boolean arg0, int arg1) {
        field542++;
        class666 var3 = this.field535;
        synchronized (this.field535) {
            if (!arg0) {
                this.method287(17);
            }
            this.field535.method3740((byte) 60, arg1);
        }
        class666 var4 = this.field554;
        synchronized (this.field554) {
            this.field554.method3740((byte) 60, arg1);
        }
        class666 var5 = this.field555;
        synchronized (this.field555) {
            this.field555.method3740((byte) 60, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method283(byte arg0) {
        field550 = null;
        field547 = null;
        if (arg0 > -124) {
            field552 = null;
        }
        field552 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static final void method284(boolean arg0) {
        if (arg0) {
            field544++;
            class549.field7323.method1641(-122);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method285(String arg0, byte arg1) {
        field546++;
        long var2 = 0L;
        if (arg1 != -120) {
            field547 = null;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public final void method286(int arg0, int arg1) {
        if (arg1 > -105) {
            return;
        }
        field537++;
        this.field556 = arg0;
        class666 var3 = this.field554;
        synchronized (this.field554) {
            this.field554.method3739(0);
        }
        class666 var4 = this.field555;
        synchronized (this.field555) {
            this.field555.method3739(0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method287(int arg0) {
        field553++;
        class666 var2 = this.field554;
        synchronized (this.field554) {
            this.field554.method3739(0);
            if (arg0 <= 65) {
                this.field535 = null;
            }
        }
        class666 var3 = this.field555;
        synchronized (this.field555) {
            this.field555.method3739(0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public final void method288(byte arg0) {
        class666 var2 = this.field535;
        synchronized (this.field535) {
            this.field535.method3739(0);
        }
        if (arg0 <= 21) {
            this.method280(true, 86);
        }
        field541++;
        class666 var3 = this.field554;
        synchronized (this.field554) {
            this.field554.method3739(0);
        }
        class666 var4 = this.field555;
        synchronized (this.field555) {
            this.field555.method3739(0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lpca;IZLbi;Lbi;)V")
    public class36(class671 arg0, int arg1, boolean arg2, class449 arg3, class449 arg4) {
        this.field536 = arg4;
        this.field548 = arg0;
        this.field539 = arg2;
        this.field538 = arg3;
        if (this.field538 != null) {
            int var6 = this.field538.method2545(0) - 1;
            this.field538.method2527(0, var6);
        }
    }
}
