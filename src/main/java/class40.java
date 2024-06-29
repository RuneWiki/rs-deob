import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class40 {

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Ltg;")
    private class605 field709;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "J")
    public static long field710;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljn;")
    public static class322 field711;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lds;")
    private class65 field705;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lds;")
    public final class65 method444(int arg0) {
        field707++;
        if (arg0 <= 100) {
            this.method447(null, true);
        }
        class65 var2 = this.field709.field8547.field1044;
        if (this.field709.field8547 == var2) {
            this.field705 = null;
            return null;
        } else {
            this.field705 = var2.field1044;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method445(byte arg0) {
        if (arg0 == 29) {
            field711 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class40() {
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Lds;")
    public final class65 method446(byte arg0) {
        field708++;
        class65 var2 = this.field705;
        if (this.field709.field8547 == var2) {
            this.field705 = null;
            return null;
        }
        if (arg0 <= 63) {
            field713 = -106;
        }
        this.field705 = var2.field1044;
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ltg;Z)V")
    public final void method447(class605 arg0, boolean arg1) {
        this.field709 = arg0;
        if (arg1) {
            field712 = -3;
        }
        field706++;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ltg;)V")
    public class40(class605 arg0) {
        this.field709 = arg0;
    }
}
