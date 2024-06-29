import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class355 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Ldc;")
    private class5 field5119 = new class5(64);

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lhe;")
    private class239 field5120;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lhe;")
    private class239 field5122;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Ltq;")
    public static class426 field5124 = new class426(4, 4);

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Liu;")
    public static class390 field5127 = new class390(35, 14);

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Liu;")
    public static class390 field5128 = new class390(102, 0);

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lph;")
    public static class438 field5129 = new class438("LOCAL", 4);

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Lqi;")
    public static class381 field5125;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class497 var7 = new class497();
        var7.field7561 = arg1 >> class41.field628;
        var7.field7578 = arg2 >> class41.field628;
        var7.field7556 = arg3 >> class41.field628;
        var7.field7568 = arg4 >> class41.field628;
        var7.field7566 = arg0;
        var7.field7559 = arg1;
        var7.field7574 = arg2;
        var7.field7558 = arg3;
        var7.field7576 = arg4;
        var7.field7557 = arg5;
        var7.field7564 = arg6;
        class456.field6642[class55.field847++] = var7;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)Lut;")
    public final class76 method2149(int arg0, byte arg1) {
        field5126++;
        class76 var3 = (class76) this.field5119.method40(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5122.method1470(4, arg0 & 0x7FFF, 0);
        } else {
            var4 = this.field5120.method1470(4, arg0, 0);
        }
        if (arg1 > -90) {
            field5124 = null;
        }
        class76 var5 = new class76();
        if (var4 != null) {
            var5.method501(0, new class156(var4));
        }
        if (arg0 >= 32768) {
            var5.method504((byte) 21);
        }
        this.field5119.method36(-20960, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)Z")
    public static final boolean method2150(byte arg0, int arg1) {
        field5123++;
        class450 var2 = class469.method2749(arg1, (byte) 19);
        if (var2 == null) {
            return false;
        } else if (class44.field670 == 3) {
            String var3 = "";
            if (class371.field5567 != class339.field4941) {
                var3 = ":" + (var2.field6560 + 7000);
            }
            String var4 = "";
            if (class477.field6870 != null) {
                var4 = "/p=" + class477.field6870;
            }
            String var5 = "http://" + var2.field6558 + var3 + "/l=" + class81.field1122 + "/a=" + class111.field1456 + var4 + "/j" + (class242.field3446 ? "1" : "0") + ",o" + (class32.field535 ? "1" : "0") + ",a2";
            try {
                if (arg0 != 67) {
                    field5121 = -105;
                }
                class114.field1473.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class406.field5955 = var2.field6558;
            class128.field1631 = var2.field6560;
            if (class371.field5567 != class339.field4941) {
                class389.field5780 = class128.field1631 + 40000;
                class265.field3762 = class128.field1631 + 50000;
                class140.field1834 = class389.field5780;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(ILhe;Lhe;)V")
    public class355(int arg0, class239 arg1, class239 arg2) {
        this.field5120 = arg1;
        this.field5122 = arg2;
        if (this.field5120 != null) {
            this.field5120.method1473(4309, 0);
        }
        if (this.field5122 != null) {
            this.field5122.method1473(4309, 0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public static void method2151(byte arg0) {
        field5128 = null;
        field5129 = null;
        field5127 = null;
        field5124 = null;
        field5125 = null;
        if (arg0 != -107) {
            field5128 = null;
        }
    }
}
