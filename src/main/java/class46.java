import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 {

    @OriginalMember(owner = "client!cja", name = "l", descriptor = "B")
    public byte field585;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "Ljava/lang/String;")
    public static String field578 = "";

    @OriginalMember(owner = "client!cja", name = "g", descriptor = "I")
    public static int field580 = 0;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "Lrh;")
    public static class277 field590 = class107.method824((byte) 3);

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "Lgca;")
    public static class262 field574;

    @OriginalMember(owner = "client!cja", name = "n", descriptor = "Lfha;")
    public class399 field587;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "Lcja;")
    public class46 field583;

    @OriginalMember(owner = "client!cja", name = "m", descriptor = "Lbt;")
    public class48 field586;

    @OriginalMember(owner = "client!cja", name = "i", descriptor = "Leba;")
    public class613 field582;

    @OriginalMember(owner = "client!cja", name = "p", descriptor = "Leba;")
    public class613 field589;

    @OriginalMember(owner = "client!cja", name = "r", descriptor = "Lnu;")
    public class617 field591;

    @OriginalMember(owner = "client!cja", name = "h", descriptor = "Lfj;")
    public class682 field581;

    @OriginalMember(owner = "client!cja", name = "s", descriptor = "Lfj;")
    public class682 field592;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "Lwia;")
    public static class791 field577;

    @OriginalMember(owner = "client!cja", name = "f", descriptor = "S")
    public short field579;

    @OriginalMember(owner = "client!cja", name = "k", descriptor = "S")
    public short field584;

    @OriginalMember(owner = "client!cja", name = "o", descriptor = "S")
    public short field588;

    @OriginalMember(owner = "client!cja", name = "t", descriptor = "S")
    public short field593;

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "[I")
    public static int[] field576;

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V", line = 8)
    public class46(int arg0) {
        this.field585 = (byte) arg0;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V", line = 16)
    public final void method334(int arg0) {
        if (arg0 > -7) {
            method335(61);
        }
        field575++;
        while (this.field586 != null) {
            class48 var2 = this.field586.field611;
            this.field586.method344(-91);
            this.field586 = var2;
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V", line = 43)
    public static void method335(int arg0) {
        field576 = null;
        if (arg0 != 20397) {
            method336(null, 30, 114, 98, null);
        }
        field577 = null;
        field574 = null;
        field590 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lr;III[Z)V", line = 66)
    public static final void method336(class194 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class774.field10642 == class208.field3219) {
            return;
        }
        int var5 = class411.field5572[arg1].method1918(arg2, (byte) 126, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class294 var7 = class411.field5572[var6];
                if (var7 != null) {
                    var7.method1916(arg0, arg2, var5 - var7.method1918(arg2, (byte) 126, arg3), arg3, 0, false);
                }
            }
        }
    }
}
