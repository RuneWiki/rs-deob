import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class463 extends class261 {

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public int field6874 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public int field6877 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field6873 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public int field6879 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field6878 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field6871 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public int field6881 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public int field6882 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lwk;")
    public class97 field6872;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6870 = -60;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "[F")
    public static float[] field6876 = new float[4];

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z", line = 7)
    public final boolean method2775(int arg0, byte arg1, int arg2) {
        int var4 = -24 / ((23 - arg1) / 59);
        field6880++;
        if (this.field6874 <= arg2 && arg2 <= this.field6882 && this.field6873 <= arg0 && this.field6878 >= arg0) {
            return true;
        } else {
            return arg2 >= this.field6881 && this.field6879 >= arg2 && arg0 >= this.field6871 && this.field6877 >= arg0;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lza;Lvs;IIIII)V", line = 27)
    public static final void method2776(class288 arg0, class421 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class138.field2320 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class493.field7231) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class220.field3464 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class234 var15 = class518.field7511[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class520.field7560[var12].method177(var13, var14) + class520.field7560[var12].method177(var13 + 1, var14) + class520.field7560[var12].method177(var13, var14 + 1) + class520.field7560[var12].method177(var13 + 1, var14 + 1)) / 4 - (class520.field7560[arg2].method177(arg3, arg4) + class520.field7560[arg2].method177(arg3 + 1, arg4) + class520.field7560[arg2].method177(arg3, arg4 + 1) + class520.field7560[arg2].method177(arg3 + 1, arg4 + 1)) / 4;
                                    class50 var17 = var15.field3610;
                                    class50 var18 = var15.field3613;
                                    if (var17 != null && var17.method19((byte) 125)) {
                                        arg1.method18(var16, (byte) 93, (var13 - arg3) * class19.field312 + (1 - arg5) * class421.field6346, var17, arg0, var7, (var14 - arg4) * class19.field312 + (1 - arg6) * class421.field6346);
                                    }
                                    if (var18 != null && var18.method19((byte) 125)) {
                                        arg1.method18(var16, (byte) 93, (var13 - arg3) * class19.field312 + (1 - arg5) * class421.field6346, var18, arg0, var7, (var14 - arg4) * class19.field312 + (1 - arg6) * class421.field6346);
                                    }
                                    for (class440 var19 = var15.field3607; var19 != null; var19 = var19.field6528) {
                                        class402 var20 = var19.field6530;
                                        if (var20 != null && var20.method19((byte) 122) && (var20.field6082 == var13 || var8 == var13) && (var20.field6077 == var14 || var10 == var14)) {
                                            int var21 = var20.field6081 + 1 - var20.field6082;
                                            int var22 = var20.field6075 + 1 - var20.field6077;
                                            arg1.method18(var16, (byte) 93, (var20.field6082 - arg3) * class19.field312 + (var21 - arg5) * class421.field6346, var20, arg0, var7, (var20.field6077 - arg4) * class19.field312 + (var22 - arg6) * class421.field6346);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lwk;)V", line = 187)
    public class463(class97 arg0) {
        this.field6872 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Llt;Ljava/lang/Object;I)V", line = 144)
    public static final void method2777(class480 arg0, Object arg1, int arg2) {
        field6875++;
        if (arg0.field7078 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 != 1001) {
            return;
        }
        while (var3 < 50 && arg0.field7078.peekEvent() != null) {
            class50.method470(1L, -5);
            var3++;
        }
        if (arg1 != null) {
            arg0.field7078.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 174)
    public static void method2778(int arg0) {
        if (arg0 <= -68) {
            field6876 = null;
        }
    }
}
