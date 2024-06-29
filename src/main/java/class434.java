import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class434 {

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public int field6366 = -1;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Liu;")
    public static class390 field6359 = new class390(74, -2);

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Z")
    public static boolean field6368 = false;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
    public static int[] field6369 = new int[13];

    @OriginalMember(owner = "client!av", name = "n", descriptor = "Lwt;")
    public static class194 field6370;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public int field6360;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public int field6367;

    static {
        new class194("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field6370 = new class194("flash3:", "blinken3:", "clignotant3:", "brilho3:");
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIBII)V", line = 7)
    public static final void method2563(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class118.field1533.field6912 != 0 && arg4 != 0 && class124.field1611 < 50 && arg1 != -1) {
            class415.field6150[class124.field1611++] = new class147((byte) 1, arg1, arg4, arg5, arg0, arg2);
        }
        field6361++;
        if (arg3 != -97) {
            field6368 = true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 28)
    public static final void method2564(int arg0, int arg1, int arg2, Class arg3) {
        class468 var4 = class358.field5312[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class323 var5 = var4.field6769; var5 != null; var5 = var5.field4727) {
            class210 var6 = var5.field4726;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2972 == arg1 && var6.field2975 == arg2) {
                class420.method2489(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 61)
    public static void method2565(int arg0) {
        field6370 = null;
        field6369 = null;
        field6359 = null;
        if (arg0 != -1) {
            field6359 = null;
        }
    }
}
