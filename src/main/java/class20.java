import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class20 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
    public static int[] field271 = new int[14];

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field287 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lf;")
    public static class201 field289;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Loa;)V", line = 13)
    public static final void method106(class153 arg0) {
        for (int var1 = arg0.field2371; var1 <= arg0.field2355; var1++) {
            for (int var2 = arg0.field2366; var2 <= arg0.field2361; var2++) {
                class204 var3 = class324.field5032[arg0.field2367][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3360; var4++) {
                        if (var3.field3343[var4] == arg0) {
                            var3.field3360--;
                            for (int var5 = var4; var5 < var3.field3360; var5++) {
                                var3.field3343[var5] = var3.field3343[var5 + 1];
                                var3.field3355[var5] = var3.field3355[var5 + 1];
                            }
                            var3.field3343[var3.field3360] = null;
                            break;
                        }
                    }
                    var3.field3354 = 0;
                    for (int var6 = 0; var6 < var3.field3360; var6++) {
                        var3.field3354 |= var3.field3355[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 70)
    public static void method107(int arg0) {
        field287 = null;
        if (arg0 == -14537) {
            field271 = null;
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 87)
    public static final void method108(int arg0, int arg1, int arg2, int arg3) {
        field292++;
        class344 var4 = class110.method759(11, arg0, false);
        var4.method2390((byte) -53);
        var4.field5349 = arg2;
        if (arg3 != -3169) {
            field297 = -44;
        }
        var4.field5354 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 107)
    public static final Object method109(boolean arg0, int arg1, byte[] arg2) {
        field277++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class330.field5085) {
            try {
                class14 var3 = (class14) Class.forName("nl").getDeclaredConstructor().newInstance();
                var3.method78(arg2, -121);
                return var3;
            } catch (Throwable var5) {
                class330.field5085 = true;
            }
        }
        if (arg1 > -16) {
            field289 = (class201) null;
        }
        return arg0 ? class315.method2215(arg2, (byte) 93) : arg2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V", line = 141)
    public static final void method110(int arg0, byte arg1) {
        field284++;
        class344 var2 = class110.method759(9, arg0, false);
        var2.method2384(-27354);
        if (arg1 != -40) {
            method110(4, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;SIIJ)V", line = 181)
    public static final void method111(String arg0, int arg1, int arg2, String arg3, short arg4, int arg5, int arg6, long arg7) {
        if (arg6 != 1) {
            field289 = (class201) null;
        }
        field299++;
        if (class196.field3204 || class185.field3070 >= 500) {
            return;
        }
        class168.field2777[class185.field3070] = arg0;
        class157.field2458[class185.field3070] = arg3;
        class212.field3474[class185.field3070] = arg5 == -1 ? class222.field3560 : arg5;
        class113.field1727[class185.field3070] = arg4;
        class190.field3108[class185.field3070] = arg7;
        class193.field3155[class185.field3070] = arg2;
        class343.field5338[class185.field3070] = arg1;
        class185.field3070++;
    }
}
