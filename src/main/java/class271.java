import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class271 extends class17 {

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "Ltn;")
    public static class60 field4022 = new class60(73, -1);

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "Ldv;")
    public static class477 field4027;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lp", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field4028;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "[Lcs;")
    private class230[] field4021;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1718(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class530("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)Z", line = 3)
    public static final boolean method1714(int arg0, int arg1) {
        ++field4025;
        if (arg1 != 10) {
            field4027 = null;
        }
        return ~arg0 == -10 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I", line = 16)
    public final int[] method27(int arg0, int arg1) {
        if (arg1 < 53) {
            field4022 = null;
        }
        ++field4023;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            this.method1717(0, super.field210.method2685((byte) 92));
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V", line = 39)
    public static void method1715(int arg0) {
        field4022 = null;
        if (arg0 < -127) {
            field4027 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lwm;II)V", line = 50)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field4020;
        if (arg1 == 0) {
            this.field4021 = new class230[arg0.method2357((byte) 104)];
            for (int var4 = 0; this.field4021.length > var4; ++var4) {
                int var5 = arg0.method2357((byte) 121);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field4021[var4] = class431.method2548(true, arg0);
                            }
                        } else {
                            this.field4021[var4] = class97.method685(false, arg0);
                        }
                    } else {
                        this.field4021[var4] = class487.method2810(arg0, 1);
                    }
                } else {
                    this.field4021[var4] = class278.method1740(arg0, true);
                }
            }
        } else if (~arg1 == -2) {
            super.field205 = arg0.method2357((byte) 118) == 1;
        }
        if (arg2 != 5159) {
            field4027 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZLjava/awt/Component;)Ls;", line = 123)
    public static final class188 method1716(byte arg0, boolean arg1, Component arg2) {
        if (arg0 != 30) {
            return null;
        } else {
            ++field4024;
            try {
                Constructor var3 = Class.forName("rq").getDeclaredConstructor(field4028 != null ? field4028 : (field4028 = method1718("java.awt.Component")), Boolean.TYPE);
                return (class188) var3.newInstance(arg2, new Boolean(arg1));
            } catch (Throwable var4) {
                return new class443(arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V", line = 144)
    public class271() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)[[I", line = 151)
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -25) {
            return null;
        } else {
            ++field4019;
            int[][] var3 = super.field201.method1851(arg0, (byte) -56);
            if (super.field201.field4431) {
                int var4 = class530.field7763;
                int var5 = class178.field2556;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field201.method1849(true);
                this.method1717(arg1 + 25, var6);
                for (int var8 = 0; ~var8 > ~class178.field2556; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class530.field7763 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class239.method1507(255, var15) << 4;
                        var12[var14] = class239.method1507(4080, var15 >> 4);
                        var11[var14] = class239.method1507(var15 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[[I)V", line = 215)
    private final void method1717(int arg0, int[][] arg1) {
        ++field4026;
        int var3 = class530.field7763;
        int var4 = class178.field2556;
        class286.method1767(arg1, 115);
        class405.method2399(class38.field417, class43.field499, 100, 0, arg0);
        if (this.field4021 != null) {
            for (int var5 = 0; ~this.field4021.length < ~var5; ++var5) {
                class230 var6 = this.field4021[var5];
                int var7 = var6.field3394;
                int var8 = var6.field3389;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method406(arg0, var4, var3);
                    } else {
                        var6.method409(var4, var3, (byte) -85);
                    }
                } else if (var8 >= 0) {
                    var6.method408(var4, var3, 0);
                }
            }
        }
    }
}
