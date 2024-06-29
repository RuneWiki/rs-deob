import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class441 extends class114 {

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public int field6646 = 12800;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Z")
    public boolean field6645 = true;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public int field6650 = 12800;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public int field6641 = 0;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public int field6654 = 0;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public int field6653 = -1;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public int field6655 = -1;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field6643;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public int field6647;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Ljava/lang/String;")
    public String field6644;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Ljava/lang/String;")
    public String field6642;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lps;")
    public class63 field6637;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "Lla;")
    public static class319 field6652 = new class319(29, 0);

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "Lni;")
    public static class367 field6656 = new class367(15, 4);

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "Z")
    public static boolean field6659 = false;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "[I")
    public static int[] field6657;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIBI)Z", line = 6)
    public final boolean method2666(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6649++;
        if (arg3 != 42) {
            this.field6650 = 100;
        }
        for (class345 var6 = (class345) this.field6637.method445(arg3 ^ 0xB); var6 != null; var6 = (class345) this.field6637.method451(false)) {
            if (var6.method2236(arg4, arg2, -126, arg1)) {
                var6.method2238(arg0, 0, arg4, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 35)
    public static void method2667(int arg0) {
        field6652 = null;
        int var1 = -70 / ((arg0 - 1) / 58);
        field6657 = null;
        field6656 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 269)
    public class441(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6643 = arg0;
        this.field6647 = arg3;
        this.field6644 = arg1;
        this.field6642 = arg2;
        this.field6645 = arg5;
        this.field6653 = arg6;
        this.field6655 = arg4;
        if (this.field6653 == 255) {
            this.field6653 = 0;
        }
        this.field6637 = new class63();
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V", line = 56)
    public final void method2668(int arg0) {
        this.field6654 = 0;
        this.field6650 = 12800;
        int var2 = -49 / ((31 - arg0) / 40);
        field6638++;
        this.field6641 = 0;
        this.field6646 = 12800;
        for (class345 var3 = (class345) this.field6637.method445(33); var3 != null; var3 = (class345) this.field6637.method451(false)) {
            if (this.field6654 < var3.field5322) {
                this.field6654 = var3.field5322;
            }
            if (this.field6646 > var3.field5328) {
                this.field6646 = var3.field5328;
            }
            if (this.field6650 > var3.field5325) {
                this.field6650 = var3.field5325;
            }
            if (var3.field5324 > this.field6641) {
                this.field6641 = var3.field5324;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLvr;IIIIZ)V", line = 91)
    public static final void method2669(boolean arg0, class91 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            method2671(56);
        }
        field6636++;
        if (class303.field4434 >= 50 || arg1 == null || arg1.field1338 == null || arg3 >= arg1.field1338.length || arg1.field1338[arg3] == null) {
            return;
        }
        int var7 = arg1.field1338[arg3][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF7) >> 5;
        int var10 = var7 & 0x1F;
        if (arg1.field1338[arg3].length > 1) {
            int var11 = (int) (Math.random() * (double) arg1.field1338[arg3].length);
            if (var11 > 0) {
                var8 = arg1.field1338[arg3][var11];
            }
        }
        if (var10 == 0) {
            if (arg6) {
                class244.method1597(255, 0, -1, var9, var8);
            }
        } else if (class203.field2716.field1183 != 0) {
            int var12 = arg4 - 64 >> 7;
            int var13 = arg5 - 64 >> 7;
            class475.field7049[class303.field4434++] = new class153((byte) 1, var8, var9, 0, 255, (arg2 << 24) + var10 - (-(var12 << 16) - (var13 << 8)));
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZII[I)Z", line = 147)
    public final boolean method2670(boolean arg0, int arg1, int arg2, int[] arg3) {
        field6640++;
        for (class345 var5 = (class345) this.field6637.method445(33); var5 != null; var5 = (class345) this.field6637.method451(false)) {
            if (var5.method2232(arg1, 0, arg2)) {
                var5.method2238(arg3, 0, arg2, arg1);
                return true;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)[Ljs;", line = 173)
    public static final class221[] method2671(int arg0) {
        field6648++;
        if (arg0 != 64) {
            method2669(true, null, 125, 126, 56, -70, true);
        }
        return new class221[] { class437.field6606, class198.field2636, class162.field2107 };
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)Z", line = 193)
    public final boolean method2672(int arg0, int arg1, boolean arg2) {
        field6639++;
        for (class345 var4 = (class345) this.field6637.method445(33); var4 != null; var4 = (class345) this.field6637.method451(false)) {
            if (var4.method2232(arg1, 0, arg0)) {
                return true;
            }
        }
        return !arg2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[II)Z", line = 233)
    public final boolean method2673(int arg0, int arg1, int[] arg2, int arg3) {
        field6651++;
        class345 var5 = (class345) this.field6637.method445(33);
        int var6 = 25 % ((arg0 - 14) / 54);
        while (var5 != null) {
            if (var5.method2235(arg3, arg1, (byte) 127)) {
                var5.method2234(arg3, (byte) -117, arg2, arg1);
                return true;
            }
            var5 = (class345) this.field6637.method451(false);
        }
        return false;
    }
}
