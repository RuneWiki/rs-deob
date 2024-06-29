import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class337 {

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lsi;")
    public class332 field5201 = new class332();

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
    public static int[] field5199 = new int[32];

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field5215 = 0;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public static boolean field5207 = false;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
    public static boolean field5218 = false;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "F")
    public static float field5208;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Laf;")
    public static class189 field5214;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Lsi;")
    private class332 field5221;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "[Lrc;")
    public static class342[] field5216;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([[II)V", line = 9)
    public static final void method2320(int[][] arg0, int arg1) {
        field5219++;
        if (arg1 < 59) {
            method2322(-59, 35, 114);
        }
        class206.field2886 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Lsi;", line = 22)
    public final class332 method2321(int arg0) {
        class332 var2 = this.field5221;
        field5213++;
        if (this.field5201 == var2) {
            this.field5221 = null;
            return null;
        }
        if (arg0 >= -124) {
            field5208 = -0.2173905F;
        }
        this.field5221 = var2.field5067;
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lqa;", line = 50)
    public static final class138 method2322(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class138 var4 = var3.field3209;
            var3.field3209 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lsi;", line = 65)
    public final class332 method2323(byte arg0) {
        field5220++;
        class332 var2 = this.field5201.field5073;
        if (arg0 > -4) {
            this.method2330((class332) null, (byte) 46);
        }
        if (this.field5201 == var2) {
            return null;
        } else {
            var2.method2285(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 84)
    public static void method2324(int arg0) {
        field5199 = null;
        if (arg0 == 0) {
            field5214 = null;
            field5216 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lsi;B)V", line = 102)
    public final void method2325(class332 arg0, byte arg1) {
        if (arg0.field5067 != null) {
            arg0.method2285(true);
        }
        arg0.field5073 = this.field5201;
        arg0.field5067 = this.field5201.field5067;
        if (arg1 == 34) {
            field5217++;
            arg0.field5067.field5073 = arg0;
            arg0.field5073.field5067 = arg0;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Z", line = 119)
    public final boolean method2326(byte arg0) {
        if (arg0 != -10) {
            field5199 = (int[]) null;
        }
        field5204++;
        return this.field5201.field5073 == this.field5201;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Llc;Lfg;Llc;BLlc;)Z", line = 136)
    public static final boolean method2327(class175 arg0, class228 arg1, class175 arg2, byte arg3, class175 arg4) {
        field5203++;
        class195.field2802 = arg1;
        class240.field3611 = arg2;
        class205.field2874 = arg0;
        if (arg3 <= 88) {
            field5207 = true;
        }
        class237.field3475 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Lsi;", line = 154)
    public final class332 method2328(int arg0) {
        if (arg0 != 0) {
            field5200 = -127;
        }
        field5209++;
        class332 var2 = this.field5201.field5067;
        if (this.field5201 == var2) {
            this.field5221 = null;
            return null;
        } else {
            this.field5221 = var2.field5067;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLqm;BIII)V", line = 178)
    public static final void method2329(boolean arg0, class247 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5212++;
        if (class1.field6 >= 50 || arg1 == null || arg1.field3741 == null || arg1.field3741.length <= arg5 || arg1.field3741[arg5] == null) {
            return;
        }
        int var6 = arg1.field3741[arg5][0];
        if (arg2 != -97) {
            field5214 = (class189) null;
        }
        int var7 = var6 >> 8;
        int var8 = var6 & 0x1F;
        if (arg1.field3741[arg5].length > 1) {
            int var9 = (int) (Math.random() * (double) arg1.field3741[arg5].length);
            if (var9 > 0) {
                var7 = arg1.field3741[arg5][var9];
            }
        }
        int var10 = var6 >> 5 & 0x7;
        if (var8 == 0) {
            if (arg0) {
                class74.method452((byte) -29, var7, var10, 255, 0);
            }
        } else if (class261.field3947 != 0) {
            class308.field4762[class1.field6] = var7;
            class168.field2337[class1.field6] = var10;
            class120.field1682[class1.field6] = 0;
            class109.field1514[class1.field6] = null;
            int var11 = (arg4 - 64) / 128;
            class269.field4246[class1.field6] = 255;
            int var12 = (arg3 - 64) / 128;
            class85.field1094[class1.field6] = (var11 << 8) + (var12 << 16) + var8;
            class1.field6++;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Lsi;B)V", line = 244)
    public final void method2330(class332 arg0, byte arg1) {
        field5210++;
        if (arg0.field5067 != null) {
            arg0.method2285(true);
        }
        arg0.field5067 = this.field5201;
        arg0.field5073 = this.field5201.field5073;
        int var3 = -49 / ((arg1 + 65) / 36);
        arg0.field5067.field5073 = arg0;
        arg0.field5073.field5067 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lsi;", line = 263)
    public final class332 method2331(byte arg0) {
        class332 var2 = this.field5201.field5073;
        if (arg0 < 2) {
            this.field5201 = (class332) null;
        }
        field5205++;
        if (this.field5201 == var2) {
            this.field5221 = null;
            return null;
        } else {
            this.field5221 = var2.field5073;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)Lsi;", line = 286)
    public final class332 method2332(int arg0) {
        if (arg0 >= -29) {
            this.method2323((byte) 118);
        }
        field5206++;
        class332 var2 = this.field5221;
        if (this.field5201 == var2) {
            this.field5221 = null;
            return null;
        } else {
            this.field5221 = var2.field5073;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V", line = 315)
    public final void method2333(int arg0) {
        if (arg0 != 3393) {
            field5214 = (class189) null;
        }
        field5202++;
        while (true) {
            class332 var2 = this.field5201.field5073;
            if (this.field5201 == var2) {
                this.field5221 = null;
                return;
            }
            var2.method2285(true);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 340)
    public class337() {
        this.field5201.field5067 = this.field5201;
        this.field5201.field5073 = this.field5201;
    }
}
