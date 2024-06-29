import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class90 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1032 = 104;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lkca;")
    public static class73 field1035 = new class73(83, 6);

    @OriginalMember(owner = "client!er", name = "g", descriptor = "[I")
    public static int[] field1038 = new int[8];

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
    public static boolean field1036 = true;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Leea;")
    public static class114 field1037 = new class114();

    @OriginalMember(owner = "client!er", name = "i", descriptor = "[S")
    public static short[] field1040 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lrt;I)Ljava/lang/String;")
    public static final String method577(class194 arg0, int arg1) {
        if (arg1 <= 25) {
            return null;
        } else {
            field1033++;
            return class452.method2791(arg0, (byte) 4, 32767);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method578(byte arg0) {
        field1038 = null;
        field1037 = null;
        field1040 = null;
        field1035 = null;
        if (arg0 != 75) {
            field1040 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static final void method579(int arg0) {
        field1034++;
        class393 var1 = null;
        try {
            class175 var2 = class20.field197.method3161(false, true, "2");
            while (var2.field2138 == 0) {
                class646.method3696(1, 1L);
            }
            if (var2.field2138 == arg0) {
                var1 = (class393) var2.field2140;
                byte[] var3 = new byte[(int) var1.method2533((byte) 10)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2531(var4, var3, -14263, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class337.method2176(new class194(var3), 128);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2528((byte) 101);
            }
        } catch (Exception var6) {
        }
    }
}
