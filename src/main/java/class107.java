import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class107 extends class507 {

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "Lua;")
    public static class581 field1276 = new class581();

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "Lig;")
    public static class206 field1279 = new class206(27, 16);

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)V")
    public final void method656(int arg0, boolean arg1) {
        ++field1282;
        super.field7377.method2295(arg0 + -10574, this);
        if (arg0 != 10497) {
            field1276 = null;
        }
        OpenGL.glTexParameteri(super.field7373, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)V")
    public static void method657(boolean arg0) {
        if (arg0) {
            field1279 = null;
        }
        field1276 = null;
        field1279 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method592(int arg0) {
        if (arg0 == 0) {
            ++field1281;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lad;II[BI)V")
    public class107(class362 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1278 = arg2;
        super.field7377.method2295(-78, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7373, 0, super.field7379, this.field1278, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILmm;III)V")
    public static final void method658(int arg0, class236 arg1, int arg2, int arg3, int arg4) {
        ++field1275;
        if (arg0 != 32274) {
            field1279 = null;
        }
        long var5 = (long) (arg3 << 28 | arg2 << 14 | arg4);
        class446 var7 = (class446) class294.field4247.method524((byte) 86, var5);
        if (var7 == null) {
            class446 var8 = new class446();
            class294.field4247.method520((byte) -112, var8, var5);
            var8.field6669.method706(arg1, true);
        } else {
            class190 var9 = class622.field8999.method25(arg1.field3385, -73);
            int var10 = var9.field2351;
            if (var9.field2363 == 1) {
                var10 = (arg1.field3379 + 1) * var10;
            }
            for (class236 var11 = (class236) var7.field6669.method719(false); var11 != null; var11 = (class236) var7.field6669.method716(14)) {
                class190 var12 = class622.field8999.method25(var11.field3385, -43);
                int var13 = var12.field2351;
                if (var12.field2363 == 1) {
                    var13 = (var11.field3379 + 1) * var13;
                }
                if (~var13 > ~var10) {
                    class608.method3531(var11, arg1, (byte) 69);
                    return;
                }
            }
            var7.field6669.method706(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
    public static final int method659(Random arg0, boolean arg1, int arg2) {
        ++field1277;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class229.method1482(arg2, 18)) {
            return (int) (((long) arg0.nextInt() & 4294967295L) * (long) arg2 >> 32);
        } else if (arg1) {
            return 3;
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class573.method3336(arg2, var4, 512);
        }
    }
}
