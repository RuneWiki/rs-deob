import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class298 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public int field4458 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lsh;")
    public static class472 field4455 = new class472(56, 8);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lsh;")
    public static class472 field4461 = new class472(7, -1);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public static int[] field4462;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILre;)V", line = 3)
    private final void method1862(int arg0, int arg1, class446 arg2) {
        if (arg0 == 5) {
            this.field4458 = arg2.method2631(2530);
        }
        field4456++;
        if (arg1 > -85) {
            field4455 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lre;I)V", line = 26)
    public final void method1863(class446 arg0, int arg1) {
        if (arg1 != 0) {
            field4455 = null;
        }
        field4457++;
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method1862(var3, -92, arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBZZ)V", line = 52)
    public static final void method1864(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        field4460++;
        if (!arg3 && class356.field5413 == arg0 && class314.field4728 == arg1 && class486.field6836 == class314.field4722 || class337.field5038.method2209(class170.field2424, -108)) {
            return;
        }
        class314.field4722 = class486.field6836;
        class314.field4728 = arg1;
        class356.field5413 = arg0;
        if (class337.field5038.method2209(class170.field2424, -102)) {
            class314.field4722 = 0;
        }
        if (arg4) {
            class144.method987((byte) 29, 28);
        } else {
            class144.method987((byte) 29, 25);
        }
        class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21), 107, class310.field4690, true);
        if (arg2 != 45) {
            method1865(6);
        }
        int var5 = class68.field922;
        int var6 = class468.field6588;
        class68.field922 = (class356.field5413 - (class379.field5642 >> 4)) * 8;
        class468.field6588 = (class314.field4728 - (class456.field6477 >> 4)) * 8;
        class361.field5470 = class189.method1305(class356.field5413 * 8, class314.field4728 * 8);
        class203.field3087 = null;
        int var7 = class68.field922 - var5;
        int var8 = class468.field6588 - var6;
        if (arg4) {
            class256.field3797 = 0;
            int var9 = class379.field5642 * 128 - 128;
            int var10 = (class456.field6477 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class349 var12 = class18.field241[var11];
                if (var12 != null) {
                    var12.field4538 -= var8 * 128;
                    var12.field4543 -= var7 * 128;
                    if (var12.field4543 >= 0 && var9 >= var12.field4543 && var12.field4538 >= 0 && var10 >= var12.field4538) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field4675[var14] -= var7;
                            var12.field4674[var14] -= var8;
                            if (var12.field4675[var14] < 0 || class379.field5642 <= var12.field4675[var14] || var12.field4674[var14] < 0 || var12.field4674[var14] >= class456.field6477) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class236.field3441[class256.field3797++] = var11;
                        } else {
                            class18.field241[var11].method2154((class273) null, (byte) 48);
                            class18.field241[var11] = null;
                        }
                    } else {
                        class18.field241[var11].method2154((class273) null, (byte) 48);
                        class18.field241[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class349 var20 = class18.field241[var15];
                if (var20 != null) {
                    for (int var21 = 0; var21 < 10; var21++) {
                        var20.field4675[var21] -= var7;
                        var20.field4674[var21] -= var8;
                    }
                    var20.field4543 -= var7 * 128;
                    var20.field4538 -= var8 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class257 var18 = class40.field565[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < 10; var19++) {
                    var18.field4675[var19] -= var7;
                    var18.field4674[var19] -= var8;
                }
                var18.field4543 -= var7 * 128;
                var18.field4538 -= var8 * 128;
            }
        }
        class258.method1708(var7, var8, -11351);
        for (class198 var17 = (class198) class428.field6108.method2456(32101); var17 != null; var17 = (class198) class428.field6108.method2461(301)) {
            var17.field2986 -= var7;
            var17.field2974 -= var8;
            if (var17.field2986 < 0 || var17.field2974 < 0 || class379.field5642 <= var17.field2986 || class456.field6477 <= var17.field2974) {
                var17.method283(2);
            }
        }
        class198.field2984 = 0;
        if (class37.field492 != 0) {
            class37.field492 -= var7;
            class106.field1483 -= var8;
        }
        if (arg4) {
            class2.field42 -= var7;
            class77.field1089 -= var8;
            class251.field3622 -= var8;
            class68.field920 -= var7 * 128;
            class306.field4562 -= var7;
            class200.field3027 -= var8 * 128;
            if (Math.abs(var7) > class379.field5642 || Math.abs(var8) > class456.field6477) {
                class414.method2471(0);
            }
        } else if (class469.field6596 == 4) {
            class128.field1787 -= var7 * 128;
            class492.field6932 -= var8 * 128;
            class312.field4705 -= var7 * 128;
            class379.field5641 -= var8 * 128;
        } else {
            class469.field6596 = 1;
        }
        class3.method23(-43);
        class293.method1844(44);
        class467.field6578.method2459(300);
        class36.field460.method2459(arg2 ^ 0x101);
        class322.field4845.method1590(-15139);
        class209.method1409(arg2 ^ 0xFFFFFFBF);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 264)
    public static void method1865(int arg0) {
        if (arg0 >= -53) {
            method1865(-40);
        }
        field4461 = null;
        field4462 = null;
        field4455 = null;
    }
}
