import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class224 extends class120 {

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lsb;")
    public class224[] field3630;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Z")
    public boolean field3624;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
    public static boolean field3615 = false;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3622 = "Started 3d Library";

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
    public static int[] field3631 = new int[14];

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lgg;")
    public class192 field3616;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Lah;")
    public class278 field3625;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[S")
    public static short[] field3613;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[Z")
    public static boolean[] field3628;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)I")
    public int method612(boolean arg0) {
        field3632++;
        return arg0 ? 16 : -1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Llj;IB)V")
    public void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            this.field3625 = null;
        }
        field3621++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
    public static final void method1524(boolean arg0, int arg1) {
        field3617++;
        class10.method63(13371);
        if (class203.field3182 != 30 && class203.field3182 != 25 || arg1 < 99) {
            return;
        }
        class4.field62++;
        if (class4.field62 < 50 && !arg0) {
            return;
        }
        class4.field62 = 0;
        if (!class186.field2927 && class240.field3833 != null) {
            class168.field2612++;
            class13.field165.method892(40, (byte) -67);
            try {
                class240.field3833.method1843(-107, class13.field165.field339, class13.field165.field349, 0);
                class13.field165.field349 = 0;
            } catch (IOException var2) {
                class186.field2927 = true;
            }
        }
        class10.method63(13371);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I")
    public int[][] method15(int arg0, int arg1) {
        if (arg1 == 1) {
            field3620++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1525(String arg0, boolean arg1, int arg2) {
        if (arg1) {
            try {
                class85.field1324.getAppletContext().showDocument(new URL(class85.field1324.getCodeBase(), arg0), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class85.field1324.getAppletContext().showDocument(new URL(class85.field1324.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        }
        field3612++;
        if (arg2 != 1) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
    public static int method1526(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)[I")
    public int[] method14(int arg0, boolean arg1) {
        field3619++;
        if (arg1) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)I")
    public int method304(int arg0) {
        if (arg0 == -11055) {
            field3623++;
            return -1;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)[I")
    public final int[] method1527(int arg0, int arg1, byte arg2) {
        field3614++;
        if (arg2 != 84) {
            field3615 = true;
        }
        return this.field3630[arg1].field3624 ? this.field3630[arg1].method14(arg0, true) : this.field3630[arg1].method15(arg0, arg2 - 83)[0];
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
    public void method300(boolean arg0) {
        if (this.field3624) {
            this.field3625.method1864((byte) 119);
            this.field3625 = null;
        } else {
            this.field3616.method1347(1);
            this.field3616 = null;
        }
        if (!arg0) {
            this.method15(-37, 2);
        }
        field3627++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1528(int arg0, int arg1, int arg2, int arg3) {
        if (class170.method1188(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class174.method1226(var4 + 1, class200.field3128[arg0][arg1][arg2] + arg3, var5 + 1) && class174.method1226(var4 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class174.method1226(var4 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class174.method1226(var4 + 1, class200.field3128[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)J")
    public static final long method1529(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        return var3 == null || var3.field627 == null ? 0L : var3.field627.field962;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZI)V")
    public final void method1530(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method304(-80);
        }
        field3633++;
        int var4 = this.field3629 == 255 ? arg0 : this.field3629;
        if (this.field3624) {
            this.field3625 = new class278(var4, arg0, arg2);
        } else {
            this.field3616 = new class192(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3613 = null;
        field3628 = null;
        field3631 = null;
        field3622 = null;
        if (arg0 != 1) {
            field3615 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IZ)V")
    public class224(int arg0, boolean arg1) {
        this.field3630 = new class224[arg0];
        this.field3624 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)[[I")
    public final int[][] method1532(int arg0, int arg1, int arg2) {
        if (arg0 < 28) {
            method1531(-18);
        }
        field3626++;
        if (this.field3630[arg1].field3624) {
            int[] var4 = this.field3630[arg1].method14(arg2, true);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3630[arg1].method15(arg2, 1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public void method18(int arg0) {
        if (arg0 >= -4) {
            field3628 = null;
        }
        field3618++;
    }
}
