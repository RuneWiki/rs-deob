import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class30 extends class161 {

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Z")
    public boolean field376;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[Lna;")
    public class30[] field370;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Ljava/lang/String;")
    public static String field369 = "Loaded client variable data";

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[[I")
    public static int[][] field358 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Lal;")
    public static class52 field373 = new class52(5);

    @OriginalMember(owner = "client!na", name = "H", descriptor = "F")
    public static float field380;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lne;")
    public static class172 field367;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Lof;")
    public class368 field371;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lf;")
    public class450 field360;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
    public int method201(byte arg0) {
        if (arg0 >= -18) {
            return 115;
        } else {
            field365++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
    public void method202(byte arg0, int arg1, int arg2) {
        field379++;
        int var4 = this.field363 == 255 ? arg1 : this.field363;
        if (arg0 != 112) {
            return;
        }
        if (this.field376) {
            this.field371 = new class368(var4, arg1, arg2);
        } else {
            this.field360 = new class450(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[[I")
    public int[][] method203(byte arg0, int arg1) {
        field375++;
        if (arg0 != -93) {
            this.field370 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
    public int method204(int arg0) {
        field368++;
        if (arg0 <= 75) {
            method205(-89, -93, -94, -28, 8);
        }
        return -1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class38.field485 = arg1;
        class106.field1484 = arg2;
        class70.field865 = arg0;
        field377++;
        class166.field2610 = arg3;
        if (arg4 > -47) {
            field380 = -0.27948114F;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)[[I")
    public final int[][] method206(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            this.method111((byte) -37);
        }
        field374++;
        if (this.field370[arg2].field376) {
            int[] var4 = this.field370[arg2].method116(arg0, (byte) 118);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field370[arg2].method203((byte) -93, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public void method111(byte arg0) {
        if (arg0 <= 90) {
            field369 = null;
        }
        field362++;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
    public void method207(byte arg0) {
        if (arg0 != -117) {
            this.method206(-45, -111, 13);
        }
        field364++;
        if (this.field376) {
            this.field371.method2368(58);
            this.field371 = null;
        } else {
            this.field360.method2808(13350);
            this.field360 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljg;II)V")
    public void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            this.method111((byte) 83);
        }
        field361++;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public static void method208(int arg0) {
        field358 = null;
        int var1 = -105 % ((13 - arg0) / 48);
        field373 = null;
        field367 = null;
        field369 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lno;B)Ljava/lang/String;")
    public static final String method209(class418 arg0, byte arg1) {
        if (arg1 >= -91) {
            method205(117, 100, -116, 113, -22);
        }
        field372++;
        return arg0.field6197 == null || arg0.field6197.length() <= 0 ? arg0.field6193 : arg0.field6193 + class77.field959 + arg0.field6197;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IZ)V")
    public class30(int arg0, boolean arg1) {
        this.field376 = arg1;
        this.field370 = new class30[arg0];
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
    public int[] method116(int arg0, byte arg1) {
        field366++;
        if (arg1 >= 49) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BII)[I")
    public final int[] method210(byte arg0, int arg1, int arg2) {
        field359++;
        if (arg0 < 9) {
            field369 = null;
        }
        return this.field370[arg1].field376 ? this.field370[arg1].method116(arg2, (byte) 111) : this.field370[arg1].method203((byte) -93, arg2)[0];
    }
}
