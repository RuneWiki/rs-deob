import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 implements class114 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lsc;")
    private class256 field997 = new class256(256);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Luf;")
    private class176 field992;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Luf;")
    private class176 field1005;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[Lpj;")
    private class255[] field995;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field998 = -1;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field1004 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "F")
    public static float field1003;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lre;")
    public static final class228 method495(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        return var3 == null ? null : var3.field344;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BFIIZI)[I")
    public final int[] method496(byte arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != -80) {
            this.field997 = null;
        }
        field996++;
        return this.method500(20519, arg5).method788(this.field995[arg5].field3909, arg2, (byte) 98, this.field1005, arg4, arg3, this, (double) arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z")
    public final boolean method497(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method496((byte) 17, 0.1221836F, -60, 58, false, -127);
        }
        field991++;
        class103 var3 = this.method500(arg0 ^ 0x5027, arg1);
        return var3 != null && var3.method791(0, this.field1005, this);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lpj;")
    public final class255 method498(int arg0, int arg1) {
        if (arg0 == 542) {
            field993++;
            return this.field995[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method499(boolean arg0, String arg1, String arg2, int arg3) {
        class167.field2529 = arg2;
        field1001++;
        class148.field2282 = arg1;
        class153.field2345 = arg3;
        if (class148.field2282.equals("") || class167.field2529.equals("")) {
            class35.field572 = 3;
        } else if (class155.field2358 == -1) {
            class53.field828 = 0;
            class226.field3537 = 1;
            class176.field2642 = 0;
            class35.field572 = -3;
            class37 var4 = new class37(128);
            var4.method287(440742616, 10);
            var4.method289((int) (Math.random() * 9.9999999E7D), -128);
            var4.method337(2103219728, class247.method1668(class148.field2282, arg0));
            var4.method289((int) (Math.random() * 9.9999999E7D), 13);
            var4.method321(-52, class167.field2529);
            var4.method289((int) (Math.random() * 9.9999999E7D), -29);
            var4.method340(class186.field2806, -3350, class76.field1281);
            class292.field4607.field588 = 0;
            class292.field4607.method287(440742616, 24);
            class292.field4607.method287(440742616, var4.field588 + 2);
            class292.field4607.method312(1489253544, 542);
            class292.field4607.method296(0, var4.field583, var4.field588, -20484);
        } else {
            class259.method1719(!arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(II)Lvf;")
    public class103 method500(int arg0, int arg1) {
        field1000++;
        if (arg0 != 20519) {
            return null;
        }
        class292 var3 = this.field997.method1701(false, (long) arg1);
        if (var3 != null) {
            return (class103) var3;
        }
        byte[] var4 = this.field992.method1152(-4897, arg1);
        if (var4 == null) {
            return null;
        } else {
            class103 var5 = new class103(new class37(var4));
            this.field997.method1704((long) arg1, var5, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Luf;Luf;Luf;)V")
    public class62(class176 arg0, class176 arg1, class176 arg2) {
        this.field992 = arg1;
        this.field1005 = arg2;
        class37 var4 = new class37(arg0.method1163(0, 0, 48));
        int var5 = var4.method293(89);
        this.field995 = new class255[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method333((byte) -59) == 1) {
                this.field995[var6] = new class255();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field995[var7] != null) {
                this.field995[var7].field3916 = var4.method333((byte) -59) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field995[var8] != null) {
                this.field995[var8].field3914 = var4.method333((byte) -59) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field995[var9] != null) {
                this.field995[var9].field3906 = var4.method333((byte) -59) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field995[var10] != null) {
                var4.method333((byte) -59);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field995[var11] != null) {
                var4.method322((byte) 14);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field995[var12] != null) {
                var4.method322((byte) 70);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field995[var13] != null) {
                var4.method322((byte) 85);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field995[var14] != null) {
                var4.method322((byte) 12);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field995[var15] != null) {
                this.field995[var15].field3913 = (short) var4.method293(-63);
            }
        }
        if (var4.field583.length > var4.field588) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field995[var16] != null) {
                    var4.method322((byte) 30);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field995[var17] != null) {
                    var4.method322((byte) 53);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field995[var18] != null) {
                    var4.method333((byte) -59);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field995[var19] != null) {
                    this.field995[var19].field3909 = var4.method333((byte) -59) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field995[var20] != null) {
                    var4.method322((byte) 17);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field995[var21] != null) {
                    var4.method333((byte) -59);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field995[var22] != null) {
                    var4.method333((byte) -59);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field995[var23] != null) {
                    var4.method333((byte) -59);
                }
            }
        }
    }
}
