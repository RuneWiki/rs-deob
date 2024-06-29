import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class75 extends class61 {

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1363 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "Laj;")
    public static class46 field1366 = new class46(32);

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1368 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Leb;")
    public static class230 field1370 = class68.method589(0, "Nehmen");

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Z")
    public static boolean field1372 = false;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
    public static int[] field1373 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "Leb;")
    public class230 field1369;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lka;")
    public class245 field1354;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lka;")
    public class245 field1367;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lgd;")
    public static class73 field1371;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Z")
    public boolean field1356;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[Ljava/lang/Object;")
    public Object[] field1364;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1365++;
        if (arg0 == arg4) {
            class234.method1651((byte) -65, arg0, arg5, arg3, arg1);
            return;
        }
        if (class78.field1404 <= arg5 - arg0 && class42.field769 >= arg0 + arg5 && arg3 - arg4 >= class15.field345 && arg3 + arg4 <= class259.field4587) {
            class17.method216(arg3, arg1, arg5, arg0, arg4, -1);
        } else {
            class262.method1822(arg5, arg4, arg1, arg3, (byte) -94, arg0);
        }
        if (arg2 != 0) {
            field1373 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILka;)V")
    public static final void method630(int arg0, int arg1, int arg2, class245 arg3) {
        field1355++;
        if (class34.field639 != 0 && class34.field639 != 3 || !arg3.method1717(0)) {
            return;
        }
        int var4 = arg3.field4314[arg1];
        if (var4 > arg2 || arg2 > var4 + arg3.field4241[arg1]) {
            return;
        }
        int var5 = arg1 - arg3.field4307 / 2;
        int var6 = arg2 - arg3.field4325 / 2;
        int var7 = class34.field641 + class167.field2953 & 0x7FF;
        int var8 = class3.field21[var7];
        int var9 = class3.field24[var7];
        if (arg0 > 0) {
            method630(16, -15, -91, (class245) null);
        }
        int var10 = (class163.field2911 + 256) * var8 >> 8;
        int var11 = (class163.field2911 + 256) * var9 >> 8;
        int var12 = var5 * var11 - (var6 * var10) >> 11;
        int var13 = var5 * var10 + var6 * var11 >> 11;
        int var14 = class56.field1033.field2274 + var13 >> 7;
        int var15 = class56.field1033.field2300 - var12 >> 7;
        if (class30.field545 > 0 && class28.field515[82] && class28.field515[81]) {
            class40.method355(class272.field4795 + var14, class155.field2759 - -var15, (byte) -128, class124.field2174);
            return;
        }
        boolean var16 = class15.method208(0, class56.field1033.field2296[0], 0, true, 1, var14, var15, 0, 118, 0, 0, class56.field1033.field2253[0]);
        if (!var16) {
            return;
        }
        class153.field2747.method170((byte) 119, var6);
        class153.field2747.method170((byte) 111, var5);
        class153.field2747.method181(-20053, class34.field641);
        class153.field2747.method170((byte) 118, 57);
        class153.field2747.method170((byte) 111, class167.field2953);
        class153.field2747.method170((byte) 120, class163.field2911);
        class153.field2747.method170((byte) 117, 89);
        class153.field2747.method181(-20053, class56.field1033.field2274);
        class153.field2747.method181(-20053, class56.field1033.field2300);
        class153.field2747.method170((byte) 114, class238.field4115);
        class153.field2747.method170((byte) 121, 63);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method631(int arg0) {
        field1371 = null;
        field1368 = null;
        field1366 = null;
        field1363 = null;
        field1373 = null;
        field1370 = null;
        if (arg0 != 0) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)Leb;")
    public static final class230 method632(int arg0, int arg1) {
        field1361++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class230 var2 = new class230();
        var2.field3988 = new byte[1];
        if (arg0 == 2) {
            var2.field3988[0] = (byte) arg1;
            var2.field3990 = 1;
            return var2;
        } else {
            return null;
        }
    }
}
