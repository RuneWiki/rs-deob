import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class484 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[[I")
    public static int[][] field7091 = new int[6][];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field7089;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lhh;")
    public static class84 field7095;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 5)
    public static void method2889(int arg0) {
        if (arg0 == 6774) {
            field7095 = null;
            field7091 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I", line = 16)
    public final int method2890(byte arg0) {
        field7094++;
        if (arg0 != -9) {
            this.field7089 = 117;
        }
        return this.field7089 & 0x3FFF;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)Z", line = 28)
    public final boolean method2891(int arg0, int arg1, int arg2, int arg3) {
        field7090++;
        int var5 = this.field7087;
        if (this.field7089 == arg3 && this.field7087 == 0) {
            return false;
        }
        boolean var6;
        if (~this.field7087 == arg2) {
            if (arg3 > this.field7089 && arg3 <= this.field7089 + arg1 || arg3 < this.field7089 && this.field7089 - arg1 <= arg3) {
                this.field7089 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field7087 > 0 && this.field7089 < arg3) {
            int var7 = this.field7087 * this.field7087 / (arg1 * 2);
            int var8 = this.field7089 + var7;
            if (arg3 > var8 && var8 >= this.field7089) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field7087 < 0 && arg3 < this.field7089) {
            int var9 = this.field7087 * this.field7087 / (arg1 * 2);
            int var10 = this.field7089 - var9;
            if (arg3 < var10 && this.field7089 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg3 > this.field7089) {
                this.field7087 += arg1;
                if (arg0 != 0 && arg0 < this.field7087) {
                    this.field7087 = arg0;
                }
            } else {
                this.field7087 -= arg1;
                if (arg0 != 0 && (-arg0) > this.field7087) {
                    this.field7087 = -arg0;
                }
            }
            if (this.field7087 != var5) {
                int var11 = this.field7087 * this.field7087 / (arg1 * 2);
                if (this.field7089 >= arg3) {
                    if (this.field7089 > arg3 && (this.field7089 - var11) < arg3) {
                        this.field7087 = var5;
                    }
                } else if (this.field7089 + var11 > arg3) {
                    this.field7087 = var5;
                }
            }
        } else if (this.field7087 > 0) {
            this.field7087 -= arg1;
            if (this.field7087 < 0) {
                this.field7087 = 0;
            }
        } else {
            this.field7087 += arg1;
            if (this.field7087 > 0) {
                this.field7087 = 0;
            }
        }
        this.field7089 += this.field7087 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 173)
    public final void method2892(int arg0, boolean arg1) {
        this.field7089 = arg0;
        field7093++;
        if (!arg1) {
            field7091 = null;
        }
        this.field7087 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 185)
    public final void method2893(int arg0) {
        if (arg0 != -7296) {
            method2889(-88);
        }
        field7092++;
        this.field7089 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 198)
    public static final void method2894(int arg0) {
        if (arg0 > -79) {
            field7091 = null;
        }
        field7088++;
        for (class212 var1 = (class212) class91.field1503.method2257((byte) 92); var1 != null; var1 = (class212) class91.field1503.method2256(112)) {
            class37 var2 = var1.field3064;
            if (var2.field555) {
                var1.method2663(-111);
                var2.method291((byte) 0);
            } else if (class180.field2734 >= var2.field568) {
                var2.method295(-115, class228.field3343);
                if (var2.field555) {
                    var1.method2663(-113);
                } else {
                    class333.method2194(var2, true);
                }
            }
        }
    }
}
