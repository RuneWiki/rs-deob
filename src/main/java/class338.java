import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class338 extends class346 {

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    private int field4995 = 1;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    private int field4991 = 0;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    private int field5003 = 0;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4986 = "Prepared sound engine";

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "Z")
    public static boolean field4993 = true;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "J")
    public static long field4997 = 0L;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4999 = "K";

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Z")
    public static boolean field5002 = false;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "Lir;")
    public static class185 field4988;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "[[I")
    public static int[][] field4989;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "[[I")
    public static int[][] field4996;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 8)
    public class338() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Z", line = 16)
    public static final boolean method2195(int arg0, int arg1) {
        ++field4992;
        if (class77.field1080[arg0]) {
            return true;
        } else if (!class237.field3317.method1200(arg0, arg1 ^ 6239)) {
            return false;
        } else {
            int var2 = class237.field3317.method1225(arg0, (byte) 27);
            if (var2 == 0) {
                class77.field1080[arg0] = true;
                return true;
            } else {
                if (class4.field71[arg0] == null) {
                    class4.field71[arg0] = new class248[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class4.field71[arg0][var3] == null) {
                        byte[] var4 = class237.field3317.method1235(arg0, false, var3);
                        if (var4 != null) {
                            class248 var5 = class4.field71[arg0][var3] = new class248();
                            var5.field3636 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                var5.method1615(new class341(var4), (byte) 115);
                            } else {
                                var5.method1630((byte) -57, new class341(var4));
                            }
                        }
                    }
                }
                if (arg1 != 6173) {
                    method2199(-97, -97);
                }
                class77.field1080[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 73)
    public final void method237(byte arg0) {
        ++field4994;
        if (arg0 >= -95) {
            this.method237((byte) 59);
        }
        class431.method2689(256);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[I", line = 89)
    public final int[] method45(int arg0, int arg1) {
        ++field4987;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            field5002 = true;
        }
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class134.field1753 > var6; ++var6) {
                int var7 = class361.field5340[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field4991 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field4995 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field4995;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field5003 == 0) {
                    var12 = class238.field3323[(var12 & 4084) >> 4] + 4096 >> 1;
                } else if (this.field5003 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 157)
    public static void method2196(int arg0) {
        field4986 = null;
        if (arg0 != 0) {
            field4989 = null;
        }
        field4996 = null;
        field4988 = null;
        field4999 = null;
        field4989 = null;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I", line = 193)
    public static final int method2197(int arg0) {
        ++field5005;
        int var1 = 66 / ((11 - arg0) / 61);
        return class395.field5755;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfb;ZI)V", line = 211)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field4998;
        if (arg1) {
            this.method45(-45, 8);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field4995 = arg0.method2233((byte) 104);
                }
            } else {
                this.field5003 = arg0.method2233((byte) 104);
            }
        } else {
            this.field4991 = arg0.method2233((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V", line = 254)
    public static final void method2198(byte arg0) {
        if (arg0 <= 94) {
            method2196(21);
        }
        ++field5001;
        if (~class297.field4487 > -1) {
            class297.field4487 = 0;
            class248.field3655 = -1;
            class222.field3067 = -1;
        }
        if (class200.field2779 < class297.field4487) {
            class222.field3067 = -1;
            class297.field4487 = class200.field2779;
            class248.field3655 = -1;
        }
        if (~class85.field1184 > -1) {
            class222.field3067 = -1;
            class248.field3655 = -1;
            class85.field1184 = 0;
        }
        if (~class85.field1184 < ~class200.field2770) {
            class248.field3655 = -1;
            class85.field1184 = class200.field2770;
            class222.field3067 = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)Ljava/lang/String;", line = 293)
    public static final String method2199(int arg0, int arg1) {
        ++field4990;
        if (arg0 >= -85) {
            return null;
        } else {
            return ~arg1 > -1000000000 ? Integer.toString(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;", line = 308)
    public static final String method2200(boolean arg0, int arg1, byte[] arg2, int arg3) {
        ++field5000;
        if (!arg0) {
            field4993 = false;
        }
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = 0; arg3 > var6; ++var6) {
            int var7 = 255 & arg2[arg1 + var6];
            if (var7 != 0) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class437.field6350[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)Llm;", line = 359)
    public static final class370 method2201(int arg0, int arg1) {
        ++field5004;
        class370 var2 = (class370) class385.field5629.method2348(112, (long) arg0);
        int var3 = -74 / ((-2 - arg1) / 50);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class86.field1188.method1235(5, false, arg0);
            class370 var5 = new class370();
            if (var4 != null) {
                var5.method2436(-1, new class341(var4));
            }
            class385.field5629.method2350(var5, (long) arg0, -110);
            return var5;
        }
    }
}
