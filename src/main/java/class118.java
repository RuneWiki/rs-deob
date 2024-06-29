import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class118 {

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Ljt;")
    private class106 field1611 = new class106(128);

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "Ljt;")
    public class106 field1619 = new class106(64);

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lvd;")
    public class39 field1610;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lvd;")
    private class39 field1613;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "[J")
    public static long[] field1615 = new long[256];

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lvd;")
    public static class39 field1608;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "Lha;")
    public static class60 field1620;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Z")
    public static boolean field1618;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1615[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 3)
    public final void method860(int arg0) {
        field1616++;
        class106 var2 = this.field1611;
        synchronized (this.field1611) {
            this.field1611.method809(true);
        }
        class106 var3 = this.field1619;
        synchronized (this.field1619) {
            this.field1619.method809(true);
            if (arg0 != 256) {
                field1618 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V", line = 20)
    public final void method861(byte arg0, int arg1) {
        class106 var3 = this.field1611;
        synchronized (this.field1611) {
            if (arg0 != -91) {
                this.method862(false);
            }
            this.field1611.method807(arg1, arg0 + 90);
        }
        field1609++;
        class106 var4 = this.field1619;
        synchronized (this.field1619) {
            this.field1619.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V", line = 36)
    public final void method862(boolean arg0) {
        class106 var2 = this.field1611;
        synchronized (this.field1611) {
            if (!arg0) {
                this.method860(-7);
            }
            this.field1611.method800(79);
        }
        field1614++;
        class106 var3 = this.field1619;
        synchronized (this.field1619) {
            this.field1619.method800(89);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)V", line = 62)
    public final void method863(int arg0, int arg1, int arg2) {
        this.field1611 = new class106(arg1);
        field1612++;
        if (arg0 == -257) {
            this.field1619 = new class106(arg2);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lfo;", line = 107)
    public final class519 method864(int arg0, int arg1) {
        field1617++;
        class106 var3 = this.field1611;
        class519 var4;
        synchronized (this.field1611) {
            var4 = (class519) this.field1611.method803(124, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field1613;
        byte[] var6;
        synchronized (this.field1613) {
            var6 = this.field1613.method211(true, 36, arg1);
        }
        class519 var7 = new class519();
        var7.field7422 = this;
        var7.field7438 = arg1;
        if (var6 != null) {
            var7.method3061(108, new class645(var6));
        }
        var7.method3058((byte) 51);
        class106 var8 = this.field1611;
        synchronized (this.field1611) {
            this.field1611.method801(1, var7, (long) arg1);
        }
        int var9 = -40 / ((arg0 - 24) / 36);
        return var7;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V", line = 160)
    public class118(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field1610 = arg3;
        this.field1613 = arg2;
        this.field1613.method229(36, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 143)
    public static void method865(int arg0) {
        if (arg0 >= 28) {
            field1620 = null;
            field1608 = null;
            field1615 = null;
        }
    }
}
