import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class304 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lwf;")
    public static class117 field4183 = new class117(8);

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "S")
    public static short field4184 = 256;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lhf;")
    public static class335 field4182;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
    public static final int method1863(int arg0, byte arg1) {
        if (arg1 == -110) {
            field4181++;
            return arg0 & 0xFF;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Z")
    public static final boolean method1864(boolean arg0) {
        for (int var1 = class606.field9004; var1 < class348.field4772; var1++) {
            class205[][] var2 = class420.field5697[var1];
            for (int var3 = -class504.field7141; var3 <= 0; var3++) {
                int var4 = class297.field4092 + var3;
                int var5 = class297.field4092 - var3;
                if (var4 >= class583.field8555 || var5 < class162.field2557) {
                    for (int var6 = -class504.field7141; var6 <= 0; var6++) {
                        int var7 = class18.field169 + var6;
                        int var8 = class18.field169 - var6;
                        if (var4 >= class583.field8555) {
                            if (var7 >= class334.field4628) {
                                class205 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3028) {
                                    class187.field2791 = arg0;
                                    class451.field6356.method929(var9, (byte) -109);
                                    class451.field6356.method938(5126);
                                }
                            }
                            if (var8 < class140.field1987) {
                                class205 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3028) {
                                    class187.field2791 = arg0;
                                    class451.field6356.method929(var10, (byte) 26);
                                    class451.field6356.method938(5126);
                                }
                            }
                        }
                        if (var5 < class162.field2557) {
                            if (var7 >= class334.field4628) {
                                class205 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3028) {
                                    class187.field2791 = arg0;
                                    class451.field6356.method929(var11, (byte) 76);
                                    class451.field6356.method938(5126);
                                }
                            }
                            if (var8 < class140.field1987) {
                                class205 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3028) {
                                    class187.field2791 = arg0;
                                    class451.field6356.method929(var12, (byte) -119);
                                    class451.field6356.method938(5126);
                                }
                            }
                        }
                        if (class303.field4179 == 0) {
                            if (class330.field4555) {
                                class451.field6356.method937(23354, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1865(int arg0) {
        if (arg0 != -8166) {
            field4180 = -37;
        }
        field4182 = null;
        field4183 = null;
    }
}
