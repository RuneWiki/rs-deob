import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class176 extends InputStream {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lch;")
    public static class151 field2667 = new class151("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lrc;")
    public static class108 field2668 = new class108(11, -1);

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
    public static int[] field2670 = new int[2];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rk", name = "read", descriptor = "()I")
    public final int read() {
        field2669++;
        class89.method752(0, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field2670 = null;
        if (arg0 == -1) {
            field2668 = null;
            field2667 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lwt;)V")
    public static final void method1271(class325 arg0) {
        for (int var1 = arg0.field4535; var1 <= arg0.field4526; var1++) {
            for (int var2 = arg0.field4539; var2 <= arg0.field4534; var2++) {
                class52 var3 = class385.field5285[arg0.field4531][var1][var2];
                if (var3 != null) {
                    class131 var4 = var3.field763;
                    class131 var5 = null;
                    while (var4 != null) {
                        if (var4.field1803 == arg0) {
                            if (var5 == null) {
                                var3.field763 = var4.field1796;
                            } else {
                                var5.field1796 = var4.field1796;
                            }
                            var4.method979((byte) 58);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1796;
                    }
                    var3.field768 = 0;
                    for (class131 var6 = var3.field763; var6 != null; var6 = var6.field1796) {
                        var3.field768 = (byte) (var3.field768 | var6.field1798);
                    }
                }
            }
        }
    }
}
