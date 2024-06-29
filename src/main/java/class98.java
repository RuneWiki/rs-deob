import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class98 extends class430 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field1396 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public int field1401 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field1402 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field1397 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field1403 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field1400 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field1406 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field1404 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Luea;")
    public class241 field1395;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
    public static int[] field1399 = new int[8];

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)Z", line = 3)
    public final boolean method738(int arg0, byte arg1, int arg2) {
        if (arg1 != -14) {
            return false;
        }
        field1398++;
        if (this.field1402 <= arg0 && this.field1396 >= arg0 && this.field1403 <= arg2 && arg2 <= this.field1401) {
            return true;
        } else {
            return arg0 >= this.field1404 && this.field1400 >= arg0 && arg2 >= this.field1397 && this.field1406 >= arg2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V", line = 21)
    public static final void method739(int arg0, int arg1) {
        field1405++;
        int var2 = class703.field9918 - class78.field1133;
        if (var2 >= 100) {
            class616.field8773 = -1;
            class539.field7824 = -1;
            class165.field2351 = 1;
            return;
        }
        int var3 = (int) class112.field1584;
        if ((class328.field4449 >> 8) > var3) {
            var3 = class328.field4449 >> 8;
        }
        if (class157.field2258[4] && (class690.field9785[4] + 128) > var3) {
            var3 = class690.field9785[4] + 128;
        }
        int var4 = (int) class680.field9668 + class157.field2255 & 0x3FFF;
        class89.method693(class537.field7811, var4, (var3 >> 3) * 3 + 600 << 2, (byte) -39, class530.method3211(class108.field1536.field3916, 2, class108.field1536.field3923, class687.field9758) - 200, arg1, var3, class646.field9302);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class123.field1698 = (int) ((float) (class123.field1698 - class442.field6292) * var5 + (float) class442.field6292);
        class564.field8174 = (int) ((float) (class564.field8174 - class188.field2635) * var5 + (float) class188.field2635);
        class279.field3904 = (int) ((float) (class279.field3904 - class506.field7354) * var5 + (float) class506.field7354);
        class518.field7473 = (int) ((float) (class518.field7473 - class429.field6175) * var5 + (float) class429.field6175);
        int var6 = 10 / ((arg0 - 44) / 63);
        int var7 = class179.field2487 - class571.field8234;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class179.field2487 = (int) ((float) var7 * var5 + (float) class571.field8234);
        class179.field2487 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 77)
    public static void method740(byte arg0) {
        if (arg0 == 92) {
            field1399 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Luea;)V", line = 125)
    public class98(class241 arg0) {
        this.field1395 = arg0;
    }
}
