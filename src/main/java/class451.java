import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class451 {

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
    public static int[] field6465 = new int[1000];

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
    public static int[] field6466;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
    public static int[] field6468;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[Lvj;")
    public static class256[] field6467;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIILp;Lp;)V")
    public static final void method2807(int arg0, int arg1, int arg2, class120 arg3, class120 arg4) {
        if (class385.field5449[arg0][arg1][arg2] == null) {
            class197.method1400(arg0, arg1, arg2);
        }
        class385.field5449[arg0][arg1][arg2].field975 = arg3;
        class385.field5449[arg0][arg1][arg2].field977 = arg4;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lan;Ltj;BLtj;)V")
    public static final void method2808(class17 arg0, class108 arg1, byte arg2, class108 arg3) {
        field6463++;
        class142.field2151 = arg3;
        class63.field839 = arg1;
        if (arg2 >= -49) {
            method2812((class108) null, (class108) null, -58, (class108) null, (class108) null);
        }
        class335.field4873 = arg0;
        if (class63.field839 != null) {
            class293.field4242 = class63.field839.method651(0, 1);
        }
        if (class142.field2151 != null) {
            class13.field179 = class142.field2151.method651(0, 1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method2809(byte arg0) {
        field6465 = null;
        field6468 = null;
        int var1 = 104 / ((18 - arg0) / 63);
        field6466 = null;
        field6467 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6461++;
        if (arg2 != -15694) {
            method2811();
        }
        float var5 = (float) class176.field2492 / (float) class176.field2494;
        int var6 = arg4;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg3 - (arg0 - var7) / 2;
        int var9 = arg1 - (arg4 - var6) / 2;
        class175.field2459 = class176.field2492 - (class176.field2492 * var8 / var7);
        class170.field2407 = class176.field2494 * var9 / var6;
        class139.field2125 = -1;
        class209.field2986 = -1;
        class177.method1267((byte) 121);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "()V")
    public static final void method2811() {
        class177.method1264(1, class243.field3603);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ltj;Ltj;ILtj;Ltj;)V")
    public static final void method2812(class108 arg0, class108 arg1, int arg2, class108 arg3, class108 arg4) {
        field6462++;
        if (arg2 != -7397) {
            field6465 = null;
        }
        class309.field4495 = arg0;
        class333.field4843 = arg1;
        class229.field3397 = arg3;
        class438.field6255 = arg4;
        class186.field2657 = new class223[class438.field6255.method633(2)][];
        class189.field2713 = new boolean[class438.field6255.method633(2)];
    }

    static {
        new class349("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field6466 = new int[256];
        field6468 = new int[4096];
    }
}
