import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class347 {

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field5187 = -1;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field5193 = 503;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field5195 = 0;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lpi;")
    public static class342 field5191 = new class342("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lmq;III)V", line = 7)
    public static final void method2203(class350 arg0, int arg1, int arg2, int arg3) {
        field5186++;
        if (class475.field7100 != null || class197.field2903 || arg0 == null || class274.method1760(arg0, (byte) 85) == null) {
            return;
        }
        class475.field7100 = arg0;
        class78.field1310 = class274.method1760(arg0, (byte) 103);
        class95.field1608 = false;
        class303.field4329 = arg1;
        class77.field1288 = arg2;
        class438.field6545 = arg3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I", line = 27)
    public final int method2204(int arg0) {
        field5192++;
        if (arg0 != -4553) {
            this.field5194 = 53;
        }
        return this.field5194;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V", line = 42)
    public static final void method2205(byte arg0, int arg1) {
        field5189++;
        class307.field4691 = -1;
        if (arg1 == 37) {
            class509.field7492 = 3.0F;
        } else if (arg1 == 50) {
            class509.field7492 = 4.0F;
        } else if (arg1 == 75) {
            class509.field7492 = 6.0F;
        } else if (arg1 == 100) {
            class509.field7492 = 8.0F;
        } else if (arg1 == 200) {
            class509.field7492 = 16.0F;
        }
        class307.field4691 = -1;
        int var2 = 126 / ((arg0 - 71) / 53);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 75)
    public static final void method2206(int arg0) {
        if (class281.field4023 == 10) {
            class244.method1590(28, (byte) 109);
        }
        if (arg0 >= -38) {
            field5195 = 110;
        }
        field5190++;
        if (class281.field4023 == 30) {
            class244.method1590(25, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 92)
    public static void method2207(int arg0) {
        field5191 = null;
        if (arg0 != 6033) {
            field5187 = 102;
        }
    }

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;", line = 111)
    public final String toString() {
        field5188++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 124)
    public class347(String arg0, int arg1) {
        this.field5194 = arg1;
    }
}
