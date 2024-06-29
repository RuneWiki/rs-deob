import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class346 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field5484 = 0;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field5499 = -1;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field5487 = 0;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public int field5486 = -1;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public int field5500 = -1;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public int field5506 = -1;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public int field5508 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field5489 = -1;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field5505 = 0;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public int field5497 = 0;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public int field5503 = -1;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public int field5491 = -1;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public int field5509 = 0;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public int field5501 = 0;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field5502 = -1;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field5504 = -1;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field5512 = -1;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field5498 = -1;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public int field5493 = -1;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public int field5518 = -1;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public int field5494 = -1;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public int field5519 = -1;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public int field5510 = 0;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public int field5522 = -1;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field5520 = 0;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public int field5521 = -1;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public int field5513 = 0;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public int field5526 = -1;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public int field5517 = -1;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public int field5527 = -1;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public int field5515 = -1;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field5492 = -1;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[F")
    public static float[] field5485 = new float[4];

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Lul;")
    public static class51 field5507 = new class51(64);

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[S")
    public static short[] field5524 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "[[I")
    public int[][] field5525;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method2423(byte arg0, int arg1, int arg2) {
        field5495++;
        if (arg1 == -1) {
            return 12345678;
        }
        if (arg0 >= -119) {
            field5485 = (float[]) null;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLpi;)V", line = 33)
    public final void method2424(byte arg0, class336 arg1) {
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                field5528++;
                if (arg0 != -85) {
                    method2430(90, true, (byte[]) null);
                }
                return;
            }
            this.method2426(var3, arg1, -121);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 50)
    public static final void method2425(int arg0) {
        field5488++;
        if (arg0 != -30154) {
            method2427((byte) -15);
        }
        class203.field3453.method466(-1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILpi;I)V", line = 75)
    private final void method2426(int arg0, class336 arg1, int arg2) {
        if (arg2 > -81) {
            this.field5489 = 61;
        }
        field5523++;
        if (arg0 == 1) {
            this.field5521 = arg1.method2339((byte) -46);
            this.field5492 = arg1.method2339((byte) -46);
            if (this.field5521 == 65535) {
                this.field5521 = -1;
            }
            if (this.field5492 == 65535) {
                this.field5492 = -1;
            }
        } else if (arg0 == 2) {
            this.field5522 = arg1.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field5527 = arg1.method2339((byte) -46);
        } else if (arg0 == 4) {
            this.field5518 = arg1.method2339((byte) -46);
        } else if (arg0 == 5) {
            this.field5494 = arg1.method2339((byte) -46);
        } else if (arg0 == 6) {
            this.field5503 = arg1.method2339((byte) -46);
        } else if (arg0 == 7) {
            this.field5506 = arg1.method2339((byte) -46);
        } else if (arg0 == 8) {
            this.field5499 = arg1.method2339((byte) -46);
        } else if (arg0 == 9) {
            this.field5504 = arg1.method2339((byte) -46);
        } else if (arg0 == 26) {
            this.field5484 = (short) (arg1.method2364(-9069) * 4);
            this.field5509 = (short) (arg1.method2364(-9069) * 4);
        } else if (arg0 == 27) {
            if (this.field5525 == null) {
                this.field5525 = new int[12][];
            }
            int var4 = arg1.method2364(-9069);
            this.field5525[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field5525[var4][var5] = arg1.method2326(-103);
            }
        } else if (arg0 == 29) {
            this.field5513 = arg1.method2364(-9069);
        } else if (arg0 == 30) {
            this.field5501 = arg1.method2339((byte) -46);
        } else if (arg0 == 31) {
            this.field5520 = arg1.method2364(-9069);
        } else if (arg0 == 32) {
            this.field5487 = arg1.method2339((byte) -46);
        } else if (arg0 == 33) {
            this.field5510 = arg1.method2326(110);
        } else if (arg0 == 34) {
            this.field5505 = arg1.method2364(-9069);
        } else if (arg0 == 35) {
            this.field5497 = arg1.method2339((byte) -46);
        } else if (arg0 == 36) {
            this.field5508 = arg1.method2326(120);
        } else if (arg0 == 37) {
            this.field5519 = arg1.method2364(-9069);
        } else if (arg0 == 38) {
            this.field5517 = arg1.method2339((byte) -46);
        } else if (arg0 == 39) {
            this.field5498 = arg1.method2339((byte) -46);
        } else if (arg0 == 40) {
            this.field5491 = arg1.method2339((byte) -46);
        } else if (arg0 == 41) {
            this.field5515 = arg1.method2339((byte) -46);
        } else if (arg0 == 42) {
            this.field5500 = arg1.method2339((byte) -46);
        } else if (arg0 == 43) {
            arg1.method2339((byte) -46);
        } else if (arg0 == 44) {
            arg1.method2339((byte) -46);
        } else if (arg0 == 45) {
            arg1.method2339((byte) -46);
        } else if (arg0 == 46) {
            this.field5512 = arg1.method2339((byte) -46);
        } else if (arg0 == 47) {
            this.field5502 = arg1.method2339((byte) -46);
        } else if (arg0 == 48) {
            this.field5486 = arg1.method2339((byte) -46);
        } else if (arg0 == 49) {
            this.field5493 = arg1.method2339((byte) -46);
        } else if (arg0 == 50) {
            this.field5526 = arg1.method2339((byte) -46);
        } else if (arg0 == 51) {
            this.field5489 = arg1.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 260)
    public static void method2427(byte arg0) {
        field5485 = null;
        field5507 = null;
        field5524 = null;
        if (arg0 <= 126) {
            method2431((byte) -58, -79);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)Lwi;", line = 298)
    public static final class285 method2428(int arg0, byte arg1) {
        class285 var2 = (class285) class8.field96.method467(true, (long) arg0);
        field5514++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class348.field5542.method441(false, class283.method1928((byte) 109, arg0), class224.method1634(arg0, 14298));
        class285 var4 = new class285();
        if (arg1 != -24) {
            return (class285) null;
        }
        var4.field4518 = arg0;
        if (var3 != null) {
            var4.method1943(new class336(var3), 21697);
        }
        var4.method1945(arg1 + 380446504);
        class8.field96.method465(var4, (long) arg0, (byte) 102);
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 323)
    public final void method2429(int arg0) {
        if (arg0 != 31) {
            this.field5526 = 58;
        }
        field5516++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 377)
    public static final Object method2430(int arg0, boolean arg1, byte[] arg2) {
        field5511++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 >= -124) {
            method2431((byte) -32, 68);
        }
        if (arg2.length > 136 && !class354.field5598) {
            try {
                class210 var3 = (class210) Class.forName("ll").getDeclaredConstructor().newInstance();
                var3.method1356(arg2, 1215096351);
                return var3;
            } catch (Throwable var5) {
                class354.field5598 = true;
            }
        }
        return arg1 ? class253.method1762(arg2, -5265) : arg2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V", line = 412)
    public static final void method2431(byte arg0, int arg1) {
        int var2 = 105 % ((arg0 + 90) / 36);
        field5496++;
        class92.field1445.method469(-11815, arg1);
        class56.field861.method469(-11815, arg1);
    }
}
