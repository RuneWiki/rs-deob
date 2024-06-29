import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class117 extends class202 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field1462 = -1;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public int field1468 = -1;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1473 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljr;")
    public static class92 field1475 = new class92("", 17);

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "F")
    public static float field1474;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
    public static final int method687(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return -119;
        } else {
            ++field1471;
            return arg0 != 1 && ~arg0 != -4 ? class37.field287[arg1 & 3] : class204.field2447[3 & arg1];
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1473 = null;
        if (arg0 != 0) {
            method687(-120, -50, 42);
        }
        field1475 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ldn;Ldn;I)I")
    public static final int method689(class438 arg0, class438 arg1, int arg2) {
        ++field1466;
        int var3 = 0;
        if (arg1.method2566(125, class478.field6708)) {
            ++var3;
        }
        if (arg2 <= 50) {
            method688(70);
        }
        if (arg1.method2566(102, class99.field1236)) {
            ++var3;
        }
        if (arg1.method2566(72, class205.field2463)) {
            ++var3;
        }
        if (arg0.method2566(68, class478.field6708)) {
            ++var3;
        }
        if (arg0.method2566(115, class99.field1236)) {
            ++var3;
        }
        if (arg0.method2566(124, class205.field2463)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 == 29657) {
            ++field1470;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        ++field1469;
        if (arg0 != 12) {
            this.method318(127, (class206) null, -84, 99);
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field1467;
        class163 var3 = arg1.method1126();
        var3.method661(super.field2425, super.field2420, super.field2422);
        class318 var4 = class143.method788(0, 3);
        if (this.field1468 != arg0) {
            class157 var5 = class449.field6217.method2026((byte) -97, this.field1468).method3496(2048, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1464);
            if (var5 != null) {
                var5.method69(var3, var4.field4059[2], 0);
            }
        }
        if (~this.field1462 != 0) {
            class157 var6 = class449.field6217.method2026((byte) -91, this.field1462).method3496(2048, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1472);
            if (var6 != null) {
                var6.method69(var3, var4.field4059[1], 0);
            }
        }
        class157 var7 = class449.field6217.method2026((byte) -123, this.field1461).method3496(2048, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1463);
        if (var7 != null) {
            var7.method69(var3, var4.field4059[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field1465;
        if (arg0 != -21851) {
            return false;
        } else {
            class163 var5 = arg1.method1126();
            var5.method661(super.field2425, super.field2420, super.field2422);
            class157 var6 = class449.field6217.method2026((byte) -71, this.field1461).method3496(131072, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1463);
            if (var6 != null && var6.method91(arg2, arg3, var5, true)) {
                return true;
            } else {
                if (this.field1462 != -1) {
                    class157 var7 = class449.field6217.method2026((byte) -103, this.field1462).method3496(131072, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1472);
                    if (var7 != null && var7.method91(arg2, arg3, var5, true)) {
                        return true;
                    }
                }
                if (~this.field1468 != 0) {
                    class157 var8 = class449.field6217.method2026((byte) -89, this.field1468).method3496(131072, -1, (class502) null, (class498) null, 0, 0, true, arg1, this.field1464);
                    if (var8 != null && var8.method91(arg2, arg3, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
