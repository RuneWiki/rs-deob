import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class181 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lhl;")
    public static class139 field2629 = new class139(64);

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[B")
    public static byte[] field2639;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[I")
    public static int[] field2641;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "J")
    public long field2628;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lug;")
    public class181 field2633;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lug;")
    public class181 field2635;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lpk;")
    public static class237 field2640;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
    public final boolean method1187(byte arg0) {
        field2636++;
        if (arg0 <= 105) {
            field2637 = -83;
        }
        return this.field2635 != null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z")
    public static final boolean method1188(int arg0, int arg1) {
        field2638++;
        if (arg1 <= 125) {
            method1190((class237) null, -66);
        }
        if (arg0 < 0) {
            return false;
        }
        int var2 = class265.field4147[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
    public static final void method1189(int arg0, int arg1) {
        field2634++;
        if (arg0 == -1 || !class24.field388[arg0]) {
            return;
        }
        class5.field68.method1623(arg1 - 14670, arg0);
        if (class275.field4236[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 14670) {
            return;
        }
        for (int var3 = 0; var3 < class275.field4236[arg0].length; var3++) {
            if (class275.field4236[arg0][var3] != null) {
                if (class275.field4236[arg0][var3].field4553 == 2) {
                    var2 = false;
                } else {
                    class275.field4236[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class275.field4236[arg0] = null;
        }
        class24.field388[arg0] = false;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lpk;I)Z")
    public static final boolean method1190(class237 arg0, int arg1) {
        field2630++;
        if (arg0.method1629(class1.field10, 0)) {
            return true;
        } else {
            if (arg1 != -2001) {
                field2639 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static void method1191(byte arg0) {
        if (arg0 <= 80) {
            field2642 = -84;
        }
        field2641 = null;
        field2629 = null;
        field2639 = null;
        field2640 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method1192(int arg0) {
        class297.method1979((byte) -76, class223.field3464);
        class8.field92++;
        field2626++;
        if (class68.field1119 && class108.field1582) {
            int var1 = class12.field172;
            int var2 = class105.field1542;
            int var3 = var1 - class287.field4394;
            int var4 = var2 - class234.field3609;
            if (class109.field1601 > var4) {
                var4 = class109.field1601;
            }
            int var5 = class223.field3464.field4681;
            if (arg0 == 29975) {
                if (var3 < class109.field1629) {
                    var3 = class109.field1629;
                }
                if ((class223.field3464.field4531 + var4) > (class109.field1601 + class260.field3988.field4531)) {
                    var4 = class109.field1601 + class260.field3988.field4531 - class223.field3464.field4531;
                }
                int var6 = var4 + class260.field3988.field4594 - class109.field1601;
                if ((class109.field1629 + class260.field3988.field4627) < (class223.field3464.field4627 + var3)) {
                    var3 = class109.field1629 + class260.field3988.field4627 - class223.field3464.field4627;
                }
                int var7 = var3 - class210.field3145;
                int var8 = var4 - class169.field2481;
                if (class223.field3464.field4534 < class8.field92 && (var7 > var5 || (-var5) > var7 || var5 < var8 || -var5 > var8)) {
                    class190.field2887 = true;
                }
                int var9 = var3 + class260.field3988.field4656 - class109.field1629;
                if (class223.field3464.field4667 != null && class190.field2887) {
                    class43 var10 = new class43();
                    var10.field757 = var9;
                    var10.field750 = class223.field3464;
                    var10.field767 = class223.field3464.field4667;
                    var10.field762 = var6;
                    class137.method934(200000, var10);
                }
                if (class215.field3304 == 0) {
                    if (class190.field2887) {
                        if (class223.field3464.field4690 != null) {
                            class43 var11 = new class43();
                            var11.field756 = class34.field619;
                            var11.field750 = class223.field3464;
                            var11.field762 = var6;
                            var11.field757 = var9;
                            var11.field767 = class223.field3464.field4690;
                            class137.method934(200000, var11);
                        }
                        if (class34.field619 != null && client.method329(class223.field3464) != null) {
                            class177.field2602++;
                            class59.field964.method1540(80, (byte) -2);
                            class59.field964.method400(class34.field619.field4528, arg0 - 30056);
                            class59.field964.method453((byte) 97, class223.field3464.field4683);
                            class59.field964.method431(true, class223.field3464.field4528);
                            class59.field964.method454(class34.field619.field4683, (byte) 81);
                        }
                    } else if ((class205.field3078 == 1 || method1188(class51.field826 - 1, 126)) && class51.field826 > 2) {
                        class296.method1966(-98);
                    } else if (class51.field826 > 0) {
                        class287.method1905(0);
                    }
                    class223.field3464 = null;
                }
            }
        } else if (class8.field92 > 1) {
            class223.field3464 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1193(int arg0) {
        field2632++;
        if (this.field2635 == null) {
            return;
        }
        this.field2635.field2633 = this.field2633;
        if (arg0 < 107) {
            method1188(-124, -112);
        }
        this.field2633.field2635 = this.field2635;
        this.field2635 = null;
        this.field2633 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BJZ)V")
    public static final void method1194(byte arg0, long arg1, boolean arg2) {
        field2627++;
        if (arg1 == 0L) {
            return;
        }
        if (class206.field3090 >= 100) {
            class260.method1759(0, "", 128, class292.field4434);
            return;
        }
        if (arg0 < 27) {
            field2642 = 77;
        }
        String var4 = class37.method287(arg1, (byte) 103);
        for (int var5 = 0; var5 < class206.field3090; var5++) {
            if (class51.field831[var5] == arg1) {
                class260.method1759(0, "", 128, var4 + class213.field3270);
                return;
            }
        }
        for (int var6 = 0; var6 < class3.field36; var6++) {
            if (class131.field1926[var6] == arg1) {
                class260.method1759(0, "", 128, class6.field75 + var4 + class258.field3955);
                return;
            }
        }
        if (var4.equals(class185.field2687.field3488)) {
            class260.method1759(0, "", 128, class30.field552);
            return;
        }
        class141.field2033++;
        class51.field831[class206.field3090] = arg1;
        class248.field3853[class206.field3090] = class231.method1568(126, arg1);
        class164.field2392[class206.field3090++] = arg2;
        class226.field3533 = class169.field2494;
        class59.field964.method1540(29, (byte) -2);
        class59.field964.method440(arg1, -115);
    }

    static {
        int var0 = 0;
        field2639 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2639[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field2642 = -1;
        field2641 = new int[32];
    }
}
