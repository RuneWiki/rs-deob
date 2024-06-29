import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class253 {

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    private int field4018 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    private int field4014 = -1;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lqg;")
    private class256 field4017 = new class256();

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
    public boolean field4024 = false;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    private int field4019;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    private int field4023;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[I")
    private int[][] field4007;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[Lrm;")
    private class260[] field4015;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public static int[] field4012 = new int[5];

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "S")
    public static short field4021 = 1;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4020 = Calendar.getInstance();

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4026 = "Allocating memory";

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lug;")
    public static class321 field4006;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 8)
    public final void method1783(byte arg0) {
        for (int var2 = 0; var2 < this.field4019; var2++) {
            this.field4007[var2] = null;
        }
        field4011++;
        this.field4007 = (int[][]) null;
        this.field4015 = null;
        this.field4017.method1811((byte) 25);
        this.field4017 = null;
        if (arg0 != 40) {
            field4012 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I", line = 35)
    public final int[] method1784(int arg0, byte arg1) {
        if (arg1 != 102) {
            field4022 = -4;
        }
        field4016++;
        if (this.field4023 == this.field4019) {
            this.field4024 = this.field4015[arg0] == null;
            this.field4015[arg0] = class20.field301;
            return this.field4007[arg0];
        } else if (this.field4019 == 1) {
            this.field4024 = this.field4014 != arg0;
            this.field4014 = arg0;
            return this.field4007[0];
        } else {
            class260 var3 = this.field4015[arg0];
            if (var3 == null) {
                this.field4024 = true;
                if (this.field4019 <= this.field4018) {
                    class260 var4 = (class260) this.field4017.method1802(2838);
                    var3 = new class260(arg0, var4.field4148);
                    this.field4015[var4.field4150] = null;
                    var4.method465((byte) -122);
                } else {
                    var3 = new class260(arg0, this.field4018);
                    this.field4018++;
                }
                this.field4015[arg0] = var3;
            } else {
                this.field4024 = false;
            }
            this.field4017.method1809(var3, (byte) -52);
            return this.field4007[var3.field4148];
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)[[I", line = 100)
    public final int[][] method1785(int arg0) {
        field4009++;
        if (this.field4023 != this.field4019) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -51) {
            field4006 = (class321) null;
        }
        while (this.field4019 > var2) {
            this.field4015[var2] = class20.field301;
            var2++;
        }
        return this.field4007;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 121)
    public static void method1786(byte arg0) {
        field4020 = null;
        if (arg0 == 17) {
            field4012 = null;
            field4026 = null;
            field4006 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V", line = 136)
    public static final void method1787(int arg0, byte arg1) {
        class337.field5234.method1625(arg0, (byte) 17);
        field4008++;
        if (arg1 >= -110) {
            field4020 = (Calendar) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)I", line = 147)
    public static final int method1788(boolean arg0, int arg1) {
        field4010++;
        long var2 = class304.method2128((byte) -85);
        class237 var4 = arg0 ? (class237) class241.field3833.method1746((byte) -33) : (class237) class241.field3833.method1749((byte) -65);
        if (arg1 != -64) {
            field4006 = (class321) null;
        }
        while (var4 != null) {
            if (var2 > (var4.field3753 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3753 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field916;
                    class29.field422[var5] = class17.field235[var5];
                    var4.method465((byte) -122);
                    return var5;
                }
                var4.method465((byte) -122);
            }
            var4 = (class237) class241.field3833.method1749((byte) 112);
        }
        return -1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V", line = 289)
    public class253(int arg0, int arg1, int arg2) {
        this.field4019 = arg0;
        this.field4023 = arg1;
        this.field4007 = new int[this.field4019][arg2];
        this.field4015 = new class260[this.field4023];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILv;IIZ)V", line = 206)
    public static final void method1789(int arg0, int arg1, class80 arg2, int arg3, int arg4, boolean arg5) {
        field4013++;
        if (class126.field1879 >= 50 || arg2 == null || arg2.field1206 == null || arg2.field1206.length <= arg3 || arg2.field1206[arg3] == null) {
            return;
        }
        int var6 = arg2.field1206[arg3][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFF) >> 5;
        if (arg2.field1206[arg3].length > 1) {
            int var9 = (int) (Math.random() * (double) arg2.field1206[arg3].length);
            if (var9 > 0) {
                var7 = arg2.field1206[arg3][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg5) {
                class193.method1414(var7, var8, 255, 0, 60);
            }
        } else if (class139.field2076 != 0) {
            class315.field4900[class126.field1879] = var7;
            int var11 = (arg4 - 64) / 128;
            class66.field855[class126.field1879] = var8;
            if (arg0 != 19080) {
                field4006 = (class321) null;
            }
            int var12 = (arg1 - 64) / 128;
            class228.field3618[class126.field1879] = 0;
            class343.field5353[class126.field1879] = null;
            class152.field2328[class126.field1879] = 255;
            class336.field5218[class126.field1879] = (var11 << 16) + (var12 << 8) + var10;
            class126.field1879++;
        }
    }
}
