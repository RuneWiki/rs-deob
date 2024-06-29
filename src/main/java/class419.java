import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class419 extends class45 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljava/lang/String;")
    public String field5506;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field5509 = 0;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lsi;")
    public static class138 field5505;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lga;")
    public static class332 field5508;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lq;")
    public static class487 field5504;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)Lhe;")
    public static final class231 method2369(int arg0, int arg1, byte arg2, int arg3) {
        field5507++;
        class207 var4 = class153.field2168[arg1][arg0][arg3];
        if (var4 == null) {
            return null;
        }
        class231 var5 = null;
        int var6 = -1;
        if (arg2 > -73) {
            method2369(-1, 80, (byte) -121, -117);
        }
        for (class634 var7 = var4.field2774; var7 != null; var7 = var7.field8764) {
            class29 var8 = var7.field8767;
            if (var8 instanceof class231) {
                class231 var9 = (class231) var8;
                int var10 = var9.method1435((byte) 117) * 256 + 252 - 256;
                int var11 = var9.field398 - var10 >> 9;
                int var12 = var9.field397 - var10 >> 9;
                int var13 = var9.field398 + var10 >> 9;
                int var14 = var9.field397 + var10 >> 9;
                if (arg0 >= var11 && arg3 >= var12 && var13 >= arg0 && arg3 <= var14) {
                    int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg0);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method2370(int arg0) {
        field5508 = null;
        if (arg0 == 1) {
            field5505 = null;
            field5504 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class419() {
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class419(String arg0) {
        this.field5506 = arg0;
    }
}
