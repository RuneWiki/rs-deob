import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class329 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lkc;")
    private class51 field5616 = new class51();

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lmm;")
    private class117 field5620 = new class117();

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    private int field5617;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    private int field5618;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Loe;")
    private class79 field5619;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lhi;")
    public static class82 field5615 = class95.method664((byte) -108, ":clan:");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)Lkc;", line = 18)
    public final class51 method2250(long arg0, boolean arg1) {
        field5610++;
        class51 var4 = (class51) this.field5619.method507(arg0, 602425312);
        if (var4 != null) {
            this.field5620.method800((byte) 98, var4);
        }
        if (arg1) {
            this.field5617 = -69;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Lgd;", line = 45)
    public final class141 method2251(byte arg0) {
        if (arg0 != 87) {
            method2253((byte) -70);
        }
        field5611++;
        return this.field5619.method502((byte) -104);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lgd;", line = 57)
    public final class141 method2252(int arg0) {
        if (arg0 != -1462) {
            this.field5618 = -24;
        }
        field5614++;
        return this.field5619.method494(true);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 77)
    public static void method2253(byte arg0) {
        int var1 = -29 / ((arg0 - 19) / 38);
        field5615 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 87)
    public final void method2254(int arg0) {
        if (arg0 != -2705) {
            return;
        }
        field5609++;
        this.field5620.method799((byte) 39);
        this.field5619.method496((byte) 52);
        this.field5616 = new class51();
        this.field5618 = this.field5617;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkc;JZ)V", line = 109)
    public final void method2255(class51 arg0, long arg1, boolean arg2) {
        field5613++;
        if (this.field5618 == 0) {
            class51 var5 = this.field5620.method801(100);
            var5.method961((byte) 119);
            var5.method358((byte) 52);
            if (this.field5616 == var5) {
                class51 var6 = this.field5620.method801(100);
                var6.method961((byte) 76);
                var6.method358((byte) 52);
            }
        } else {
            this.field5618--;
        }
        this.field5619.method503(arg1, -123, arg0);
        if (arg2) {
            this.field5617 = 109;
        }
        this.field5620.method800((byte) -89, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 156)
    public class329(int arg0) {
        this.field5617 = arg0;
        this.field5618 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5619 = new class79(var2);
    }
}
