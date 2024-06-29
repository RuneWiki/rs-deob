import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class119 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lnga;")
    private class510 field1863 = new class510(64);

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Leq;")
    private class209 field1865;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Lnt;")
    public static class220 field1862 = new class220();

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Lfp;")
    public static class323 field1867;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public final void method957(int arg0) {
        class510 var2 = this.field1863;
        synchronized (this.field1863) {
            this.field1863.method3048(false);
            if (arg0 != 31) {
                field1862 = null;
            }
        }
        field1866++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    public final void method958(int arg0, int arg1) {
        if (arg1 != 31) {
            this.method960((byte) 69, -57);
        }
        field1860++;
        class510 var3 = this.field1863;
        synchronized (this.field1863) {
            this.field1863.method3049(arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public final void method959(byte arg0) {
        class510 var2 = this.field1863;
        synchronized (this.field1863) {
            this.field1863.method3050(false);
            if (arg0 <= 56) {
                field1862 = null;
            }
        }
        field1864++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)Lne;")
    public final class317 method960(byte arg0, int arg1) {
        field1861++;
        class510 var3 = this.field1863;
        class317 var4;
        synchronized (this.field1863) {
            var4 = (class317) this.field1863.method3054((byte) -95, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1865;
        byte[] var6;
        synchronized (this.field1865) {
            var6 = this.field1865.method1453(arg1, 94, 31);
        }
        class317 var7 = new class317();
        if (var6 != null) {
            var7.method2037(new class35(var6), (byte) -108);
        }
        class510 var8 = this.field1863;
        synchronized (this.field1863) {
            this.field1863.method3047(false, var7, (long) arg1);
            int var9 = -107 / ((-arg0 - 67) / 47);
            return var7;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static void method961(int arg0) {
        field1867 = null;
        field1862 = null;
        if (arg0 != 64) {
            field1862 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class119(class179 arg0, int arg1, class209 arg2) {
        this.field1865 = arg2;
        this.field1865.method1477(0, 31);
    }
}
