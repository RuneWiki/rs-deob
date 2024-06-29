import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class241 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lci;")
    private class230 field4423 = new class230();

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    private int field4427;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lc;")
    private class103 field4436;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lhj;")
    public static class69 field4429 = class181.method1318("null", (byte) -125);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4431 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4422 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/Object;J)V")
    public final void method1705(byte arg0, Object arg1, long arg2) {
        field4438++;
        this.method1712(arg2, -26870);
        if (this.field4433 == 0) {
            class245 var5 = (class245) this.field4423.method1641(true);
            var5.method632(-8296);
            var5.method24(true);
        } else {
            this.field4433--;
        }
        if (arg0 < 122) {
            method1707(false);
        }
        class191 var6 = new class191(arg1);
        this.field4436.method761(arg2, 0, var6);
        this.field4423.method1643(var6, 4096);
        var6.field44 = 0L;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILtk;)V")
    public static final void method1706(int arg0, int arg1, int arg2, class50 arg3) {
        field4428++;
        if (class265.field4715 != 0 && class265.field4715 != 3 || !arg3.method279((byte) -97)) {
            return;
        }
        int var4 = arg3.field800[arg1];
        if (arg0 < var4 || arg0 > arg3.field760[arg1] + var4) {
            return;
        }
        int var5 = arg1 - arg3.field727 / 2;
        int var6 = arg0 - arg3.field798 / 2;
        if (arg2 != 115742923) {
            method1711(106, -31, -105, 126, 65);
        }
        int var7 = client.field2812 + class179.field3257 & 0x7FF;
        int var8 = class178.field3247[var7];
        int var9 = (class59.field1080 + 256) * var8 >> 8;
        int var10 = class178.field3232[var7];
        int var11 = (class59.field1080 + 256) * var10 >> 8;
        int var12 = var5 * var9 + (var6 * var11) >> 11;
        int var13 = class156.field2904.field3985 + var12 >> 7;
        int var14 = var5 * var11 - (var6 * var9) >> 11;
        int var15 = class156.field2904.field4005 - var14 >> 7;
        if (class245.field4487 > 0 && class261.field4656[82] && class261.field4656[81]) {
            class236.method1671((byte) 13, class52.field927, class220.field3962 + var15, class242.field4441 + var13);
            return;
        }
        boolean var16 = class206.method1498(true, 0, class156.field2904.field4046[0], var13, var15, 0, class156.field2904.field3998[0], true, 0, 0, 1, 0);
        if (!var16) {
            return;
        }
        class48.field692.method933(var6, arg2 - 115763869);
        class48.field692.method933(var5, -20946);
        class48.field692.method943((byte) 127, client.field2812);
        class48.field692.method933(57, -20946);
        class48.field692.method933(class179.field3257, -20946);
        class48.field692.method933(class59.field1080, -20946);
        class48.field692.method933(89, arg2 ^ 0xF919B6E5);
        class48.field692.method943((byte) 127, class156.field2904.field3985);
        class48.field692.method943((byte) 127, class156.field2904.field4005);
        class48.field692.method933(class230.field4209, -20946);
        class48.field692.method933(63, arg2 - 115763869);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1707(boolean arg0) {
        if (!arg0) {
            method1715(-16, -86, -68, (class83) null);
        }
        class193.field3519.method1713(43);
        field4434++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public final void method1708(int arg0, int arg1) {
        if (class200.field3614 != null) {
            for (class245 var3 = (class245) this.field4423.method1639(true); var3 != null; var3 = (class245) this.field4423.method1640(true)) {
                if (var3.method1383(122)) {
                    if (var3.method1382(0) == null) {
                        var3.method632(arg0 + 1009965425);
                        var3.method24(true);
                        this.field4433++;
                    }
                } else if (((long) arg1) < (++var3.field44)) {
                    class245 var4 = class200.field3614.method190(var3, -772119097);
                    this.field4436.method761(var3.field1685, arg0 + 1009973721, var4);
                    class172.method1260(var3, -116, var4);
                    var3.method632(-8296);
                    var3.method24(true);
                }
            }
        }
        if (arg0 != -1009973721) {
            this.field4423 = null;
        }
        field4425++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public final void method1709(byte arg0) {
        if (arg0 > -39) {
            return;
        }
        for (class245 var2 = (class245) this.field4423.method1639(true); var2 != null; var2 = (class245) this.field4423.method1640(true)) {
            if (var2.method1383(125)) {
                var2.method632(-8296);
                var2.method24(true);
                this.field4433++;
            }
        }
        field4432++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4422 = null;
        field4429 = null;
        if (arg0 < 62) {
            method1706(74, -4, 100, (class50) null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class19.field252 = arg0;
        class201.field3629 = arg2;
        if (arg4 == 1) {
            field4435++;
            class35.field485 = arg1;
            class166.field3075 = arg3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JI)V")
    public final void method1712(long arg0, int arg1) {
        class245 var4 = (class245) this.field4436.method769(true, arg0);
        if (var4 != null) {
            var4.method632(arg1 ^ 0x4892);
            var4.method24(true);
            this.field4433++;
        }
        if (arg1 != -26870) {
            field4422 = null;
        }
        field4424++;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method1713(int arg0) {
        field4421++;
        this.field4423.method1638(64);
        this.field4436.method763(125);
        int var2 = 64 % ((-arg0 - 29) / 53);
        this.field4433 = this.field4427;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1714(long arg0, byte arg1) {
        field4426++;
        class245 var4 = (class245) this.field4436.method769(true, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1382(0);
        if (var5 == null) {
            var4.method632(-8296);
            var4.method24(true);
            this.field4433++;
            return null;
        }
        if (var4.method1383(109)) {
            class191 var6 = new class191(var5);
            this.field4436.method761(var4.field1685, 0, var6);
            this.field4423.method1643(var6, 4096);
            var6.field44 = 0L;
            var4.method632(-8296);
            var4.method24(true);
        } else {
            this.field4423.method1643(var4, 4096);
            var4.field44 = 0L;
        }
        if (arg1 > -123) {
            this.field4427 = 100;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
    public class241(int arg0) {
        this.field4433 = arg0;
        this.field4427 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4436 = new class103(var2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILnc;)Lkc;")
    public static final class264 method1715(int arg0, int arg1, int arg2, class83 arg3) {
        if (arg0 <= 100) {
            method1706(104, 86, 28, (class50) null);
        }
        field4437++;
        return class244.method1735(arg3, 0, arg1, arg2) ? class155.method1177((byte) 120) : null;
    }
}
