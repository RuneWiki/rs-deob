import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class409 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lsh;")
    public static class472 field5925 = new class472(80, 8);

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lsl;")
    public static class422 field5927 = new class422("", 17);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)V")
    public static final void method2444(int arg0, int arg1, byte arg2, int arg3) {
        field5924++;
        if (class170.field2427 == null) {
            return;
        }
        long var4 = (long) (arg1 | arg0 << 28 | arg3 << 14);
        class31 var6 = (class31) class491.field6897.method2305(var4, (byte) 84);
        if (var6 == null) {
            class371.method2301(arg0, arg1, arg3);
            return;
        }
        class267 var7 = (class267) var6.field407.method2456(32101);
        if (var7 == null) {
            class371.method2301(arg0, arg1, arg3);
            return;
        }
        class263 var8 = (class263) class371.method2301(arg0, arg1, arg3);
        if (var8 == null) {
            var8 = new class263();
        } else {
            var8.field3906 = var8.field3914 = -1;
        }
        var8.field3912 = var7.field3963;
        var8.field3904 = var7.field3961;
        if (arg2 != 26) {
            method2445(-109);
        }
        label46: while (true) {
            class267 var9 = (class267) var6.field407.method2461(301);
            if (var9 == null) {
                break;
            }
            if (var8.field3912 != var9.field3963) {
                var8.field3906 = var9.field3963;
                var8.field3919 = var9.field3961;
                while (true) {
                    class267 var10 = (class267) var6.field407.method2461(301);
                    if (var10 == null) {
                        break label46;
                    }
                    if (var8.field3912 != var10.field3963 && var8.field3906 != var10.field3963) {
                        var8.field3915 = var10.field3961;
                        var8.field3914 = var10.field3963;
                    }
                }
            }
        }
        int var11 = class25.method219(48602855, arg0, (arg3 << 7) + 64, (arg1 << 7) + 64);
        class99.method766(arg0, arg1, arg3, var11, var8);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method2445(int arg0) {
        field5925 = null;
        if (arg0 <= 81) {
            method2445(-23);
        }
        field5927 = null;
    }
}
