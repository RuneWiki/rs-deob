import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class204 extends class451 {

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lro;")
    public static class249 field2952;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1286(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method1287(56, (byte[]) null, (byte) -63);
        }
        field2947++;
        boolean var4 = true;
        class265 var5 = new class265(arg1);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1700(32767);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1680(-1647926640);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method1697(-74) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < (class324.field4652 - 1) && var16 < (class336.field4964 - 1)) {
                        class404 var17 = class165.method1020(var6, arg3 ^ 0x74);
                        if (var14 != 22 || class258.field3768 || var17.field6009 != 0 || var17.field6039 == 1 || var17.field5997) {
                            if (!var17.method2618(0)) {
                                class72.field987++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1680(arg3 - 1647926640);
                if (var10 == 0) {
                    break;
                }
                var5.method1697(arg3 + 110);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BB)I")
    public static final int method1287(int arg0, byte[] arg1, byte arg2) {
        field2950++;
        int var3 = 47 / ((arg2 + 47) / 45);
        return class38.method299(-5, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method1288(int arg0, int arg1) {
        int var2 = -77 / ((arg0 + 1) / 56);
        field2948++;
        class115.field1564 = -1;
        if (arg1 == 37) {
            class76.field1026 = 3.0F;
        } else if (arg1 == 50) {
            class76.field1026 = 4.0F;
        } else if (arg1 == 75) {
            class76.field1026 = 6.0F;
        } else if (arg1 == 100) {
            class76.field1026 = 8.0F;
        } else if (arg1 == 200) {
            class76.field1026 = 16.0F;
        }
        class115.field1564 = -1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        if (arg0 != 61) {
            method1290((byte) 105);
        }
        field2949++;
        class367.field5457.method212(arg0 - 143);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method1290(byte arg0) {
        field2952 = null;
        if (arg0 != -75) {
            field2946 = 56;
        }
    }
}
