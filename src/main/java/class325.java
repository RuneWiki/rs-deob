import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class325 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field5214 = -1;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
    public static boolean field5215 = false;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "S")
    public static short field5213 = 1;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5218 = "Created gameworld";

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lnk;")
    public static class16 field5216;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 9)
    public static final int method2259(byte arg0) {
        field5212++;
        return arg0 == -87 ? ((class213.field3240 == 0 ? 0 : 1) << 22) + ((class90.field1192 ? 1 : 0) << 19) + ((class76.field993 ? 1 : 0) << 15) + ((class290.field4566 ? 1 : 0) << 13) + ((class171.field2601 ? 1 : 0) << 10) + ((class139.field2087 ? 1 : 0) << 9) + ((class13.field136 ? 1 : 0) << 6) + ((class38.field430 ? 1 : 0) << 4) + ((class337.field5384 ? 1 : 0) << 3) + (class164.field2522 & 0x7) + ((class353.field5629 ? 1 : 0) << 5) + ((class327.field5233 ? 1 : 0) << 7) - (-((class10.field104 ? 1 : 0) << 8) + (-(class16.field164 & 0x3 << 11) - (((class347.field5512 ? 1 : 0) << 16) - -(class75.field966 << 17))) - (((class189.field2847 == 0 ? 0 : 1) << 20) + ((class31.field365 == 0 ? 0 : 1) << 21) + (class141.method980() << 23))) : 28;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)I", line = 23)
    public static final int method2260(int arg0, String arg1) {
        field5217++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = class300.method2120((byte) 73, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 59)
    public static void method2261(byte arg0) {
        field5216 = null;
        if (arg0 < 37) {
            field5218 = (String) null;
        }
        field5218 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lwl;B)Lwl;")
    public abstract class102 method245(class102 arg0, byte arg1);
}
