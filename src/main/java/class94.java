import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class94 extends class189 implements class201 {

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ldq;")
    public static class489 field1537 = new class489(9, 6);

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method754(int arg0) {
        class364 var1 = class510.field7486;
        synchronized (class510.field7486) {
            class510.field7486.method2350((byte) 112);
            if (arg0 != 6) {
                field1537 = null;
            }
        }
        ++field1545;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
    public final int method755(int arg0) {
        ++field1544;
        return arg0 != -20843 ? -79 : this.field1542;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILm;Lci;ILjava/awt/Canvas;)Lqa;")
    public static final class162 method756(int arg0, class126 arg1, class312 arg2, int arg3, Canvas arg4) {
        if (arg0 < 61) {
            return null;
        } else {
            ++field1543;
            return new class468(arg3, arg4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)J")
    public final long method757(boolean arg0) {
        if (arg0) {
            return 80L;
        } else {
            ++field1540;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
    public static void method758(byte arg0) {
        if (arg0 >= -4) {
            method754(92);
        }
        field1537 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
    public final int method759(byte arg0) {
        if (arg0 != -23) {
            return -92;
        } else {
            ++field1539;
            return super.field2798;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIII)V")
    public final void method760(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method1302(true, arg0, arg3);
        ++field1541;
        if (arg2 <= 71) {
            this.method755(-106);
        }
        this.field1542 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lqg;I[BIZ)V")
    public class94(class321 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1542 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public final void method761(byte arg0) {
        ++field1538;
        if (arg0 >= 29) {
            super.field2795.method2028(true, this);
        }
    }
}
