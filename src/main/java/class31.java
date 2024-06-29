import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class31 extends class64 {

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "[I")
    public static int[] field381;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field377;

    static {
        new class349("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field381 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
        Math.sqrt(8192.0D);
        field386 = 0;
        field388 = 0;
        field387 = 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V", line = 3)
    public final void method168(int arg0, int arg1, int arg2) {
        ++field376;
        int var4 = this.field385 * arg2 >> 12;
        int var5 = this.field384 * arg1 >> 12;
        int var6 = 59 % ((-30 - arg0) / 46);
        int var7 = this.field383 * arg2 >> 12;
        int var8 = this.field382 * arg1 >> 12;
        int var9 = this.field380 * arg2 >> 12;
        int var10 = this.field378 * arg1 >> 12;
        int var11 = this.field372 * arg2 >> 12;
        int var12 = this.field379 * arg1 >> 12;
        class349.method2287(super.field883, var5, var10, var11, var12, var7, 19864, var8, var9, var4);
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(III)V", line = 44)
    public final void method169(int arg0, int arg1, int arg2) {
        if (arg2 <= -102) {
            ++field377;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V", line = 55)
    public static final void method170(int arg0, int arg1) {
        ++field373;
        class355.field5138 = arg1;
        int var2 = 45 / ((arg0 - 52) / 36);
        class15 var3 = class287.field4179;
        synchronized (class287.field4179) {
            class287.field4179.method102((byte) -112);
        }
        class15 var4 = class446.field6372;
        synchronized (class446.field6372) {
            class446.field6372.method102((byte) -72);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 71)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field385 = arg0;
        this.field384 = arg1;
        this.field383 = arg2;
        this.field382 = arg3;
        this.field378 = arg5;
        this.field379 = arg7;
        this.field372 = arg6;
        this.field380 = arg4;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 93)
    public static void method171(int arg0) {
        field381 = null;
        if (arg0 != 576878412) {
            field386 = -87;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)Z", line = 104)
    public static final boolean method172(int arg0, byte arg1) {
        ++field374;
        if (arg1 != 100) {
            return false;
        } else {
            return ~arg0 == -45 || ~arg0 == -24 || ~arg0 == -1009 || arg0 == 18 || ~arg0 == -12;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)V", line = 117)
    public final void method173(int arg0, int arg1, int arg2) {
        ++field375;
        if (arg0 != 200) {
            method171(-101);
        }
    }
}
