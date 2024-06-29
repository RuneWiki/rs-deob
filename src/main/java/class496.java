import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class496 extends class498 {

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field7026;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Ldu;")
    public static class242 field7023 = new class242(10, 4);

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field7034 = 0;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field7036 = 2;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
    public static boolean field7035 = false;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lvl;")
    public static class11 field7037;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2879(int arg0) {
        field7023 = null;
        int var1 = -65 % ((51 - arg0) / 34);
        field7037 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lza;Z)V", line = 14)
    public static final void method2880(class290 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field7031++;
        if (class344.field5002.method2665(-48) == 0) {
            return;
        }
        if (class405.field5737 == 0) {
            for (class101 var4 = (class101) class344.field5002.method2655(15152); var4 != null; var4 = (class101) class344.field5002.method2660((byte) 67)) {
                class344.field5000.method986(arg0, false, var4.field1338, arg0, var4.field1341, var4.field1344, class53.field682, var4.field1340, false, var4.field1345, -128, var4.field1339 ? class246.field3587.field288 : null);
                var4.method2891(-127);
            }
            class385.method2235((byte) 117);
            return;
        }
        if (class375.field5328 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class375.field5328 = class290.method1804(0, var2, 0, class171.field2485, class268.field3914, 4);
            class176.field2533 = class375.field5328.method313(class275.method1731(true, 0, class478.field6666, class340.field4929), class506.method3021(class61.field761, class340.field4929, 0), true);
        }
        for (class101 var3 = (class101) class344.field5002.method2655(15152); var3 != null; var3 = (class101) class344.field5002.method2660((byte) 67)) {
            class344.field5000.method986(arg0, false, var3.field1338, class375.field5328, var3.field1341, var3.field1344, class176.field2533, var3.field1340, false, var3.field1345, -127, var3.field1339 ? class246.field3587.field288 : null);
            var3.method2891(-123);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 69)
    public static final void method2881(byte arg0) {
        field7029++;
        if (class63.field786 == 6) {
            if (arg0 != 63) {
                field7023 = null;
            }
            class63.field786 = 7;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Z", line = 85)
    public final boolean method2882(int arg0) {
        field7027++;
        if (arg0 >= -43) {
            this.method2887(-79, (byte) -69);
        }
        return (this.field7033 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Z", line = 96)
    public final boolean method2883(int arg0) {
        if (arg0 > -31) {
            this.method2887(45, (byte) 86);
        }
        field7030++;
        return (this.field7033 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)I", line = 107)
    public final int method2884(int arg0) {
        field7025++;
        return arg0 == 36 ? (this.field7033 & 0x1F0FE7) >> 18 : 23;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z", line = 119)
    public final boolean method2885(byte arg0) {
        field7028++;
        if (arg0 == 58) {
            return (this.field7033 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)I", line = 130)
    public final int method2886(byte arg0) {
        int var2 = 56 / ((47 - arg0) / 43);
        field7024++;
        return client.method1273(-125, this.field7033);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z", line = 149)
    public final boolean method2887(int arg0, byte arg1) {
        field7032++;
        if (arg1 <= 71) {
            return false;
        } else {
            return (this.field7033 >> arg0 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(II)V", line = 165)
    public class496(int arg0, int arg1) {
        this.field7033 = arg0;
        this.field7026 = arg1;
    }
}
