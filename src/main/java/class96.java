import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class96 extends class530 {

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "Lgha;")
    public static class497 field1400 = new class497();

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field1403 = 1339;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lha;")
    public static class545 field1401;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)I", line = 3)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            this.method656(41);
        }
        ++field1395;
        return 1;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILah;)V", line = 15)
    public class96(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 19)
    public static void method654(int arg0) {
        field1401 = null;
        if (arg0 != 1339) {
            field1401 = null;
        }
        field1400 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V", line = 30)
    public final void method73(boolean arg0) {
        ++field1394;
        if (super.field7419 != 0 && super.field7418.field5163.method989(0) != 1) {
            super.field7419 = 0;
        }
        if (super.field7419 < 0 || super.field7419 > 1) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            method654(99);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V", line = 47)
    public final void method70(int arg0, int arg1) {
        if (arg1 >= -38) {
            this.method656(-109);
        }
        super.field7419 = arg0;
        ++field1399;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Z", line = 60)
    public final boolean method655(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1397;
            return true;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I", line = 73)
    public final int method656(int arg0) {
        ++field1396;
        if (arg0 != 0) {
            field1402 = 97;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lah;)V", line = 86)
    public class96(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)I", line = 92)
    public final int method75(int arg0, int arg1) {
        ++field1398;
        if (~arg0 != -1 && super.field7418.field5163.method989(0) != 1) {
            int var3 = -21 % ((63 - arg1) / 60);
            return 2;
        } else {
            return 1;
        }
    }
}
