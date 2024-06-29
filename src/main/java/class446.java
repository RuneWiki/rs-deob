import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class446 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Z")
    public boolean field6557 = false;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public int field6561 = 128;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Z")
    public boolean field6563 = true;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public int field6569 = 1190717;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public int field6570 = 16;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public int field6562 = -1;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field6559 = 8;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public int field6564 = 0;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public int field6577 = -1;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Z")
    public boolean field6567 = true;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public int field6576 = -1;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field6574 = -1;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "Lwl;")
    public static class452 field6572 = new class452(69, 8);

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field6579 = 52;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field6581 = -1;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "Ljg;")
    public static class241 field6580 = new class241(64);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Ltg;")
    public static class451 field6560;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[[B")
    public static byte[][] field6568;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILef;BI)V")
    private final void method2751(int arg0, class385 arg1, byte arg2, int arg3) {
        field6566++;
        if (arg2 > -32) {
            this.method2752(-121, -109);
        }
        if (arg0 == 1) {
            this.field6564 = class455.method2830(-6040, arg1.method2382((byte) -124));
        } else if (arg0 == 2) {
            this.field6562 = arg1.method2343(255);
            return;
        } else if (arg0 == 3) {
            this.field6562 = arg1.method2323(-120);
            if (this.field6562 == 65535) {
                this.field6562 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field6563 = false;
            return;
        } else if (arg0 == 7) {
            this.field6576 = class455.method2830(-6040, arg1.method2382((byte) -103));
            return;
        } else if (arg0 == 8) {
            class413.field6138 = arg3;
            return;
        } else if (arg0 == 9) {
            this.field6561 = arg1.method2323(-9);
            return;
        } else if (arg0 == 10) {
            this.field6567 = false;
            return;
        } else if (arg0 == 11) {
            this.field6559 = arg1.method2343(255);
            return;
        } else if (arg0 == 12) {
            this.field6557 = true;
            return;
        } else if (arg0 == 13) {
            this.field6569 = arg1.method2382((byte) -82);
            return;
        } else {
            if (arg0 == 14) {
                this.field6570 = arg1.method2343(255);
            } else if (arg0 == 15) {
                this.field6577 = arg1.method2323(-57);
                if (this.field6577 == 65535) {
                    this.field6577 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
    public final void method2752(int arg0, int arg1) {
        if (arg0 <= 74) {
            this.method2751(53, (class385) null, (byte) -79, -1);
        }
        this.field6559 = this.field6559 << 8 | arg1;
        if (this.field6577 == -1) {
            this.field6577 = this.field6562;
        }
        field6578++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILef;B)V")
    public final void method2753(int arg0, class385 arg1, byte arg2) {
        if (arg2 != 75) {
            return;
        }
        field6575++;
        while (true) {
            int var4 = arg1.method2343(255);
            if (var4 == 0) {
                return;
            }
            this.method2751(var4, arg1, (byte) -92, arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILsc;)V")
    public static final void method2754(int arg0, class239 arg1) {
        field6571++;
        class105.field1410 = 3;
        class341.method2080(-42, true);
        class452.field6683 = 1;
        class451.field6650 = true;
        class95.field1324 = 0;
        class465.field6842 = 127;
        class345.field5157 = true;
        client.field6666 = 127;
        class52.field684 = true;
        class243.field3646 = 0;
        class244.field3651 = true;
        class424.field6237 = true;
        class97.field1334 = 2;
        class151.field2090 = true;
        class1.field12 = true;
        class57.field767 = 0;
        class438.field6450 = 255;
        class431.field6332 = true;
        class213.field3198 = true;
        class39.field477 = true;
        class287.field4376 = 0;
        if (class229.field3504 < 96) {
            class133.method803(0, -12131);
        } else {
            class133.method803(2, -12131);
        }
        class121.field1597 = false;
        class350.field5205 = class137.field1854 == 1 ? 2 : 4;
        class212.field3193 = false;
        class341.field5111 = true;
        class14.field176 = 2;
        class376.field5479 = 2;
        class439.field6455 = 0;
        class109.field1445 = 0;
        class289.field4391 = false;
        class15.field188 = true;
        class235 var2 = null;
        try {
            if (arg0 != 22394) {
                field6581 = -109;
            }
            class211 var3 = arg1.method1448((byte) -120);
            while (var3.field3172 == 0) {
                class109.method674((byte) 99, 1L);
            }
            if (var3.field3172 == 1) {
                var2 = (class235) var3.field3175;
                byte[] var4 = new byte[(int) var2.method1421((byte) 71)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1419(0, var4, var5, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class106.method663(5509, new class385(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1420((byte) 73);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method2755(int arg0) {
        field6560 = null;
        field6572 = null;
        field6580 = null;
        if (arg0 != -16098) {
            field6574 = 26;
        }
        field6568 = null;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static final void method2756(int arg0) {
        if (arg0 != -25456) {
            return;
        }
        for (class71 var1 = (class71) class451.field6638.method2514((byte) 61); var1 != null; var1 = (class71) class451.field6638.method2511(-105)) {
            if (var1.field917) {
                var1.method473((byte) 41);
            }
        }
        field6565++;
        for (class71 var2 = (class71) class281.field4298.method2514((byte) 61); var2 != null; var2 = (class71) class281.field4298.method2511(arg0 + 25333)) {
            if (var2.field917) {
                var2.method473((byte) 41);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6558++;
        class98.field1360 = 0L;
        if (arg3 != -4) {
            method2754(80, (class239) null);
        }
        int var5 = class246.method1503((byte) -79);
        if (arg1 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class196.field2965.method386()) {
            arg4 = true;
        }
        class294.method1830(arg1, arg4, arg0, var5, (byte) -111, arg2);
    }
}
