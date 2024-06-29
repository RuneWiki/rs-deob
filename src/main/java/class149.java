import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class149 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lcf;")
    public static class93 field2613 = class147.method1066("<img=0>", -48);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lcf;")
    public static class93 field2615 = class147.method1066("S-Blectionner", -48);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lcf;")
    public static class93 field2620 = class147.method1066(":assist:", -48);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2618 = 0;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
    public static int[] field2623 = new int[4];

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lcf;")
    public static class93 field2616 = class147.method1066("Veuillez patienter )2 tentative de r-Btablissement)3", -48);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public static int[] field2614;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[Ldh;")
    public static class120[] field2627;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILcf;Lcf;ILcf;)V")
    public static final void method1072(int arg0, class93 arg1, class93 arg2, int arg3, class93 arg4) {
        field2626++;
        class260.method1753(arg1, arg4, arg2, -1, arg3 - 4252, arg0);
        if (arg3 != 0) {
            method1073(82, (class237) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILs;)V")
    public static final void method1073(int arg0, class237 arg1) {
        field2624++;
        class43 var2 = (class43) class117.field2064.method135(arg1.field4247.method679((byte) 85), true);
        if (arg0 != 0) {
            method1079(-6);
        }
        if (var2 == null) {
            class159.method1146(arg1, (class227) null, (class240) null, (byte) -122, arg1.field3820[0], class138.field2405, 0, arg1.field3805[0]);
        } else {
            var2.method243(arg0 + 24946);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILhg;II)Z")
    public static final boolean method1074(int arg0, class177 arg1, int arg2, int arg3) {
        if (arg2 != 16597) {
            return false;
        }
        field2622++;
        byte[] var4 = arg1.method1271(arg3, -2154, arg0);
        if (var4 == null) {
            return false;
        } else {
            class124.method912(var4, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public static final void method1075(boolean arg0, int arg1) {
        if (!arg0) {
            class287.field5139.method298(true, arg1);
            field2625++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lcf;ZLtg;)Lcf;")
    public static final class93 method1076(class93 arg0, boolean arg1, class181 arg2) {
        if (arg0.method652(class232.field4145, 9) != -1) {
            label62: while (true) {
                int var3 = arg0.method652(class39.field601, 9);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method652(class272.field4829, 9);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method652(class227.field4070, 9);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method652(class168.field2966, 9);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method652(class44.field702, 9);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method652(class106.field1848, 9);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class93 var9 = class178.field3144;
                                                        if (class105.field1826 != null) {
                                                            var9 = class185.method1352(-626138072, class105.field1826.field291);
                                                            try {
                                                                if (class105.field1826.field292 != null) {
                                                                    byte[] var10 = ((String) class105.field1826.field292).getBytes("ISO-8859-1");
                                                                    var9 = class65.method450(var10.length, 0, 62, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(-109, 0, var8), var9, arg0.method637(70, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(83, 0, var7), class15.method73((byte) -108, class102.method732(4, 91, arg2)), arg0.method637(52, var7 + 2) });
                                            }
                                        }
                                        arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(-93, 0, var6), class15.method73((byte) -108, class102.method732(3, 105, arg2)), arg0.method637(72, var6 + 2) });
                                    }
                                }
                                arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(96, 0, var5), class15.method73((byte) -108, class102.method732(2, -91, arg2)), arg0.method637(51, var5 + 2) });
                            }
                        }
                        arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(73, 0, var4), class15.method73((byte) -108, class102.method732(1, 127, arg2)), arg0.method637(78, var4 + 2) });
                    }
                }
                arg0 = class130.method949((byte) -77, new class93[] { arg0.method674(-85, 0, var3), class15.method73((byte) -108, class102.method732(0, -96, arg2)), arg0.method637(88, var3 + 2) });
            }
        }
        if (!arg1) {
            field2613 = null;
        }
        field2617++;
        return arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        class152.field2668.method300(0);
        field2619++;
        int var1 = -64 / ((-arg0 - 25) / 37);
        class51.field834.method300(0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    public static final int method1078(int arg0, int arg1) {
        if (arg1 != 30502) {
            method1074(10, (class177) null, -92, -2);
        }
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        field2621++;
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2613 = null;
        field2623 = null;
        field2620 = null;
        field2616 = null;
        if (arg0 != 0) {
            method1078(119, 9);
        }
        field2627 = null;
        field2614 = null;
        field2615 = null;
    }
}
