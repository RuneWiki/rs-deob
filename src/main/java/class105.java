import jaclib.memory.heap.NativeHeap;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class105 extends class413 {

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1090;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "Lof;")
    public static class620 field1091 = new class620(8);

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "Lbq;")
    public static class289 field1093 = new class289();

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "Loh;")
    public static class404 field1092;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method719(boolean arg0) {
        if (arg0) {
            method722(null, 102);
        }
        class574.field8144.method339(class227.field2589);
        field1088++;
        class574.field8144.method400(class28.field314, class471.field6746, class316.field4009, class470.field6713);
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(Z)V", line = 16)
    public static void method720(boolean arg0) {
        if (arg0) {
            field1093 = null;
        }
        field1093 = null;
        field1091 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)V", line = 29)
    public final void method721(byte arg0) {
        if (arg0 != -39) {
            method719(true);
        }
        field1089++;
        this.field1090.method3808();
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 40)
    public static final byte[] method722(File arg0, int arg1) {
        if (arg1 < 105) {
            field1093 = null;
        }
        field1087++;
        return class319.method1909(arg0, false, (int) arg0.length());
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V", line = 53)
    public class105(int arg0) {
        this.field1090 = new NativeHeap(arg0);
    }
}
