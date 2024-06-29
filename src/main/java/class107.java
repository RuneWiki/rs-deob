import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class107 extends class656 {

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "Loe;")
    public class202 field1452;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "Z")
    public boolean field1458;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field1453 = 104;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "Z")
    public boolean field1454;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "Z")
    public boolean field1455;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "Z")
    public boolean field1457;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
    public static int[] field1456;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "([[[Lih;B)V")
    public static final void method784(class701[][][] arg0, byte arg1) {
        field1461++;
        int var2 = 0;
        if (arg1 < 106) {
            field1456 = null;
        }
        while (var2 < arg0.length) {
            class701[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class701 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field9738 instanceof class624) {
                            ((class624) var6.field9738).method1754(true);
                        }
                        if (var6.field9737 instanceof class624) {
                            ((class624) var6.field9737).method1754(true);
                        }
                        if (var6.field9735 instanceof class624) {
                            ((class624) var6.field9735).method1754(true);
                        }
                        if (var6.field9729 instanceof class624) {
                            ((class624) var6.field9729).method1754(true);
                        }
                        if (var6.field9739 instanceof class624) {
                            ((class624) var6.field9739).method1754(true);
                        }
                        for (class10 var7 = var6.field9742; var7 != null; var7 = var7.field174) {
                            class675 var8 = var7.field170;
                            if (var8 instanceof class624) {
                                ((class624) var8).method1754(true);
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
    public static final void method785(String arg0, int arg1, String arg2, boolean arg3, int arg4) {
        field1460++;
        class583 var5 = class277.method1668(0);
        var5.field7637.method3823(-119, class86.field1046.field4660);
        var5.field7637.method3831(1182, 0);
        int var6 = var5.field7637.field9419;
        var5.field7637.method3831(1182, 640);
        int[] var7 = class48.method341((byte) -103, var5);
        int var8 = var5.field7637.field9419;
        var5.field7637.method3795(arg2, (byte) -102);
        var5.field7637.method3831(1182, class236.field3316);
        var5.field7637.method3795(arg0, (byte) -92);
        var5.field7637.method3829(14731, class310.field4461);
        var5.field7637.method3823(-112, class713.field9854);
        var5.field7637.method3823(-67, class683.field9532.field10627);
        class477.method2686((byte) 61, var5.field7637);
        String var9 = class354.field4992;
        var5.field7637.method3823(-34, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field7637.method3795(var9, (byte) -66);
        }
        var5.field7637.method3823(-90, arg4);
        var5.field7637.method3823(-103, arg3 ? 1 : 0);
        var5.field7637.field9419 += 7;
        var5.field7637.method3796(var7, var5.field7637.field9419, (byte) 112, var8);
        if (arg1 != -27314) {
            return;
        }
        var5.field7637.method3818(var5.field7637.field9419 - var6, arg1 ^ 0x6AB0);
        class42.method309(var5, 0);
        class31.field489 = -3;
        class704.field9766 = 0;
        class594.field7712 = 1;
        class763.field10628 = 0;
        if (arg4 < 13) {
            class574.field7531 = true;
            class513.method2865(arg1 ^ 0x6AB3);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public static void method786(byte arg0) {
        if (arg0 == 13) {
            field1456 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(ILoe;IZ)V")
    public class107(int arg0, class202 arg1, int arg2, boolean arg3) {
        this.field1452 = arg1;
        this.field1459 = arg0;
        this.field1458 = arg3;
        this.field1450 = arg2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static final void method787(int arg0) {
        class650.field8633++;
        class92.field1118 = 0;
        class315.field4501 = arg0;
        field1451++;
        class712.method3998((byte) 114);
        class400.method2353(11473);
        class714.method4003((byte) -72);
        boolean var1 = false;
        for (int var2 = 0; var2 < class315.field4501; var2++) {
            int var5 = class586.field7661[var2];
            class134 var6 = (class134) class390.field5470.method2135((long) var5, (byte) 31);
            class556 var7 = var6.field2154;
            if (class403.field5625 && class360.method2140(var5, -3)) {
                class355.method2120(arg0 ^ 0xFFFFF8AB);
            }
            if (class650.field8633 != var7.field10265) {
                if (var7.field7328.method1193((byte) -67)) {
                    class474.method2671(false, var7);
                }
                var7.method3099((byte) -89, null);
                var1 = true;
                var6.method3564(true);
            }
        }
        if (var1) {
            class243.field3403 = class390.field5470.method2147((byte) 32);
            class390.field5470.method2142(class302.field4281, true);
        }
        if (class732.field10143 != class3.field63.field9419) {
            throw new RuntimeException("gnp1 pos:" + class3.field63.field9419 + " psize:" + class732.field10143);
        }
        for (int var3 = 0; var3 < class306.field4404; var3++) {
            if (class390.field5470.method2135((long) class628.field8351[var3], (byte) 31) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class306.field4404);
            }
        }
        if ((class243.field3403 - class306.field4404) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class243.field3403 - class306.field4404));
        }
        for (int var4 = 0; var4 < class243.field3403; var4++) {
            if (class650.field8633 != class302.field4281[var4].field2154.field10265) {
                throw new RuntimeException("gnp4 uk:" + class302.field4281[var4].field2154.field10297);
            }
        }
    }
}
