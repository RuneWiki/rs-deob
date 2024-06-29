import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class343 extends class86 {

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    private int field5447 = 4096;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "[B")
    public static byte[] field5445;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "Z")
    public static boolean field5451;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5449;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "Ll;")
    public static class66 field5453;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "[Lla;")
    public static class78[] field5454;

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 3)
    public class343() {
        super(1, true);
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V", line = 8)
    public static void method2416(int arg0) {
        field5454 = null;
        if (arg0 == 256) {
            field5449 = null;
            field5453 = null;
            field5445 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(IB)Lnn;", line = 22)
    public static final class130 method2417(int arg0, byte arg1) {
        field5446++;
        class130 var2 = (class130) class263.field4079.method654(-114, (long) arg0);
        int var3 = 9 % ((arg1 - 23) / 61);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class44.field703.method187(class172.method1355(-22845, arg0), class122.method1059(arg0, 127), -1);
        class130 var5 = new class130();
        var5.field2171 = arg0;
        if (var4 != null) {
            var5.method1122(true, new class25(var4));
        }
        var5.method1127(131);
        class263.field4079.method652(115, var5, (long) arg0);
        return var5;
    }

    static {
        int var0 = 0;
        field5445 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5445[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5451 = true;
        field5449 = new CRC32();
        field5453 = new class66(4);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)[I", line = 71)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            field5451 = false;
        }
        int[] var3 = this.field1225.method1914(arg0, -60);
        field5448++;
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0 - 1 & class280.field4324, 0);
            int[] var5 = this.method774(0, arg0, 0);
            int[] var6 = this.method774(0, class280.field4324 & arg0 + 1, 0);
            for (int var7 = 0; var7 < class93.field1424; var7++) {
                int var8 = (var5[class313.field4848 & var7 + 1] - var5[class313.field4848 & var7 - 1]) * this.field5447;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var6[var7] - var4[var7]) * this.field5447;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var10 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)I", line = 138)
    public static final int method2418(int arg0, String arg1) {
        int var2 = -4 % ((-arg0 - 6) / 62);
        field5452++;
        return class293.method2117(arg1, (byte) 79, 10, true);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZLug;)V", line = 153)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field5447 = arg2.method314((byte) 28);
        }
        field5450++;
        if (arg1) {
            method2417(66, (byte) -42);
        }
    }
}
