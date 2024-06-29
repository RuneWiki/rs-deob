import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class99 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field1487 = -1;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    private int field1494 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lwa;")
    private class281 field1488 = new class281();

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Z")
    public boolean field1498 = false;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[Lle;")
    private class44[] field1496;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[[[I")
    private int[][][] field1485;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Z")
    public static boolean[] field1483 = new boolean[5];

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Z")
    public static boolean field1486 = false;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1497++;
        class254 var7 = class79.method529(arg6, arg1 + 105, arg3);
        if (var7 != null && var7.field4182 != null) {
            class298 var8 = new class298();
            var8.field4905 = var7.field4182;
            var8.field4906 = var7;
            class126.method844(200000, var8);
        }
        class44.field611 = arg0;
        class70.field1017 = true;
        class268.field4398 = arg3;
        client.field2581 = arg2;
        class84.field1334 = arg6;
        class135.field2114 = arg5;
        class276.field4574 = arg4;
        class58.method354(true, var7);
        if (arg1 != 0) {
            field1483 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLkk;)Lkk;")
    public static final class254 method641(byte arg0, class254 arg1) {
        field1492++;
        if (arg0 >= -8) {
            method640(19, 119, -53, 19, -42, -94, 29);
        }
        class254 var2 = client.method1087(arg1);
        if (var2 == null) {
            var2 = arg1.field4042;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I")
    public final int[][] method642(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        field1489++;
        if (this.field1493 == this.field1491) {
            this.field1498 = this.field1496[arg0] == null;
            this.field1496[arg0] = class130.field1985;
            return this.field1485[arg0];
        } else if (this.field1493 == 1) {
            this.field1498 = this.field1487 != arg0;
            this.field1487 = arg0;
            return this.field1485[0];
        } else {
            class44 var3 = this.field1496[arg0];
            if (var3 == null) {
                this.field1498 = true;
                if (this.field1493 <= this.field1494) {
                    class44 var4 = (class44) this.field1488.method1951(113);
                    var3 = new class44(arg0, var4.field607);
                    this.field1496[var4.field610] = null;
                    var4.method900(47);
                } else {
                    var3 = new class44(arg0, this.field1494);
                    this.field1494++;
                }
                this.field1496[arg0] = var3;
            } else {
                this.field1498 = false;
            }
            this.field1488.method1957(93, var3);
            return this.field1485[var3.field607];
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Ltb;")
    public static final class71 method643(int arg0, int arg1) {
        field1484++;
        class71 var2 = (class71) class235.field3728.method149((byte) -46, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 > -25) {
            return null;
        } else {
            byte[] var3 = class14.field205.method1877(arg1, 29, (byte) 104);
            class71 var4 = new class71();
            if (var3 != null) {
                var4.method452(new class202(var3), arg1, -1);
            }
            class235.field3728.method152(var4, (long) arg1, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method644(byte arg0) {
        field1495++;
        if (this.field1493 != this.field1491) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -81) {
            this.field1496 = null;
        }
        for (int var2 = 0; var2 < this.field1493; var2++) {
            this.field1496[var2] = class130.field1985;
        }
        return this.field1485;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public final void method645(byte arg0) {
        field1490++;
        for (int var2 = 0; var2 < this.field1493; var2++) {
            this.field1485[var2][0] = null;
            this.field1485[var2][1] = null;
            this.field1485[var2][2] = null;
            this.field1485[var2] = null;
        }
        this.field1485 = null;
        this.field1496 = null;
        this.field1488.method1954((byte) 127);
        if (arg0 > -37) {
            this.field1494 = 64;
        }
        this.field1488 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        int var1 = -95 / ((-arg0 - 64) / 32);
        field1483 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(III)V")
    public class99(int arg0, int arg1, int arg2) {
        this.field1491 = arg1;
        this.field1496 = new class44[this.field1491];
        this.field1493 = arg0;
        this.field1485 = new int[this.field1493][3][arg2];
    }
}
