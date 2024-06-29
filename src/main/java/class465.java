import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class465 extends class766 {

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Ljava/lang/String;")
    public String field6331 = null;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public int field6344 = 0;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
    private boolean field6333 = true;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "B")
    public byte field6332;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "B")
    public byte field6342;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "D")
    public static double field6339;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "J")
    public long field6334;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Lqv;")
    public static class79 field6343;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
    private boolean field6340;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[Laf;")
    public class40[] field6336;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Laf;I)V", line = 6)
    public final void method2714(class40 arg0, int arg1) {
        ++field6345;
        if (this.field6336 == null || this.field6336.length <= this.field6344) {
            this.method2719(this.field6344 + 5, false);
        }
        if (arg1 != 5) {
            this.method2715((byte) 52, (class431) null);
        }
        this.field6336[this.field6344++] = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLol;)V", line = 21)
    private final void method2715(byte arg0, class431 arg1) {
        ++field6338;
        int var3 = arg1.method2557(arg0 + 14943);
        if ((2 & var3) != 0) {
            this.field6333 = true;
        }
        if (~(1 & var3) != -1) {
            this.field6340 = true;
        }
        super.field10592 = arg1.method2567((byte) -127);
        this.field6334 = arg1.method2567((byte) -124);
        this.field6331 = arg1.method2532((byte) -112);
        if (arg0 == -14) {
            arg1.method2557(14929);
            this.field6332 = arg1.method2529(100);
            this.field6342 = arg1.method2529(arg0 + 105);
            this.field6344 = arg1.method2565((byte) -113);
            if (this.field6344 > 0) {
                this.field6336 = new class40[this.field6344];
                for (int var4 = 0; ~this.field6344 < ~var4; ++var4) {
                    class40 var5 = new class40();
                    if (this.field6340) {
                        arg1.method2567((byte) -125);
                    }
                    if (this.field6333) {
                        var5.field470 = arg1.method2532((byte) -128);
                    }
                    var5.field473 = arg1.method2529(53);
                    var5.field469 = arg1.method2565((byte) -100);
                    this.field6336[var4] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 76)
    public final void method2716(int arg0, int arg1) {
        if (arg0 < 64) {
            method2720(52, 112L);
        }
        --this.field6344;
        ++field6337;
        if (this.field6344 != 0) {
            class171.method1265(this.field6336, arg1 + 1, this.field6336, arg1, -arg1 + this.field6344);
        } else {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 92)
    public final int method2717(byte arg0, String arg1) {
        ++field6329;
        if (arg0 < 124) {
            this.field6334 = 96L;
        }
        for (int var3 = 0; ~this.field6344 < ~var3; ++var3) {
            if (this.field6336[var3].field470.equalsIgnoreCase(arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 125)
    public static void method2718(byte arg0) {
        if (arg0 != 92) {
            method2721((byte) -40, (File) null, (String) null);
        }
        field6343 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V", line = 137)
    private final void method2719(int arg0, boolean arg1) {
        if (this.field6336 != null) {
            class171.method1265(this.field6336, 0, this.field6336 = new class40[arg0], 0, this.field6344);
        } else {
            this.field6336 = new class40[arg0];
        }
        ++field6330;
        if (arg1) {
            this.method2717((byte) -21, (String) null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IJ)V", line = 157)
    public static final void method2720(int arg0, long arg1) {
        ++field6335;
        try {
            Thread.sleep(arg1);
            int var3 = 118 % ((-3 - arg0) / 50);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/io/File;Ljava/lang/String;)V", line = 172)
    public static final void method2721(byte arg0, File arg1, String arg2) {
        if (arg0 >= 78) {
            ++field6341;
            class156.field2453.put(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lol;)V", line = 202)
    public class465(class431 arg0) {
        this.method2715((byte) -14, arg0);
    }
}
