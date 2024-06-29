import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class352 extends class331 {

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Z")
    public volatile boolean field4971 = true;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "[[I")
    public static int[][] field4970 = new int[128][128];

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Liq;")
    public static class362 field4975 = new class362("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field4977;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field4978;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
    public boolean field4973;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Z")
    public boolean field4974;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
    public abstract int method770(byte arg0);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method2245(int arg0) {
        if (arg0 != 8) {
            method2246(-1, -62);
        }
        field4970 = null;
        field4975 = null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)[B")
    public abstract byte[] method772(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method2246(int arg0, int arg1) {
        if (arg0 != 1) {
            field4977 = 19;
        }
        field4972++;
        class20 var2 = class369.method2351((byte) 122, 16, arg1);
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static final void method2247() {
        for (int var0 = 0; var0 < class75.field886; var0++) {
            if (!class229.field3244[var0]) {
                class12 var1 = class266.field3800[var0];
                int var2 = var1.field167;
                int var3 = var1.field5679 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field5682 - var3 >> 7;
                int var8 = var1.field5687 - var3 >> 7;
                int var9 = var1.field5687 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class299.field4190) {
                    var9 = class299.field4190 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field163[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class415.field5953) {
                        var15 = class415.field5953 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class233 var18 = class159.method1013(var2, var16, var10, field4978 == null ? (field4978 = method2248("wl")) : field4978);
                        if (var18 != null && var18.field3270 != 0) {
                            if (var18.field3270 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field163[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field163[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field163[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field163[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class229.field3244[var0] = true;
                class161.field2122[var2].method331(var1, var6);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2248(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
