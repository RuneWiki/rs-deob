import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class369 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lqc;")
    private class325 field5331 = new class325(64);

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "Lqc;")
    public class325 field5340 = new class325(30);

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Ldda;")
    private class597 field5336;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ldda;")
    public class597 field5339;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lqc;")
    public static class325 field5335;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
    public static boolean field5337;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Lica;")
    public static class205 field5338;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "F")
    public static float field5332;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public int field5341;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Lrv;")
    public static class287 field5329;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)I")
    public static final int method2248(int arg0, int arg1, int arg2, int arg3) {
        field5333++;
        if (arg2 >= -86) {
            return 34;
        } else {
            int var4 = ((arg0 & 0xFF00) * arg3 & 0xFF0000 | (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg3;
            return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(CII)I")
    public static final int method2249(char arg0, int arg1, int arg2) {
        field5326++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return arg2 <= 97 ? -37 : var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
    public final void method2250(byte arg0, int arg1) {
        field5334++;
        this.field5341 = arg1;
        class325 var3 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.method2037(true);
            if (arg0 > -87) {
                this.field5336 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)Lpp;")
    public final class465 method2251(int arg0, boolean arg1) {
        field5325++;
        class325 var3 = this.field5331;
        class465 var4;
        synchronized (this.field5331) {
            var4 = (class465) this.field5331.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field5336;
        byte[] var6;
        synchronized (this.field5336) {
            var6 = this.field5336.method3486((byte) -100, class119.method732(17225, arg0), class538.method3162(-11412, arg0));
        }
        if (arg1) {
            this.method2252(-72, 86);
        }
        class465 var7 = new class465();
        var7.field6710 = this;
        var7.field6709 = arg0;
        if (var6 != null) {
            var7.method2762((byte) 127, new class428(var6));
        }
        class325 var8 = this.field5331;
        synchronized (this.field5331) {
            this.field5331.method2029(arg1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
    public final void method2252(int arg0, int arg1) {
        class325 var3 = this.field5331;
        synchronized (this.field5331) {
            this.field5331.method2028(arg0, true);
            if (arg1 != 65280) {
                method2248(-51, 2, -8, 54);
            }
        }
        field5330++;
        class325 var4 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.method2028(arg0, true);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method2253(int arg0) {
        field5329 = null;
        field5335 = null;
        if (arg0 != -8529) {
            method2248(36, -115, 6, 67);
        }
        field5338 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method2254(int arg0) {
        field5327++;
        if (arg0 != 255) {
            return;
        }
        class325 var2 = this.field5331;
        synchronized (this.field5331) {
            this.field5331.method2024((byte) -114);
        }
        class325 var3 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.method2024((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public final void method2255(int arg0) {
        if (arg0 != 16711935) {
            this.field5339 = null;
        }
        class325 var2 = this.field5331;
        synchronized (this.field5331) {
            this.field5331.method2037(true);
        }
        field5328++;
        class325 var3 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.method2037(true);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Loda;ILdda;Ldda;)V")
    public class369(class559 arg0, int arg1, class597 arg2, class597 arg3) {
        this.field5336 = arg2;
        this.field5339 = arg3;
        int var5 = this.field5336.method3477(false) - 1;
        this.field5336.method3462(var5, 120);
    }

    static {
        new class487("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field5335 = new class325(20);
        field5337 = false;
        field5338 = new class205(16);
    }
}
