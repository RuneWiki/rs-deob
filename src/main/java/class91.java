import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class91 extends RuntimeException {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1298;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljava/lang/String;")
    public String field1296;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1291 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field1293 = new int[13];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    public static boolean field1297 = false;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 15)
    public static void method706(boolean arg0) {
        if (!arg0) {
            field1293 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 28)
    public static final void method707(int arg0) {
        class585.field8346 = new class105[arg0];
        field1295++;
        class279.field3914 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z", line = 41)
    public static final boolean method708(int arg0) {
        field1292++;
        if (class585.field8347 == null) {
            return false;
        } else {
            if (arg0 >= ~class585.field8347.field4152) {
                class585.field8347.field4152 -= 2000;
            }
            return class585.field8347.field4152 == 1002;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Z", line = 61)
    public static final boolean method709(int arg0) {
        field1299++;
        class408 var1 = (class408) class231.field3473.method3565(-127);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field5808; var2++) {
            if (var1.field5816[var2] != null && var1.field5816[var2].field6198 == 0) {
                return false;
            }
            if (var1.field5810[var2] != null && var1.field5810[var2].field6198 == 0) {
                return false;
            }
        }
        if (arg0 <= 51) {
            field1290 = -81;
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V", line = 102)
    public static final void method710(boolean arg0) {
        if (class488.field7039 < 0) {
            class488.field7039 = 0;
            class120.field1639 = -1;
            class709.field9963 = -1;
        }
        field1294++;
        if (arg0) {
            field1290 = -5;
        }
        if (class664.field9508 < class488.field7039) {
            class709.field9963 = -1;
            class120.field1639 = -1;
            class488.field7039 = class664.field9508;
        }
        if (class78.field1135 < 0) {
            class78.field1135 = 0;
            class120.field1639 = -1;
            class709.field9963 = -1;
        }
        if (class664.field9509 < class78.field1135) {
            class78.field1135 = class664.field9509;
            class709.field9963 = -1;
            class120.field1639 = -1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 142)
    public class91(Throwable arg0, String arg1) {
        this.field1298 = arg0;
        this.field1296 = arg1;
    }
}
