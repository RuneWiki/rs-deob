import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class528 extends class626 {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7506 = 1400;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Leq;")
    public static class209 field7505;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[Luk;")
    public static class259[] field7503;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I", line = 3)
    public static final int method3120(byte arg0) {
        if (arg0 < 70) {
            return -83;
        }
        field7507++;
        if (class755.field10512 == null) {
            if (!class34.field450 && class522.field7394 != null) {
                return class522.field7394.field1183;
            }
            int var1 = class422.field5917.method1597(120);
            int var2 = class422.field5917.method1592(true);
            if (class653.field9200) {
                if (var1 > class396.field5544 && var1 < (class396.field5544 + class380.field5300)) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class173.field2513; var4++) {
                        if (class214.field3067) {
                            int var8 = var4 * 16 + class321.field4557 + 33;
                            if ((var8 - 13) < var2 && var8 + 3 >= var2) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class321.field4557 + 31;
                            if (var2 > (var9 - 13) && var9 + 3 >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class467 var6 = new class467(class211.field3046);
                        for (class241 var7 = (class241) var6.method2834(-97); var7 != null; var7 = (class241) var6.method2835((byte) -96)) {
                            if (var3 == var5++) {
                                if (var7.field3382 == 1) {
                                    return ((class66) var7.field3388.field2357.field3201).field1183;
                                }
                                return -1;
                            }
                        }
                    }
                } else if (class316.field4485 != null && var1 > class138.field2148 && (class167.field2468 + class138.field2148) > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class316.field4485.field3382; var11++) {
                        if (class214.field3067) {
                            int var16 = var11 * 16 + (class114.field1826 + 33);
                            if ((var16 - 13) < var2 && var2 <= var16 + 3) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class114.field1826 + 31;
                            if (var15 - 13 < var2 && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class467 var13 = new class467(class316.field4485.field3388);
                        for (class66 var14 = (class66) var13.method2834(-100); var14 != null; var14 = (class66) var13.method2835((byte) -96)) {
                            if (var10 == var12++) {
                                return var14.field1183;
                            }
                        }
                    }
                }
            } else if (var1 > class396.field5544 && class396.field5544 + class380.field5300 > var1) {
                int var17 = -1;
                for (int var18 = 0; var18 < class409.field5682; var18++) {
                    if (class214.field3067) {
                        int var23 = class321.field4557 + ((class409.field5682 - var18 - 1) * 16) + 33;
                        if (var23 - 13 < var2 && var2 <= var23 + 3) {
                            var17 = var18;
                        }
                    } else {
                        int var22 = class321.field4557 + ((-var18 + -1 + class409.field5682) * 16) + 31;
                        if (var2 > (var22 - 13) && var2 <= var22 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class468 var20 = new class468(class288.field4066);
                    for (class66 var21 = (class66) var20.method2841(1); var21 != null; var21 = (class66) var20.method2840(-6334)) {
                        if ((var19++) == var17) {
                            return var21.field1183;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 203)
    public class528() {
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V", line = 205)
    public class528(int arg0) {
        this.field7502 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 217)
    public static void method3121(byte arg0) {
        field7505 = null;
        field7503 = null;
        if (arg0 != -42) {
            method3120((byte) -10);
        }
    }
}
