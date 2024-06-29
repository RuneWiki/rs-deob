import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class593 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Lfh;")
    private class653 field8285;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field8287 = 0;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field8290 = -1;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Z")
    public static boolean field8288 = false;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8293 = new Hashtable();

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Ldfa;")
    private class168 field8286;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZ)Lpc;", line = 6)
    public static final class672 method3359(byte[] arg0, boolean arg1) {
        field8292++;
        class672 var2 = new class672();
        class461 var3 = new class461(arg0);
        var3.field6193 = var3.field6180.length - 2;
        int var4 = var3.method2566(-2);
        int var5 = var3.field6180.length - var4 - 2 - 12;
        var3.field6193 = var5;
        int var6 = var3.method2622(-539564808);
        var2.field9405 = var3.method2566(-2);
        var2.field9404 = var3.method2566(-2);
        var2.field9403 = var3.method2566(-2);
        var2.field9408 = var3.method2566(-2);
        int var7 = var3.method2600((byte) -126);
        if (var7 > 0) {
            var2.field9413 = new class165[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2566(-2);
                class165 var10 = new class165(class565.method3253(108, var9));
                var2.field9413[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2622(-539564808);
                    int var12 = var3.method2622(-539564808);
                    var10.method1153(new class393(var12), (long) var11, -1);
                }
            }
        }
        var3.field6193 = 0;
        var2.field9414 = var3.method2585((byte) 93);
        var2.field9412 = new String[var6];
        if (!arg1) {
            method3359(null, true);
        }
        var2.field9407 = new int[var6];
        var2.field9406 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field6193) {
            int var14 = var3.method2566(-2);
            if (var14 == 3) {
                var2.field9412[var13] = var3.method2574(-1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field9406[var13] = var3.method2600((byte) -126);
            } else {
                var2.field9406[var13] = var3.method2622(-539564808);
            }
            var2.field9407[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 90)
    public class593() {
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lfh;)V", line = 94)
    public class593(class653 arg0) {
        this.field8285 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)Ldfa;", line = 109)
    public final class168 method3360(boolean arg0) {
        if (arg0) {
            field8290 = 20;
        }
        field8295++;
        class168 var2 = this.field8286;
        if (this.field8285.field9083 == var2) {
            this.field8286 = null;
            return null;
        } else {
            this.field8286 = var2.field2336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 131)
    public static void method3361(int arg0) {
        field8293 = null;
        int var1 = -54 / ((arg0 - 15) / 52);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILfh;)V", line = 145)
    public final void method3362(int arg0, class653 arg1) {
        field8291++;
        this.field8285 = arg1;
        if (arg0 != -21664) {
            field8293 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Ldfa;", line = 159)
    public final class168 method3363(int arg0) {
        field8289++;
        class168 var2 = this.field8285.field9083.field2336;
        if (this.field8285.field9083 == var2) {
            this.field8286 = null;
            return null;
        }
        if (arg0 >= -103) {
            field8290 = 108;
        }
        this.field8286 = var2.field2336;
        return var2;
    }
}
