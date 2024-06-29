import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class260 {

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lpca;")
    private class653 field3305 = new class653(64);

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "Ljo;")
    private class303 field3309;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "Z")
    public static boolean field3303 = true;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "[B")
    public static byte[] field3310 = new byte[520];

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lida;")
    public static class215 field3304 = new class215();

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lpr;")
    public static class407 field3314 = new class407(93, 7);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "[I")
    public static int[] field3312;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public static final void method1476(byte arg0) {
        field3306++;
        int var1 = -8 % ((arg0 - 23) / 39);
        for (class595 var2 = (class595) class454.field6292.method3174((byte) 49); var2 != null; var2 = (class595) class454.field6292.method3168(false)) {
            if (var2.field8439 == -1) {
                var2.field8438 = 0;
                if (var2.field8445 >= 0 && var2.field8448 >= 0 && var2.field8445 < class399.field5338 && var2.field8448 < class349.field4567) {
                    class517.method2949((byte) 75, var2);
                }
            } else {
                var2.method1519((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
    public final void method1477(byte arg0) {
        class653 var2 = this.field3305;
        synchronized (this.field3305) {
            this.field3305.method3687((byte) -10);
        }
        field3302++;
        if (arg0 != -14) {
            this.field3309 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)Leb;")
    public final class569 method1478(int arg0, int arg1) {
        field3311++;
        class653 var3 = this.field3305;
        class569 var4;
        synchronized (this.field3305) {
            var4 = (class569) this.field3305.method3690((byte) -80, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field3309;
        byte[] var6;
        synchronized (this.field3309) {
            var6 = this.field3309.method1719(arg1, arg0, 4);
        }
        class569 var7 = new class569();
        if (var6 != null) {
            var7.method3216(-1, new class452(var6));
        }
        var7.method3219(3);
        class653 var8 = this.field3305;
        synchronized (this.field3305) {
            this.field3305.method3683(var7, (byte) -13, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Liaa;B)Llfa;")
    public static final class101 method1479(class452 arg0, byte arg1) {
        field3308++;
        int var2 = arg0.method2541(62);
        class215 var3 = class220.method1292(97)[arg0.method2541(42)];
        class278 var4 = class437.method2415(-93)[arg0.method2541(95)];
        int var5 = arg0.method2549((byte) 32);
        int var6 = arg0.method2549((byte) 32);
        int var7 = -60 % ((arg1 + 50) / 41);
        int var8 = arg0.method2574(-1758460248);
        int var9 = arg0.method2574(-1758460248);
        int var10 = arg0.method2575((byte) -48);
        int var11 = arg0.method2575((byte) -48);
        int var12 = arg0.method2575((byte) -48);
        boolean var13 = arg0.method2541(65) == 1;
        return new class101(var2, var3, var4, var5, var6, var8, var9, var10, var11, var12, var13);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)V")
    public final void method1480(int arg0, int arg1) {
        int var3 = 13 / ((-arg0 - 37) / 52);
        field3307++;
        class653 var4 = this.field3305;
        synchronized (this.field3305) {
            this.field3305.method3691(false, arg1);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public static void method1481(int arg0) {
        field3312 = null;
        field3314 = null;
        int var1 = -8 % ((arg0 + 73) / 52);
        field3310 = null;
        field3304 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
    public final void method1482(byte arg0) {
        field3313++;
        class653 var2 = this.field3305;
        synchronized (this.field3305) {
            this.field3305.method3684(-17200);
            if (arg0 > -14) {
                this.method1477((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class260(class207 arg0, int arg1, class303 arg2) {
        this.field3309 = arg2;
        if (this.field3309 != null) {
            this.field3309.method1727(-77, 35);
        }
    }
}
