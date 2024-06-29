import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class587 {

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "Lmr;")
    private class611 field8361;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "Llc;")
    public static class435 field8367 = new class435(32, -1);

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Lqm;")
    private class430 field8360;

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "[[S")
    public static short[][] field8366;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Lqm;", line = 5)
    public final class430 method3452(int arg0) {
        field8368++;
        if (arg0 < 20) {
            field8366 = null;
        }
        class430 var2 = this.field8360;
        if (this.field8361.field8734 == var2) {
            this.field8360 = null;
            return null;
        } else {
            this.field8360 = var2.field6189;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)[Ldj;", line = 30)
    public static final class703[] method3453(byte arg0) {
        field8362++;
        int var1 = 82 % ((54 - arg0) / 49);
        return new class703[] { class683.field9704, class169.field2391, class612.field8750, class623.field8860, class683.field9694, class743.field10362, class225.field3349, class513.field7430, class235.field3510, class345.field4747, class78.field1136, class538.field7819, class493.field7097, class313.field4236 };
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)Lqm;", line = 42)
    public final class430 method3454(int arg0) {
        field8363++;
        int var2 = -88 % ((31 - arg0) / 35);
        class430 var3 = this.field8361.field8734.field6189;
        if (this.field8361.field8734 == var3) {
            this.field8360 = null;
            return null;
        } else {
            this.field8360 = var3.field6189;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)V", line = 65)
    public static void method3455(int arg0) {
        field8366 = null;
        if (arg0 == -1461444964) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "()V", line = 75)
    public class587() {
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Ljc;II)Z", line = 79)
    public static final boolean method3456(class168 arg0, int arg1, int arg2) {
        field8365++;
        int var3 = arg0.method1206(2, (byte) -90);
        if (var3 == 0) {
            if (arg0.method1206(1, (byte) -90) != 0) {
                method3456(arg0, arg1, 3);
            }
            int var4 = arg0.method1206(6, (byte) -90);
            int var5 = arg0.method1206(6, (byte) -90);
            boolean var6 = arg0.method1206(1, (byte) -90) == 1;
            if (var6) {
                class750.field10452[class609.field8692++] = arg1;
            }
            if (class536.field7796[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class374 var7 = class139.field1905[arg1];
            class639 var8 = class536.field7796[arg1] = new class639();
            var8.field4592 = arg1;
            if (class481.field6874[arg1] != null) {
                var8.method3680(class481.field6874[arg1], (byte) -67);
            }
            var8.method2061((byte) -126, var7.field5413, true);
            var8.field4576 = var7.field5414;
            int var9 = var7.field5417;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FDBE3) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class41.field693;
            int var14 = (var12 << 6) + var5 - class71.field1085;
            var8.field9050 = var7.field5418;
            var8.field4642[0] = class710.field10011[arg1];
            var8.field3920 = var8.field3924 = (byte) var10;
            if (class547.method3292((byte) -85, var14, var13)) {
                var8.field3924++;
            }
            var8.method3687(var14, 43, var13);
            var8.field9065 = false;
            class139.field1905[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method1206(2, (byte) -90);
            int var16 = class139.field1905[arg1].field5417;
            class139.field1905[arg1].field5417 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method1206(5, (byte) -90);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class139.field1905[arg1].field5417;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FF126) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class139.field1905[arg1].field5417 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method1206(18, (byte) -90);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF42) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class139.field1905[arg1].field5417;
            int var29 = arg2 & (var28 >> 28) + var25;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class139.field1905[arg1].field5417 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lmr;)V", line = 246)
    public class587(class611 arg0) {
        this.field8361 = arg0;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILmr;)V", line = 255)
    public final void method3457(int arg0, class611 arg1) {
        field8364++;
        if (arg0 != 3) {
            this.method3457(-58, null);
        }
        this.field8361 = arg1;
    }
}
