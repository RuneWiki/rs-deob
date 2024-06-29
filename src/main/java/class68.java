import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class68 {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Ljava/lang/String;")
    public String field975;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Ljava/lang/String;")
    public String field968;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljava/lang/String;")
    public String field970;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
    public static boolean field971 = false;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILrg;)Lfq;")
    public static final class202 method597(int arg0, class645 arg1) {
        field974++;
        class739 var2 = class600.method3490((byte) -19, arg1);
        int var3 = arg1.method3720(-19541);
        if (arg0 >= -80) {
            method600(-47, null);
        }
        int var4 = arg1.method3720(-19541);
        int var5 = arg1.method3712((byte) 41);
        return new class202(var2.field10372, var2.field10360, var2.field10369, var2.field10365, var2.field10371, var2.field10364, var2.field10359, var2.field10368, var2.field10358, var3, var4, var5);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static final void method598(byte arg0) {
        field972++;
        if (arg0 != -76) {
            field971 = true;
        }
        class106 var1 = class141.field1858;
        synchronized (class141.field1858) {
            class141.field1858.method809(true);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZB)I")
    public static final int method599(int arg0, int arg1, boolean arg2, byte arg3) {
        field976++;
        class384 var4 = class529.method3090(arg2, (byte) 76, arg0);
        if (arg3 > -66) {
            method598((byte) 69);
        }
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && var4.field5804.length > arg1) {
            return var4.field5804[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class68(String arg0, String arg1, String arg2) {
        this.field975 = arg2;
        this.field968 = arg1;
        this.field970 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILvt;)V")
    public static final void method600(int arg0, class304 arg1) {
        arg1.method1913((byte) -116);
        field973++;
        int var2 = class701.field9775;
        class689 var3 = class130.field1749 = class314.field4456[var2] = new class689();
        var3.field6118 = var2;
        int var4 = arg1.method1914(11356, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC126) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field6133[0] = var6 - class361.field5224;
        var3.field8423 = (var3.field6133[0] << 9) + (var3.method2579(false) << 8);
        var3.field6139[0] = var7 - class582.field8288;
        var3.field8428 = (var3.field6139[0] << 9) + (var3.method2579(false) << 8);
        class341.field4946 = var3.field8429 = var3.field8417 = var5;
        if (class286.method1827(var3.field6133[arg0], var3.field6139[0], (byte) 107)) {
            var3.field8417++;
        }
        if (class470.field6859[var2] != null) {
            var3.method3919(106, class470.field6859[var2]);
        }
        class254.field3653 = 0;
        class345.field4993[class254.field3653++] = var2;
        class727.field10157[var2] = 0;
        class752.field10510 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1914(11356, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF83) >> 8;
                int var12 = var9 & 0xFF;
                class448 var13 = class581.field8256[var8] = new class448();
                var13.field6622 = false;
                var13.field6627 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6628 = 0;
                var13.field6626 = -1;
                class314.field4453[class752.field10510++] = var8;
                class727.field10157[var8] = 0;
            }
        }
        arg1.method1926((byte) 44);
    }
}
