import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class345 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Laj;")
    private class287 field5159 = new class287(64);

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Laj;")
    public class287 field5162 = new class287(2);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "Lom;")
    public class344 field5155;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lom;")
    private class344 field5154;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
    public final void method2246(int arg0, int arg1) {
        field5157++;
        class287 var3 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method1908(arg1, (byte) -11);
        }
        class287 var4 = this.field5162;
        synchronized (this.field5162) {
            int var5 = -54 / ((83 - arg0) / 33);
            this.field5162.method1908(arg1, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIIII)V")
    public static final void method2247(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -19) {
            return;
        }
        field5158++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        class705.method3938(arg3 + arg4, arg2, 30336, arg4 - arg3, class582.field8429[arg1]);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class582.field8429[arg1 + var6];
                int[] var10 = class582.field8429[arg1 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class705.method3938(var11, arg2, 30336, var12, var9);
                class705.method3938(var11, arg2, 30336, var12, var10);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class582.field8429[arg1 + var5];
            int[] var16 = class582.field8429[arg1 - var5];
            class705.method3938(var13, arg2, 30336, var14, var15);
            class705.method3938(var13, arg2, 30336, var14, var16);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public final void method2248(int arg0) {
        field5160++;
        class287 var2 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method1913(true);
        }
        class287 var3 = this.field5162;
        synchronized (this.field5162) {
            if (arg0 != 17235) {
                this.field5154 = null;
            }
            this.field5162.method1913(true);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Lic;")
    public final class651 method2249(byte arg0, int arg1) {
        int var3 = 85 % ((73 - arg0) / 33);
        field5156++;
        class287 var4 = this.field5159;
        class651 var5;
        synchronized (this.field5159) {
            var5 = (class651) this.field5159.method1900((long) arg1, -61);
        }
        if (var5 != null) {
            return var5;
        }
        class344 var6 = this.field5154;
        byte[] var7;
        synchronized (this.field5154) {
            var7 = this.field5154.method2216(33, arg1, true);
        }
        class651 var8 = new class651();
        var8.field9389 = this;
        if (var7 != null) {
            var8.method3720(new class61(var7), (byte) -105);
        }
        class287 var9 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method1904(var8, (long) arg1, -1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public final void method2250(boolean arg0) {
        class287 var2 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method1912(-2552);
            if (!arg0) {
                this.method2250(false);
            }
        }
        field5161++;
        class287 var3 = this.field5162;
        synchronized (this.field5162) {
            this.field5162.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lmea;ILom;Lom;)V")
    public class345(class398 arg0, int arg1, class344 arg2, class344 arg3) {
        this.field5155 = arg3;
        this.field5154 = arg2;
        this.field5154.method2236(33, 0);
    }
}
