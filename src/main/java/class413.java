import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class413 extends class98 {

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Z")
    public static boolean field6343 = false;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6331 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "Lhga;")
    public static class158 field6345 = new class158(86, 14);

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field6347 = 0;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public int field6333;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public int field6340;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "Lps;")
    public static class82 field6346;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljava/lang/String;")
    public String field6339;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I")
    public final int method2629(boolean arg0) {
        if (arg0) {
            method2630((byte) 6);
        }
        ++field6344;
        return (int) (super.field844 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
    public static void method2630(byte arg0) {
        if (arg0 <= -9) {
            field6331 = null;
            field6346 = null;
            field6345 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljga;")
    public static final class666 method2631(Throwable arg0, String arg1) {
        ++field6335;
        class666 var2;
        if (arg0 instanceof class666) {
            var2 = (class666) arg0;
            var2.field9432 = var2.field9432 + ' ' + arg1;
        } else {
            var2 = new class666(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method2632(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        if (arg0 != -29801) {
            field6345 = null;
        }
        ++field6341;
        class87 var8 = new class87();
        var8.field1056 = class562.field8084 + arg6;
        var8.field1059 = arg3;
        var8.field1057 = arg4;
        var8.field1060 = arg2;
        var8.field1069 = arg5;
        var8.field1063 = arg7;
        var8.field1067 = arg1;
        class677.field9525.method2757(var8, -1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method2633(int arg0) {
        ++field6334;
        super.field1586 |= Long.MIN_VALUE;
        if (arg0 != 16777215) {
            this.field6333 = 12;
        }
        if (this.method2635(arg0 + -16777214) == 0L) {
            class266.field4321.method2015(this, -49);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public final void method2634(int arg0) {
        super.field1586 = Long.MIN_VALUE & super.field1586 | 500L + class112.method1033(arg0 ^ -1065777672);
        ++field6332;
        class160.field2729.method2015(this, arg0 ^ -1065768910);
        if (arg0 != 1065768928) {
            this.method2635(21);
        }
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)J")
    public final long method2635(int arg0) {
        if (arg0 != 1) {
            this.method2633(8);
        }
        ++field6338;
        return super.field1586 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    public static final int method2636(int arg0, int arg1) {
        ++field6342;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 <= 126) {
            field6343 = true;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V")
    public class413(int arg0, int arg1) {
        super.field844 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)I")
    public final int method2637(boolean arg0) {
        if (!arg0) {
            return -64;
        } else {
            ++field6336;
            return (int) super.field844;
        }
    }
}
