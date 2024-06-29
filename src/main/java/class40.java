import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 {

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Lu;")
    public static class38 field500 = class9.method45(-41, " )2 ");

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lu;")
    public static class38 field501 = class9.method45(-41, "Furnace");

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public static int field502 = -1;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Z")
    public static boolean field504 = false;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lu;")
    public static class38 field505 = class9.method45(-41, "world");

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "I")
    public static volatile int field506 = 0;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "I")
    public static int field503 = 0;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ll;", line = 5)
    public static final class23 method251(Throwable arg0, String arg1) {
        class23 var2;
        if (arg0 instanceof class23) {
            var2 = (class23) arg0;
            var2.field216 = var2.field216 + ' ' + arg1;
        } else {
            var2 = new class23(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 37)
    public static final void method252(byte arg0) {
        if (class18.field164 != null) {
            class19 var1 = class18.field164;
            synchronized (class18.field164) {
                class18.field164 = null;
            }
        }
        if (arg0 > -73) {
            method253(90, null);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I[B)V", line = 74)
    public static final void method253(int arg0, byte[] arg1) {
        class33 var2 = new class33(arg1);
        var2.field427 = arg1.length - 2;
        class10.field90 = var2.method186(-253);
        class26.field333 = new int[class10.field90];
        class11.field112 = new int[class10.field90];
        class9.field78 = new int[class10.field90];
        mapview.field249 = new byte[class10.field90][];
        class26.field326 = new int[class10.field90];
        var2.field427 = arg1.length - class10.field90 * 8 - 7;
        class28.field350 = var2.method186(arg0 - 253);
        class28.field353 = var2.method186(-253);
        int var3 = (var2.method188((byte) 116) & 0xFF) + 1;
        for (int var4 = 0; var4 < class10.field90; var4++) {
            class9.field78[var4] = var2.method186(-253);
        }
        for (int var5 = 0; var5 < class10.field90; var5++) {
            class26.field326[var5] = var2.method186(-253);
        }
        for (int var6 = 0; var6 < class10.field90; var6++) {
            class11.field112[var6] = var2.method186(-253);
        }
        for (int var7 = 0; var7 < class10.field90; var7++) {
            class26.field333[var7] = var2.method186(arg0 - 253);
        }
        var2.field427 = arg1.length + 3 - var3 * 3 - class10.field90 * 8 - 7;
        class11.field109 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class11.field109[var8] = var2.method189((byte) 91);
            if (class11.field109[var8] == 0) {
                class11.field109[var8] = 1;
            }
        }
        var2.field427 = arg0;
        for (int var9 = 0; var9 < class10.field90; var9++) {
            int var10 = class26.field333[var9];
            int var11 = class11.field112[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            mapview.field249[var9] = var13;
            int var14 = var2.method188((byte) 118);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method187(-1989399236);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var15 + var11 * var16] = var2.method187(arg0 - 1989399236);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BLw;ILw;I)Lt;", line = 209)
    public static final class37 method254(byte arg0, class41 arg1, int arg2, class41 arg3, int arg4) {
        if (class5.method12(arg2, arg4, (byte) -102, arg3)) {
            if (arg0 <= 54) {
                method252((byte) -56);
            }
            return mapview.method128(-27742, arg1.method256(arg2, true, arg4));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 226)
    public static void method255(int arg0) {
        field500 = null;
        field501 = null;
        if (arg0 != -11861) {
            method254((byte) -123, null, -51, null, -61);
        }
        field505 = null;
    }
}
