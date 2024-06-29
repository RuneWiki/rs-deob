import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class114 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lrh;")
    private class69 field1414 = new class69();

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Luc;")
    private class58 field1418;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1410 = null;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Z")
    public static boolean field1416 = true;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1425 = null;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "B")
    public static byte field1417;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIZ)I")
    public static final int method604(int arg0, int arg1, int arg2, boolean arg3) {
        field1420++;
        if (!arg3) {
            return 67;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method605(byte arg0) {
        field1424++;
        int var2 = -81 / ((arg0 - 3) / 58);
        class110 var3 = (class110) this.field1418.method315((byte) -121);
        while (var3 != null) {
            Object var4 = var3.method568(0);
            if (var4 != null) {
                return var4;
            }
            class110 var5 = var3;
            var3 = (class110) this.field1418.method310(-74);
            var5.method1967(-1);
            var5.method1009((byte) 122);
            this.field1423++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public final void method606(byte arg0) {
        if (arg0 <= 68) {
            return;
        }
        for (class110 var2 = (class110) this.field1414.method399(124); var2 != null; var2 = (class110) this.field1414.method397(18244)) {
            if (var2.method569(false)) {
                var2.method1967(-1);
                var2.method1009((byte) 120);
                this.field1423++;
            }
        }
        field1422++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method607(int arg0) {
        field1415++;
        int var2 = 0;
        if (arg0 != 2040) {
            return -99;
        }
        for (class110 var3 = (class110) this.field1414.method399(124); var3 != null; var3 = (class110) this.field1414.method397(arg0 ^ 0x40BC)) {
            if (!var3.method569(false)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static final int method608(int arg0, int arg1) {
        return class116.field1450 == null ? 0 : class116.field1450[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method609(int arg0) {
        field1429++;
        class110 var2 = (class110) this.field1418.method310(arg0 ^ 0xFFFFFF90);
        if (arg0 != 0) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method568(0);
            if (var3 != null) {
                return var3;
            }
            class110 var4 = var2;
            var2 = (class110) this.field1418.method310(-75);
            var4.method1967(-1);
            var4.method1009((byte) 8);
            this.field1423++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JI)V")
    private final void method610(long arg0, int arg1) {
        field1413++;
        if (arg1 != -19498) {
            return;
        }
        class110 var4 = (class110) this.field1418.method308(arg0, (byte) -6);
        if (var4 != null) {
            var4.method1967(-1);
            var4.method1009((byte) -13);
            this.field1423++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
    public final int method611(int arg0) {
        if (arg0 == -1431) {
            field1428++;
            return this.field1423;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public static void method612(int arg0) {
        if (arg0 != 8261) {
            field1417 = 108;
        }
        field1410 = null;
        field1425 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method613(boolean arg0) {
        this.field1414.method391((byte) 114);
        field1421++;
        if (arg0) {
            this.field1418.method307((byte) 115);
            this.field1423 = this.field1419;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public final void method614(int arg0, int arg1) {
        if (class320.field4273 != null) {
            for (class110 var3 = (class110) this.field1414.method399(125); var3 != null; var3 = (class110) this.field1414.method397(18244)) {
                if (var3.method569(false)) {
                    if (var3.method568(0) == null) {
                        var3.method1967(-1);
                        var3.method1009((byte) 125);
                        this.field1423++;
                    }
                } else if ((long) arg1 < ++var3.field2365) {
                    class110 var4 = class320.field4273.method997((byte) 115, var3);
                    this.field1418.method314(var3.field4510, var4, 7079);
                    class235.method1273(var4, var3, 0);
                    var3.method1967(-1);
                    var3.method1009((byte) 124);
                }
            }
        }
        field1427++;
        if (arg0 > -117) {
            this.method607(-5);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BJLjava/lang/Object;)V")
    public final void method615(byte arg0, long arg1, Object arg2) {
        field1426++;
        this.method610(arg1, -19498);
        if (this.field1423 == 0) {
            class110 var5 = (class110) this.field1414.method398((byte) 38);
            var5.method1967(-1);
            var5.method1009((byte) -106);
        } else {
            this.field1423--;
        }
        class416 var6 = new class416(arg2);
        if (arg0 > -102) {
            method608(35, 119);
        }
        this.field1418.method314(arg1, var6, 7079);
        this.field1414.method393((byte) 81, var6);
        var6.field2365 = 0L;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method616(int arg0, long arg1) {
        field1412++;
        class110 var4 = (class110) this.field1418.method308(arg1, (byte) -108);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method568(0);
        if (var5 == null) {
            var4.method1967(-1);
            var4.method1009((byte) 121);
            this.field1423++;
            return null;
        }
        int var6 = 84 % ((arg0 - 62) / 54);
        if (var4.method569(false)) {
            class416 var7 = new class416(var5);
            this.field1418.method314(var4.field4510, var7, 7079);
            this.field1414.method393((byte) 127, var7);
            var7.field2365 = 0L;
            var4.method1967(-1);
            var4.method1009((byte) -56);
        } else {
            this.field1414.method393((byte) 115, var4);
            var4.field2365 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class114(int arg0) {
        this.field1419 = arg0;
        this.field1423 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1418 = new class58(var2);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)I")
    public final int method617(int arg0) {
        if (arg0 != 7165) {
            this.method615((byte) 52, 126L, (Object) null);
        }
        field1411++;
        return this.field1419;
    }
}
