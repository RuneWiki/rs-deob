import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field137 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field138 = -1;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    private int field155 = 128;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    private int field149 = 0;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    private int field156 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    private int field139 = 128;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
    public boolean field157 = false;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lve;")
    public static class233 field153;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[S")
    private short[] field144;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[S")
    private short[] field146;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[S")
    private short[] field147;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[S")
    private short[] field158;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method76(int arg0) {
        field150++;
        int var1 = class179.field2556.method1278(class253.field3848);
        for (int var2 = 0; var2 < class283.field4508; var2++) {
            int var6 = class179.field2556.method1278(class274.method1849((byte) 98, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class283.field4508 * 15 + 21;
        int var4 = class222.field3311;
        if (var3 + var4 > class250.field3813) {
            var4 = class250.field3813 - var3;
        }
        int var5 = class261.field3942 - var1 / 2;
        if (var4 < arg0) {
            var4 = 0;
        }
        if ((var5 + var1) > class214.field3080) {
            var5 = class214.field3080 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class104.field1541 != 1) {
            if (class279.field4465 == class261.field3942 && class42.field602 == class222.field3311) {
                class151.field2185 = true;
                class52.field763 = var1;
                class200.field2896 = var5;
                class104.field1541 = 0;
                class178.field2544 = var4;
                class218.field3225 = class283.field4508 * 15 + (class56.field854 ? 26 : 22);
                return;
            }
            class149.field2144 = class42.field602;
            class104.field1541 = 1;
            class218.field3226 = class279.field4465;
        } else if (class261.field3942 == class218.field3226 && class222.field3311 == class149.field2144) {
            class178.field2544 = var4;
            class104.field1541 = 0;
            class52.field763 = var1;
            class200.field2896 = var5;
            class151.field2185 = true;
            class218.field3225 = (class56.field854 ? 26 : 22) + class283.field4508 * 15;
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)Lpa;")
    public final class2 method77(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = -59 / ((26 - arg2) / 39);
        field141++;
        class2 var6 = (class2) class283.field4513.method263((byte) 109, (long) this.field159);
        if (var6 == null) {
            class127 var7 = class127.method866(class54.field827, this.field142, 0);
            if (var7 == null) {
                return null;
            }
            if (this.field158 != null) {
                for (int var8 = 0; var8 < this.field158.length; var8++) {
                    var7.method869(this.field158[var8], this.field147[var8]);
                }
            }
            if (this.field146 != null) {
                for (int var9 = 0; var9 < this.field146.length; var9++) {
                    var7.method872(this.field146[var9], this.field144[var9]);
                }
            }
            var6 = var7.method863(this.field156 + 64, this.field137 + 850, -30, -50, -30);
            class283.field4513.method255((long) this.field159, var6, (byte) -126);
        }
        class2 var10;
        if (this.field138 == -1 || arg0 == -1) {
            var10 = var6.method15(true, true, true);
        } else {
            var10 = class70.method478(this.field138, false).method1252(var6, arg3, (byte) -123, arg1, arg0);
        }
        if (this.field139 != 128 || this.field155 != 128) {
            var10.method37(this.field139, this.field155, this.field139);
        }
        if (this.field149 != 0) {
            if (this.field149 == 90) {
                var10.method34();
            }
            if (this.field149 == 180) {
                var10.method32();
            }
            if (this.field149 == 270) {
                var10.method33();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILkl;)V")
    public final void method78(int arg0, class114 arg1) {
        if (arg0 != 16961) {
            return;
        }
        field154++;
        while (true) {
            int var3 = arg1.method760(false);
            if (var3 == 0) {
                return;
            }
            this.method81(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method79(int arg0) {
        if (arg0 == -30) {
            field153 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method80(int arg0, int arg1) {
        field145++;
        if (arg0 == 15) {
            class270 var2 = class190.method1213(arg0 + 25687, arg1, 4);
            var2.method1806(-8173);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILkl;)V")
    private final void method81(int arg0, int arg1, class114 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field142 = arg2.method756(-29901);
        } else if (arg0 == 2) {
            this.field138 = arg2.method756(arg1 ^ 0xFFFF8B33);
        } else if (arg0 == 4) {
            this.field139 = arg2.method756(-29901);
        } else if (arg0 == 5) {
            this.field155 = arg2.method756(arg1 ^ 0xFFFF8B33);
        } else if (arg0 == 6) {
            this.field149 = arg2.method756(-29901);
        } else if (arg0 == 7) {
            this.field156 = arg2.method760(false);
        } else if (arg0 == 8) {
            this.field137 = arg2.method760(false);
        } else if (arg0 == 9) {
            this.field157 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method760(false);
            this.field147 = new short[var6];
            this.field158 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field158[var7] = (short) arg2.method756(-29901);
                this.field147[var7] = (short) arg2.method756(-29901);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method760(false);
            this.field146 = new short[var4];
            this.field144 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field146[var5] = (short) arg2.method756(-29901);
                this.field144[var5] = (short) arg2.method756(-29901);
            }
        }
        field151++;
    }
}
