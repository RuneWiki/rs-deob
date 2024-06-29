import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class305 {

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lfc;")
    private class174 field4441 = new class174(64);

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "Lfc;")
    public class174 field4447 = new class174(64);

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Loi;")
    private class53 field4443;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Loi;")
    public class53 field4444;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "J")
    public static long field4442 = 0L;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4440 = 0;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lkn;")
    public static class530 field4437 = new class530("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Lnh;")
    public static class536 field4449 = new class536("WTQA", 2);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public final void method1854(int arg0) {
        class174 var2 = this.field4441;
        synchronized (this.field4441) {
            if (arg0 != 0) {
                this.method1857(121);
            }
            this.field4441.method1096((byte) 111);
        }
        field4445++;
        class174 var3 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method1096((byte) -79);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method1855(boolean arg0, String arg1, boolean arg2) {
        field4436++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class186.field2679.field849 : class186.field2679.field852) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class88 var11 = class186.field2679.method526(var8, 5364);
            if (var11.field1108 && var11.method638((byte) -97).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class377.field5352 = -1;
                    class399.field5627 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (!arg2) {
            field4449 = null;
        }
        class399.field5627 = var4;
        class377.field5352 = var5;
        class473.field6584 = 0;
        String[] var9 = new String[class377.field5352];
        for (int var10 = 0; var10 < class377.field5352; var10++) {
            var9[var10] = class186.field2679.method526(var4[var10], 5364).method638((byte) -103);
        }
        class88.method635(class399.field5627, (byte) -118, var9);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lvq;")
    public final class326 method1856(byte arg0, int arg1) {
        field4439++;
        class174 var3 = this.field4441;
        class326 var4;
        synchronized (this.field4441) {
            var4 = (class326) this.field4441.method1088((long) arg1, (byte) 17);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field4443;
        byte[] var6;
        synchronized (this.field4443) {
            var6 = this.field4443.method426(34, (byte) 9, arg1);
        }
        class326 var7 = new class326();
        var7.field4757 = this;
        if (var6 != null) {
            var7.method1964(new class403(var6), -46);
        }
        class174 var8 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1097(19627, var7, (long) arg1);
        }
        int var9 = 59 / ((73 - arg0) / 43);
        return var7;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public final void method1857(int arg0) {
        field4438++;
        class174 var2 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1095(0);
            if (arg0 != 34) {
                this.method1860(false, -81, 117);
            }
        }
        class174 var3 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method1095(0);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        if (arg0 == -95) {
            field4437 = null;
            field4449 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
    public final void method1859(int arg0, int arg1) {
        if (arg1 != 64) {
            this.field4443 = null;
        }
        field4446++;
        class174 var3 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1087(1, arg0);
        }
        class174 var4 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZII)V")
    public final void method1860(boolean arg0, int arg1, int arg2) {
        this.field4441 = new class174(arg1);
        field4448++;
        this.field4447 = new class174(arg2);
        if (arg0) {
            field4440 = 43;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lle;ILoi;Loi;)V")
    public class305(class205 arg0, int arg1, class53 arg2, class53 arg3) {
        this.field4443 = arg2;
        this.field4444 = arg3;
        this.field4443.method435(34, 0);
    }
}
