import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class257 extends class529 {

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "Lnj;")
    public class317 field4153 = new class317();

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field4154 = 328;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "Ljd;")
    public static class426 field4151 = new class426("WTWIP", 3);

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "Z")
    public static boolean field4155 = false;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field4156 = -1;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public static void method1755(byte arg0) {
        if (arg0 <= -121) {
            field4151 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1756(int arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        if (arg0 >= -53) {
            method1755((byte) -96);
        }
        field4152++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class500.field7501.field4362 : class500.field7501.field4358);
        for (int var8 = var6; var8 < var7; var8++) {
            class504 var11 = class500.field7501.method1849(true, var8);
            if (var11.field7539 && var11.method3059(-26099).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class152.field2019 = null;
                    class454.field7028 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class454.field7028 = var5;
        class152.field2019 = var4;
        class77.field1148 = 0;
        String[] var9 = new String[class454.field7028];
        for (int var10 = 0; var10 < class454.field7028; var10++) {
            var9[var10] = class500.field7501.method1849(true, var4[var10]).method3059(-26099);
        }
        class427.method2700(class152.field2019, var9, 0);
    }
}
