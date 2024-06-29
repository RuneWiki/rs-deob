import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class440 {

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Lme;")
    private class668 field5673 = new class668(16);

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lpe;")
    private class615 field5676;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lnj;")
    public static class415 field5679 = new class415(48, 2);

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
    public static boolean field5682 = false;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field5681;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Ltga;")
    public final class589 method2492(int arg0, int arg1) {
        field5675++;
        class668 var3 = this.field5673;
        class589 var4;
        synchronized (this.field5673) {
            var4 = (class589) this.field5673.method3655(-113, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field5676;
        byte[] var6;
        synchronized (this.field5676) {
            var6 = this.field5676.method3346(-1, arg1, arg0);
        }
        class589 var7 = new class589();
        if (var6 != null) {
            var7.method3214(-115, new class418(var6));
        }
        class668 var8 = this.field5673;
        synchronized (this.field5673) {
            this.field5673.method3650((long) arg0, arg1 - 144, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public final void method2493(byte arg0) {
        field5680++;
        class668 var2 = this.field5673;
        synchronized (this.field5673) {
            this.field5673.method3658(0);
        }
        int var3 = -9 / ((arg0 + 12) / 48);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2494(int arg0) {
        field5681 = null;
        int var1 = 68 / ((arg0 - 18) / 49);
        field5679 = null;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
    public final void method2495(int arg0, int arg1) {
        class668 var3 = this.field5673;
        synchronized (this.field5673) {
            this.field5673.method3659(-127, arg1);
        }
        field5678++;
        int var4 = -108 % ((23 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class440(class635 arg0, int arg1, class615 arg2) {
        this.field5676 = arg2;
        this.field5676.method3341(30, -19046);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public final void method2496(int arg0) {
        if (arg0 != 13392) {
            field5679 = null;
        }
        class668 var2 = this.field5673;
        synchronized (this.field5673) {
            this.field5673.method3656((byte) 0);
        }
        field5674++;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public static final void method2497(int arg0) {
        field5677++;
        if (class515.field6756) {
            return;
        }
        class515.field6756 = true;
        class63.field862 = true;
        if (class260.field3509.field1283) {
            class710.field9918 = ((int) class710.field9918 - 17 & 0xFFFFFFF0);
        } else {
            class66.field907 += (-12.0F - class66.field907) / 2.0F;
        }
        if (arg0 != -25035) {
            field5681 = null;
        }
    }
}
