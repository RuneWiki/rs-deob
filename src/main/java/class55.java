import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class55 extends class238 {

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lus;")
    public static class1 field743 = new class1(88, 8);

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "S")
    public static short field744 = 205;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "[I")
    public static int[] field745 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "Ldk;")
    public static class326 field746 = new class326("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public int field740;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field747;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field748;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field749;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "[Lkj;")
    public class366[] field734;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "[Lkj;")
    public class366[] field742;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "[[[B")
    public byte[][][] field736;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILtr;IBLsm;IILdt;)V")
    public static final void method343(int arg0, class176 arg1, int arg2, byte arg3, class171 arg4, int arg5, int arg6, class145 arg7) {
        field733++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class136.field1807 == 4) {
            var8 = (int) class157.field2346 & 0x3FFF;
        } else {
            var8 = (int) class157.field2346 + class84.field1032 & 0x3FFF;
        }
        if (arg3 < 71) {
            method343(-99, (class176) null, 106, (byte) 50, (class171) null, -81, 9, (class145) null);
        }
        int var9 = Math.max(arg7.field2010 / 2, arg7.field2021 / 2) + 10;
        int var10 = arg5 * arg5 + (arg0 * arg0);
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class53.field727[var8];
        int var12 = class53.field726[var8];
        if (class136.field1807 != 4) {
            var11 = var11 * 256 / (class216.field3251 + 256);
            var12 = var12 * 256 / (class216.field3251 + 256);
        }
        int var13 = arg0 * var11 + arg5 * var12 >> 15;
        int var14 = arg0 * var12 - (arg5 * var11) >> 15;
        arg1.method141(arg7.field2010 / 2 + var13 + (arg2 - arg1.method516() / 2), arg7.field2021 / 2 + -var14 + (arg6 - arg1.method524() / 2), arg4, arg2, arg6);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method344(int arg0) {
        field745 = null;
        field743 = null;
        field746 = null;
        int var1 = 85 % ((-arg0 - 37) / 57);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
    public static final void method345(byte arg0) {
        class22.method148((byte) -78, class250.field3695);
        field732++;
        class157.field2338++;
        if (class68.field860 && class490.field6899) {
            if (arg0 > -127) {
                field744 = -119;
            }
            int var1 = class262.field3832.method175(-92);
            int var2 = class262.field3832.method177(-112);
            int var3 = var2 - client.field2620;
            int var4 = var1 - class302.field4304;
            if (var4 < class346.field5021) {
                var4 = class346.field5021;
            }
            if (class250.field3695.field2010 + var4 > class346.field5021 + class29.field396.field2010) {
                var4 = class346.field5021 + class29.field396.field2010 - class250.field3695.field2010;
            }
            if (class487.field6862 > var3) {
                var3 = class487.field6862;
            }
            if ((class487.field6862 + class29.field396.field2021) < (class250.field3695.field2021 + var3)) {
                var3 = class487.field6862 + class29.field396.field2021 - class250.field3695.field2021;
            }
            int var5 = var4 + class29.field396.field2072 - class346.field5021;
            int var6 = var3 + class29.field396.field1938 - class487.field6862;
            if (class262.field3832.method1377((byte) 76)) {
                if (class250.field3695.field1932 < class157.field2338) {
                    int var7 = var4 - class154.field2292;
                    int var8 = var3 - class293.field4255;
                    if (class250.field3695.field2022 < var7 || var7 < (-class250.field3695.field2022) || var8 > class250.field3695.field2022 || -class250.field3695.field2022 > var8) {
                        class48.field670 = true;
                    }
                }
                if (class250.field3695.field1989 != null && class48.field670) {
                    class202 var9 = new class202();
                    var9.field2966 = var5;
                    var9.field2971 = class250.field3695.field1989;
                    var9.field2976 = class250.field3695;
                    var9.field2972 = var6;
                    class290.method1818(var9);
                    return;
                }
            } else {
                if (class48.field670) {
                    class382.method2305(-124);
                    if (class250.field3695.field1918 != null) {
                        class202 var10 = new class202();
                        var10.field2976 = class250.field3695;
                        var10.field2972 = var6;
                        var10.field2971 = class250.field3695.field1918;
                        var10.field2966 = var5;
                        var10.field2969 = class53.field721;
                        class290.method1818(var10);
                    }
                    if (class53.field721 != null && client.method1132(class250.field3695) != null) {
                        class293.method1827(class53.field721, 0, class250.field3695);
                    }
                } else if ((class26.field339 == 1 || class253.method1577((byte) 73)) && class476.field6690 > 2) {
                    class482.method2820((byte) -121, class302.field4304 + class154.field2292, client.field2620 - -class293.field4255);
                } else if (class231.method1468(0)) {
                    class482.method2820((byte) -85, class302.field4304 + class154.field2292, client.field2620 + class293.field4255);
                }
                class250.field3695 = null;
            }
        } else if (class157.field2338 > 1) {
            class250.field3695 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lmj;Ljava/awt/Canvas;IILwp;I)Lnp;")
    public static final class313 method346(class430 arg0, Canvas arg1, int arg2, int arg3, class109 arg4, int arg5) {
        field731++;
        if (arg2 != 14015) {
            return null;
        }
        try {
            Class var6 = Class.forName("mi");
            Constructor var7 = var6.getConstructor(field747 == null ? (field747 = method348("java.awt.Canvas")) : field747, field748 == null ? (field748 = method348("wp")) : field748, Integer.TYPE, Integer.TYPE, field749 == null ? (field749 = method348("mj")) : field749);
            return (class313) var7.newInstance(arg1, arg4, Integer.valueOf(arg3), new Integer(arg5), arg0);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method347(String arg0, byte arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field739++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class333.field4842 : class53.field717) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class156 var11 = class226.method1452(arg1 ^ 0xFFFF7FCC, var8);
            if (var11.field2315 && var11.method980(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class40.field531 = null;
                    class321.field4652 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class40.field531 = var4;
        class45.field643 = 0;
        class321.field4652 = var5;
        String[] var9 = new String[class321.field4652];
        for (int var10 = 0; var10 < class321.field4652; var10++) {
            var9[var10] = class226.method1452(-32769, var4[var10]).method980(0);
        }
        if (arg1 != 51) {
            method343(49, (class176) null, -23, (byte) -2, (class171) null, -58, 94, (class145) null);
        }
        class116.method729(0, var9, class40.field531);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method348(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
