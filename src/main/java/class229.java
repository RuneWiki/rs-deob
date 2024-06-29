import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class229 {

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "J")
    public long field3779 = 0L;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3777 = 0;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
    public static boolean field3785 = true;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Laf;")
    public static class68 field3773 = new class68(100);

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lik;")
    public class260 field3775;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lik;")
    public class260 field3784;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lhe;")
    public static final class19 method1607(int arg0, int arg1) {
        if (arg1 != 6771) {
            return null;
        }
        field3782++;
        class19 var2 = (class19) class120.field1957.method1832((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3383.method1357(0, arg0, -1);
        if (var3 == null) {
            return null;
        }
        class19 var4 = new class19();
        class221 var5 = new class221(var3);
        var5.field3655 = var5.field3653.length - 2;
        int var6 = var5.method1521((byte) 113);
        int var7 = var5.field3653.length - var6 - 14;
        var5.field3655 = var7;
        int var8 = var5.method1526(-16777216);
        var4.field330 = var5.method1521((byte) 113);
        var4.field317 = var5.method1521((byte) 113);
        var4.field324 = var5.method1521((byte) 113);
        var4.field319 = var5.method1521((byte) 113);
        int var9 = var5.method1517((byte) -96);
        if (var9 > 0) {
            var4.field320 = new class204[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1521((byte) 113);
                class204 var12 = new class204(class120.method871(var11, -621722364));
                var4.field320[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1526(-16777216);
                    int var14 = var5.method1526(arg1 - 16783987);
                    var12.method1399(7292, new class10(var14), (long) var13);
                }
            }
        }
        int var15 = 0;
        var5.field3655 = 0;
        var4.field326 = var5.method1532((byte) -112);
        var4.field318 = new int[var8];
        var4.field323 = new String[var8];
        var4.field333 = new int[var8];
        while (var5.field3655 < var7) {
            int var16 = var5.method1521((byte) 113);
            if (var16 == 3) {
                var4.field323[var15] = var5.method1539(53).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field333[var15] = var5.method1517((byte) -96);
            } else {
                var4.field333[var15] = var5.method1526(-16777216);
            }
            var4.field318[var15++] = var16;
        }
        class120.field1957.method1831((long) arg0, var4, 128);
        return var4;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1608(int arg0) {
        if (arg0 >= 86) {
            field3773 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static final void method1609(boolean arg0) {
        for (int var1 = -1; var1 < class155.field2514; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class57.field973[var1];
            }
            class33 var3 = class35.field548[var2];
            if (var3 != null) {
                class105.method760(var3, var3.method278(0), arg0);
            }
        }
        if (arg0) {
            field3773 = null;
        }
        field3776++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIIIIIII)Z")
    public static final boolean method1610(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3780++;
        long var8 = class132.method928(arg6, arg3 + arg7, arg4 - -arg1);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7FC16) >> 14;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class135 var12 = class209.method1447(var11, -6653);
            int var13 = ((int) var8 & 0x372EF5) >> 20;
            if (var12.field2185 == -1) {
                int[] var14 = class2.field34;
                int var15 = arg7 * 4 + ((52736 - arg4 * 512) * 4) + 24624;
                int var16 = arg5;
                if (var8 > 0L) {
                    var16 = arg2;
                }
                if (var10 == 0 || var10 == 2) {
                    if (var13 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var13 == 1) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var13 == 2) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 3 + 512] = var16;
                        var14[var15 + 1024 + 3] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    } else if (var13 == 3) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1536 + 1] = var16;
                        var14[var15 + 1536 + 2] = var16;
                        var14[var15 + 3 + 1536] = var16;
                    }
                }
                if (var10 == 3) {
                    if (var13 == 0) {
                        var14[var15] = var16;
                    } else if (var13 == 1) {
                        var14[var15 + 3] = var16;
                    } else if (var13 == 2) {
                        var14[var15 + 1536 + 3] = var16;
                    } else if (var13 == 3) {
                        var14[var15 + 1536] = var16;
                    }
                }
                if (var10 == 2) {
                    if (var13 == 3) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var13 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var13 == 1) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 512 + 3] = var16;
                        var14[var15 + 3 + 1024] = var16;
                        var14[var15 + 1539] = var16;
                    } else if (var13 == 2) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1 + 1536] = var16;
                        var14[var15 + 1536 + 2] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    }
                }
            } else if (!class12.method93(arg4, var13, arg1, arg3, arg7, (byte) 11, var12)) {
                return false;
            }
        }
        if (arg0 != 123) {
            method1610((byte) -122, 63, 51, 33, -121, -64, -84, 18);
        }
        long var17 = class92.method693(arg6, arg7 + arg3, arg4 - -arg1);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3D6FBE) >> 20;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class135 var21 = class209.method1447(var20, -6653);
            int var22 = (int) var17 >> 14 & 0x1F;
            if (var21.field2185 == -1) {
                if (var22 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = arg7 * 4 + ((-(arg4 * 512) + 52736) * 4) + 24624;
                    int[] var25 = class2.field34;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1024 + 1] = var23;
                        var25[var24 + 512 + 2] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 2 + 1024] = var23;
                        var25[var24 + 1539] = var23;
                    }
                }
            } else if (!class12.method93(arg4, var19, arg1, arg3, arg7, (byte) 11, var21)) {
                return false;
            }
        }
        long var26 = class124.method896(arg6, arg3 + arg7, arg1 + arg4);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3A49E2) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class135 var30 = class209.method1447(var29, -6653);
            if (var30.field2185 != -1 && !class12.method93(arg4, var28, arg1, arg3, arg7, (byte) 11, var30)) {
                return false;
            }
        }
        return true;
    }
}
