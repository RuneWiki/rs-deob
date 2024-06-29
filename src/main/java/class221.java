import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class221 {

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
    public static boolean field3125 = false;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "[F")
    public static float[] field3135 = new float[16];

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "B")
    public byte field3127;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Lfg;")
    public static class117 field3132;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "Lck;")
    public static class600 field3134;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Ljava/lang/String;")
    public String field3123;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Ljava/lang/String;")
    public String field3128;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "Ljava/lang/String;")
    public String field3129;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "Ljava/lang/String;")
    public String field3130;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 3)
    public static void method1394(int arg0) {
        field3135 = null;
        if (arg0 != -1) {
            field3132 = null;
        }
        field3132 = null;
        field3134 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIZ)V", line = 27)
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            method1396((byte) 64);
        }
        for (int var5 = 0; var5 < class172.field2661; var5++) {
            Rectangle var6 = class443.field6070[var5];
            if ((var6.x + var6.width) > arg0 && var6.x < (arg0 + arg1) && (var6.y + var6.height) > arg3 && (arg2 + arg3) > var6.y) {
                class511.field6834[var5] = true;
            }
        }
        field3126++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I", line = 53)
    public static final int method1396(byte arg0) {
        field3131++;
        if (arg0 != 81) {
            field3134 = null;
        }
        if (class109.field1591 == null) {
            if (!class388.field5142 && class398.field5290 > 0) {
                if (class363.field4912 && class561.field7444.method3271(81, 0) && class398.field5290 > 2) {
                    return ((class117) class480.field6411.field7850.field6723.field6723).field1997;
                }
                return ((class117) class480.field6411.field7850.field6723).field1997;
            }
            int var1 = class164.field2564.method1110((byte) 91);
            int var2 = class164.field2564.method1113(-6387);
            int var3 = class259.field3566;
            int var4 = class340.field4703;
            int var5 = class483.field6540;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class398.field5290; var7++) {
                    if (class664.field9427) {
                        int var12 = var4 + ((class398.field5290 + -1 + -var7) * 16) + 33;
                        if ((var12 - 13) < var2 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class398.field5290 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class417 var9 = new class417(class480.field6411);
                    for (class117 var10 = (class117) var9.method2386(32); var10 != null; var10 = (class117) var9.method2388(-104)) {
                        if (var6 == var8++) {
                            return var10.field1997;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
