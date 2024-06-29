import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lr;")
    private class118 field1222 = new class118();

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field1217 = new int[256];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lfc;")
    public static class39 field1221 = class90.method774("::fpsoff", -102);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "J")
    public static long field1226 = 0L;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lfc;")
    public static class39 field1228;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static volatile int field1227;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1225;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1217[var0] = var1;
        }
        field1228 = class90.method774("sl_stars", -122);
        field1227 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lr;B)V", line = 20)
    public final void method521(class118 arg0, byte arg1) {
        field1220++;
        if (arg0.field3089 != null) {
            arg0.method1023((byte) 98);
        }
        if (arg1 <= -14) {
            arg0.field3097 = this.field1222;
            arg0.field3089 = this.field1222.field3089;
            arg0.field3089.field3097 = arg0;
            arg0.field3097.field3089 = arg0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILr;)V", line = 40)
    public final void method522(int arg0, class118 arg1) {
        if (arg1.field3089 != null) {
            arg1.method1023((byte) -123);
        }
        field1219++;
        arg1.field3097 = this.field1222.field3097;
        int var3 = -3 / ((-arg0 - 16) / 45);
        arg1.field3089 = this.field1222;
        arg1.field3089.field3097 = arg1;
        arg1.field3097.field3089 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 113)
    public class45() {
        this.field1222.field3089 = this.field1222;
        this.field1222.field3097 = this.field1222;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 79)
    public static void method523(int arg0) {
        field1228 = null;
        field1217 = null;
        if (arg0 < -6) {
            field1221 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lr;", line = 95)
    public final class118 method524(byte arg0) {
        if (arg0 >= -125) {
            this.method525(92);
        }
        field1218++;
        class118 var2 = this.field1222.field3097;
        if (this.field1222 == var2) {
            return null;
        } else {
            var2.method1023((byte) -106);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lr;", line = 122)
    public final class118 method525(int arg0) {
        field1223++;
        class118 var2 = this.field1222.field3097;
        if (this.field1222 == var2) {
            return null;
        } else {
            if (arg0 != 256) {
                this.method525(93);
            }
            return var2;
        }
    }
}
