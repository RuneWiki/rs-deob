import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class290 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lkca;")
    public static class73 field4009 = new class73(13, -1);

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
    public static boolean field4016 = false;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lkea;")
    public static class203 field4010;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[[B")
    public static byte[][] field4014;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1875(int arg0) {
        field4014 = null;
        field4010 = null;
        field4009 = null;
        if (arg0 != 0) {
            method1875(-38);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Luaa;")
    public static final class99 method1876(int arg0, int arg1, int arg2) {
        if (class431.field6408[arg0][arg1][arg2] == null) {
            boolean var3 = class431.field6408[0][arg1][arg2] != null && class431.field6408[0][arg1][arg2].field1162 != null;
            if (var3 && arg0 >= class637.field9161 - 1) {
                return null;
            }
            class639.method3643(arg0, arg1, arg2);
        }
        return class431.field6408[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lada;)V")
    public static final void method1877(class144 arg0) {
        for (int var1 = arg0.field1773; var1 <= arg0.field1762; var1++) {
            for (int var2 = arg0.field1758; var2 <= arg0.field1761; var2++) {
                class99 var3 = class431.field6408[arg0.field1757][var1][var2];
                if (var3 != null) {
                    class104 var4 = var3.field1167;
                    class104 var5 = null;
                    while (var4 != null) {
                        if (var4.field1253 == arg0) {
                            if (var5 == null) {
                                var3.field1167 = var4.field1251;
                            } else {
                                var5.field1251 = var4.field1251;
                            }
                            var4.method647(119);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1251;
                    }
                    var3.field1163 = 0;
                    for (class104 var6 = var3.field1167; var6 != null; var6 = var6.field1251) {
                        var3.field1163 = (byte) (var3.field1163 | var6.field1249);
                    }
                }
            }
        }
    }
}
