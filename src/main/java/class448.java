import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class448 extends class120 {

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    private int field6440;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Ldh;")
    public static class216 field6437 = new class216(9, 5);

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[I")
    public static int[] field6441 = new int[2];

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field6439;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6443;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[I")
    public static int[] field6442;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2640(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lbt;II[BI)V", line = 6)
    public class448(class33 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6440 = arg2;
        super.field1884.method285(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1881, 0, super.field1867, this.field6440, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method879(true, (byte) 81);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V", line = 20)
    public final void method2636(int arg0, boolean arg1) {
        if (arg0 != 367) {
            field6437 = null;
        }
        ++field6436;
        super.field1884.method285(false, this);
        OpenGL.glTexParameteri(super.field1881, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V", line = 34)
    public static void method2637(int arg0) {
        field6441 = null;
        field6437 = null;
        field6442 = null;
        if (arg0 != 29046) {
            field6437 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 46)
    public static final void method2638(int arg0, String arg1, String arg2) {
        ++field6435;
        class84.field1337 = arg0;
        class497.field7189 = 1;
        class134.method977(arg1, 1, arg2);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 58)
    public final void method889(boolean arg0) {
        ++field6438;
        if (!arg0) {
            method2639();
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V", line = 73)
    public static final void method2639() {
        for (int var0 = 0; var0 < class234.field3499; ++var0) {
            if (!class42.field866[var0]) {
                class130 var1 = client.field3117[var0];
                class369 var2 = var1.field2038;
                int var3 = var1.field2028;
                int var4 = var2.method2260(true) - class185.field2738;
                int var5 = (var4 * 2 >> class322.field4795) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2264((byte) -61) - var4 >> class322.field4795;
                int var9 = var2.method2261((byte) 96) - var4 >> class322.field4795;
                int var10 = var2.method2261((byte) 96) + var4 >> class322.field4795;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class337.field5000) {
                    var10 = class337.field5000 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field2026[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class394.field5608) {
                        var16 = class394.field5608 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class478 var19 = class413.method2470(var3, var17, var11, field6443 != null ? field6443 : (field6443 = method2640("sv")));
                        if (var19 != null && var19.field6957 != 0) {
                            if (var19.field6957 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2026[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2026[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field2026[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2026[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class42.field866[var0] = true;
                class146.field2262[var3].method157(var2, var7);
            }
        }
    }
}
