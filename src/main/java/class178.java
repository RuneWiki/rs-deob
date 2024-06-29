import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class178 extends class37 {

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2076;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Lvf;")
    public static class141 field2077 = new class141(8, 0, 4, 1);

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Lqe;")
    public static class436 field2082;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 5)
    public final void method1056(byte arg0) {
        if (arg0 != 24) {
            this.method1056((byte) 79);
        }
        this.field2076.method3515();
        field2081++;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V", line = 16)
    public class178(int arg0) {
        this.field2076 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I", line = 28)
    public static final int method1057(int arg0, int arg1) {
        int var2 = 47 / ((44 - arg0) / 34);
        field2078++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V", line = 38)
    public static final void method1058(byte arg0) {
        class55.field707.method3702((byte) 24, 5);
        field2079++;
        class329.field4092.method47(5, 3);
        class124.field1510.method3566(58, 5);
        class232.field3017.method2355(0, 5);
        class46.field620.method3761((byte) 19, 5);
        class504.field6287.method1624(5, 1);
        class11.field110.method1138(125, 5);
        class339.field4336.method2157(5, 30);
        class392.field5013.method1361((byte) 114, 5);
        class185.field2186.method2094(5, 4604);
        class510.field6389.method2906(57, 5);
        if (arg0 <= 42) {
            field2082 = null;
        }
        class530.field6699.method97(false, 5);
        class93.field1189.method1006(5, -3);
        class46.field617.method1405(5, 128);
        class434.field5475.method155(5, (byte) 90);
        class7.field77.method1039(29, 5);
        class671.field9178.method2836(-1931, 5);
        class558.field6987.method2539(false, 5);
        class151.field1801.method3560((byte) -47, 5);
        class96.field1247.method836(5, (byte) 41);
        class79.method613(5, (byte) 68);
        class627.method3497(50, 0);
        class409.method2301((byte) 114, 50);
        class84.method643(6, 5);
        class478.method2614(-8780, 5);
        class38.field565.method1222(14564, 5);
        class550.field6905.method1222(14564, 5);
        class222.field2583.method1222(14564, 5);
        class444.field5589.method1222(14564, 5);
        class620.field8415.method1222(14564, 5);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)V", line = 82)
    public static void method1059(byte arg0) {
        field2082 = null;
        if (arg0 >= -14) {
            method1057(-100, 87);
        }
        field2077 = null;
    }
}
