import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class419 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field6350 = -1;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field6353 = 0;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lqc;")
    public static class140 field6352;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method2671(byte arg0) {
        if (arg0 >= -60) {
            field6352 = null;
        }
        field6352 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z")
    public static final boolean method2672(boolean arg0) {
        for (int var1 = class109.field1556; var1 < class297.field4675; var1++) {
            class409[][] var2 = class217.field3699[var1];
            for (int var3 = -class78.field1156; var3 <= 0; var3++) {
                int var4 = class192.field2847 + var3;
                int var5 = class192.field2847 - var3;
                if (var4 >= class363.field5620 || var5 < class315.field4928) {
                    for (int var6 = -class78.field1156; var6 <= 0; var6++) {
                        int var7 = class241.field3919 + var6;
                        int var8 = class241.field3919 - var6;
                        if (var4 >= class363.field5620) {
                            if (var7 >= class197.field3041) {
                                class409 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6187) {
                                    class53.field723 = arg0;
                                    class409.field6200.method911(106, var9);
                                    class409.field6200.method913(0);
                                }
                            }
                            if (var8 < class529.field7781) {
                                class409 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6187) {
                                    class53.field723 = arg0;
                                    class409.field6200.method911(105, var10);
                                    class409.field6200.method913(0);
                                }
                            }
                        }
                        if (var5 < class315.field4928) {
                            if (var7 >= class197.field3041) {
                                class409 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6187) {
                                    class53.field723 = arg0;
                                    class409.field6200.method911(94, var11);
                                    class409.field6200.method913(0);
                                }
                            }
                            if (var8 < class529.field7781) {
                                class409 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6187) {
                                    class53.field723 = arg0;
                                    class409.field6200.method911(125, var12);
                                    class409.field6200.method913(0);
                                }
                            }
                        }
                        if (class72.field1081 == 0) {
                            if (class310.field4858) {
                                class409.field6200.method909(24, 5);
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
