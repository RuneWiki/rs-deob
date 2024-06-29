import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class590 extends class142 {

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field8424 = 0;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "Z")
    public static boolean field8429 = false;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Lbw;")
    public class590 field8426;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "Lbw;")
    public class590 field8428;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "[J")
    public static long[] field8432;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "[Lsa;")
    public static class174[] field8430;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "[[B")
    public static byte[][] field8423;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
    public static void method3456(int arg0) {
        field8423 = null;
        field8430 = null;
        if (arg0 != -27393) {
            field8433 = 28;
        }
        field8432 = null;
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
    public final void method3457(int arg0) {
        if (arg0 != 60) {
            return;
        }
        field8425++;
        if (this.field8426 != null) {
            this.field8426.field8428 = this.field8428;
            this.field8428.field8426 = this.field8426;
            this.field8426 = null;
            this.field8428 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)I")
    public static final int method3458(int arg0, int arg1) {
        return class246.field3418 == null ? 0 : class246.field3418[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLbea;I)V")
    public static final void method3459(boolean arg0, class188 arg1, int arg2) {
        field8431++;
        if (class210.field2958 >= 400) {
            return;
        }
        if (class645.field9372 != arg1) {
            String var3;
            if (arg1.field2650 == 0) {
                boolean var4 = true;
                if (class645.field9372.field2655 != -1 && arg1.field2655 != -1) {
                    int var5 = arg1.field2632 >= class645.field9372.field2632 ? arg1.field2632 : class645.field9372.field2632;
                    int var6 = class645.field9372.field2655 < arg1.field2655 ? class645.field9372.field2655 : arg1.field2655;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class645.field9372.field2632 - arg1.field2632;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class37.field767 == class163.field2363 ? class124.field2028.method739(class173.field2491, 69) : class171.field2471.method739(class173.field2491, -119);
                if (arg1.field2632 < arg1.field2670) {
                    var3 = arg1.method1170(true, -11076) + (var4 ? class633.method3676(true, arg1.field2632, class645.field9372.field2632) : "<col=ffffff>") + " (" + var9 + arg1.field2632 + "+" + (arg1.field2670 - arg1.field2632) + ")";
                } else {
                    var3 = arg1.method1170(true, -11076) + (var4 ? class633.method3676(true, arg1.field2632, class645.field9372.field2632) : "<col=ffffff>") + " (" + var9 + arg1.field2632 + ")";
                }
            } else {
                var3 = arg1.method1170(true, -11076) + " (" + class612.field8811.method739(class173.field2491, 84) + arg1.field2650 + ")";
            }
            if (class493.field6904) {
                if (!arg0 && (class226.field3238 & 0x8) != 0) {
                    class157.field2325++;
                    class404.method2410(class494.field6922 + " -> <col=ffffff>" + var3, 0, (byte) -120, 0, 44, -1, true, (long) arg1.field607, class412.field5799, class65.field1111, false);
                }
            } else if (arg0) {
                class404.method2410("", 0, (byte) -120, 0, -1, 0, false, 0L, "<col=cccccc>" + var3, -1, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class151.field2289[var10] != null) {
                        short var11 = 0;
                        if (class245.field3415 == class163.field2363 && class151.field2289[var10].equalsIgnoreCase(class642.field9324.method739(class173.field2491, -107))) {
                            if (arg1.field2632 > class645.field9372.field2632) {
                                var11 = 2000;
                            }
                            if (class645.field9372.field2639 != 0 && arg1.field2639 != 0) {
                                if (class645.field9372.field2639 == arg1.field2639) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class258.field3600[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class65.field1113[var10] + var11);
                        int var13 = class630.field9231[var10] == -1 ? class212.field2998 : class630.field9231[var10];
                        class404.method2410("<col=ffffff>" + var3, 0, (byte) -120, 0, var12, -1, true, (long) arg1.field607, class151.field2289[var10], var13, false);
                        class553.field7628++;
                    }
                }
            }
            if (!arg0) {
                for (class442 var14 = (class442) class448.field6352.method456((byte) -52); var14 != null; var14 = (class442) class448.field6352.method460((byte) -102)) {
                    if (var14.field6298 == 5) {
                        var14.field6295 = "<col=ffffff>" + var3;
                        break;
                    }
                }
            }
            if (arg2 != 2098) {
                field8423 = null;
            }
        } else if (class493.field6904 && (class226.field3238 & 0x10) != 0) {
            class404.method2410(class494.field6922 + " -> <col=ffffff>" + class490.field6862.method739(class173.field2491, -127), 0, (byte) -120, 0, 60, -1, true, 0L, class412.field5799, class65.field1111, false);
            class513.field7219++;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
    public static final boolean method3460(int arg0, int arg1, int arg2) {
        field8427++;
        if (arg2 != -17342) {
            field8424 = 54;
        }
        return (arg1 & 0x800) != 0;
    }

    static {
        new class104("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
