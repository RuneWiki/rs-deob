import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class123 implements Runnable {

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[Lql;")
    public volatile class224[] field1803 = new class224[2];

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
    public volatile boolean field1805 = false;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
    public volatile boolean field1796 = false;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1795 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "F")
    public static float field1799 = 128.0F;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
    public static int[] field1801 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lbh;")
    public class7 field1802;

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public final void run() {
        this.field1796 = true;
        field1792++;
        try {
            while (!this.field1805) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class224 var2 = this.field1803[var1];
                    if (var2 != null) {
                        var2.method1599(-36);
                    }
                }
                class43.method324(10L, -96);
                class162.method1207((byte) 63, (Object) null, this.field1802);
            }
        } catch (Exception var9) {
            class191.method1422(var9, (String) null, (byte) 48);
        } finally {
            Object var6 = null;
            this.field1796 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZIII)V")
    public static final void method892(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= -13) {
            method893((class7) null, 112);
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        field1794++;
        class178.field2880 = (short) arg1;
        class44.field636 = (short) arg4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lbh;I)V")
    public static final void method893(class7 arg0, int arg1) {
        class213.field3408 = 3;
        if (arg1 != 12497) {
            method896((byte) -40);
        }
        field1804++;
        class155.method1149(-1, true);
        class144.field2328 = true;
        class207.field3334 = true;
        class265.field4301 = 0;
        class184.field2953 = 2;
        class112.field1619 = 0;
        class269.field4338 = true;
        class5.field40 = true;
        class42.field595 = true;
        class171.field2757 = 127;
        class139.field2246 = true;
        class212.field3402 = 127;
        class198.field3196 = 0;
        class188.field3039 = true;
        class198.field3201 = 0;
        class23.field264 = true;
        class13 var2 = null;
        class241.field3845 = 255;
        class206.field3314 = true;
        class25.field287 = true;
        class84.field1224 = true;
        if (class73.field1056 >= 96) {
            class157.method1162(2);
        } else {
            class157.method1162(0);
        }
        class264.field4286 = false;
        class102.field1502 = true;
        class96.field1421 = false;
        class256.field4221 = 0;
        class2.field8 = 0;
        class113.field1640 = false;
        class215.field3418 = 0;
        try {
            class278 var3 = arg0.method41("runescape", 0);
            while (var3.field4450 == 0) {
                class43.method324(1L, 124);
            }
            if (var3.field4450 == 1) {
                var2 = (class13) var3.field4449;
                byte[] var4 = new byte[(int) var2.method102(arg1 ^ 0xA0F)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method99(var4, 1, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class148.method1050((byte) -83, new class152(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method100(arg1 ^ 0x30AC);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lv;Lbh;IB)V")
    public static final void method894(class152 arg0, class7 arg1, int arg2, byte arg3) {
        field1798++;
        class44 var4 = new class44();
        var4.field644 = arg0.method1111(255);
        var4.field641 = arg0.method1097(126);
        int var5 = 35 / ((-arg3 - 39) / 39);
        var4.field630 = new int[var4.field644];
        var4.field635 = new int[var4.field644];
        var4.field639 = new int[var4.field644];
        var4.field637 = new byte[var4.field644][][];
        var4.field640 = new class278[var4.field644];
        var4.field633 = new class278[var4.field644];
        for (int var6 = 0; var6 < var4.field644; var6++) {
            try {
                int var7 = arg0.method1111(255);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var18 = arg0.method1078(-1);
                    String var19 = arg0.method1078(-1);
                    int var20 = 0;
                    if (var7 == 1) {
                        var20 = arg0.method1097(127);
                    }
                    var4.field635[var6] = var7;
                    var4.field639[var6] = var20;
                    var4.field633[var6] = arg1.method45(class94.method737((byte) -126, var18), 0, var19);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = arg0.method1078(-1);
                    String var9 = arg0.method1078(-1);
                    int var10 = arg0.method1111(255);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method1078(-1);
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method1097(126);
                            var13[var14] = new byte[var15];
                            arg0.method1093(var13[var14], (byte) 49, var15, 0);
                        }
                    }
                    var4.field635[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class94.method737((byte) -122, var11[var17]);
                    }
                    var4.field640[var6] = arg1.method39(class94.method737((byte) -125, var8), var9, -8959, var16);
                    var4.field637[var6] = var13;
                }
            } catch (ClassNotFoundException var21) {
                var4.field630[var6] = -1;
            } catch (SecurityException var22) {
                var4.field630[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field630[var6] = -3;
            } catch (Exception var24) {
                var4.field630[var6] = -4;
            } catch (Throwable var25) {
                var4.field630[var6] = -5;
            }
        }
        class42.field590.method1385(var4, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method895(int arg0) {
        if (arg0 != -21855) {
            method892(-78, -88, true, -62, -33, -25);
        }
        field1801 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lij;")
    public static final class201 method896(byte arg0) {
        field1793++;
        if (arg0 != -55) {
            return null;
        }
        class201 var1 = (class201) class171.field2758.method1580(arg0 + 87);
        if (var1 != null) {
            var1.method1922(arg0 + 54);
            var1.method986(0);
            return var1;
        }
        class201 var2;
        do {
            var2 = (class201) class101.field1488.method1580(32);
            if (var2 == null) {
                return null;
            }
            if (var2.method1478(false) > class197.method1454((byte) -104)) {
                return null;
            }
            var2.method1922(-1);
            var2.method986(0);
        } while ((Long.MIN_VALUE & var2.field2242) == 0L);
        return var2;
    }
}
