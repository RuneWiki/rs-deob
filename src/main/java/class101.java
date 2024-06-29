import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class101 implements class417 {

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field1353 = 2;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lpe;")
    public static class615 field1354;

    @OriginalMember(owner = "client!rba", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field1356++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILcda;B)V", line = 14)
    public static final void method766(int arg0, class534 arg1, byte arg2) {
        class366.field4727 = false;
        class109.field1411 = 0;
        field1355++;
        class546.method2896(arg1, true);
        class575.method3097(arg1, 29013);
        if (class366.field4727) {
            System.out.println("---endgpp---");
        }
        if (arg1.field5367 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field5367 + " psize:" + arg0);
        } else if (arg2 <= 49) {
            field1353 = -90;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 38)
    public class101(String arg0, int arg1) {
        this.field1352 = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIILun;)V", line = 63)
    public static final void method767(int arg0, int arg1, int arg2, int arg3, class266 arg4) {
        class530 var5 = class331.method1910(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field3557 = (arg1 << class291.field3760) + class57.field768;
        arg4.field3560 = arg3;
        arg4.field3561 = (arg2 << class291.field3760) + class57.field768;
        for (class571 var7 = var5.field6887; var7 != null; var7 = var7.field7445) {
            if (var7.field7444.field498) {
                int var8 = var7.field7444.method270(2495);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field3560 += var6;
            arg4.field3556 = true;
        } else if (var5.field6878 != null) {
            arg4.field3560 -= var5.field6878.field1944;
        }
        var5.field6896 = arg4;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V", line = 103)
    public static void method768(int arg0) {
        if (arg0 != -26050) {
            field1353 = -106;
        }
        field1354 = null;
    }
}
