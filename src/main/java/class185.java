import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class185 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lh;")
    private class571 field2599 = new class571(16);

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "Lan;")
    private class21 field2604;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Lcba;")
    public static class471 field2598 = new class471(38, 8);

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2600 = -1;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method1153(int arg0) {
        if (arg0 != 38) {
            method1153(-92);
        }
        field2598 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
    public final void method1154(boolean arg0, int arg1) {
        class571 var3 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method3253(arg1, -128);
        }
        field2602++;
        if (arg0) {
            this.method1156(8, -90);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method1155(int arg0) {
        class571 var2 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method3246(false);
        }
        field2597++;
        if (arg0 < 9) {
            this.field2599 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lab;")
    public final class575 method1156(int arg0, int arg1) {
        field2601++;
        class571 var3 = this.field2599;
        class575 var4;
        synchronized (this.field2599) {
            var4 = (class575) this.field2599.method3252((long) arg1, (byte) 65);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 <= 81) {
            this.field2599 = null;
        }
        class21 var5 = this.field2604;
        byte[] var6;
        synchronized (this.field2604) {
            var6 = this.field2604.method240(30, arg1, (byte) -124);
        }
        class575 var7 = new class575();
        if (var6 != null) {
            var7.method3275(new class11(var6), (byte) 113);
        }
        class571 var8 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method3243(var7, (long) arg1, 45);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public final void method1157(int arg0) {
        field2603++;
        class571 var2 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method3248(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class185(class111 arg0, int arg1, class21 arg2) {
        this.field2604 = arg2;
        this.field2604.method231(30, -123);
    }
}
