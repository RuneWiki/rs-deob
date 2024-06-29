import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class13 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field140 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)Z", line = 8)
    public static final boolean method66(int arg0, int arg1, byte arg2) {
        if (arg2 <= 90) {
            method69(-98, -110, null);
        }
        field138++;
        return class734.method4090(29441, arg1, arg0) | (arg1 & 0x70000) != 0 || class297.method1855(arg1, arg0, 14);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILsl;)Lada;", line = 19)
    public static final class390 method67(int arg0, class479 arg1) {
        field139++;
        class14 var2 = class176.method1266(24)[arg1.method2886(true)];
        class141 var3 = class501.method3050(true)[arg1.method2886(true)];
        if (arg0 != 0) {
            method67(108, null);
        }
        int var4 = arg1.method2870(arg0 - 11395);
        int var5 = arg1.method2870(-11395);
        int var6 = arg1.method2882(-1);
        int var7 = arg1.method2882(~arg0);
        int var8 = arg1.method2870(-11395);
        int var9 = arg1.method2868(-87);
        int var10 = arg1.method2868(-43);
        return new class390(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 51)
    public static final void method68(int arg0) {
        for (int var1 = arg0; var1 < class160.field2297.length; var1++) {
            for (int var2 = 0; var2 < class160.field2297[0].length; var2++) {
                for (int var3 = 0; var3 < class160.field2297[0][0].length; var3++) {
                    class160.field2297[var1][var2][var3] = 0;
                }
            }
        }
        field141++;
    }

    @OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;", line = 85)
    public final String toString() {
        field136++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[F)[F", line = 98)
    public static final float[] method69(int arg0, int arg1, float[] arg2) {
        if (arg1 != 25189) {
            method66(73, -37, (byte) -32);
        }
        field135++;
        float[] var3 = new float[arg0];
        class85.method679(arg2, 0, var3, 0, arg0);
        return var3;
    }
}
