import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class164 extends class337 {

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lki;")
    public static class498 field2405 = new class498(65, 7);

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "Lwa;")
    public static class433 field2414 = new class433(16);

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public int field2421;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sr", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2422;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "[Lf;")
    public static class529[] field2419;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2419 = null;
        if (arg0 != -1292) {
            field2419 = null;
        }
        field2414 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method1144(int arg0, int arg1, class162 arg2) {
        field2417++;
        int var4 = class260.field3836[this.field2418];
        if (arg0 != 7) {
            method1143(-102);
        }
        if (var4 == 0) {
            class364 var5 = class426.method2557(this.field2408, this.field2411, this.field2404);
            if (var5 instanceof class350) {
                class350 var6 = (class350) var5;
                if (var6.field5382 != null) {
                    return ((class351) var6.field5382).method9(arg1, arg2, arg0 - 90);
                }
            }
        } else if (var4 == 1) {
            class522 var11 = class444.method2670(this.field2408, this.field2411, this.field2404);
            if (var11 instanceof class484) {
                class484 var12 = (class484) var11;
                if (var12.field7093 != null) {
                    return ((class351) var12.field7093).method9(arg1, arg2, -24);
                }
            }
        } else if (var4 == 2) {
            class117 var9 = class342.method2093(this.field2408, this.field2411, this.field2404, field2422 == null ? (field2422 = method1145("mq")) : field2422);
            if (var9 instanceof class120) {
                class120 var10 = (class120) var9;
                if (var10.field1809 != null) {
                    return ((class351) var10.field1809).method9(arg1, arg2, -35);
                }
            }
        } else if (var4 == 3) {
            class185 var7 = class196.method1340(this.field2408, this.field2411, this.field2404);
            if (var7 instanceof class473) {
                class473 var8 = (class473) var7;
                if (var8.field6965 != null) {
                    return ((class351) var8.field6965).method9(arg1, arg2, arg0 - 62);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1145(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
