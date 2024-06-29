import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class718 {

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[I")
    public static int[] field9948 = new int[5];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field9946 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Z")
    public static boolean field9945 = false;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lld;")
    public static class127 field9940 = new class127(1);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Luia;")
    public static class589 field9950;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
    public static int[] field9947;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[Lwb;")
    public static class577[] field9943;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILns;III)V")
    public static final void method4012(int arg0, int arg1, int arg2, class654 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -29197) {
            field9945 = true;
        }
        field9949++;
        class236.method1613(arg3.field3467, arg5, arg0, arg3.field3460, arg2, (byte) -80, arg6, 0, arg1, arg3.field3470);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method4013(int arg0) {
        if (arg0 >= -121) {
            return;
        }
        field9940 = null;
        field9950 = null;
        field9948 = null;
        field9947 = null;
        field9943 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILoc;)Z")
    public static final boolean method4014(int arg0, class466 arg1) {
        field9941++;
        class286 var2 = class390.field5558.method3065(64, arg1.method760(-27640));
        if (var2.field4199 == -1) {
            return true;
        } else if (arg0 >= 0) {
            return false;
        } else {
            class408 var3 = class35.field354.method2914(var2.field4199, -104);
            return var3.field5744 == -1 ? true : var3.method2499((byte) -125);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
    public static final boolean method4015(int arg0, int arg1) {
        field9942++;
        if (arg1 < 50) {
            method4012(-124, -58, -30, null, 35, 59, -95);
        }
        if (class689.field9604[arg0]) {
            return true;
        } else if (class131.field1691.method1865(arg0, (byte) -16)) {
            int var2 = class131.field1691.method1867(arg0, (byte) 49);
            if (var2 == 0) {
                class689.field9604[arg0] = true;
                return true;
            }
            if (class609.field8594[arg0] == null) {
                class609.field8594[arg0] = new class115[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class609.field8594[arg0][var3] == null) {
                    byte[] var4 = class131.field1691.method1849(var3, (byte) 69, arg0);
                    if (var4 != null) {
                        class115 var5 = class609.field8594[arg0][var3] = new class115();
                        var5.field1446 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method839(new class511(var4), (byte) -73);
                    }
                }
            }
            class689.field9604[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9944++;
        throw new IllegalStateException();
    }
}
