import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class291 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field4004 = -1;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4006 = 1;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Z")
    public boolean field4007 = false;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
    public boolean field4008 = false;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field4012 = 2;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field4010 = 64;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public int field4013 = 64;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[F")
    public static float[] field4002 = new float[4];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "F")
    public static float field4003;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lan;")
    public static class21 field4011;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILdaa;)V")
    private final void method1874(int arg0, int arg1, int arg2, class11 arg3) {
        if (arg0 == 1) {
            this.field4004 = arg3.method93((byte) 115);
            if (this.field4004 == 65535) {
                this.field4004 = -1;
            }
        } else if (arg0 == 2) {
            this.field4013 = arg3.method93((byte) 99) + 1;
            this.field4010 = arg3.method93((byte) 112) + 1;
        } else if (arg0 == 3) {
            arg3.method67(65280);
        } else if (arg0 == 4) {
            this.field4012 = arg3.method110((byte) 33);
        } else if (arg0 == 5) {
            this.field4006 = arg3.method110((byte) 126);
        } else if (arg0 == 6) {
            this.field4008 = true;
        } else if (arg0 == 7) {
            this.field4007 = true;
        }
        if (arg1 != 32743) {
            field4002 = null;
        }
        field4000++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
    public static final int method1875(byte arg0) {
        field3999++;
        if (arg0 > -110) {
            field4011 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ldaa;II)V")
    public final void method1876(class11 arg0, int arg1, int arg2) {
        if (arg2 != -2097814992) {
            this.field4012 = -32;
        }
        field4005++;
        while (true) {
            int var4 = arg0.method110((byte) 52);
            if (var4 == 0) {
                return;
            }
            this.method1874(var4, 32743, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1877(int arg0) {
        field4011 = null;
        field4002 = null;
        if (arg0 <= 99) {
            field4002 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
    public static final boolean method1878(int arg0, int arg1, int arg2) {
        field4001++;
        if (!class483.field6820) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class618.field8850[var3] == null || class618.field8850[var3][var4] == null) {
            return false;
        }
        if (arg2 > -98) {
            field4003 = -0.022136007F;
        }
        class114 var5 = class618.field8850[var3][var4];
        if (arg0 == -1 && var5.field1880 == 0) {
            for (class442 var6 = (class442) class448.field6352.method456((byte) -65); var6 != null; var6 = (class442) class448.field6352.method460((byte) -116)) {
                if (var6.field6298 == 51 || var6.field6298 == 1009 || var6.field6298 == 3 || var6.field6298 == 25 || var6.field6298 == 47) {
                    for (class114 var7 = class612.method3584(var6.field6291, 0); var7 != null; var7 = class104.method741((byte) -128, var7)) {
                        if (var5.field1810 == var7.field1810) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class442 var8 = (class442) class448.field6352.method456((byte) -118); var8 != null; var8 = (class442) class448.field6352.method460((byte) 79)) {
                if (var8.field6293 == arg0 && var5.field1810 == var8.field6291 && (var8.field6298 == 51 || var8.field6298 == 1009 || var8.field6298 == 3 || var8.field6298 == 25 || var8.field6298 == 47)) {
                    return true;
                }
            }
        }
        return false;
    }
}
