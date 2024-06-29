import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class20 extends class134 {

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Laj;")
    public static class151 field361;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)Z")
    public final boolean method122(int arg0) {
        if (arg0 >= -45) {
            this.field371 = -74;
        }
        field359++;
        return (this.field371 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
    public static final void method123() {
        if (class215.field3637 != null) {
            for (int var0 = 0; var0 < class215.field3637.length; var0++) {
                for (int var1 = 0; var1 < class21.field379; var1++) {
                    for (int var2 = 0; var2 < class28.field479; var2++) {
                        class215.field3637[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class184.field2943 != null) {
            for (int var3 = 0; var3 < class184.field2943.length; var3++) {
                for (int var4 = 0; var4 < class21.field379; var4++) {
                    for (int var5 = 0; var5 < class28.field479; var5++) {
                        class184.field2943[var3][var4][var5] = null;
                    }
                }
            }
        }
        class216.field3653 = 0;
        if (class241.field4063 != null) {
            for (int var6 = 0; var6 < class216.field3653; var6++) {
                class241.field4063[var6] = null;
            }
        }
        if (class140.field2310 != null) {
            for (int var7 = 0; var7 < class118.field1990; var7++) {
                class140.field2310[var7] = null;
            }
            class118.field1990 = 0;
        }
        if (class125.field2103 != null) {
            for (int var8 = 0; var8 < class125.field2103.length; var8++) {
                class125.field2103[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 == 0) {
            field369++;
            return (this.field371 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)Z")
    public final boolean method125(int arg0, boolean arg1) {
        if (arg1) {
            this.method130((byte) -64);
        }
        field368++;
        return (this.field371 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I")
    public final int method126(byte arg0) {
        field370++;
        if (arg0 != -128) {
            this.method122(-127);
        }
        return class119.method900(this.field371, (byte) 74);
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        if (arg0 != 0) {
            field364 = -53;
        }
        field367++;
        return (this.field371 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "(I)Z")
    public final boolean method128(int arg0) {
        field376++;
        if (arg0 > -116) {
            return false;
        } else {
            return (this.field371 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
    public final boolean method129(byte arg0) {
        if (arg0 > -53) {
            field364 = -79;
        }
        field372++;
        return (this.field371 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
    public final int method130(byte arg0) {
        field362++;
        if (arg0 > -23) {
            field375 = 126;
        }
        return this.field371 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
    public final boolean method131(boolean arg0) {
        if (arg0) {
            method123();
        }
        field373++;
        return (this.field371 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
    public static void method132(byte arg0) {
        if (arg0 != -70) {
            method123();
        }
        field361 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)J")
    public static final long method133(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 == null || var3.field2805 == null ? 0L : var3.field2805.field428;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(II)V")
    public class20(int arg0, int arg1) {
        this.field371 = arg0;
        this.field360 = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLhg;)Lhg;")
    public static final class207 method134(byte arg0, class207 arg1) {
        if (arg0 < 31) {
            method133(-125, 39, 12);
        }
        field366++;
        class207 var2 = client.method726(arg1);
        if (var2 == null) {
            var2 = arg1.field3402;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)Z")
    public final boolean method135(byte arg0) {
        if (arg0 != -48) {
            method123();
        }
        field363++;
        return (this.field371 & 0x1) != 0;
    }
}
