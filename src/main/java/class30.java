import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 implements class131 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lab;")
    private class3 field680 = new class3();

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "D")
    private double field692 = 1.0D;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    private int field695 = 128;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    private int field694 = 0;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lpb;")
    private class92 field693;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[Lia;")
    private class49[] field686;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lrc;")
    private static class105 field687 = class43.method374("This world is full)3", 0);

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lrc;")
    private static class105 field688 = class43.method374("green:", 0);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lrc;")
    public static class105 field673 = field688;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lrc;")
    public static class105 field689 = field687;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lle;")
    public static class71 field674 = new class71(64);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lrc;")
    public static class105 field691 = class43.method374("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
    public static int[] field696 = new int[50];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lfc;")
    public static class34 field684;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 10)
    public static void method281(int arg0) {
        field696 = null;
        if (arg0 != 30504) {
            return;
        }
        field689 = null;
        field691 = null;
        field687 = null;
        field688 = null;
        field673 = null;
        field684 = null;
        field674 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V", line = 35)
    public final void method282(int arg0, int arg1) {
        field679++;
        for (int var3 = 0; var3 < this.field686.length; var3++) {
            class49 var4 = this.field686[var3];
            if (var4 != null && var4.field1045 != 0 && var4.field1051) {
                var4.method396(arg1);
                var4.field1051 = false;
            }
        }
        if (arg0 != 27777) {
            method288(null, -57, null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z", line = 65)
    public final boolean method283(int arg0, byte arg1) {
        field690++;
        if (arg1 >= -38) {
            return true;
        } else {
            return this.field695 == 64;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ID)V", line = 82)
    public final void method284(int arg0, double arg1) {
        field681++;
        this.field692 = arg1;
        this.method286((byte) -126);
        if (arg0 != 0) {
            this.method286((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)Z", line = 95)
    public final boolean method285(int arg0, byte arg1) {
        field685++;
        if (arg1 > -88) {
            field691 = null;
        }
        return this.field686[arg0].field1050;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 107)
    public final void method286(byte arg0) {
        for (int var2 = 0; var2 < this.field686.length; var2++) {
            if (this.field686[var2] != null) {
                this.field686[var2].method395();
            }
        }
        field676++;
        this.field680 = new class3();
        this.field694 = this.field697;
        int var3 = 66 / ((-arg0 - 26) / 48);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method287(int arg0, int arg1) {
        if (arg0 != 5281) {
            this.method282(-43, -102);
        }
        field682++;
        class49 var3 = this.field686[arg1];
        if (var3 != null) {
            if (var3.field1054 != null) {
                this.field680.method29(var3, true);
                var3.field1051 = true;
                return var3.field1054;
            }
            boolean var4 = var3.method393(this.field692, this.field695, this.field693);
            if (var4) {
                if (this.field694 == 0) {
                    class49 var5 = (class49) this.field680.method35((byte) -92);
                    var5.method395();
                } else {
                    this.field694--;
                }
                this.field680.method29(var3, true);
                var3.field1051 = true;
                return var3.field1054;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lfb;ILjava/awt/Component;)V", line = 215)
    public static final void method288(class33 arg0, int arg1, Component arg2) {
        field671++;
        if (arg1 <= 6) {
            method288(null, -91, null);
        }
        try {
            class79 var3 = (class79) Class.forName("ad").getDeclaredConstructor().newInstance();
            var3.method682(arg0, 2048);
            class81.field1825 = var3;
        } catch (Throwable var6) {
            try {
                class81.field1825 = new class48(arg0, arg2);
            } catch (Throwable var5) {
                if (class33.field771.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class81.field1825 = new class8();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class81.field1825 = new class35(8000);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lpb;Lpb;IDI)V", line = 304)
    public class30(class92 arg0, class92 arg1, int arg2, double arg3, int arg4) {
        this.field693 = arg1;
        this.field695 = arg4;
        this.field697 = arg2;
        this.field694 = this.field697;
        this.field692 = arg3;
        int[] var7 = arg0.method763((byte) -32, 0);
        int var8 = var7.length;
        this.field686 = new class49[arg0.method749(0, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class7 var10 = new class7(arg0.method766(var7[var9], (byte) -45, 0));
            this.field686[var7[var9]] = new class49(var10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I", line = 270)
    public final int method289(byte arg0, int arg1) {
        field677++;
        if (arg0 == -97) {
            return this.field686[arg1] == null ? 0 : this.field686[arg1].field1047;
        } else {
            return -89;
        }
    }
}
