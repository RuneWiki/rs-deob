import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class240 {

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[J")
    public static long[] field4174 = new long[32];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lj;")
    public static class155 field4166;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public static final void method1648(boolean arg0) {
        if (arg0) {
            method1650(-127, 116);
        }
        field4167++;
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILu;B)[Ljg;")
    public static final class158[] method1649(int arg0, class111 arg1, byte arg2) {
        if (arg2 != -108) {
            field4172 = -30;
        }
        field4171++;
        return class241.method1656(arg0, 0, arg1) ? class153.method1105((byte) -104) : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[B")
    public static final byte[] method1650(int arg0, int arg1) {
        if (arg0 <= 123) {
            field4166 = null;
        }
        class8 var2 = (class8) class64.field1046.method1491((long) arg1, (byte) 95);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class193.method1373(-1634280864, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class8(var3);
            class64.field1046.method1492(false, (long) arg1, var2);
        }
        field4168++;
        return var2.field88;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILu;I)Ltg;")
    public static final class171 method1651(int arg0, class111 arg1, int arg2) {
        if (arg2 < 115) {
            field4174 = null;
        }
        field4170++;
        return class241.method1656(arg0, 0, arg1) ? class133.method976(1) : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1652(byte arg0) {
        field4169++;
        int var1 = class239.field4161.method1317(class259.field4515);
        for (int var2 = 0; var2 < class39.field616; var2++) {
            int var6 = class239.field4161.method1317(class168.method1170(var2, -3889));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class39.field616 * 15 + 21;
        int var4 = class264.field4616 - var1 / 2;
        if (arg0 < 125) {
            field4174 = null;
        }
        if ((var1 + var4) > class95.field1578) {
            var4 = class95.field1578 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class191.field3203;
        if ((var3 + var5) > class76.field1230) {
            var5 = class76.field1230 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class19.field267 != 1) {
            if (class265.field4642 != class264.field4616 || class221.field3834 != class191.field3203) {
                class19.field267 = 1;
                class242.field4193 = class265.field4642;
                class29.field420 = class221.field3834;
                return;
            }
            class90.field1498 = true;
            class87.field1455 = class39.field616 * 15 + 22;
            class92.field1531 = var1;
            class89.field1475 = var4;
            class255.field4458 = var5;
            class19.field267 = 0;
        } else if (class264.field4616 == class242.field4193 && class29.field420 == class191.field3203) {
            class87.field1455 = class39.field616 * 15 + 22;
            class19.field267 = 0;
            class92.field1531 = var1;
            class255.field4458 = var5;
            class89.field1475 = var4;
            class90.field1498 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static void method1653(boolean arg0) {
        field4166 = null;
        field4174 = null;
        if (arg0) {
            field4166 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    public static final void method1654(int arg0, int arg1) {
        field4173++;
        if (arg0 == -15621) {
            class80.field1290.method1348(arg0 + 15621, arg1);
        }
    }
}
