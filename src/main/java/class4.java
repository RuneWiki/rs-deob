import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class12 {

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Lvf;")
    public class265 field59;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lvf;")
    public static class265 field53 = class87.method582(-46, "hint_headicons");

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[Z")
    public static boolean[] field50 = new boolean[100];

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[J")
    public static long[] field55 = new long[100];

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Z")
    public static boolean field61 = false;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
    public static int[] field65 = new int[50];

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lvf;")
    public static class265 field62 = class87.method582(-46, "::replacecanvas");

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Lvf;")
    public static class265 field66 = class87.method582(-46, "");

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lvf;")
    public static class265 field58 = field66;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lvf;")
    public static class265 field51 = field66;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lak;")
    public static class269 field52 = new class269(32);

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "[Lsd;")
    public static class23[] field67 = new class23[32768];

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public static final void method25(int arg0, int arg1) {
        field63++;
        if (arg0 != 0) {
            field55 = null;
        }
        class178 var2 = class188.method1282(arg1, 12, 261360480);
        var2.method1160(120);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static void method26(int arg0) {
        field58 = null;
        field65 = null;
        field51 = null;
        field50 = null;
        if (arg0 != 2) {
            method25(-65, 26);
        }
        field67 = null;
        field52 = null;
        field62 = null;
        field66 = null;
        field53 = null;
        field55 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public static final int method27(int arg0, int arg1, int arg2) {
        field54++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (arg0 != 23024) {
                method29((String) null, -2);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method28(int arg0, Throwable arg1, String arg2) {
        field49++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class223.method1517(arg1, 1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            method29(var3, 113);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            int var8 = 99 % ((arg0 + 2) / 43);
            if (class187.field3374.field4024 != null) {
                class114 var9 = class187.field3374.method1539((byte) -116, new URL(class187.field3374.field4024.getCodeBase(), "clienterror.ws?c=" + class277.field4889 + "&u=" + class276.field4873 + "&v1=" + class226.field4020 + "&v2=" + class226.field4015 + "&e=" + var7));
                while (var9.field1996 == 0) {
                    class19.method136(1, 1L);
                }
                if (var9.field1996 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field1997;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method29(String arg0, int arg1) {
        field60++;
        if (arg1 <= 56) {
            field50 = null;
        }
        for (int var2 = arg0.indexOf("%0a"); var2 != -1; var2 = arg0.indexOf("%0a", var2)) {
            arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
        }
        System.out.println("Error: " + arg0);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class4() {
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)I")
    public static final int method30(int arg0, int arg1) {
        if (arg1 > -43) {
            field62 = null;
        }
        field64++;
        return arg0 == 16711935 ? -1 : class238.method1592(arg0, (byte) 111);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lvf;I)V")
    public class4(class265 arg0, int arg1) {
        this.field59 = arg0;
    }
}
