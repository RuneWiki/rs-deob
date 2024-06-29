import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class95 extends class392 {

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1359 = new Rectangle[100];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lin;")
    public static class380 field1353 = new class380(63, 6);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lin;")
    public static class380 field1354;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static void method795(int arg0) {
        field1359 = null;
        field1353 = null;
        field1354 = null;
        if (arg0 != 63) {
            method796(-98);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (~super.field5452 != -2 && super.field5452 != 0) {
            super.field5452 = this.method292(!arg0);
        }
        if (arg0) {
            field1354 = null;
        }
        ++field1361;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method796(int arg0) {
        ++field1362;
        if (arg0 != -22907) {
            field1359 = null;
        }
        class609.method3528((byte) 5);
        class383.field5382 = false;
        class515.method3026(class414.field5678, (byte) -36, class389.field5438, class295.field4297, class72.field1137);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field1355;
        if (arg1 >= -124) {
            field1353 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lw;)V")
    public class95(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static final void method797(int arg0) {
        ++field1357;
        class694 var1 = null;
        try {
            class746 var2 = class336.field4775.method907("", true, -14087);
            while (var2.field10365 == 0) {
                class579.method3405(1L, 10);
            }
            if (~var2.field10365 == -2) {
                var1 = (class694) var2.field10371;
                class431 var3 = class420.field5820.method3785(24);
                var1.method3898(var3.field6002, (byte) -74, var3.field5983, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method3900(96);
            }
            int var4 = -4 % ((22 - arg0) / 56);
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILw;)V")
    public class95(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        int var3 = 5 / ((arg0 - -80) / 38);
        ++field1356;
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field1360;
        if (!arg0) {
            method796(-24);
        }
        return 1;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)I")
    public final int method798(int arg0) {
        if (arg0 != 17539) {
            return -121;
        } else {
            ++field1358;
            return super.field5452;
        }
    }
}
