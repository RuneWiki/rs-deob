import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class293 {

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "[I")
    public static int[] field4286 = new int[64];

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "[[[J")
    public static long[][][] field4281;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 3)
    public static void method1854(int arg0) {
        field4286 = null;
        if (arg0 != 0) {
            field4286 = null;
        }
        field4281 = null;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)V", line = 15)
    public final void method1855(int arg0) {
        this.field4287 &= arg0;
        field4280++;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)I", line = 25)
    public final int method1856(int arg0) {
        if (arg0 == 0) {
            field4284++;
            return this.field4287 & 0x3FFF;
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 36)
    public static final boolean method1857(int arg0, String arg1, int arg2) {
        field4282++;
        if (class336.field4775.field1585) {
            class472.field6424 = new class407();
            class472.field6424.field5595 = arg1;
            class472.field6424.field5598 = arg0;
            if (class94.field1340 != class145.field2353) {
                class472.field6424.field5597 = class472.field6424.field5598 + 40000;
                class472.field6424.field5599 = class472.field6424.field5598 + 50000;
            }
            for (int var3 = 0; var3 < class556.field7710.length; var3++) {
                if (class556.field7710[var3].field5877 == arg0) {
                    class122.field2074 = class556.field7710[var3].field2300;
                }
            }
            return true;
        }
        if (arg2 != 2) {
            field4286 = null;
        }
        String var4 = "";
        if (class94.field1340 != class145.field2353) {
            var4 = ":" + (arg0 + 7000);
        }
        String var5 = "";
        if (class121.field2061 != null) {
            var5 = "/p=" + class121.field2061;
        }
        String var6 = "http://" + arg1 + var4 + "/l=" + class423.field5892 + "/a=" + class276.field3953 + var5 + "/j" + (class781.field10717 ? "1" : "0") + ",o" + (class780.field10691 ? "1" : "0") + ",a2";
        try {
            class199.field2988.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII)Z", line = 93)
    public final boolean method1858(int arg0, int arg1, int arg2, int arg3) {
        field4285++;
        int var5 = this.field4289;
        if (this.field4287 == arg1 && this.field4289 == 0) {
            return false;
        }
        boolean var8;
        if (this.field4289 == 0) {
            if (arg1 > this.field4287 && this.field4287 + arg0 >= arg1 || this.field4287 > arg1 && arg1 >= (this.field4287 - arg0)) {
                this.field4287 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field4289 > 0 && arg1 > this.field4287) {
            int var6 = this.field4289 * this.field4289 / (arg0 * 2);
            int var7 = this.field4287 + var6;
            if (var7 < arg1 && this.field4287 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4289 < 0 && arg1 < this.field4287) {
            int var9 = this.field4289 * this.field4289 / (arg0 * 2);
            int var10 = this.field4287 - var9;
            if (arg1 < var10 && var10 <= this.field4287) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        int var11 = -69 % ((arg3 - 43) / 43);
        if (var8) {
            if (arg1 > this.field4287) {
                this.field4289 += arg0;
                if (arg2 != 0 && this.field4289 > arg2) {
                    this.field4289 = arg2;
                }
            } else {
                this.field4289 -= arg0;
                if (arg2 != 0 && this.field4289 < (-arg2)) {
                    this.field4289 = -arg2;
                }
            }
            if (this.field4289 != var5) {
                int var12 = this.field4289 * this.field4289 / (arg0 * 2);
                if (this.field4287 >= arg1) {
                    if (arg1 < this.field4287 && arg1 > this.field4287 - var12) {
                        this.field4289 = var5;
                    }
                } else if (arg1 < (this.field4287 + var12)) {
                    this.field4289 = var5;
                }
            }
        } else if (this.field4289 <= 0) {
            this.field4289 += arg0;
            if (this.field4289 > 0) {
                this.field4289 = 0;
            }
        } else {
            this.field4289 -= arg0;
            if (this.field4289 < 0) {
                this.field4289 = 0;
            }
        }
        this.field4287 += this.field4289 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BI)V", line = 234)
    public final void method1859(byte arg0, int arg1) {
        this.field4287 = arg1;
        this.field4289 = 0;
        if (arg0 != -102) {
            this.method1856(36);
        }
        field4283++;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(CI)Z", line = 246)
    public static final boolean method1860(char arg0, int arg1) {
        field4279++;
        if (arg1 == -33) {
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return true;
        }
    }
}
