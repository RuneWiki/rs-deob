import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class469 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Lmc;")
    public static class78 field6474 = new class78(23, -1);

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Ljm;")
    public static class448 field6478 = new class448(64);

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
    public static int[] field6482 = new int[1000];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field6472;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    private int field6483;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lci;IBLjava/awt/Canvas;)Lwm;")
    public static final class364 method2754(class287 arg0, int arg1, byte arg2, Canvas arg3) {
        if (arg2 == -41) {
            field6473++;
            return new class349(arg3, arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public static final void method2755(boolean arg0) {
        if (!arg0) {
            return;
        }
        field6475++;
        try {
            if (class148.field2106 == 1) {
                int var1 = class491.field6866.method1781(-74);
                if (var1 > 0 && class491.field6866.method1748((byte) -64)) {
                    int var2 = var1 - class425.field5747;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class491.field6866.method1756(var2, 256);
                } else {
                    class491.field6866.method1752((byte) -37);
                    class491.field6866.method1754(0);
                    class422.field5735 = null;
                    class162.field2264 = null;
                    if (class409.field5607 == null) {
                        class148.field2106 = 0;
                    } else {
                        class148.field2106 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class491.field6866.method1752((byte) -37);
            class162.field2264 = null;
            class148.field2106 = 0;
            class409.field5607 = null;
            class422.field5735 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)V")
    public static final void method2756(int arg0, boolean arg1, int arg2) {
        field6471++;
        int var3 = class392.field5448.method2145(class13.field180.method1176(class110.field1676, (byte) -105), 13938);
        for (class395 var4 = (class395) class450.field6121.method652((byte) 37); var4 != null; var4 = (class395) class450.field6121.method653(109)) {
            int var8 = class488.method2848(16107, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class475.field6540 * 16 + 21;
        if (arg1) {
            method2761(true);
        }
        int var6 = arg0 - var3 / 2;
        if ((var6 + var3) > class424.field5738) {
            var6 = class424.field5738 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class72.field986 < var5 + arg2) {
            var7 = class72.field986 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class2.field40 = var6;
        class97.field1419 = var3;
        class103.field1491 = class475.field6540 * 16 + (class316.field4178 ? 26 : 22);
        class94.field1390 = var7;
        class385.field5334 = true;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public final void method2757(byte arg0) {
        if (arg0 <= 14) {
            this.field6472 = 28;
        }
        field6476++;
        this.field6472 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)I")
    public final int method2758(byte arg0) {
        if (arg0 == 70) {
            field6481++;
            return this.field6472 & 0x3FFF;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
    public final void method2759(int arg0, int arg1) {
        field6480++;
        this.field6483 = arg1;
        this.field6472 = arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZI)Z")
    public final boolean method2760(int arg0, int arg1, boolean arg2, int arg3) {
        field6479++;
        int var5 = this.field6483;
        if (this.field6472 == arg0 && this.field6483 == 0) {
            return false;
        } else if (arg2) {
            return false;
        } else {
            boolean var6;
            if (this.field6483 == 0) {
                if (this.field6472 < arg0 && (this.field6472 + arg1) >= arg0 || arg0 < this.field6472 && this.field6472 - arg1 <= arg0) {
                    this.field6472 = arg0;
                    return false;
                }
                var6 = true;
            } else if (this.field6483 > 0 && arg0 > this.field6472) {
                int var7 = this.field6483 * this.field6483 / (arg1 * 2);
                int var8 = this.field6472 + var7;
                if (var8 < arg0 && this.field6472 <= var8) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field6483 < 0 && this.field6472 > arg0) {
                int var9 = this.field6483 * this.field6483 / (arg1 * 2);
                int var10 = this.field6472 - var9;
                if (arg0 < var10 && var10 <= this.field6472) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (this.field6472 >= arg0) {
                    this.field6483 -= arg1;
                    if (arg3 != 0 && (-arg3) > this.field6483) {
                        this.field6483 = -arg3;
                    }
                } else {
                    this.field6483 += arg1;
                    if (arg3 != 0 && arg3 < this.field6483) {
                        this.field6483 = arg3;
                    }
                }
                if (this.field6483 != var5) {
                    int var11 = this.field6483 * this.field6483 / (arg1 * 2);
                    if (arg0 > this.field6472) {
                        if (arg0 < this.field6472 + var11) {
                            this.field6483 = var5;
                        }
                    } else if (arg0 < this.field6472 && arg0 > this.field6472 - var11) {
                        this.field6483 = var5;
                    }
                }
            } else if (this.field6483 <= 0) {
                this.field6483 += arg1;
                if (this.field6483 > 0) {
                    this.field6483 = 0;
                }
            } else {
                this.field6483 -= arg1;
                if (this.field6483 < 0) {
                    this.field6483 = 0;
                }
            }
            this.field6472 += this.field6483 + var5 >> 1;
            return var6;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)V")
    public static void method2761(boolean arg0) {
        field6478 = null;
        field6482 = null;
        if (arg0) {
            field6478 = null;
        }
        field6474 = null;
    }
}
