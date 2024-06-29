import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class429 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lpm;")
    public class413 field6371 = new class413();

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lwi;")
    public static class340 field6373 = new class340(7, 0, 1, 1);

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lcm;")
    public static class449 field6382;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lpm;")
    private class413 field6377;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ljk;")
    public static class528 field6384;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "[I")
    public static int[] field6383;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
    public final int method2568(byte arg0) {
        if (arg0 != -68) {
            return 122;
        }
        field6374++;
        int var2 = 0;
        for (class413 var3 = this.field6371.field6211; var3 != this.field6371; var3 = var3.field6211) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method2569(int arg0) {
        field6382 = null;
        field6373 = null;
        field6384 = null;
        field6383 = null;
        if (arg0 != -28742) {
            field6383 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IC)Z")
    public static final boolean method2570(int arg0, char arg1) {
        field6379++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class92.method646(arg1, 123)) {
            return true;
        } else if (arg0 == 1) {
            char[] var2 = class32.field491;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class513.field7608;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLeq;)V")
    public static final void method2571(byte arg0, class253 arg1) {
        class527.field7780 = arg1;
        field6372++;
        int var2 = 74 % ((11 - arg0) / 63);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLpm;)V")
    public final void method2572(byte arg0, class413 arg1) {
        if (arg0 != -97) {
            method2569(-47);
        }
        if (arg1.field6208 != null) {
            arg1.method2509((byte) -19);
        }
        field6378++;
        arg1.field6211 = this.field6371;
        arg1.field6208 = this.field6371.field6208;
        arg1.field6208.field6211 = arg1;
        arg1.field6211.field6208 = arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lpm;")
    public final class413 method2573(boolean arg0) {
        field6376++;
        class413 var2 = this.field6371.field6211;
        if (!arg0) {
            field6382 = null;
        }
        if (this.field6371 == var2) {
            this.field6377 = null;
            return null;
        } else {
            this.field6377 = var2.field6211;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lpm;")
    public final class413 method2574(int arg0) {
        int var2 = -58 % ((-arg0 - 70) / 56);
        field6375++;
        class413 var3 = this.field6377;
        if (this.field6371 == var3) {
            this.field6377 = null;
            return null;
        } else {
            this.field6377 = var3.field6211;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class429() {
        this.field6371.field6211 = this.field6371;
        this.field6371.field6208 = this.field6371;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public final void method2575(int arg0) {
        field6380++;
        if (arg0 != -7870) {
            this.field6377 = null;
        }
        while (true) {
            class413 var2 = this.field6371.field6211;
            if (this.field6371 == var2) {
                this.field6377 = null;
                return;
            }
            var2.method2509((byte) -19);
        }
    }

    static {
        new class375(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6381 = 0;
        field6382 = new class449(46, 7);
    }
}
