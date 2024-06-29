import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class316 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[Lcq;")
    public static class67[] field4620;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 4)
    public static void method2133(int arg0) {
        if (arg0 != 15) {
            method2135(-109, 25, 113);
        }
        field4620 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3) {
        field4616++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class324.method2178(var4, (byte) -27, true);
        if (arg3 > -20) {
            method2135(-27, 11, 23);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 36)
    public static final void method2135(int arg0, int arg1, int arg2) {
        if (arg2 == 63) {
            field4613++;
            class244.field3248 = new class189(arg1);
            class397.field5905 = new class189(arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)I", line = 53)
    public static final int method2136(int arg0, int arg1, int arg2) {
        field4615++;
        int var3 = arg0 + arg2 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)I", line = 67)
    public static final int method2137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4614++;
        int var5 = arg0 & arg4;
        int var6 = var5 < 8 ? arg1 : arg3;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg2) : arg3;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }
}
