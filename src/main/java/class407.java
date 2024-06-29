import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class407 extends class467 {

    @OriginalMember(owner = "client!as", name = "n", descriptor = "[[I")
    public static int[][] field6148 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
    public static void method2482(byte arg0) {
        field6148 = null;
        if (arg0 != 67) {
            method2486(51, 21, 98, null);
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
    public static final void method2483(byte arg0) {
        class40.field622 = class34.field532.field58 + class34.field532.field44 + 2;
        field6151++;
        class341.field5382 = new String[500];
        if (arg0 != 104) {
            method2486(104, 27, 114, null);
        }
        class270.field3750 = class472.field6901.field58 + class472.field6901.field44 + 2;
        for (int var1 = 0; var1 < class341.field5382.length; var1++) {
            class341.field5382[var1] = "";
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[B)Z")
    public static final boolean method2484(int arg0, byte[] arg1) {
        if (arg0 != 23075) {
            method2487(null, -49, 30, false);
        }
        field6150++;
        class91 var2 = new class91(arg1);
        int var3 = var2.method618((byte) 100);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method618((byte) 100) == 1;
        if (var4) {
            class215.method1465(var2, (byte) -41);
        }
        class13.method111(var2, arg0 + 42460);
        return true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IBIII)V")
    public static final void method2485(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 55) {
            return;
        }
        for (int var5 = 0; var5 < class425.field6335; var5++) {
            Rectangle var6 = class383.field5834[var5];
            if (arg0 < var6.x + var6.width && (arg0 + arg3) > var6.x && arg2 < (var6.y + var6.height) && var6.y < (arg2 + arg4)) {
                class527.field7783[var5] = true;
            }
        }
        field6152++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method2486(int arg0, int arg1, int arg2, byte[] arg3) {
        field6154++;
        byte[] var4 = new byte[arg0];
        if (arg1 != 20779) {
            field6153 = 120;
        }
        class361.method2281(arg3, arg2, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljb;IIZ)V")
    public static final void method2487(class499 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method2484(25, null);
        }
        field6149++;
        class15 var4 = arg0.method2975((byte) -128, class337.field5242);
        if (var4 == null) {
            return;
        }
        class337.field5242.method1046(arg2, arg1, arg2 + arg0.field7348, arg0.field7386 + arg1);
        if (class93.field1352 >= 3) {
            class337.field5242.method1080(-16777216, var4, arg2, arg1);
        } else {
            class112.field1564.method1338((float) arg0.field7348 / 2.0F + (float) arg2, (float) arg0.field7386 / 2.0F + (float) arg1, 4096, ((int) (-class482.field7022) & 0x3FFF) << 2, var4, arg2, arg1);
        }
    }
}
