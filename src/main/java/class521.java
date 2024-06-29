import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class521 {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "B")
    public byte field7720;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    private int field7724;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lqc;")
    public class521 field7715;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lwl;")
    public static class281[] field7709 = new class281[16];

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Lqp;")
    public static class466 field7723 = new class466("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7729 = new Rectangle[100];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public int field7710;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lmg;")
    public static class101 field7727;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lwj;")
    public static class270 field7731;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field7729[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)Lqc;", line = 8)
    public final class521 method3106(int arg0, int arg1, int arg2, int arg3) {
        field7721++;
        return arg2 == 16711935 ? new class521(this.field7724, arg0, arg3, arg1, this.field7720) : null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)I", line = 20)
    public static final int method3107(int arg0, int arg1, int arg2, int arg3) {
        field7725++;
        int var4 = 255 - arg0;
        int var5 = ((arg3 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg3 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        if (arg1 != 0) {
            field7731 = null;
        }
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 45)
    public static void method3108(byte arg0) {
        field7731 = null;
        field7709 = null;
        field7723 = null;
        if (arg0 < -89) {
            field7729 = null;
            field7727 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lhc;", line = 61)
    public final class94 method3109(byte arg0) {
        field7728++;
        int var2 = -23 % ((55 - arg0) / 43);
        return class283.method1686((byte) -120, this.field7724);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIB)V", line = 74)
    public class521(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7720 = arg4;
        this.field7722 = arg3;
        this.field7719 = arg2;
        this.field7724 = arg0;
        this.field7726 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lqc;I)V", line = 89)
    public class521(class521 arg0, int arg1) {
        this.field7715 = arg0;
        this.field7719 = this.field7715.field7719 + arg1;
        this.field7722 = this.field7715.field7722 + arg1;
        this.field7720 = this.field7715.field7720;
        this.field7724 = this.field7715.field7724;
        this.field7726 = this.field7715.field7726 + arg1;
    }
}
