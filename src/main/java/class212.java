import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class212 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lph;")
    public static class114 field2873 = new class114(64);

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lmn;")
    public static class77 field2877 = null;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Lfd;")
    public static class194 field2878;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1151(int arg0, int arg1, int arg2) {
        field2875++;
        int var3 = -112 / ((-arg0 - 84) / 38);
        class40 var4 = class162.method872(arg1, (byte) 92, 13);
        var4.method190(0);
        var4.field418 = arg2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 22)
    public static final int method1152(String arg0, byte arg1) {
        if (arg1 != -117) {
            field2877 = null;
        }
        field2876++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class62.method338(arg0.charAt(var4), arg1 - 11));
        }
        return var3;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 44)
    public static void method1153(int arg0) {
        field2873 = null;
        field2877 = null;
        field2878 = null;
        if (arg0 > -65) {
            method1152((String) null, (byte) -52);
        }
    }
}
