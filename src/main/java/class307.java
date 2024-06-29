import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class307 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Lod;")
    private class349 field4409;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "J")
    public long field4413;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "[C")
    public static char[] field4410 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "Z")
    public static boolean field4418 = false;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "Lki;")
    public static class498 field4421;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "[I")
    public static int[] field4423;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Lf;")
    public static class529 field4412;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "[Lna;")
    public static class35[] field4415;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILjava/awt/Component;Lji;II)Lfe;")
    public static final class400 method1931(int arg0, Component arg1, class432 arg2, int arg3, int arg4) {
        field4422++;
        if (class366.field5600 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class400 var5 = (class400) Class.forName("qp").getDeclaredConstructor().newInstance();
                var5.field5992 = new int[(class323.field4619 ? 2 : 1) * 256];
                var5.field6012 = arg4;
                var5.method2324(arg1);
                var5.field6005 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field6005 > 16384) {
                    var5.field6005 = 16384;
                }
                var5.method2320(var5.field6005);
                if (class378.field5761 > 0 && class290.field4170 == null) {
                    class290.field4170 = new class461();
                    class290.field4170.field6848 = arg2;
                    arg2.method2595(class290.field4170, class378.field5761, arg3 + 542);
                }
                if (class290.field4170 != null) {
                    if (class290.field4170.field6843[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class290.field4170.field6843[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg3 != -458) {
                        field4412 = null;
                    }
                    class379 var6 = new class379(arg2, arg0);
                    var6.field6012 = arg4;
                    var6.field5992 = new int[(class323.field4619 ? 2 : 1) * 256];
                    var6.method2324(arg1);
                    var6.field6005 = 16384;
                    var6.method2320(var6.field6005);
                    if (class378.field5761 > 0 && class290.field4170 == null) {
                        class290.field4170 = new class461();
                        class290.field4170.field6848 = arg2;
                        arg2.method2595(class290.field4170, class378.field5761, 75);
                    }
                    if (class290.field4170 != null) {
                        if (class290.field4170.field6843[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class290.field4170.field6843[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class400();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method1932(int arg0) {
        if (arg0 != 13092) {
            field4410 = null;
        }
        field4412 = null;
        field4410 = null;
        field4423 = null;
        field4415 = null;
        field4421 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I")
    public static final int method1933(int arg0, int arg1) {
        if (arg1 != 32033) {
            method1936((byte) -9, true, 45);
        }
        field4420++;
        if (class90.field1361 != null) {
            class90.field1361.method2312(false);
            class90.field1361 = null;
        }
        class353.field5404++;
        if (class353.field5404 > 4) {
            class353.field5404 = 0;
            class164.field2420 = 0;
            return arg0;
        }
        if (class484.field7104 == class323.field4625) {
            class484.field7104 = class257.field3800;
        } else {
            class484.field7104 = class323.field4625;
        }
        class164.field2420 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V")
    public static final void method1934(int arg0, int arg1, int arg2) {
        field4414++;
        class83.field1289 = arg0 - class460.field6825;
        class521.field7721 = arg2 - class460.field6818;
        if (arg1 != -5) {
            field4423 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4409.method2171((byte) 57, this.field4413);
        field4411++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZI)V")
    public static final void method1935(boolean arg0, int arg1) {
        field4419++;
        if (arg0 && class460.field6800 != null) {
            class1.field4 = class460.field6800.field1581;
        } else {
            class1.field4 = -1;
        }
        class482.field7062 = 0;
        class365.field5583 = null;
        class460.field6800 = null;
        class166.field2455 = null;
        class460.method2759();
        class460.field6814.method817(-4);
        class209.field3010 = null;
        class402.field6045 = null;
        class83.field1289 = -1;
        class115.field1735 = null;
        class411.field6175 = null;
        class460.field6805 = null;
        class390.field5881 = null;
        class521.field7721 = -1;
        class291.field4173 = null;
        class321.field4599 = null;
        class123.field1868 = null;
        class186.field2767 = null;
        if (arg1 > -103) {
            field4410 = null;
        }
        class460.field6804.method543(-69);
        class460.field6797.method1206(128, 64, 64);
        class460.field6804.method538(128, 1, 64);
        class460.field6796.method2695(64, false);
        class64.field961.method3036(64, (byte) 6);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BZI)Lik;")
    public static final class138 method1936(byte arg0, boolean arg1, int arg2) {
        field4416++;
        int var3 = 126 / ((11 - arg0) / 48);
        long var4 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class138) class81.field1223.method2605(false, var4);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)Z")
    public static final boolean method1937(int arg0, byte arg1) {
        field4417++;
        class412 var2 = class450.method2717((byte) 86, arg0);
        if (var2 == null) {
            return false;
        } else if (class432.field6459 == 3) {
            String var3 = "";
            if (class447.field6662 != class125.field1890) {
                var3 = ":" + (var2.field6189 + 7000);
            }
            String var4 = "";
            if (class465.field6885 != null) {
                var4 = "/p=" + class465.field6885;
            }
            String var5 = "http://" + var2.field6193 + var3 + "/l=" + class143.field2137 + "/a=" + class159.field2357 + var4 + "/j" + (class186.field2765 ? "1" : "0") + ",o" + (class398.field5967 ? "1" : "0") + ",a2";
            try {
                if (arg1 != -93) {
                    field4423 = null;
                }
                class436.field6522.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class102.field1474 = var2.field6189;
            class285.field4101 = var2.field6193;
            if (class447.field6662 != class125.field1890) {
                class64.field965 = class102.field1474 + 40000;
                class241.field3566 = class102.field1474 + 50000;
                class499.field7358 = class64.field965;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lod;JI)V")
    public class307(class349 arg0, long arg1, int arg2) {
        this.field4409 = arg0;
        this.field4413 = arg1;
    }

    static {
        new class475("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field4421 = new class498(56, 0);
        field4423 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    }
}
