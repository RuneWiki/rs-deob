import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class120 extends class35 {

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Lfg;")
    public static class18 field1872 = new class18(16);

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Lue;")
    public static class131 field1877;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1879;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field1880;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field1881;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lvj;IILcj;Ljava/awt/Canvas;I)Lja;")
    public static final class90 method1007(class177 arg0, int arg1, int arg2, class181 arg3, Canvas arg4, int arg5) {
        field1876++;
        try {
            Class var6 = Class.forName("ge");
            if (arg1 == 21124) {
                Constructor var7 = var6.getConstructor(field1879 == null ? (field1879 = method1011("java.awt.Canvas")) : field1879, field1880 == null ? (field1880 = method1011("cj")) : field1880, Integer.TYPE, Integer.TYPE, field1881 == null ? (field1881 = method1011("vj")) : field1881);
                return (class90) var7.newInstance(arg4, arg3, Integer.valueOf(arg5), new Integer(arg2), arg0);
            } else {
                return null;
            }
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BB)V")
    public static final void method1008(byte arg0, byte arg1) {
        if (class141.field2232 == null) {
            class141.field2232 = new byte[4][class183.field2703][class66.field1056];
        }
        field1878++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class183.field2703; var3++) {
                for (int var4 = 0; var4 < class66.field1056; var4++) {
                    class141.field2232[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 <= 96) {
            field1872 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
    public static final void method1009(int arg0, boolean arg1) {
        field1873++;
        int[] var2 = null;
        if (arg0 != 11260) {
            method1008((byte) -115, (byte) 107);
        }
        byte[][] var3;
        byte var4;
        if (arg1) {
            var4 = 1;
            var3 = class188.field2779;
        } else {
            var3 = class79.field1343;
            var4 = 4;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class11.method65((byte) 43);
            for (int var6 = 0; var6 < (class183.field2703 >> 3); var6++) {
                for (int var7 = 0; var7 < (class66.field1056 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class41.field630[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x35CDF7D) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFF7E1) >> 14;
                            int var13 = (var9 & 0x3FFF) >> 3;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class79.field1336.length; var15++) {
                                if (class79.field1336[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class230.method1712(class73.field1235, var6 * 8, var11, true, arg1, var12, var10, var13, var5, class322.field4646, var7 * 8, var3[var15]);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class170.method1305(var6 * 8, -24140, 8, var5, 8, var7 * 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class250.field3616 = null;
        } else {
            class250.field3616 = class276.method1971(var2[0], var2[1], var2[2], var2[3], arg0 - 11384);
            class121.field1891 = var2[4];
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    public static void method1010(int arg0) {
        if (arg0 < 78) {
            method1010(119);
        }
        field1872 = null;
        field1877 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1011(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
