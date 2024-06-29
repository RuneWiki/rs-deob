import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class726 extends class461 {

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
    public static int[] field10049 = new int[14];

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lfea;")
    public static class678 field10051 = new class678("INTBETA", "office", "_intbeta", 6);

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field10038;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field10039;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field10040;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field10044;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public int field10045;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field10047;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Ljava/lang/String;")
    public String field10048;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method4037(int arg0) {
        field10042++;
        class479.field6647.method267(-20);
        class205.field2881.method357(0);
        class274.field3958.method783(6868);
        int var1 = -37 / ((54 - arg0) / 60);
        class749.field10341.setBackground(Color.black);
        class392.field5586 = -1;
        class479.field6647 = class170.method1097((byte) 22, class749.field10341);
        class205.field2881 = class612.method3542(true, true, class749.field10341);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 30)
    public static final void method4038(int arg0) {
        field10041++;
        class791.method4331((byte) -17, class111.field1332, (long) class533.field7336);
        if (class610.field8597 != -1) {
            class539.method3204(0, class610.field8597);
        }
        if (arg0 != -777) {
            field10051 = null;
        }
        for (int var1 = 0; var1 < class187.field2331; var1++) {
            if (class363.field5240[var1]) {
                class585.field8271[var1] = true;
            }
            class435.field6034[var1] = class363.field5240[var1];
            class363.field5240[var1] = false;
        }
        class665.field9355 = class533.field7336;
        if (class610.field8597 != -1) {
            class187.field2331 = 0;
            class617.method3563(-91);
        }
        class111.field1332.method208();
        class35.method285(class111.field1332, 110);
        int var2 = class188.method1177((byte) -97);
        if (var2 == -1) {
            var2 = class213.field2954;
        }
        if (var2 == -1) {
            var2 = class574.field8082;
        }
        class243.method1629(var2, 4592);
        class510.field6925 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Z", line = 81)
    public static final boolean method4039(int arg0, int arg1, int arg2) {
        field10043++;
        if (arg0 != 0) {
            field10049 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 94)
    public static void method4040(byte arg0) {
        field10051 = null;
        field10049 = null;
        if (arg0 <= 61) {
            method4037(-54);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)Z", line = 105)
    public static final boolean method4041(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field10046++;
            return (arg1 & 0x10000) != 0;
        } else {
            return false;
        }
    }
}
