import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class76 {

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "Ltm;")
    private class392 field922 = new class392();

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "Lns;")
    private class406 field930 = new class406();

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "Lwr;")
    private class459 field934;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "Lhda;")
    public static class750 field925 = new class750(0, 1);

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "[Llw;")
    public static class660[] field932 = new class660[37];

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "F")
    public static float field933;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILjn;B)Z")
    public static final boolean method560(int arg0, int arg1, int arg2, class719 arg3, byte arg4) {
        field921++;
        int var5 = 7 / ((55 - arg4) / 51);
        if (!class314.field4236 || !class232.field2988) {
            return false;
        } else if (class51.field536 < 100) {
            return false;
        } else if (class161.method954((byte) -78, arg0, arg2, arg1)) {
            int var6 = arg1 << class443.field6172;
            int var7 = arg2 << class443.field6172;
            int var8 = class25.field188[arg0].method1685(arg2, -12639, arg1) - 1;
            int var9 = var8 + arg3.method132(0);
            if (arg3.field10064 == 1) {
                if (!class563.method3171(var9, var6, var7, (byte) 82, var8, class601.field8373 + var7, var9, var7, var6, var6)) {
                    return false;
                } else if (class563.method3171(var9, var6, var7, (byte) 82, var8, class601.field8373 + var7, var8, class601.field8373 + var7, var6, var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 2) {
                if (!class563.method3171(var9, var6, class601.field8373 + var7, (byte) 82, var8, class601.field8373 + var7, var9, class601.field8373 + var7, var6 - -class601.field8373, var6)) {
                    return false;
                } else if (class563.method3171(var8, class601.field8373 + var6, class601.field8373 + var7, (byte) 82, var8, class601.field8373 + var7, var9, var7 + class601.field8373, var6 - -class601.field8373, var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 4) {
                if (!class563.method3171(var9, var6 + class601.field8373, var7, (byte) 82, var8, class601.field8373 + var7, var9, var7, class601.field8373 + var6, class601.field8373 + var6)) {
                    return false;
                } else if (class563.method3171(var9, class601.field8373 + var6, var7, (byte) 82, var8, class601.field8373 + var7, var8, class601.field8373 + var7, var6 - -class601.field8373, class601.field8373 + var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 8) {
                if (!class563.method3171(var9, var6, var7, (byte) 82, var8, var7, var9, var7, class601.field8373 + var6, var6)) {
                    return false;
                } else if (class563.method3171(var8, class601.field8373 + var6, var7, (byte) 82, var8, var7, var9, var7, class601.field8373 + var6, var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 16) {
                if (class257.method1531(var8, class522.field7044, var9, class522.field7044, (byte) 16, class522.field7044 + var7, var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 32) {
                if (class257.method1531(var8, class522.field7044, var9, class522.field7044, (byte) 16, var7 + class522.field7044, class522.field7044 + var6)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 == 64) {
                if (class257.method1531(var8, class522.field7044, var9, class522.field7044, (byte) 16, var7, var6 + class522.field7044)) {
                    class426.field6010++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field10064 != 128) {
                return true;
            } else if (class257.method1531(var8, class522.field7044, var9, class522.field7044, (byte) 16, var7, var6)) {
                class426.field6010++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(JB)V")
    public final void method561(long arg0, byte arg1) {
        field927++;
        class392 var4 = (class392) this.field934.method2552(arg0, -1);
        int var5 = 88 / ((-arg1 - 13) / 35);
        if (var4 != null) {
            var4.method315(98);
            var4.method2287((byte) -90);
            this.field931++;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public final void method562(int arg0) {
        field923++;
        this.field930.method2342(16711680);
        if (arg0 == 1) {
            this.field934.method2556(-84);
            this.field922 = new class392();
            this.field931 = this.field928;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
    public static void method563(int arg0) {
        field932 = null;
        if (arg0 != -9) {
            method563(-108);
        }
        field925 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)V")
    public static final void method564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 64) {
            method560(-20, 71, 72, null, (byte) 127);
        }
        field929++;
        if (arg0 != 8 && arg0 != 16) {
            class624 var5 = class77.field947[arg1][arg2][arg3];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field8739 = 0;
                } else if (arg0 == 2) {
                    var5.field8732 = 0;
                }
            }
            class112.method753(arg4 - 107);
            return;
        }
        for (int var6 = 0; var6 < class60.field631; var6++) {
            class620 var7 = class393.field5575[var6];
            if (var7.field8696 == arg0 && var7.field8688 == arg2 && var7.field8691 == arg3 || var7.field8697 == arg2 && var7.field8691 == arg3) {
                if (class60.field631 != var6) {
                    class373.method2192(class393.field5575, var6 + 1, class393.field5575, var6, class393.field5575.length - (var6 + 1));
                }
                class60.field631--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)Llha;")
    public static final class624 method565(int arg0, int arg1, int arg2) {
        if (class77.field947[arg0][arg1][arg2] == null) {
            boolean var3 = class77.field947[0][arg1][arg2] != null && class77.field947[0][arg1][arg2].field8734 != null;
            if (var3 && arg0 >= class307.field4170 - 1) {
                return null;
            }
            class689.method3896(arg0, arg1, arg2);
        }
        return class77.field947[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BJ)Ltm;")
    public final class392 method566(byte arg0, long arg1) {
        field926++;
        class392 var4 = (class392) this.field934.method2552(arg1, -1);
        int var5 = 84 / ((arg0 - 71) / 35);
        if (var4 != null) {
            this.field930.method2341(var4, -54);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILtm;J)V")
    public final void method567(int arg0, class392 arg1, long arg2) {
        if (this.field931 == 0) {
            class392 var5 = this.field930.method2345(-16711936);
            var5.method315(arg0 - 26312);
            var5.method2287((byte) -90);
            if (this.field922 == var5) {
                class392 var6 = this.field930.method2345(-16711936);
                var6.method315(116);
                var6.method2287((byte) -90);
            }
        } else {
            this.field931--;
        }
        field924++;
        this.field934.method2558(arg1, arg2, arg0 - 26405);
        this.field930.method2341(arg1, -101);
        if (arg0 != 26404) {
            method560(-123, -119, 55, null, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
    public class76(int arg0) {
        this.field931 = arg0;
        this.field928 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field934 = new class459(var2);
    }
}
