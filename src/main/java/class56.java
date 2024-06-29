import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class56 {

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    private int field858 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[Ldd;")
    public class130[] field841;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lpu;")
    public static class179 field843;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lpu;")
    public static class179 field856;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Ljp;")
    public static class55 field861;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "Lpu;")
    public static class179 field862;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "J")
    private long field847;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Ldd;")
    private class130 field853;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Ldd;")
    private class130 field859;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Lo;")
    public static class363 field863;

    static {
        new class179("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field843 = new class179("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        field856 = new class179("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
        field861 = new class55(81, -1);
        field862 = new class179("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ldd;IJ)V", line = 3)
    public final void method357(class130 arg0, int arg1, long arg2) {
        if (arg0.field1936 != null) {
            arg0.method947((byte) 108);
        }
        field848++;
        class130 var5 = this.field841[(int) ((long) (this.field857 - arg1) & arg2)];
        arg0.field1936 = var5.field1936;
        arg0.field1934 = var5;
        arg0.field1936.field1934 = arg0;
        arg0.field1932 = arg2;
        arg0.field1934.field1936 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BJ)Ldd;", line = 20)
    public final class130 method358(byte arg0, long arg1) {
        field851++;
        this.field847 = arg1;
        class130 var4 = this.field841[(int) ((long) (this.field857 - 1) & arg1)];
        this.field853 = var4.field1934;
        int var5 = -98 / ((-arg0 - 57) / 59);
        while (this.field853 != var4) {
            if (this.field853.field1932 == arg1) {
                class130 var6 = this.field853;
                this.field853 = this.field853.field1934;
                return var6;
            }
            this.field853 = this.field853.field1934;
        }
        this.field853 = null;
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Ldd;", line = 50)
    public final class130 method359(boolean arg0) {
        this.field858 = 0;
        if (!arg0) {
            method362((byte) 24);
        }
        field842++;
        return this.method365(-87);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 64)
    public final void method360(int arg0) {
        for (int var2 = 0; var2 < this.field857; var2++) {
            class130 var3 = this.field841[var2];
            while (true) {
                class130 var4 = var3.field1934;
                if (var3 == var4) {
                    break;
                }
                var4.method947((byte) 97);
            }
        }
        field852++;
        this.field859 = null;
        this.field853 = null;
        if (arg0 > -19) {
            this.field853 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B[Ldd;)I", line = 103)
    public final int method361(byte arg0, class130[] arg1) {
        field845++;
        int var3 = -59 / ((46 - arg0) / 53);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field857; var5++) {
            class130 var6 = this.field841[var5];
            for (class130 var7 = var6.field1934; var7 != var6; var7 = var7.field1934) {
                arg1[var4++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 135)
    public static void method362(byte arg0) {
        field862 = null;
        field861 = null;
        if (arg0 < 45) {
            method362((byte) -9);
        }
        field856 = null;
        field863 = null;
        field843 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I", line = 155)
    public final int method363(int arg0) {
        field844++;
        if (arg0 != -23686) {
            this.field859 = null;
        }
        return this.field857;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I", line = 168)
    public final int method364(int arg0) {
        field854++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field857; var3++) {
            class130 var4 = this.field841[var3];
            class130 var5 = var4.field1934;
            while (var4 != var5) {
                var5 = var5.field1934;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)Ldd;", line = 205)
    public final class130 method365(int arg0) {
        field860++;
        if (arg0 > -51) {
            return null;
        } else if (this.field858 <= 0 || this.field841[this.field858 - 1] == this.field859) {
            while (this.field857 > this.field858) {
                class130 var3 = this.field841[this.field858++].field1934;
                if (this.field841[this.field858 - 1] != var3) {
                    this.field859 = var3.field1934;
                    return var3;
                }
            }
            return null;
        } else {
            class130 var2 = this.field859;
            this.field859 = var2.field1934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 240)
    public class56(int arg0) {
        this.field841 = new class130[arg0];
        this.field857 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class130 var3 = this.field841[var2] = new class130();
            var3.field1934 = var3;
            var3.field1936 = var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Ldd;", line = 262)
    public final class130 method366(int arg0) {
        field849++;
        if (this.field853 == null) {
            return null;
        }
        class130 var2 = this.field841[(int) ((long) (this.field857 - 1) & this.field847)];
        while (this.field853 != var2) {
            if (this.field853.field1932 == this.field847) {
                class130 var4 = this.field853;
                this.field853 = this.field853.field1934;
                return var4;
            }
            this.field853 = this.field853.field1934;
        }
        this.field853 = null;
        int var3 = 121 % ((arg0 + 62) / 43);
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)[Lnj;", line = 301)
    public static final class408[] method367(int arg0) {
        field850++;
        return arg0 == -2 ? new class408[] { class319.field4838, class138.field2087, class156.field2403 } : null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfh;ILgt;I)V", line = 312)
    public static final void method368(class194 arg0, int arg1, class66 arg2, int arg3) {
        field846++;
        if (arg1 != -2) {
            field856 = null;
        }
        class336 var4 = new class336();
        var4.field5066 = arg0.method1337((byte) -113);
        var4.field5058 = arg0.method1401(-103);
        var4.field5063 = new int[var4.field5066];
        var4.field5065 = new int[var4.field5066];
        var4.field5060 = new int[var4.field5066];
        var4.field5054 = new byte[var4.field5066][][];
        var4.field5055 = new class329[var4.field5066];
        var4.field5057 = new class329[var4.field5066];
        for (int var5 = 0; var5 < var4.field5066; var5++) {
            try {
                int var6 = arg0.method1337((byte) 37);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method1347(-104);
                    String var8 = arg0.method1347(-99);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1401(125);
                    }
                    var4.field5060[var5] = var6;
                    var4.field5063[var5] = var9;
                    var4.field5055[var5] = arg2.method465(class61.method407(var7, 1024), var8, class232.method1566(arg1, -10002));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method1347(arg1 - 117);
                    String var11 = arg0.method1347(-84);
                    int var12 = arg0.method1337((byte) 124);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method1347(-88);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1401(-79);
                            var15[var16] = new byte[var17];
                            arg0.method1338(0, var17, var15[var16], 34);
                        }
                    }
                    var4.field5060[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class61.method407(var13[var19], 1024);
                    }
                    var4.field5057[var5] = arg2.method463(var11, var18, 2, class61.method407(var10, class232.method1566(arg1, -1026)));
                    var4.field5054[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5065[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5065[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5065[var5] = -3;
            } catch (Exception var23) {
                var4.field5065[var5] = -4;
            } catch (Throwable var24) {
                var4.field5065[var5] = -5;
            }
        }
        class195.field3056.method292((byte) 121, var4);
    }
}
