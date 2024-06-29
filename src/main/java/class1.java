import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class82 {

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
    public static boolean field14 = false;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6 = "flash3:";

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "[Z")
    public static boolean[] field16 = new boolean[100];

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "J")
    public long field15;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lbj;")
    public static class157 field12;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lwf;")
    public class1 field5;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lwf;")
    public class1 field7;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lpf;")
    public static class294 field9;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
    public static int[] field2;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[I")
    public static int[] field4;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1(int arg0, String arg1, String arg2, String arg3, int arg4, int arg5) {
        field1++;
        for (int var6 = 99; var6 > 0; var6--) {
            class243.field3638[var6] = class243.field3638[var6 - 1];
            class158.field2399[var6] = class158.field2399[var6 - 1];
            class202.field3059[var6] = class202.field3059[var6 - 1];
            class124.field1871[var6] = class124.field1871[var6 - 1];
            class72.field1171[var6] = class72.field1171[var6 - 1];
        }
        class66.field1064 = class68.field1077;
        class234.field3522++;
        class243.field3638[0] = arg4;
        class158.field2399[arg0] = arg1;
        class72.field1171[0] = arg5;
        class202.field3059[0] = arg3;
        class124.field1871[0] = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public static void method2(byte arg0) {
        field4 = null;
        field12 = null;
        field2 = null;
        field10 = null;
        field9 = null;
        field6 = null;
        field16 = null;
        if (arg0 > -22) {
            method1(91, (String) null, (String) null, (String) null, 31, -122);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)V")
    public static final void method3(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class196.field2979.field3748 = 0;
        class196.field2979.method1568(20, (byte) 49);
        class196.field2979.method1568(arg3, (byte) 49);
        field3++;
        class196.field2979.method1568(arg1, (byte) 49);
        class196.field2979.method1605(arg4, (byte) -100);
        class196.field2979.method1605(arg0, (byte) -102);
        class110.field1708 = 0;
        if (arg2 != -33) {
            method2((byte) 31);
        }
        class61.field970 = -3;
        class163.field2501 = 1;
        class234.field3523 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V")
    public final void method4(byte arg0) {
        field11++;
        if (this.field5 == null) {
            return;
        }
        this.field5.field7 = this.field7;
        this.field7.field5 = this.field5;
        this.field5 = null;
        this.field7 = null;
        if (arg0 != -55) {
            method3(-13, 28, (byte) 79, 113, -120);
        }
    }
}
