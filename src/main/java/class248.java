import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class248 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field3670 = 0;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    private int field3669 = -1;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lok;")
    private class266 field3671 = new class266();

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
    public boolean field3677 = false;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field3676;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[[I")
    private int[][] field3667;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lro;")
    private class2[] field3663;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Z")
    public static boolean field3673 = false;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3672 = new CRC32();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 3)
    public final void method1633(int arg0) {
        for (int var2 = arg0; var2 < this.field3675; var2++) {
            this.field3667[var2] = null;
        }
        field3664++;
        this.field3667 = null;
        this.field3663 = null;
        this.field3671.method1729((byte) -87);
        this.field3671 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 22)
    public static void method1634(byte arg0) {
        field3672 = null;
        if (arg0 != -86) {
            method1635(89, -87, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)Z", line = 35)
    public static final boolean method1635(int arg0, int arg1, byte arg2) {
        field3666++;
        if (arg2 >= -122) {
            field3672 = null;
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I", line = 50)
    public static final int method1636(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 12) {
            return -73;
        }
        int var4 = arg3 & 0x3;
        field3662++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 74)
    public final int[] method1637(int arg0, int arg1) {
        if (arg0 != -29827) {
            return null;
        }
        field3668++;
        if (this.field3676 == this.field3675) {
            this.field3677 = this.field3663[arg1] == null;
            this.field3663[arg1] = class163.field2590;
            return this.field3667[arg1];
        } else if (this.field3675 == 1) {
            this.field3677 = this.field3669 != arg1;
            this.field3669 = arg1;
            return this.field3667[0];
        } else {
            class2 var3 = this.field3663[arg1];
            if (var3 == null) {
                this.field3677 = true;
                if (this.field3670 >= this.field3675) {
                    class2 var4 = (class2) this.field3671.method1733((byte) 87);
                    var3 = new class2(arg1, var4.field13);
                    this.field3663[var4.field10] = null;
                    var4.method3387((byte) 120);
                } else {
                    var3 = new class2(arg1, this.field3670);
                    this.field3670++;
                }
                this.field3663[arg1] = var3;
            } else {
                this.field3677 = false;
            }
            this.field3671.method1728(-117, var3);
            return this.field3667[var3.field13];
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V", line = 206)
    public class248(int arg0, int arg1, int arg2) {
        this.field3676 = arg1;
        this.field3675 = arg0;
        this.field3667 = new int[this.field3675][arg2];
        this.field3663 = new class2[this.field3676];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 150)
    public static final int method1638(String arg0, byte arg1) {
        field3674++;
        int var2 = arg0.length();
        if (arg1 != -72) {
            return 43;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)[[I", line = 177)
    public final int[][] method1639(int arg0) {
        field3665++;
        if (this.field3676 != this.field3675) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3675; var2++) {
            this.field3663[var2] = class163.field2590;
        }
        return this.field3667;
    }
}
