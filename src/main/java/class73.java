import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class73 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lkn;")
    public static class530 field894 = new class530("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Loi;")
    public static class53 field890;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Loi;")
    public static class53 field896;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lgq;")
    public static final class362 method541(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3471;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public static void method542(boolean arg0) {
        if (arg0) {
            field890 = null;
        }
        field894 = null;
        field890 = null;
        field896 = null;
    }

    @OriginalMember(owner = "client!rv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field891++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([[BLnd;I)V")
    public static final void method543(byte[][] arg0, class388 arg1, int arg2) {
        field892++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class403 var11 = new class403(var10);
                int var12 = class332.field4827[var5] >> 8;
                int var13 = class332.field4827[var5] & 0xFF;
                int var14 = var12 * 64 - class441.field6171;
                int var15 = var13 * 64 - class367.field5241;
                class322.method1949(14);
                arg1.method3125(var14, var11, class441.field6171, var15, class367.field5241, class143.field1877, -1);
                arg1.method2247(var14, -4, class385.field5414, var11, var3, var15);
                if (!arg1.field7784 && class216.field3128 / 8 == var12 && (class341.field4945 / 8) == var13 && var3[0] != -1) {
                    class74.field903 = class361.field5163.method1241(0, var3[1], var3[3], class39.field423, var3[2], var3[0]);
                    class52.field630 = var3[4];
                }
            }
        }
        if (arg2 >= -125) {
            return;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class332.field4827[var6] >> 8) * 64 - class441.field6171;
            int var8 = (class332.field4827[var6] & 0xFF) * 64 - class367.field5241;
            byte[] var9 = arg0[var6];
            if (var9 == null && class341.field4945 < 800) {
                class322.method1949(14);
                arg1.method3132(var8, 64, var7, 64, (byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)Z")
    public static final boolean method544(byte arg0, int arg1, int arg2) {
        field893++;
        if (arg0 != 84) {
            method542(true);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
    public class73(int arg0) {
        this.field895 = arg0;
    }
}
