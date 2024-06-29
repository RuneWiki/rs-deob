import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class113 extends class166 {

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lcd;")
    public static class23 field2374 = class54.method414("(Z", -1);

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field2380 = 0;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lcd;")
    public static class23 field2377 = class54.method414("<col=ffffff>", -1);

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lcd;")
    public static class23 field2376 = class54.method414("ams", -1);

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2385 = new CRC32();

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Lmf;")
    public class113 field2381;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Lmf;")
    public class113 field2382;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lgd;")
    public static class58 field2375;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[I")
    public static int[] field2378;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static void method722(int arg0) {
        field2376 = null;
        field2375 = null;
        field2378 = null;
        field2377 = null;
        field2374 = null;
        if (arg0 <= 36) {
            field2380 = 65;
        }
        field2385 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBII[Lfh;IILob;[BII)V")
    public static final void method723(int arg0, byte arg1, int arg2, int arg3, class54[] arg4, int arg5, int arg6, class127 arg7, byte[] arg8, int arg9, int arg10) {
        int var11 = 90 / ((arg1 - 3) / 53);
        field2373++;
        int var12 = -1;
        class189 var13 = new class189(arg8);
        while (true) {
            int var14 = var13.method1210(false);
            if (var14 == 0) {
                return;
            }
            var12 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var13.method1210(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var13.method1202(-15);
                int var21 = var20 & 0x3;
                int var22 = var20 >> 2;
                if (arg6 == var19 && var18 >= arg0 && arg0 + 8 > var18 && arg5 <= var17 && arg5 + 8 > var17) {
                    class104 var23 = class65.method486(var12, (byte) -66);
                    int var24 = arg2 + class170.method1038(-80, var21, var23.field2232, var17 & 0x7, var18 & 0x7, arg9, var23.field2205);
                    int var25 = class68.method496(112, var23.field2205, arg9, var18 & 0x7, var17 & 0x7, var21, var23.field2232) + arg3;
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg10;
                        class54 var27 = null;
                        if ((class53.field1253[1][var24][var25] & 0x2) == 2) {
                            var26 = arg10 - 1;
                        }
                        if (var26 >= 0) {
                            var27 = arg4[var26];
                        }
                        class146.method925(var21 + arg9 & 0x3, var24, arg10, -741, var25, var22, arg7, var27, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public final void method724(boolean arg0) {
        field2384++;
        if (this.field2382 == null) {
            return;
        }
        this.field2382.field2381 = this.field2381;
        this.field2381.field2382 = this.field2382;
        this.field2381 = null;
        if (arg0) {
            this.field2382 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lfa;")
    public static final class47 method725(byte arg0, int arg1) {
        int var2 = arg1 >> 16;
        if (arg0 < 88) {
            method725((byte) -76, -97);
        }
        field2379++;
        int var3 = arg1 & 0xFFFF;
        if (class100.field2114[var2] == null || class100.field2114[var2][var3] == null) {
            boolean var4 = class82.method556(var2, (byte) -7);
            if (!var4) {
                return null;
            }
        }
        return class100.field2114[var2][var3];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
    public static final int method726(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        field2383++;
        int var6 = arg1 / arg3;
        int var7 = class167.method1026(var6, (byte) 30, var4);
        int var8 = arg1 & arg3 - 1;
        int var9 = class167.method1026(var6, (byte) 43, var4 + 1);
        int var10 = class167.method1026(var6 + 1, (byte) -127, var4);
        int var11 = class167.method1026(var6 + 1, (byte) 121, var4 - arg2);
        int var12 = class144.method917((byte) 56, var9, arg3, var7, var5);
        int var13 = class144.method917((byte) 118, var11, arg3, var10, var5);
        return class144.method917((byte) 48, var13, arg3, var12, var8);
    }
}
