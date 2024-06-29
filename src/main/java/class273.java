import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class273 implements class5 {

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Lfga;")
    private class276 field3965;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[I")
    public int[] field3963;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Liu;")
    private class510 field3959;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[F")
    public float[] field3958;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class378.method2370(arg0, this.field3965.field3986.field4958, arg5, arg7 ? this.field3958 : null, arg4, this.field3963, arg1, arg6 ? this.field3965.field3986.field4956 : null, this.field3962, arg3, arg7 ? this.field3965.field4027 : null, arg2, (byte) -36);
        field3955++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class378.method2370(arg0, this.field3962, arg5, arg7 ? this.field3965.field4027 : null, arg4, this.field3965.field3986.field4956, arg1, arg6 ? this.field3963 : null, this.field3965.field3986.field4958, arg3, arg7 ? this.field3958 : null, arg2, (byte) -36);
        field3961++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Luq;IIIII)V")
    public static final void method1834(class318 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class370.field5229 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class61.field877) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class713.field9959 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class262 var14 = class137.field1948[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class433.field6043[var11].method2171(var13, var12, 31) + class433.field6043[var11].method2171(var13, var12 + 1, 31) + class433.field6043[var11].method2171(var13 + 1, var12, 31) + class433.field6043[var11].method2171(var13 + 1, var12 + 1, 31)) / 4 - (class433.field6043[arg1].method2171(arg3, arg2, 31) + class433.field6043[arg1].method2171(arg3, arg2 + 1, 31) + class433.field6043[arg1].method2171(arg3 + 1, arg2, 31) + class433.field6043[arg1].method2171(arg3 + 1, arg2 + 1, 31)) / 4;
                                    class91 var16 = var14.field3845;
                                    class91 var17 = var14.field3842;
                                    if (var16 != null && var16.method642((byte) 2)) {
                                        arg0.method648((byte) -107, class441.field6132, var6, var15, var16, (var13 - arg3) * class368.field5213 + (1 - arg5) * class292.field4190, (var12 - arg2) * class368.field5213 + (1 - arg4) * class292.field4190);
                                    }
                                    if (var17 != null && var17.method642((byte) 2)) {
                                        arg0.method648((byte) -69, class441.field6132, var6, var15, var17, (var13 - arg3) * class368.field5213 + (1 - arg5) * class292.field4190, (var12 - arg2) * class368.field5213 + (1 - arg4) * class292.field4190);
                                    }
                                    for (class638 var18 = var14.field3846; var18 != null; var18 = var18.field8564) {
                                        class395 var19 = var18.field8567;
                                        if (var19 != null && var19.method642((byte) 2) && (var19.field5680 == var12 || var7 == var12) && (var19.field5673 == var13 || var9 == var13)) {
                                            int var20 = var19.field5683 + 1 - var19.field5680;
                                            int var21 = var19.field5679 + 1 - var19.field5673;
                                            arg0.method648((byte) -89, class441.field6132, var6, var15, var19, (var19.field5673 - arg3) * class368.field5213 + (var21 - arg5) * class292.field4190, (var19.field5680 - arg2) * class368.field5213 + (var20 - arg4) * class292.field4190);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static final void method1835(byte arg0) {
        class507.method3048(false, 64);
        int var1 = -90 / ((arg0 + 57) / 49);
        field3960++;
        if (class357.field5129 >= 0 && class357.field5129 != 0) {
            class393.method2459(class357.field5129, false, 1);
            class357.field5129 = -1;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lfga;Lfd;Liu;)V")
    public class273(class276 arg0, class298 arg1, class510 arg2) {
        this.field3965 = arg0;
        if ((arg1 instanceof class716)) {
            class716 var5 = (class716) arg1;
            this.field3962 = var5.field8469;
            this.field3963 = var5.field9981;
            this.field3956 = var5.field8493;
        } else if ((arg1 instanceof class358)) {
            class358 var4 = (class358) arg1;
            this.field3962 = var4.field8469;
            this.field3956 = var4.field8493;
            this.field3963 = var4.field5133;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field3959 = arg2;
            if (this.field3959.field7072 != this.field3962 || this.field3959.field7071 != this.field3956) {
                throw new RuntimeException();
            }
            this.field3958 = this.field3959.field7067;
        }
    }
}
