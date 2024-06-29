import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class135 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lla;")
    public static class319 field1804 = new class319(30, -2);

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1807 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 7)
    public static void method913(int arg0) {
        field1804 = null;
        if (arg0 > -87) {
            method914(-98, -72, 15, (byte) 69, -105);
        }
        field1807 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBI)V", line = 19)
    public static final void method914(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1806++;
        if (arg3 < 20) {
            method914(-51, 102, 32, (byte) 70, -43);
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class33.method289(261104, class377.field5760, class49.field701, arg0 + arg2);
        int var10 = class33.method289(261104, class377.field5760, class49.field701, arg0 - arg2);
        class221.method1489(class466.field6955[arg1], var10, var9, (byte) -30, arg4);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class463.field6924 && class369.field5628 >= var11) {
                    int var13 = class33.method289(261104, class377.field5760, class49.field701, arg0 + var5);
                    int var14 = class33.method289(261104, class377.field5760, class49.field701, arg0 - var5);
                    if (var12 <= class369.field5628) {
                        class221.method1489(class466.field6955[var12], var14, var13, (byte) -30, arg4);
                    }
                    if (class463.field6924 <= var11) {
                        class221.method1489(class466.field6955[var11], var14, var13, (byte) -30, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class463.field6924 && class369.field5628 >= var15) {
                int var17 = class33.method289(261104, class377.field5760, class49.field701, arg0 + var6);
                int var18 = class33.method289(261104, class377.field5760, class49.field701, arg0 - var6);
                if (class369.field5628 >= var16) {
                    class221.method1489(class466.field6955[var16], var18, var17, (byte) -30, arg4);
                }
                if (class463.field6924 <= var15) {
                    class221.method1489(class466.field6955[var15], var18, var17, (byte) -30, arg4);
                }
            }
        }
    }
}
