import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class18 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lkc;")
    private static class67 field342 = class19.method144("Moderator option: Mute player for 48 hours: <OFF>", 75);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lkc;")
    public static class67 field347 = class19.method144("::clientdrop", 78);

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lkc;")
    public static class67 field350 = field342;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lgd;")
    public static class44 field346 = new class44(64);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lkc;")
    public static class67 field354 = class19.method144("(Y", 127);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lkc;")
    private static class67 field355 = class19.method144("purple:", 70);

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lkc;")
    private static class67 field359 = class19.method144("Trade)4compete", 105);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lkc;")
    public static class67 field357 = field359;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lkc;")
    public static class67 field360 = field355;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lab;")
    public static class3 field356;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lpc;")
    public static class97 field353;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field358;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[[I")
    public static int[][] field343;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V", line = 12)
    public static final void method140(byte arg0, int arg1, int arg2) {
        if (arg0 >= -104) {
            method141(true, null, null, null);
        }
        field348++;
        class74 var3 = class7.method72(arg2, 14);
        int var4 = var3.field1755;
        int var5 = var3.field1759;
        int var6 = var3.field1765;
        int var7 = class64.field1510[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class5.field109[var4] = class65.method505(class90.method693(class5.field109[var4], ~var8), class90.method693(var8, arg1 << var5));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLkc;Lkc;Lkc;)V", line = 43)
    public static final void method141(boolean arg0, class67 arg1, class67 arg2, class67 arg3) {
        if (arg0) {
            field343 = null;
        }
        field344++;
        class20.field397 = arg1;
        class20.field417 = arg3;
        class20.field418 = arg2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 64)
    public static void method142(int arg0) {
        field347 = null;
        int var1 = -117 / ((arg0 - 14) / 47);
        field360 = null;
        field358 = null;
        field359 = null;
        field356 = null;
        field354 = null;
        field353 = null;
        field346 = null;
        field343 = null;
        field350 = null;
        field357 = null;
        field342 = null;
        field355 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 95)
    public static final void method143(boolean arg0) {
        field349++;
        class42.method357(28210);
        if (class58.field1379 == 2) {
            byte[] var1 = class80.field1887.field35;
            int[] var2 = class68.field1630;
            int var3 = var1.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var1[var4] == 0) {
                    var2[var4] = 0;
                }
            }
            class54.field1307.method679(0, 0, 33, 33, 25, 25, class19.field376, 256, class34.field831, class114.field2698);
            class1.method4((byte) -55);
            return;
        }
        int var5 = class81.field1920 + class19.field376 & 0x7FF;
        int var6 = 464 - class69.field1640.field1190 / 32;
        int var7 = class69.field1640.field1260 / 32 + 48;
        class7.field158.method679(25, 5, 146, 151, var7, var6, var5, class9.field197 + 256, class134.field3217, class96.field2167);
        for (int var8 = 0; var8 < class30.field631; var8++) {
            int var38 = class111.field2539[var8] * 4 + 2 - class69.field1640.field1260 / 32;
            int var39 = class134.field3202[var8] * 4 + 2 - class69.field1640.field1190 / 32;
            class80.method633((byte) -117, var39, class58.field1373[var8], var38);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class10 var35 = class4.field67[class112.field2593][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class69.field1640.field1260 / 32;
                    int var37 = var34 * 4 + 2 - class69.field1640.field1190 / 32;
                    class80.method633((byte) 82, var37, class108.field2456[0], var36);
                }
            }
        }
        for (int var10 = 0; var10 < class130.field3042; var10++) {
            class66 var30 = class9.field189[class65.field1530[var10]];
            if (var30 != null && var30.method420((byte) -120)) {
                class73 var31 = var30.field1542;
                if (var31.field1734 != null) {
                    var31 = var31.method587(1);
                }
                if (var31 != null && var31.field1718 && var31.field1728) {
                    int var32 = var30.field1190 / 32 - class69.field1640.field1190 / 32;
                    int var33 = var30.field1260 / 32 - class69.field1640.field1260 / 32;
                    class80.method633((byte) -127, var32, class108.field2456[1], var33);
                }
            }
        }
        if (arg0) {
            method140((byte) -43, -55, 97);
        }
        for (int var11 = 0; var11 < class81.field1948; var11++) {
            class103 var22 = class44.field1067[class119.field2820[var11]];
            if (var22 != null && var22.method420((byte) -120)) {
                boolean var23 = false;
                int var24 = var22.field1190 / 32 - class69.field1640.field1190 / 32;
                int var25 = var22.field1260 / 32 - class69.field1640.field1260 / 32;
                long var26 = var22.field2329.method532(-69);
                for (int var28 = 0; var28 < class9.field188; var28++) {
                    if (class31.field650[var28] == var26 && class46.field1107[var28] != 0) {
                        var23 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class69.field1640.field2303 != 0 && var22.field2303 != 0 && class69.field1640.field2303 == var22.field2303) {
                    var29 = true;
                }
                if (var23) {
                    class80.method633((byte) 87, var24, class108.field2456[3], var25);
                } else if (var29) {
                    class80.method633((byte) -124, var24, class108.field2456[4], var25);
                } else {
                    class80.method633((byte) -120, var24, class108.field2456[2], var25);
                }
            }
        }
        if (class54.field1289 != 0 && class135.field3243 % 20 < 10) {
            if (class54.field1289 == 1 && class137.field3269 >= 0 && class137.field3269 < class9.field189.length) {
                class66 var12 = class9.field189[class137.field3269];
                if (var12 != null) {
                    int var13 = var12.field1260 / 32 - class69.field1640.field1260 / 32;
                    int var14 = var12.field1190 / 32 - class69.field1640.field1190 / 32;
                    class59.method461(var14, var13, class61.field1462[1], 999);
                }
            }
            if (class54.field1289 == 2) {
                int var15 = (class14.field296 - class30.field640) * 4 + 2 - class69.field1640.field1190 / 32;
                int var16 = (class81.field1912 - class32.field685) * 4 + 2 - class69.field1640.field1260 / 32;
                class59.method461(var15, var16, class61.field1462[1], 999);
            }
            if (class54.field1289 == 10 && class126.field2949 >= 0 && class126.field2949 < class44.field1067.length) {
                class103 var17 = class44.field1067[class126.field2949];
                if (var17 != null) {
                    int var18 = var17.field1190 / 32 - class69.field1640.field1190 / 32;
                    int var19 = var17.field1260 / 32 - class69.field1640.field1260 / 32;
                    class59.method461(var18, var19, class61.field1462[1], 999);
                }
            }
        }
        if (class29.field609 != 0) {
            int var20 = class29.field609 * 4 + 2 - class69.field1640.field1260 / 32;
            int var21 = class96.field2174 * 4 + 2 - class69.field1640.field1190 / 32;
            class80.method633((byte) -125, var21, class61.field1462[0], var20);
        }
        class68.method569(97, 78, 3, 3, 16777215);
        class54.field1307.method679(0, 0, 33, 33, 25, 25, class19.field376, 256, class34.field831, class114.field2698);
        class1.method4((byte) -128);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
    public abstract int method139(byte arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method137(byte arg0, Component arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method138(Component arg0, int arg1);
}
