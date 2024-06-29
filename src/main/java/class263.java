import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class263 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "Z")
    public static boolean field3761 = false;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[B")
    public byte[] field3757;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "[S")
    public short[] field3760;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "[S")
    public short[] field3762;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "[S")
    public short[] field3763;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1761(int arg0) {
        class149.field2477.method3740(arg0 ^ 0xFFFFFF86);
        field3759++;
        int var1 = class149.field2477.method3733((byte) -24, 8);
        if (arg0 != 1) {
            return;
        }
        if (class738.field9939 > var1) {
            for (int var2 = var1; var2 < class738.field9939; var2++) {
                class729.field9869[class493.field6819++] = class737.field9925[var2];
            }
        }
        if (class738.field9939 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class738.field9939 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class737.field9925[var3];
            class9 var5 = ((class751) class86.field1546.method1465((long) var4, -6008)).field10510;
            int var6 = class149.field2477.method3733((byte) -24, 1);
            if (var6 == 0) {
                class737.field9925[class738.field9939++] = var4;
                var5.field5732 = class199.field2904;
            } else {
                int var7 = class149.field2477.method3733((byte) -24, 2);
                if (var7 == 0) {
                    class737.field9925[class738.field9939++] = var4;
                    var5.field5732 = class199.field2904;
                    class633.field8706[class661.field9039++] = var4;
                } else if (var7 == 1) {
                    class737.field9925[class738.field9939++] = var4;
                    var5.field5732 = class199.field2904;
                    int var8 = class149.field2477.method3733((byte) -24, 3);
                    var5.method52(var8, 1, -10);
                    int var9 = class149.field2477.method3733((byte) -24, 1);
                    if (var9 == 1) {
                        class633.field8706[class661.field9039++] = var4;
                    }
                } else if (var7 == 2) {
                    class737.field9925[class738.field9939++] = var4;
                    var5.field5732 = class199.field2904;
                    if (class149.field2477.method3733((byte) -24, 1) == 1) {
                        int var11 = class149.field2477.method3733((byte) -24, 3);
                        var5.method52(var11, 2, -10);
                        int var12 = class149.field2477.method3733((byte) -24, 3);
                        var5.method52(var12, 2, -10);
                    } else {
                        int var10 = class149.field2477.method3733((byte) -24, 3);
                        var5.method52(var10, 0, arg0 - 11);
                    }
                    int var13 = class149.field2477.method3733((byte) -24, 1);
                    if (var13 == 1) {
                        class633.field8706[class661.field9039++] = var4;
                    }
                } else if (var7 == 3) {
                    class729.field9869[class493.field6819++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)I", line = 125)
    public static int method1762(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Z", line = 138)
    public static final boolean method1763(int arg0, byte arg1) {
        field3764++;
        if (arg1 >= -45) {
            field3758 = 88;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }
}
