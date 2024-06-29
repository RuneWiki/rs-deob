import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class273 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lmb;")
    public static class96 field4743 = class243.method1708("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) 127);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "J")
    public static volatile long field4746 = 0L;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lmb;")
    public static class96 field4748 = class243.method1708("Zugewiesener Speicher)3", (byte) 116);

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lmc;")
    public static final class43 method1856(int arg0) {
        if (arg0 < 57) {
            return null;
        }
        field4747++;
        class43 var1 = (class43) class216.field3707.method1391(45);
        if (var1 != null) {
            var1.method1743((byte) 17);
            var1.method740(-22949);
            return var1;
        }
        class43 var2;
        do {
            var2 = (class43) class224.field3815.method1391(68);
            if (var2 == null) {
                return null;
            }
            if (var2.method334(96) > class155.method1133(125)) {
                return null;
            }
            var2.method1743((byte) 34);
            var2.method740(-22949);
        } while ((var2.field1664 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Lna;")
    public static final class19 method1857(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class19 var4 = var3.field3281;
            var3.field3281 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 != 0) {
            method1857(-105, 21, 39);
        }
        field4743 = null;
        field4748 = null;
    }
}
