import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class40 extends class53 {

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Lwa;")
    public static class75 field623 = class66.method560("Spielwelt erstellt)3", false);

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lwa;")
    private static class75 field630 = class66.method560("Connecting to update server", false);

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lwa;")
    public static class75 field625 = field630;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "J")
    public static long field633 = 0L;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 14)
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lwc;B)V", line = 24)
    public static final void method275(class96 arg0, byte arg1) {
        if (arg1 != -34) {
            method278((class262[]) null, 69, -92);
        }
        class290 var2 = (class290) class2.field18.method1007(arg0.field1561.method630(arg1 - 29), -17004);
        field622++;
        if (var2 == null) {
            class76.method664(class67.field1174, false, arg0, arg0.field3236[0], 0, arg0.field3205[0], (class108) null, (class295) null);
        } else {
            var2.method2025(18792);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 46)
    public static void method276(boolean arg0) {
        field625 = null;
        field623 = null;
        if (!arg0) {
            method276(false);
        }
        field630 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILja;Z)V", line = 61)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field629++;
        if (arg0 == 0) {
            this.field880 = arg1.method501(0) == 1;
        }
        if (!arg2) {
            method278((class262[]) null, 92, -90);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I", line = 83)
    public final int[] method59(int arg0, int arg1) {
        field631++;
        if (arg0 != -15196) {
            field630 = (class75) null;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 116);
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V", line = 117)
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1723) {
            return;
        }
        class76.field1320 = class39.field589 * arg1 / arg3;
        class104.field1774 = -1;
        class215.field3666 = class215.field3668 * arg2 / arg0;
        class167.field2813 = -1;
        field626++;
        class3.method15(8887);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[[I", line = 136)
    public final int[][] method66(int arg0, int arg1) {
        field627++;
        int var3 = 48 / ((arg1 - 76) / 42);
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(104, 0, arg0);
            int[] var6 = var5[2];
            int[] var7 = var5[1];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            for (int var12 = 0; var12 < class269.field4644; var12++) {
                var10[var12] = 4096 - var11[var12];
                var8[var12] = 4096 - var7[var12];
                var9[var12] = 4096 - var6[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lre;II)V", line = 179)
    public static final void method278(class262[] arg0, int arg1, int arg2) {
        field632++;
        if (arg1 != -2) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class262 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4441 == 0) {
                    if (var4.field4532 != null) {
                        method278(var4.field4532, arg1 ^ 0x0, arg2);
                    }
                    class93 var5 = (class93) class73.field1224.method1007((long) var4.field4418, -17004);
                    if (var5 != null) {
                        class176.method1296(28, arg2, var5.field1518);
                    }
                }
                if (arg2 == 0 && var4.field4533 != null) {
                    class24 var6 = new class24();
                    var6.field301 = var4;
                    var6.field302 = var4.field4533;
                    class204.method1515(var6, (byte) 9);
                }
                if (arg2 == 1 && var4.field4514 != null) {
                    if (var4.field4382 >= 0) {
                        class262 var7 = class51.method374(99, var4.field4418);
                        if (var7 == null || var7.field4532 == null || var4.field4382 >= var7.field4532.length || var7.field4532[var4.field4382] != var4) {
                            continue;
                        }
                    }
                    class24 var8 = new class24();
                    var8.field302 = var4.field4514;
                    var8.field301 = var4;
                    class204.method1515(var8, (byte) 9);
                }
            }
        }
    }
}
