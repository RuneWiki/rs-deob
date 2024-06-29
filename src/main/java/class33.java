import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class33 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    private int field582 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    private int field595 = -1;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lpj;")
    private class284 field593 = new class284();

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
    public boolean field597 = false;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[[I")
    private int[][] field586;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[Lea;")
    private class11[] field590;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[Z")
    public static boolean[] field585 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lfi;")
    public static final class105 method222(byte arg0) {
        field583++;
        class105 var1 = (class105) class173.field2528.method1318((byte) -88);
        if (var1 != null) {
            var1.method1193(124);
            var1.method1746(-94);
            return var1;
        }
        if (arg0 >= -125) {
            field585 = null;
        }
        class105 var2;
        do {
            var2 = (class105) class130.field1908.method1318((byte) -118);
            if (var2 == null) {
                return null;
            }
            if (var2.method768(64) > class257.method1736(14361)) {
                return null;
            }
            var2.method1193(110);
            var2.method1746(-88);
        } while ((Long.MIN_VALUE & var2.field3978) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field585 = null;
        if (arg0 != -27) {
            method226(-66, 87);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[[I")
    public final int[][] method224(int arg0) {
        if (arg0 != 2652) {
            this.method224(-99);
        }
        field588++;
        if (this.field594 != this.field587) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field587; var2++) {
            this.field590[var2] = class58.field954;
        }
        return this.field586;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method225(int arg0) {
        field584++;
        if (class256.field3944 == 0) {
            return;
        }
        try {
            if ((++class264.field4134) > 2000) {
                if (class22.field369 != null) {
                    class22.field369.method1718(-17492);
                    class22.field369 = null;
                }
                if (class92.field1388 >= 1) {
                    class164.field2398 = -5;
                    class256.field3944 = 0;
                    return;
                }
                class264.field4134 = 0;
                if (class223.field3474 == class163.field2374) {
                    class223.field3474 = class178.field2605;
                } else {
                    class223.field3474 = class163.field2374;
                }
                class256.field3944 = 1;
                class92.field1388++;
            }
            if (class256.field3944 == 1) {
                class106.field1564 = class217.field3338.method187(class147.field2138, class223.field3474, -51);
                class256.field3944 = 2;
            }
            if (class256.field3944 == 2) {
                if (class106.field1564.field713 == 2) {
                    throw new IOException();
                }
                if (class106.field1564.field713 != 1) {
                    return;
                }
                class22.field369 = new class253((Socket) class106.field1564.field709, class217.field3338);
                class106.field1564 = null;
                class22.field369.method1715(class59.field964.field848, 120, 0, class59.field964.field887);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                int var1 = class22.field369.method1726((byte) 127);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                if (var1 != 21) {
                    class256.field3944 = 0;
                    class164.field2398 = var1;
                    class22.field369.method1718(arg0 - 17495);
                    class22.field369 = null;
                    return;
                }
                class256.field3944 = 3;
            }
            if (class256.field3944 == arg0) {
                if (class22.field369.method1725(0) < 1) {
                    return;
                }
                class168.field2475 = new String[class22.field369.method1726((byte) 126)];
                class256.field3944 = 4;
            }
            if (class256.field3944 == 4 && class22.field369.method1725(0) >= (class168.field2475.length * 8)) {
                class173.field2543.field887 = 0;
                class22.field369.method1723(class168.field2475.length * 8, class173.field2543.field848, 0, (byte) -108);
                for (int var2 = 0; var2 < class168.field2475.length; var2++) {
                    class168.field2475[var2] = class3.method45(class173.field2543.method429(class226.method1551(arg0, -1313681365)), -13798);
                }
                class256.field3944 = 0;
                class164.field2398 = 21;
                class22.field369.method1718(arg0 - 17495);
                class22.field369 = null;
            }
        } catch (IOException var3) {
            if (class22.field369 != null) {
                class22.field369.method1718(-17492);
                class22.field369 = null;
            }
            if (class92.field1388 >= 1) {
                class256.field3944 = 0;
                class164.field2398 = -4;
            } else {
                if (class223.field3474 == class163.field2374) {
                    class223.field3474 = class178.field2605;
                } else {
                    class223.field3474 = class163.field2374;
                }
                class256.field3944 = 1;
                class92.field1388++;
                class264.field4134 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static final int method226(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final void method227(int arg0) {
        if (arg0 <= 41) {
            method226(81, -104);
        }
        for (int var2 = 0; var2 < this.field587; var2++) {
            this.field586[var2] = null;
        }
        this.field586 = null;
        field591++;
        this.field590 = null;
        this.field593.method1891(23);
        this.field593 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[I")
    public final int[] method228(int arg0, int arg1) {
        if (arg0 != 24856) {
            return null;
        }
        field596++;
        if (this.field594 == this.field587) {
            this.field597 = this.field590[arg1] == null;
            this.field590[arg1] = class58.field954;
            return this.field586[arg1];
        } else if (this.field587 == 1) {
            this.field597 = this.field595 != arg1;
            this.field595 = arg1;
            return this.field586[0];
        } else {
            class11 var3 = this.field590[arg1];
            if (var3 == null) {
                this.field597 = true;
                if (this.field582 < this.field587) {
                    var3 = new class11(arg1, this.field582);
                    this.field582++;
                } else {
                    class11 var4 = (class11) this.field593.method1890(arg0 ^ 0xFFFFB435);
                    var3 = new class11(arg1, var4.field167);
                    this.field590[var4.field165] = null;
                    var4.method1193(123);
                }
                this.field590[arg1] = var3;
            } else {
                this.field597 = false;
            }
            this.field593.method1882((byte) 87, var3);
            return this.field586[var3.field167];
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(III)V")
    public class33(int arg0, int arg1, int arg2) {
        this.field587 = arg0;
        this.field594 = arg1;
        this.field586 = new int[this.field587][arg2];
        this.field590 = new class11[this.field594];
    }
}
