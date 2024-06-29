import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class70 {

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "[[I")
    public static int[][] field887 = new int[104][104];

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lqf;")
    public static class117 field886 = class72.method514(114, "redstone2");

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "Lqf;")
    public static class117 field882 = class72.method514(100, "(U0a )2 via: ");

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Lqf;")
    private static class117 field896 = class72.method514(109, "Loaded update list");

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Lqf;")
    private static class117 field895 = class72.method514(125, "Members object");

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Lqf;")
    public static class117 field890 = field896;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lqf;")
    private static class117 field894 = class72.method514(125, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lqf;")
    public static class117 field900 = field895;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lqf;")
    public static class117 field881 = field894;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Leb;")
    public static class31 field899 = new class31(50);

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lqf;")
    private static class117 field901 = class72.method514(101, " is already on your friend list");

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lqf;")
    public static class117 field902 = field901;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "B")
    public byte field891;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Lqf;")
    public class117 field893;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field880;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[[[B")
    public static byte[][][] field883;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ltd;IIIIIZII[B)V")
    public static final void method309(class135[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, byte[] arg9) {
        field885++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg4 + var15 > 0 && arg4 + var15 < 103) {
                    arg0[arg5].field3230[arg3 + var10][arg4 + var15] = class16.method135(arg0[arg5].field3230[arg3 + var10][arg4 + var15], -16777217);
                }
            }
        }
        if (!arg6) {
            field901 = null;
        }
        class77 var11 = new class77(arg9);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && var13 >= arg1 && arg1 + 8 > var13 && arg2 <= var14 && arg2 + 8 > var14) {
                        class94.method741(arg8, (byte) 125, 0, var11, arg5, arg4 + class69.method483(var13 & 0x7, var14 & 0x7, arg6, arg8), arg3 + class70.method498(arg8, var14 & 0x7, (byte) 54, var13 & 0x7), 0);
                    } else {
                        class94.method741(0, (byte) 126, 0, var11, 0, -1, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjb;Ljava/awt/Component;)V")
    public static final void method310(int arg0, class64 arg1, Component arg2) {
        field897++;
        if (class18.field267) {
            return;
        }
        class76.field1677 = class67.method475(class8.field135, -4236, class16.field238, arg1);
        class126.field2996 = class67.method475(class8.field135, -4236, class15.field216, arg1);
        class117.field2826 = class67.method475(class8.field135, -4236, client.field399, arg1);
        class77.field1699 = class67.method475(class8.field135, -4236, class26.field511, arg1);
        class99.field2372 = class67.method475(class8.field135, -4236, class114.field2707, arg1);
        class153.field3796 = class67.method475(class8.field135, -4236, client.field394, arg1);
        class53.field1101 = class52.method390((byte) 73, arg2, 479, 96);
        class126.field2996.method951(0, 0);
        class103.field2499 = class52.method390((byte) -117, arg2, 172, 156);
        class49.method353();
        class117.field2826.method951(0, 0);
        class134.field3186 = class52.method390((byte) 39, arg2, 190, 261);
        class76.field1677.method951(0, 0);
        class32.field683 = class52.method390((byte) -114, arg2, 512, 334);
        class49.method353();
        class76.field1666 = class52.method390((byte) 36, arg2, 496, 50);
        class70.field1492 = class52.method390((byte) 76, arg2, 269, 37);
        class19.field304 = class52.method390((byte) -114, arg2, 249, 45);
        class84 var3 = class96.method761(class117.field2822, arg1, class8.field135, (byte) 123);
        class148.field3608 = class52.method390((byte) 11, arg2, var3.field1916, var3.field1920);
        var3.method676(0, 0);
        class84 var4 = class96.method761(class5.field100, arg1, class8.field135, (byte) 123);
        class91.field2224 = class52.method390((byte) -28, arg2, var4.field1916, var4.field1920);
        var4.method676(0, 0);
        class84 var5 = class96.method761(class92.field2244, arg1, class8.field135, (byte) 123);
        class77.field1693 = class52.method390((byte) -117, arg2, var5.field1916, var5.field1920);
        var5.method676(0, 0);
        class84 var6 = class96.method761(class21.field364, arg1, class8.field135, (byte) 123);
        class32.field691 = class52.method390((byte) 7, arg2, var6.field1916, var6.field1920);
        var6.method676(0, 0);
        class84 var7 = class96.method761(class68.field1413, arg1, class8.field135, (byte) 123);
        class4.field73 = class52.method390((byte) 22, arg2, var7.field1916, var7.field1920);
        var7.method676(0, 0);
        class84 var8 = class96.method761(class80.field1825, arg1, class8.field135, (byte) 123);
        class68.field1428 = class52.method390((byte) -124, arg2, var8.field1916, var8.field1920);
        var8.method676(0, 0);
        class84 var9 = class96.method761(class62.field1263, arg1, class8.field135, (byte) 123);
        class85.field1922 = class52.method390((byte) 70, arg2, var9.field1916, var9.field1920);
        var9.method676(0, 0);
        class84 var10 = class96.method761(class115.field2715, arg1, class8.field135, (byte) 123);
        class75.field1631 = class52.method390((byte) 49, arg2, var10.field1916, var10.field1920);
        var10.method676(0, 0);
        class84 var11 = class96.method761(class62.field1267, arg1, class8.field135, (byte) 123);
        class18.field272 = class52.method390((byte) 30, arg2, var11.field1916, var11.field1920);
        var11.method676(0, 0);
        class89.field2045 = class67.method475(class8.field135, -4236, class76.field1669, arg1);
        class153.field3776 = class67.method475(class8.field135, -4236, field886, arg1);
        class103.field2503 = class67.method475(class8.field135, -4236, class40.field795, arg1);
        class79.field1791 = class89.field2045.method952();
        class79.field1791.method949();
        class128.field3040 = class153.field3776.method952();
        class128.field3040.method949();
        class53.field1108 = class89.field2045.method952();
        class53.field1108.method953();
        class120.field2872 = class153.field3776.method952();
        class120.field2872.method953();
        class64.field1319 = class103.field2503.method952();
        if (arg0 > -39) {
            method310(16, null, null);
        }
        class64.field1319.method953();
        class133.field3157 = class89.field2045.method952();
        class133.field3157.method949();
        class133.field3157.method953();
        class140.field3322 = class153.field3776.method952();
        class140.field3322.method949();
        class140.field3322.method953();
        class97.field2355 = class65.method468(true, arg1, class16.field255, class8.field135);
        class103.field2501 = new int[33];
        class19.field295 = new int[151];
        class128.field3025 = new int[33];
        class42.field849 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class117.field2826.field2833[var19 + class117.field2826.field2835 * var12] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class103.field2501[var12] = var17;
            class128.field3025[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class117.field2826.field2833[class117.field2826.field2835 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class19.field295[var13 - 5] = var14 - 25;
            class42.field849[var13 - 5] = var15 - var14;
        }
        class18.field267 = true;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static final void method311(int arg0) {
        field888++;
        int var1 = -21 / ((arg0 + 44) / 59);
        class117.field2806.method250((byte) -54);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method312(int arg0) {
        field887 = null;
        field883 = null;
        field899 = null;
        field901 = null;
        field900 = null;
        field894 = null;
        field886 = null;
        field895 = null;
        if (arg0 != -28853) {
            field887 = null;
        }
        field890 = null;
        field882 = null;
        field902 = null;
        field880 = null;
        field896 = null;
        field881 = null;
    }
}
