import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class73 {

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    private int field1189 = -1;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    private int field1196 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Llc;")
    private class160 field1182 = new class160();

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "Z")
    public boolean field1202 = false;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[Lli;")
    private class213[] field1191;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "[[[I")
    private int[][][] field1194;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Lok;")
    public static class146 field1188 = class235.method1724(-12908, "::clientdrop");

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "[Lok;")
    public static class146[] field1184 = new class146[100];

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Loh;")
    public static class15 field1186;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Loh;")
    public static class15 field1199;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "[I")
    public static int[] field1198;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZILva;)V", line = 6)
    public static final void method535(boolean arg0, int arg1, class142 arg2) {
        field1195++;
        int var3 = arg2.field2370;
        int var4 = (int) arg2.field2883;
        arg2.method1325(-2935);
        if (arg0) {
            class195.method1506(var3, -73);
        }
        class14.method82(var3, 65535);
        class264 var5 = class98.method680(var4, false);
        if (var5 != null) {
            class164.method1280(false, var5);
        }
        int var6 = class45.field763;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class198.method1523((byte) 1, class224.field3739[var7])) {
                class211.method1582(-8264, var7);
            }
        }
        if (arg1 != -7700) {
            field1184 = (class146[]) null;
        }
        if (class45.field763 == 1) {
            class295.field4998 = false;
            class112.method759(class171.field2889, class116.field1864, arg1 + 7708, class283.field4851, class113.field1821);
        } else {
            class112.method759(class171.field2889, class116.field1864, arg1 ^ 0xFFFFE1E4, class283.field4851, class113.field1821);
            int var8 = class39.field695.method207(class261.field4334);
            for (int var9 = 0; var9 < class45.field763; var9++) {
                int var10 = class39.field695.method207(class45.method311(var9, (byte) 110));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class171.field2889 = (class177.field3003 ? 26 : 22) + class45.field763 * 15;
            class283.field4851 = var8 + 8;
        }
        if (class236.field3943 != -1) {
            class35.method254((byte) -99, class236.field3943, 1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I", line = 76)
    public final int[][] method536(int arg0, int arg1) {
        if (arg1 != 4096) {
            field1199 = (class15) null;
        }
        field1201++;
        if (this.field1200 == this.field1185) {
            this.field1202 = this.field1191[arg0] == null;
            this.field1191[arg0] = class157.field2644;
            return this.field1194[arg0];
        } else if (this.field1200 == 1) {
            this.field1202 = this.field1189 != arg0;
            this.field1189 = arg0;
            return this.field1194[0];
        } else {
            class213 var3 = this.field1191[arg0];
            if (var3 == null) {
                this.field1202 = true;
                if (this.field1196 < this.field1200) {
                    var3 = new class213(arg0, this.field1196);
                    this.field1196++;
                } else {
                    class213 var4 = (class213) this.field1182.method1256(arg1 + 20695);
                    var3 = new class213(arg0, var4.field3522);
                    this.field1191[var4.field3518] = null;
                    var4.method1325(arg1 ^ 0xFFFFE489);
                }
                this.field1191[arg0] = var3;
            } else {
                this.field1202 = false;
            }
            this.field1182.method1252((byte) -60, var3);
            return this.field1194[var3.field3522];
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 144)
    public static void method537(byte arg0) {
        field1188 = null;
        if (arg0 != -31) {
            field1198 = (int[]) null;
        }
        field1198 = null;
        field1199 = null;
        field1184 = null;
        field1186 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)[[[I", line = 158)
    public final int[][][] method538(int arg0) {
        field1193++;
        if (this.field1200 != this.field1185) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1200; var2++) {
            this.field1191[var2] = class157.field2644;
        }
        return this.field1194;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 177)
    public final void method539(byte arg0) {
        field1190++;
        for (int var2 = 0; var2 < this.field1200; var2++) {
            this.field1194[var2][0] = null;
            this.field1194[var2][1] = null;
            this.field1194[var2][2] = null;
            this.field1194[var2] = (int[][]) null;
        }
        if (arg0 <= 86) {
            field1186 = (class15) null;
        }
        this.field1191 = null;
        this.field1194 = (int[][][]) null;
        this.field1182.method1257(2);
        this.field1182 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)Lum;", line = 206)
    public static final class140 method540(byte arg0, int arg1) {
        field1183++;
        class140 var2 = (class140) class245.field4052.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 83 % ((arg0 + 60) / 63);
        byte[] var4 = class121.field1995.method92(class35.method251((byte) -128, arg1), 0, class306.method2155(true, arg1));
        class140 var5 = new class140();
        var5.field2352 = arg1;
        if (var4 != null) {
            var5.method1031(new class47(var4), 0);
        }
        class245.field4052.method797(var5, 0, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(III)V", line = 338)
    public class73(int arg0, int arg1, int arg2) {
        this.field1185 = arg1;
        this.field1191 = new class213[this.field1185];
        this.field1200 = arg0;
        this.field1194 = new int[this.field1200][3][arg2];
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 238)
    public static final void method541(boolean arg0) {
        field1192++;
        class185 var1 = (class185) class225.field3751.method1251(55);
        if (arg0) {
            method543((byte) -94);
        }
        while (var1 != null) {
            if (var1.field3077 == -1) {
                var1.field3090 = 0;
                class52.method421(Integer.MAX_VALUE, var1);
            } else {
                var1.method1325(-2935);
            }
            var1 = (class185) class225.field3751.method1253(60);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I", line = 264)
    public static final int method542(int arg0, int arg1) {
        field1197++;
        int var2 = 120 % ((-arg1 - 44) / 61);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 282)
    public static final void method543(byte arg0) {
        if (class260.field4324 == null || class15.field309 == null) {
            class15.field309 = new int[256];
            class260.field4324 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class260.field4324[var1] = (int) (Math.sin(var2) * 4096.0D);
                class15.field309[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1187++;
        if (arg0 >= -64) {
            method535(true, 62, (class142) null);
        }
    }
}
