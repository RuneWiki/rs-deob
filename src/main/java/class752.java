import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class752 {

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "Lbaa;")
    private class130 field10362 = new class130(256);

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "Lbaa;")
    private class130 field10371 = new class130(256);

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "Luu;")
    private class237 field10367;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "Luu;")
    private class237 field10365;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([IIII)Lwo;", line = 5)
    private final class695 method4171(int[] arg0, int arg1, int arg2, int arg3) {
        field10368++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFFE) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class695 var9 = (class695) this.field10371.method812(103, var7);
        if (arg1 > -122) {
            method4175(-110);
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class448 var10 = class448.method2730(this.field10365, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class695 var11 = var10.method2731();
            this.field10371.method820(var7, (byte) -42, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field9688.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z[III)Lwo;", line = 40)
    private final class695 method4172(boolean arg0, int[] arg1, int arg2, int arg3) {
        field10363++;
        int var5 = ((arg3 & 0x40000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class695 var9 = (class695) this.field10371.method812(103, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 != null && arg1[0] <= 0) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class187 var10 = (class187) this.field10362.method812(126, var7);
            if (var10 == null) {
                var10 = class187.method1166(this.field10367, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field10362.method820(var7, (byte) -42, var10);
            }
            class695 var11 = var10.method1177(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method549(6410);
                this.field10371.method820(var7, (byte) -42, var11);
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB[I)Lwo;", line = 86)
    public final class695 method4173(int arg0, byte arg1, int[] arg2) {
        field10361++;
        if (this.field10367.method1584((byte) 56) == 1) {
            return this.method4172(false, arg2, arg0, 0);
        } else if (this.field10367.method1597(arg0, 0) == 1) {
            return this.method4172(false, arg2, 0, arg0);
        } else {
            if (arg1 <= 59) {
                field10360 = -98;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)Z", line = 116)
    public static final boolean method4174(int arg0, int arg1, int arg2) {
        if (arg1 <= 15) {
            field10372 = -26;
        }
        field10373++;
        return class617.method3490(arg2, arg0, 0) & class529.method3143(arg0, -59, arg2);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 130)
    public static final void method4175(int arg0) {
        field10370++;
        if (class383.field5501 == null) {
            class383.field5501 = class490.method2978((byte) 104);
            class712.field9957 = class383.field5501[0];
            class444.field6169 = class97.method664((byte) -50);
        }
        if (arg0 >= -77) {
            return;
        }
        if (class155.field2184 == null) {
            class227.method1339((byte) 47);
        }
        class490 var1 = class712.field9957;
        int var2 = class477.method2907(10);
        if (class712.field9957 == var1) {
            class415.field5877 = class712.field9957.field6863.method978(class120.field1576, (byte) -108);
            if (class712.field9957.field6867) {
                class638.field8566 = (class712.field9957.field6864 - class712.field9957.field6860) * var2 / 100 + class712.field9957.field6860;
            }
            if (class712.field9957.field6861) {
                class415.field5877 = class415.field5877 + class638.field8566 + "%";
            }
        } else if (class712.field9957 == class490.field6890) {
            class155.field2184 = null;
            class647.method3624(3, true);
        } else {
            class415.field5877 = var1.field6868.method978(class120.field1576, (byte) -123);
            if (class712.field9957.field6861) {
                class415.field5877 = class415.field5877 + var1.field6864 + "%";
            }
            class638.field8566 = var1.field6864;
            if (class712.field9957.field6867 || var1.field6867) {
                class444.field6169 = class97.method664((byte) -50);
            }
        }
        if (class155.field2184 == null) {
            return;
        }
        class155.field2184.method2778(1, class444.field6169, class415.field5877, class638.field8566, class712.field9957);
        if (class312.field4340 == null) {
            return;
        }
        for (int var3 = class130.field1817 + 1; var3 < class312.field4340.length; var3++) {
            if (class312.field4340[var3].method1226(-128) >= 100 && (var3 - 1) == class130.field1817 && class102.field1401 >= 1 && class155.field2184.method2779(1)) {
                try {
                    class312.field4340[var3].method1224(-19040);
                } catch (Exception var4) {
                    class312.field4340 = null;
                    return;
                }
                class155.field2184.method2768(class312.field4340[var3], 255);
                class130.field1817++;
                if (class312.field4340.length - 1 <= class130.field1817 && class312.field4340.length > 1) {
                    class130.field1817 = class73.field1100.method2953((byte) -64) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)V", line = 229)
    public static final void method4176(boolean arg0, int arg1) {
        class329.field4660 = -1;
        if (!arg0) {
            field10372 = -82;
        }
        class513.field7087 = arg1;
        field10366++;
        class609.field8207 = -1;
        class558.method3284(-1);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([IIB)Lwo;", line = 243)
    public final class695 method4177(int[] arg0, int arg1, byte arg2) {
        field10364++;
        if (this.field10365.method1584((byte) 98) == 1) {
            return this.method4171(arg0, -125, 0, arg1);
        }
        int var4 = -112 % ((-arg2 - 1) / 36);
        if (this.field10365.method1597(arg1, 0) != 1) {
            throw new RuntimeException();
        }
        return this.method4171(arg0, -124, arg1, 0);
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Luu;Luu;)V", line = 306)
    public class752(class237 arg0, class237 arg1) {
        this.field10367 = arg1;
        this.field10365 = arg0;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lida;Z)V", line = 268)
    public static final void method4178(class272 arg0, boolean arg1) {
        field10369++;
        arg0.method21(126);
        boolean var2 = arg1;
        for (class272 var3 = (class272) class176.field2411.method3828(111); var3 != null; var3 = (class272) class176.field2411.method3829(-29202)) {
            if (class312.method2045(var3.method1829((byte) 6), arg0.method1829((byte) 6), (byte) -110)) {
                class609.method3460(arg0, var3, false);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class176.field2411.method3827(82, arg0);
        }
    }
}
