import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class8 extends class62 {

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Leg;")
    public class37 field129;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lmg;")
    public static class53 field133 = new class53(128);

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Leg;")
    public static class37 field138 = class174.method1167("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", -116);

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Leg;")
    public static class37 field136 = class174.method1167("brillant2:", -126);

    @OriginalMember(owner = "client!n", name = "H", descriptor = "J")
    public static long field140 = 0L;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Ljl;")
    public static class101 field142;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Lfd;")
    public static class198 field135;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static final void method45(int arg0) {
        class119.field2017.method1403(45);
        class273.field4796.method1403(45);
        field132++;
        if (arg0 < 31) {
            method48(85);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(BI)V")
    public static final void method46(byte arg0, int arg1) {
        int var2 = -84 % ((arg0 - 15) / 56);
        field131++;
        if (class120.field2029 == 0) {
            class73.field1158.method754(-5758, arg1);
        } else {
            class156.field2607 = arg1;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static void method47(int arg0) {
        field133 = null;
        field135 = null;
        field136 = null;
        field142 = null;
        field138 = null;
        if (arg0 != 4) {
            field143 = -108;
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public static final void method48(int arg0) {
        int var1 = -95 % ((arg0 + 52) / 35);
        if (class213.field3685 != null) {
            class98.method638(-10, class213.field3685);
            class213.field3685 = null;
        }
        field130++;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(BI)V")
    public static final void method49(byte arg0, int arg1) {
        if (arg0 < -29) {
            field141++;
            class274 var2 = class166.method1116(4, arg1, true);
            var2.method1840(10000);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class8() {
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Leg;I)V")
    public class8(class37 arg0, int arg1) {
        this.field129 = arg0;
    }
}
