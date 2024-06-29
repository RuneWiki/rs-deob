import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class428 extends class183 {

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field6284 = -1;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field6286 = 0;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6282 = "Select";

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field6289 = 0;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Lfd;")
    public static class194 field6290 = null;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Lbf;")
    public static class326 field6291 = null;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lwk;")
    public class428 field6279;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lwk;")
    public class428 field6280;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lc;I)V")
    public static final void method2646(class158 arg0, int arg1) {
        field6281++;
        if (class244.field3323 >= 400 || class427.field6264 == arg0) {
            return;
        }
        String var2;
        if (arg0.field2009 == 0) {
            boolean var3 = true;
            if (class427.field6264.field2018 != -1 && arg0.field2018 != -1) {
                int var4 = class427.field6264.field2022 <= arg0.field2022 ? arg0.field2022 : class427.field6264.field2022;
                int var5 = class427.field6264.field2018 < arg0.field2018 ? class427.field6264.field2018 : arg0.field2018;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class427.field6264.field2022 - arg0.field2022;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class62.field636 == 1 ? class57.field586 : class366.field5131;
            if (arg0.field2019 > arg0.field2022) {
                var2 = arg0.method851(true, -116) + (var3 ? class54.method269(class427.field6264.field2022, arg0.field2022, (byte) -68) : "<col=ffffff>") + " (" + var8 + arg0.field2022 + "+" + (arg0.field2019 - arg0.field2022) + ")";
            } else {
                var2 = arg0.method851(true, arg1 ^ 0x7869) + (var3 ? class54.method269(class427.field6264.field2022, arg0.field2022, (byte) -68) : "<col=ffffff>") + " (" + var8 + arg0.field2022 + ")";
            }
        } else {
            var2 = arg0.method851(true, -116) + " (" + class232.field3193 + arg0.field2009 + ")";
        }
        if (class171.field2155 == 1) {
            class308.field4160++;
            class380.method2342(0, class114.field1425 + " -> <col=ffffff>" + var2, (byte) -120, (long) arg0.field6095, class418.field6013, class12.field113, 0, 49);
        } else if (!class65.field682) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class127.field1639[var9] != null) {
                    short var10 = 0;
                    if (class62.field636 == 0 && class127.field1639[var9].equalsIgnoreCase(class305.field4135)) {
                        if (arg0.field2022 > class427.field6264.field2022) {
                            var10 = 2000;
                        }
                        if (class427.field6264.field2010 != 0 && arg0.field2010 != 0) {
                            if (class427.field6264.field2010 == arg0.field2010) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class19.field192[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class269.field3658[var9] + var10);
                    int var12 = class409.field5924[var9] == -1 ? class110.field1358 : class409.field5924[var9];
                    class380.method2342(0, "<col=ffffff>" + var2, (byte) -114, (long) arg0.field6095, var12, class127.field1639[var9], 0, var11);
                    class136.field1737++;
                }
            }
        } else if ((class306.field4143 & 0x8) != 0) {
            class250.field3393++;
            class380.method2342(0, class77.field874 + " -> <col=ffffff>" + var2, (byte) -92, (long) arg0.field6095, class383.field5467, class132.field1699, 0, 22);
        }
        for (class405 var13 = (class405) class342.field4577.method814((byte) 90); var13 != null; var13 = (class405) class342.field4577.method827(123)) {
            if (var13.field5892 == 33) {
                var13.field5899 = "<col=ffffff>" + var2;
                break;
            }
        }
        if (arg1 != -30747) {
            method2648(-6);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI[BI)I")
    public static final int method2647(byte arg0, int arg1, byte[] arg2, int arg3) {
        field6283++;
        int var4 = -1;
        int var5 = arg3;
        if (arg0 != 9) {
            method2646((class158) null, 99);
        }
        while (arg1 > var5) {
            var4 = class401.field5855[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method2648(int arg0) {
        class114 var1 = class396.field5700;
        synchronized (class396.field5700) {
            class396.field5700.method613(true);
            if (arg0 != 22) {
                field6289 = 125;
            }
        }
        field6285++;
        class114 var2 = class203.field2718;
        synchronized (class203.field2718) {
            class203.field2718.method613(true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public final void method2649(int arg0) {
        field6287++;
        if (this.field6279 == null) {
            return;
        }
        this.field6279.field6280 = this.field6280;
        this.field6280.field6279 = this.field6279;
        this.field6280 = null;
        this.field6279 = null;
        if (arg0 != 22) {
            method2646((class158) null, -63);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method2650(byte arg0) {
        field6290 = null;
        if (arg0 == 100) {
            field6291 = null;
            field6282 = null;
        }
    }
}
