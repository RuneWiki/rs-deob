import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class599 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field8644;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lsh;")
    public static class62 field8647;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)I", line = 8)
    public static final int method3460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -1) {
            return 46;
        }
        field8646++;
        if (class155.field1899 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg3 >> 9;
            int var7 = arg4 >> 9;
            if (arg5 < 0 || arg1 < 0 || arg5 > (class473.field6604 - 1) || (class205.field2465 - 1) < arg1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class473.field6604 - 1 < var6 || var7 > class205.field2465 - 1) {
                return 0;
            }
            boolean var8 = (class73.field1104[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg3 & 0x1FF) == 0) {
                boolean var9 = (class73.field1104[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class73.field1104[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class73.field1104[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class73.field1104[1][arg3 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class73.field1104[1][arg3 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class73.field1104[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class155.field1899[arg0].method428(true, arg3, arg4);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 67)
    public static void method3461(byte arg0) {
        if (arg0 != -72) {
            field8643 = -38;
        }
        field8647 = null;
    }

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 77)
    public final String toString() {
        field8645++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V", line = 85)
    public class599(int arg0) {
        this.field8644 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 95)
    public static final void method3462(int arg0) {
        if (class26.field602 != null) {
            try {
                class26.field602.close();
            } catch (IOException var1) {
            }
        }
        field8649++;
        if (arg0 != -1640810359) {
            method3462(119);
        }
        class26.field602 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 117)
    public static final void method3463(byte arg0) {
        field8648++;
        int var1 = class423.field6026.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class423.field6026[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class226.field2931; var4++) {
                    if (class91.field1268[var4] == class312.field4119[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class91.field1268[class226.field2931] = class312.field4119[var2];
                    var3 = class226.field2931++;
                }
                class389 var5 = new class389(class423.field6026[var2]);
                int var6 = 0;
                while (class423.field6026[var2].length > var5.field5195 && var6 < 511 && class99.field1332 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2260(arg0 ^ 0x7);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class312.field4119[var2] >> 8) * 64 + var10 - class36.field689;
                    int var13 = (class312.field4119[var2] & 0xFF) * 64 + var11 - class88.field1239;
                    class323 var14 = class206.field2477.method1949(125, var5.method2260(arg0 + 10));
                    class633 var15 = (class633) class522.field7662.method3678((long) var7, -119);
                    if (var15 == null && (var14.field4314 & 0x1) > 0 && class656.field9319 == var9 && var12 >= 0 && (var14.field4318 + var12) < class473.field6604 && var13 >= 0 && var14.field4318 + var13 < class205.field2465) {
                        class557 var16 = new class557();
                        var16.field2664 = var7;
                        class633 var17 = new class633(var16);
                        class522.field7662.method3670((long) var7, var17, (byte) 127);
                        class671.field9657[class59.field928++] = var17;
                        class600.field8658[class99.field1332++] = var7;
                        var16.field2606 = class543.field7882;
                        var16.method3251(var14, 0);
                        var16.method1279((byte) 87, var16.field8052.field4318);
                        var16.field2616 = var16.field8052.field4259 << 3;
                        var16.method1293((byte) -62, true, var16.field8052.field4256 + 4 << 11 & 0x3BBB);
                        var16.method3253((byte) -102, var16.method1284((byte) -124), var13, var12, true, var9);
                    }
                }
            }
        }
        if (arg0 != -48) {
            field8647 = null;
        }
    }
}
