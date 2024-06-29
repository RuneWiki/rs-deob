import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class47 extends class232 {

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    private int field780 = 585;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "Lhi;")
    public static class82 field785 = class95.method664((byte) -73, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field786 = -1;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "Lmb;")
    public static class109 field781;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IB)[I", line = 8)
    public final int[] method80(int arg0, byte arg1) {
        field790++;
        int[] var3 = this.field4008.method131((byte) -117, arg0);
        if (this.field4008.field256) {
            int var4 = class273.field4607[arg0];
            for (int var5 = 0; var5 < class54.field858; var5++) {
                int var6 = class24.field329[var5];
                if (this.field780 < var6 && var6 < 4096 - this.field780 && (2048 - this.field780) < var4 && var4 < this.field780 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field780);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field780 < var6 && (this.field780 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field780;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field780);
                } else if (var4 < this.field780 || var4 > 4096 - this.field780) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field780;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field780);
                } else if (this.field780 <= var6 && var6 <= 4096 - this.field780) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field780);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        int var23 = 87 % ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(IB)I", line = 89)
    public static final int method339(int arg0, byte arg1) {
        if (class66.field1036 != null) {
            class66.field1036.method2085(true);
            class66.field1036 = null;
        }
        field793++;
        class161.field2812++;
        if (arg1 != -125) {
            field786 = -38;
        }
        if (class161.field2812 > 4) {
            class209.field3674 = 0;
            class161.field2812 = 0;
            return arg0;
        }
        class209.field3674 = 0;
        if (field791 == class34.field516) {
            class34.field516 = class164.field2879;
        } else {
            class34.field516 = field791;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V", line = 125)
    public static final void method340(byte arg0) {
        int var1 = class35.field545.method1499((byte) 119, 8);
        field792++;
        if (arg0 < 101) {
            return;
        }
        if (class297.field5054 > var1) {
            for (int var2 = var1; var2 < class297.field5054; var2++) {
                class149.field2545[class20.field270++] = class310.field5292[var2];
            }
        }
        if (class297.field5054 < var1) {
            throw new RuntimeException("gppov1");
        }
        class297.field5054 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class310.field5292[var3];
            class81 var5 = class29.field405[var4];
            int var6 = class35.field545.method1499((byte) -23, 1);
            if (var6 == 0) {
                class310.field5292[class297.field5054++] = var4;
                var5.field1680 = class212.field3708;
            } else {
                int var7 = class35.field545.method1499((byte) 113, 2);
                if (var7 == 0) {
                    class310.field5292[class297.field5054++] = var4;
                    var5.field1680 = class212.field3708;
                    class44.field760[class106.field1877++] = var4;
                } else if (var7 == 1) {
                    class310.field5292[class297.field5054++] = var4;
                    var5.field1680 = class212.field3708;
                    int var8 = class35.field545.method1499((byte) 11, 3);
                    var5.method655(var8, false, (byte) -57);
                    int var9 = class35.field545.method1499((byte) 126, 1);
                    if (var9 == 1) {
                        class44.field760[class106.field1877++] = var4;
                    }
                } else if (var7 == 2) {
                    class310.field5292[class297.field5054++] = var4;
                    var5.field1680 = class212.field3708;
                    int var10 = class35.field545.method1499((byte) 125, 3);
                    var5.method655(var10, true, (byte) -62);
                    int var11 = class35.field545.method1499((byte) -22, 3);
                    var5.method655(var11, true, (byte) -37);
                    int var12 = class35.field545.method1499((byte) -124, 1);
                    if (var12 == 1) {
                        class44.field760[class106.field1877++] = var4;
                    }
                } else if (var7 == 3) {
                    class149.field2545[class20.field270++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJSILhi;ILhi;)V", line = 226)
    public static final void method341(int arg0, long arg1, short arg2, int arg3, class82 arg4, int arg5, class82 arg6) {
        field788++;
        if (class187.field3153 || arg0 != 2300 || class309.field5262 >= 500) {
            return;
        }
        class327.field5589[class309.field5262] = arg6;
        class157.field2727[class309.field5262] = arg4;
        class135.field2333[class309.field5262] = arg2;
        class40.field694[class309.field5262] = arg1;
        class262.field4486[class309.field5262] = arg5;
        class28.field375[class309.field5262] = arg3;
        class309.field5262++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBLbc;)V", line = 254)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field784++;
        if (arg0 == 0) {
            this.field780 = arg2.method1090(false);
        }
        if (arg1 != -19) {
            method339(6, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 289)
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V", line = 302)
    public static void method342(byte arg0) {
        field781 = null;
        field785 = null;
        int var1 = 43 % ((arg0 - 6) / 53);
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 315)
    public static final void method343(byte arg0) {
        field787++;
        if (arg0 != -48) {
            field791 = 56;
        }
        for (int var1 = 0; var1 < class69.field1070; var1++) {
            class119 var2 = class281.method1958(false, var1);
            if (var2 != null && var2.field2095 == 0) {
                class330.field5623[var1] = 0;
                class312.field5398[var1] = 0;
            }
        }
        class111.field1995 = new class79(16);
    }
}
