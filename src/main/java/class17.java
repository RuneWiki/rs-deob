import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 {

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lgg;")
    private static class63 field408 = class116.method911(43, "Service unavailable)3");

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lgg;")
    private static class63 field409 = class116.method911(43, "No reply from loginserver)3");

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "[I")
    public static int[] field411 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lgg;")
    public static class63 field412 = field409;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lgg;")
    public static class63 field414 = class116.method911(43, "b12_full");

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lgg;")
    public static class63 field415 = class116.method911(43, "<col=c0ff00>");

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lgg;")
    public static class63 field413 = class116.method911(43, "<)4col>");

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lgg;")
    public static class63 field423 = field408;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field419 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lmc;")
    public static class111 field401;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lab;")
    public static class3 field416;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[B")
    public byte[] field402;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[B")
    public byte[] field406;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lgg;")
    public static class63[] field418;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)I")
    public static final int method185(int arg0, int arg1, int arg2, int arg3) {
        field400++;
        int var4 = arg2 / arg0;
        int var5 = arg2 & arg0 - 1;
        int var6 = arg3 & arg0 - 1;
        int var7 = arg3 / arg0;
        int var8 = class37.method352((byte) -104, var7, var4);
        if (arg1 != 8) {
            field414 = null;
        }
        int var9 = class37.method352((byte) -100, var7, var4 + 1);
        int var10 = class37.method352((byte) -125, var7 + 1, var4);
        int var11 = class37.method352((byte) -111, var7 + 1, var4 + 1);
        int var12 = class180.method1197(arg1 - 8, var8, arg0, var5, var9);
        int var13 = class180.method1197(0, var10, arg0, var5, var11);
        return class180.method1197(arg1 ^ 0x8, var12, arg0, var6, var13);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
    public static final void method186(int arg0, long arg1) {
        field403++;
        try {
            if (arg0 != 24117) {
                method187((byte) -111);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field416 = null;
        field409 = null;
        field414 = null;
        field423 = null;
        field408 = null;
        field412 = null;
        field411 = null;
        field415 = null;
        if (arg0 <= -87) {
            field413 = null;
            field418 = null;
            field401 = null;
        }
    }
}
