import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class160 {

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "B")
    private byte field2000;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Lnj;")
    public static class415 field2002 = new class415(52, 3);

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "[[Ltc;")
    public static class477[][] field2005;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I", line = 15)
    public final int method1137(byte arg0) {
        int var2 = -4 % ((20 - arg0) / 59);
        field1998++;
        return this.field2000 & 0x7;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I", line = 25)
    public final int method1138(int arg0) {
        field1999++;
        if (arg0 > -65) {
            this.method1138(17);
        }
        return (this.field2000 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method1139(boolean arg0) {
        if (arg0) {
            class483.field6438 = class168.field2096;
            class392.field4997 = class477.field6327;
        } else {
            class483.field6438 = class515.field6748;
            class392.field4997 = class353.field4540;
        }
        class20.field223 = class483.field6438.length;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V", line = 51)
    public class160() {
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lfd;)V", line = 55)
    public class160(class418 arg0) {
        this.field2000 = arg0.method2387((byte) -114);
        this.field2004 = arg0.method2393(-30727);
        this.field2001 = arg0.method2355(65);
        this.field2003 = arg0.method2355(34);
        this.field1996 = arg0.method2355(106);
        this.field1997 = arg0.method2355(107);
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V", line = 68)
    public static void method1140(int arg0) {
        field2002 = null;
        if (arg0 != 52) {
            method1140(117);
        }
        field2005 = null;
    }
}
