import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 extends class619 {

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "F")
    public static float field763 = 0.0F;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field768;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gp", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field769;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "[B")
    private byte[] field764;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class53() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(BII)Z")
    public static final boolean method389(byte arg0, int arg1, int arg2) {
        if (arg0 > -96) {
            method389((byte) 127, -4, 88);
        }
        field767++;
        return class192.method1401(arg2, 0, arg1) & class456.method2630(arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZ)[B")
    public final byte[] method390(int arg0, int arg1, int arg2, boolean arg3) {
        field765++;
        this.field764 = new byte[arg0 * arg2 * arg1 * 2];
        this.method4164(255, arg2, arg1, arg0);
        return arg3 ? this.field764 : null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    public static final void method391() {
        for (int var0 = 0; var0 < class155.field2534; var0++) {
            if (!class444.field6025[var0]) {
                class199 var1 = class98.field1601[var0];
                class307 var2 = var1.field3001;
                int var3 = var1.field3015;
                int var4 = var2.method1963((byte) 113) - class370.field5022;
                int var5 = (var4 * 2 >> class654.field9055) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1962(0) - var4 >> class654.field9055;
                int var9 = var2.method1958(true) - var4 >> class654.field9055;
                int var10 = var2.method1958(true) + var4 >> class654.field9055;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class375.field5083) {
                    var10 = class375.field5083 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field3014[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class441.field5980) {
                        var16 = class441.field5980 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class597 var19 = class614.method3480(var3, var17, var11, field769 == null ? (field769 = method393("fe")) : field769);
                        if (var19 != null && var19.field8373 != 0) {
                            if (var19.field8373 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3014[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3014[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field3014[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3014[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class444.field6025[var0] = true;
                class745.field10286[var3].method1900(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)V")
    public final void method392(byte arg0, int arg1, int arg2) {
        field768++;
        int var4 = arg2 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field764[var10001] = (byte) (var5 * 3 >> 5);
        this.field764[var6] = (byte) (var5 * 3 >> 5);
        if (arg1 != 8232) {
            this.method392((byte) 24, 55, 45);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method393(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
