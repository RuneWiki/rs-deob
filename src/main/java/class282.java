import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class282 extends class286 {

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static volatile int field4493 = 0;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field4503;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4498;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[I")
    public static int[] field4500;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lha;")
    public static final class267 method1897(int arg0, int arg1) {
        field4496++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class19.field268[var2] == null || class19.field268[var2][var3] == null) {
            boolean var4 = class159.method1072((byte) -14, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1 <= 46) {
            method1901(36, false);
        }
        return class19.field268[var2][var3];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lha;II)I")
    public static final int method1898(class267 arg0, int arg1, int arg2) {
        if (arg1 > -19) {
            return -127;
        }
        field4494++;
        if (!client.method1439(arg0).method631((byte) -55, arg2) && arg0.field4147 == null) {
            return -1;
        } else if (arg0.field4167 == null || arg0.field4167.length <= arg2) {
            return -1;
        } else {
            return arg0.field4167[arg2];
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static void method1899(int arg0) {
        field4500 = null;
        field4503 = null;
        if (arg0 != 16768) {
            field4503 = null;
        }
        field4498 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static final void method1900(byte arg0) {
        class283.field4508 = 0;
        class211.field3039 = -1;
        field4497++;
        class281.field4478 = -1;
        class95.field1451.field1673 = 0;
        class103.field1539 = 0;
        class195.field2807 = -1;
        class68.field1071.field1673 = 0;
        class104.field1545 = -1;
        class234.field3536 = 0;
        class21.field283 = 0;
        class151.field2185 = false;
        class7.field140 = 0;
        class30.field423 = 0;
        for (int var1 = 0; var1 < class194.field2777.length; var1++) {
            if (class194.field2777[var1] != null) {
                class194.field2777[var1].field97 = -1;
            }
        }
        for (int var2 = 0; var2 < class82.field1268.length; var2++) {
            if (class82.field1268[var2] != null) {
                class82.field1268[var2].field97 = -1;
            }
        }
        class62.method439(arg0 ^ 0xFFFFFFDA);
        class68.field1069 = 1;
        class245.method1608((byte) 84, 30);
        if (arg0 != -6) {
            method1900((byte) -99);
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class21.field278[var3] = true;
        }
        class146.method976((byte) -1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
    public static final void method1901(int arg0, boolean arg1) {
        field4502++;
        if (arg0 < 55) {
            method1898((class267) null, -105, -98);
        }
        byte var2 = 4;
        byte[][] var3 = class255.field3870;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class23.field303[var5] >> 8) * 64 - class113.field1615;
            int var12 = (class23.field303[var5] & 0xFF) * 64 - class95.field1445;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class270.method1804(10288);
                class256.method1715(0, class246.field3681, var12, class156.field2280 * 8 - 48, arg1, (class200.field2893 - 6) * 8, var13, var11);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class23.field303[var6] >> 8) * 64 - class113.field1615;
            int var8 = (class23.field303[var6] & 0xFF) * 64 - class95.field1445;
            byte[] var9 = var3[var6];
            if (var9 == null && class200.field2893 < 800) {
                class270.method1804(10288);
                for (int var10 = 0; var10 < var2; var10++) {
                    class23.method172(var10, 64, 64, var8, -1, var7);
                }
            }
        }
    }
}
