import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class156 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "F")
    public static float field2421;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lug;")
    public static class253 field2418;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lug;")
    public static class253 field2419;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2417;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLug;)V", line = 5)
    public static final void method1127(byte arg0, class253 arg1) {
        field2410++;
        if (arg0 >= 76) {
            class215.field3399 = arg1;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvl;I[B)V", line = 16)
    public final void method1128(class6 arg0, int arg1, byte[] arg2) {
        field2416++;
        if (arg1 != -1) {
            return;
        }
        if (arg0.field115[arg0.field111] != 31 || arg0.field115[arg0.field111 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2417 == null) {
            this.field2417 = new Inflater(true);
        }
        try {
            this.field2417.setInput(arg0.field115, arg0.field111 + 10, -arg0.field111 - 8 + -10 + arg0.field115.length);
            this.field2417.inflate(arg2);
        } catch (Exception var5) {
            this.field2417.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2417.reset();
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 42)
    public class156() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILug;I)[Lbh;", line = 56)
    public static final class18[] method1129(int arg0, int arg1, class253 arg2, int arg3) {
        field2412++;
        if (class287.method2029(arg2, arg0, 2, arg3)) {
            return arg1 >= -36 ? (class18[]) null : class47.method364((byte) 87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)V", line = 75)
    public static final void method1130(int arg0, byte arg1) {
        class79.field1075.method1353(-1, arg0);
        field2420++;
        int var2 = -90 / ((-arg1 - 67) / 51);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 86)
    public static void method1131(int arg0) {
        field2418 = null;
        field2419 = null;
        if (arg0 != 0) {
            field2415 = -60;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BJ)V", line = 97)
    public static final void method1132(byte arg0, long arg1) {
        field2414++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class301.field4626 < 100 || class47.field613) || class301.field4626 >= 200) {
            class131.method971("", (byte) -32, 0, class339.field5292);
            return;
        }
        String var3 = class154.method1118(117, arg1);
        for (int var4 = 0; var4 < class301.field4626; var4++) {
            if (class23.field352[var4] == arg1) {
                class131.method971("", (byte) -32, 0, var3 + class159.field2480);
                return;
            }
        }
        for (int var5 = 0; var5 < class162.field2640; var5++) {
            if (class316.field4982[var5] == arg1) {
                class131.method971("", (byte) -32, 0, class1.field5 + var3 + class113.field1583);
                return;
            }
        }
        if (var3.equals(class146.field2310.field5277)) {
            class131.method971("", (byte) -32, 0, class134.field1965);
        } else if (arg0 == 112) {
            class269.field4181++;
            class55.field768[class301.field4626] = var3;
            class23.field352[class301.field4626] = arg1;
            class99.field1336[class301.field4626] = 0;
            class166.field2736[class301.field4626] = "";
            class270.field4195[class301.field4626] = 0;
            class11.field202[class301.field4626] = false;
            class294.field4555 = class220.field3487;
            class301.field4626++;
            class183.field2965.method1947((byte) 78, 100);
            class183.field2965.method53((byte) 115, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 170)
    public static final void method1133() {
        class157.field2443 = 0;
        label194: for (int var0 = 0; var0 < class163.field2641; var0++) {
            class290 var1 = class5.field60[var0];
            if (class267.field4166 != null) {
                for (int var2 = 0; var2 < class267.field4166.length; var2++) {
                    if (class267.field4166[var2] != -1000000 && (var1.field4468 <= class267.field4166[var2] || var1.field4474 <= class267.field4166[var2]) && (var1.field4475 <= class253.field3997[var2] || var1.field4472 <= class253.field3997[var2]) && (var1.field4475 >= class136.field2085[var2] || var1.field4472 >= class136.field2085[var2]) && (var1.field4479 <= class204.field3229[var2] || var1.field4471 <= class204.field3229[var2]) && (var1.field4479 >= class78.field1048[var2] || var1.field4471 >= class78.field1048[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field4469 == 1) {
                int var3 = var1.field4484 + class166.field2734 - class147.field2318;
                if (var3 >= 0 && var3 <= class166.field2734 + class166.field2734) {
                    int var4 = var1.field4481 + class166.field2734 - class238.field3730;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4482 + class166.field2734 - class238.field3730;
                    if (var5 > class166.field2734 + class166.field2734) {
                        var5 = class166.field2734 + class166.field2734;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class145.field2286[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class261.field4103 - var1.field4475;
                        if (var7 > 32) {
                            var1.field4483 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4483 = 2;
                            var7 = -var7;
                        }
                        var1.field4463 = (var1.field4479 - class206.field3276 << 8) / var7;
                        var1.field4464 = (var1.field4471 - class206.field3276 << 8) / var7;
                        var1.field4462 = (var1.field4468 - class311.field4849 << 8) / var7;
                        var1.field4480 = (var1.field4474 - class311.field4849 << 8) / var7;
                        class286.field4423[class157.field2443++] = var1;
                    }
                }
            } else if (var1.field4469 == 2) {
                int var8 = var1.field4481 + class166.field2734 - class238.field3730;
                if (var8 >= 0 && var8 <= class166.field2734 + class166.field2734) {
                    int var9 = var1.field4484 + class166.field2734 - class147.field2318;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4465 + class166.field2734 - class147.field2318;
                    if (var10 > class166.field2734 + class166.field2734) {
                        var10 = class166.field2734 + class166.field2734;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class145.field2286[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class206.field3276 - var1.field4479;
                        if (var12 > 32) {
                            var1.field4483 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4483 = 4;
                            var12 = -var12;
                        }
                        var1.field4470 = (var1.field4475 - class261.field4103 << 8) / var12;
                        var1.field4473 = (var1.field4472 - class261.field4103 << 8) / var12;
                        var1.field4462 = (var1.field4468 - class311.field4849 << 8) / var12;
                        var1.field4480 = (var1.field4474 - class311.field4849 << 8) / var12;
                        class286.field4423[class157.field2443++] = var1;
                    }
                }
            } else if (var1.field4469 == 4) {
                int var13 = var1.field4468 - class311.field4849;
                if (var13 > 128) {
                    int var14 = var1.field4481 + class166.field2734 - class238.field3730;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4482 + class166.field2734 - class238.field3730;
                    if (var15 > class166.field2734 + class166.field2734) {
                        var15 = class166.field2734 + class166.field2734;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4484 + class166.field2734 - class147.field2318;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4465 + class166.field2734 - class147.field2318;
                        if (var17 > class166.field2734 + class166.field2734) {
                            var17 = class166.field2734 + class166.field2734;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class145.field2286[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4483 = 5;
                            var1.field4470 = (var1.field4475 - class261.field4103 << 8) / var13;
                            var1.field4473 = (var1.field4472 - class261.field4103 << 8) / var13;
                            var1.field4463 = (var1.field4479 - class206.field3276 << 8) / var13;
                            var1.field4464 = (var1.field4471 - class206.field3276 << 8) / var13;
                            class286.field4423[class157.field2443++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(III)V", line = 401)
    private class156(int arg0, int arg1, int arg2) {
    }
}
