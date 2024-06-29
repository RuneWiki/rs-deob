import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class250 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lmh;")
    public static class128 field4330 = class22.method156(123, "Hidden)2");

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
    public static int[] field4336 = new int[1000];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[[[I")
    public static int[][][] field4334;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1747(int arg0) {
        field4326++;
        if (arg0 != 29354) {
            method1749(-27L, -62, false, -19, 107);
        }
        if (!class31.field685) {
            return;
        }
        class10 var1 = class271.method1908(class88.field1514, class65.field1257, false);
        if (var1 != null && var1.field209 != null) {
            class102 var2 = new class102();
            var2.field1743 = var1.field209;
            var2.field1738 = var1;
            class249.method1739(var2, -71);
        }
        class31.field685 = false;
        class7.method48(var1, 0);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 50)
    public static void method1748(int arg0) {
        field4330 = null;
        field4336 = null;
        field4334 = (int[][][]) null;
        if (arg0 != 0) {
            method1750((byte) 75, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JIZII)Lmh;", line = 73)
    public static final class128 method1749(long arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class128 var6 = class4.method25(126, arg3);
        field4333++;
        if (arg0 < 0L) {
            var6.method847(true, class306.field5206);
            arg0 = -arg0;
        }
        class128 var7 = class17.field498;
        class128 var8 = class161.field2740;
        if (arg1 == 1) {
            var7 = class161.field2740;
            var8 = class17.field498;
        }
        if (arg1 == 2) {
            var8 = class164.field2826;
            var7 = class161.field2740;
        }
        class128 var9 = class4.method25(105, 0);
        class128 var10 = class4.method25(87, 0);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method847(true, class257.method1811((int) (arg0 % 10L), (byte) 67));
            arg0 /= 10L;
        }
        int var12 = 0;
        if (arg0 == 0L) {
            var9 = class89.field1525;
        }
        while (arg0 > 0L) {
            if (arg2 && var12 != 0 && (var12 % 3) == 0) {
                var9.method847(true, var8);
            }
            var12++;
            var9.method847(true, class257.method1811((int) (arg0 % 10L), (byte) -120));
            arg0 /= 10L;
        }
        if (var10.method865((byte) -58) > 0) {
            var10.method847(true, var7);
        }
        return class28.method177((byte) -63, new class128[] { var6, var9.method820((byte) -114), var10.method820((byte) -114) });
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[B)V", line = 140)
    public static final void method1750(byte arg0, byte[] arg1) {
        class194 var2 = new class194(arg1);
        field4332++;
        var2.field3380 += 2;
        int var3 = var2.method1325(7627);
        if (var3 != 1) {
            return;
        }
        boolean var4 = var2.method1325(7627) == 1;
        if (arg0 >= 60) {
            if (var4) {
                class230.method1580((byte) -28, var2);
            }
            class205.method1414(-1, var2);
        }
    }
}
