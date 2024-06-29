import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class87 {

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lqk;")
    public static class1 field93 = new class1(79, -1);

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Lae;")
    public static class283 field95;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lae;Z)V", line = 6)
    public static final void method60(class283 arg0, boolean arg1) {
        if (arg1) {
            method61((byte) 50);
        }
        class213.field2937 = arg0;
        field97++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 21)
    public static void method61(byte arg0) {
        field93 = null;
        if (arg0 != 85) {
            field93 = null;
        }
        field95 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIJLsha;ILaa;BI)V", line = 37)
    public static final void method62(int arg0, int arg1, int arg2, long arg3, class115 arg4, int arg5, class87 arg6, byte arg7, int arg8) {
        field98++;
        int var10 = arg8 * arg8 + (arg5 * arg5);
        if (arg3 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg4.field1560 / 2, arg4.field1517 / 2);
        if (var10 > var11 * var11) {
            var11 -= 10;
            int var12;
            if (class695.field9691 == 4) {
                var12 = (int) class702.field9790 & 0x3FFF;
            } else {
                var12 = (int) class702.field9790 + class703.field9795 & 0x3FFF;
            }
            int var13 = class448.field6265[var12];
            int var14 = class448.field6270[var12];
            if (class695.field9691 != 4) {
                var13 = var13 * 256 / (class686.field9577 + 256);
                var14 = var14 * 256 / (class686.field9577 + 256);
            }
            int var15 = arg5 * var13 + arg8 * var14 >> 14;
            int var16 = arg5 * var14 - (arg8 * var13) >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) (Math.sin(var17) * (double) var11);
            int var20 = (int) (Math.cos(var17) * (double) var11);
            class69.field768[arg0].method2024((float) arg4.field1560 / 2.0F + (float) arg2 + (float) var19, (float) arg4.field1517 / 2.0F + (float) arg1 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        } else {
            class353.method2221(arg6, arg5, class59.field686[arg0], arg4, arg2, (byte) 118, arg8, arg1);
        }
        if (arg7 <= 92) {
            field95 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 95)
    public static final void method63(boolean arg0, String arg1) {
        field96++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class690.method3915(-4097, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class688.field9600; var3++) {
            String var4 = class396.field5622[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class690.method3915(-4097, var4);
            if (var5 != null && var5.equals(var2)) {
                class688.field9600--;
                for (int var6 = var3; var6 < class688.field9600; var6++) {
                    class396.field5622[var6] = class396.field5622[var6 + 1];
                    class715.field9932[var6] = class715.field9932[var6 + 1];
                    class617.field8669[var6] = class617.field8669[var6 + 1];
                    class712.field9918[var6] = class712.field9918[var6 + 1];
                    class665.field9349[var6] = class665.field9349[var6 + 1];
                    class253.field3744[var6] = class253.field3744[var6 + 1];
                }
                class605.field8483++;
                class345.field5014 = class453.field6312;
                class116 var7 = class248.method1672(class84.field1023, class115.field1567, -20647);
                var7.field1575.method3005(255, class395.method2435(arg1, 1));
                var7.field1575.method3037(0, arg1);
                class443.method2655(0, var7);
                break;
            }
        }
        if (arg0) {
            field95 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(II[I[I)V", line = 158)
    public class16(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field94 = arg3;
        this.field99 = arg2;
    }
}
