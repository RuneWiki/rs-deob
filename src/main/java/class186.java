import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class186 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field2277 = 0;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "[Ldga;")
    public static class138[] field2281 = new class138[2048];

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Lcb;")
    public static class318 field2283 = new class318(87, 12);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Llp;")
    public static class270 field2284 = new class270(2, 4, 4, 0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1192(byte arg0) {
        field2275++;
        if (arg0 > -125) {
            field2284 = null;
        }
        if (class127.field1613 != -1) {
            class426.method2457(109, class127.field1613, -1, false, -1);
            class127.field1613 = -1;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 24)
    public static void method1193(byte arg0) {
        field2281 = null;
        field2284 = null;
        field2283 = null;
        if (arg0 != -3) {
            field2284 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILdga;I)V", line = 36)
    private final void method1194(int arg0, class138 arg1, int arg2) {
        if (arg0 == 5) {
            this.field2277 = arg1.method922((byte) -123);
        }
        if (arg2 == -27252) {
            field2279++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lpq;BII)Lhe;", line = 55)
    public static final class250 method1195(class159 arg0, byte arg1, int arg2, int arg3) {
        field2278++;
        class138 var4 = new class138(arg0.method1087(arg3, arg2, 1));
        class250 var5 = new class250(arg2, var4.method907(false), var4.method907(false), var4.method943(-91), var4.method943(-109), var4.method957((byte) -106) == 1, var4.method957((byte) -78), var4.method957((byte) -107));
        int var6 = var4.method957((byte) -101);
        if (arg1 != -38) {
            method1192((byte) 56);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3378.method378(new class553(var4.method957((byte) -116), var4.method922((byte) -126), var4.method922((byte) -115), var4.method922((byte) -115), var4.method922((byte) -120), var4.method922((byte) -127), var4.method922((byte) -117), var4.method922((byte) -128), var4.method922((byte) -118)), 31316);
        }
        var5.method1560((byte) 111);
        return var5;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ldga;I)V", line = 87)
    public final void method1196(class138 arg0, int arg1) {
        if (arg1 != 87) {
            this.method1196(null, -13);
        }
        field2282++;
        while (true) {
            int var3 = arg0.method957((byte) -68);
            if (var3 == 0) {
                return;
            }
            this.method1194(var3, arg0, -27252);
        }
    }
}
