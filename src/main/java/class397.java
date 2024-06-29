import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class397 extends class86 {

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Z")
    public boolean field5859;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "[Llk;")
    public class397[] field5861;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field5860 = 1;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field5865 = 0;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field5846;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lmf;")
    public class275 field5848;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Leg;")
    public class66 field5854;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public void method24(int arg0) {
        field5857++;
        if (arg0 != 255) {
            this.field5861 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)S")
    public static final short method2372(int arg0, int arg1) {
        field5851++;
        if (arg0 != -1198994943) {
            field5865 = -123;
        }
        int var2 = (arg1 & 0xFEB5) >> 10;
        int var3 = (arg1 & 0x386) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)I")
    public int method1049(int arg0) {
        field5852++;
        if (arg0 != 902) {
            this.method485(true);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILfs;ILqg;IILts;)V")
    public static final void method2373(int arg0, int arg1, class372 arg2, int arg3, class307 arg4, int arg5, int arg6, class356 arg7) {
        field5855++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class306.field4454 == 4) {
            var8 = (int) class506.field7722 & 0x3FFF;
        } else {
            var8 = (int) class506.field7722 + class280.field4003 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field5168 / 2, arg7.field5169 / 2) + 10;
        int var10 = arg1 * arg1 + (arg3 * arg3);
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class323.field4731[var8];
        int var12 = class323.field4733[var8];
        if (class306.field4454 != 4) {
            var12 = var12 * 256 / (class498.field7587 + 256);
            var11 = var11 * 256 / (class498.field7587 + 256);
        }
        if (arg6 != 256) {
            field5860 = -25;
        }
        int var13 = arg1 * var12 + arg3 * var11 >> 15;
        int var14 = arg3 * var12 - (arg1 * var11) >> 15;
        arg4.method83(arg5 - (arg4.method87() / 2 - (arg7.field5168 / 2) - var13), arg7.field5169 / 2 + arg0 + -var14 + -(arg4.method94() / 2), arg2, arg5, arg0);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
    public int[] method31(int arg0, int arg1) {
        if (arg0 == -780833076) {
            field5843++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public static final void method2374(int arg0) {
        field5858++;
        if (!class444.field6475) {
            return;
        }
        if (arg0 != -9539) {
            method2372(3, 25);
        }
        while (true) {
            while (class415.field6148 < class345.field4994.length) {
                class450 var1 = class345.field4994[class415.field6148];
                if (var1 != null && var1.field6564 == -1) {
                    if (class112.field1468 == null) {
                        class112.field1468 = class111.field1452.method259(111, var1.field6558);
                    }
                    int var2 = class112.field1468.field4867;
                    if (var2 == -1) {
                        return;
                    }
                    class415.field6148++;
                    var1.field6564 = var2;
                    class112.field1468 = null;
                } else {
                    class415.field6148++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)I")
    public int method484(byte arg0) {
        if (arg0 != 25) {
            this.method24(96);
        }
        field5850++;
        return -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLae;)V")
    public void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            this.field5861 = null;
        }
        field5864++;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
    public void method485(boolean arg0) {
        if (this.field5859) {
            this.field5854.method460(52);
            this.field5854 = null;
        } else {
            this.field5848.method1690(0);
            this.field5848 = null;
        }
        if (arg0) {
            field5845++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)Z")
    public static final boolean method2375(int arg0, int arg1, int arg2) {
        if (arg0 != 540800) {
            method2374(-27);
        }
        field5863++;
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)[I")
    public final int[] method2376(int arg0, int arg1, int arg2) {
        field5856++;
        if (arg0 <= 55) {
            this.field5859 = true;
        }
        return this.field5861[arg1].field5859 ? this.field5861[arg1].method31(-780833076, arg2) : this.field5861[arg1].method486((byte) 87, arg2)[0];
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IZ)V")
    public class397(int arg0, boolean arg1) {
        this.field5859 = arg1;
        this.field5861 = new class397[arg0];
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(III)[[I")
    public final int[][] method2377(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            return null;
        }
        field5849++;
        if (this.field5861[arg2].field5859) {
            int[] var4 = this.field5861[arg2].method31(-780833076, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5861[arg2].method486((byte) 83, arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)[[I")
    public int[][] method486(byte arg0, int arg1) {
        field5862++;
        if (arg0 > 81) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lts;IB)I")
    public static final int method2378(class356 arg0, int arg1, byte arg2) {
        int var3 = 74 % ((-arg2 - 32) / 39);
        field5847++;
        if (!client.method1188(arg0).method2935(arg1, (byte) 123) && arg0.field5288 == null) {
            return -1;
        } else if (arg0.field5287 == null || arg0.field5287.length <= arg1) {
            return -1;
        } else {
            return arg0.field5287[arg1];
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(III)V")
    public void method1050(int arg0, int arg1, int arg2) {
        field5853++;
        int var4 = this.field5846 == 255 ? arg2 : this.field5846;
        if (this.field5859) {
            this.field5854 = new class66(var4, arg2, arg1);
        } else {
            this.field5848 = new class275(var4, arg2, arg1);
        }
        if (arg0 != -30579) {
            field5865 = -57;
        }
    }
}
