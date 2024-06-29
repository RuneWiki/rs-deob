import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class86 extends class170 {

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field1506 = 0;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Ldj;")
    public static class314 field1505;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V", line = 6)
    private final void method543(int arg0, int arg1, byte arg2) {
        field1501++;
        int var4 = class118.field2002[arg1];
        if (arg2 != 15) {
            return;
        }
        int var5 = class307.field5221[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class303.field5150 = arg1;
            class144.field2456 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class144.field2456 = arg1;
            class303.field5150 = arg0;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class144.field2456 = arg1;
            class303.field5150 = class185.field3225 - arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class303.field5150 = arg1;
            class144.field2456 = class12.field390 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class144.field2456 = class12.field390 - arg0;
            class303.field5150 = class185.field3225 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class303.field5150 = class185.field3225 - arg0;
            class144.field2456 = class12.field390 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class303.field5150 = arg0;
            class144.field2456 = class12.field390 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class144.field2456 = arg0;
            class303.field5150 = class185.field3225 - arg1;
        }
        class144.field2456 &= class297.field5073;
        class303.field5150 &= class5.field94;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILbg;B)V", line = 82)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            field1498 = 73;
        }
        if (arg0 == 0) {
            this.field2970 = arg1.method1325(arg2 ^ 0x1DC6) == 1;
        }
        field1499++;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 95)
    public class86() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)[I", line = 101)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            return (int[]) null;
        }
        field1503++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            for (int var4 = 0; var4 < class185.field3225; var4++) {
                this.method543(arg1, var4, (byte) 15);
                int[] var5 = this.method1142((byte) 44, 0, class144.field2456);
                var3[var4] = var5[class303.field5150];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z", line = 135)
    public static final boolean method544(int arg0) {
        field1502++;
        if (arg0 != 0) {
            field1505 = (class314) null;
        }
        class189 var1 = class210.field3715;
        synchronized (class210.field3715) {
            if (class211.field3737 == class130.field2270) {
                return false;
            } else {
                class309.field5245 = class62.field1174[class130.field2270];
                class74.field1397 = class205.field3617[class130.field2270];
                class130.field2270 = class130.field2270 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V", line = 155)
    public static void method545(byte arg0) {
        field1505 = null;
        if (arg0 < 2) {
            method545((byte) -128);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[[I", line = 171)
    public final int[][] method62(int arg0, int arg1) {
        int var3 = 96 / ((-arg1 - 24) / 46);
        field1504++;
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                this.method543(arg0, var8, (byte) 15);
                int[][] var9 = this.method1139(0, class144.field2456, 0);
                var5[var8] = var9[0][class303.field5150];
                var7[var8] = var9[1][class303.field5150];
                var6[var8] = var9[2][class303.field5150];
            }
        }
        return var4;
    }
}
