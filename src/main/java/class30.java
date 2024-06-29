import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class30 {

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field273 = -1;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[[[I")
    public static int[][][] field275;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[[[I")
    public static int[][][] field278;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLra;Lra;)I")
    public static final int method168(byte arg0, class57 arg1, class57 arg2) {
        field271++;
        int var3 = 108 / ((arg0 + 22) / 37);
        int var4 = 0;
        if (arg2.method345(1, class417.field5990)) {
            var4++;
        }
        if (arg2.method345(1, class242.field3277)) {
            var4++;
        }
        if (arg2.method345(1, class166.field2331)) {
            var4++;
        }
        if (arg1.method345(1, class417.field5990)) {
            var4++;
        }
        if (arg1.method345(1, class242.field3277)) {
            var4++;
        }
        if (arg1.method345(1, class166.field2331)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)[B")
    public static final byte[] method169(byte[] arg0, byte arg1) {
        field279++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 >= -86) {
            field278 = null;
        }
        byte[] var2 = new byte[arg0.length];
        class408.method2571(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)V")
    public abstract void method170(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field275 = null;
        if (!arg0) {
            field272 = -120;
        }
        field278 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIB)V")
    public abstract void method172(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLjava/lang/String;I)I")
    public static final int method173(boolean arg0, boolean arg1, String arg2, int arg3) {
        field274++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = arg1;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class30(int arg0, int arg1, int arg2) {
        this.field277 = arg1;
        this.field270 = arg2;
        this.field276 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public abstract void method174(int arg0, int arg1, int arg2);
}
