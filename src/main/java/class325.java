import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class325 {

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lmc;")
    private class384 field4819 = new class384();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lica;")
    private class205 field4812;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lqu;")
    public static class364 field4816 = new class364(12, 0);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lqu;")
    public static class364 field4827 = new class364(73, 3);

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lqu;")
    public static class364 field4828;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lbj;")
    public static class440 field4809;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method2024(byte arg0) {
        if (arg0 >= -73) {
            return;
        }
        field4811++;
        for (class152 var2 = (class152) this.field4819.method2333(-1); var2 != null; var2 = (class152) this.field4819.method2327(10005)) {
            if (var2.method887((byte) 127)) {
                var2.method2997(1);
                var2.method3225(-98);
                this.field4806 += var2.field1951;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method2025(long arg0, int arg1) {
        field4817++;
        if (arg1 != 2) {
            this.method2026(null, 110);
        }
        class152 var4 = (class152) this.field4812.method1333(arg0, false);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method892(false);
        if (var5 == null) {
            var4.method2997(arg1 - 1);
            var4.method3225(-116);
            this.field4806 += var4.field1951;
            return null;
        }
        if (var4.method887((byte) -1)) {
            class194 var6 = new class194(var5, var4.field1951);
            this.field4812.method1341(var6, (byte) -93, var4.field7465);
            this.field4819.method2331(arg1, var6);
            var6.field8204 = 0L;
            var4.method2997(1);
            var4.method3225(arg1 - 42);
        } else {
            this.field4819.method2331(2, var4);
            var4.field8204 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lun;I)V")
    private final void method2026(class152 arg0, int arg1) {
        if (arg1 != -397196388) {
            return;
        }
        field4824++;
        if (arg0 != null) {
            arg0.method2997(arg1 ^ 0xE853439D);
            arg0.method3225(arg1 ^ 0x17ACBC21);
            this.field4806 += arg0.field1951;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2027(int arg0) {
        field4810++;
        if (arg0 != 13579) {
            this.field4806 = 9;
        }
        class152 var2 = (class152) this.field4812.method1340((byte) 42);
        while (var2 != null) {
            Object var3 = var2.method892(false);
            if (var3 != null) {
                return var3;
            }
            class152 var4 = var2;
            var2 = (class152) this.field4812.method1340((byte) 87);
            var4.method2997(1);
            var4.method3225(-120);
            this.field4806 += var2.field1951;
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
    public final void method2028(int arg0, boolean arg1) {
        if (class108.field1371 != null) {
            for (class152 var3 = (class152) this.field4819.method2333(-1); var3 != null; var3 = (class152) this.field4819.method2327(10005)) {
                if (var3.method887((byte) 126)) {
                    if (var3.method892(false) == null) {
                        var3.method2997(1);
                        var3.method3225(-105);
                        this.field4806++;
                    }
                } else if ((long) arg0 < ++var3.field8204) {
                    class152 var4 = class108.field1371.method662(true, var3);
                    this.field4812.method1341(var4, (byte) -122, var3.field7465);
                    class614.method3574(var3, -15952, var4);
                    var3.method2997(1);
                    var3.method3225(-123);
                }
            }
        }
        field4822++;
        if (!arg1) {
            this.method2039(92);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
    public final void method2029(boolean arg0, Object arg1, long arg2) {
        this.method2035(arg2, 1, -119, arg1);
        if (arg0) {
            this.method2031(112);
        }
        field4826++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2030(byte arg0) {
        field4818++;
        if (arg0 < 106) {
            field4827 = null;
        }
        class152 var2 = (class152) this.field4812.method1331(-1925);
        while (var2 != null) {
            Object var3 = var2.method892(false);
            if (var3 != null) {
                return var3;
            }
            class152 var4 = var2;
            var2 = (class152) this.field4812.method1340((byte) -74);
            var4.method2997(1);
            var4.method3225(-104);
            this.field4806 += var2.field1951;
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
    public final int method2031(int arg0) {
        field4820++;
        return arg0 == 2 ? this.field4825 : 14;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(JI)V")
    private final void method2032(long arg0, int arg1) {
        field4807++;
        if (arg1 >= 11) {
            class152 var4 = (class152) this.field4812.method1333(arg0, false);
            this.method2026(var4, -397196388);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILno;B)V")
    public static final void method2033(int arg0, class483 arg1, byte arg2) {
        field4823++;
        boolean var3 = arg1.method2937(-19811, 1) == 1;
        if (var3) {
            class215.field3180[class202.field3016++] = arg0;
        }
        int var4 = arg1.method2937(-19811, 2);
        class179 var5 = class383.field5604[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2756 = false;
            } else if (class404.field5807 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class351 var6 = class442.field6468[arg0] = new class351();
                var6.field5112 = (var5.field3457 << 28) + (var5.field1090[0] + class584.field8677 >> 6 << 14) + (class424.field6061 - -var5.field1089[0] >> 6);
                if (var5.field2739 == -1) {
                    var6.field5108 = var5.field1067.method1378(-96);
                } else {
                    var6.field5108 = var5.field2739;
                }
                var6.field5106 = var5.field1037;
                var6.field5110 = var5.field2744;
                if (var5.field2722 > 0) {
                    class235.method1525(1, var5);
                }
                class383.field5604[arg0] = null;
                if (arg1.method2937(-19811, 1) != 0) {
                    class421.method2503(arg1, arg0, 0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method2937(-19811, 3);
            int var8 = var5.field1090[0];
            int var9 = var5.field1089[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field2756 = true;
                var5.field2708 = var8;
                var5.field2741 = var9;
            } else {
                var5.method1201(var8, (byte) -22, var9, class139.field1830[arg0]);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method2937(-19811, 4);
            int var11 = var5.field1090[0];
            int var12 = var5.field1089[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field2708 = var11;
                var5.field2741 = var12;
                var5.field2756 = true;
            } else {
                var5.method1201(var11, (byte) -22, var12, class139.field1830[arg0]);
            }
        } else {
            int var13 = arg1.method2937(-19811, 1);
            if (var13 == 0) {
                int var14 = arg1.method2937(-19811, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E4) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1090[0] + var16;
                int var19 = var5.field1089[0] + var17;
                if (var3) {
                    var5.field2708 = var18;
                    var5.field2756 = true;
                    var5.field2741 = var19;
                } else {
                    var5.method1201(var18, (byte) -22, var19, class139.field1830[arg0]);
                }
                var5.field3457 = (byte) (var5.field3457 + var15 & 0x3);
                if (class404.field5807 == arg0) {
                    class355.field5157 = var5.field3457;
                }
            } else {
                if (arg2 <= 93) {
                    field4809 = null;
                }
                int var20 = arg1.method2937(-19811, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFDFC2) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class584.field8677 + var22 + var5.field1090[0] & 0x3FFF) - class584.field8677;
                int var25 = (var5.field1089[0] + class424.field6061 + var23 & 0x3FFF) - class424.field6061;
                if (var3) {
                    var5.field2741 = var25;
                    var5.field2756 = true;
                    var5.field2708 = var24;
                } else {
                    var5.method1201(var24, (byte) -22, var25, class139.field1830[arg0]);
                }
                var5.field3457 = (byte) (var5.field3457 + var21 & 0x3);
                if (class404.field5807 == arg0) {
                    class355.field5157 = var5.field3457;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method2034(boolean arg0) {
        field4828 = null;
        field4809 = null;
        field4827 = null;
        field4816 = null;
        if (arg0) {
            field4827 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JIILjava/lang/Object;)V")
    private final void method2035(long arg0, int arg1, int arg2, Object arg3) {
        field4815++;
        if (arg2 > -95) {
            return;
        }
        if (this.field4825 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2032(arg0, 104);
        this.field4806 -= arg1;
        while (this.field4806 < 0) {
            class152 var7 = (class152) this.field4819.method2332(false);
            this.method2026(var7, -397196388);
        }
        class194 var6 = new class194(arg3, arg1);
        this.field4812.method1341(var6, (byte) 92, arg0);
        this.field4819.method2331(2, var6);
        var6.field8204 = 0L;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
    public final int method2036(int arg0) {
        field4821++;
        return arg0 == 16383 ? this.field4806 : -88;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public final void method2037(boolean arg0) {
        this.field4819.method2334((byte) -97);
        field4813++;
        this.field4812.method1332(-22538);
        if (!arg0) {
            this.method2025(-104L, 61);
        }
        this.field4806 = this.field4825;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
    public static final boolean method2038(int arg0) {
        field4808++;
        class496 var1 = class272.field4014.field6029.field7466;
        if (var1 == null || class272.field4014.field6029 == var1) {
            return false;
        } else if (arg0 == 2) {
            class548 var2 = (class548) var1;
            if (var2.field8163 >= 2000) {
                var2.field8163 -= 2000;
            }
            return var2.field8163 == 1001;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
    public final int method2039(int arg0) {
        field4814++;
        int var2 = arg0;
        for (class152 var3 = (class152) this.field4819.method2333(-1); var3 != null; var3 = (class152) this.field4819.method2327(10005)) {
            if (!var3.method887((byte) -123)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class325(int arg0) {
        this.field4806 = arg0;
        this.field4825 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4812 = new class205(var2);
    }

    static {
        new class487("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field4828 = new class364(32, 7);
    }
}
