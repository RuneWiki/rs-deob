import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class187 {

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    public int[] field3299;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[S")
    public short[] field3294;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[B")
    public byte[] field3313;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[S")
    public short[] field3297;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lqk;")
    public class207[] field3312;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lqk;")
    public static class207 field3302 = class24.method212(255, "tbrefresh");

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3295 = 1;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lqk;")
    public static class207 field3307 = class24.method212(255, "Module texte charg-B");

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lqk;")
    public static class207 field3308 = class24.method212(255, "S-Blectionner");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[I")
    public static int[] field3311 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lml;")
    public static class287[] field3310 = new class287[14];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Z")
    public final boolean method1301(boolean arg0, int arg1) {
        field3298++;
        if (arg0) {
            this.method1303(80, (byte) 23);
        }
        return (this.field3313[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1302(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3296++;
        class215.method1544(arg2 - arg1, arg1 + arg2, class15.field238[arg4], arg5, 105);
        int var6 = arg1 * arg1;
        int var7 = arg3 * arg3;
        int var8 = var7 << 1;
        int var9 = 0;
        int var10 = arg3;
        int var11 = var6 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var6 + var8;
        int var14 = var6 << 2;
        int var15 = ((arg3 << 1) - 3) * var11;
        int var16 = ((var9 << 1) + 3) * var8;
        int var17 = var7 - ((var12 - 1) * var11);
        int var18 = var7 << 2;
        if (arg0) {
            method1309((class99) null, -53, (class99) null);
        }
        int var19 = (arg3 - 1) * var14;
        int var20 = (var9 + 1) * var18;
        while (var10 > 0) {
            var10--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var9++;
                    var13 += var16;
                    var16 += var18;
                    var17 += var20;
                    var20 += var18;
                }
            }
            if (var17 < 0) {
                var9++;
                var13 += var16;
                var17 += var20;
                var16 += var18;
                var20 += var18;
            }
            int var21 = arg2 + var9;
            int var22 = arg4 - var10;
            int var23 = arg2 - var9;
            int var24 = arg4 + var10;
            class215.method1544(var23, var21, class15.field238[var22], arg5, 79);
            var13 += -var19;
            class215.method1544(var23, var21, class15.field238[var24], arg5, 88);
            var19 -= var14;
            var17 += -var15;
            var15 -= var14;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z")
    public final boolean method1303(int arg0, byte arg1) {
        if (arg1 != -58) {
            this.field3294 = null;
        }
        field3304++;
        return (this.field3313[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method1304(int arg0) {
        class261.field4650 = arg0;
        for (int var1 = 0; var1 < class225.field4104; var1++) {
            for (int var2 = 0; var2 < class279.field4908; var2++) {
                if (class82.field1498[arg0][var1][var2] == null) {
                    class82.field1498[arg0][var1][var2] = new class174(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        field3310 = null;
        field3307 = null;
        field3311 = null;
        field3308 = null;
        field3302 = null;
        if (arg0 <= 74) {
            method1304(125);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
    public final int method1306(int arg0, int arg1) {
        if (arg1 != 3) {
            method1305((byte) 115);
        }
        field3305++;
        return this.field3313[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static final void method1307(byte arg0) {
        field3309++;
        int var1 = class228.field4190.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class228.field4190[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class261.field4647; var4++) {
                    if (class263.field4678[var4] == class207.field3685[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class263.field4678[class261.field4647] = class207.field3685[var2];
                    var3 = class261.field4647++;
                }
                class149 var5 = new class149(class228.field4190[var2]);
                int var6 = 0;
                while (class228.field4190[var2].length > var5.field2593 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1050(1272006568);
                    int var9 = var8 >> 7 & 0x3F;
                    int var10 = (class207.field3685[var2] >> 8) * 64 + var9 - class21.field349;
                    int var11 = var8 >> 14;
                    int var12 = var8 & 0x3F;
                    int var13 = (class207.field3685[var2] & 0xFF) * 64 + var12 - class180.field3231;
                    class72 var14 = class212.method1513(var5.method1050(1272006568), (byte) 10);
                    if (class79.field1449[var7] == null && (var14.field1329 & 0x1) > 0 && class141.field2446 == var11 && var10 >= 0 && var10 + var14.field1303 < 104 && var13 >= 0 && var13 + var14.field1303 < 104) {
                        class79.field1449[var7] = new class256();
                        class256 var15 = class79.field1449[var7];
                        class117.field2036[class138.field2390++] = var7;
                        var15.field5034 = class160.field2844;
                        var15.method1780((byte) 57, var14);
                        var15.method1948(120, var15.field4581.field1303);
                        var15.field5098 = var15.field5062 = class180.field3229[var15.field4581.field1280];
                        var15.field5107 = var15.field4581.field1324;
                        var15.field5097 = var15.field4581.field1326;
                        if (var15.field5097 == 0) {
                            var15.field5062 = 0;
                        }
                        var15.method1951(true, var15.method83(true), var13, var10, 118);
                    }
                }
            }
        }
        if (arg0 >= -24) {
            field3308 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)Z")
    public final boolean method1308(int arg0, byte arg1) {
        field3303++;
        if (arg1 == -67) {
            return (this.field3313[arg0] & 0x10) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method1309(class99 arg0, int arg1, class99 arg2) {
        class21.field342 = arg0;
        class102.field1836 = arg2;
        field3300++;
        if (arg1 >= -87) {
            method1309((class99) null, -66, (class99) null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V")
    public class187(int arg0) {
        this.field3301 = arg0;
        this.field3299 = new int[this.field3301];
        this.field3294 = new short[this.field3301];
        this.field3313 = new byte[this.field3301];
        this.field3297 = new short[this.field3301];
        this.field3312 = new class207[this.field3301];
    }
}
