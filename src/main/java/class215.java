import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class215 extends class202 {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "[I")
    public int[] field3514;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[[I")
    public int[][] field3519;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[Z")
    public boolean[] field3518;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
    public int[] field3521;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3512 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
    public static boolean field3510 = false;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field3517 = 2;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Z")
    public static boolean field3516 = false;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lsg;")
    public static class163 field3513;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public static void method1470(int arg0) {
        field3513 = null;
        if (arg0 <= 86) {
            method1471((String) null, 111, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method1471(String arg0, int arg1, byte arg2) {
        if (arg2 != 32) {
            method1474((byte) 76, 123);
        }
        class259 var3 = class213.method1464((byte) -117, arg1, 2);
        field3511++;
        var3.method1766(arg2 ^ 0x20);
        var3.field4116 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class189.field3066[0].method1592(arg1, arg2);
        int var6 = (arg5 - 32) * arg5 / arg4;
        class189.field3066[1].method1592(arg1, arg2 + arg5 - 16);
        field3508++;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg3 / (arg4 - arg5);
        class2.method25(arg1, arg2 + 16, 16, arg5 - 32, class115.field1915);
        class2.method25(arg1, var7 + arg2 + 16, 16, var6, class53.field916);
        class2.method16(arg1, arg2 + var7 + 16, var6, class264.field4208);
        class2.method16(arg1 + 1, arg2 + var7 + 16, var6, class264.field4208);
        class2.method35(arg1, arg2 - (-var7 - 16), arg0, class264.field4208);
        class2.method35(arg1, arg2 + var7 + 17, 16, class264.field4208);
        class2.method16(arg1 + 15, arg2 + 16 - -var7, var6, class214.field3492);
        class2.method16(arg1 + 14, arg2 + 17 - -var7, var6 - 1, class214.field3492);
        class2.method35(arg1, arg2 + var7 + var6 + 15, 16, class214.field3492);
        class2.method35(arg1 + 1, arg2 - -var7 + 14 - -var6, 15, class214.field3492);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILqh;)Ld;")
    public static final class238 method1473(byte arg0, int arg1, class201 arg2) {
        field3520++;
        if (arg0 == 122) {
            return class96.method714(arg1, (byte) 83, arg2) ? class263.method1789(-22163) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
    public static final void method1474(byte arg0, int arg1) {
        for (class202 var2 = class271.field4274.method1404(112); var2 != null; var2 = class271.field4274.method1412(-71)) {
            if ((long) arg1 == (var2.field3247 >> 48 & 0xFFFFL)) {
                var2.method1388(79);
            }
        }
        if (arg0 < 81) {
            field3512 = 52;
        }
        field3515++;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I[B)V")
    public class215(int arg0, byte[] arg1) {
        this.field3509 = arg0;
        class221 var3 = new class221(arg1);
        this.field3522 = var3.method1517((byte) -96);
        this.field3514 = new int[this.field3522];
        this.field3519 = new int[this.field3522][];
        this.field3518 = new boolean[this.field3522];
        this.field3521 = new int[this.field3522];
        for (int var4 = 0; var4 < this.field3522; var4++) {
            this.field3514[var4] = var3.method1517((byte) -96);
        }
        for (int var5 = 0; var5 < this.field3522; var5++) {
            this.field3518[var5] = var3.method1517((byte) -96) == 1;
        }
        for (int var6 = 0; var6 < this.field3522; var6++) {
            this.field3521[var6] = var3.method1521((byte) 113);
        }
        for (int var7 = 0; var7 < this.field3522; var7++) {
            this.field3519[var7] = new int[var3.method1517((byte) -96)];
        }
        for (int var8 = 0; var8 < this.field3522; var8++) {
            for (int var9 = 0; var9 < this.field3519[var8].length; var9++) {
                this.field3519[var8][var9] = var3.method1517((byte) -96);
            }
        }
    }
}
