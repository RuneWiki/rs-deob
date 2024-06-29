import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class478 {

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "[F")
    public static float[] field6665 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field6661 = 765;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "[Lis;")
    public static class503[] field6662;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZLke;)V", line = 7)
    public static final void method2802(boolean arg0, class598 arg1) {
        field6663++;
        class397 var2 = (class397) class68.field1280.method1465((long) arg1.field5716, -6008);
        if (!arg0) {
            return;
        }
        if (var2 == null) {
            class426.method2607(979190089, null, arg1.field5926, arg1.field5743[0], arg1.field5746[0], arg1, null, 0);
        } else {
            var2.method2486((byte) 21);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V", line = 26)
    public static final void method2803(int arg0) {
        field6664++;
        int var1 = class568.field7815.length;
        if (arg0 >= -125) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class568.field7815[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class581.field7953; var4++) {
                    if (class755.field10547[var4] == class199.field2905[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class755.field10547[class581.field7953] = class199.field2905[var2];
                    var3 = class581.field7953++;
                }
                class215 var5 = new class215(class568.field7815[var2]);
                int var6 = 0;
                while (class568.field7815[var2].length > var5.field3109 && var6 < 511 && class738.field9939 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1478(842397944);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class199.field2905[var2] >> 8) * 64 + var10 - class221.field3177;
                    int var13 = (class199.field2905[var2] & 0xFF) * 64 + var11 - class367.field5236;
                    class334 var14 = class510.field7099.method1341(var5.method1478(842397944), -1);
                    class751 var15 = (class751) class86.field1546.method1465((long) var7, -6008);
                    if (var15 == null && (var14.field4642 & 0x1) > 0 && class534.field7352 == var9 && var12 >= 0 && (var12 + var14.field4716) < class376.field5325 && var13 >= 0 && (var14.field4716 + var13) < class175.field2711) {
                        class9 var16 = new class9();
                        var16.field5716 = var7;
                        class751 var17 = new class751(var16);
                        class86.field1546.method1468((byte) 91, (long) var7, var17);
                        class728.field9860[class77.field1375++] = var17;
                        class737.field9925[class738.field9939++] = var7;
                        var16.field5732 = class641.field8810;
                        var16.method61(var14, -2);
                        var16.method2455((byte) 120, var16.field126.field4716);
                        var16.field5736 = var16.field126.field4646 << 3;
                        var16.method2456((byte) -108, (var16.field126.field4672 + 4 & 0x9CE00007) << 11, true);
                        var16.method55(var13, true, var12, 123, var16.method2457((byte) 54), var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V", line = 124)
    public static void method2804(byte arg0) {
        field6662 = null;
        if (arg0 > 43) {
            field6665 = null;
        }
    }
}
