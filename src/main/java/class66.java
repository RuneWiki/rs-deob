import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class66 extends class412 {

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field831;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Lpn;")
    public static class72 field821 = new class72(38, 0);

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "[I")
    public static int[] field825 = new int[2048];

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "[J")
    public static long[] field832 = new long[32];

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field824 = new String[100];

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "Lpn;")
    public static class72 field829 = new class72(24, 7);

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "[Ljj;")
    public static class170[] field833 = new class170[14];

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field835 = -1;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLrh;II)V", line = 5)
    public static final void method337(int arg0, byte arg1, class76 arg2, int arg3, int arg4) {
        if (arg1 != -128) {
            method343(40);
        }
        field828++;
        long var5 = (long) (arg0 | arg3 << 28 | arg4 << 14);
        class173 var7 = (class173) class76.field913.method233(arg1 + 35, var5);
        if (var7 == null) {
            class173 var8 = new class173();
            class76.field913.method234(-112, var5, var8);
            var8.field2080.method803(arg2, 50);
            return;
        }
        class385 var9 = class422.field6096.method121(arg2.field914, -1);
        int var10 = var9.field5499;
        if (var9.field5536 == 1) {
            var10 = (arg2.field918 + 1) * var10;
        }
        for (class76 var11 = (class76) var7.field2080.method802((byte) 116); var11 != null; var11 = (class76) var7.field2080.method806((byte) 104)) {
            class385 var12 = class422.field6096.method121(var11.field914, -1);
            int var13 = var12.field5499;
            if (var12.field5536 == 1) {
                var13 = (var11.field918 + 1) * var13;
            }
            if (var13 < var10) {
                class239.method1316(var11, arg2, true);
                return;
            }
        }
        var7.field2080.method803(arg2, arg1 ^ 0xFFFFFFB2);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 58)
    public class66(Object arg0, int arg1) {
        super(arg1);
        this.field831 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)Z", line = 73)
    public final boolean method338(byte arg0) {
        field820++;
        int var2 = -27 / ((arg0 + 36) / 45);
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(III)Lab;", line = 83)
    public static final class256 method339(int arg0, int arg1, int arg2) {
        field823++;
        class256 var3 = class399.method2387(arg2, arg1 ^ 0x914DE150);
        if (~arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field3643 == null || var3.field3643.length <= arg0) {
            return null;
        } else {
            return var3.field3643[arg0];
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loj;I)V", line = 102)
    public static final void method340(class280 arg0, int arg1) {
        field826++;
        if (class263.field3786 == class19.field258.field994 || class293.field4356 == null) {
            return;
        }
        if (class348.method2106(-16777216, arg0, class19.field258.field994)) {
            class263.field3786 = class19.field258.field994;
        }
        if (arg1 <= 46) {
            method340((class280) null, 119);
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V", line = 123)
    public static final void method341(byte arg0) {
        class354.method2146(0);
        field822++;
        class27.field361 = null;
        class274.field3912 = null;
        class110.field1347 = null;
        int var1 = 125 / ((-arg0 - 6) / 59);
        class12.field180 = null;
        class200.field2784 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 141)
    public final Object method342(int arg0) {
        if (arg0 > -59) {
            field834 = 75;
        }
        field830++;
        return this.field831;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 158)
    public static void method343(int arg0) {
        field832 = null;
        field824 = null;
        field829 = null;
        field833 = null;
        field825 = null;
        if (arg0 == 1) {
            field821 = null;
        }
    }
}
