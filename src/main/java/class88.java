import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class88 {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[Lml;")
    public class264[] field1286 = null;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lml;")
    public class264[] field1284 = null;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lmd;")
    public class380 field1283 = null;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lmd;")
    public class380 field1288 = null;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lmd;")
    public class380 field1280 = null;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
    public boolean field1289;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lnj;")
    public static class162 field1287 = new class162(8);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method667(int arg0) {
        field1287 = null;
        if (arg0 != 6409) {
            method668((byte) -103);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method668(byte arg0) {
        field1285++;
        if (!class59.field720 || arg0 != -70) {
            return;
        }
        class150 var1 = class525.method3121(class214.field2994, class250.field3462, -9140);
        if (var1 != null && var1.field2206 != null) {
            class437 var2 = new class437();
            var2.field6390 = var1;
            var2.field6389 = var1.field2206;
            class429.method2537(var2);
        }
        class59.field720 = false;
        class226.field3209 = -1;
        class11.field171 = -1;
        if (var1 != null) {
            class370.method2222(0, var1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lef;)V")
    public class88(class338 arg0) {
        this.field1289 = arg0.field4879;
        class61.method503(arg0, 16);
        if (this.field1289) {
            byte[] var6 = class526.method3129(class440.field6508, false, (byte) 40);
            this.field1280 = new class380(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class526.method3129(class467.field6841, false, (byte) 40);
            this.field1283 = new class380(arg0, 6410, 128, 128, 16, var7, 6410);
            class19 var8 = arg0.field4748;
            if (var8.method116((byte) -60)) {
                byte[] var9 = class526.method3129(class143.field2056, false, (byte) 40);
                this.field1288 = new class380(arg0, 6408, 128, 128, 16);
                class380 var10 = new class380(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method118(var10, this.field1288, 2.0F, (byte) 72)) {
                    this.field1288.method336(9323);
                } else {
                    this.field1288.method341(-7733);
                    this.field1288 = null;
                }
                var10.method341(-7733);
            }
        } else {
            this.field1284 = new class264[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class483.method2843(class440.field6508, 20969, var2 * 32768, 32768);
                this.field1284[var2] = new class264(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1286 = new class264[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class483.method2843(class467.field6841, 20969, var3 * 128 * 256, 32768);
                this.field1286[var3] = new class264(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
