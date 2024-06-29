import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class414 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field5693;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
    public static long field5690 = 0L;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Luv;")
    public static class3 field5699;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method2465(byte arg0) {
        field5699 = null;
        if (arg0 != -17) {
            field5690 = -38L;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lkr;I)V")
    public static final void method2466(class329 arg0, int arg1) {
        if (arg1 != -23561) {
            field5690 = -79L;
        }
        field5691++;
        class105.field1369 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
    public static final boolean method2467(int arg0, int arg1) {
        if (arg0 != -11922) {
            method2466(null, -125);
        }
        field5695++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5697++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILge;)V")
    public static final void method2468(int arg0, class551 arg1) {
        field5698++;
        if ((arg1.field7693.length - arg1.field7707) < 1) {
            return;
        }
        if (arg0 <= 115) {
            method2468(120, null);
        }
        int var2 = arg1.method3045(-126);
        if (var2 < 0 || var2 > 1 || arg1.field7693.length - arg1.field7707 < 2) {
            return;
        }
        int var3 = arg1.method3090(-82);
        if ((var3 * 6) > (arg1.field7693.length - arg1.field7707)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method3090(-107);
            int var6 = arg1.method3048(-4);
            if (var5 < class121.field1528.length && class36.field553[var5] && (class550.field7650.method2208(var5, (byte) 17).field3713 != '1' || var6 >= -1 && var6 <= 1)) {
                class121.field1528[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(FZ)F")
    public static final float method2469(float arg0, boolean arg1) {
        field5696++;
        return arg1 ? arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) : 1.1474608F;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lds;")
    public static final class342 method2470(Throwable arg0, String arg1) {
        field5694++;
        class342 var2;
        if ((arg0 instanceof class342)) {
            var2 = (class342) arg0;
            var2.field4752 = var2.field4752 + ' ' + arg1;
        } else {
            var2 = new class342(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class414(String arg0, int arg1) {
        this.field5693 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)I")
    public final int method2471(byte arg0) {
        field5692++;
        if (arg0 <= 85) {
            field5690 = 68L;
        }
        return this.field5693;
    }

    static {
        new class344("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field5699 = new class3(68, 2);
    }
}
