import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class65 {

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Ljava/lang/String;")
    public String field825;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Loi;")
    public static class169 field820 = new class169("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Lad;")
    public static class11 field826 = new class11(32);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "Ldn;")
    public static class201 field823;

    @OriginalMember(owner = "client!gt", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILqa;)V", line = 11)
    public static final void method364(int arg0, class129 arg1) {
        field829++;
        if (!(class271.field3433 >= 2 || class515.field7573) || class465.field6838 != null || arg0 <= 49) {
            return;
        }
        String var2;
        if (class515.field7573 && class271.field3433 < 2) {
            var2 = class257.field3252 + class221.field2826.method1127(class379.field4920, false) + class195.field2532 + " ->";
        } else if (class354.field4549 && class439.field6113.method1488((byte) 124, 81) && class271.field3433 > 2) {
            var2 = class440.method2599((class502) class103.field1421.field64.field7455.field7455, (byte) 98);
        } else {
            class502 var3 = (class502) class103.field1421.field64.field7455;
            var2 = class440.method2599(var3, (byte) 127);
            int[] var4 = null;
            if (class5.method27(var3.field7390, (byte) 103)) {
                var4 = class89.field1238.method111((int) var3.field7388, -88).field7288;
            } else if (var3.field7384 != -1) {
                var4 = class89.field1238.method111(var3.field7384, 56).field7288;
            } else if (class138.method962(var3.field7390, 118)) {
                class295 var7 = class527.field7791[(int) var3.field7388];
                if (var7 != null) {
                    class10 var8 = var7.field3831;
                    if (var8.field111 != null) {
                        var8 = var8.method63(false, class198.field2555);
                    }
                    if (var8 != null) {
                        var4 = var8.field126;
                    }
                }
            } else if (class215.method1369(var3.field7390, -47)) {
                Object var5 = null;
                class402 var6;
                if (var3.field7390 == 1004) {
                    var6 = class52.field715.method1164((int) var3.field7388, 0);
                } else {
                    var6 = class52.field715.method1164((int) (var3.field7388 >>> 32 & 0x7FFFFFFFL), 0);
                }
                if (var6.field5419 != null) {
                    var6 = var6.method2393(class198.field2555, (byte) 32);
                }
                if (var6 != null) {
                    var4 = var6.field5375;
                }
            }
            if (var4 != null) {
                var2 = var2 + class158.method1065((byte) -67, var4);
            }
        }
        if (class271.field3433 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class271.field3433 - 2) + class473.field6916.method1127(class379.field4920, false);
        }
        if (class42.field614 != null) {
            class167 var9 = class42.field614.method2502(-1, arg1);
            if (var9 == null) {
                var9 = class200.field2590;
            }
            var9.method1108(class42.field614.field5671, class275.field3511, class42.field614.field5726, class42.field614.field5736, class42.field614.field5735, class294.field3817, class260.field3300, class42.field614.field5728, class42.field614.field5663, class53.field727, class270.field3427, class129.field1766, (byte) 121, var2, class374.field4857);
            class475.method2855(class129.field1766[3], class129.field1766[1], class129.field1766[0], 0, class129.field1766[2]);
        } else if (class502.field7378 != null && class494.field7234 == class276.field3527) {
            int var10 = class200.field2590.method1104(11625, 0, class447.field6211 + 4, class270.field3427, class371.field4809 + 16, var2, class374.field4857, class53.field727, 16777215, class260.field3300);
            class475.method2855(16, class371.field4809, class447.field6211 + 4, 0, var10 + class157.field2070.method1704((byte) 127, var2));
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)I", line = 110)
    public static final int method365(int arg0, boolean arg1) {
        field830++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else {
            if (arg1) {
                field821 = 63;
            }
            if (arg0 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lit;", line = 150)
    public static final class388 method366(byte arg0, int arg1) {
        field822++;
        class388 var2 = (class388) class133.field1808.method78((long) arg1, (byte) -106);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 3) {
            return null;
        } else {
            byte[] var3 = class406.field5437.method1313((byte) -109, 1, arg1);
            class388 var4 = new class388();
            var4.field5103 = arg1;
            if (var3 != null) {
                var4.method2311((byte) -128, new class88(var3));
            }
            var4.method2309((byte) -106);
            if (var4.field5090 == 2 && class376.field4893.method2085((long) arg1, -5423) == null) {
                class376.field4893.method2096((long) arg1, new class206(class237.field3089), (byte) 76);
                class448.field6223[class237.field3089++] = var4;
            }
            class133.field1808.method88((long) arg1, 39, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 206)
    public static void method367(int arg0) {
        field820 = null;
        if (arg0 == 34844) {
            field823 = null;
            field826 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 218)
    public class65(String arg0, int arg1) {
        this.field828 = arg1;
        this.field825 = arg0;
    }
}
