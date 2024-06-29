import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class250 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
    public boolean field3198 = false;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lub;")
    public static class18 field3196 = new class18();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lik;")
    public class140 field3204;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[Lvn;")
    public static class205[] field3208;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1513(String arg0, int arg1) {
        field3195++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class465.method2803(arg0, (byte) 115);
        if (var2 == null || arg1 != 32) {
            return;
        }
        for (int var3 = 0; var3 < class280.field3555; var3++) {
            String var4 = class329.field4163[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class465.method2803(var4, (byte) 75);
            if (var5 != null && var5.equals(var2)) {
                class280.field3555--;
                for (int var6 = var3; var6 < class280.field3555; var6++) {
                    class329.field4163[var6] = class329.field4163[var6 + 1];
                    class106.field1341[var6] = class106.field1341[var6 + 1];
                    class401.field5710[var6] = class401.field5710[var6 + 1];
                    class517.field7490[var6] = class517.field7490[var6 + 1];
                    class444.field6364[var6] = class444.field6364[var6 + 1];
                    class63.field824[var6] = class63.field824[var6 + 1];
                }
                class72.field932 = class160.field2037;
                class87.field1085++;
                class282.method1669(class166.field2116, false);
                class40.field511.method2729(class463.method2733(-103, arg0), false);
                class40.field511.method2769(arg0, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lya;BIZ)Ll;")
    public final class16 method1514(class38 arg0, byte arg1, int arg2, boolean arg3) {
        field3206++;
        long var5 = (long) (arg2 << 16 | this.field3199 | (arg3 ? 262144 : 0) | arg0.field497 << 19);
        if (arg1 != -81) {
            this.field3204 = null;
        }
        class16 var7 = (class16) this.field3204.field1812.method2647(-119, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field3204.field1811.method486(false, this.field3199)) {
            class311 var8 = class311.method1816(this.field3204.field1811, this.field3199, 0);
            if (var8 != null) {
                var8.field3975 = var8.field3976 = var8.field3973 = var8.field3978 = 0;
                if (arg3) {
                    var8.method1822();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1823();
                }
            }
            class16 var10 = arg0.method345(var8, true);
            if (var10 != null) {
                this.field3204.field1812.method2635(var5, -26591, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1515(int arg0) {
        if (arg0 != 26686) {
            field3209 = -101;
        }
        field3208 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1516(String arg0, byte arg1) {
        int var2 = 37 / ((14 - arg1) / 52);
        field3200++;
        long var3 = 0L;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var3 *= 37L;
            char var7 = arg0.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var3 += (var7 - 64);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var3 += (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var3 += (var7 + 27 - 48);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method1517(int arg0) {
        for (int var1 = 0; var1 < class284.field3612; var1++) {
            int var2 = class2.field11[var1];
            class295 var3 = class187.field2446[var2];
            int var4 = class513.field7443.method2737(false);
            if ((var4 & 0x20) != 0) {
                var4 += class513.field7443.method2737(false) << 8;
            }
            if ((var4 & 0x100) != 0) {
                var3.field4867 = class513.field7443.method2741((byte) 118);
                var3.field4914 = class513.field7443.method2756(109);
                var3.field4847 = class513.field7443.method2793(32767);
                var3.field4922 = (byte) class513.field7443.method2742((byte) -124);
                var3.field4929 = class163.field2065 + class513.field7443.method2758((byte) 96);
                var3.field4868 = class163.field2065 + class513.field7443.method2786(255);
            }
            if ((var4 & 0x8) != 0) {
                int var5 = class513.field7443.method2763(-514944944);
                int var6 = class513.field7443.method2776((byte) -27);
                var3.method2130(var5, var6, class163.field2065, -4867);
                var3.field4921 = class163.field2065 + 300;
                var3.field4856 = class513.field7443.method2776((byte) -27);
            }
            if ((var4 & 0x400) != 0) {
                var3.field3772 = class513.field7443.method2772((byte) 124);
                var3.field3784 = class513.field7443.method2775(-4672);
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class513.field7443.method2786(255);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class513.field7443.method2746((byte) 75);
                int var9 = class513.field7443.method2743(false);
                var3.method2127(var8, 32042, var7, var9, true);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field4843 = class513.field7443.method2741((byte) -117);
                var3.field4917 = class513.field7443.method2752(2);
                var3.field4919 = class513.field7443.method2752(2);
                var3.field4931 = class513.field7443.method2793(32767);
                var3.field4844 = class513.field7443.method2772((byte) 124) + class163.field2065;
                var3.field4842 = class513.field7443.method2758((byte) 107) + class163.field2065;
                var3.field4863 = class513.field7443.method2742((byte) -109);
                var3.field4917 += var3.field4936[0];
                var3.field4931 += var3.field4936[0];
                var3.field4943 = 0;
                var3.field4941 = 1;
                var3.field4843 += var3.field4944[0];
                var3.field4919 += var3.field4944[0];
            }
            if ((var4 & 0x800) != 0) {
                int var10 = class513.field7443.method2758((byte) 78);
                var3.field4898 = class513.field7443.method2737(false);
                var3.field4855 = class513.field7443.method2743(false);
                var3.field4850 = var10 & 0x7FFF;
                var3.field4891 = (var10 & 0x8000) != 0;
                var3.field4877 = var3.field4898 + var3.field4850 + class163.field2065;
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class513.field7443.method2775(-4672);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class513.field7443.method2743(false);
                class463.method2744(var11, 0, var12, var3);
            }
            if ((var4 & 0x80) != 0) {
                var3.field4869 = class513.field7443.method2768((byte) -93);
                var3.field4932 = 100;
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field3773.method2908(true)) {
                    class492.method2988(var3, 0);
                }
                var3.method1731(-16385, class390.field5244.method1327(class513.field7443.method2758((byte) 97), (byte) -128));
                var3.method2133(false, var3.field3773.field6921);
                var3.field4911 = var3.field3773.field6919 << 3;
                if (var3.field3773.method2908(true)) {
                    class244.method1483(null, var3.field4936[0], 0, null, (byte) -123, var3.field4944[0], var3.field2676, var3);
                }
            }
            if ((var4 & 0x2000) != 0) {
                int var13 = class513.field7443.method2743(false);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class513.field7443.method2775(-4672);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class513.field7443.method2737(false);
                    var16[var17] = class513.field7443.method2772((byte) 126);
                }
                class160.method1030(0, var3, var16, var14, var15);
            }
            if ((var4 & 0x2) != 0) {
                int var19 = class513.field7443.method2775(-4672);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class513.field7443.method2728((byte) -125);
                int var21 = class513.field7443.method2776((byte) -27);
                var3.method2127(var20, 32042, var19, var21, false);
            }
            if ((var4 & 0x4) != 0) {
                int var22 = class513.field7443.method2763(-514944944);
                int var23 = class513.field7443.method2737(false);
                var3.method2130(var22, var23, class163.field2065, -4867);
            }
            if ((var4 & 0x1) != 0) {
                var3.field4895 = class513.field7443.method2786(255);
                if (var3.field4895 == 65535) {
                    var3.field4895 = -1;
                }
            }
        }
        if (arg0 <= 103) {
            method1513(null, 119);
        }
        field3203++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLfh;)V")
    public final void method1518(byte arg0, class463 arg1) {
        if (arg0 != 54) {
            this.method1520(38, false, null);
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field3197++;
                return;
            }
            this.method1520(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Lqd;")
    public static final class314 method1519(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7130;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLfh;)V")
    private final void method1520(int arg0, boolean arg1, class463 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field3199 = arg2.method2758((byte) 101);
        } else if (arg0 == 2) {
            this.field3202 = arg2.method2738(-67);
        } else if (arg0 == 3) {
            this.field3198 = true;
        } else if (arg0 == 4) {
            this.field3199 = -1;
        }
        field3201++;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z")
    public final boolean method1521(int arg0) {
        if (arg0 < 83) {
            this.method1521(100);
        }
        field3205++;
        return this.field3204.field1811.method486(false, this.field3199);
    }

    static {
        new class335("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }
}
