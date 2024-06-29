import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class290 extends class90 {

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lie;")
    public class73 field4578;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "[I")
    public static int[] field4577 = new int[32];

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Z")
    public static boolean field4579;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Lag;")
    public static class97 field4580;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "[Lee;")
    public static class246[] field4583;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public static final void method1935(int arg0) {
        field4576++;
        class282.field4500 = null;
        if (arg0 != 0) {
            field4580 = null;
        }
        class128.field1883 = null;
        class246.field3682 = null;
        class263.field3965 = null;
        class211.field3035 = null;
        class91.field1386 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1936(byte arg0) {
        field4577 = null;
        field4580 = null;
        if (arg0 == 111) {
            field4583 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lie;)V")
    public class290(class73 arg0) {
        this.field4578 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4577[var1] = var0 - 1;
            var0 += var0;
        }
        field4579 = true;
        field4580 = new class97();
        field4581 = 0;
        field4582 = 0;
        field4583 = new class246[14];
    }
}
