import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class41 extends InputStream {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "[I")
    public static int[] field568 = new int[4096];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lci;", line = 6)
    public static final class201 method336(byte arg0) {
        if (arg0 >= -94) {
            return (class201) null;
        } else {
            class201 var1 = new class201(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], class207.field3298[0], class81.field1101);
            field569++;
            class207.method1526(0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!al", name = "read", descriptor = "()I", line = 20)
    public final int read() {
        field567++;
        class272.method1918((byte) 22, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 29)
    public static void method337(int arg0) {
        field568 = null;
        if (arg0 != 28069) {
            method339(-16, 95);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V", line = 40)
    public static final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class34 var5 = class91.method656(arg4, arg0 ^ 0x1D12, 10);
        var5.method307(arg0 - 11619);
        var5.field500 = arg1;
        var5.field502 = arg2;
        field564++;
        var5.field497 = arg3;
        if (arg0 != -7444) {
            method337(-91);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lmn;", line = 57)
    public static final class161 method339(int arg0, int arg1) {
        field566++;
        if (arg0 <= 3) {
            return (class161) null;
        }
        class161 var2 = (class161) class277.field4283.method1351((long) arg1, 63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4176.method1813(class206.method1518(-92, arg1), class15.method141(arg1, 1000), true);
        class161 var4 = new class161();
        var4.field2601 = arg1;
        if (var3 != null) {
            var4.method1195(new class6(var3), -1);
        }
        var4.method1203((byte) -27);
        class277.field4283.method1347(var4, (long) arg1, (byte) -68);
        return var4;
    }
}
