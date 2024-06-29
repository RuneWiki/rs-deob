import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class735 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Liha;")
    private class29 field10781 = new class29(256);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ld;")
    private class158 field10770;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lvf;")
    private class159 field10772;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10786 = new String[] { method5347(method5346("tTC`CrT[fClPSm\b}A\u001b@\u000e}PFr\u0004|YPN\u000ftPVu")), method5347(method5346("zQ\u001bHE")), method5347(method5346("rZTe]")), method5347(method5346("mPA@\u000e}PFr\u0004|YP")), method5347(method5346("}C")), method5347(method5346("tTC`CrT[fC]YTr\u001e")), method5347(method5346("tTC`CrT[fCMAGh\u0003y")), method5347(method5346("tTC`CrT[fCL@[u\u0004sP")), method5347(method5346("e\u001b\u001b/\u0010")), method5347(method5346("p@Ym")), method5347(method5346("zQ\u001bKE")), method5347(method5346("zQ\u001b@E")), method5347(method5346("zQ\u001bGE")), method5347(method5346("zQ\u001bEE")), method5347(method5346("zQ\u001b=\u0004p\\A?E")), method5347(method5346("zQ\u001bBE")), method5347(method5346("zQ\u001bCE")), method5347(method5346("zQ\u001bIE")), method5347(method5346("zQ\u001bFE")), method5347(method5346("zQ\u001bDE")) };

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field10782 = 0;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field10771;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field10773;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field10774;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field10775;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field10776;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field10777;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field10778;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lqea;")
    public static class135 field10779;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lgda;")
    public static class58 field10780;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field10785;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5345(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BFFFFFFI)F", line = 4)
    public static final float method5335(byte arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
        try {
            field10783++;
            float var8 = 0.0F;
            float var9 = arg5 - arg2;
            float var10 = arg6 - arg4;
            float var11 = arg3 - arg1;
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;
            int var15 = -42 % ((arg0 - 8) / 40);
            while (var8 < 1.1F) {
                float var16 = var8 * var9 + arg2;
                float var17 = var8 * var10 + arg4;
                float var18 = var8 * var11 + arg1;
                int var19 = (int) var16 >> 9;
                int var20 = (int) var18 >> 9;
                if (var19 > 0 && var20 > 0 && var19 < class126.field1823 && var20 < class169.field2725) {
                    int var21 = class438.field6846.field9975;
                    if (var21 < 3 && (class224.field3519[1][var19][var20] & 0x2) != 0) {
                        var21++;
                    }
                    int var22 = class493.field7420[var21].method2497((byte) -77, (int) var16, (int) var18);
                    if ((float) var22 < var17) {
                        if (arg7 < 2) {
                            return var8;
                        }
                        return method5335((byte) -50, var14, var12, var18, var13, var16, var17, arg7 - 1) * 0.1F + (var8 - 0.1F);
                    }
                }
                var8 += 0.1F;
                var14 = var18;
                var13 = var17;
                var12 = var16;
            }
            return -1.0F;
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field10786[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z", line = 71)
    public static final boolean method5336(int arg0, int arg1, int arg2) {
        try {
            field10775++;
            if (arg0 != 20889) {
                field10782 = -65;
            }
            return (class685.method4990(arg1, arg2, true) | class665.method4823(arg2, (byte) 43, arg1) | class654.method4771(arg2, -100, arg1)) & class327.method2781(arg1, true, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10786[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 83)
    public final void method5337(byte arg0) {
        try {
            field10773++;
            if (arg0 < 73) {
                method5336(80, -22, 108);
            }
            this.field10781.method294(5, -630);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10786[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZ)V", line = 94)
    public static final void method5338(boolean arg0, boolean arg1) {
        try {
            if (arg0) {
                if (class317.field5175 != -1) {
                    class309.method2650((byte) -88, class317.field5175);
                }
                for (class23 var2 = (class23) class632.field9082.method735(0); var2 != null; var2 = (class23) class632.field9082.method734((byte) -50)) {
                    if (!var2.method4170(-119)) {
                        var2 = (class23) class632.field9082.method735(0);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class52.method541(false, var2, true, (byte) -55);
                }
                class317.field5175 = -1;
                class632.field9082 = new class69(8);
                class791.method5692(64);
                class317.field5175 = class36.field419;
                class210.method1900(false, (byte) 95);
                class30.method318(-91);
                class598.method4384(class317.field5175);
            }
            field10774++;
            class746.method5425(true);
            class237.field3642 = false;
            class46.method468(arg1);
            class561.field8156 = -1;
            class516.method3869((byte) -103, class550.field8064);
            class438.field6846 = new class738();
            class438.field6846.field9983 = class169.field2725 * 512 / 2;
            class438.field6846.field9985 = class126.field1823 * 512 / 2;
            class438.field6846.field1201[0] = class126.field1823 / 2;
            class438.field6846.field1200[0] = class169.field2725 / 2;
            class133.field1896 = 0;
            class791.field11550 = 0;
            if (class401.field6334 == 2) {
                class791.field11550 = class6.field47 << 9;
                class133.field1896 = class30.field323 << 9;
            } else {
                class266.method2305(2);
            }
            class262.method2282(!arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10786[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 155)
    public final void method5339(byte arg0) {
        try {
            if (arg0 != 27) {
                this.method5339((byte) 46);
            }
            this.field10781.method304(1);
            field10776++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10786[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(FB)F", line = 167)
    public static final float method5340(float arg0, byte arg1) {
        try {
            field10771++;
            if (arg1 != -82) {
                method5340(0.18503077F, (byte) 60);
            }
            return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10786[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 184)
    public static void method5341(boolean arg0) {
        try {
            field10780 = null;
            field10779 = null;
            if (arg0) {
                method5336(61, -105, 81);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10786[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Z", line = 195)
    public static final boolean method5342(String arg0, Class arg1, byte arg2) {
        try {
            field10777++;
            Class var3 = (Class) class39.field445.get(arg0);
            if (var3 != null) {
                return var3.getClassLoader() == arg1.getClassLoader();
            }
            if (arg2 != -8) {
                field10782 = 2;
            }
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class134.field1901.get(arg0);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName(field10786[7]);
                    Class var6 = Class.forName(field10786[0]);
                    Method var7 = var6.getDeclaredMethod(field10786[3], Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod(field10786[2], Class.forName(field10786[5]), Class.forName(field10786[6]));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class39.field445.put(arg0, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var4.getPath());
                    class39.field445.put(arg0, field10785 == null ? (field10785 = method5345(field10786[4])) : field10785);
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field10786[1] + (arg0 == null ? field10786[9] : field10786[8]) + ',' + (arg1 == null ? field10786[9] : field10786[8]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I", line = 267)
    public static final int method5343(int arg0, int arg1, int arg2, int arg3) {
        try {
            field10778++;
            int var4 = 255 - arg1;
            int var7 = ((arg2 & arg0) * arg1 & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
            return (((arg3 & 0xFF00) * var4 & 0xFF0000 | (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var7;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10786[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Lkia;", line = 278)
    public final class649 method5344(int arg0, byte arg1) {
        try {
            field10784++;
            Object var3 = this.field10781.method302(-95, (long) arg0);
            if (var3 != null) {
                return (class649) var3;
            }
            if (arg1 < 37) {
                this.field10781 = null;
            }
            if (!this.field10770.method1417((byte) -55, arg0)) {
                return null;
            }
            class304 var4 = this.field10770.method1419(arg0, -100);
            int var5 = var4.field4911 ? 64 : this.field10772.field2366;
            class649 var7;
            if (var4.field4898 && this.field10772.method167()) {
                float[] var6 = this.field10770.method1418(var5, 31922, arg0, 0.7F, false, var5);
                var7 = new class649(this.field10772, 3553, 34842, var5, var5, var4.field4904 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4892 != 2 && class143.method1327(51, var4.field4913)) {
                    var8 = this.field10770.method1420(var5, true, var5, arg0, 0.7F, -7385);
                } else {
                    var8 = this.field10770.method1415(arg0, 0.7F, var5, var5, 28039, false);
                }
                var7 = new class649(this.field10772, 3553, 6408, var5, var5, var4.field4904 != 0, var8, 0, 0, false);
            }
            var7.method4732(var4.field4909, 124, var4.field4912);
            this.field10781.method295(false, (long) arg0, var7);
            return var7;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10786[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lvf;Ld;)V", line = 335)
    public class735(class159 arg0, class158 arg1) {
        try {
            this.field10770 = arg1;
            this.field10772 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10786[14] + (arg0 == null ? field10786[9] : field10786[8]) + ',' + (arg1 == null ? field10786[9] : field10786[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5346(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5347(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
