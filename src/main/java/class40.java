import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 extends class320 {

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "Z")
    public static boolean field586 = false;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "Lso;")
    public static class327 field583 = new class327(0, 3);

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field588 = 1;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Lri;")
    public static class73 field587 = new class73(84, 10);

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "J")
    public long field578;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)I")
    public final int method238(int arg0) {
        field576++;
        return arg0 <= 33 ? 110 : this.field577;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)I")
    public final int method239(int arg0) {
        int var2 = 70 / ((18 - arg0) / 58);
        field581++;
        return this.field579;
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)V")
    public static void method240(int arg0) {
        if (arg0 > -29) {
            field588 = 10;
        }
        field583 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
    public static final void method241(int arg0) {
        field585++;
        class335.field4729.method1771((byte) 52);
        class493.field7291.method1645((byte) 121);
        class456.field6745.method397((byte) -45);
        class252.field3743.method2692(124);
        class431.field6451.method1739((byte) 38);
        class294.field4196.method454(true);
        class84.field1295.method1180((byte) 36);
        class512.field7494.method2727(false);
        class64.field961.method3037(2);
        class377.field5753.method1669(-9567);
        class45.field717.method1813((byte) 11);
        class57.field872.method1201(true);
        class14.field176.method542(false);
        class140.field2104.method668(-11556);
        class381.field5778.method502((byte) 88);
        class77.field1154.method2336(8);
        class515.field7515.method2381(true);
        class449.field6685.method378(1);
        class26.field282.method211(0);
        class91.field1368.method1609(26);
        if (arg0 >= -106) {
            return;
        }
        class485.method2879(37);
        class268.method1768(-22096);
        class420.method2527(false);
        class277.method1811((byte) -92);
        class333.field4698.method1539(-57);
        class148.field2202.method1539(-60);
        class43.field670.method1539(-93);
        class264.field3860.method1539(-59);
        class360.field5543.method1539(-58);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)J")
    public final long method242(byte arg0) {
        field580++;
        if (arg0 <= 77) {
            field586 = false;
        }
        return this.field578;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)I")
    public final int method243(byte arg0) {
        field584++;
        if (arg0 != -109) {
            this.field582 = -62;
        }
        return this.field582;
    }
}
