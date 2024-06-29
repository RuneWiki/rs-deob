import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class26 extends class262 {

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    private int field450 = 4096;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field454 = 0;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lok;")
    public static class146 field451 = class235.method1724(-12908, ": ");

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lqj;")
    public static class246 field461;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lwe;II)V", line = 5)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field453++;
        if (arg2 == 0) {
            this.field454 = arg0.method379(arg1 - 2050);
        } else if (arg2 == 1) {
            this.field450 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field4365 = arg0.method368(arg1 ^ 0xFFFFF788) == 1;
        }
        if (arg1 != 2048) {
            method175(110);
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V", line = 48)
    public static void method171(int arg0) {
        field451 = null;
        field461 = null;
        if (arg0 != 0) {
            field460 = -1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I", line = 68)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 95);
        field459++;
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field454) {
                    var3[var5] = this.field454;
                } else if (this.field450 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field450;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 297)
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I", line = 117)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            this.method38(70, (byte) 29);
        }
        field455++;
        int[][] var3 = this.field4347.method536(arg1, arg0 ^ 0x1007);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, arg0 ^ 0x7E);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class98.field1598; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var13 < this.field454) {
                    var8[var11] = this.field454;
                } else if (this.field450 >= var13) {
                    var8[var11] = var13;
                } else {
                    var8[var11] = this.field450;
                }
                if (this.field454 > var12) {
                    var10[var11] = this.field454;
                } else if (this.field450 >= var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field450;
                }
                if (var14 < this.field454) {
                    var9[var11] = this.field454;
                } else if (this.field450 < var14) {
                    var9[var11] = this.field450;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)I", line = 191)
    public static final int method172(int arg0) {
        field452++;
        if (class135.field2255 == null) {
            return -1;
        }
        while (class133.field2232 < class135.field2255.field4796) {
            if (class135.field2255.method2029(class133.field2232, true)) {
                return class133.field2232++;
            }
            class133.field2232++;
        }
        if (arg0 <= 126) {
            field451 = (class146) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)Z", line = 217)
    public static final boolean method173(int arg0, int arg1, int arg2) {
        int var3 = class293.field4979[arg0][arg1][arg2];
        if (-class40.field725 == var3) {
            return false;
        } else if (class40.field725 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class112.method755(var4 + 1, class174.field2914[arg0][arg1][arg2], var5 + 1) && class112.method755(var4 + 128 - 1, class174.field2914[arg0][arg1 + 1][arg2], var5 + 1) && class112.method755(var4 + 128 - 1, class174.field2914[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class112.method755(var4 + 1, class174.field2914[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class293.field4979[arg0][arg1][arg2] = class40.field725;
                return true;
            } else {
                class293.field4979[arg0][arg1][arg2] = -class40.field725;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([FB)[F", line = 242)
    public static final float[] method174(float[] arg0, byte arg1) {
        field457++;
        if (arg1 <= 77) {
            method174((float[]) null, (byte) 126);
        }
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class244.method1769(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V", line = 264)
    public static final void method175(int arg0) {
        field458++;
        class157.method1231((byte) -84);
        class96.method664(-1);
        if (arg0 != 128) {
            method173(-66, 63, -109);
        }
        class261.method1887((byte) -118);
        class46.method319(-99);
        class258.method1872(12);
        class197.method1521(arg0 ^ 0x7F);
        class52.method422((byte) 101);
        class56.method450(arg0 ^ 0x85);
        class134.method993((byte) 29);
        class287.method2073(85);
        class128.method885(arg0 - 30);
        class19.method140(false);
        class305.method2149(arg0 - 15800);
        class232.method1704((byte) 39);
        class72.method534(arg0 ^ 0xFFFF8AD2);
        class89.field1421.method793((byte) -125);
        class281.field4821.method793((byte) -60);
    }
}
