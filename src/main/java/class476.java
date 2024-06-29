import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class476 {

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Z")
    public boolean field6646;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6653 = 0;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Luq;")
    public class163 field6644;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Luq;")
    public class163 field6648;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Z")
    public boolean field6649;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[S")
    public static short[] field6651;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2794(int arg0) {
        field6645++;
        for (class733 var1 = (class733) class696.field9402.method1304(60); var1 != null; var1 = (class733) class696.field9402.method1304(60)) {
            class238.method1651(var1, true);
        }
        int var2;
        int var3;
        if (class693.field9368.field4458.method3022(-32350) == 1) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class534.field7352;
            var3 = class534.field7352;
        }
        client.method1987();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1980();
            client.method1990(var4);
            client.method1974(var4);
        }
        client.method1976();
        if (arg0 == -14988) {
            client.method1984();
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 48)
    public final void method2795(byte arg0) {
        if (arg0 >= -6) {
            this.field6649 = true;
        }
        field6647++;
        if (this.field6648 != null) {
            this.field6648.method878(23315);
        }
        this.field6649 = false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Z", line = 66)
    public static final boolean method2796(int arg0, int arg1) {
        int var2 = 22 % ((arg0 - 16) / 35);
        field6654++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Z)V", line = 77)
    public class476(boolean arg0) {
        this.field6646 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z", line = 85)
    public final boolean method2797(byte arg0) {
        field6652++;
        if (arg0 != -100) {
            this.field6644 = null;
        }
        return this.field6649 && !this.field6646;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 103)
    public static void method2798(int arg0) {
        int var1 = 85 % ((arg0 + 28) / 60);
        field6651 = null;
    }
}
