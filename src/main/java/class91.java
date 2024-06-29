import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class91 extends class28 {

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public int field1110 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field1120 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field1121 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field1119 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field1122 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field1124 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field1125 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field1118 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lmaa;")
    public class588 field1111;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lkca;")
    public static class537 field1113 = new class537();

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lcb;")
    public static class318 field1117 = new class318(113, 8);

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Ljj;")
    public static class398 field1127 = new class398(0, 8);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field1126;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eb", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1129;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    public static int[] field1112;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "[[B")
    public static byte[][] field1128;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)Z")
    public final boolean method501(byte arg0, int arg1, int arg2) {
        field1114++;
        if (this.field1110 <= arg2 && arg2 <= this.field1120 && this.field1121 <= arg1 && arg1 <= this.field1122) {
            return true;
        } else {
            if (arg0 != 91) {
                method503(-43);
            }
            return this.field1125 <= arg2 && arg2 <= this.field1124 && this.field1119 <= arg1 && this.field1118 >= arg1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method502(int arg0) {
        if (arg0 != 16416) {
            method502(-75);
        }
        field1128 = null;
        field1117 = null;
        field1127 = null;
        field1112 = null;
        field1113 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
    public static final int method503(int arg0) {
        if (arg0 >= -69) {
            return 20;
        } else {
            field1115++;
            return class310.field4164++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII[B[I[[B[[B[I)I")
    public static final int method504(byte arg0, int arg1, int arg2, byte[] arg3, int[] arg4, byte[][] arg5, byte[][] arg6, int[] arg7) {
        field1123++;
        int var8 = arg4[arg1];
        int var9 = arg7[arg1] + var8;
        int var10 = arg4[arg2];
        int var11 = arg7[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        int var14 = -54 % ((arg0 + 50) / 63);
        if (var9 > var11) {
            var13 = var11;
        }
        int var15 = arg3[arg1] & 0xFF;
        if (var15 > (arg3[arg2] & 0xFF)) {
            var15 = arg3[arg2] & 0xFF;
        }
        byte[] var16 = arg5[arg1];
        byte[] var17 = arg6[arg2];
        int var18 = var12 - var8;
        int var19 = var12 - var10;
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var16[var18++] + var17[var19++];
            if (var21 < var15) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method505(int arg0, byte arg1, int arg2) {
        field1126++;
        if (arg1 <= 12) {
            method506((byte) 87);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method506(byte arg0) {
        field1116++;
        if (arg0 > -50) {
            field1117 = null;
        }
        try {
            Method var1 = (field1129 == null ? (field1129 = method507("java.lang.Runtime")) : field1129).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class334.field4911 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lmaa;)V")
    public class91(class588 arg0) {
        this.field1111 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method507(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
