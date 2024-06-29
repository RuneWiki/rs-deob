import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class41 extends class405 {

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "[I")
    public static int[] field536 = new int[25];

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Ll;")
    public static class127 field535;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Ldk;")
    public static class422 field539;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lgh;")
    public class57[] field538;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "[[B")
    private byte[][] field546;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public static void method323(byte arg0) {
        if (arg0 == 15) {
            field535 = null;
            field536 = null;
            field539 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
    public final boolean method324(int arg0, int arg1) {
        field543++;
        return arg1 == -1500 ? this.field538[arg0].field780 : true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I")
    public static final int method325(byte arg0, int arg1) {
        field534++;
        if (arg0 != 24) {
            field536 = null;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)Z")
    public final boolean method326(int arg0, int arg1) {
        field540++;
        return arg0 == 0 ? this.field538[arg1].field784 : false;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Z")
    public final boolean method327(byte arg0, int arg1) {
        int var3 = 43 % (arg0 / 38);
        field542++;
        return this.field538[arg1].field789;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field533++;
        if ((class524.field7736[0][arg4][arg2] & arg1) != 0) {
            return true;
        } else if ((class524.field7736[arg0][arg4][arg2] & 0x10) == 0) {
            return arg3 == class393.method2362(arg4, arg2, arg0, -27087);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
    public static final void method329(byte arg0) {
        for (int var1 = 0; var1 < class187.field2744; var1++) {
            class425 var2 = class158.field2387[var1];
            boolean var3 = false;
            if (var2.field6338 == null) {
                var2.field6339--;
                if (var2.field6339 < (var2.field6340 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field6340 == 1 && var2.field6330 == null) {
                        var2.field6330 = class183.method1244(class235.field3298, var2.field6331, 0);
                        if (var2.field6330 == null) {
                            continue;
                        }
                        var2.field6339 += var2.field6330.method1243();
                    } else if (var2.field6340 == 2 && (var2.field6335 == null || var2.field6329 == null)) {
                        if (var2.field6335 == null) {
                            var2.field6335 = class177.method1205(class316.field4882, var2.field6331);
                        }
                        if (var2.field6335 == null) {
                            continue;
                        }
                        if (var2.field6329 == null) {
                            var2.field6329 = var2.field6335.method1214(new int[] { 22050 });
                            if (var2.field6329 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field6339 < 0) {
                        int var5;
                        if (var2.field6337 == 0) {
                            var5 = class454.field6661.field976 * var2.field6341 >> 8;
                        } else {
                            int var4 = (var2.field6337 & 0x37C84CF) >> 24;
                            if (class410.field6198.field7686 == var4) {
                                int var6 = (var2.field6337 & 0xFF) << 7;
                                int var7 = (var2.field6337 & 0xFF1752) >> 16;
                                int var8 = (var7 << 7) + 64 - class410.field6198.field7681;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field6337 & 0xFF1D) >> 8;
                                int var10 = (var9 << 7) + 64 - class410.field6198.field7671;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field6339 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (var6 - var11) * var2.field6341 * class454.field6661.field1000 / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class528 var12 = null;
                            if (var2.field6340 == 1) {
                                var12 = var2.field6330.method1246().method3138(class311.field4839);
                            } else if (var2.field6340 == 2) {
                                var12 = var2.field6329;
                            }
                            class380 var13 = var2.field6338 = class380.method2243(var12, 100, var5);
                            var13.method2251(var2.field6334 - 1);
                            class176.field2598.method2376(var13);
                        }
                    }
                }
            } else if (!var2.field6338.method875(0)) {
                var3 = true;
            }
            if (var3) {
                class187.field2744--;
                for (int var14 = var1; var14 < class187.field2744; var14++) {
                    class158.field2387[var14] = class158.field2387[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0 >= -107) {
            field535 = null;
        }
        field541++;
        if (class520.field7641 && !class258.method1578(10105)) {
            if (class454.field6661.field980 != 0 && class120.field1840 != -1) {
                class428.method2537((byte) -77, class120.field1840, 0, class497.field7381, false, class454.field6661.field980);
            }
            class520.field7641 = false;
        } else if (class454.field6661.field980 != 0 && class120.field1840 != -1 && !class258.method1578(10105)) {
            class97.method758(class187.field2738, false);
            class460.field6711++;
            class43.field559.method2717(class120.field1840, 496598568);
            class120.field1840 = -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
    public class41(int arg0) {
        this.field544 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
    public final boolean method330(int arg0) {
        field545++;
        if (this.field538 != null) {
            return true;
        }
        if (this.field546 == null) {
            if (!class23.field353.method546(this.field544, -31)) {
                return false;
            }
            int[] var2 = class23.field353.method522(arg0, this.field544);
            this.field546 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field546[var3] = class23.field353.method541(var2[var3], this.field544, (byte) -122);
            }
        }
        boolean var4 = true;
        for (int var5 = arg0; var5 < this.field546.length; var5++) {
            byte[] var14 = this.field546[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class258.field3707.method551(116, var15);
        }
        if (!var4) {
            return false;
        }
        class497 var6 = new class497();
        int var7 = class23.field353.method536(false, this.field544);
        this.field538 = new class57[var7];
        int[] var8 = class23.field353.method522(0, this.field544);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field546[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class20 var12 = null;
            for (class20 var13 = (class20) var6.method2957(121); var13 != null; var13 = (class20) var6.method2947(113)) {
                if (var13.field297 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class20(var11, class258.field3707.method526(var11, 1));
                var6.method2958(var12, (byte) 123);
            }
            this.field538[var8[var9]] = new class57(var10, var12);
        }
        this.field546 = null;
        return true;
    }
}
