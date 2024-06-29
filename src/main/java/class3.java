import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lhu;")
    private class76 field45 = new class76(64);

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lr;")
    private class110 field43;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lnk;")
    public static class464 field41;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method25(int arg0) {
        if (arg0 == -15284) {
            field46++;
            return class148.field2106 == 0 ? class491.field6866.method1748((byte) -64) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V", line = 21)
    public static void method26(int arg0) {
        field41 = null;
        if (arg0 != 5) {
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lhl;", line = 38)
    public final class338 method27(int arg0, int arg1) {
        field47++;
        class76 var3 = this.field45;
        class338 var4;
        synchronized (this.field45) {
            var4 = (class338) this.field45.method493((byte) 19, (long) arg0);
        }
        if (arg1 <= 104) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field43.method702((byte) 79, arg0, 5);
            class338 var6 = new class338();
            if (var5 != null) {
                var6.method1927(new class32(var5), 0);
            }
            class76 var7 = this.field45;
            synchronized (this.field45) {
                this.field45.method505((long) arg0, var6, 76);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILr;Lr;)I", line = 68)
    public static final int method28(int arg0, class110 arg1, class110 arg2) {
        field42++;
        int var3 = 0;
        if (arg2.method700((byte) 78, class51.field680)) {
            var3++;
        }
        if (arg2.method700((byte) 87, class31.field422)) {
            var3++;
        }
        if (arg2.method700((byte) -69, class322.field4292)) {
            var3++;
        }
        if (arg1.method700((byte) 111, class51.field680)) {
            var3++;
        }
        if (arg1.method700((byte) -56, class31.field422)) {
            var3++;
        }
        if (arg0 == -13590) {
            if (arg1.method700((byte) 94, class322.field4292)) {
                var3++;
            }
            return var3;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 112)
    public class3(class329 arg0, int arg1, class110 arg2) {
        this.field43 = arg2;
        this.field43.method694(5, (byte) 119);
    }
}
