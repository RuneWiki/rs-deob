import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class70 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "J")
    public long field1291;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lqk;")
    public class70 field1290;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lqk;")
    public class70 field1292;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 98) {
            return;
        }
        if (class87.field1520 <= arg1 && arg1 <= class177.field2930) {
            int var5 = class114.method842(class190.field3224, (byte) -103, arg4, class289.field4704);
            int var6 = class114.method842(class190.field3224, (byte) -109, arg0, class289.field4704);
            class316.method2279(var6, arg2, var5, (byte) -115, arg1);
        }
        field1295++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z", line = 28)
    public final boolean method534(int arg0) {
        field1294++;
        if (arg0 != 0) {
            field1286 = 50;
        }
        return this.field1292 != null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 44)
    public final void method535(int arg0) {
        field1293++;
        if (this.field1292 == null) {
            return;
        }
        this.field1292.field1290 = this.field1290;
        this.field1290.field1292 = this.field1292;
        this.field1290 = null;
        this.field1292 = null;
        if (arg0 != -2801) {
            this.method534(59);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 70)
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1288++;
        class181 var7 = class204.method1392(arg4, 1, arg2);
        if (var7 != null && var7.field3032 != null) {
            class47 var8 = new class47();
            var8.field939 = var7;
            var8.field936 = var7.field3032;
            class20.method184(var8, (byte) 120);
        }
        class354.field5650 = arg2;
        class13.field397 = arg0;
        if (arg3 != -15002) {
            method537((byte) 58);
        }
        class229.field3756 = arg5;
        class119.field2126 = arg4;
        class332.field5295 = arg6;
        class52.field1046 = true;
        class143.field2415 = arg1;
        class52.method459(128, var7);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 102)
    public static final void method537(byte arg0) {
        if (arg0 >= -123) {
            field1287 = 39;
        }
        for (int var1 = 0; var1 < class255.field4184; var1++) {
            int var2 = class23.field570[var1];
            class314 var3 = class149.field2533[var2];
            if (var3 != null) {
                class284.method2014(var3, var3.field5107.field1565, 255);
            }
        }
        field1289++;
    }
}
