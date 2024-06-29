import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class601 extends class430 {

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    public static int field8432 = 1;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public int field8426;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public int field8427;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public int field8430;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public int field8433;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "J")
    public long field8420;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "[[Lrja;")
    public static class114[][] field8423;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I", line = 3)
    public final int method993(int arg0) {
        field8421++;
        return arg0 == -1 ? this.field8426 : -72;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I", line = 14)
    public final int method991(int arg0) {
        if (arg0 != 7) {
            field8432 = 98;
        }
        field8428++;
        return this.field8430;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 26)
    public static final void method3495(String arg0, byte arg1) {
        field8422++;
        if (arg1 > -100) {
            method3495(null, (byte) 81);
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class663.method3782((byte) 123, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class22.field365; var3++) {
            String var4 = class440.field5967[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class663.method3782((byte) 78, var4);
            if (var5 != null && var5.equals(var2)) {
                class22.field365--;
                for (int var6 = var3; var6 < class22.field365; var6++) {
                    class440.field5967[var6] = class440.field5967[var6 + 1];
                    class36.field484[var6] = class36.field484[var6 + 1];
                    class207.field3210[var6] = class207.field3210[var6 + 1];
                    class377.field5210[var6] = class377.field5210[var6 + 1];
                    class453.field6356[var6] = class453.field6356[var6 + 1];
                    class712.field9884[var6] = class712.field9884[var6 + 1];
                }
                class478.field6706++;
                class493.field6979 = class366.field5096;
                class312 var7 = class353.method2245(class87.field971, class584.field8254, (byte) 31);
                var7.field4445.method2952(0, class348.method2204((byte) -112, arg0));
                var7.field4445.method2953(arg0, -28136);
                class208.method1440(var7, 64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V", line = 92)
    public static final void method3496(boolean arg0) {
        if (!arg0) {
            method3497((byte) -32);
        }
        class686.field9533.method2771(127);
        field8424++;
        class90.field1011 = 1;
        class161.field2559 = null;
        class106.field1241 = null;
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V", line = 109)
    public static void method3497(byte arg0) {
        field8423 = null;
        if (arg0 <= 74) {
            method3495(null, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)J", line = 119)
    public final long method995(int arg0) {
        field8425++;
        if (arg0 != 5) {
            this.field8430 = -19;
        }
        return this.field8420;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)I", line = 131)
    public final int method992(byte arg0) {
        int var2 = -58 / ((-arg0 - 24) / 56);
        field8429++;
        return this.field8433;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)I", line = 144)
    public final int method994(byte arg0) {
        if (arg0 != -75) {
            this.method991(-38);
        }
        field8431++;
        return this.field8427;
    }
}
