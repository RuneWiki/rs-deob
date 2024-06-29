import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class118 {

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "J")
    public long field2238 = 0L;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lhj;")
    public static class69 field2230 = class181.method1318("Lade Benutzeroberfl-=che )2 ", (byte) -127);

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lhj;")
    public static class69 field2236 = class181.method1318("<col=80ff00>", (byte) -122);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2240 = -1;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lta;")
    public static class241 field2226 = new class241(64);

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lhj;")
    public static class69 field2242 = class181.method1318("W-=hlen Sie eine Welt", (byte) -110);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Led;")
    public class177 field2227;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Led;")
    public class177 field2235;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Ltk;")
    public static class50[] field2233;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method860(byte arg0) {
        int var1 = -22 / (arg0 / 44);
        field2233 = null;
        field2242 = null;
        field2226 = null;
        field2236 = null;
        field2230 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILhj;)Z")
    public static final boolean method861(int arg0, class69 arg1) {
        field2232++;
        try {
            int var2 = arg1.method486(0, 44);
            if (var2 == -1) {
                return false;
            }
            class69 var3 = arg1.method485(var2, arg0, (byte) -20);
            class69 var4 = arg1.method478(-128, var2 + 1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method469(127));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method450(true);
            class128 var8 = new class128(5000);
            var8.method921((byte) -17, var7.length, var7, 0);
            var8.field2379 = 0;
            var8.method942((byte) -114, class206.field3765, class58.field1054);
            if (var8.field2385[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field2385[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method862(boolean arg0) {
        if (arg0) {
            method861(-35, (class69) null);
        }
        field2241++;
        if (class123.field2288 > 0) {
            class20.method115(-5);
        } else {
            class23.field331 = class135.field2532;
            class135.field2532 = null;
            class115.method851(116, 40);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Ltk;I)V")
    public static final void method863(int arg0, class50[] arg1, int arg2) {
        field2237++;
        if (arg2 != -2) {
            method861(84, (class69) null);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class50 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field884 == 0) {
                    if (var4.field848 != null) {
                        method863(arg0, var4.field848, -2);
                    }
                    class259 var5 = (class259) class156.field2910.method769(true, (long) var4.field773);
                    if (var5 != null) {
                        class215.method1548(arg0, var5.field4640, 18);
                    }
                }
                if (arg0 == 0 && var4.field787 != null) {
                    class58 var6 = new class58();
                    var6.field1048 = var4;
                    var6.field1050 = var4.field787;
                    class179.method1304((byte) 59, var6);
                }
                if (arg0 == 1 && var4.field732 != null) {
                    if (var4.field735 >= 0) {
                        class50 var7 = client.method1144((byte) -9, var4.field773);
                        if (var7 == null || var7.field848 == null || var4.field735 >= var7.field848.length || var7.field848[var4.field735] != var4) {
                            continue;
                        }
                    }
                    class58 var8 = new class58();
                    var8.field1048 = var4;
                    var8.field1050 = var4.field732;
                    class179.method1304((byte) 65, var8);
                }
            }
        }
    }
}
