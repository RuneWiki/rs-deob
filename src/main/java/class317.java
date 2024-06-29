import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class317 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field5464;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lng;")
    public static class138 field5463;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field5460;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 5)
    public static final void method2205() {
        class237.field4040 = 0;
        label194: for (int var0 = 0; var0 < class112.field1955; var0++) {
            class171 var1 = class143.field2502[var0];
            if (class300.field5169 != null) {
                for (int var2 = 0; var2 < class300.field5169.length; var2++) {
                    if (class300.field5169[var2] != -1000000 && (var1.field3040 <= class300.field5169[var2] || var1.field3031 <= class300.field5169[var2]) && (var1.field3030 <= class189.field3485[var2] || var1.field3039 <= class189.field3485[var2]) && (var1.field3030 >= class200.field3645[var2] || var1.field3039 >= class200.field3645[var2]) && (var1.field3049 <= class182.field3227[var2] || var1.field3047 <= class182.field3227[var2]) && (var1.field3049 >= class225.field3917[var2] || var1.field3047 >= class225.field3917[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3035 == 1) {
                int var3 = var1.field3032 + class195.field3553 - class91.field1661;
                if (var3 >= 0 && var3 <= class195.field3553 + class195.field3553) {
                    int var4 = var1.field3034 + class195.field3553 - class93.field1683;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3042 + class195.field3553 - class93.field1683;
                    if (var5 > class195.field3553 + class195.field3553) {
                        var5 = class195.field3553 + class195.field3553;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class53.field978[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class310.field5346 - var1.field3030;
                        if (var7 > 32) {
                            var1.field3041 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3041 = 2;
                            var7 = -var7;
                        }
                        var1.field3026 = (var1.field3049 - class271.field4623 << 8) / var7;
                        var1.field3048 = (var1.field3047 - class271.field4623 << 8) / var7;
                        var1.field3046 = (var1.field3040 - class59.field1079 << 8) / var7;
                        var1.field3037 = (var1.field3031 - class59.field1079 << 8) / var7;
                        class204.field3708[class237.field4040++] = var1;
                    }
                }
            } else if (var1.field3035 == 2) {
                int var8 = var1.field3034 + class195.field3553 - class93.field1683;
                if (var8 >= 0 && var8 <= class195.field3553 + class195.field3553) {
                    int var9 = var1.field3032 + class195.field3553 - class91.field1661;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3038 + class195.field3553 - class91.field1661;
                    if (var10 > class195.field3553 + class195.field3553) {
                        var10 = class195.field3553 + class195.field3553;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class53.field978[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class271.field4623 - var1.field3049;
                        if (var12 > 32) {
                            var1.field3041 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3041 = 4;
                            var12 = -var12;
                        }
                        var1.field3028 = (var1.field3030 - class310.field5346 << 8) / var12;
                        var1.field3033 = (var1.field3039 - class310.field5346 << 8) / var12;
                        var1.field3046 = (var1.field3040 - class59.field1079 << 8) / var12;
                        var1.field3037 = (var1.field3031 - class59.field1079 << 8) / var12;
                        class204.field3708[class237.field4040++] = var1;
                    }
                }
            } else if (var1.field3035 == 4) {
                int var13 = var1.field3040 - class59.field1079;
                if (var13 > 128) {
                    int var14 = var1.field3034 + class195.field3553 - class93.field1683;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3042 + class195.field3553 - class93.field1683;
                    if (var15 > class195.field3553 + class195.field3553) {
                        var15 = class195.field3553 + class195.field3553;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3032 + class195.field3553 - class91.field1661;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3038 + class195.field3553 - class91.field1661;
                        if (var17 > class195.field3553 + class195.field3553) {
                            var17 = class195.field3553 + class195.field3553;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class53.field978[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3041 = 5;
                            var1.field3028 = (var1.field3030 - class310.field5346 << 8) / var13;
                            var1.field3033 = (var1.field3039 - class310.field5346 << 8) / var13;
                            var1.field3026 = (var1.field3049 - class271.field4623 << 8) / var13;
                            var1.field3048 = (var1.field3047 - class271.field4623 << 8) / var13;
                            class204.field3708[class237.field4040++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lj;", line = 229)
    public static final class227 method2206(boolean arg0) {
        if (arg0) {
            method2208(-14, (byte) -43, false, true, 61);
        }
        field5459++;
        int var1 = class94.field1692[0] * class62.field1093[0];
        byte[] var2 = class6.field92[0];
        class227 var5;
        if (class90.field1656[0]) {
            byte[] var6 = class216.field3848[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class100.method721(class305.field5270[class150.method1123(var2[var8], 255)], class150.method1123(255, var6[var8]) << 24);
            }
            var5 = new class212(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class305.field5270[class150.method1123(255, var2[var4])];
            }
            var5 = new class227(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], var3);
        }
        class183.method1343(255);
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 293)
    public static void method2207(int arg0) {
        if (arg0 >= -92) {
            method2205();
        }
        field5463 = null;
        field5460 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBZZI)V", line = 308)
    public static final void method2208(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        field5458++;
        if (arg1 != 43) {
            method2207(-105);
        }
        class272.method1877(arg3, class288.field4988.length - 1, arg4, 2, arg2, arg0, 0);
    }
}
