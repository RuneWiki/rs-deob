import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class80 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[F")
    public static float[] field1143 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Llc;")
    public static class435 field1146 = new class435(68, -2);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1147 = 0;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "F")
    public static float field1145;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[B", line = 4)
    public static final synchronized byte[] method652(int arg0, int arg1) {
        field1149++;
        int var2 = 125 / ((arg0 + 7) / 39);
        if (arg1 == 100 && class460.field6529 > 0) {
            byte[] var3 = class77.field1114[--class460.field6529];
            class77.field1114[class460.field6529] = null;
            return var3;
        } else if (arg1 == 5000 && class398.field5697 > 0) {
            byte[] var4 = class291.field4015[--class398.field5697];
            class291.field4015[class398.field5697] = null;
            return var4;
        } else if (arg1 == 30000 && class91.field1291 > 0) {
            byte[] var5 = class628.field8905[--class91.field1291];
            class628.field8905[class91.field1291] = null;
            return var5;
        } else {
            if (class45.field745 != null) {
                for (int var6 = 0; var6 < class160.field2301.length; var6++) {
                    if (class160.field2301[var6] == arg1 && class504.field7330[var6] > 0) {
                        byte[] var7 = class45.field745[var6][--class504.field7330[var6]];
                        class45.field745[var6][class504.field7330[var6]] = null;
                        return var7;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method653(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            field1147 = -10;
        }
        field1144++;
        return class353.method2248(arg2, arg0, -12647) | (arg0 & 0x40000) != 0 || class26.method116(arg1 ^ 0xFFFFFFFB, arg0, arg2);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)V", line = 73)
    public static final synchronized void method654(int arg0, byte[] arg1) {
        if (arg0 > -67) {
            field1147 = -125;
        }
        field1142++;
        if (arg1.length == 100 && class460.field6529 < 1000) {
            class77.field1114[class460.field6529++] = arg1;
        } else if (arg1.length == 5000 && class398.field5697 < 250) {
            class291.field4015[class398.field5697++] = arg1;
        } else if (arg1.length == 30000 && class91.field1291 < 50) {
            class628.field8905[class91.field1291++] = arg1;
        } else if (class45.field745 != null) {
            for (int var2 = 0; var2 < class160.field2301.length; var2++) {
                if (class160.field2301[var2] == arg1.length && class504.field7330[var2] < class45.field745[var2].length) {
                    class45.field745[var2][class504.field7330[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 123)
    public static void method655(byte arg0) {
        int var1 = 3 % ((56 - arg0) / 58);
        field1143 = null;
        field1146 = null;
    }
}
