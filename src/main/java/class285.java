import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class285 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lmt;")
    public static class517 field4286 = new class517(8);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lcr;[[BI)V", line = 3)
    public static final void method1768(class367 arg0, byte[][] arg1, int arg2) {
        field4285++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg2 != 3) {
            return;
        }
        for (int var4 = 0; var4 < arg0.field6761; var4++) {
            class436.method2565(arg2 ^ 0xFFFFFFA2);
            for (int var5 = 0; var5 < (class50.field640 >> 3); var5++) {
                for (int var6 = 0; var6 < class448.field6611 >> 3; var6++) {
                    int var7 = class444.field6530[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field6746 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFF944) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class495.field7349.length; var13++) {
                                if (class495.field7349[var13] == var12 && arg1[var13] != null) {
                                    class468 var14 = new class468(arg1[var13]);
                                    arg0.method2688(var4, var9, var6 * 8, var11, -102, var14, var8, var5 * 8, var10, class151.field2300);
                                    arg0.method2190(var10, var8, class407.field6147, var9, var3[0] == -1 ? var3 : null, var4, var11, var6 * 8, (byte) -109, var14, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class89.field1394 = class69.field925.method1803(var3[1], var3[2], var3[0], var3[3], 2174, class119.field1821);
            class407.field6146 = var3[4];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[B", line = 92)
    public static final synchronized byte[] method1769(boolean arg0, int arg1) {
        field4284++;
        if (arg1 == 100 && class242.field3365 > 0) {
            byte[] var2 = class310.field4791[--class242.field3365];
            class310.field4791[class242.field3365] = null;
            return var2;
        } else if (arg0) {
            return null;
        } else if (arg1 == 5000 && class73.field1007 > 0) {
            byte[] var3 = class520.field7626[--class73.field1007];
            class520.field7626[class73.field1007] = null;
            return var3;
        } else if (arg1 == 30000 && class51.field658 > 0) {
            byte[] var4 = class230.field3233[--class51.field658];
            class230.field3233[class51.field658] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 131)
    public static void method1770(int arg0) {
        field4286 = null;
        if (arg0 != -21316) {
            method1768(null, null, -113);
        }
    }
}
