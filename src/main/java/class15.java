import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class15 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Ltm;")
    public static class334 field153 = new class334(78, 11);

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "[Laba;")
    public static class653[] field154;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field154 = null;
        if (arg0 > 5) {
            field153 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public static final void method83(byte arg0) {
        field156++;
        client var1 = class52.field834;
        synchronized (class52.field834) {
            if (class196.field3382 == null) {
                Container var2;
                if (class530.field7619 != null) {
                    var2 = class530.field7619;
                } else if (class351.field5138 == null) {
                    var2 = class690.field9800;
                } else {
                    var2 = class351.field5138;
                }
                class205.field3443 = var2.getSize().width;
                class245.field3938 = var2.getSize().height;
                if (class530.field7619 == var2) {
                    Insets var3 = class530.field7619.getInsets();
                    class245.field3938 -= var3.top + var3.bottom;
                    class205.field3443 -= var3.left + var3.right;
                }
                if (class347.method2215(-21383) == 1) {
                    class412.field6066 = class614.field8651;
                    class581.field8223 = 0;
                    class189.field3184 = (class205.field3443 - class335.field4917) / 2;
                    class660.field9408 = class335.field4917;
                } else {
                    class72.method658(800);
                }
                if (class478.field6941 != class209.field3494) {
                    boolean var10000;
                    if (class660.field9408 < 1024 && class412.field6066 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class400.field5941.setSize(class660.field9408, class412.field6066);
                if (class364.field5573 != null) {
                    if (class250.field3989) {
                        class148.method1126(class400.field5941, false);
                    } else {
                        class364.field5573.method361(class400.field5941, class660.field9408, class412.field6066);
                    }
                }
                if (class530.field7619 == var2) {
                    Insets var4 = class530.field7619.getInsets();
                    class400.field5941.setLocation(var4.left + class189.field3184, class581.field8223 + var4.top);
                } else {
                    class400.field5941.setLocation(class189.field3184, class581.field8223);
                }
                if (class673.field9523 != -1) {
                    class173.method1363(true, (byte) 56);
                }
                class120.method944((byte) 54);
                int var5 = -23 % ((arg0 + 63) / 63);
            }
        }
    }
}
