import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class47 extends class286 {

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    private int field654 = 1;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Z")
    public static boolean field641 = false;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "Z")
    public static boolean field650 = true;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field647 = 0;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 4)
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lfe;ZI)V", line = 13)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field653 = 91;
        }
        field651++;
        if (arg2 == 0) {
            this.field642 = arg0.method1535((byte) 85);
        } else if (arg2 == 1) {
            this.field644 = arg0.method1535((byte) 80);
        } else if (arg2 == 3) {
            this.field654 = arg0.method1535((byte) 110);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 60)
    public static final int method275(int arg0, Random arg1, int arg2) {
        field646++;
        if (arg2 != -1625284640) {
            method275(-58, (Random) null, -114);
        }
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class295.method1996(arg0, -4097)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class77.method503(arg0, var4, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V", line = 108)
    public final void method276(int arg0) {
        class86.method555(4096);
        field643++;
        if (arg0 != 3) {
            this.method19((class229) null, true, 71);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I", line = 123)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            this.method276(-19);
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        field649++;
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class27.field410; var6++) {
                int var7 = class174.field2978[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field642 == 0) {
                    var11 = (var7 - var4) * this.field654;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field654 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field644 == 0) {
                    var12 = class133.field2236[(var12 & 0xFF2) >> 4] + 4096 >> 1;
                } else if (this.field644 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZB)V", line = 193)
    public static final void method277(boolean arg0, byte arg1) {
        field652++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class14.field147;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class113.field1903;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class281.method1876((byte) -120);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class18.field208[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3C34FCC) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 3 & 0x7FF;
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + (var9 / 8);
                            for (int var13 = 0; var13 < class177.field3039.length; var13++) {
                                if (class177.field3039[var13] == var12 && var2[var13] != null) {
                                    class92.method591(var8, (var11 & 0x7) * 8, var4, class180.field3102, var10, var6 * 8, -125, var5 * 8, var2[var13], arg0, (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 76) {
            method275(-3, (Random) null, 6);
        }
    }
}
