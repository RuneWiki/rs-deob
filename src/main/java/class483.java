import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class483 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lfc;")
    private class174 field6735 = new class174(64);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lfc;")
    public class174 field6736 = new class174(2);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Loi;")
    private class53 field6729;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Loi;")
    public class53 field6732;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6728;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field6734;

    static {
        new class530("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field6724 = -1;
        field6728 = "";
        field6733 = 0;
        field6730 = 10;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 9)
    public final void method2783(byte arg0) {
        class174 var2 = this.field6735;
        synchronized (this.field6735) {
            this.field6735.method1095(0);
        }
        field6727++;
        class174 var3 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method1095(0);
        }
        if (arg0 > -20) {
            this.field6735 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 29)
    public static void method2784(int arg0) {
        if (arg0 != -25664) {
            field6733 = 97;
        }
        field6728 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lee;", line = 39)
    public final class487 method2785(int arg0, int arg1) {
        field6734++;
        class174 var3 = this.field6735;
        class487 var4;
        synchronized (this.field6735) {
            var4 = (class487) this.field6735.method1088((long) arg0, (byte) -120);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field6729;
        byte[] var6;
        synchronized (this.field6729) {
            var6 = this.field6729.method426(33, (byte) 9, arg0);
        }
        class487 var7 = new class487();
        if (arg1 != 0) {
            field6728 = null;
        }
        var7.field6794 = this;
        if (var6 != null) {
            var7.method2808((byte) 10, new class403(var6));
        }
        class174 var8 = this.field6735;
        synchronized (this.field6735) {
            this.field6735.method1097(arg1 ^ 0x4CAB, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 72)
    public final void method2786(byte arg0) {
        class174 var2 = this.field6735;
        synchronized (this.field6735) {
            this.field6735.method1096((byte) 110);
        }
        field6726++;
        if (arg0 != 69) {
            this.method2787(109, -103);
        }
        class174 var3 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method1096((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 97)
    public final void method2787(int arg0, int arg1) {
        class174 var3 = this.field6735;
        synchronized (this.field6735) {
            this.field6735.method1087(arg1 ^ 0xFFFFDE5B, arg0);
        }
        field6723++;
        class174 var4 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method1087(arg1 ^ 0xFFFFDE5B, arg0);
            if (arg1 != -8614) {
                field6733 = -34;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(DI)V", line = 116)
    public static final void method2788(double arg0, int arg1) {
        field6725++;
        if (class234.field3414 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class155.field2265[var3] = var4 > 255 ? 255 : var4;
            }
            class234.field3414 = arg0;
        }
        if (arg1 >= -49) {
            field6728 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lle;ILoi;Loi;)V", line = 160)
    public class483(class205 arg0, int arg1, class53 arg2, class53 arg3) {
        this.field6729 = arg2;
        this.field6732 = arg3;
        this.field6729.method435(33, 0);
    }
}
