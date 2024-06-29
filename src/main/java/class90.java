import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class90 implements class303 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "F")
    public static float field1651 = 1.0F;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field1654 = -1;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Lbs;")
    public static class640 field1652 = new class640(8);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lom;")
    public static class344 field1653;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method876(boolean arg0) {
        if (arg0) {
            method879('7', (byte) -59);
        }
        field1653 = null;
        field1652 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(JI[ILja;)Ljava/lang/String;")
    public final String method877(long arg0, int arg1, int[] arg2, class254 arg3) {
        if (arg1 >= -34) {
            method878(null, (byte) 104);
        }
        field1650++;
        if (class536.field7508 == arg3) {
            class285 var6 = class404.field5837.method3103(arg2[0], 0);
            return var6.method1887((byte) 107, (int) arg0);
        } else if (class543.field7581 == arg3 || class81.field1586 == arg3) {
            class110 var7 = class268.field3985.method258((int) arg0, (byte) -67);
            return var7.field1954;
        } else if (class195.field3067 == arg3 || class438.field6318 == arg3 || class544.field7586 == arg3) {
            return class404.field5837.method3103(arg2[0], 0).method1887((byte) 118, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lbw;B)V")
    public static final void method878(class641 arg0, byte arg1) {
        arg0.method3650((byte) 48);
        field1655++;
        int var2 = class422.field6096;
        class602 var3 = class532.field7456 = class59.field1341[var2] = new class602();
        var3.field8728 = var2;
        int var4 = arg0.method3648(100, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFCC87) >> 14;
        var3.field8787[0] = var6 - class33.field967;
        int var7 = var4 & 0x3FFF;
        var3.field9806 = (var3.field8787[0] << 9) + (var3.method3446(0) << 8);
        var3.field8785[0] = var7 - class323.field4749;
        var3.field9815 = (var3.field8785[0] << 9) + (var3.method3446(0) << 8);
        class37.field1046 = var3.field9814 = var3.field9804 = var5;
        if (class89.method868(5125, var3.field8787[0], var3.field8785[0])) {
            var3.field9804++;
        }
        if (class577.field8397[var2] != null) {
            var3.method3450(class577.field8397[var2], -82);
        }
        class237.field3520 = 0;
        class47.field1140[class237.field3520++] = var2;
        class282.field4185[var2] = 0;
        class102.field1807 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var10 = arg0.method3648(93, 18);
                int var11 = var10 >> 16;
                int var12 = (var10 & 0xFF67) >> 8;
                int var13 = var10 & 0xFF;
                class455 var14 = class568.field8276[var8] = new class455();
                var14.field6493 = -1;
                var14.field6489 = 0;
                var14.field6490 = false;
                var14.field6491 = (var12 << 14) + ((var11 << 28) + var13);
                class363.field5393[class102.field1807++] = var8;
                class282.field4185[var8] = 0;
            }
        }
        arg0.method3647(-109);
        int var9 = -7 / ((arg1 - 18) / 53);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(CB)Z")
    public static final boolean method879(char arg0, byte arg1) {
        if (arg1 == 30) {
            field1656++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }
}
