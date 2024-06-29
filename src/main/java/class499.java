import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class499 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
    public int[] field6857;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "J")
    public long field6856;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
    public short[] field6859;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "[S")
    public short[] field6862;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6858 = 765;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6860 = 0;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "Z")
    public static boolean field6863 = false;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
    public static final void method2917(int arg0, int arg1, int arg2, int arg3) {
        field6864++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & arg2) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class467.method2730(true, false, var4, 10);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIILpe;)V")
    public static final void method2918(int arg0, int arg1, int arg2, int arg3, int arg4, class685 arg5) {
        field6865++;
        class160 var6 = null;
        class160 var7 = (class160) class117.field1994.method3731((byte) -123);
        if (arg0 < 52) {
            return;
        }
        while (var7 != null) {
            if (var7.field2489 == arg4 && var7.field2479 == arg1 && var7.field2488 == arg2 && var7.field2484 == arg3) {
                var6 = var7;
                break;
            }
            var7 = (class160) class117.field1994.method3729((byte) 68);
        }
        if (var6 == null) {
            var6 = new class160();
            var6.field2488 = arg2;
            var6.field2489 = arg4;
            var6.field2479 = arg1;
            var6.field2484 = arg3;
            class117.field1994.method3728((byte) 122, var6);
        }
        var6.field2480 = arg5;
        var6.field2483 = true;
        var6.field2485 = false;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
    public static final void method2919(int arg0, int arg1) {
        field6861++;
        class371 var2 = class490.method2867((byte) -60, 10, (long) arg0);
        var2.method2215(arg1 ^ 0x6948);
        if (arg1 != 26956) {
            method2918(39, 106, 112, -104, -11, null);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(J[I[S[S)V")
    public class499(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field6857 = arg1;
        this.field6856 = arg0;
        this.field6859 = arg3;
        this.field6862 = arg2;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
    protected class499() {
    }
}
