import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class61 extends class102 {

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
    public static int[] field808 = new int[32];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lii;")
    public static class405 field807;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lok;")
    public class61 field801;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lok;")
    public class61 field806;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lcq;")
    public static class67 field802;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIBI)Z", line = 12)
    public static final boolean method424(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field800++;
        if ((class103.field1430[0][arg2][arg1] & 0x2) != 0) {
            return true;
        } else if ((class103.field1430[arg0][arg2][arg1] & 0x10) != 0) {
            return false;
        } else if (class88.method621(arg2, arg1, arg0, (byte) -19) == arg4) {
            return true;
        } else if (arg3 < 87) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 34)
    public final void method425(int arg0) {
        field805++;
        if (arg0 > -63) {
            field808 = null;
        }
        if (this.field806 != null) {
            this.field806.field801 = this.field801;
            this.field801.field806 = this.field806;
            this.field806 = null;
            this.field801 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V", line = 54)
    public static final void method426(int arg0) {
        field804++;
        for (int var1 = 0; var1 < class225.field2964; var1++) {
            int var2 = class151.field2055[var1];
            class43 var3 = class306.field4496[var2];
            int var4 = class156.field2120.method1348(-125);
            if ((var4 & 0x40) != 0) {
                var4 += class156.field2120.method1348(-100) << 8;
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class156.field2120.method1340(-128);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class156.field2120.method1371(-84);
                class185.method1127(var3, var6, var5, true);
            }
            if ((var4 & 0x2) != 0) {
                var3.field4330 = class156.field2120.method1356((byte) -96);
                if (var3.field4330 == 65535) {
                    var3.field4330 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field4275 = class156.field2120.method1340(-128);
                var3.field4320 = class156.field2120.method1340(-128);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class156.field2120.method1327((byte) -64);
                int var8 = class156.field2120.method1355(29550);
                var3.method2038((byte) -94, var8, var7, class28.field418);
            }
            if ((var4 & 0x100) != 0) {
                int var9 = class156.field2120.method1356((byte) -17);
                var3.field4279 = class156.field2120.method1348(-99);
                var3.field4289 = class156.field2120.method1371(-78);
                var3.field4344 = (var9 & 0x8000) != 0;
                var3.field4336 = var9 & 0x7FFF;
                var3.field4312 = var3.field4336 + var3.field4279 + class28.field418;
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class156.field2120.method1340(-128);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class156.field2120.method1344((byte) 56);
                boolean var12 = true;
                if (var10 != -1 && var3.field4326 != -1) {
                    if (var3.field4326 == var10) {
                        class300 var17 = class426.method2706((byte) 11, var10);
                        if (var17.field4389 && var17.field4406 != -1) {
                            class12 var18 = class33.method221((byte) 102, var17.field4406);
                            int var19 = var18.field193;
                            if (var19 == 0) {
                                var12 = false;
                            } else if (var19 == 1) {
                                var12 = true;
                            } else if (var19 == 2) {
                                var12 = false;
                                var3.field4270 = 0;
                            }
                        }
                    } else {
                        class300 var13 = class426.method2706((byte) 11, var10);
                        class300 var14 = class426.method2706((byte) 11, var3.field4326);
                        if (var13.field4406 != -1 && var14.field4406 != -1) {
                            class12 var15 = class33.method221((byte) 102, var13.field4406);
                            class12 var16 = class33.method221((byte) 102, var14.field4406);
                            if (var16.field190 > var15.field190) {
                                var12 = false;
                            }
                        }
                    }
                }
                if (var12) {
                    var3.field4341 = var11 >> 16;
                    var3.field4326 = var10;
                    var3.field4348 = (var11 & 0xFFFF) + class28.field418;
                    var3.field4280 = 1;
                    var3.field4304 = 0;
                    var3.field4273 = 0;
                    if (class28.field418 < var3.field4348) {
                        var3.field4304 = -1;
                    }
                    if (var3.field4326 != -1 && class28.field418 == var3.field4348) {
                        int var20 = class426.method2706((byte) 11, var3.field4326).field4406;
                        if (var20 != -1) {
                            class12 var21 = class33.method221((byte) 102, var20);
                            if (var21 != null && var21.field182 != null) {
                                class298.method2049(var3.field734, false, var3.field740, 9757, 0, var21);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field606.method1508(-112)) {
                    class87.method617((byte) -83, var3);
                }
                var3.method306(0, class119.method771((byte) 96, class156.field2120.method1356((byte) -78)));
                var3.method2037(-110, var3.field606.field3363);
                var3.field4271 = var3.field606.field3408 << 3;
                if (var3.field606.method1508(17)) {
                    class406.method2620(class227.field2981, var3.field4362[0], 0, arg0 + 10376, var3.field4360[0], (class25) null, (class104) null, var3);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var22 = class156.field2120.method1371(-113);
                int[] var23 = new int[var22];
                int[] var24 = new int[var22];
                int[] var25 = new int[var22];
                for (int var26 = 0; var26 < var22; var26++) {
                    int var27 = class156.field2120.method1340(-128);
                    if (var27 == 65535) {
                        var27 = -1;
                    }
                    var23[var26] = var27;
                    var24[var26] = class156.field2120.method1374(arg0 + 10327);
                    var25[var26] = class156.field2120.method1356((byte) -123);
                }
                class394.method2519(var3, arg0 ^ 0xFFFFCB29, var25, var23, var24);
            }
            if ((var4 & 0x8) != 0) {
                var3.field4309 = class156.field2120.method1329(991328496);
                var3.field4310 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var28 = class156.field2120.method1327((byte) -64);
                int var29 = class156.field2120.method1355(arg0 ^ 0xFFFFA4C7);
                var3.method2038((byte) -107, var29, var28, class28.field418);
                var3.field4315 = class28.field418 + 300;
                var3.field4266 = class156.field2120.method1374(0);
            }
        }
        if (arg0 != -10327) {
            method426(32);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 305)
    public static void method427(byte arg0) {
        field802 = null;
        int var1 = -98 % ((14 - arg0) / 41);
        field808 = null;
        field807 = null;
    }
}
