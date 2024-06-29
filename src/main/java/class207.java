import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class207 extends class544 {

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "Z")
    public boolean field2492;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "S")
    public static short field2488 = 1;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "[I")
    public static int[] field2487 = new int[8];

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field2496 = 0;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field2491 = 1339;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1196(int arg0, byte arg1, int arg2) {
        field2490++;
        if (arg1 < 32) {
            field2491 = -126;
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lqa;IILn;III)V")
    public static final void method1197(class206 arg0, int arg1, int arg2, class17 arg3, int arg4, int arg5, int arg6) {
        field2489++;
        if (class138.field1682 < 100) {
            class193.method1045(arg3, 44, arg0);
        }
        arg0.method1107(arg4, arg5, arg4 + arg6, arg2 + arg5);
        if (class138.field1682 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg4;
            int var9 = arg2 / 2 + (arg5 - var7 - 18);
            arg0.method1133(arg4, arg5, arg6, arg2, -16777216, 0);
            arg0.method1142(var8 - 152, var9, 304, 34, class32.field250[class341.field4402].getRGB(), 0);
            arg0.method1133(var8 - 150, var9 + 2, class138.field1682 * 3, 30, class414.field5375[class341.field4402].getRGB(), 0);
            class459.field6320.method534(arg1 - 16200, class195.field2368.method987(class31.field247, 22), -1, var7 + var9, class412.field5358[class341.field4402].getRGB(), var8);
            return;
        }
        int var10 = class619.field8945 - ((int) ((float) arg6 / class353.field4602));
        if (arg1 != 27940) {
            method1196(43, (byte) -82, -34);
        }
        int var11 = (int) ((float) arg2 / class353.field4602) + class34.field273;
        int var12 = (int) ((float) arg6 / class353.field4602) + class619.field8945;
        class511.field7234 = class619.field8945 - ((int) ((float) arg6 / class353.field4602));
        class206.field2482 = (int) ((float) (arg2 * 2) / class353.field4602);
        class259.field3349 = (int) ((float) (arg6 * 2) / class353.field4602);
        class129.field1585 = class34.field273 - ((int) ((float) arg2 / class353.field4602));
        int var13 = class34.field273 - ((int) ((float) arg2 / class353.field4602));
        class353.method1962(class353.field4621 + var10, var11 - -class353.field4607, class353.field4621 + var12, class353.field4607 + var13, arg4, arg5, arg4 + arg6, arg5 + 1 + arg2);
        class353.method1966(arg0);
        class193 var14 = class353.method1983(arg0);
        class344.method1920((byte) 104, var14, 0, 0, arg0);
        if (class289.field3752 > 0) {
            class382.field5054--;
            if (class382.field5054 == 0) {
                class289.field3752--;
                class382.field5054 = 20;
            }
        }
        if (!class252.field3260) {
            return;
        }
        int var15 = arg6 + arg4 - 5;
        int var16 = arg2 + arg5 - 8;
        class137.field1673.method535(0, "Fps:" + class368.field4862, -1, 16776960, var15, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class137.field1673.method535(arg1 ^ 0x6D24, "Mem:" + var18 + "k", -1, var19, var15, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)Lhba;")
    public static final class10 method1198(int arg0, int arg1) {
        field2494++;
        class10[] var2 = class167.method943(-20415);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class10 var4 = var2[var3];
            if (var4.field78 == arg1) {
                return var4;
            }
        }
        if (arg0 >= -39) {
            method1196(-102, (byte) -111, 127);
        }
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field2487 = null;
        if (arg0 != 8) {
            method1199(65);
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIIZ)V")
    public class207(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2495 = arg3;
        this.field2492 = arg5;
        this.field2498 = arg0;
        this.field2493 = arg1;
        this.field2497 = arg2;
        this.field2486 = arg4;
    }
}
