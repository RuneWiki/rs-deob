import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class140 extends class303 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "Z")
    private boolean field2231 = true;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Z")
    private boolean field2234 = true;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field2235 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "[I")
    public static int[] field2226;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            field2226 = (int[]) null;
        }
        field2233++;
        int[] var3 = this.field4763.method394(arg0 + 3, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(this.field2234 ? class12.field240 - arg1 : arg1, 0, 0);
            if (this.field2231) {
                for (int var5 = 0; var5 < class70.field1108; var5++) {
                    var3[var5] = var4[class40.field724 - var5];
                }
            } else {
                class271.method1953(var4, 0, var3, 0, class70.field1108);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V", line = 43)
    public static final void method1067(int arg0, int arg1) {
        field2232++;
        class4 var2 = class67.method510(1, 2, arg0);
        if (arg1 >= -108) {
            method1071(-12, 4, (class6) null, -121, -112, 115, -14);
        }
        var2.method6(255);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[[I", line = 59)
    public final int[][] method74(int arg0, int arg1) {
        int[][] var3 = this.field4772.method1175(-78, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(this.field2234 ? class12.field240 - arg0 : arg0, 0, 99);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field2231) {
                for (int var12 = 0; var12 < class70.field1108; var12++) {
                    var8[var12] = var5[class40.field724 - var12];
                    var10[var12] = var6[class40.field724 - var12];
                    var9[var12] = var7[class40.field724 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class70.field1108; var11++) {
                    var8[var11] = var5[var11];
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                }
            }
        }
        if (arg1 == 82) {
            field2237++;
            return var3;
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(III)I", line = 125)
    public static final int method1068(int arg0, int arg1, int arg2) {
        field2227++;
        class62 var3 = (class62) class42.field748.method833(false, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (~arg2 <= arg1 && arg2 < var3.field961.length) {
            return var3.field961[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 141)
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lpe;I)Lvg;", line = 145)
    public static final class264 method1069(class101 arg0, int arg1) {
        if (arg1 == 4) {
            field2228++;
            return new class264(arg0.method780(-17432), arg0.method780(-17432), arg0.method780(arg1 ^ 0xFFFFBBEC), arg0.method780(arg1 - 17436), arg0.method776(-1574267376), arg0.method741(12));
        } else {
            return (class264) null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILpe;I)V", line = 156)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            this.method65(57, (class101) null, 7);
        }
        field2229++;
        if (arg2 == 0) {
            this.field2231 = arg1.method741(34) == 1;
        } else if (arg2 == 1) {
            this.field2234 = arg1.method741(69) == 1;
        } else if (arg2 == 2) {
            this.field4773 = arg1.method741(46) == 1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 208)
    public static final void method1070(boolean arg0) {
        if (!arg0) {
            method1068(-48, -80, 56);
        }
        for (int var1 = 0; var1 < class328.field5077; var1++) {
            class33 var2 = class324.method2214(-127, var1);
            if (var2 != null && var2.field556 == 0) {
                class118.field1907[var1] = 0;
                class278.field4304[var1] = 0;
            }
        }
        class156.field2485 = new class110(16);
        field2225++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILvi;IIII)Z", line = 236)
    public static final boolean method1071(int arg0, int arg1, class6 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2222++;
        class29 var7 = class210.method1531(arg2.field45, (byte) -79);
        if (var7.field468 == -1) {
            return true;
        }
        int var8;
        if (arg2.field50) {
            int var9 = arg2.field48 + arg3;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class315 var10 = var7.method194(arg0 - 8494, var8);
        if (var10 == null) {
            return false;
        }
        if (arg0 != 4) {
            field2223 = -67;
        }
        int var11 = arg2.field63;
        int var12 = arg2.field90;
        int var13 = var10.field4263;
        int var14 = var10.field4266;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field90;
            var12 = arg2.field63;
        }
        if (var7.field472) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field471 == 0) {
            var10.method2170(arg6 * 4 + 48, (-var12 + 104 - arg4) * 4 + 48, var13, var14);
        } else {
            var10.method2165(arg6 * 4 + 48, (-arg4 + 104 + -var12) * 4 + 48, var13, var14, var7.field471);
        }
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILja;Lja;)V", line = 292)
    public static final void method1072(int arg0, class64 arg1, class64 arg2) {
        if (arg0 == 0) {
            class132.field2113 = arg2;
            field2236++;
            class14.field265 = arg1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V", line = 321)
    public static final void method1073(byte arg0) {
        class39.method322((byte) -127);
        field2224++;
        class297.method2080(arg0 ^ 0x32);
        class121.method922((byte) -52);
        class118.method872((byte) 89);
        class309.method2139(true);
        class215.method1556(true);
        class137.method1053(true);
        class165.method1212(arg0 - 673854887);
        class18.method146(-16332);
        class11.method93((byte) -64);
        class86.method623(-9);
        class132.method1001(arg0 - 113);
        class258.method1823(78);
        class222.method1618(19065);
        class239.method1698((byte) -55);
        class14.method123((byte) 96);
        class221.method1600((byte) 29);
        class111.method849(arg0 - 74);
        class196.field3117.method1832((byte) 57);
        class88.field1355.method1832((byte) -123);
        if (arg0 != 78) {
            field2230 = 122;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V", line = 351)
    public static void method1074(boolean arg0) {
        field2226 = null;
        if (arg0) {
            field2223 = -107;
        }
    }
}
