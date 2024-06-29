import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class256 extends class499 {

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Z")
    public boolean field3503 = false;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Lhda;")
    public static class752 field3514 = new class752(0, 4);

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lht;")
    public static class582 field3516 = new class582(10, 7);

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Ldia;")
    public static class235 field3517 = new class235("", 11);

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "B")
    public byte field3508;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "B")
    public byte field3515;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lkf;")
    public class256 field3513;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Z")
    public boolean field3511;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Z")
    public abstract boolean method801(boolean arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZI)V")
    public static final void method1555(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        field3506++;
        for (int var5 = 0; var5 < class601.field7899; var5++) {
            Rectangle var6 = class179.field2712[var5];
            if (arg1 < var6.x + var6.width && var6.x < (arg1 + arg2) && arg0 < (var6.y + var6.height) && var6.y < arg0 + arg4) {
                class319.field4545[var5] = true;
            }
        }
        class62.method539(arg1 + arg2, arg1, (byte) -126, arg0 + arg4, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)I")
    public static final int method1556(byte arg0) {
        field3512++;
        class59 var1 = class341.field4807;
        boolean var2 = false;
        if (class411.field5711.field3913.method3282(true) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class313.method1918(0, 0, 0, null, null, var3);
            var2 = true;
        }
        long var4 = class375.method2193(116);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method462(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class375.method2193(116) - var4);
        var1.method489(100, 11, 100, 0, 0, -16777216);
        if (var2) {
            var1.method487(91);
        }
        int var8 = -17 % ((-arg0 - 5) / 61);
        return var7;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ltn;B)I")
    public abstract int method1557(class87[] arg0, byte arg1);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)I")
    public abstract int method791(byte arg0);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
    public abstract boolean method798(int arg0);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)Z")
    public abstract boolean method1558(int arg0);

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)I")
    public int method1451(int arg0) {
        field3501++;
        return arg0 > 0 ? 55 : 0;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)V")
    public static void method1559(byte arg0) {
        field3514 = null;
        field3516 = null;
        field3517 = null;
        if (arg0 >= -3) {
            field3518 = 59;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lkf;Lha;IIIZI)V")
    public abstract void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lha;B)V")
    public abstract void method792(class59 arg0, byte arg1);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)Z")
    public abstract boolean method806(byte arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLha;)Lck;")
    public abstract class642 method808(byte arg0, class59 arg1);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lha;B)Z")
    public abstract boolean method1560(class59 arg0, byte arg1);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public abstract void method803(int arg0);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILha;)Lww;")
    public abstract class733 method800(int arg0, class59 arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lha;IIB)Z")
    public abstract boolean method790(class59 arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)I")
    public abstract int method789(int arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ltn;IBI)I")
    public final int method1561(class87[] arg0, int arg1, byte arg2, int arg3) {
        field3504++;
        long var5 = class458.field6263[this.field3508][arg1][arg3];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg0[var9++] = class573.field7526[var10 - 1].field9602;
            var7 += 16L;
        }
        if (arg2 != 85) {
            method1556((byte) -22);
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }
}
