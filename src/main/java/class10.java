import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class10 extends class291 {

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "Leg;")
    private class37 field179 = class134.field2332;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "[Leg;")
    public static class37[] field169 = new class37[1000];

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field166 = 128;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Leg;")
    private static class37 field182 = class174.method1167("Loading config )2 ", -54);

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Leg;")
    public static class37 field167 = field182;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "J")
    public static long field165;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lpa;")
    public class140 field171;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lpa;")
    private class140 field176;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[I")
    public static int[] field178;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "[[[B")
    public static byte[][][] field173;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lja;IIIIILpe;)V")
    public static final void method56(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class237 arg6) {
        field186++;
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 * arg1 + arg5 * arg5;
        int var8 = class279.field4933 + class25.field355 & 0x7FF;
        int var9 = Math.max(arg6.field4067 / 2, arg6.field4206 / 2) + 10;
        if (var7 > var9 * var9) {
            return;
        }
        int var10 = class76.field1192[var8];
        int var11 = var10 * 256 / (class172.field2884 + arg4);
        int var12 = class76.field1189[var8];
        int var13 = var12 * 256 / (class172.field2884 + 256);
        int var14 = arg5 * var13 - arg1 * var11 >> 16;
        int var15 = arg1 * var13 + arg5 * var11 >> 16;
        ((class195) arg0).method1346(arg6.field4067 / 2 + var15 + arg2 - (arg0.field1636 / 2), arg3 - (arg0.field1633 / 2 + -(arg6.field4206 / 2) + var14), arg6.field4152, arg6.field4079);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method57(boolean arg0) {
        field169 = null;
        field178 = null;
        field167 = null;
        field173 = null;
        field182 = null;
        if (arg0) {
            field173 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)Leg;")
    public static final class37 method58(int arg0, boolean arg1, int arg2) {
        if (arg2 != 10) {
            field178 = null;
        }
        field168++;
        return class43.method282(arg0, 10, arg1, (byte) -61);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
    public static final void method59(int arg0) {
        field187++;
        int var1 = class180.field3002.method1211(class131.field2192);
        for (int var2 = 0; var2 < class159.field2661; var2++) {
            int var6 = class180.field3002.method1211(class132.method945(var2, 95));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class159.field2661 * 15 + 21;
        int var4 = class24.field353 - (var1 / 2);
        if (class249.field4479 < (var1 + var4)) {
            var4 = class249.field4479 - var1;
        }
        if (arg0 > -53) {
            method62(-127);
        }
        int var5 = class274.field4805;
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var3 + var5) > class199.field3390) {
            var5 = class199.field3390 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class265.field4655 != 1) {
            if (class24.field353 != class163.field2685 || class274.field4805 != class110.field1837) {
                class265.field4655 = 1;
                class233.field4030 = class110.field1837;
                class1.field12 = class163.field2685;
                return;
            }
            class160.field2676 = var4;
            class146.field2482 = class159.field2661 * 15 + 22;
            class265.field4655 = 0;
            class152.field2556 = true;
            class62.field1011 = var5;
            class137.field2348 = var1;
        } else if (class24.field353 == class1.field12 && class274.field4805 == class233.field4030) {
            class137.field2348 = var1;
            class62.field1011 = var5;
            class146.field2482 = class159.field2661 * 15 + 22;
            class152.field2556 = true;
            class160.field2676 = var4;
            class265.field4655 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    private final void method60(byte arg0) {
        field174++;
        this.field176 = new class140(this.field171.method991(-1));
        if (arg0 < -41) {
            for (class99 var2 = (class99) this.field171.method993(-15322); var2 != null; var2 = (class99) this.field171.method988(4586)) {
                class8 var3 = new class8(var2.field1533, (int) var2.field1027);
                this.field176.method986(var3, var2.field1533.method213(false), -1);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Z")
    public final boolean method61(int arg0, byte arg1) {
        if (arg1 < 55) {
            this.field183 = 39;
        }
        field180++;
        if (this.field171 == null) {
            return false;
        }
        if (this.field176 == null) {
            this.method63(-112);
        }
        class120 var3 = (class120) this.field176.method992((byte) 125, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public static final void method62(int arg0) {
        field185++;
        if (class79.field1223 == 0) {
            return;
        }
        try {
            if (++class35.field509 > 2000) {
                if (class187.field3190 != null) {
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                }
                if (class25.field354 >= 1) {
                    class235.field4056 = -5;
                    class79.field1223 = 0;
                    return;
                }
                class79.field1223 = 1;
                class25.field354++;
                if (class8.field134 == class26.field375) {
                    class26.field375 = class291.field5130;
                } else {
                    class26.field375 = class8.field134;
                }
                class35.field509 = 0;
            }
            if (class79.field1223 == 1) {
                class163.field2689 = class177.field2957.method1435(class48.field764, 111, class26.field375);
                class79.field1223 = 2;
            }
            if (~class79.field1223 == arg0) {
                if (class163.field2689.field4488 == 2) {
                    throw new IOException();
                }
                if (class163.field2689.field4488 != 1) {
                    return;
                }
                class187.field3190 = new class59((Socket) class163.field2689.field4483, class177.field2957);
                class163.field2689 = null;
                class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                if (class36.field529 != null) {
                    class36.field529.method933(-84);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-50);
                }
                int var1 = class187.field3190.method426((byte) 41);
                if (class36.field529 != null) {
                    class36.field529.method933(58);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-78);
                }
                if (var1 != 21) {
                    class79.field1223 = 0;
                    class235.field4056 = var1;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    return;
                }
                class79.field1223 = 3;
            }
            if (class79.field1223 == 3) {
                if (class187.field3190.method430(false) < 1) {
                    return;
                }
                class108.field1719 = new class37[class187.field3190.method426((byte) 41)];
                class79.field1223 = 4;
            }
            if (class79.field1223 == 4 && class187.field3190.method430(false) >= class108.field1719.length * 8) {
                class213.field3680.field3169 = 0;
                class187.field3190.method425(class108.field1719.length * 8, 3714, class213.field3680.field3175, 0);
                for (int var2 = 0; var2 < class108.field1719.length; var2++) {
                    class108.field1719[var2] = class35.method201(class213.field3680.method1295(43), 2);
                }
                class235.field4056 = 21;
                class79.field1223 = 0;
                class187.field3190.method419((byte) -66);
                class187.field3190 = null;
            }
        } catch (IOException var3) {
            if (class187.field3190 != null) {
                class187.field3190.method419((byte) -66);
                class187.field3190 = null;
            }
            if (class25.field354 < 1) {
                if (class8.field134 == class26.field375) {
                    class26.field375 = class291.field5130;
                } else {
                    class26.field375 = class8.field134;
                }
                class79.field1223 = 1;
                class35.field509 = 0;
                class25.field354++;
            } else {
                class235.field4056 = -4;
                class79.field1223 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
    private final void method63(int arg0) {
        this.field176 = new class140(this.field171.method991(-1));
        field170++;
        int var2 = -78 / ((arg0 + 55) / 57);
        for (class120 var3 = (class120) this.field171.method993(-15322); var3 != null; var3 = (class120) this.field171.method988(4586)) {
            class120 var4 = new class120((int) var3.field1027);
            this.field176.method986(var4, (long) var3.field2027, -1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLeg;)Z")
    public final boolean method64(byte arg0, class37 arg1) {
        field172++;
        if (this.field171 == null) {
            return false;
        }
        if (this.field176 == null) {
            this.method60((byte) -89);
        }
        class8 var3 = (class8) this.field176.method992((byte) 125, arg1.method213(false));
        if (arg0 != -44) {
            this.field171 = null;
        }
        while (var3 != null) {
            if (var3.field129.method223(arg1, (byte) 63)) {
                return true;
            }
            var3 = (class8) this.field176.method984(1);
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILva;)V")
    private final void method65(int arg0, int arg1, class187 arg2) {
        field189++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field183 = arg2.method1268(255);
        } else if (arg0 == 2) {
            this.field177 = arg2.method1268(255);
        } else if (arg0 == 3) {
            this.field179 = arg2.method1253(arg1 ^ 0x40);
        } else if (arg0 == 4) {
            this.field181 = arg2.method1290((byte) 90);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1244(false);
            this.field171 = new class140(class263.method1777(var4, (byte) 75));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1290((byte) 90);
                class62 var7;
                if (arg0 == 5) {
                    var7 = new class99(arg2.method1253(-125));
                } else {
                    var7 = new class120(arg2.method1290((byte) 90));
                }
                this.field171.method986(var7, (long) var6, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lva;I)V")
    public final void method66(class187 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                if (arg1 >= -63) {
                    this.method66((class187) null, -78);
                }
                field184++;
                return;
            }
            this.method65(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
    public final int method67(int arg0, int arg1) {
        field164++;
        if (this.field171 == null) {
            return this.field181;
        }
        class120 var3 = (class120) this.field171.method992((byte) 125, (long) arg0);
        if (arg1 != -1) {
            method59(93);
        }
        return var3 == null ? this.field181 : var3.field2027;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Leg;")
    public final class37 method68(int arg0, int arg1) {
        field175++;
        if (this.field171 == null) {
            return this.field179;
        }
        if (arg1 <= 30) {
            this.method61(36, (byte) -107);
        }
        class99 var3 = (class99) this.field171.method992((byte) 125, (long) arg0);
        return var3 == null ? this.field179 : var3.field1533;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)V")
    public static final void method69(int arg0, byte arg1) {
        if (arg0 == -1 && !class108.field1720) {
            class255.method1742((byte) 62);
        } else if (arg0 != -1 && (class137.field2344 != arg0 || !class152.method1044(0)) && class252.field4507 != 0 && !class108.field1720) {
            class239.method1637(class92.field1449, class252.field4507, arg0, 2, 124, 0, false);
        }
        field188++;
        if (arg1 < 18) {
            field173 = null;
        }
        class137.field2344 = arg0;
    }
}
