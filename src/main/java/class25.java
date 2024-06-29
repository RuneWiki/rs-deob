import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class25 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Ld;")
    private class242 field284 = new class242(64);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lum;")
    private class83 field285;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lpn;")
    public static class49 field289 = new class49(38, 7);

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Ljp;")
    public static class55 field291 = new class55(62, 2);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 4)
    public final void method152(int arg0) {
        if (arg0 < 23) {
            this.method157(-49, 79);
        }
        class242 var2 = this.field284;
        synchronized (this.field284) {
            this.field284.method1637((byte) 13);
        }
        field282++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V", line = 17)
    public static final void method153(int arg0, int arg1, int arg2, int arg3) {
        field283++;
        int var4 = class422.field6201 + arg3;
        if (arg2 != 31755) {
            field291 = null;
        }
        int var5 = arg0 + class23.field273;
        if (class348.field5192 == null || arg3 < 0 || arg0 < 0 || class338.field5076 <= arg3 || class250.field4077 <= arg0) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg1 << 28 | var4);
        class192 var8 = (class192) class249.field3827.method358((byte) 28, var6);
        if (var8 == null) {
            class76.method697(arg1, arg3, arg0);
            return;
        }
        class43 var9 = (class43) var8.field2952.method295((byte) 18);
        if (var9 == null) {
            class76.method697(arg1, arg3, arg0);
            return;
        }
        class115 var10 = (class115) class76.method697(arg1, arg3, arg0);
        if (var10 == null) {
            var10 = new class115();
        } else {
            var10.field1770 = var10.field1760 = -1;
        }
        var10.field1767 = var9.field680;
        var10.field1765 = var9.field679;
        label50: while (true) {
            class43 var11 = (class43) var8.field2952.method296(true);
            if (var11 == null) {
                break;
            }
            if (var10.field1765 != var11.field679) {
                var10.field1770 = var11.field679;
                var10.field1764 = var11.field680;
                while (true) {
                    class43 var12 = (class43) var8.field2952.method296(true);
                    if (var12 == null) {
                        break label50;
                    }
                    if (var10.field1765 != var12.field679 && var10.field1770 != var12.field679) {
                        var10.field1762 = var12.field680;
                        var10.field1760 = var12.field679;
                    }
                }
            }
        }
        int var13 = class416.method2605((arg0 << 7) + 64, (arg3 << 7) - -64, (byte) 117, arg1);
        class348.method2240(arg1, arg3, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lka;", line = 104)
    public final class477 method154(byte arg0, int arg1) {
        field290++;
        class242 var3 = this.field284;
        class477 var4;
        synchronized (this.field284) {
            var4 = (class477) this.field284.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field285;
        byte[] var6;
        synchronized (this.field285) {
            var6 = this.field285.method731(0, arg1, 32);
        }
        class477 var7 = new class477();
        if (var6 != null) {
            var7.method2883(new class194(var6), -1);
        }
        class242 var8 = this.field284;
        synchronized (this.field284) {
            this.field284.method1623((long) arg1, 17621, var7);
        }
        if (arg0 != 21) {
            this.method152(-15);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 133)
    public final void method155(int arg0) {
        class242 var2 = this.field284;
        synchronized (this.field284) {
            if (arg0 >= -38) {
                return;
            }
            this.field284.method1630(-30);
        }
        field287++;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 148)
    public static void method156(int arg0) {
        if (arg0 == 0) {
            field291 = null;
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 159)
    public final void method157(int arg0, int arg1) {
        field286++;
        class242 var3 = this.field284;
        synchronized (this.field284) {
            this.field284.method1631(arg0, (byte) -19);
        }
        if (arg1 != 0) {
            this.method155(-107);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 194)
    public class25(class308 arg0, int arg1, class83 arg2) {
        this.field285 = arg2;
        this.field285.method748(32, 12408);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfh;I)Lei;", line = 182)
    public static final class267 method158(class194 arg0, int arg1) {
        field288++;
        if (arg1 != 2) {
            method156(13);
        }
        return new class267(arg0.method1384(true), arg0.method1384(true), arg0.method1384(true), arg0.method1384(true), arg0.method1339(-32768), arg0.method1339(arg1 - 32770), arg0.method1337((byte) -120));
    }
}
