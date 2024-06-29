import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class100 {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lvc;")
    public class100 field1438;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lc;")
    public class205 field1441;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lss;")
    public static class213 field1440 = new class213("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    public static int[] field1431;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method673(int arg0) {
        if (arg0 == -25336) {
            field1440 = null;
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method674(int arg0) {
        if (arg0 < 92) {
            field1431 = null;
        }
        field1434++;
        int var1 = 0;
        for (int var2 = 0; var2 < class135.field1839; var2++) {
            for (int var3 = 0; var3 < class197.field3038; var3++) {
                if (class24.method149(var3, var2, var1, class217.field3699, -67, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lvc;")
    public final class100 method675(int arg0, byte arg1) {
        field1435++;
        return arg1 >= -64 ? null : new class100(this.field1437, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static final void method676(int arg0) {
        if (class201.field3060 < 0) {
            class484.field7357 = -1;
            class201.field3060 = 0;
            class6.field71 = -1;
        }
        field1432++;
        int var1 = -4 % (-arg0 / 50);
        if (class201.field3060 > class194.field2891) {
            class6.field71 = -1;
            class201.field3060 = class194.field2891;
            class484.field7357 = -1;
        }
        if (class297.field4679 < 0) {
            class297.field4679 = 0;
            class484.field7357 = -1;
            class6.field71 = -1;
        }
        if (class194.field2894 < class297.field4679) {
            class484.field7357 = -1;
            class297.field4679 = class194.field2894;
            class6.field71 = -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lkb;")
    public static final class343 method677(Canvas arg0, int arg1) {
        field1436++;
        try {
            if (arg1 == -1) {
                Class var2 = Class.forName("es");
                class343 var3 = (class343) var2.getDeclaredConstructor().newInstance();
                var3.method527(arg0, arg1 ^ 0xFFFF99B8);
                return var3;
            } else {
                return null;
            }
        } catch (Throwable var5) {
            class72 var4 = new class72();
            var4.method527(arg0, 26183);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lab;")
    public final class444 method678(byte arg0) {
        int var2 = -92 % ((arg0 - 30) / 62);
        field1429++;
        return class414.method2643(true, this.field1437);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method679(String[] arg0, int arg1) {
        field1433++;
        String[] var2 = new String[5];
        if (arg1 != -1) {
            method677(null, 28);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
    public class100(int arg0, int arg1) {
        this.field1437 = arg0;
        this.field1439 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lvc;I)V")
    public class100(class100 arg0, int arg1) {
        this.field1438 = arg0;
        this.field1439 = this.field1438.field1439 + arg1;
        this.field1437 = this.field1438.field1437;
        this.field1441 = this.field1438.field1441;
    }
}
