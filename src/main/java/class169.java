import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class169 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Ljv;")
    private class55 field2616 = new class55(64);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lbu;")
    private class17 field2621;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2623 = 0;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2624 = -1;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lrn;")
    public static class174 field2619 = new class174(58, 2);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[Lkf;")
    public static class165[] field2628 = new class165[14];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lpi;")
    public static class342 field2627 = new class342("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field2622;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method1237(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field2626++;
        class92.field1573.method2701(19466);
        int var1 = class92.field1573.method2700((byte) 87, 8);
        if (var1 < class510.field7529) {
            for (int var2 = var1; var2 < class510.field7529; var2++) {
                class250.field3586[class260.field3785++] = class148.field2363[var2];
            }
        }
        if (class510.field7529 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class510.field7529 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class148.field2363[var3];
            class255 var5 = class34.field668[var4];
            int var6 = class92.field1573.method2700((byte) 87, 1);
            if (var6 == 0) {
                class148.field2363[class510.field7529++] = var4;
                var5.field7632 = class531.field7821;
            } else {
                int var7 = class92.field1573.method2700((byte) 87, 2);
                if (var7 == 0) {
                    class148.field2363[class510.field7529++] = var4;
                    var5.field7632 = class531.field7821;
                    class88.field1543[class452.field6759++] = var4;
                } else if (var7 == 1) {
                    class148.field2363[class510.field7529++] = var4;
                    var5.field7632 = class531.field7821;
                    int var8 = class92.field1573.method2700((byte) 87, 3);
                    var5.method1649(1, var8, -1);
                    int var9 = class92.field1573.method2700((byte) 87, 1);
                    if (var9 == 1) {
                        class88.field1543[class452.field6759++] = var4;
                    }
                } else if (var7 == 2) {
                    class148.field2363[class510.field7529++] = var4;
                    var5.field7632 = class531.field7821;
                    if (class92.field1573.method2700((byte) 87, 1) == 1) {
                        int var11 = class92.field1573.method2700((byte) 87, 3);
                        var5.method1649(2, var11, -1);
                        int var12 = class92.field1573.method2700((byte) 87, 3);
                        var5.method1649(2, var12, -1);
                    } else {
                        int var10 = class92.field1573.method2700((byte) 87, 3);
                        var5.method1649(0, var10, -1);
                    }
                    int var13 = class92.field1573.method2700((byte) 87, 1);
                    if (var13 == 1) {
                        class88.field1543[class452.field6759++] = var4;
                    }
                } else if (var7 == 3) {
                    class250.field3586[class260.field3785++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public final void method1238(int arg0, int arg1) {
        class55 var3 = this.field2616;
        synchronized (this.field2616) {
            this.field2616.method493(false, arg1);
            if (arg0 != 30163) {
                method1237(125);
            }
        }
        field2625++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)La;")
    public final class435 method1239(int arg0, int arg1) {
        field2615++;
        class55 var3 = this.field2616;
        class435 var4;
        synchronized (this.field2616) {
            var4 = (class435) this.field2616.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2621.method114(arg1, arg0, -125);
        class435 var6 = new class435();
        if (var5 != null) {
            var6.method2593(true, new class145(var5));
        }
        class55 var7 = this.field2616;
        synchronized (this.field2616) {
            this.field2616.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field2622 = null;
        field2627 = null;
        field2619 = null;
        if (arg0 == 13840) {
            field2628 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public final void method1241(int arg0) {
        field2620++;
        class55 var2 = this.field2616;
        synchronized (this.field2616) {
            this.field2616.method484(96);
            if (arg0 != 0) {
                method1243(null, null, 63);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public final void method1242(byte arg0) {
        field2617++;
        if (arg0 < -55) {
            class55 var2 = this.field2616;
            synchronized (this.field2616) {
                this.field2616.method488(-3);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhu;[[BI)V")
    public static final void method1243(class85 arg0, byte[][] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.field168; var3++) {
            class386.method2389(15804);
            for (int var4 = 0; var4 < (class33.field662 >> 3); var4++) {
                for (int var5 = 0; var5 < class121.field1966 >> 3; var5++) {
                    int var6 = class86.field1503[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field189 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = (var6 & 0xFFC88D) >> 14;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class381.field5776.length; var12++) {
                                if (class381.field5776[var12] == var11 && arg1[var12] != null) {
                                    arg0.method660(var7, class141.field2244, (var9 & 0x7) * 8, var4 * 8, arg1[var12], var8, (var10 & 0x7) * 8, var5 * 8, class4.field109, var3, -123);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field2618++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Loq;ILbu;)V")
    public class169(class239 arg0, int arg1, class17 arg2) {
        this.field2621 = arg2;
        this.field2621.method119(29630, 32);
    }
}
