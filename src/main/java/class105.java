import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class105 {

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Lfg;")
    public static class18 field1744 = new class18(64);

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1745 = " ";

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static final void method934(byte arg0) {
        if (arg0 < -10) {
            class135.field2165 = null;
            field1739++;
            class390.field5656 = -1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method935(int arg0) {
        if (arg0 != -5) {
            method935(-59);
        }
        field1745 = null;
        field1744 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static final void method936(int arg0) {
        field1740++;
        class73.method580();
        if (arg0 != -12382) {
            method938((class451) null, -124, (class90) null);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class322.field4646[var1].method1249(92);
        }
        method934((byte) -128);
        class403.method2556(0);
        System.gc();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[B")
    public static final byte[] method937(int arg0, int arg1) {
        if (arg0 > -40) {
            method934((byte) 60);
        }
        field1746++;
        class169 var2 = (class169) class319.field4613.method2228(-1, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class11.method74(var7, 16384, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class169(var3);
            class319.field4613.method2226((long) arg1, var2, (byte) -108);
        }
        return var2.field2517;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lml;ILja;)I")
    public static final int method938(class451 arg0, int arg1, class90 arg2) {
        field1743++;
        if (arg0.field6540 != -1) {
            return arg0.field6540;
        }
        if (arg0.field6561 != -1) {
            class200 var3 = class196.field2873.method1412(arg2.method707() ? arg0.field6561 : arg0.field6538, (byte) -126);
            if (!var3.field2922) {
                return var3.field2918;
            }
        }
        return arg1 == 11224 ? arg0.field6548 : -17;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)I")
    public static final int method939(int arg0, int arg1, byte arg2) {
        int var3 = 34 / ((arg2 - 3) / 39);
        field1741++;
        int var4 = 0;
        while (arg0 > 0) {
            var4 = arg1 & 0x1 | var4 << 1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var4;
    }
}
