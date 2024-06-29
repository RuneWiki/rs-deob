import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 {

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "Lvl;")
    public class15 field171 = new class15();

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "Z")
    public boolean field176 = false;

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "[I")
    public static int[] field173 = new int[1];

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "Laj;")
    public static class333 field175;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Ldfa;I)V", line = 4)
    public final void method88(class176 arg0, int arg1) {
        field169++;
        class167 var3 = arg0.field2347;
        boolean var4 = true;
        class431[] var5 = arg0.field2345;
        if (arg1 != -15621) {
            this.method88(null, 97);
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field6126) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field176) {
            for (class176 var7 = (class176) this.field171.method109(arg1 ^ 0xFFFFC2FB); var7 != null; var7 = (class176) this.field171.method115((byte) 91)) {
                if (var7.field2347 == var3) {
                    var7.method2922((byte) -83);
                    class670.method3726(var7, (byte) 120);
                }
            }
        }
        for (class176 var8 = (class176) this.field171.method109(0); var8 != null; var8 = (class176) this.field171.method115((byte) -104)) {
            if (var3.field2253 >= var8.field2347.field2253) {
                class136.method1065(true, var8, arg0);
                return;
            }
        }
        this.field171.method106(arg0, (byte) 119);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILaj;Ld;BILjava/awt/Canvas;)Lha;", line = 77)
    public static final class65 method89(int arg0, class333 arg1, class161 arg2, byte arg3, int arg4, Canvas arg5) {
        field172++;
        int var6 = 0;
        int var7 = 0;
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        if (arg3 != -83) {
            field175 = null;
        }
        return class65.method463(arg4, var6, arg5, (byte) 100, arg0, arg2, var7, arg1);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V", line = 103)
    public static void method90(int arg0) {
        if (arg0 != 1) {
            field173 = null;
        }
        field175 = null;
        field173 = null;
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Z)V", line = 144)
    public class11(boolean arg0) {
        this.field176 = arg0;
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V", line = 119)
    public final void method91(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field170++;
        while (true) {
            class176 var2 = (class176) this.field171.method111((byte) -7);
            if (var2 == null) {
                return;
            }
            var2.method2922((byte) -75);
            class670.method3726(var2, (byte) 100);
        }
    }
}
