import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class346 extends class270 {

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "Z")
    public boolean field5431 = true;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public int field5429 = 12800;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "I")
    public int field5432 = 0;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public int field5437 = -1;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public int field5436 = -1;

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public int field5439 = 0;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
    public int field5435 = 12800;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "Ljava/lang/String;")
    public String field5442;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "Ljava/lang/String;")
    public String field5434;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "Lpu;")
    public class411 field5441;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "Llo;")
    public static class306 field5430 = new class306("K", "T", "K", "K");

    @OriginalMember(owner = "client!uq", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field5446 = new String[200];

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!uq", name = "R", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!uq", name = "S", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!uq", name = "U", descriptor = "Ljava/awt/Frame;")
    public static Frame field5450;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI[I)Z", line = 4)
    public final boolean method2230(int arg0, boolean arg1, int arg2, int[] arg3) {
        field5438++;
        if (!arg1) {
            this.method2234(-30, -49, -64);
        }
        for (class116 var5 = (class116) this.field5441.method2538(-3); var5 != null; var5 = (class116) this.field5441.method2535((byte) -78)) {
            if (var5.method933(arg2, -118, arg0)) {
                var5.method931(arg3, arg0, (byte) 39, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 306)
    public class346(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5437 = arg6;
        this.field5443 = arg3;
        this.field5436 = arg4;
        this.field5431 = arg5;
        this.field5442 = arg1;
        this.field5444 = arg0;
        this.field5434 = arg2;
        if (this.field5437 == 255) {
            this.field5437 = 0;
        }
        this.field5441 = new class411();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2231(int arg0) {
        class337.method2131();
        field5440++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class106.field1865[var1].method1706(arg0 + 82);
        }
        class104.method714(-1);
        class416.method2565((byte) -49);
        System.gc();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[III)Z", line = 66)
    public final boolean method2232(int arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        field5448++;
        for (class116 var6 = (class116) this.field5441.method2538(-3); var6 != null; var6 = (class116) this.field5441.method2535((byte) -72)) {
            if (var6.method934(-102, arg3, arg4, arg0)) {
                var6.method928(arg2, true, arg4, arg3);
                return true;
            }
        }
        if (arg1 != 58) {
            this.field5434 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V", line = 99)
    public static void method2233(byte arg0) {
        field5450 = null;
        if (arg0 != -69) {
            field5450 = null;
        }
        field5430 = null;
        field5446 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z", line = 119)
    public final boolean method2234(int arg0, int arg1, int arg2) {
        field5447++;
        int var4 = -60 / ((67 - arg0) / 41);
        for (class116 var5 = (class116) this.field5441.method2538(-3); var5 != null; var5 = (class116) this.field5441.method2535((byte) -114)) {
            if (var5.method932((byte) 95, arg2, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI[I)Z", line = 141)
    public final boolean method2235(int arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 != 99) {
            return true;
        }
        field5433++;
        for (class116 var5 = (class116) this.field5441.method2538(-3); var5 != null; var5 = (class116) this.field5441.method2535((byte) -79)) {
            if (var5.method932((byte) 95, arg0, arg2)) {
                var5.method928(arg3, true, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)Z", line = 181)
    public static final boolean method2236(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            field5445++;
            return class229.method1588(arg1, -17634, arg0) | (arg1 & 0x800) != 0 || class206.method1354(-2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V", line = 194)
    public final void method2237(boolean arg0) {
        this.field5435 = 12800;
        field5449++;
        this.field5429 = 12800;
        if (arg0) {
            method2233((byte) -10);
        }
        this.field5439 = 0;
        this.field5432 = 0;
        for (class116 var2 = (class116) this.field5441.method2538(-3); var2 != null; var2 = (class116) this.field5441.method2535((byte) -105)) {
            if (var2.field2069 < this.field5429) {
                this.field5429 = var2.field2069;
            }
            if (var2.field2058 > this.field5439) {
                this.field5439 = var2.field2058;
            }
            if (var2.field2060 < this.field5435) {
                this.field5435 = var2.field2060;
            }
            if (this.field5432 < var2.field2056) {
                this.field5432 = var2.field2056;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[[[Lut;)V", line = 235)
    public static final void method2238(int arg0, class465[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class465[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class465 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6913 instanceof class518) {
                            ((class518) var6.field6913).method31(119);
                        }
                        if (var6.field6904 instanceof class518) {
                            ((class518) var6.field6904).method31(arg0 - 6206);
                        }
                        if (var6.field6908 instanceof class518) {
                            ((class518) var6.field6908).method31(arg0 ^ 0x18C6);
                        }
                        if (var6.field6907 instanceof class518) {
                            ((class518) var6.field6907).method31(arg0 ^ 0xFFFFE755);
                        }
                        if (var6.field6901 instanceof class518) {
                            ((class518) var6.field6901).method31(115);
                        }
                        for (class1 var7 = var6.field6898; var7 != null; var7 = var7.field2) {
                            class290 var8 = var7.field9;
                            if (var8 instanceof class518) {
                                ((class518) var8).method31(121);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 6327) {
            method2236(10, 80, true);
        }
        field5428++;
    }
}
