import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lod;")
    public static class101 field1205 = class46.method335(-81, "VOLL");

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Llb;")
    public static class78 field1202 = new class78();

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lod;")
    private static class101 field1209 = class46.method335(-105, " is already on your friend list");

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lod;")
    public static class101 field1207 = class46.method335(-127, "<col=ff0000>");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Z")
    public static boolean field1210 = false;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lod;")
    private static class101 field1206 = class46.method335(90, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lod;")
    public static class101 field1212 = field1206;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lod;")
    public static class101 field1211 = class46.method335(-57, "hel");

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lod;")
    public static class101 field1214 = class46.method335(-50, "(Y");

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lod;")
    public static class101 field1208 = field1209;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method381(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 >= -60) {
            method382((byte) 52);
        }
        field1199++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class132.field3030) {
            try {
                class154 var3 = (class154) Class.forName("hf").getDeclaredConstructor().newInstance();
                var3.method396(arg2, -116);
                return var3;
            } catch (Throwable var4) {
                class132.field3030 = true;
            }
        }
        return arg1 ? class57.method403(-121, arg2) : arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method382(byte arg0) {
        field1207 = null;
        field1205 = null;
        field1209 = null;
        field1206 = null;
        if (arg0 <= 114) {
            method382((byte) 73);
        }
        field1211 = null;
        field1214 = null;
        field1208 = null;
        field1212 = null;
        field1202 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lod;Lod;ILod;)V")
    public static final void method383(class101 arg0, class101 arg1, int arg2, class101 arg3) {
        if (arg2 != -5) {
            method381(-103, false, null);
        }
        class85.field1881 = arg1;
        field1204++;
        class85.field1865 = arg0;
        class85.field1868 = arg3;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static final void method384(byte arg0) {
        class43.field1032 = new int[33];
        class12.field253 = new int[33];
        class119.field2633 = new int[151];
        field1203++;
        class10.field147 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class6.field79.field2569[class6.field79.field2572 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class12.field253[var1] = var6;
            class43.field1032[var1] = var7 - var6;
        }
        if (arg0 >= -39) {
            method382((byte) 88);
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 0;
            int var4 = 999;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class6.field79.field2569[var5 + class6.field79.field2572 * var2] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var4 == 999) {
                        var4 = var5;
                    }
                } else if (var4 != 999) {
                    var3 = var5;
                    break;
                }
            }
            class10.field147[var2 - 5] = var4 - 25;
            class119.field2633[var2 - 5] = var3 - var4;
        }
    }
}
