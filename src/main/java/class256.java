import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class256 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3698 = new Rectangle[100];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "B")
    public static byte field3705;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lwd;")
    public static class36 field3703;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field3698[var0] = new Rectangle();
        }
        field3704 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(CB)Z", line = 3)
    public static final boolean method1848(char arg0, byte arg1) {
        if (arg1 != 59) {
            field3705 = 79;
        }
        field3699++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lkh;", line = 20)
    public static final class69 method1849(int arg0, int arg1) {
        field3702++;
        class391[] var2 = class282.field4226;
        synchronized (class282.field4226) {
            if (arg1 <= 62) {
                method1848('o', (byte) -93);
            }
            class69 var3;
            if (arg0 >= class282.field4226.length || class282.field4226[arg0].method2485(-97)) {
                var3 = new class69();
                var3.field1128 = new class290[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field1128[var4] = new class290();
                }
            } else {
                var3 = (class69) class282.field4226[arg0].method2489((byte) 111);
                var3.method2731((byte) 127);
                int var10002 = class148.field2284[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V", line = 58)
    public static final void method1850(int arg0, boolean arg1) {
        field3701++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class347.field4906;
        } else {
            var2 = 4;
            var3 = class403.field5895;
        }
        if (arg0 != 15089) {
            field3704 = -71;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class11.method65((byte) 80);
            for (int var5 = 0; var5 < (class183.field2703 >> 3); var5++) {
                for (int var6 = 0; var6 < class66.field1056 >> 3; var6++) {
                    int var7 = class41.field630[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3153270) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFD0C3) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class79.field1336.length; var13++) {
                                if (class79.field1336[var13] == var12 && var3[var13] != null) {
                                    class420.method2636(class73.field1235, true, (var10 & 0x7) * 8, class322.field4646, var6 * 8, var5 * 8, (var11 & 0x7) * 8, var8, arg1, var4, var3[var13], var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 144)
    public static void method1851(boolean arg0) {
        field3703 = null;
        if (arg0) {
            field3698 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILja;)V")
    public abstract void method137(int arg0, class90 arg1);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public abstract void method54(int arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILja;II)Z")
    public abstract boolean method132(int arg0, class90 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLja;)Lkh;")
    public abstract class69 method134(byte arg0, class90 arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBZIILnf;Lja;)V")
    public abstract void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Z")
    public abstract boolean method53(byte arg0);
}
