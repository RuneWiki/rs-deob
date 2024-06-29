import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class522 {

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Lgg;")
    private class114 field7396 = new class114(16);

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Lkha;")
    private class687 field7394;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field7390 = -1;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field7393 = 0;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[S")
    private static short[] field7395 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[S")
    private static short[] field7386 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
    private static short[] field7397 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[[S")
    public static short[][] field7399 = new short[][] { field7395, field7397, field7386 };

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lpa;")
    private final class632 method2996(int arg0, int arg1) {
        field7383++;
        class114 var3 = this.field7396;
        class632 var4;
        synchronized (this.field7396) {
            var4 = (class632) this.field7396.method778((long) arg0, arg1 ^ 0x51);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field7394;
        byte[] var6;
        synchronized (this.field7394) {
            var6 = this.field7394.method3810(arg1, arg1 - 23389, arg0);
        }
        class632 var7 = new class632();
        if (var6 != null) {
            var7.method3437((byte) -53, new class179(var6));
        }
        class114 var8 = this.field7396;
        synchronized (this.field7396) {
            this.field7396.method774((long) arg0, 91, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public final void method2997(int arg0) {
        class114 var2 = this.field7396;
        synchronized (this.field7396) {
            this.field7396.method776((byte) 104);
        }
        if (arg0 != -2029) {
            this.field7394 = null;
        }
        field7387++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method2998(byte arg0) {
        if (arg0 >= -101) {
            method3004(null, (byte) 39, null, 53, null, -24);
        }
        field7399 = null;
        field7395 = null;
        field7386 = null;
        field7397 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIILpq;)Lim;")
    public final class417 method2999(int arg0, int arg1, int arg2, int arg3, int arg4, class184 arg5) {
        field7385++;
        class478[] var7 = null;
        class632 var8 = this.method2996(arg3, 29);
        if (arg2 != 0) {
            this.method3001((byte) 95);
        }
        if (var8.field8770 != null) {
            var7 = new class478[var8.field8770.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class121 var10 = arg5.method1177(var8.field8770[var9], arg2 + 30);
                var7[var9] = new class478(var10.field1466, var10.field1460, var10.field1454, var10.field1461, var10.field1456, var10.field1463, var10.field1465, var10.field1452);
            }
        }
        return new class417(var8.field8771, var7, var8.field8766, arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method3000(boolean arg0, byte[] arg1) {
        field7392++;
        if (arg1 == null) {
            return null;
        }
        if (arg0) {
            field7397 = null;
        }
        byte[] var2 = new byte[arg1.length];
        class617.method3389(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
    public final void method3001(byte arg0) {
        class114 var2 = this.field7396;
        synchronized (this.field7396) {
            this.field7396.method781((byte) 47);
        }
        field7384++;
        int var3 = -55 % ((arg0 - 50) / 45);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IC)Z")
    public static final boolean method3002(int arg0, char arg1) {
        field7388++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 != arg1) {
            char[] var2 = class244.field3144;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
    public final void method3003(int arg0, int arg1) {
        field7398++;
        class114 var3 = this.field7396;
        synchronized (this.field7396) {
            if (arg1 == -7816) {
                this.field7396.method775(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class522(class286 arg0, int arg1, class687 arg2) {
        this.field7394 = arg2;
        this.field7394.method3812(0, 29);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ld;BLkha;ILjava/awt/Canvas;I)Lha;")
    public static final class454 method3004(class96 arg0, byte arg1, class687 arg2, int arg3, Canvas arg4, int arg5) {
        field7391++;
        int var6 = 0;
        int var7 = 0;
        if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        if (arg1 <= 14) {
            method2998((byte) -71);
        }
        return class454.method2664(arg2, arg0, arg4, arg3, var7, var6, arg5, (byte) 119);
    }
}
