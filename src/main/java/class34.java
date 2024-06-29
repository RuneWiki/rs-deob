import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class34 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field439 = 0;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field440 = -1;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lkn;")
    private class442 field429 = new class442();

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Z")
    public boolean field441 = false;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[[I")
    private int[][] field425;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[Ldr;")
    private class428[] field426;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    public static volatile boolean field422 = false;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lkn;")
    public static class442 field427 = new class442();

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field424;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[[I", line = 5)
    public final int[][] method183(int arg0) {
        field431++;
        if (this.field438 != this.field435) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field435; var2++) {
            this.field426[var2] = class53.field688;
        }
        if (arg0 >= -50) {
            method186((class223) null, -28, (byte) -3);
        }
        return this.field425;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 35)
    public static final void method184(int arg0, int arg1) {
        if (arg1 == 37) {
            class176.field2471 = 3.0F;
        } else if (arg1 == 50) {
            class176.field2471 = 4.0F;
        } else if (arg1 == 75) {
            class176.field2471 = 6.0F;
        } else if (arg1 == 100) {
            class176.field2471 = 8.0F;
        } else if (arg1 == 200) {
            class176.field2471 = 16.0F;
        }
        field432++;
        int var2 = -67 % ((14 - arg0) / 58);
        class139.field2125 = -1;
        class139.field2125 = -1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I", line = 69)
    public final int[] method185(int arg0, int arg1) {
        if (arg0 != 65280) {
            this.method183(52);
        }
        field423++;
        if (this.field438 == this.field435) {
            this.field441 = this.field426[arg1] == null;
            this.field426[arg1] = class53.field688;
            return this.field425[arg1];
        } else if (this.field435 == 1) {
            this.field441 = this.field440 != arg1;
            this.field440 = arg1;
            return this.field425[0];
        } else {
            class428 var3 = this.field426[arg1];
            if (var3 == null) {
                this.field441 = true;
                if (this.field439 >= this.field435) {
                    class428 var4 = (class428) this.field429.method2760(0);
                    var3 = new class428(arg1, var4.field6092);
                    this.field426[var4.field6094] = null;
                    var4.method2660((byte) 123);
                } else {
                    var3 = new class428(arg1, this.field439);
                    this.field439++;
                }
                this.field426[arg1] = var3;
            } else {
                this.field441 = false;
            }
            this.field429.method2758(0, var3);
            return this.field425[var3.field6092];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lbr;IB)I", line = 137)
    public static final int method186(class223 arg0, int arg1, byte arg2) {
        if (arg2 > -109) {
            return 4;
        }
        field437++;
        if (!client.method1168(arg0).method485(98, arg1) && arg0.field3222 == null) {
            return -1;
        } else if (arg0.field3192 == null || arg1 >= arg0.field3192.length) {
            return -1;
        } else {
            return arg0.field3192[arg1];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)I", line = 154)
    public static final int method187(int arg0, int arg1, int arg2, int arg3) {
        field430++;
        int var4 = ((arg0 & 0xFF00) * arg3 & arg1 | (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg3;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 166)
    public final void method188(int arg0) {
        for (int var2 = arg0; var2 < this.field435; var2++) {
            this.field425[var2] = null;
        }
        field428++;
        this.field426 = null;
        this.field425 = null;
        this.field429.method2755(0);
        this.field429 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(III)V", line = 244)
    public class34(int arg0, int arg1, int arg2) {
        this.field435 = arg0;
        this.field438 = arg1;
        this.field425 = new int[this.field435][arg2];
        this.field426 = new class428[this.field438];
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 199)
    public static void method189(byte arg0) {
        field427 = null;
        field424 = null;
        if (arg0 <= 74) {
            field427 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZZ)V", line = 213)
    public static final void method190(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            class198.field2828++;
            class94.method554(0);
        }
        if (arg1) {
            return;
        }
        field436++;
        if (arg2) {
            class31.field388++;
            class355.method2323((byte) -119);
        }
    }
}
