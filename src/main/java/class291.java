import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class291 extends class8 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public int field4645 = 12800;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public int field4651 = 12800;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public int field4644 = -1;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public int field4659 = 0;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Z")
    public boolean field4647 = true;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public int field4660 = -1;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public int field4646 = 0;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Ljava/lang/String;")
    public String field4657;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Ljava/lang/String;")
    public String field4666;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lhh;")
    public class169 field4664;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field4650 = -1;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field4663 = -1;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4662 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lak;")
    public static class172 field4649;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 212)
    public class291(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4657 = arg1;
        this.field4647 = arg5;
        this.field4660 = arg6;
        this.field4658 = arg0;
        this.field4666 = arg2;
        this.field4655 = arg3;
        if (this.field4660 == 255) {
            this.field4660 = 0;
        }
        this.field4644 = arg4;
        this.field4664 = new class169();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)[I", line = 40)
    public final int[] method2080(byte arg0, int arg1, int arg2) {
        field4648++;
        for (class119 var4 = (class119) this.field4664.method1240(3); var4 != null; var4 = (class119) this.field4664.method1235(false)) {
            if (var4.method835(arg2, (byte) 36, arg1)) {
                return var4.method831(0, arg1, arg2);
            }
        }
        int var5 = -104 / ((arg0 + 40) / 63);
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V", line = 64)
    public static final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class139.field2195 = class111.field1650 * arg2 / arg1;
        class50.field707 = -1;
        if (arg4 > -115) {
            method2083((byte) 101);
        }
        field4656++;
        class88.field1218 = -1;
        class91.field1254 = class74.field1048 * arg3 / arg0;
        class46.method295(-1);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 89)
    public final void method2082(byte arg0) {
        this.field4646 = 0;
        this.field4645 = 12800;
        field4665++;
        this.field4659 = 0;
        int var2 = -105 / ((arg0 + 22) / 36);
        this.field4651 = 12800;
        for (class119 var3 = (class119) this.field4664.method1240(3); var3 != null; var3 = (class119) this.field4664.method1235(false)) {
            if (this.field4646 < var3.field1819) {
                this.field4646 = var3.field1819;
            }
            if (var3.field1815 > this.field4659) {
                this.field4659 = var3.field1815;
            }
            if (this.field4645 > var3.field1812) {
                this.field4645 = var3.field1812;
            }
            if (var3.field1798 < this.field4651) {
                this.field4651 = var3.field1798;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V", line = 124)
    public static void method2083(byte arg0) {
        field4649 = null;
        field4662 = null;
        int var1 = -27 / ((-arg0 - 70) / 56);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z", line = 134)
    public final boolean method2084(int arg0, int arg1, int arg2) {
        field4661++;
        if (arg2 >= -45) {
            return true;
        }
        for (class119 var4 = (class119) this.field4664.method1240(3); var4 != null; var4 = (class119) this.field4664.method1235(false)) {
            if (var4.method835(arg1, (byte) 36, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(BII)[I", line = 156)
    public final int[] method2085(byte arg0, int arg1, int arg2) {
        field4653++;
        if (arg0 != -91) {
            return (int[]) null;
        }
        for (class119 var4 = (class119) this.field4664.method1240(arg0 + 94); var4 != null; var4 = (class119) this.field4664.method1235(false)) {
            if (var4.method839(arg2, arg1, arg0 ^ 0xFFFFFFA4)) {
                return var4.method836(arg2, 5723, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBII)[I", line = 182)
    public final int[] method2086(int arg0, byte arg1, int arg2, int arg3) {
        field4643++;
        class119 var5 = (class119) this.field4664.method1240(3);
        if (arg1 <= 24) {
            field4649 = (class172) null;
        }
        while (var5 != null) {
            if (var5.method838(arg3, (byte) 102, arg2, arg0)) {
                return var5.method831(0, arg0, arg3);
            }
            var5 = (class119) this.field4664.method1235(false);
        }
        return null;
    }
}
