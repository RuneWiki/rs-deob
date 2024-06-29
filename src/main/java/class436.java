import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class436 extends class330 {

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field6390;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field6396;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field6391;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6387 = " is already on your ignore list.";

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "S")
    public static short field6392 = 205;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Z")
    public static boolean field6388 = true;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "[I")
    public static int[] field6394 = new int[100];

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field6393 = 0;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
    public static final void method2708(int arg0, int arg1) {
        class331 var2 = class42.field512;
        synchronized (class42.field512) {
            if (arg0 != -11042) {
                method2710(-6, (byte) -103);
            }
            class42.field512.method2054(-70, arg1);
        }
        field6395++;
        class331 var3 = class140.field1983;
        synchronized (class140.field1983) {
            class140.field1983.method2054(-97, arg1);
        }
        class148 var4 = class134.field1864;
        synchronized (class134.field1864) {
            class134.field1864.method875(arg1, -86);
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V")
    public static void method2709(int arg0) {
        if (arg0 != 205) {
            method2708(114, -73);
        }
        field6394 = null;
        field6387 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z")
    public static final boolean method2710(int arg0, byte arg1) {
        field6397++;
        if (arg1 != -15) {
            field6394 = null;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILra;II)Lgg;")
    public static final class95 method2711(int arg0, class57 arg1, int arg2, int arg3) {
        field6385++;
        class211 var4 = new class211(arg1.method361(arg2, 78, arg0));
        class95 var5 = new class95(arg0, var4.method1350(82), var4.method1350(arg3 ^ 0x70), var4.method1336((byte) -107), var4.method1336((byte) -111), var4.method1342((byte) -127) == arg3, var4.method1342((byte) -127));
        int var6 = var4.method1342((byte) -128);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1056.method1125(-1, new class281(var4.method1342((byte) -127), var4.method1355(arg3 + 32135), var4.method1355(32136), var4.method1355(32136), var4.method1355(32136), var4.method1355(32136), var4.method1355(32136), var4.method1355(32136), var4.method1355(32136)));
        }
        var5.method515(121);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIII)V")
    public class436(int arg0, int arg1, int arg2, int arg3) {
        this.field6386 = arg1;
        this.field6390 = arg0;
        this.field6396 = arg3;
        this.field6391 = arg2;
    }
}
