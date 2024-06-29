import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class222 {

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lpia;")
    public static class94 field2554 = new class94(42, 3);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 3)
    public static void method1289(int arg0) {
        field2554 = null;
        int var1 = 28 / ((arg0 + 80) / 45);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)J", line = 13)
    public static final long method1290(int arg0) {
        if (arg0 == 0) {
            field2555++;
            return class635.field9137.method312(120);
        } else {
            return -91L;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z", line = 25)
    public static final boolean method1291(int arg0, int arg1, int arg2) {
        if (arg1 < 78) {
            return true;
        }
        field2551++;
        if (class172.method1063((byte) 63, arg0, arg2)) {
            return class60.method460(false, arg0, arg2) | (arg0 & 0x9000) != 0 | class647.method3690(112, arg2, arg0) ? true : ((arg0 & 0x2000) != 0 | class688.method3889(102, arg0, arg2) | class678.method3849(arg2, arg0, -1)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V", line = 54)
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2550++;
        for (class376 var5 = (class376) class1.field6.method1719(65280); var5 != null; var5 = (class376) class1.field6.method1723(arg2 - 40959)) {
            class695.method3917(arg2 ^ 0xFFFFB0C7, var5, arg4, arg1, arg3, arg0);
        }
        if (arg2 != 20294) {
            return;
        }
        for (class376 var6 = (class376) class375.field4815.method1719(65280); var6 != null; var6 = (class376) class375.field4815.method1723(-20665)) {
            byte var12 = 1;
            class255 var13 = var6.field4850.method2992(-1);
            if (var6.field4850.field7147 == -1 || var6.field4850.field7122) {
                var12 = 0;
            } else if (var6.field4850.field7147 == var13.field3081 || var6.field4850.field7147 == var13.field3094 || var6.field4850.field7147 == var13.field3105 || var6.field4850.field7147 == var13.field3090) {
                var12 = 2;
            } else if (var6.field4850.field7147 == var13.field3119 || var6.field4850.field7147 == var13.field3084 || var6.field4850.field7147 == var13.field3116 || var6.field4850.field7147 == var13.field3107) {
                var12 = 3;
            }
            if (var6.field4830 != var12) {
                int var14 = class147.method914(-124, var6.field4850);
                class326 var15 = var6.field4850.field2293;
                if (var15.field4199 != null) {
                    var15 = var15.method1939(true, class722.field10125);
                }
                if (var15 == null || var14 == -1) {
                    var6.field4851 = false;
                    var6.field4830 = var12;
                    var6.field4847 = -1;
                } else if (var6.field4847 == var14 && var15.field4198 == var6.field4851) {
                    var6.field4838 = var15.field4184;
                    var6.field4830 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field4859 == null) {
                        var16 = true;
                    } else {
                        var6.field4838 -= 512;
                        if (var6.field4838 <= 0) {
                            class597.field8470.method1690(var6.field4859);
                            var16 = true;
                            var6.field4859 = null;
                        }
                    }
                    if (var16) {
                        var6.field4835 = null;
                        var6.field4851 = var15.field4198;
                        var6.field4847 = var14;
                        var6.field4849 = null;
                        var6.field4830 = var12;
                        var6.field4838 = var15.field4184;
                    }
                }
            }
            var6.field4852 = var6.field4850.field4635;
            var6.field4845 = var6.field4850.field4635 + (var6.field4850.method1128(-1) << 8);
            var6.field4858 = var6.field4850.field4629;
            var6.field4839 = var6.field4850.field4629 + (var6.field4850.method1128(-1) << 8);
            class695.method3917(arg2 ^ 0xFFFFB0C7, var6, arg4, arg1, arg3, arg0);
        }
        for (class376 var7 = (class376) class653.field9319.method1753(0); var7 != null; var7 = (class376) class653.field9319.method1755(-124)) {
            byte var8 = 1;
            class255 var9 = var7.field4846.method2992(-1);
            if (var7.field4846.field7147 == -1 || var7.field4846.field7122) {
                var8 = 0;
            } else if (var7.field4846.field7147 == var9.field3081 || var7.field4846.field7147 == var9.field3094 || var7.field4846.field7147 == var9.field3105 || var7.field4846.field7147 == var9.field3090) {
                var8 = 2;
            } else if (var7.field4846.field7147 == var9.field3119 || var7.field4846.field7147 == var9.field3084 || var7.field4846.field7147 == var9.field3116 || var7.field4846.field7147 == var9.field3107) {
                var8 = 3;
            }
            if (var7.field4830 != var8) {
                int var10 = class183.method1131(43, var7.field4846);
                if (var7.field4847 == var10 && var7.field4851 == var7.field4846.field2178) {
                    var7.field4830 = var8;
                    var7.field4838 = var7.field4846.field2156;
                } else {
                    boolean var11 = false;
                    if (var7.field4859 == null) {
                        var11 = true;
                    } else {
                        var7.field4838 -= 512;
                        if (var7.field4838 <= 0) {
                            class597.field8470.method1690(var7.field4859);
                            var11 = true;
                            var7.field4859 = null;
                        }
                    }
                    if (var11) {
                        var7.field4851 = var7.field4846.field2178;
                        var7.field4847 = var10;
                        var7.field4830 = var8;
                        var7.field4835 = null;
                        var7.field4838 = var7.field4846.field2156;
                        var7.field4849 = null;
                    }
                }
            }
            var7.field4852 = var7.field4846.field4635;
            var7.field4845 = var7.field4846.field4635 + (var7.field4846.method1128(arg2 ^ 0xFFFFB0B9) << 8);
            var7.field4858 = var7.field4846.field4629;
            var7.field4839 = var7.field4846.field4629 + (var7.field4846.method1128(-1) << 8);
            class695.method3917(-123, var7, arg4, arg1, arg3, arg0);
        }
    }
}
