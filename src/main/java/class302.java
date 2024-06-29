import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class302 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lqm;")
    private class262 field4490 = null;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field4491 = 65000;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lqm;")
    private class262 field4492 = null;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    private int field4489;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
    public static int[] field4494 = new int[50];

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lo;")
    public static class332 field4500;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[B")
    public static byte[] field4503;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Ltr;")
    public static class229 field4499;

    static {
        new class332("Select", "Auswählen", "Sélectionner", "Selecionar");
        field4501 = 0;
        field4500 = new class332("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field4503 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field4495++;
        return "Cache:" + this.field4489;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)[B", line = 13)
    public final byte[] method1879(boolean arg0, int arg1) {
        field4502++;
        class262 var3 = this.field4492;
        synchronized (this.field4492) {
            try {
                if (this.field4490.method1720(103) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4490.method1729((byte) 118, (long) (arg1 * 6));
                this.field4490.method1728(0, 6, class385.field5693, -123);
                int var5 = ((class385.field5693[0] & 0xFF) << 16) + (class385.field5693[1] & 0xFF << 8) + (class385.field5693[2] & 0xFF);
                int var6 = (class385.field5693[4] & 0xFF << 8) + (class385.field5693[3] & 0xFF << 16) + (class385.field5693[5] & 0xFF);
                if (var5 < 0 || var5 > this.field4491) {
                    return null;
                } else if (var6 > 0 && (this.field4492.method1720(89) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg0) {
                        return null;
                    }
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4492.method1729((byte) 118, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4492.method1728(0, var14 + 8, class385.field5693, -81);
                        int var15 = (class385.field5693[0] & 0xFF << 8) + (class385.field5693[1] & 0xFF);
                        int var16 = ((class385.field5693[2] & 0xFF) << 8) + (class385.field5693[3] & 0xFF);
                        int var17 = (class385.field5693[6] & 0xFF) + ((class385.field5693[5] & 0xFF) << 8) + ((class385.field5693[4] & 0xFF) << 16);
                        int var18 = class385.field5693[7] & 0xFF;
                        if (arg1 == var15 && var11 == var16 && this.field4489 == var18) {
                            if (var17 >= 0 && this.field4492.method1720(115) / 520L >= (long) var17) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class385.field5693[var21 + 8];
                                }
                                var6 = var17;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILtq;)V", line = 100)
    public static final void method1880(int arg0, class63 arg1) {
        field4498++;
        int var2 = class432.field6144;
        int var3 = class99.field1414;
        int var4 = class330.field4935;
        int var5 = class450.field6355 - 3;
        byte var6 = 20;
        if (class465.field6548 == null || class464.field6547 == null) {
            if (class425.field6075.method2672(class94.field1311, arg0 ^ 0xFFFFE9EE) && class425.field6075.method2672(class227.field3327, 23775)) {
                class465.field6548 = arg1.method547(class368.method2265(class425.field6075, class94.field1311, 0), true);
                class368 var7 = class368.method2265(class425.field6075, class227.field3327, 0);
                class464.field6547 = arg1.method547(var7, true);
                var7.method2264();
                class219.field3233 = arg1.method547(var7, true);
            } else {
                arg1.method508(var2, var3, var4, var6, 255 - class147.field2073 << 24 | class20.field257, 1);
            }
        }
        if (class465.field6548 != null && class464.field6547 != null) {
            int var8 = (var4 - class464.field6547.method798() * 2) / class465.field6548.method798();
            for (int var9 = 0; var9 < var8; var9++) {
                class465.field6548.method1958(var2 + class464.field6547.method798() + class465.field6548.method798() * var9, var3);
            }
            class464.field6547.method1958(var2, var3);
            class219.field3233.method1958(var2 + var4 - class219.field3233.method798(), var3);
        }
        class462.field6513.method1497(-1, class473.field6624.method2036(class4.field85, (byte) -21), var2 + 3, (byte) -46, class473.field6631 | 0xFF000000, var3 + 14);
        arg1.method508(var2, var3 + var6, var4, var5 - var6, -class147.field2073 + 255 << 24 | class20.field257, 1);
        int var10 = class78.field1105.method1975(arg0 ^ 0xFFFFB564);
        int var11 = class78.field1105.method1984((byte) -124);
        int var12 = 0;
        if (arg0 != -19151) {
            method1884(true);
        }
        for (class146 var13 = (class146) class451.field6377.method2456(arg0 + 51252); var13 != null; var13 = (class146) class451.field6377.method2461(301)) {
            int var30 = (class186.field2817 - (var12 + 1)) * 16 + var3 + var6 + 13;
            var12++;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > var30 - 13 && var11 < var30 + 4 && var13.field2059) {
                arg1.method508(var2, var30 - 12, var4, 16, class441.field6234 | 255 - class257.field3820 << 24, 1);
            }
        }
        if ((class355.field5384 == null || class156.field2175 == null || class442.field6239 == null) && class425.field6075.method2672(class307.field4581, 23775) && class425.field6075.method2672(class132.field1835, arg0 + 42926) && class425.field6075.method2672(class45.field634, 23775)) {
            class368 var14 = class368.method2265(class425.field6075, class132.field1835, 0);
            class156.field2175 = arg1.method547(var14, true);
            var14.method2264();
            class110.field1563 = arg1.method547(var14, true);
            class355.field5384 = arg1.method547(class368.method2265(class425.field6075, class307.field4581, 0), true);
            class368 var15 = class368.method2265(class425.field6075, class45.field634, 0);
            class442.field6239 = arg1.method547(var15, true);
            var15.method2264();
            class365.field5519 = arg1.method547(var15, true);
        }
        if (class355.field5384 != null && class156.field2175 != null && class442.field6239 != null) {
            int var16 = (var4 - (class442.field6239.method798() * 2)) / class355.field5384.method798();
            for (int var17 = 0; var17 < var16; var17++) {
                class355.field5384.method1958(var2 + class442.field6239.method798() + class355.field5384.method798() * var17, var5 + var3 + -class355.field5384.method796());
            }
            int var18 = (var5 + (-var6 - class442.field6239.method796())) / class156.field2175.method796();
            for (int var19 = 0; var19 < var18; var19++) {
                class156.field2175.method1958(var2, class156.field2175.method796() * var19 + var3 + var6);
                class110.field1563.method1958(var4 + var2 - class110.field1563.method798(), var3 + (var6 - -(class156.field2175.method796() * var19)));
            }
            class442.field6239.method1958(var2, var3 + var5 - class442.field6239.method796());
            class365.field5519.method1958(var4 + var2 - class442.field6239.method798(), var3 + var5 + -class442.field6239.method796());
        }
        int var20 = 0;
        for (class146 var21 = (class146) class451.field6377.method2456(32101); var21 != null; var21 = (class146) class451.field6377.method2461(301)) {
            int var22 = (class186.field2817 - (var20 + 1)) * 16 + (var3 + var6 + 13);
            int var23 = class473.field6631 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > (var22 - 13) && var11 < var22 + 4 && var21.field2059) {
                var23 = class425.field6080 | 0xFF000000;
            }
            int[] var24 = null;
            if (class9.method104(var21.field2056, arg0 + 19151)) {
                var24 = class23.field309.method2364((byte) 118, (int) var21.field2066).field2795;
            } else if (var21.field2057 != -1) {
                var24 = class23.field309.method2364((byte) 118, var21.field2057).field2795;
            } else if (class120.method851((byte) -111, var21.field2056)) {
                class349 var25 = class18.field241[(int) var21.field2066];
                if (var25 != null) {
                    class273 var26 = var25.field5309;
                    if (var26.field4107 != null) {
                        var26 = var26.method1781(class315.field4736, true);
                    }
                    if (var26 != null) {
                        var24 = var26.field4142;
                    }
                }
            } else if (class450.method2656(1008, var21.field2056)) {
                Object var27 = null;
                class271 var28;
                if (var21.field2056 == 1008) {
                    var28 = class206.field3124.method338((byte) 117, (int) var21.field2066);
                } else {
                    var28 = class206.field3124.method338((byte) 123, (int) (var21.field2066 >>> 32 & 0x7FFFFFFFL));
                }
                if (var28.field4015 != null) {
                    var28 = var28.method1759(class315.field4736, true);
                }
                if (var28 != null) {
                    var24 = var28.field4029;
                }
            }
            String var29 = class340.method2087(false, var21);
            if (var24 != null) {
                var29 = var29 + class220.method1450(-1, var24);
            }
            class462.field6513.method1504(var29, 0, var2 + 3, var22, -110, var23, class288.field4395, class163.field2265);
            if (var21.field2060) {
                class45.field636.method1958(var2 + class131.field1828.method3(var29, (byte) 92) + 5, var22 + -12);
            }
            var20++;
        }
        class237.method1541(class432.field6144, class450.field6355, class330.field4935, 0, class99.field1414);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILqm;Lqm;I)V", line = 510)
    public class302(int arg0, class262 arg1, class262 arg2, int arg3) {
        this.field4492 = arg1;
        this.field4490 = arg2;
        this.field4491 = arg3;
        this.field4489 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BIZB)Z", line = 316)
    private final boolean method1881(int arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        field4493++;
        class262 var6 = this.field4492;
        synchronized (this.field4492) {
            try {
                int var7 = -34 % ((51 - arg4) / 49);
                int var9;
                if (arg3) {
                    if (this.field4490.method1720(107) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field4490.method1729((byte) 118, (long) (arg0 * 6));
                    this.field4490.method1728(0, 6, class385.field5693, -107);
                    var9 = (class385.field5693[5] & 0xFF) + ((class385.field5693[4] & 0xFF) << 8) + ((class385.field5693[3] & 0xFF) << 16);
                    if (var9 <= 0 || (long) var9 > this.field4492.method1720(85) / 520L) {
                        return false;
                    }
                } else {
                    var9 = (int) ((this.field4492.method1720(85) + 519L) / 520L);
                    if (var9 == 0) {
                        var9 = 1;
                    }
                }
                class385.field5693[0] = (byte) (arg2 >> 16);
                class385.field5693[1] = (byte) (arg2 >> 8);
                class385.field5693[5] = (byte) var9;
                class385.field5693[4] = (byte) (var9 >> 8);
                class385.field5693[2] = (byte) arg2;
                class385.field5693[3] = (byte) (var9 >> 16);
                this.field4490.method1729((byte) -82, (long) (arg0 * 6));
                this.field4490.method1721((byte) -3, 6, class385.field5693, 0);
                int var11 = 0;
                int var12 = 0;
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label104: {
                            this.field4492.method1729((byte) -21, (long) (var9 * 520));
                            try {
                                this.field4492.method1728(0, 8, class385.field5693, -106);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = (class385.field5693[0] & 0xFF << 8) + (class385.field5693[1] & 0xFF);
                            var13 = (class385.field5693[6] & 0xFF) + ((class385.field5693[5] & 0xFF) << 8) + (class385.field5693[4] & 0xFF << 16);
                            int var15 = ((class385.field5693[2] & 0xFF) << 8) + (class385.field5693[3] & 0xFF);
                            int var16 = class385.field5693[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field4489 == var16) {
                                if (var13 >= 0 && (this.field4492.method1720(87) / 520L) >= ((long) var13)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field4492.method1720(82) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var9 == var13) {
                            var13++;
                        }
                    }
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class385.field5693[3] = (byte) var12;
                    class385.field5693[2] = (byte) (var12 >> 8);
                    class385.field5693[0] = (byte) (arg0 >> 8);
                    class385.field5693[1] = (byte) arg0;
                    class385.field5693[5] = (byte) (var13 >> 8);
                    class385.field5693[4] = (byte) (var13 >> 16);
                    class385.field5693[6] = (byte) var13;
                    class385.field5693[7] = (byte) this.field4489;
                    this.field4492.method1729((byte) 113, (long) (var9 * 520));
                    this.field4492.method1721((byte) -3, 8, class385.field5693, 0);
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4492.method1721((byte) -3, var19, arg1, var11);
                    var12++;
                    var11 += var19;
                    var9 = var13;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BZI)Z", line = 434)
    public final boolean method1882(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field4496++;
        if (arg2) {
            return false;
        }
        class262 var5 = this.field4492;
        synchronized (this.field4492) {
            if (arg3 < 0 || this.field4491 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1881(arg0, arg1, arg3, true, (byte) -79);
            if (!var6) {
                var6 = this.method1881(arg0, arg1, arg3, false, (byte) -34);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 461)
    public static final void method1883(byte arg0) {
        if (arg0 == -119) {
            class175.method1200();
            field4497++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 495)
    public static void method1884(boolean arg0) {
        field4500 = null;
        field4494 = null;
        if (!arg0) {
            field4503 = null;
            field4499 = null;
        }
    }
}
