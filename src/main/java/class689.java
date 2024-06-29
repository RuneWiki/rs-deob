import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class689 extends class441 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public int field9742;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public int field9743;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field9744;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field9745;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "J")
    public long field9741;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[I")
    public static int[] field9740;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
    public final int method1094(boolean arg0) {
        field9751++;
        return arg0 ? this.field9742 : -32;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBII)I")
    public static final int method3863(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field9747++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg1 <= 32) {
            return -3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)J")
    public final long method1090(int arg0) {
        if (arg0 != 3) {
            this.field9744 = 61;
        }
        field9749++;
        return this.field9741;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLte;II)Lba;")
    public static final class356 method3864(byte arg0, class571 arg1, int arg2, int arg3) {
        field9739++;
        int var4 = arg1.field8303 | arg2 << 10;
        class356 var5 = (class356) class111.field2009.method783(-122, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        if (arg0 != 57) {
            field9740 = null;
        }
        byte[] var6 = class481.field6912.method2242(0, class481.field6912.method2233(var4, false));
        if (var6 == null) {
            int var9 = arg3 + 65536 << 10 | arg1.field8303;
            class356 var10 = (class356) class111.field2009.method783(-106, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class481.field6912.method2242(0, class481.field6912.method2233(var9, false));
            if (var11 == null) {
                int var14 = arg1.field8303 | 0x3FFFC00;
                class356 var15 = (class356) class111.field2009.method783(-128, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class481.field6912.method2242(0, class481.field6912.method2233(var14, false));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class356 var17;
                    try {
                        var17 = class681.method3827(var16, (byte) 90);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field5326 = arg1;
                    class111.field2009.method780((long) var14 << 16, (byte) -117, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class356 var12;
                try {
                    var12 = class681.method3827(var11, (byte) 97);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field5326 = arg1;
                class111.field2009.method780((long) var9 << 16, (byte) -109, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class356 var7;
            try {
                var7 = class681.method3827(var6, (byte) 120);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field5326 = arg1;
            class111.field2009.method780((long) var4 << 16, (byte) -124, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method1092(int arg0) {
        if (arg0 >= -125) {
            this.field9743 = 57;
        }
        field9748++;
        return this.field9745;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
    public static final void method3865(int arg0, byte arg1) {
        field9738++;
        if (arg1 != -84) {
            field9740 = null;
        }
        class19 var2 = class373.method2355(99, arg0, 12);
        var2.method438(806);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
    public final int method1091(byte arg0) {
        if (arg0 <= 9) {
            this.field9744 = 33;
        }
        field9746++;
        return this.field9744;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
    public final int method1093(int arg0) {
        field9750++;
        if (arg0 != 5) {
            method3865(-74, (byte) -89);
        }
        return this.field9743;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static void method3866(byte arg0) {
        field9740 = null;
        if (arg0 >= -84) {
            method3866((byte) -113);
        }
    }
}
