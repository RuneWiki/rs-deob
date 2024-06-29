import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class97 {

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "B")
    public byte field1383;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "S")
    public short field1379;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "S")
    public short field1381;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "S")
    public short field1377;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Z")
    public boolean field1380;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1382 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Lsv;")
    public static class570 field1385 = new class570(1, 8);

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "[[B")
    public static byte[][] field1386;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lgga;Z)V")
    public static final void method799(class513 arg0, boolean arg1) {
        class278.field4008 = arg0.method3016(91, "p11_full");
        field1387++;
        class274.field3843 = arg0.method3016(102, "p12_full");
        if (!arg1) {
            field1382 = null;
        }
        class172.field2587 = arg0.method3016(67, "b12_full");
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static void method800(byte arg0) {
        if (arg0 != -5) {
            method801(null, 80, 16, 74, 83, 112);
        }
        field1382 = null;
        field1386 = null;
        field1385 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lnfa;IIIII)V")
    public static final void method801(class745 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class169.field2565 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class42.field520) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class681.field9665 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class172 var14 = class514.field7096[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class678.field9594[var11].method2476(var13, var12, -1) + class678.field9594[var11].method2476(var13, var12 + 1, -1) + class678.field9594[var11].method2476(var13 + 1, var12, -1) + class678.field9594[var11].method2476(var13 + 1, var12 + 1, -1)) / 4 - (class678.field9594[arg1].method2476(arg3, arg2, -1) + class678.field9594[arg1].method2476(arg3, arg2 + 1, -1) + class678.field9594[arg1].method2476(arg3 + 1, arg2, -1) + class678.field9594[arg1].method2476(arg3 + 1, arg2 + 1, -1)) / 4;
                                    class338 var16 = var14.field2593;
                                    class338 var17 = var14.field2600;
                                    if (var16 != null && var16.method197(true)) {
                                        arg0.method194(-24659, (var12 - arg2) * class253.field3624 + (1 - arg4) * class358.field5076, (var13 - arg3) * class253.field3624 + (1 - arg5) * class358.field5076, class29.field307, var16, var6, var15);
                                    }
                                    if (var17 != null && var17.method197(true)) {
                                        arg0.method194(-24659, (var12 - arg2) * class253.field3624 + (1 - arg4) * class358.field5076, (var13 - arg3) * class253.field3624 + (1 - arg5) * class358.field5076, class29.field307, var17, var6, var15);
                                    }
                                    for (class11 var18 = var14.field2594; var18 != null; var18 = var18.field145) {
                                        class208 var19 = var18.field143;
                                        if (var19 != null && var19.method197(true) && (var19.field3027 == var12 || var7 == var12) && (var19.field3035 == var13 || var9 == var13)) {
                                            int var20 = var19.field3030 + 1 - var19.field3027;
                                            int var21 = var19.field3038 + 1 - var19.field3035;
                                            arg0.method194(-24659, (var19.field3027 - arg2) * class253.field3624 + (var20 - arg4) * class358.field5076, (var19.field3035 - arg3) * class253.field3624 + (var21 - arg5) * class358.field5076, class29.field307, var19, var6, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1383 = (byte) arg8;
        this.field1384 = arg3;
        this.field1379 = (short) arg6;
        this.field1381 = (short) arg4;
        this.field1377 = (short) arg5;
        this.field1380 = arg10;
        this.field1374 = arg0;
        this.field1378 = arg2;
        this.field1376 = arg1;
        this.field1375 = arg11;
    }
}
