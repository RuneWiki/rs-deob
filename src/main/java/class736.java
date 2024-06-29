import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class736 implements class219 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lgca;")
    private class209 field10294 = new class209(128);

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
    private int[] field10307 = new int[class410.field5694.field9048];

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public int[] field10302 = new int[class410.field5694.field9048];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field10292 = 0;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    public static int[] field10300 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lju;")
    public static class102 field10308 = new class102(49, 7);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static final void method4084(boolean arg0) {
        field10299++;
        if (class425.field5891 != null) {
            for (int var1 = 0; var1 < class679.field9573; var1++) {
                class425.field5891[var1] = null;
            }
            class425.field5891 = null;
        }
        if (class565.field8029 != null) {
            for (int var2 = 0; var2 < class163.field2248; var2++) {
                class565.field8029[var2] = null;
            }
            class565.field8029 = null;
        }
        if (class78.field1059 != null) {
            for (int var3 = 0; var3 < class290.field3802; var3++) {
                class78.field1059[var3] = null;
            }
            class78.field1059 = null;
        }
        class690.field9668 = -1;
        class102.field1460 = -1;
        if (!arg0) {
            field10300 = null;
        }
        class313.field4023 = null;
        class573.field8104 = null;
        class185.field2719 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[Lpaa;I)V")
    public static final void method4085(int arg0, class712[] arg1, int arg2) {
        field10291++;
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class712 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field10039 == 0) {
                    if (var4.field9981 != null) {
                        method4085(arg0, var4.field9981, arg2);
                    }
                    class14 var5 = (class14) class426.field5894.method1381(true, (long) var4.field9998);
                    if (var5 != null) {
                        class217.method1420(var5.field194, arg0, -6248);
                    }
                }
                if (arg0 == 0 && var4.field9950 != null) {
                    class700 var6 = new class700();
                    var6.field9745 = var4;
                    var6.field9757 = var4.field9950;
                    class318.method1840(var6);
                }
                if (arg0 == 1 && var4.field10000 != null) {
                    if (var4.field10026 >= 0) {
                        class712 var7 = class733.method4073(true, var4.field9998);
                        if (var7 == null || var7.field9981 == null || var7.field9981.length <= var4.field10026 || var7.field9981[var4.field10026] != var4) {
                            continue;
                        }
                    }
                    class700 var8 = new class700();
                    var8.field9745 = var4;
                    var8.field9757 = var4.field10000;
                    class318.method1840(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
    public final void method4086(byte arg0, int arg1, int arg2) {
        this.field10307[arg2] = arg1;
        if (arg0 <= 13) {
            field10292 = 39;
        }
        field10306++;
        class60 var4 = (class60) this.field10294.method1381(true, (long) arg2);
        if (var4 == null) {
            class60 var5 = new class60(4611686018427387905L);
            this.field10294.method1387(var5, (long) arg2, (byte) -108);
        } else if (var4.field822 != 4611686018427387905L) {
            var4.field822 = class224.method1457((byte) -62) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
    public final void method4087(int arg0, byte arg1, int arg2) {
        if (arg1 != -3) {
            this.field10307 = null;
        }
        this.field10302[arg0] = arg2;
        field10296++;
        class60 var4 = (class60) this.field10294.method1381(true, (long) arg0);
        if (var4 == null) {
            class60 var5 = new class60(class224.method1457((byte) -62) + 500L);
            this.field10294.method1387(var5, (long) arg0, (byte) -113);
        } else {
            var4.field822 = class224.method1457((byte) -62) + 500L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BZI)V")
    public static final void method4088(byte arg0, boolean arg1, int arg2) {
        if (arg0 == 122) {
            class118.method774(-25484, arg2, arg1, class138.field1848.method891(-2041650704, class369.field4721));
            field10304++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public final void method4089(int arg0, int arg1, int arg2) {
        field10303++;
        class494 var4 = class62.field836.method1662(arg2, -29158);
        int var5 = var4.field6941;
        int var6 = var4.field6936;
        int var7 = var4.field6944;
        int var8 = class375.field5208[var7 - var6];
        if (arg0 >= -9) {
            return;
        }
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method4087(var5, (byte) -3, arg1 << var6 & var9 | ~var9 & this.field10302[var5]);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)I")
    public final int method1434(int arg0, byte arg1) {
        field10301++;
        return arg1 == 94 ? this.field10302[arg0] : -56;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
    public final void method4090(int arg0, int arg1, int arg2) {
        field10298++;
        class494 var4 = class62.field836.method1662(arg1, -29158);
        int var5 = var4.field6941;
        int var6 = var4.field6936;
        int var7 = var4.field6944;
        int var8 = class375.field5208[var7 - var6];
        if (arg0 > arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method4086((byte) 39, arg2 << var6 & var9 | this.field10307[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)I")
    public final int method1433(byte arg0, int arg1) {
        field10295++;
        class494 var3 = class62.field836.method1662(arg1, -29158);
        if (arg0 > -62) {
            return -24;
        }
        int var4 = var3.field6941;
        int var5 = var3.field6936;
        int var6 = var3.field6944;
        int var7 = class375.field5208[var6 - var5];
        return var7 & this.field10302[var4] >> var5;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method4091(int arg0) {
        field10300 = null;
        field10308 = null;
        if (arg0 <= 39) {
            field10300 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)I")
    public final int method4092(int arg0, boolean arg1) {
        field10305++;
        long var3 = class224.method1457((byte) -62);
        if (arg0 != -1) {
            return 50;
        }
        for (class60 var5 = arg1 ? (class60) this.field10294.method1382(27901) : (class60) this.field10294.method1383(false); var5 != null; var5 = (class60) this.field10294.method1383(false)) {
            if ((var5.field822 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field822 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7166;
                    this.field10302[var6] = this.field10307[var6];
                    var5.method3065(arg0 ^ 0x43D2);
                    return var6;
                }
                var5.method3065(-17363);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public final void method4093(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < class410.field5694.field9048; var2++) {
            class54 var3 = class410.field5694.method3706(115, var2);
            if (var3 != null && var3.field751 == 0) {
                this.field10307[var2] = 0;
                this.field10302[var2] = 0;
            }
        }
        field10293++;
        this.field10294 = new class209(128);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Z")
    public static final boolean method4094(int arg0, int arg1, int arg2) {
        field10297++;
        if (arg1 <= 69) {
            field10300 = null;
        }
        return class471.method2804(arg0, (byte) -97, arg2) || class424.method2582(arg0, arg2, 0);
    }
}
