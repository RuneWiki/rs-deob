import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 extends class64 {

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "[[I")
    public int[][] field625;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "[I")
    public int[] field634;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[Z")
    public boolean[] field637;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[I")
    public int[] field626;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field620 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field633 = 0;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field630 = 0;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
    public static boolean field621 = false;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field622 = Calendar.getInstance();

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "Lid;")
    public static class149 field636 = class60.method382("Schrifts-=tze geladen)3", (byte) 118);

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "Lal;")
    public static class230 field623;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Z")
    public static boolean field629;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIZII)V")
    public static final void method234(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return;
        }
        field632++;
        if (arg0 == arg5) {
            class1.method2(arg4, arg2, (byte) -76, arg1, arg5);
        } else if ((arg2 - arg5) >= class257.field4496 && class192.field3449 >= (arg2 + arg5) && class224.field3940 <= arg1 - arg0 && class94.field1655 >= arg0 + arg1) {
            class96.method702(arg4, arg2, arg5, arg0, arg1, 121);
        } else {
            class214.method1452(arg0, arg1, arg2, arg4, -50, arg5);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)I")
    public static final int method235(int arg0, int arg1, int arg2) {
        field624++;
        class19 var3 = (class19) class10.field135.method639((byte) -53, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg0; var5 < var3.field286.length; var5++) {
                if (var3.field290[var5] == arg2) {
                    var4 += var3.field286[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method236(byte arg0) {
        field622 = null;
        field623 = null;
        if (arg0 < 106) {
            field636 = null;
        }
        field636 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IZ)[I")
    public static final int[] method237(int[] arg0, boolean arg1) {
        field627++;
        if (arg0 == null) {
            return null;
        }
        if (arg1) {
            field636 = null;
        }
        int[] var2 = new int[arg0.length];
        class209.method1424(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I")
    public static int method238(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lqd;ZI)V")
    public static final void method239(class3 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field42;
        int var4 = (int) arg0.field1148;
        field635++;
        arg0.method401((byte) -118);
        if (arg1) {
            class231.method1565(var3, -556);
        }
        class8.method41(var3, arg2 ^ 0x3C6D);
        class47 var5 = class251.method1741((byte) 110, var4);
        if (var5 != null) {
            class182.method1267(var5, arg2 ^ 0x3C66);
        }
        int var6 = class60.field1092;
        if (arg2 != 15361) {
            method239((class3) null, false, -28);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class246.method1713(arg2 ^ 0x4D7B, class284.field5032[var7])) {
                class35.method205(var7, false);
            }
        }
        if (class60.field1092 == 1) {
            class32.field481 = false;
            class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
        } else {
            class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
            int var8 = class173.field3180.method1161(class198.field3603);
            for (int var9 = 0; var9 < class60.field1092; var9++) {
                int var10 = class173.field3180.method1161(class59.method365(var9, (byte) 102));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class82.field1499 = var8 + 8;
            client.field2845 = class60.field1092 * 15 + (class23.field324 ? 26 : 22);
        }
        if (class11.field161 != -1) {
            class275.method1901((byte) 77, class11.field161, 1);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[B)V")
    public class40(int arg0, byte[] arg1) {
        this.field631 = arg0;
        class74 var3 = new class74(arg1);
        this.field628 = var3.method489((byte) -122);
        this.field625 = new int[this.field628][];
        this.field634 = new int[this.field628];
        this.field637 = new boolean[this.field628];
        this.field626 = new int[this.field628];
        for (int var4 = 0; var4 < this.field628; var4++) {
            this.field634[var4] = var3.method489((byte) 127);
        }
        for (int var5 = 0; var5 < this.field628; var5++) {
            this.field637[var5] = var3.method489((byte) 93) == 1;
        }
        for (int var6 = 0; var6 < this.field628; var6++) {
            this.field626[var6] = var3.method485(-2386);
        }
        for (int var7 = 0; var7 < this.field628; var7++) {
            this.field625[var7] = new int[var3.method489((byte) -62)];
        }
        for (int var8 = 0; var8 < this.field628; var8++) {
            for (int var9 = 0; var9 < this.field625[var8].length; var9++) {
                this.field625[var8][var9] = var3.method489((byte) 111);
            }
        }
    }
}
