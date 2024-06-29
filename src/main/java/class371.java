import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class371 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public int field5365 = -1;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Ljava/util/Random;")
    public static Random field5358 = new Random();

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "S")
    public static short field5368 = 320;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Lbv;")
    public static class567 field5367 = new class567("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Ldg;")
    public static class20 field5369 = new class20();

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public int field5357;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public int field5361;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
    public static int[] field5363;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 8)
    public static void method2254(int arg0) {
        field5358 = null;
        if (arg0 != 0) {
            method2254(-15);
        }
        field5367 = null;
        field5369 = null;
        field5363 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lk;III[Z)Z", line = 24)
    public static final boolean method2255(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class88.field1594 != class73.field1360) {
            int var6 = class587.field8363[arg1].method695(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class542 var8 = class587.field8363[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method695(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method690(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method696(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
