import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class54 {

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Lff;")
    private class7 field677 = new class7();

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
    public static String field674 = "purple:";

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Z")
    public static boolean field684 = false;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lff;")
    private class7 field683;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I")
    public final int method356(int arg0) {
        field673++;
        int var2 = arg0;
        for (class7 var3 = this.field677.field89; var3 != this.field677; var3 = var3.field89) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method357(byte arg0) {
        int var2 = -108 % ((arg0 + 8) / 35);
        field676++;
        while (true) {
            class7 var3 = this.field677.field89;
            if (this.field677 == var3) {
                this.field683 = null;
                return;
            }
            var3.method90((byte) -53);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Lff;")
    public final class7 method358(int arg0) {
        if (arg0 != 0) {
            method362(80);
        }
        field675++;
        class7 var2 = this.field677.field89;
        if (this.field677 == var2) {
            return null;
        } else {
            var2.method90((byte) -53);
            return var2;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILmo;Ljava/lang/String;Z)Lpe;")
    public static final class362 method359(int arg0, class447 arg1, String arg2, boolean arg3) {
        field679++;
        int var4 = -107 / ((3 - arg0) / 59);
        int var5 = arg1.method2791((byte) -67, arg2);
        if (var5 == -1) {
            return new class362(0);
        }
        int[] var6 = arg1.method2764(var5, (byte) -126);
        class362 var7 = new class362(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var7.field5531 > var8) {
                class186 var10 = new class186(arg1.method2771(var5, var6[var9++], 3));
                int var11 = var10.method1284(8388607);
                int var12 = var10.method1272((byte) -52);
                int var13 = var10.method1322(false);
                if (!arg3 && var13 == 1) {
                    var7.field5531--;
                } else {
                    var7.field5523[var8] = var11;
                    var7.field5522[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)Lcg;")
    public static final class71 method360(byte arg0, int arg1) {
        field685++;
        int var2 = 27 / ((arg0 + 72) / 34);
        class71 var3 = (class71) class357.field5457.method1660(2, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class381.field5766.method2771(19, arg1, 3);
        class71 var5 = new class71();
        if (var4 != null) {
            var5.method445((byte) 90, new class186(var4));
        }
        class357.field5457.method1655(false, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Lff;")
    public final class7 method361(int arg0) {
        field680++;
        if (arg0 < 19) {
            field684 = false;
        }
        class7 var2 = this.field683;
        if (this.field677 == var2) {
            this.field683 = null;
            return null;
        } else {
            this.field683 = var2.field89;
            return var2;
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public static void method362(int arg0) {
        field674 = null;
        if (arg0 != 0) {
            method360((byte) 50, -64);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLff;)V")
    public final void method363(boolean arg0, class7 arg1) {
        field682++;
        if (arg1.field90 != null) {
            arg1.method90((byte) -53);
        }
        arg1.field90 = this.field677.field90;
        arg1.field89 = this.field677;
        arg1.field90.field89 = arg1;
        if (!arg0) {
            this.field677 = null;
        }
        arg1.field89.field90 = arg1;
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)Lff;")
    public final class7 method364(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field681++;
        class7 var2 = this.field677.field89;
        if (this.field677 == var2) {
            this.field683 = null;
            return null;
        } else {
            this.field683 = var2.field89;
            return var2;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class54() {
        this.field677.field90 = this.field677;
        this.field677.field89 = this.field677;
    }
}
