import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class47 extends class425 {

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Ljava/lang/String;")
    public String field619;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field621 = new CRC32();

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "[I")
    public static int[] field624 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lpm;")
    public static class349 field623 = new class349("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "Ltj;")
    public static class108 field625;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field626;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method312(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method305(int arg0) {
        class439.field6268 = arg0;
        class189.field2705 = arg0;
        class114.field1472 = arg0;
        class433.field6191 = arg0;
        field620++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lmb;III)J", line = 13)
    public static final long method306(class143 arg0, int arg1, int arg2, int arg3) {
        field616++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class282 var10 = class398.method2496(-113, arg0.method599(-10450));
        long var11 = (long) (arg1 | arg3 << 7 | arg2 | arg0.method602((byte) -110) << 14 | arg0.method603((byte) -62) << 20);
        if (var10.field4036 == 0) {
            var11 |= var8;
        }
        if (var10.field4109 == 1) {
            var11 |= var4;
        }
        if (var10.field4055) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method599(-10450) << 32;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 43)
    public static final int method307(String arg0, int arg1, int arg2) {
        field618++;
        if (arg1 != 31460) {
            field625 = null;
        }
        return class127.method768(arg0, true, (byte) 59, arg2);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 54)
    public static void method308(int arg0) {
        field621 = null;
        field624 = null;
        field623 = null;
        if (arg0 <= 114) {
            field625 = null;
        }
        field625 = null;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 68)
    public static final void method309(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field617++;
        if (class366.field5240) {
            return;
        }
        class56.field744 = true;
        class366.field5240 = true;
        if (class24.field304) {
            class358.field5176 = (float) ((int) class358.field5176 - 65 & 0xFFFFFF80);
        } else {
            class353.field5128 += (-class353.field5128 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 99)
    public static final void method310() {
        for (int var0 = 0; var0 < class153.field2273; var0++) {
            if (!class433.field6194[var0]) {
                class78 var1 = class282.field4039[var0];
                int var2 = var1.field1010;
                int var3 = var1.field5639 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field5644 - var3 >> 7;
                int var8 = var1.field5647 - var3 >> 7;
                int var9 = var1.field5647 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class407.field5751) {
                    var9 = class407.field5751 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field1001[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class394.field5548) {
                        var15 = class394.field5548 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class306 var18 = class233.method1613(var2, var16, var10, field626 == null ? (field626 = method312("sf")) : field626);
                        if (var18 != null && var18.field4467 != 0) {
                            if (var18.field4467 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field1001[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field1001[var5 - 1];
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
                                    short var29 = var1.field1001[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field1001[var5 + 1];
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
                class433.field6194[var0] = true;
                class439.field6280[var2].method353(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIZZLb;)V", line = 271)
    public static final void method311(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, class183 arg5) {
        field622++;
        if (class221.field3176 >= 50 || arg5 == null || arg5.field2593 == null || arg5.field2593.length <= arg2 || arg5.field2593[arg2] == null) {
            return;
        }
        int var6 = arg5.field2593[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (!arg3) {
            return;
        }
        if (arg5.field2593[arg2].length > 1) {
            int var9 = (int) (Math.random() * (double) arg5.field2593[arg2].length);
            if (var9 > 0) {
                var7 = arg5.field2593[arg2][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg4) {
                class24.method132(0, 255, var8, var7, -1);
            }
        } else if (class170.field2398 != 0) {
            class23.field293[class221.field3176] = var7;
            class265.field3892[class221.field3176] = var8;
            class32.field411[class221.field3176] = 0;
            class259.field3830[class221.field3176] = null;
            class168.field2384[class221.field3176] = 255;
            int var11 = (arg0 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            class430.field6122[class221.field3176] = (var12 << 8) + (var11 << 16) + var10;
            class221.field3176++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 329)
    public class47() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 331)
    public class47(String arg0, int arg1) {
        this.field619 = arg0;
    }
}
