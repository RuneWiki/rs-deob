import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class345 extends class161 {

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5308 = "Connected to update server";

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[B")
    public static byte[] field5319 = new byte[520];

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lbn;")
    public static class256 field5316 = new class256(8);

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field5327 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[Z")
    public static boolean[] field5324 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field5328 = 0;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field5331 = 0;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public int field5321;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lrr;")
    public class202 field5313;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Llp;")
    public class220 field5304;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lpo;")
    public class331 field5303;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lkr;")
    public class445 field5320;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 5)
    public static final void method2254(int arg0) {
        class52 var1 = class381.field5758;
        synchronized (class381.field5758) {
            class381.field5758.method335((byte) 125);
        }
        field5315++;
        class52 var2 = class37.field464;
        synchronized (class37.field464) {
            if (arg0 != -11424) {
                field5331 = -29;
            }
            class37.field464.method335((byte) -115);
        }
        class52 var3 = class269.field4310;
        synchronized (class269.field4310) {
            class269.field4310.method335((byte) -51);
        }
        class52 var4 = class43.field533;
        synchronized (class43.field533) {
            class43.field533.method335((byte) 92);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 35)
    public final void method2255(byte arg0) {
        this.field5313 = null;
        int var2 = 108 % ((34 - arg0) / 40);
        field5323++;
        this.field5303 = null;
        this.field5320 = null;
        this.field5304 = null;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 50)
    public static void method2256(int arg0) {
        field5308 = null;
        if (arg0 != 17142) {
            method2257(-6, false);
        }
        field5324 = null;
        field5316 = null;
        field5319 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lfr;", line = 68)
    public static final class235 method2257(int arg0, boolean arg1) {
        field5325++;
        if (!arg1) {
            method2256(93);
        }
        class235 var2 = (class235) class435.field6410.method331((byte) 69, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class230.field3837.method2771(4, arg0, 3);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1662((byte) 34, arg0, new class186(var3));
        }
        var4.method1664(-1644, arg0);
        class435.field6410.method341(64, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 130)
    public static final void method2258(int arg0) {
        field5311++;
        class221.field3660 = new class403(arg0);
        class448.field6536 = 0;
        for (class78 var1 = (class78) class43.field535.method2430(67); var1 != null; var1 = (class78) class43.field535.method2435(-224)) {
            var1.method495();
        }
    }
}
