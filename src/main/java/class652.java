import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class652 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field9348 = -1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field9347 = -1;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method3751(int arg0) {
        while (true) {
            if (class352.field5213.method1202(arg0 ^ 0x52015FCB, class322.field4395) >= 15) {
                int var1 = class352.field5213.method1206(15, (byte) -90);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class63 var3 = (class63) class389.field5608.method4020((long) var1, (byte) -108);
                    if (var3 == null) {
                        class571 var4 = new class571();
                        var4.field4592 = var1;
                        var3 = new class63(var4);
                        class389.field5608.method4022(var3, -107, (long) var1);
                        var2 = true;
                        class414.field5889[class551.field8042++] = var3;
                    }
                    class571 var5 = var3.field1004;
                    class545.field7927[class619.field8816++] = var1;
                    var5.field4548 = class628.field8906;
                    if (var5.field8235 != null && var5.field8235.method3164(true)) {
                        class45.method447((byte) -99, var5);
                    }
                    int var6 = class352.field5213.method1206(1, (byte) -90);
                    if (var6 == 1) {
                        class597.field8490[class172.field2414++] = var1;
                    }
                    int var7 = class352.field5213.method1206(5, (byte) -90);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class352.field5213.method1206(1, (byte) -90);
                    int var9 = class352.field5213.method1206(5, (byte) -90);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    int var10 = class352.field5213.method1206(2, (byte) -90);
                    int var11 = (class352.field5213.method1206(3, (byte) -90) + 4 & 0x94600007) << 11;
                    var5.method3395(class288.field4000.method2822(class352.field5213.method1206(14, (byte) -90), 50), 0);
                    var5.method2066(var5.field8235.field7512, true);
                    var5.field4571 = var5.field8235.field7516 << 3;
                    if (var2) {
                        var5.method2061((byte) -115, var11, true);
                    }
                    var5.method3397(class108.field1536.field4645[0] + var7, var10, class108.field1536.field4646[0] + var9, var5.method2053(true), var8 == 1, (byte) -86);
                    if (var5.field8235.method3164(true)) {
                        class709.method3965(var5.field4645[0], var5, var5.field4646[0], null, null, var5.field3920, (byte) -14, 0);
                    }
                    continue;
                }
            }
            field9349++;
            class352.field5213.method1208((byte) -86);
            if (arg0 != 1375821763) {
                method3751(-102);
                return;
            }
            return;
        }
    }
}
