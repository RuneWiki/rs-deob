import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class446 extends class390 {

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "J")
    public long field6253;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lpn;")
    public class446 field6251;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Lpn;")
    public class446 field6254;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "[I")
    public static int[] field6255;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "[[B")
    public static byte[][] field6257;

    static {
        new class442((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field6250 = 0;
        field6247 = 0;
        new class442("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6256 = 0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method2779(int arg0, int arg1, int arg2, int arg3) {
        field6249++;
        int var4 = arg2 / arg3;
        int var5 = 36 / ((arg0 + 60) / 38);
        int var6 = arg2 & arg3 - 1;
        int var7 = arg1 / arg3;
        int var8 = arg3 - 1 & arg1;
        int var9 = class333.method2141(var7, var4, (byte) 70);
        int var10 = class333.method2141(var7, var4 + 1, (byte) 70);
        int var11 = class333.method2141(var7 + 1, var4, (byte) 70);
        int var12 = class333.method2141(var7 + 1, var4 + 1, (byte) 70);
        int var13 = class156.method1046(var6, 65536, arg3, var10, var9);
        int var14 = class156.method1046(var6, 65536, arg3, var12, var11);
        return class156.method1046(var8, 65536, arg3, var14, var13);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z", line = 36)
    public final boolean method2780(int arg0) {
        field6246++;
        if (arg0 > -70) {
            method2781((byte) 79, 61);
        }
        return this.field6251 != null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V", line = 60)
    public static final void method2781(byte arg0, int arg1) {
        field6248++;
        if (arg0 == 39) {
            class131 var2 = class99.field1373;
            synchronized (class99.field1373) {
                class99.field1373.method901(arg1, 12223);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I", line = 82)
    public static final int method2782(int arg0, int arg1) {
        if (arg1 != -600762936) {
            field6256 = -114;
        }
        field6252++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V", line = 97)
    public final void method2783(byte arg0) {
        if (arg0 != -122) {
            field6256 = -11;
        }
        field6245++;
        if (this.field6251 != null) {
            this.field6251.field6254 = this.field6254;
            this.field6254.field6251 = this.field6251;
            this.field6254 = null;
            this.field6251 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V", line = 123)
    public static void method2784(int arg0) {
        if (arg0 == 1) {
            field6257 = null;
            field6255 = null;
        }
    }
}
