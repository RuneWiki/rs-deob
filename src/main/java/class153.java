import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class153 extends class251 {

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Lvj;")
    public class115 field2480 = new class115();

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Lpj;")
    public class249 field2481 = new class249();

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lub;")
    private class89 field2472;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2467 = "wave2:";

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2474 = new CRC32();

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Ln;")
    public static class16 field2479;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method1063(byte arg0) {
        field2468++;
        class21.field357.method668(15);
        int var1 = -27 / ((arg0 + 83) / 38);
        class244.field3917 = null;
        class220.field3599 = 1;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(Z)V")
    public static void method1064(boolean arg0) {
        field2474 = null;
        field2467 = null;
        if (!arg0) {
            method1064(false);
        }
        field2479 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILr;I)V")
    private final void method1065(int arg0, class41 arg1, int arg2) {
        field2478++;
        if ((this.field2472.field1421[arg1.field761] & 0x4) != 0 && arg1.field774 < 0) {
            int var4 = this.field2472.field1453[arg1.field761] / class99.field1621;
            int var5 = (var4 + 1048575 - arg1.field764) / var4;
            arg1.field764 = arg0 * var4 + arg1.field764 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2472.field1472[arg1.field761] == 0) {
                    arg1.field754 = class18.method156(arg1.field758, arg1.field754.method164(), arg1.field754.method180(), arg1.field754.method148());
                } else {
                    arg1.field754 = class18.method156(arg1.field758, arg1.field754.method164(), 0, arg1.field754.method148());
                    this.field2472.method661(1421793734, arg1.field779.field2244[arg1.field763] < 0, arg1);
                }
                if (arg1.field779.field2244[arg1.field763] < 0) {
                    arg1.field754.method174(-1);
                }
                arg0 = arg1.field764 / var4;
            }
        }
        arg1.field754.method168(arg0);
        int var6 = 99 % ((-arg2 - 36) / 55);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()I")
    public final int method178() {
        field2475++;
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static final void method1066(int arg0) {
        field2473++;
        class282.field4476 = null;
        class103.field1673 = null;
        if (arg0 != 0) {
            method1066(103);
        }
        class101.field1653 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()Lfa;")
    public final class251 method154() {
        field2476++;
        class41 var1;
        do {
            var1 = (class41) this.field2480.method852((byte) 123);
            if (var1 == null) {
                return null;
            }
        } while (var1.field754 == null);
        return var1.field754;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Lfa;")
    public final class251 method153() {
        field2470++;
        class41 var1 = (class41) this.field2480.method843(-87);
        if (var1 == null) {
            return null;
        } else if (var1.field754 == null) {
            return this.method154();
        } else {
            return var1.field754;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field2481.method168(arg0);
        field2471++;
        for (class41 var2 = (class41) this.field2480.method843(85); var2 != null; var2 = (class41) this.field2480.method852((byte) 123)) {
            if (!this.field2472.method673(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field777) {
                        this.method1065(var3, var2, -124);
                        var2.field777 -= var3;
                        break;
                    }
                    this.method1065(var2.field777, var2, -111);
                    var3 -= var2.field777;
                } while (!this.field2472.method677(var3, var2, 0, 15, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIIIILr;)V")
    private final void method1067(int[] arg0, int arg1, int arg2, int arg3, int arg4, class41 arg5) {
        field2477++;
        if (arg1 != -1) {
            this.field2472 = null;
        }
        if ((this.field2472.field1421[arg5.field761] & 0x4) != 0 && arg5.field774 < 0) {
            int var7 = this.field2472.field1453[arg5.field761] / class99.field1621;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field764) / var7;
                if (var8 > arg2) {
                    arg5.field764 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg5.field754.method150(arg0, arg4, var8);
                arg4 += var8;
                int var9 = class99.field1621 / 100;
                arg5.field764 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class18 var11 = arg5.field754;
                if (this.field2472.field1472[arg5.field761] == 0) {
                    arg5.field754 = class18.method156(arg5.field758, var11.method164(), var11.method180(), var11.method148());
                } else {
                    arg5.field754 = class18.method156(arg5.field758, var11.method164(), 0, var11.method148());
                    this.field2472.method661(1421793734, arg5.field779.field2244[arg5.field763] < 0, arg5);
                    arg5.field754.method173(var9, var11.method180());
                }
                if (arg5.field779.field2244[arg5.field763] < 0) {
                    arg5.field754.method174(-1);
                }
                var11.method185(var9);
                var11.method150(arg0, arg4, arg3 - arg4);
                if (var11.method151()) {
                    this.field2481.method1708(var11);
                }
            }
        }
        arg5.field754.method150(arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([III)V")
    public final void method150(int[] arg0, int arg1, int arg2) {
        field2469++;
        this.field2481.method150(arg0, arg1, arg2);
        for (class41 var4 = (class41) this.field2480.method843(-36); var4 != null; var4 = (class41) this.field2480.method852((byte) 123)) {
            if (!this.field2472.method673(var4, -1)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field777 >= var5) {
                        this.method1067(arg0, -1, var5, var5 + var6, var6, var4);
                        var4.field777 -= var5;
                        break;
                    }
                    this.method1067(arg0, -1, var4.field777, var6 + var5, var6, var4);
                    var5 -= var4.field777;
                    var6 += var4.field777;
                } while (!this.field2472.method677(var5, var4, var6, 15, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lub;)V")
    public class153(class89 arg0) {
        this.field2472 = arg0;
    }
}
