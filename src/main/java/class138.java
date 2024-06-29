import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class138 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lwj;")
    public static class149 field2214 = null;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2217 = null;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lte;")
    public static class244 field2215 = new class244(16);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lrb;")
    public static class135 field2211;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lvd;)V")
    public static final void method959(class19 arg0) {
        for (int var1 = arg0.field240; var1 <= arg0.field239; var1++) {
            for (int var2 = arg0.field235; var2 <= arg0.field233; var2++) {
                class246 var3 = class46.field585[arg0.field246][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4044; var4++) {
                        if (var3.field4038[var4] == arg0) {
                            var3.field4044--;
                            for (int var5 = var4; var5 < var3.field4044; var5++) {
                                var3.field4038[var5] = var3.field4038[var5 + 1];
                                var3.field4037[var5] = var3.field4037[var5 + 1];
                            }
                            var3.field4038[var3.field4044] = null;
                            break;
                        }
                    }
                    var3.field4057 = 0;
                    for (int var6 = 0; var6 < var3.field4044; var6++) {
                        var3.field4057 |= var3.field4037[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)I")
    public static final int method960(int arg0, boolean arg1) {
        field2212++;
        return arg1 ? -41 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IZ)V")
    public static final void method961(int arg0, boolean arg1) {
        class21.method117(class164.field2602, arg1, (byte) 113, class283.field4517, class292.field4640);
        field2218++;
        if (arg0 > -27) {
            method962(-100);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method962(int arg0) {
        field2217 = null;
        field2214 = null;
        field2211 = null;
        field2215 = null;
        if (arg0 != 0) {
            field2214 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class138() {
        new class280();
    }
}
