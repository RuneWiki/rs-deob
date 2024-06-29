import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class594 {

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "Lgg;")
    public class273 field2;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Lnj;")
    public static class487 field3 = new class487("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "Lqu;")
    public static class364 field6 = new class364(43, 8);

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "Lnj;")
    public static class487 field7 = new class487(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public static void method1(int arg0) {
        field7 = null;
        if (arg0 != 0) {
            method3((byte) -81);
        }
        field3 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZ)I")
    public static final int method2(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return -4;
        } else {
            field5++;
            return arg0 == 1 || arg0 == 3 ? class558.field8290[arg1 & 0x3] : class548.field8170[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Los;II[B)V")
    public class1(class468 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2 = class622.method3630(arg3, 6406, false, -109, arg2, 6406, arg0, arg1);
        this.field2.method1359(10497, false, false);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
    public static final void method3(byte arg0) {
        field4++;
        class211 var1 = null;
        try {
            class286 var2 = class328.field4850.method2175("2", 99, true);
            while (var2.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (arg0 > -37) {
                field7 = null;
            }
            if (var2.field4208 == 1) {
                var1 = (class211) var2.field4213;
                byte[] var3 = new byte[(int) var1.method1372((byte) 76)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1370(var3.length - var4, var3, (byte) -14, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class540.method3169((byte) 126, new class428(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1367(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z")
    public static final boolean method4(int arg0, int arg1, int arg2) {
        field1++;
        int var3 = -39 / ((arg2 - 47) / 55);
        return class622.method3629(arg0, (byte) -52, arg1) | (arg0 & 0x70000) != 0 || class517.method3074(false, arg1, arg0);
    }
}
