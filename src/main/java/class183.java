import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class183 extends class642 {

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lvf;")
    public static class87 field2512 = new class87();

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
    public static int[] field2514 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field2515 = -1;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lpb;")
    public static class2 field2513 = new class2(5, 8);

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2516 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
    public static final boolean method1223(int arg0, int arg1, int arg2) {
        ++field2510;
        if (arg2 != -17282) {
            method1224(101);
        }
        return ~(arg0 & 1408) != -1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (~arg0 == -1) {
            super.field9207 = arg1.method3115(29871) == 1;
        }
        ++field2509;
        if (arg2 < 29) {
            field2514 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static void method1224(int arg0) {
        int var1 = -85 % ((81 - arg0) / 33);
        field2514 = null;
        field2512 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        if (arg0 != 21402) {
            return null;
        } else {
            ++field2506;
            int[][] var3 = super.field9211.method1068(arg0 + -21402, arg1);
            if (super.field9211.field2131) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class338.field4909; ++var7) {
                    this.method1225((byte) 54, var7, arg1);
                    int[][] var8 = this.method3657(class1.field1, true, 0);
                    var4[var7] = var8[0][class105.field1560];
                    var5[var7] = var8[1][class105.field1560];
                    var6[var7] = var8[2][class105.field1560];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BII)V")
    private final void method1225(byte arg0, int arg1, int arg2) {
        ++field2507;
        int var4 = class542.field8026[arg1];
        int var5 = class400.field6026[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class1.field1 = arg2;
            class105.field1560 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class105.field1560 = arg2;
            class1.field1 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class105.field1560 = class338.field4909 - arg2;
            class1.field1 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class105.field1560 = arg1;
            class1.field1 = -arg2 + class106.field1578;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class1.field1 = -arg2 + class106.field1578;
            class105.field1560 = -arg1 + class338.field4909;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class105.field1560 = -arg2 + class338.field4909;
            class1.field1 = -arg1 + class106.field1578;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class105.field1560 = arg2;
            class1.field1 = class106.field1578 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class1.field1 = arg2;
            class105.field1560 = -arg1 + class338.field4909;
        }
        if (arg0 != 54) {
            method1223(-108, -72, -67);
        }
        class1.field1 &= class553.field8133;
        class105.field1560 &= class412.field6121;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BLjava/io/File;)V")
    public static final void method1226(int arg0, int arg1, byte[] arg2, File arg3) throws IOException {
        ++field2511;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg2, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
        if (arg1 > -53) {
            method1227(60, 56, 30);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lpo;")
    public static final class332 method1227(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        return var3 == null ? null : var3.field670;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2508;
        if (arg1 != -9) {
            this.method138(5, 30);
        }
        int[] var3 = super.field9216.method1185(arg0, -110);
        if (super.field9216.field2418) {
            for (int var4 = 0; class338.field4909 > var4; ++var4) {
                this.method1225((byte) 54, var4, arg0);
                int[] var5 = this.method3658((byte) 127, class1.field1, 0);
                var3[var4] = var5[class105.field1560];
            }
        }
        return var3;
    }
}
