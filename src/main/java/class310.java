import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class310 extends class324 {

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field4422;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "Lvn;")
    public static class169 field4420 = new class169();

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
    public static int[] field4427 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "[I")
    public static int[] field4421;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 5)
    public static final String[] method1941(String[] arg0, byte arg1) {
        if (arg1 != 109) {
            return null;
        }
        field4423++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V", line = 32)
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class306 var7 = new class306();
        var7.field4375 = arg1 >> 7;
        var7.field4373 = arg2 >> 7;
        var7.field4366 = arg3 >> 7;
        var7.field4370 = arg4 >> 7;
        var7.field4367 = arg0;
        var7.field4374 = arg1;
        var7.field4383 = arg2;
        var7.field4368 = arg3;
        var7.field4371 = arg4;
        var7.field4369 = arg5;
        var7.field4380 = arg6;
        class45.field547[class135.field1899++] = var7;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V", line = 47)
    public static final void method1943(int arg0, int arg1, byte arg2) {
        field4419++;
        int var3 = 74 % ((12 - arg2) / 63);
        class249 var4 = class114.field1321[arg1][arg0];
        if (var4 != null) {
            class442.field6464 = var4.field3390;
            class85.field965 = var4.field3388;
            class434.field6370 = var4.field3373;
        }
        class437.method2718((byte) -128);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILjava/lang/Class;)Lsa;", line = 68)
    public static final class113 method1944(int arg0, int arg1, int arg2, Class arg3) {
        class302 var4 = class19.field202[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class299 var5 = var4.field4308; var5 != null; var5 = var5.field4263) {
            class113 var6 = var5.field4261;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1316 == arg1 && var6.field1305 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z", line = 92)
    public final boolean method1945(int arg0) {
        field4426++;
        if (arg0 > -111) {
            field4420 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 105)
    public final Object method1946(int arg0) {
        if (arg0 <= 107) {
            field4420 = null;
        }
        field4424++;
        return this.field4422;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsa;Z)Z", line = 118)
    public static final boolean method1947(class113 arg0, boolean arg1) {
        boolean var2 = class132.field1814 == class111.field1285;
        int var3 = 0;
        arg0.method621((byte) 111);
        if (arg0.field1316 < 0 || arg0.field1305 < 0 || arg0.field1298 >= class158.field2245 || arg0.field1299 >= class52.field598) {
            return false;
        }
        for (int var4 = arg0.field1316; var4 <= arg0.field1298; var4++) {
            for (int var7 = arg0.field1305; var7 <= arg0.field1299; var7++) {
                int var8 = 0;
                if (var4 > arg0.field1316) {
                    var8++;
                }
                if (var4 < arg0.field1298) {
                    var8 += 4;
                }
                if (var7 > arg0.field1305) {
                    var8 += 8;
                }
                if (var7 < arg0.field1299) {
                    var8 += 2;
                }
                class252.method1578(arg0.field1308, var4, var7);
                class302 var9 = class19.field202[arg0.field1308][var4][var7];
                class299 var10 = class334.method2149(var8, 0, arg0);
                class299 var11 = var9.field4308;
                if (var11 == null) {
                    var9.field4308 = var10;
                } else {
                    while (var11.field4263 != null) {
                        var11 = var11.field4263;
                    }
                    var11.field4263 = var10;
                }
                var9.field4319 = (byte) (var9.field4319 | var8);
                if (var2 && class41.field481[var4][var7] != 0) {
                    var3 = class41.field481[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field1316; var5 <= arg0.field1298; var5++) {
                for (int var6 = arg0.field1305; var6 <= arg0.field1299; var6++) {
                    if (class41.field481[var5][var6] == 0) {
                        class41.field481[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class300.field4276[class116.field1368++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lgl;Ljava/lang/Object;)V", line = 214)
    public class310(class357 arg0, Object arg1) {
        super(arg0);
        this.field4422 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V", line = 223)
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class262.field3646; var5++) {
            Rectangle var6 = class281.field3941[var5];
            if ((var6.x + var6.width) > arg1 && (arg1 + arg2) > var6.x && arg0 < (var6.y + var6.height) && arg0 + arg3 > var6.y) {
                class270.field3817[var5] = true;
            }
        }
        field4425++;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 244)
    public static void method1949(int arg0) {
        if (arg0 != 8191) {
            field4421 = null;
        }
        field4421 = null;
        field4427 = null;
        field4420 = null;
    }
}
