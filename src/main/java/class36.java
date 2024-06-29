import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
    public boolean field679 = true;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Leb;")
    public static class230 field674 = class68.method589(0, "<)4col>");

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Leb;")
    public static class230 field675 = class68.method589(0, "Wordpack geladen)3");

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field681 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
    public static int[] field677;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILeb;)V")
    public static final void method328(int arg0, class230 arg1) {
        field678++;
        if (class182.field3175 == null) {
            return;
        }
        long var2 = arg1.method1587(78);
        int var4 = 0;
        if (arg0 != -28824) {
            field675 = null;
        }
        if (var2 == 0L) {
            return;
        }
        while (class182.field3175.length > var4 && class182.field3175[var4].field1166 != var2) {
            var4++;
        }
        if (class182.field3175.length > var4 && class182.field3175[var4] != null) {
            class153.field2747.method978(-125, 135);
            class153.field2747.method148(class182.field3175[var4].field1166, (byte) 127);
            class111.field1986++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZIII)V")
    public static final void method329(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class150.field2676++;
        field676++;
        if (!arg2) {
            class170.method1252(104, true);
            class58.method492(true, false);
            class170.method1252(arg4 + 232, false);
        }
        class58.method492(false, false);
        if (!arg2) {
            class103.method870((byte) 95);
        }
        class230.method1621(true);
        if (class229.field3948 == 1) {
            int var6 = class67.field1267 + class34.field641 & 0x7FF;
            int var7 = class71.field1298;
            if (var7 < (class146.field2638 / 256)) {
                var7 = class146.field2638 / 256;
            }
            if (class223.field3828[4] && var7 < class7.field89[4] + 128) {
                var7 = class7.field89[4] + 128;
            }
            class103.method871(class80.field1457, 1054212176, var7 * 3 + 600, var6, var7, class88.field1530, class37.method333(class56.field1033.field2300, arg4 ^ 0x9E67BFC7, class124.field2174, class56.field1033.field2274) - 50, arg3);
        }
        int var8 = class176.field3099;
        int var9 = class263.field4681;
        int var10 = class77.field1403;
        int var11 = class111.field2004;
        int var12 = class248.field4397;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class223.field3828[var13]) {
                int var19 = (int) ((double) (-class244.field4198[var13]) + Math.random() * (double) (class244.field4198[var13] * 2 + 1) + Math.sin((double) class125.field2199[var13] / 100.0D * (double) class57.field1048[var13]) * (double) class7.field89[var13]);
                if (var13 == 4) {
                    class111.field2004 += var19;
                    if (class111.field2004 < 128) {
                        class111.field2004 = 128;
                    }
                    if (class111.field2004 > 383) {
                        class111.field2004 = 383;
                    }
                }
                if (var13 == 1) {
                    class263.field4681 += var19;
                }
                if (var13 == 0) {
                    class176.field3099 += var19;
                }
                if (var13 == 3) {
                    class248.field4397 = class248.field4397 + var19 & 0x7FF;
                }
                if (var13 == 2) {
                    class77.field1403 += var19;
                }
            }
        }
        class185.method1326(arg4);
        class87.method698(arg1, arg5, arg0 + arg1, arg3 + arg5);
        class3.method33();
        if (class243.field4188 || class246.field4375 < arg1 || arg0 + arg1 <= class246.field4375 || arg5 > class61.field1178 || class61.field1178 >= (arg3 + arg5)) {
            class189.field3319 = false;
            class102.field1870 = 0;
        } else {
            class189.field3319 = true;
            int var14 = class1.field8;
            int var15 = class149.field2668;
            class233.field4044 = (class246.field4375 - arg1) * (var15 - var14) / arg0 + var14;
            int var16 = class108.field1947;
            class102.field1870 = 0;
            int var17 = class150.field2674;
            class168.field2970 = (class61.field1178 - arg5) * (var17 - var16) / arg3 + var16;
        }
        class154.method1175(95);
        byte var18 = class156.method1190(arg4 - 25018) == 2 ? (byte) class150.field2676 : 1;
        class87.method705(arg1, arg5, arg0, arg3, 0);
        class264.method1831(class176.field3099, class263.field4681, class77.field1403, class111.field2004, class248.field4397, class12.field176, class190.field3356, class9.field162, class68.field1279, class232.field4037, class177.field3112, class124.field2174 + 1, var18, class56.field1033.field2274 >> 7, class56.field1033.field2300 >> 7);
        class154.method1175(95);
        class68.method587();
        class150.method1136(arg5, arg1, 256, 256, arg3, 255, arg0);
        class227.method1567(arg0, arg1, 256, (byte) -120, 256, arg3, arg5);
        if (arg4 != -128) {
            field675 = null;
        }
        ((class89) class3.field15).method732(class219.field3771, (byte) 109);
        class100.method849(arg5, arg3, arg1, arg0, 23237);
        class77.field1403 = var10;
        class176.field3099 = var8;
        class111.field2004 = var11;
        class263.field4681 = var9;
        class248.field4397 = var12;
        if (class78.field1411 && class56.field1040.method1372(false) == 0) {
            class78.field1411 = false;
        }
        if (class78.field1411) {
            class87.method705(arg1, arg5, arg0, arg3, 0);
            class18.method221(false, (byte) 26, class6.field86);
        }
        if (!arg2 && !class78.field1411 && !class243.field4188 && arg1 <= class246.field4375 && class246.field4375 < (arg0 + arg1) && arg5 <= class61.field1178 && class61.field1178 < arg3 + arg5) {
            class246.method1718(arg5, arg0, (byte) -113, arg1, class61.field1178, class246.field4375, arg3);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field679 = arg6;
        this.field669 = arg1;
        this.field680 = arg4;
        this.field670 = arg5;
        this.field673 = arg0;
        this.field671 = arg3;
        this.field672 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method330(byte arg0) {
        if (arg0 >= -117) {
            field681 = -14;
        }
        field674 = null;
        field675 = null;
        field677 = null;
    }
}
