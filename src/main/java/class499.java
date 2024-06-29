import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class499 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field6860 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;Lgfa;IIIII)V", line = 4)
    public static final void method2788(class638 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class552.field7467 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class137.field1931) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class22.field308 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class486 var15 = class658.field9266[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class144.field2149[var12].method273(var13, var14) + class144.field2149[var12].method273(var13 + 1, var14) + class144.field2149[var12].method273(var13, var14 + 1) + class144.field2149[var12].method273(var13 + 1, var14 + 1)) / 4 - (class144.field2149[arg2].method273(arg3, arg4) + class144.field2149[arg2].method273(arg3 + 1, arg4) + class144.field2149[arg2].method273(arg3, arg4 + 1) + class144.field2149[arg2].method273(arg3 + 1, arg4 + 1)) / 4;
                                    class86 var17 = var15.field6750;
                                    class86 var18 = var15.field6741;
                                    if (var17 != null && var17.method140(0)) {
                                        arg1.method143((var14 - arg4) * class658.field9268 + (1 - arg6) * class634.field8905, (var13 - arg3) * class658.field9268 + (1 - arg5) * class634.field8905, var17, 83, var16, var7, arg0);
                                    }
                                    if (var18 != null && var18.method140(0)) {
                                        arg1.method143((var14 - arg4) * class658.field9268 + (1 - arg6) * class634.field8905, (var13 - arg3) * class658.field9268 + (1 - arg5) * class634.field8905, var18, -105, var16, var7, arg0);
                                    }
                                    for (class20 var19 = var15.field6751; var19 != null; var19 = var19.field284) {
                                        class39 var20 = var19.field281;
                                        if (var20 != null && var20.method140(0) && (var20.field517 == var13 || var8 == var13) && (var20.field512 == var14 || var10 == var14)) {
                                            int var21 = var20.field516 + 1 - var20.field517;
                                            int var22 = var20.field519 + 1 - var20.field512;
                                            arg1.method143((var20.field512 - arg4) * class658.field9268 + (var22 - arg6) * class634.field8905, (var20.field517 - arg3) * class658.field9268 + (var21 - arg5) * class634.field8905, var20, 93, var16, var7, arg0);
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

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)Z", line = 94)
    public static final boolean method2789(int arg0, byte arg1, int arg2) {
        if (arg1 == -39) {
            field6859++;
            return (arg2 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 106)
    public static final int method2790(String arg0, int arg1) {
        field6858++;
        if (arg1 < 105) {
            method2789(-20, (byte) -30, -98);
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I", line = 122)
    public static final int method2791(byte arg0) {
        field6861++;
        int var1 = class120.field1650.method3736(true);
        if (var1 < class646.field9175.length - 1) {
            class120.field1650 = class646.field9175[var1 + 1];
        }
        int var2 = -97 % ((arg0 - 27) / 35);
        return 100;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;IJ)V", line = 137)
    public static final void method2792(class638 arg0, int arg1, long arg2) {
        if (arg1 > -117) {
            method2791((byte) -68);
        }
        field6857++;
        class469.field6568 = class472.field6587;
        class312.field4638 = 0;
        class472.field6587 = 0;
        long var4 = class680.method3756(-44);
        for (class401 var6 = (class401) class381.field5356.method3676((byte) 117); var6 != null; var6 = (class401) class381.field5356.method3682(-18176)) {
            if (var6.method2290(arg0, arg2)) {
                class312.field4638++;
            }
        }
        if (class605.field8439 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class381.field5356.method3681(true) + ", running: " + class312.field4638 + ". Particles: " + class472.field6587 + ". Time taken: " + (class680.method3756(-122) - var4) + "ms");
        }
    }
}
