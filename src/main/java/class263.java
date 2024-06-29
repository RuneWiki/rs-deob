import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class263 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "J")
    public long field4584 = 0L;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Loh;")
    public static class258 field4580 = class153.method1046("sch-Utteln:", 103);

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[I")
    public static int[] field4575 = new int[128];

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4583 = 99;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lrk;")
    public class123 field4566;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lrk;")
    public class123 field4573;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lhg;")
    public static class216 field4577;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[Loh;B)Loh;", line = 4)
    public static final class258 method1841(int arg0, int arg1, class258[] arg2, byte arg3) {
        field4567++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class243.field4228;
            }
            var4 += arg2[arg1 + var5].field4478;
        }
        if (arg3 < 122) {
            field4580 = (class258) null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class258 var9 = arg2[arg1 + var8];
            class275.method1932(var9.field4490, 0, var6, var7, var9.field4478);
            var7 += var9.field4478;
        }
        class258 var10 = new class258();
        var10.field4490 = var6;
        var10.field4478 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lpb;", line = 61)
    public static final class2 method1842(int arg0, byte arg1) {
        field4582++;
        class2 var2 = (class2) class259.field4509.method1159((byte) 124, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class217.field3749.method1453(class229.method1529(-123, arg0), (byte) -50, class308.method2142(arg0, arg1 ^ 0x6));
        class2 var4 = new class2();
        if (var3 != null) {
            var4.method11(new class235(var3), (byte) 34);
        }
        var4.method7(-76);
        if (arg1 != -114) {
            field4575 = (int[]) null;
        }
        class259.field4509.method1163(var4, arg1 ^ 0x71, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 89)
    public static void method1843(int arg0) {
        field4575 = null;
        if (arg0 == -28588) {
            field4577 = null;
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)Ls;", line = 110)
    public static final class171 method1844(int arg0, byte arg1) {
        if (arg1 != -70) {
            method1846(45, -81);
        }
        field4569++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class23.field290[var2] == null || class23.field290[var2][var3] == null) {
            boolean var4 = class92.method685(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class23.field290[var2][var3];
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 141)
    public static final void method1845(int arg0, int arg1, int arg2) {
        class12.field157[arg1] = arg0;
        if (arg2 != -7) {
            return;
        }
        field4578++;
        class93 var3 = (class93) class103.field1875.method986((long) arg1, 0);
        if (var3 == null) {
            class93 var4 = new class93(4611686018427387905L);
            class103.field1875.method984((byte) 105, var4, (long) arg1);
        } else if (var3.field1641 != 4611686018427387905L) {
            var3.field1641 = class25.method197(-3418) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 189)
    public static final void method1846(int arg0, int arg1) {
        class251.method1700(0);
        field4572++;
        class96.method700(-107);
        int var2 = class176.method1214(77, arg1).field2832;
        if (var2 == 0) {
            return;
        }
        int var3 = class227.field3917[arg1];
        if (var2 == 9) {
            class258.field4453 = var3;
        }
        if (var2 == 6) {
            class122.field2152 = var3;
        }
        if (arg0 == var2) {
            class122.field2159 = var3;
        }
    }
}
