import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class468 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7001 = null;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field7002 = 0;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lni;")
    public static class367 field7003 = new class367(55, 3);

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lpl;")
    public static class468 field7004 = class20.method187(-110);

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
    public static int[] field7006 = new int[13];

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLcb;)Lcb;")
    public abstract class366 method979(byte arg0, class366 arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method2813(int arg0) {
        field7001 = null;
        field7004 = null;
        field7003 = null;
        field7006 = null;
        if (arg0 != 4964) {
            field7003 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Z")
    public static final boolean method2814(boolean arg0) {
        for (int var1 = class81.field1167; var1 < class141.field1892; var1++) {
            class452[][] var2 = class443.field6672[var1];
            for (int var3 = -class28.field408; var3 <= 0; var3++) {
                int var4 = class187.field2514 + var3;
                int var5 = class187.field2514 - var3;
                if (var4 >= class199.field2654 || var5 < class522.field7681) {
                    for (int var6 = -class28.field408; var6 <= 0; var6++) {
                        int var7 = class25.field358 + var6;
                        int var8 = class25.field358 - var6;
                        if (var4 >= class199.field2654) {
                            if (var7 >= class380.field5794) {
                                class452 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6800) {
                                    class160.field2089 = arg0;
                                    class463.field6923.method414(var9, -1);
                                    class463.field6923.method419((byte) 110);
                                }
                            }
                            if (var8 < class207.field2821) {
                                class452 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6800) {
                                    class160.field2089 = arg0;
                                    class463.field6923.method414(var10, -1);
                                    class463.field6923.method419((byte) 124);
                                }
                            }
                        }
                        if (var5 < class522.field7681) {
                            if (var7 >= class380.field5794) {
                                class452 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6800) {
                                    class160.field2089 = arg0;
                                    class463.field6923.method414(var11, -1);
                                    class463.field6923.method419((byte) 116);
                                }
                            }
                            if (var8 < class207.field2821) {
                                class452 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6800) {
                                    class160.field2089 = arg0;
                                    class463.field6923.method414(var12, -1);
                                    class463.field6923.method419((byte) 107);
                                }
                            }
                        }
                        if (class520.field7656 == 0) {
                            if (class467.field6990) {
                                class463.field6923.method413(121, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
