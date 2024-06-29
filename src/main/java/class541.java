import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class541 {

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Loh;")
    private class404 field7792;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Loh;")
    private class404 field7780;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field7786 = 0;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lpfa;")
    public static class295 field7782 = new class295(8);

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    public static int[] field7791 = new int[6];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lgm;")
    private class123 field7785;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Ldfa;")
    public static class165 field7790;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Luha;B)Lmp;")
    public final class758 method3179(class243 arg0, byte arg1) {
        field7789++;
        if (arg0 == null) {
            return null;
        }
        class325 var3 = arg0.method777(arg1 - 95);
        if (class614.field8794 == var3) {
            return new class34((class663) arg0);
        } else if (class709.field9994 == var3) {
            return new class3(this.method3180(-111), (class136) arg0);
        } else if (class145.field1604 == var3) {
            return new class442(this.field7792, (class585) arg0);
        } else if (class675.field9561 == var3) {
            return new class598(this.field7792, (class657) arg0);
        } else if (class621.field8902 == var3) {
            return new class591(this.field7792, this.field7780, (class724) arg0);
        } else if (class371.field4742 == var3) {
            return new class409(this.field7792, this.field7780, (class324) arg0);
        } else if (class366.field4667 == var3) {
            return new class135(this.field7792, this.field7780, (class511) arg0);
        } else if (class294.field3621 == var3) {
            return new class271(this.field7792, this.field7780, (class563) arg0);
        } else if (class593.field8382 == var3) {
            return new class450(this.field7792, (class190) arg0);
        } else if (class675.field9563 == var3) {
            return new class469(this.field7792, this.field7780, (class626) arg0);
        } else {
            if (arg1 != 59) {
                this.field7792 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lgm;")
    private final class123 method3180(int arg0) {
        if (this.field7785 == null) {
            this.field7785 = new class123();
        }
        field7784++;
        return arg0 > -109 ? null : this.field7785;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
    public static final int method3181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == -1923096447) {
            field7783++;
            int var5 = 65536 - class260.field3229[arg0 * 8192 / arg4] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lrr;II)V")
    public static final void method3182(class361[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class361 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4639;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4639 > (var7 & 0x1) + var6) {
                class361 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3182(arg0, arg1, var4 - 1);
        method3182(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method3183(int arg0) {
        field7791 = null;
        field7782 = null;
        field7790 = null;
        int var1 = -127 / ((arg0 + 73) / 35);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBZ)V")
    public static final void method3184(int arg0, byte arg1, boolean arg2) {
        field7781++;
        class755 var3 = class149.method926(Integer.MIN_VALUE, arg2, arg0);
        if (var3 != null) {
            var3.method864(12983);
            if (arg1 != 108) {
                method3182(null, 19, -79);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Loh;Loh;)V")
    public class541(class404 arg0, class404 arg1) {
        this.field7792 = arg0;
        this.field7780 = arg1;
    }
}
