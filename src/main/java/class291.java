import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class291 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Ltg;")
    public static class605 field4480 = new class605();

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lqi;")
    public class291 field4479;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lla;")
    public static class422 field4485;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lvp;")
    public class559 field4482;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 4)
    public static void method1896(byte arg0) {
        if (arg0 > -108) {
            method1899(-6, null);
        }
        field4480 = null;
        field4485 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 15)
    public final void method1897(int arg0) {
        field4481++;
        if (class416.field6106 >= 500) {
            return;
        }
        this.field4482 = null;
        this.field4479 = class210.field3498;
        if (arg0 <= -125) {
            class210.field3498 = this;
            class416.field6106++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 34)
    public static final void method1898(int arg0) {
        field4483++;
        int var1 = class63.field991.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class63.field991[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class688.field9782; var4++) {
                    if (class664.field9436[var4] == class205.field3445[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class664.field9436[class688.field9782] = class205.field3445[var2];
                    var3 = class688.field9782++;
                }
                class301 var5 = new class301(class63.field991[var2]);
                int var6 = 0;
                while (class63.field991[var2].length > var5.field4534 && var6 < 511 && class356.field5394 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1989((byte) -59);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class205.field3445[var2] >> 8) * 64 + var10 - class265.field4123;
                    int var13 = (class205.field3445[var2] & 0xFF) * 64 + var11 - class723.field10155;
                    class504 var14 = class740.field10382.method3434((byte) -115, var5.method1989((byte) -104));
                    class53 var15 = (class53) class332.field4881.method3512(true, (long) var7);
                    if (var15 == null && (var14.field7335 & 0x1) > 0 && class405.field6003 == var9 && var12 >= 0 && class191.field3229 > var14.field7303 + var12 && var13 >= 0 && class314.field4720 > (var14.field7303 + var13)) {
                        class461 var16 = new class461();
                        var16.field1628 = var7;
                        class53 var17 = new class53(var16);
                        class332.field4881.method3516(255, (long) var7, var17);
                        class501.field7280[class271.field4162++] = var17;
                        class45.field758[class356.field5394++] = var7;
                        var16.field1635 = class199.field3403;
                        var16.method2829(-11847, var14);
                        var16.method890(var16.field6688.field7303, 118);
                        var16.field1606 = var16.field6688.field7315 << 3;
                        var16.method884(true, (var16.field6688.field7314 + 4 & 0xC8A00007) << 11, 30934);
                        var16.method2825(var9, true, var13, (byte) -43, var12, var16.method878(-5740));
                    }
                }
            }
        }
        if (arg0 >= -112) {
            field4485 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILgba;)V", line = 142)
    public static final void method1899(int arg0, class702 arg1) {
        field4484++;
        int var2 = 0;
        if (arg0 != -1) {
            method1896((byte) 126);
        }
        while (var2 < class395.field5901) {
            int var3 = class505.field7374[var2];
            class573 var4 = class279.field4271[var3];
            int var5 = arg1.method1987(-26);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method1987(-125) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg1.method1987(-62) << 16;
            }
            class241.method1675(-1, var3, var5, arg1, var4);
            var2++;
        }
    }
}
